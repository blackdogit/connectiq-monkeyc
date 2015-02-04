/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * <p>
 * A single PC-to-line-number entry.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getFilename <em>Filename</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getLineNum <em>Line Num</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getPc <em>Pc</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getLineEntry()
 * @generated
 */
public interface ILineEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * <p>
	 * Filename
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getLineEntry_Filename()
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * Symbol in file
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getLineEntry_Symbol()
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Line Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Line number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Num</em>' attribute.
	 * @see #setLineNum(int)
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getLineEntry_LineNum()
	 * @generated
	 */
	int getLineNum();

	/**
	 * Sets the value of the '{@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getLineNum <em>Line Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Num</em>' attribute.
	 * @see #getLineNum()
	 * @generated
	 */
	void setLineNum(int value);

	/**
	 * Returns the value of the '<em><b>Pc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PC
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pc</em>' attribute.
	 * @see #setPc(int)
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getLineEntry_Pc()
	 * @generated
	 */
	int getPc();

	/**
	 * Sets the value of the '{@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getPc <em>Pc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pc</em>' attribute.
	 * @see #getPc()
	 * @generated
	 */
	void setPc(int value);

} // ILineEntry
