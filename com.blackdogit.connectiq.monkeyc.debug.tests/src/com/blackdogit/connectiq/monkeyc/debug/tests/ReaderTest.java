package com.blackdogit.connectiq.monkeyc.debug.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.blackdogit.connectiq.monkeyc.debug.DebugInfoManager;
import com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo;
import com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry;

public class ReaderTest {
	private String myFilename;
	private File myTempFile;
	private String myTempFilename;

	@Before
	public void before() throws IOException {
		URL pURL = new URL("platform:/plugin/com.blackdogit.connectiq.monkeyc.debug.tests/files/Test.prg.debug.xml");
		myFilename = FileLocator.toFileURL(pURL).getPath();

		myTempFile = File.createTempFile("MonkeyCTest", "prg.debug.xml");
		myTempFilename = myTempFile.getAbsolutePath();
		
		/*
		 * Make a temp copy
		 */
		IOUtils.copy(new FileInputStream(myFilename), new FileOutputStream(myTempFile));
	}
	
	@After
	public void after() {
		if (myTempFile != null) myTempFile.delete();
	}

	/**
	 * Tests that the same info object is returned if the file does not change
	 */
	@Test
	public void testSame() {
		IDebugInfo info = DebugInfoManager.getDebugInfo(myFilename);
		assertEquals(info, DebugInfoManager.getDebugInfo(myFilename));
	}

	/**
	 * Tests that a new info object is returned if the file is updated
	 */
	@Test
	public void testUpdate() throws IOException {
		IDebugInfo info = DebugInfoManager.getDebugInfo(myTempFilename);
		long lastModified = myTempFile.lastModified();
		myTempFile.setLastModified(lastModified+100000);
		assertNotSame(info, DebugInfoManager.getDebugInfo(myTempFilename));
	}
	
	@Test
	public void testContent() {
		IDebugInfo info = DebugInfoManager.getDebugInfo(myFilename);
		
		EList<ILineEntry> lineEntries = info.getLineEntries();
		assertNotNull(lineEntries);
		assertEquals(8, lineEntries.size());
		
		ILineEntry e0 = lineEntries.get(0);
		assertNotNull(e0);
		assertEquals("/ConnectIQ/Git/connectiq-apps/MyDistanceHome/source/MCUtils.mc", e0.getFilename());
		assertEquals(9, e0.getLineNum());
		assertEquals(268435458, e0.getPc());
		assertEquals("typeof", e0.getSymbol());
		
		// line# and pc correct
		ILineEntry e1 = lineEntries.get(1);
		assertNotNull(e1);
		assertEquals("/ConnectIQ/Git/connectiq-apps/MyDistanceHome/source/MCUtils.mc", e1.getFilename());
		assertEquals(10, e1.getLineNum());
		assertEquals(268435465, e1.getPc());
		assertEquals("typeof", e1.getSymbol());
		
		// The rest...
		ILineEntry e3 = lineEntries.get(3);
		assertNotNull(e3);
		assertEquals("/ConnectIQ/Git/connectiq-apps/MyDistanceHome/source/DistanceUtils.mc", e3.getFilename());
		assertEquals(11, e3.getLineNum());
		assertEquals(268435564, e3.getPc());
		assertEquals("distToString", e3.getSymbol());

		// Special symbol
		ILineEntry e6 = lineEntries.get(6);
		assertNotNull(e6);
		assertEquals("<init>", e6.getSymbol());
		
		// Special file
		ILineEntry e7 = lineEntries.get(7);
		assertNotNull(e7);
		assertEquals("Rez", e7.getFilename());
	}
}
