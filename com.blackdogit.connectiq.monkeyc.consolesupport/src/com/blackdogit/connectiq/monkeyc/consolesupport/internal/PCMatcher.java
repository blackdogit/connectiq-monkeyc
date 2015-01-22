package com.blackdogit.connectiq.monkeyc.consolesupport.internal;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.RuntimeProcess;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IHyperlink;
import org.eclipse.ui.console.IPatternMatchListenerDelegate;
import org.eclipse.ui.console.PatternMatchEvent;
import org.eclipse.ui.console.TextConsole;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;

import com.blackdogit.connectiq.monkeyc.debug.DebugInfoManager;
import com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo;
import com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry;

/**
 * Console pattern matcher for the construct "@PC = 0x1000039e".
 * <p>
 * The PC value is looked up in the debug.xml file and the result is added to
 * the console...
 * 
 * @author tonny.madsen@blackdogit.com
 *
 */
public class PCMatcher implements IPatternMatchListenerDelegate {

	/**
	 * The console associated with this line tracker
	 */
	private TextConsole myConsole;

	/**
	 * The project based debug info used for this console
	 */
	private IDebugInfo myDebugInfo = null;

	/**
	 * The global debug info used for this console
	 */
	private IDebugInfo myGlobalDebugInfo = null;

	/**
	 * The workspace root.
	 */
	protected IWorkspaceRoot theRoot = ResourcesPlugin.getWorkspace().getRoot();

	public void connect(TextConsole console) {
		try {
			/*
			 * Now we have to go digging for the Connect IQ project.
			 * 
			 * It seems to be rather difficult to find, and we do with the debug
			 * info file.
			 */
			Object consoleProcessObj = console
					.getAttribute("org.eclipse.debug.ui.ATTR_CONSOLE_PROCESS");
			if (!(consoleProcessObj instanceof RuntimeProcess))
				return;
			RuntimeProcess rp = (RuntimeProcess) consoleProcessObj;

			ILaunch launch = rp.getLaunch();
			if (launch == null)
				return;
			ILaunchConfiguration launchConf = launch.getLaunchConfiguration();
			if (launchConf == null)
				return;
			String debugInfoFile = launchConf.getAttribute(
					"connectiq.debugInfo", (String) null);

			myDebugInfo = DebugInfoManager.getDebugInfo(debugInfoFile);
			myGlobalDebugInfo = getGlobalDebugInfo();
			myConsole = console;
		} catch (CoreException e) {
		}
	}

	public void disconnect() {
		myConsole = null;
	}

	protected TextConsole getConsole() {
		return myConsole;
	}

	public void matchFound(PatternMatchEvent event) {
		try {
			final int offset = event.getOffset();
			final int length = event.getLength();
			final IDocument doc = myConsole.getDocument();
			final String loc = doc.get(offset + 8, length - 8);
			int pc = Integer.parseUnsignedInt(loc, 16);
			ILineEntry le = findLineEntry(myDebugInfo, pc);
			if (le == null)
				le = findLineEntry(myGlobalDebugInfo, pc);
			/*
			 * If we cannot find a proper line entry, then forget it
			 */
			if (le == null)
				return;

			// modifyConsole(doc, offset, length, le);

			IHyperlink link = new PCHyperlink(le);
			myConsole.addHyperlink(link, offset + 6, length - 6);
		} catch (NumberFormatException e) {
			// Ignore
		} catch (BadLocationException e) {
			// Ignore
		}
	}

	/**
	 * Modifies the console with the relevant information from the
	 * {@link ILineEntry}.
	 * 
	 * @param doc
	 *            the document
	 * @param offset
	 *            the offset of the PC
	 * @param length
	 *            the length of the PC (8 expected)
	 * @param le
	 *            the line entry
	 * @throws BadLocationException
	 */
	private void modifyConsole(final IDocument doc, final int offset,
			final int length, ILineEntry le) throws BadLocationException {
		/*
		 * As the position in the console can change for a number of reasons, we
		 * use a Position as this is updated automatically...
		 */
		final String fileText = "  (" + le.getFilename() + ":"
				+ le.getLineNum() + ")";
		final Position pos = new Position(offset, length);
		doc.addPosition(pos);
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				try {
					int p = pos.getOffset() + pos.getLength();
					doc.replace(p, 0, fileText);
					doc.removePosition(pos);
				} catch (BadLocationException e) {
					// Ignore
				}
			}
		});
	}

	private ILineEntry findLineEntry(IDebugInfo debugInfo, int pc) {
		ILineEntry le = null;
		for (ILineEntry e : debugInfo.getLineEntries()) {
			if (e.getPc() > pc)
				continue;
			if (e.getPc() < pc - 200)
				continue;
			if (le == null) {
				le = e;
				continue;
			}
			if (le.getPc() > e.getPc()) {
				continue;
			}
			le = e;
		}
		return le;
	}

	/**
	 * Link implementation for {@link ILineEntry}.
	 */
	private class PCHyperlink implements IHyperlink {
		private final ILineEntry myLinkEntry;
		private final IFile myFile;

		public PCHyperlink(ILineEntry le) {
			myLinkEntry = le;
			myFile = calcFile(le);
		}

		private IFile calcFile(ILineEntry le) {
			try {
				URI uri = new URI("file://" + le.getFilename());
				if (!uri.isAbsolute())
					return null;
				IFile[] files = theRoot.findFilesForLocationURI(uri);
				if (files.length > 0) {
					return files[0];
				}
			} catch (URISyntaxException e) {
			}
			return null;
		}

		@Override
		public void linkEntered() {
		}

		@Override
		public void linkExited() {
		}

		@Override
		public void linkActivated() {
			if (myFile == null)
				return;
			try {
				/*
				 * Open the editor
				 */
				IEditorPart editor = IDE.openEditor(PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage(), myFile);
				if (editor instanceof ITextEditor) {
					gotoLine((ITextEditor) editor, myLinkEntry.getLineNum() - 1);
				}
			} catch (PartInitException e) {
				// Ignore
			}
		}

		private void gotoLine(ITextEditor editor, int line) {

			IDocumentProvider provider = editor.getDocumentProvider();
			IDocument document = provider.getDocument(editor.getEditorInput());
			try {

				int start = document.getLineOffset(line);
				editor.selectAndReveal(start, 0);

				IWorkbenchPage page = editor.getSite().getPage();
				page.activate(editor);

			} catch (BadLocationException x) {
				// ignore
			}
		}

	}

	/**
	 * Returns the global {@link IDebugInfo} for the current SDK.
	 * 
	 * @return the global debug info
	 */
	public IDebugInfo getGlobalDebugInfo() {
		IEclipsePreferences iqPrefs = InstanceScope.INSTANCE.getNode("IQ_IDE");
		String iqRoot = iqPrefs.get("pathPreference", null);
		if (iqRoot == null)
			return null;
		return DebugInfoManager.getDebugInfo(iqRoot + "/bin/api.debug.xml");
	}

}
