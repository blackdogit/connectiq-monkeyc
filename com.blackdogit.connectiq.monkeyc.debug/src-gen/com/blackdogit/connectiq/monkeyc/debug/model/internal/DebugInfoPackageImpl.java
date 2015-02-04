/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model.internal;

import com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation;
import com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo;
import com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoFactory;
import com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage;
import com.blackdogit.connectiq.monkeyc.debug.model.IFunction;
import com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry;
import com.blackdogit.connectiq.monkeyc.debug.model.ILocalVariable;
import com.blackdogit.connectiq.monkeyc.debug.model.IParameter;
import com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry;
import com.blackdogit.connectiq.monkeyc.debug.model.SymbolType;

import java.io.File;

import org.eclipse.core.runtime.IConfigurationElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DebugInfoPackageImpl extends EPackageImpl implements IDebugInfoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass debugInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolTableEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum symbolTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iConfigurationElementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DebugInfoPackageImpl() {
		super(eNS_URI, IDebugInfoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IDebugInfoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IDebugInfoPackage init() {
		if (isInited) return (IDebugInfoPackage)EPackage.Registry.INSTANCE.getEPackage(IDebugInfoPackage.eNS_URI);

		// Obtain or create and register package
		DebugInfoPackageImpl theDebugInfoPackage = (DebugInfoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DebugInfoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DebugInfoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDebugInfoPackage.createPackageContents();

		// Initialize created meta-data
		theDebugInfoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDebugInfoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IDebugInfoPackage.eNS_URI, theDebugInfoPackage);
		return theDebugInfoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDebugInfo() {
		return debugInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDebugInfo_DebugFile() {
		return (EAttribute)debugInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDebugInfo_LastModificationStamp() {
		return (EAttribute)debugInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDebugInfo_LineEntries() {
		return (EReference)debugInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDebugInfo_Symbols() {
		return (EReference)debugInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDebugInfo_LocalVariables() {
		return (EReference)debugInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDebugInfo_Functions() {
		return (EReference)debugInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDebugInfo_Annotations() {
		return (EReference)debugInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineEntry() {
		return lineEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineEntry_Filename() {
		return (EAttribute)lineEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineEntry_Symbol() {
		return (EAttribute)lineEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineEntry_LineNum() {
		return (EAttribute)lineEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineEntry_Pc() {
		return (EAttribute)lineEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolTableEntry() {
		return symbolTableEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbolTableEntry_Symbol() {
		return (EAttribute)symbolTableEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbolTableEntry_Id() {
		return (EAttribute)symbolTableEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbolTableEntry_Type() {
		return (EAttribute)symbolTableEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariable() {
		return localVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Name() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Documentation() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Parameters() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Symbol() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Annotation() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Class() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Module() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSymbolType() {
		return symbolTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDataType() {
		return eDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIConfigurationElement() {
		return iConfigurationElementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFile() {
		return fileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDebugInfoFactory getDebugInfoFactory() {
		return (IDebugInfoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		debugInfoEClass = createEClass(DEBUG_INFO);
		createEAttribute(debugInfoEClass, DEBUG_INFO__DEBUG_FILE);
		createEAttribute(debugInfoEClass, DEBUG_INFO__LAST_MODIFICATION_STAMP);
		createEReference(debugInfoEClass, DEBUG_INFO__LINE_ENTRIES);
		createEReference(debugInfoEClass, DEBUG_INFO__SYMBOLS);
		createEReference(debugInfoEClass, DEBUG_INFO__LOCAL_VARIABLES);
		createEReference(debugInfoEClass, DEBUG_INFO__FUNCTIONS);
		createEReference(debugInfoEClass, DEBUG_INFO__ANNOTATIONS);

		lineEntryEClass = createEClass(LINE_ENTRY);
		createEAttribute(lineEntryEClass, LINE_ENTRY__FILENAME);
		createEAttribute(lineEntryEClass, LINE_ENTRY__SYMBOL);
		createEAttribute(lineEntryEClass, LINE_ENTRY__LINE_NUM);
		createEAttribute(lineEntryEClass, LINE_ENTRY__PC);

		symbolTableEntryEClass = createEClass(SYMBOL_TABLE_ENTRY);
		createEAttribute(symbolTableEntryEClass, SYMBOL_TABLE_ENTRY__SYMBOL);
		createEAttribute(symbolTableEntryEClass, SYMBOL_TABLE_ENTRY__ID);
		createEAttribute(symbolTableEntryEClass, SYMBOL_TABLE_ENTRY__TYPE);

		localVariableEClass = createEClass(LOCAL_VARIABLE);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__NAME);
		createEAttribute(functionEClass, FUNCTION__DOCUMENTATION);
		createEReference(functionEClass, FUNCTION__PARAMETERS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__SYMBOL);
		createEAttribute(annotationEClass, ANNOTATION__ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__CLASS);
		createEAttribute(annotationEClass, ANNOTATION__MODULE);

		// Create enums
		symbolTypeEEnum = createEEnum(SYMBOL_TYPE);

		// Create data types
		eDataTypeEDataType = createEDataType(EDATA_TYPE);
		iConfigurationElementEDataType = createEDataType(ICONFIGURATION_ELEMENT);
		fileEDataType = createEDataType(FILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(debugInfoEClass, IDebugInfo.class, "DebugInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDebugInfo_DebugFile(), this.getFile(), "debugFile", null, 0, 1, IDebugInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDebugInfo_LastModificationStamp(), theEcorePackage.getELong(), "lastModificationStamp", null, 0, 1, IDebugInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDebugInfo_LineEntries(), this.getLineEntry(), null, "lineEntries", null, 0, -1, IDebugInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDebugInfo_Symbols(), this.getSymbolTableEntry(), null, "symbols", null, 0, -1, IDebugInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDebugInfo_LocalVariables(), this.getLocalVariable(), null, "localVariables", null, 0, -1, IDebugInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDebugInfo_Functions(), this.getFunction(), null, "functions", null, 0, -1, IDebugInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDebugInfo_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, IDebugInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(lineEntryEClass, ILineEntry.class, "LineEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLineEntry_Filename(), theEcorePackage.getEString(), "filename", null, 1, 1, ILineEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLineEntry_Symbol(), theEcorePackage.getEString(), "symbol", null, 0, 1, ILineEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLineEntry_LineNum(), theEcorePackage.getEInt(), "lineNum", null, 1, 1, ILineEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLineEntry_Pc(), theEcorePackage.getEInt(), "pc", null, 1, 1, ILineEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(symbolTableEntryEClass, ISymbolTableEntry.class, "SymbolTableEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSymbolTableEntry_Symbol(), theEcorePackage.getEString(), "symbol", null, 1, 1, ISymbolTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSymbolTableEntry_Id(), theEcorePackage.getEInt(), "id", null, 1, 1, ISymbolTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSymbolTableEntry_Type(), this.getSymbolType(), "type", null, 1, 1, ISymbolTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(localVariableEClass, ILocalVariable.class, "LocalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(functionEClass, IFunction.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFunction_Name(), theEcorePackage.getEString(), "name", null, 0, 1, IFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFunction_Documentation(), theEcorePackage.getEString(), "documentation", null, 0, 1, IFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFunction_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, IFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(parameterEClass, IParameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getParameter_Name(), theEcorePackage.getEString(), "name", null, 0, 1, IParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(annotationEClass, IAnnotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getAnnotation_Symbol(), theEcorePackage.getEString(), "symbol", null, 0, 1, IAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getAnnotation_Annotation(), theEcorePackage.getEString(), "annotation", null, 0, 1, IAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getAnnotation_Class(), theEcorePackage.getEString(), "class", null, 0, 1, IAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getAnnotation_Module(), theEcorePackage.getEString(), "module", null, 0, 1, IAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(symbolTypeEEnum, SymbolType.class, "SymbolType"); //$NON-NLS-1$
		addEEnumLiteral(symbolTypeEEnum, SymbolType.MODULE);
		addEEnumLiteral(symbolTypeEEnum, SymbolType.OBJECT);
		addEEnumLiteral(symbolTypeEEnum, SymbolType.FIELD);
		addEEnumLiteral(symbolTypeEEnum, SymbolType.METHOD);

		// Initialize data types
		initEDataType(eDataTypeEDataType, EDataType.class, "EDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(iConfigurationElementEDataType, IConfigurationElement.class, "IConfigurationElement", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(fileEDataType, File.class, "File", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel"; //$NON-NLS-1$	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "nonNLSMarkers", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "classPackageSuffix", "internal", //$NON-NLS-1$ //$NON-NLS-2$
			 "adapterFactory", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "classNamePattern", "{0}Impl", //$NON-NLS-1$ //$NON-NLS-2$
			 "interfaceNamePattern", "I{0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "suppressEMFModelTags", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "fileExtensions", "", //$NON-NLS-1$ //$NON-NLS-2$
			 "suppressGenModelAnnotations", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "modelName", "DebugInfo", //$NON-NLS-1$ //$NON-NLS-2$
			 "prefix", "DebugInfo", //$NON-NLS-1$ //$NON-NLS-2$
			 "containmentProxies", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "modelDirectory", "/com.blackdogit.connectiq.monkeyc.debug/src-gen", //$NON-NLS-1$ //$NON-NLS-2$
			 "oSGiCompatible", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "basePackage", "com.blackdogit.connectiq.monkeyc.debug" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (debugInfoEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\n<p>\nDebug Info Root Item" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getDebugInfo_DebugFile(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe prg.debug.xml file from which this info is read.\n<p>\nUsed to decide if the file should be re-read." //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getDebugInfo_LastModificationStamp(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe modification stamp for debugFile when it was read." //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getDebugInfo_LineEntries(), 
		   source, 
		   new String[] {
			 "documentation", "*\n<p>\nThe list of entries." //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (lineEntryEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\n<p>\nA single PC-to-line-number entry." //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getLineEntry_Filename(), 
		   source, 
		   new String[] {
			 "documentation", "*\n<p>\nFilename" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getLineEntry_Symbol(), 
		   source, 
		   new String[] {
			 "documentation", "<p>\nSymbol in file" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getLineEntry_LineNum(), 
		   source, 
		   new String[] {
			 "documentation", "Line number" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getLineEntry_Pc(), 
		   source, 
		   new String[] {
			 "documentation", "PC" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (symbolTableEntryEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\n<p>\nA single PC-to-line-number entry." //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getSymbolTableEntry_Symbol(), 
		   source, 
		   new String[] {
			 "documentation", "<p>\nSymbol in file" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getSymbolTableEntry_Id(), 
		   source, 
		   new String[] {
			 "documentation", "*\n<p>\nID" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
		addAnnotation
		  (getSymbolTableEntry_Type(), 
		   source, 
		   new String[] {
			 "documentation", "<p>\nType" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore"; //$NON-NLS-1$	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "Ecore", "http://www.eclipse.org/emf/2002/Ecore", //$NON-NLS-1$ //$NON-NLS-2$
			 "ExtendedMetaData", "http:///org/eclipse/emf/ecore/util/ExtendedMetaData", //$NON-NLS-1$ //$NON-NLS-2$
			 "GenModel", "http://www.eclipse.org/emf/2002/GenModel" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //DebugInfoPackageImpl
