/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.IParameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getParameter()
 * @generated
 */
public interface IParameter extends EObject {
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
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getParameter_Name()
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.blackdogit.connectiq.monkeyc.debug.model.IParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IParameter
