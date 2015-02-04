/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.IFunction#getName <em>Name</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.IFunction#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.IFunction#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getFunction()
 * @generated
 */
public interface IFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getFunction_Name()
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.blackdogit.connectiq.monkeyc.debug.model.IFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getFunction_Documentation()
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link com.blackdogit.connectiq.monkeyc.debug.model.IFunction#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.blackdogit.connectiq.monkeyc.debug.model.IParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getFunction_Parameters()
	 * @generated
	 */
	EList<IParameter> getParameters();

} // IFunction
