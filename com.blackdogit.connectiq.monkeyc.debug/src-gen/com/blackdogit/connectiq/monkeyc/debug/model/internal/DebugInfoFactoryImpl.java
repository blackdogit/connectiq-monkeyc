/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model.internal;

import com.blackdogit.connectiq.monkeyc.debug.model.*;

import java.io.File;

import org.eclipse.core.runtime.IConfigurationElement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DebugInfoFactoryImpl extends EFactoryImpl implements IDebugInfoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IDebugInfoFactory init() {
		try {
			IDebugInfoFactory theDebugInfoFactory = (IDebugInfoFactory)EPackage.Registry.INSTANCE.getEFactory(IDebugInfoPackage.eNS_URI);
			if (theDebugInfoFactory != null) {
				return theDebugInfoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DebugInfoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DebugInfoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IDebugInfoPackage.DEBUG_INFO: return createDebugInfo();
			case IDebugInfoPackage.LINE_ENTRY: return createLineEntry();
			case IDebugInfoPackage.SYMBOL_TABLE_ENTRY: return createSymbolTableEntry();
			case IDebugInfoPackage.LOCAL_VARIABLE: return createLocalVariable();
			case IDebugInfoPackage.FUNCTION: return createFunction();
			case IDebugInfoPackage.PARAMETER: return createParameter();
			case IDebugInfoPackage.ANNOTATION: return createAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IDebugInfoPackage.SYMBOL_TYPE:
				return createSymbolTypeFromString(eDataType, initialValue);
			case IDebugInfoPackage.EDATA_TYPE:
				return createEDataTypeFromString(eDataType, initialValue);
			case IDebugInfoPackage.ICONFIGURATION_ELEMENT:
				return createIConfigurationElementFromString(eDataType, initialValue);
			case IDebugInfoPackage.FILE:
				return createFileFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IDebugInfoPackage.SYMBOL_TYPE:
				return convertSymbolTypeToString(eDataType, instanceValue);
			case IDebugInfoPackage.EDATA_TYPE:
				return convertEDataTypeToString(eDataType, instanceValue);
			case IDebugInfoPackage.ICONFIGURATION_ELEMENT:
				return convertIConfigurationElementToString(eDataType, instanceValue);
			case IDebugInfoPackage.FILE:
				return convertFileToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDebugInfo createDebugInfo() {
		DebugInfoImpl debugInfo = new DebugInfoImpl();
		return debugInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILineEntry createLineEntry() {
		LineEntryImpl lineEntry = new LineEntryImpl();
		return lineEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISymbolTableEntry createSymbolTableEntry() {
		SymbolTableEntryImpl symbolTableEntry = new SymbolTableEntryImpl();
		return symbolTableEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILocalVariable createLocalVariable() {
		LocalVariableImpl localVariable = new LocalVariableImpl();
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFunction createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IParameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAnnotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolType createSymbolTypeFromString(EDataType eDataType, String initialValue) {
		SymbolType result = SymbolType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymbolTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType createEDataTypeFromString(EDataType eDataType, String initialValue) {
		return (EDataType)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDataTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IConfigurationElement createIConfigurationElementFromString(EDataType eDataType, String initialValue) {
		return (IConfigurationElement)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIConfigurationElementToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFileFromString(EDataType eDataType, String initialValue) {
		return (File)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDebugInfoPackage getDebugInfoPackage() {
		return (IDebugInfoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IDebugInfoPackage getPackage() {
		return IDebugInfoPackage.eINSTANCE;
	}

} //DebugInfoFactoryImpl
