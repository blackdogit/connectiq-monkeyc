/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoFactory
 * @generated
 */
public interface IDebugInfoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackdogit.com/schemas/connectiq/debuginfo/1"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IDebugInfoPackage eINSTANCE = com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoImpl <em>Debug Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoImpl
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getDebugInfo()
	 * @generated
	 */
	int DEBUG_INFO = 0;

	/**
	 * The feature id for the '<em><b>Debug File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_INFO__DEBUG_FILE = 0;

	/**
	 * The feature id for the '<em><b>Last Modification Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_INFO__LAST_MODIFICATION_STAMP = 1;

	/**
	 * The feature id for the '<em><b>Line Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_INFO__LINE_ENTRIES = 2;

	/**
	 * The feature id for the '<em><b>Symbols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_INFO__SYMBOLS = 3;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_INFO__LOCAL_VARIABLES = 4;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_INFO__FUNCTIONS = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_INFO__ANNOTATIONS = 6;

	/**
	 * The number of structural features of the '<em>Debug Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_INFO_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Debug Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUG_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.LineEntryImpl <em>Line Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.LineEntryImpl
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getLineEntry()
	 * @generated
	 */
	int LINE_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ENTRY__FILENAME = 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ENTRY__SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>Line Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ENTRY__LINE_NUM = 2;

	/**
	 * The feature id for the '<em><b>Pc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ENTRY__PC = 3;

	/**
	 * The number of structural features of the '<em>Line Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ENTRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Line Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.SymbolTableEntryImpl <em>Symbol Table Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.SymbolTableEntryImpl
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getSymbolTableEntry()
	 * @generated
	 */
	int SYMBOL_TABLE_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_TABLE_ENTRY__SYMBOL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_TABLE_ENTRY__ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_TABLE_ENTRY__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Symbol Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_TABLE_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Symbol Table Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_TABLE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.LocalVariableImpl
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 3;

	/**
	 * The number of structural features of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.FunctionImpl
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.ParameterImpl
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.AnnotationImpl
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 6;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__SYMBOL = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CLASS = 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__MODULE = 3;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.SymbolType <em>Symbol Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.SymbolType
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getSymbolType()
	 * @generated
	 */
	int SYMBOL_TYPE = 7;

	/**
	 * The meta object id for the '<em>EData Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EDataType
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getEDataType()
	 * @generated
	 */
	int EDATA_TYPE = 8;

	/**
	 * The meta object id for the '<em>IConfiguration Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IConfigurationElement
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getIConfigurationElement()
	 * @generated
	 */
	int ICONFIGURATION_ELEMENT = 9;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 10;


	/**
	 * Returns the meta object for class '{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo <em>Debug Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debug Info</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo
	 * @generated
	 */
	EClass getDebugInfo();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getDebugFile <em>Debug File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debug File</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getDebugFile()
	 * @see #getDebugInfo()
	 * @generated
	 */
	EAttribute getDebugInfo_DebugFile();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getLastModificationStamp <em>Last Modification Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modification Stamp</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getLastModificationStamp()
	 * @see #getDebugInfo()
	 * @generated
	 */
	EAttribute getDebugInfo_LastModificationStamp();

	/**
	 * Returns the meta object for the containment reference list '{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getLineEntries <em>Line Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line Entries</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getLineEntries()
	 * @see #getDebugInfo()
	 * @generated
	 */
	EReference getDebugInfo_LineEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getSymbols <em>Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symbols</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getSymbols()
	 * @see #getDebugInfo()
	 * @generated
	 */
	EReference getDebugInfo_Symbols();

	/**
	 * Returns the meta object for the containment reference list '{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variables</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getLocalVariables()
	 * @see #getDebugInfo()
	 * @generated
	 */
	EReference getDebugInfo_LocalVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getFunctions()
	 * @see #getDebugInfo()
	 * @generated
	 */
	EReference getDebugInfo_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo#getAnnotations()
	 * @see #getDebugInfo()
	 * @generated
	 */
	EReference getDebugInfo_Annotations();

	/**
	 * Returns the meta object for class '{@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry <em>Line Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Entry</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry
	 * @generated
	 */
	EClass getLineEntry();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getFilename()
	 * @see #getLineEntry()
	 * @generated
	 */
	EAttribute getLineEntry_Filename();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getSymbol()
	 * @see #getLineEntry()
	 * @generated
	 */
	EAttribute getLineEntry_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getLineNum <em>Line Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Num</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getLineNum()
	 * @see #getLineEntry()
	 * @generated
	 */
	EAttribute getLineEntry_LineNum();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getPc <em>Pc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pc</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry#getPc()
	 * @see #getLineEntry()
	 * @generated
	 */
	EAttribute getLineEntry_Pc();

	/**
	 * Returns the meta object for class '{@link com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry <em>Symbol Table Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Table Entry</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry
	 * @generated
	 */
	EClass getSymbolTableEntry();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry#getSymbol()
	 * @see #getSymbolTableEntry()
	 * @generated
	 */
	EAttribute getSymbolTableEntry_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry#getId()
	 * @see #getSymbolTableEntry()
	 * @generated
	 */
	EAttribute getSymbolTableEntry_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry#getType()
	 * @see #getSymbolTableEntry()
	 * @generated
	 */
	EAttribute getSymbolTableEntry_Type();

	/**
	 * Returns the meta object for class '{@link com.blackdogit.connectiq.monkeyc.debug.model.ILocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.ILocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for class '{@link com.blackdogit.connectiq.monkeyc.debug.model.IFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IFunction
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.IFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IFunction#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.IFunction#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IFunction#getDocumentation()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.blackdogit.connectiq.monkeyc.debug.model.IFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IFunction#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link com.blackdogit.connectiq.monkeyc.debug.model.IParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IParameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.IParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IParameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation#getSymbol()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation#getAnnotation()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation#getClass_()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Class();

	/**
	 * Returns the meta object for the attribute '{@link com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation#getModule()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Module();

	/**
	 * Returns the meta object for enum '{@link com.blackdogit.connectiq.monkeyc.debug.model.SymbolType <em>Symbol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Symbol Type</em>'.
	 * @see com.blackdogit.connectiq.monkeyc.debug.model.SymbolType
	 * @generated
	 */
	EEnum getSymbolType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.EDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EData Type</em>'.
	 * @see org.eclipse.emf.ecore.EDataType
	 * @generated
	 */
	EDataType getEDataType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IConfigurationElement <em>IConfiguration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IConfiguration Element</em>'.
	 * @see org.eclipse.core.runtime.IConfigurationElement
	 * @generated
	 */
	EDataType getIConfigurationElement();

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File</em>'.
	 * @see java.io.File
	 * @generated
	 */
	EDataType getFile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IDebugInfoFactory getDebugInfoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoImpl <em>Debug Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoImpl
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getDebugInfo()
		 * @generated
		 */
		EClass DEBUG_INFO = eINSTANCE.getDebugInfo();

		/**
		 * The meta object literal for the '<em><b>Debug File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEBUG_INFO__DEBUG_FILE = eINSTANCE.getDebugInfo_DebugFile();

		/**
		 * The meta object literal for the '<em><b>Last Modification Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEBUG_INFO__LAST_MODIFICATION_STAMP = eINSTANCE.getDebugInfo_LastModificationStamp();

		/**
		 * The meta object literal for the '<em><b>Line Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUG_INFO__LINE_ENTRIES = eINSTANCE.getDebugInfo_LineEntries();

		/**
		 * The meta object literal for the '<em><b>Symbols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUG_INFO__SYMBOLS = eINSTANCE.getDebugInfo_Symbols();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUG_INFO__LOCAL_VARIABLES = eINSTANCE.getDebugInfo_LocalVariables();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUG_INFO__FUNCTIONS = eINSTANCE.getDebugInfo_Functions();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEBUG_INFO__ANNOTATIONS = eINSTANCE.getDebugInfo_Annotations();

		/**
		 * The meta object literal for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.LineEntryImpl <em>Line Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.LineEntryImpl
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getLineEntry()
		 * @generated
		 */
		EClass LINE_ENTRY = eINSTANCE.getLineEntry();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_ENTRY__FILENAME = eINSTANCE.getLineEntry_Filename();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_ENTRY__SYMBOL = eINSTANCE.getLineEntry_Symbol();

		/**
		 * The meta object literal for the '<em><b>Line Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_ENTRY__LINE_NUM = eINSTANCE.getLineEntry_LineNum();

		/**
		 * The meta object literal for the '<em><b>Pc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_ENTRY__PC = eINSTANCE.getLineEntry_Pc();

		/**
		 * The meta object literal for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.SymbolTableEntryImpl <em>Symbol Table Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.SymbolTableEntryImpl
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getSymbolTableEntry()
		 * @generated
		 */
		EClass SYMBOL_TABLE_ENTRY = eINSTANCE.getSymbolTableEntry();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_TABLE_ENTRY__SYMBOL = eINSTANCE.getSymbolTableEntry_Symbol();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_TABLE_ENTRY__ID = eINSTANCE.getSymbolTableEntry_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_TABLE_ENTRY__TYPE = eINSTANCE.getSymbolTableEntry_Type();

		/**
		 * The meta object literal for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.LocalVariableImpl
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getLocalVariable()
		 * @generated
		 */
		EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

		/**
		 * The meta object literal for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.FunctionImpl
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__DOCUMENTATION = eINSTANCE.getFunction_Documentation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.ParameterImpl
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.AnnotationImpl
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__SYMBOL = eINSTANCE.getAnnotation_Symbol();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__ANNOTATION = eINSTANCE.getAnnotation_Annotation();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__CLASS = eINSTANCE.getAnnotation_Class();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__MODULE = eINSTANCE.getAnnotation_Module();

		/**
		 * The meta object literal for the '{@link com.blackdogit.connectiq.monkeyc.debug.model.SymbolType <em>Symbol Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.SymbolType
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getSymbolType()
		 * @generated
		 */
		EEnum SYMBOL_TYPE = eINSTANCE.getSymbolType();

		/**
		 * The meta object literal for the '<em>EData Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.EDataType
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getEDataType()
		 * @generated
		 */
		EDataType EDATA_TYPE = eINSTANCE.getEDataType();

		/**
		 * The meta object literal for the '<em>IConfiguration Element</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IConfigurationElement
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getIConfigurationElement()
		 * @generated
		 */
		EDataType ICONFIGURATION_ELEMENT = eINSTANCE.getIConfigurationElement();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoPackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

	}

} //IDebugInfoPackage
