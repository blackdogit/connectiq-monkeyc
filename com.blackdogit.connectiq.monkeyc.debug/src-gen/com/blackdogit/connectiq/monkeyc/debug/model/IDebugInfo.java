/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model;

import java.io.File;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Debug Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * <p>
 * Debug Info Root Item
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getDebugFile <em>Debug File</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getLastModificationStamp <em>Last Modification Stamp</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getLineEntries <em>Line Entries</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getFunctions <em>Functions</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getDebugInfo()
 * @generated
 */
public interface IDebugInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Debug File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The prg.debug.xml file from which this info is read.
	 * <p>
	 * Used to decide if the file should be re-read.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Debug File</em>' attribute.
	 * @see #setDebugFile(File)
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getDebugInfo_DebugFile()
	 * @generated
	 */
	File getDebugFile();

	/**
	 * Sets the value of the '{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getDebugFile <em>Debug File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug File</em>' attribute.
	 * @see #getDebugFile()
	 * @generated
	 */
	void setDebugFile(File value);

	/**
	 * Returns the value of the '<em><b>Last Modification Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The modification stamp for debugFile when it was read.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Modification Stamp</em>' attribute.
	 * @see #setLastModificationStamp(long)
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getDebugInfo_LastModificationStamp()
	 * @generated
	 */
	long getLastModificationStamp();

	/**
	 * Sets the value of the '{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getLastModificationStamp <em>Last Modification Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modification Stamp</em>' attribute.
	 * @see #getLastModificationStamp()
	 * @generated
	 */
	void setLastModificationStamp(long value);

	/**
	 * Returns the value of the '<em><b>Line Entries</b></em>' containment reference list.
	 * The list contents are of type {@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * <p>
	 * The list of entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Entries</em>' containment reference list.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getDebugInfo_LineEntries()
	 * @generated
	 */
	EList<ILineEntry> getLineEntries();

	/**
	 * Returns the value of the '<em><b>Symbols</b></em>' containment reference list.
	 * The list contents are of type {@link com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbols</em>' containment reference list.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getDebugInfo_Symbols()
	 * @generated
	 */
	EList<ISymbolTableEntry> getSymbols();

	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link com.blackdogit.connectiq.monkeyc.debug.model.ILocalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference list.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getDebugInfo_LocalVariables()
	 * @generated
	 */
	EList<ILocalVariable> getLocalVariables();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link com.blackdogit.connectiq.monkeyc.debug.model.IFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getDebugInfo_Functions()
	 * @generated
	 */
	EList<IFunction> getFunctions();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getDebugInfo_Annotations()
	 * @generated
	 */
	EList<IAnnotation> getAnnotations();

} // IDebugInfo
