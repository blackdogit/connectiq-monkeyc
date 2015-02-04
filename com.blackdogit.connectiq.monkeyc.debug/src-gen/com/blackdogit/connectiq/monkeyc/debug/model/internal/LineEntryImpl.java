/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model.internal;

import com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage;
import com.blackdogit.connectiq.monkeyc.debug.model.ILineEntry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.LineEntryImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.LineEntryImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.LineEntryImpl#getLineNum <em>Line Num</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.LineEntryImpl#getPc <em>Pc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineEntryImpl extends MinimalEObjectImpl.Container implements ILineEntry {
	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

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
	 * The default value of the '{@link #getLineNum() <em>Line Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNum()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineNum() <em>Line Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNum()
	 * @generated
	 * @ordered
	 */
	protected int lineNum = LINE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPc() <em>Pc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPc()
	 * @generated
	 * @ordered
	 */
	protected static final int PC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPc() <em>Pc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPc()
	 * @generated
	 * @ordered
	 */
	protected int pc = PC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDebugInfoPackage.Literals.LINE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDebugInfoPackage.LINE_ENTRY__FILENAME, oldFilename, filename));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IDebugInfoPackage.LINE_ENTRY__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineNum() {
		return lineNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineNum(int newLineNum) {
		int oldLineNum = lineNum;
		lineNum = newLineNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDebugInfoPackage.LINE_ENTRY__LINE_NUM, oldLineNum, lineNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPc() {
		return pc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPc(int newPc) {
		int oldPc = pc;
		pc = newPc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDebugInfoPackage.LINE_ENTRY__PC, oldPc, pc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IDebugInfoPackage.LINE_ENTRY__FILENAME:
				return getFilename();
			case IDebugInfoPackage.LINE_ENTRY__SYMBOL:
				return getSymbol();
			case IDebugInfoPackage.LINE_ENTRY__LINE_NUM:
				return getLineNum();
			case IDebugInfoPackage.LINE_ENTRY__PC:
				return getPc();
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
			case IDebugInfoPackage.LINE_ENTRY__FILENAME:
				setFilename((String)newValue);
				return;
			case IDebugInfoPackage.LINE_ENTRY__SYMBOL:
				setSymbol((String)newValue);
				return;
			case IDebugInfoPackage.LINE_ENTRY__LINE_NUM:
				setLineNum((Integer)newValue);
				return;
			case IDebugInfoPackage.LINE_ENTRY__PC:
				setPc((Integer)newValue);
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
			case IDebugInfoPackage.LINE_ENTRY__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case IDebugInfoPackage.LINE_ENTRY__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case IDebugInfoPackage.LINE_ENTRY__LINE_NUM:
				setLineNum(LINE_NUM_EDEFAULT);
				return;
			case IDebugInfoPackage.LINE_ENTRY__PC:
				setPc(PC_EDEFAULT);
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
			case IDebugInfoPackage.LINE_ENTRY__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case IDebugInfoPackage.LINE_ENTRY__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case IDebugInfoPackage.LINE_ENTRY__LINE_NUM:
				return lineNum != LINE_NUM_EDEFAULT;
			case IDebugInfoPackage.LINE_ENTRY__PC:
				return pc != PC_EDEFAULT;
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
		result.append(" (filename: "); //$NON-NLS-1$
		result.append(filename);
		result.append(", symbol: "); //$NON-NLS-1$
		result.append(symbol);
		result.append(", lineNum: "); //$NON-NLS-1$
		result.append(lineNum);
		result.append(", pc: "); //$NON-NLS-1$
		result.append(pc);
		result.append(')');
		return result.toString();
	}

} //LineEntryImpl
