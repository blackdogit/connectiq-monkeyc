/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Table Entry</b></em>'.
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
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry#getId <em>Id</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getSymbolTableEntry()
 * @generated
 */
public interface ISymbolTableEntry extends EObject {
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
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getSymbolTableEntry_Symbol()
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * <p>
	 * ID
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getSymbolTableEntry_Id()
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.blackdogit.connectiq.monkeyc.debug.model.SymbolType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * Type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.SymbolType
	 * @see #setType(SymbolType)
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getSymbolTableEntry_Type()
	 * @generated
	 */
	SymbolType getType();

	/**
	 * Sets the value of the '{@link com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.SymbolType
	 * @see #getType()
	 * @generated
	 */
	void setType(SymbolType value);

} // ISymbolTableEntry
