/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model.internal;

import com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation;
import com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfo;
import com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage;
import com.blackdogit.connectiq.monkeyc.debug.model.IFunction;
import com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry;
import com.blackdogit.connectiq.monkeyc.debug.model.ILocalVariable;
import com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry;

import java.io.File;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Debug Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoImpl#getDebugFile <em>Debug File</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoImpl#getLastModificationStamp <em>Last Modification Stamp</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoImpl#getLineEntries <em>Line Entries</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoImpl#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoImpl#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.DebugInfoImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DebugInfoImpl extends MinimalEObjectImpl.Container implements IDebugInfo {
	/**
	 * The default value of the '{@link #getDebugFile() <em>Debug File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugFile()
	 * @generated
	 * @ordered
	 */
	protected static final File DEBUG_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebugFile() <em>Debug File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugFile()
	 * @generated
	 * @ordered
	 */
	protected File debugFile = DEBUG_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModificationStamp() <em>Last Modification Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModificationStamp()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_MODIFICATION_STAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLastModificationStamp() <em>Last Modification Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModificationStamp()
	 * @generated
	 * @ordered
	 */
	protected long lastModificationStamp = LAST_MODIFICATION_STAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLineEntries() <em>Line Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ILineEntry> lineEntries;

	/**
	 * The cached value of the '{@link #getSymbols() <em>Symbols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<ISymbolTableEntry> symbols;

	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ILocalVariable> localVariables;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<IFunction> functions;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<IAnnotation> annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DebugInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDebugInfoPackage.Literals.DEBUG_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getDebugFile() {
		return debugFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebugFile(File newDebugFile) {
		File oldDebugFile = debugFile;
		debugFile = newDebugFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDebugInfoPackage.DEBUG_INFO__DEBUG_FILE, oldDebugFile, debugFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastModificationStamp() {
		return lastModificationStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModificationStamp(long newLastModificationStamp) {
		long oldLastModificationStamp = lastModificationStamp;
		lastModificationStamp = newLastModificationStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDebugInfoPackage.DEBUG_INFO__LAST_MODIFICATION_STAMP, oldLastModificationStamp, lastModificationStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ILineEntry> getLineEntries() {
		if (lineEntries == null) {
			lineEntries = new EObjectContainmentEList<ILineEntry>(ILineEntry.class, this, IDebugInfoPackage.DEBUG_INFO__LINE_ENTRIES);
		}
		return lineEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISymbolTableEntry> getSymbols() {
		if (symbols == null) {
			symbols = new EObjectContainmentEList<ISymbolTableEntry>(ISymbolTableEntry.class, this, IDebugInfoPackage.DEBUG_INFO__SYMBOLS);
		}
		return symbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ILocalVariable> getLocalVariables() {
		if (localVariables == null) {
			localVariables = new EObjectContainmentEList<ILocalVariable>(ILocalVariable.class, this, IDebugInfoPackage.DEBUG_INFO__LOCAL_VARIABLES);
		}
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IFunction> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<IFunction>(IFunction.class, this, IDebugInfoPackage.DEBUG_INFO__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<IAnnotation>(IAnnotation.class, this, IDebugInfoPackage.DEBUG_INFO__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IDebugInfoPackage.DEBUG_INFO__LINE_ENTRIES:
				return ((InternalEList<?>)getLineEntries()).basicRemove(otherEnd, msgs);
			case IDebugInfoPackage.DEBUG_INFO__SYMBOLS:
				return ((InternalEList<?>)getSymbols()).basicRemove(otherEnd, msgs);
			case IDebugInfoPackage.DEBUG_INFO__LOCAL_VARIABLES:
				return ((InternalEList<?>)getLocalVariables()).basicRemove(otherEnd, msgs);
			case IDebugInfoPackage.DEBUG_INFO__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case IDebugInfoPackage.DEBUG_INFO__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IDebugInfoPackage.DEBUG_INFO__DEBUG_FILE:
				return getDebugFile();
			case IDebugInfoPackage.DEBUG_INFO__LAST_MODIFICATION_STAMP:
				return getLastModificationStamp();
			case IDebugInfoPackage.DEBUG_INFO__LINE_ENTRIES:
				return getLineEntries();
			case IDebugInfoPackage.DEBUG_INFO__SYMBOLS:
				return getSymbols();
			case IDebugInfoPackage.DEBUG_INFO__LOCAL_VARIABLES:
				return getLocalVariables();
			case IDebugInfoPackage.DEBUG_INFO__FUNCTIONS:
				return getFunctions();
			case IDebugInfoPackage.DEBUG_INFO__ANNOTATIONS:
				return getAnnotations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IDebugInfoPackage.DEBUG_INFO__DEBUG_FILE:
				setDebugFile((File)newValue);
				return;
			case IDebugInfoPackage.DEBUG_INFO__LAST_MODIFICATION_STAMP:
				setLastModificationStamp((Long)newValue);
				return;
			case IDebugInfoPackage.DEBUG_INFO__LINE_ENTRIES:
				getLineEntries().clear();
				getLineEntries().addAll((Collection<? extends ILineEntry>)newValue);
				return;
			case IDebugInfoPackage.DEBUG_INFO__SYMBOLS:
				getSymbols().clear();
				getSymbols().addAll((Collection<? extends ISymbolTableEntry>)newValue);
				return;
			case IDebugInfoPackage.DEBUG_INFO__LOCAL_VARIABLES:
				getLocalVariables().clear();
				getLocalVariables().addAll((Collection<? extends ILocalVariable>)newValue);
				return;
			case IDebugInfoPackage.DEBUG_INFO__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends IFunction>)newValue);
				return;
			case IDebugInfoPackage.DEBUG_INFO__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends IAnnotation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IDebugInfoPackage.DEBUG_INFO__DEBUG_FILE:
				setDebugFile(DEBUG_FILE_EDEFAULT);
				return;
			case IDebugInfoPackage.DEBUG_INFO__LAST_MODIFICATION_STAMP:
				setLastModificationStamp(LAST_MODIFICATION_STAMP_EDEFAULT);
				return;
			case IDebugInfoPackage.DEBUG_INFO__LINE_ENTRIES:
				getLineEntries().clear();
				return;
			case IDebugInfoPackage.DEBUG_INFO__SYMBOLS:
				getSymbols().clear();
				return;
			case IDebugInfoPackage.DEBUG_INFO__LOCAL_VARIABLES:
				getLocalVariables().clear();
				return;
			case IDebugInfoPackage.DEBUG_INFO__FUNCTIONS:
				getFunctions().clear();
				return;
			case IDebugInfoPackage.DEBUG_INFO__ANNOTATIONS:
				getAnnotations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IDebugInfoPackage.DEBUG_INFO__DEBUG_FILE:
				return DEBUG_FILE_EDEFAULT == null ? debugFile != null : !DEBUG_FILE_EDEFAULT.equals(debugFile);
			case IDebugInfoPackage.DEBUG_INFO__LAST_MODIFICATION_STAMP:
				return lastModificationStamp != LAST_MODIFICATION_STAMP_EDEFAULT;
			case IDebugInfoPackage.DEBUG_INFO__LINE_ENTRIES:
				return lineEntries != null && !lineEntries.isEmpty();
			case IDebugInfoPackage.DEBUG_INFO__SYMBOLS:
				return symbols != null && !symbols.isEmpty();
			case IDebugInfoPackage.DEBUG_INFO__LOCAL_VARIABLES:
				return localVariables != null && !localVariables.isEmpty();
			case IDebugInfoPackage.DEBUG_INFO__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case IDebugInfoPackage.DEBUG_INFO__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (debugFile: "); //$NON-NLS-1$
		result.append(debugFile);
		result.append(", lastModificationStamp: "); //$NON-NLS-1$
		result.append(lastModificationStamp);
		result.append(')');
		return result.toString();
	}

} //DebugInfoImpl
