/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage
 * @generated
 */
public interface IDebugInfoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IDebugInfoFactory eINSTANCE = com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Debug Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Debug Info</em>'.
	 * @generated
	 */
	IDebugInfo createDebugInfo();

	/**
	 * Returns a new object of class '<em>Line Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Entry</em>'.
	 * @generated
	 */
	ILineEntry createLineEntry();

	/**
	 * Returns a new object of class '<em>Symbol Table Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol Table Entry</em>'.
	 * @generated
	 */
	ISymbolTableEntry createSymbolTableEntry();

	/**
	 * Returns a new object of class '<em>Local Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Variable</em>'.
	 * @generated
	 */
	ILocalVariable createLocalVariable();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	IFunction createFunction();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	IParameter createParameter();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	IAnnotation createAnnotation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IDebugInfoPackage getDebugInfoPackage();

} //IDebugInfoFactory
