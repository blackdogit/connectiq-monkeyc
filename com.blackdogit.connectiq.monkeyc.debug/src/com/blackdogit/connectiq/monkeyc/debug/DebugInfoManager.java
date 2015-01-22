package com.blackdogit.connectiq.monkeyc.debug;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

import com.blackdogit.connectiq.monkeyc.debug.internal.PrgDebugReader;
import com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo;

/**
 * {@link IDebugInfo} manager.
 * 
 * @author tonny.madsen@blackdogit.com
 */
public class DebugInfoManager {
	private DebugInfoManager() {
		// NOP
	}

	/**
	 * Returns the current debug information for the specified project.
	 * <p>
	 * 
	 * @param filename
	 *            the file name of the debug info file
	 * @returns the debug info
	 */
	public static IDebugInfo getDebugInfo(String filename) {
		File f = new File(filename);
		IDebugInfo di = projects.get(f);

		if (di == null || f.lastModified() > di.getLastModificationStamp()) {
			di = new PrgDebugReader(f).read();
			if (di != null) {
				projects.put(f, di);
			} else {
				projects.remove(f);
			}
		}

		return di;
	}

	/**
	 * Returns the current debug information for the specified project.
	 * <p>
	 * 
	 * @param project
	 *            the project to read the debug information for
	 * @returns the debug info
	 */
	public static IDebugInfo getDebugInfo(IProject p) {
		IFile f = p.getFolder("bin").getFile(p.getName() + ".prg.debug.xml");
		return getDebugInfo(f.getFullPath().toString());
	}

	/**
	 * Map with all IDebugInfo based on the {@link File}.
	 * <p>
	 * This way, the global SDK debug info file can be handled too
	 */
	private static Map<File, IDebugInfo> projects = new HashMap<File, IDebugInfo>();
}
