/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model.internal;

import com.blackdogit.connectiq.monkeyc.debug.model.IAnnotation;
import com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.AnnotationImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.AnnotationImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.AnnotationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.AnnotationImpl#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationImpl extends MinimalEObjectImpl.Container implements IAnnotation {
	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected String annotation = ANNOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected String module = MODULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDebugInfoPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDebugInfoPackage.ANNOTATION__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(String newAnnotation) {
		String oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDebugInfoPackage.ANNOTATION__ANNOTATION, oldAnnotation, annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDebugInfoPackage.ANNOTATION__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(String newModule) {
		String oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDebugInfoPackage.ANNOTATION__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IDebugInfoPackage.ANNOTATION__SYMBOL:
				return getSymbol();
			case IDebugInfoPackage.ANNOTATION__ANNOTATION:
				return getAnnotation();
			case IDebugInfoPackage.ANNOTATION__CLASS:
				return getClass_();
			case IDebugInfoPackage.ANNOTATION__MODULE:
				return getModule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IDebugInfoPackage.ANNOTATION__SYMBOL:
				setSymbol((String)newValue);
				return;
			case IDebugInfoPackage.ANNOTATION__ANNOTATION:
				setAnnotation((String)newValue);
				return;
			case IDebugInfoPackage.ANNOTATION__CLASS:
				setClass((String)newValue);
				return;
			case IDebugInfoPackage.ANNOTATION__MODULE:
				setModule((String)newValue);
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
			case IDebugInfoPackage.ANNOTATION__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case IDebugInfoPackage.ANNOTATION__ANNOTATION:
				setAnnotation(ANNOTATION_EDEFAULT);
				return;
			case IDebugInfoPackage.ANNOTATION__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case IDebugInfoPackage.ANNOTATION__MODULE:
				setModule(MODULE_EDEFAULT);
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
			case IDebugInfoPackage.ANNOTATION__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case IDebugInfoPackage.ANNOTATION__ANNOTATION:
				return ANNOTATION_EDEFAULT == null ? annotation != null : !ANNOTATION_EDEFAULT.equals(annotation);
			case IDebugInfoPackage.ANNOTATION__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case IDebugInfoPackage.ANNOTATION__MODULE:
				return MODULE_EDEFAULT == null ? module != null : !MODULE_EDEFAULT.equals(module);
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
		result.append(" (symbol: "); //$NON-NLS-1$
		result.append(symbol);
		result.append(", annotation: "); //$NON-NLS-1$
		result.append(annotation);
		result.append(", class: "); //$NON-NLS-1$
		result.append(class_);
		result.append(", module: "); //$NON-NLS-1$
		result.append(module);
		result.append(')');
		return result.toString();
	}

} //AnnotationImpl
