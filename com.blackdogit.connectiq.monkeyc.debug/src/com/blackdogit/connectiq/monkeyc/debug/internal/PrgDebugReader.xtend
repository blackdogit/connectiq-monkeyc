package com.blackdogit.connectiq.monkeyc.debug.internal

import com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo
import com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoFactory
import java.io.InputStream
import org.w3c.dom.Document

import static extension com.blackdogit.connectiq.monkeyc.debug.internal.GeneralExtensions.*
import com.blackdogit.connectiq.monkeyc.debug.internal.PositionalXMLReader
import java.io.File
import java.io.FileInputStream
import javax.xml.soap.Node

class PrgDebugReader {

	/**
	 * Constructs and returns a new reader for the specified project.
	 */
	File myFile

	new(File f) {
		myFile = f
	}

	/**
	 * Tries to read the debug info file for the project of this reader.
	 * 
	 * @returns a IDebugInfo is successful, and <code>null</code> otherwise 
	 */
	def IDebugInfo read() {
		val is = new FileInputStream(myFile)
		try {
			val di = read(is)
			di.debugFile = myFile
			di.lastModificationStamp = myFile.lastModified

			return di
		} finally {
			is?.close();
		}
	}

	/**
	 * Tries to read the debug info file for the project of this reader.
	 * 
	 * @param is the input stream - closed on return
	 * @returns a IDebugInfo is successful, and <code>null</code> otherwise 
	 */
	def private IDebugInfo read(InputStream is) {
		val di = IDebugInfoFactory.eINSTANCE.createDebugInfo

		var Document doc = null
		try {
			doc = PositionalXMLReader.readXML(is)
		} catch (Exception ex) {
			throw new RuntimeException(ex)
		} finally {
			is?.close()
		}

		convertPCToLineNum(doc, di)

		return di
	}

	def private void convertPCToLineNum(Document doc, IDebugInfo di) {

		// One 'pcToLineNum'
		val top = doc.getElementsByTagName("pcToLineNum").item(0)

		// Go through all 'entries'
		for (n : top.children.filter[nodeType == Node::ELEMENT_NODE]) {
			val e = IDebugInfoFactory.eINSTANCE.createLineEntry
			e.filename = n.attr("filename")
			e.lineNum = Integer.parseInt(n.attr("lineNum"))
			e.symbol = n.attr("symbol")
			e.pc = Integer.parseInt(n.attr("pc"))
			di.lineEntries += e
		}
	}
}
