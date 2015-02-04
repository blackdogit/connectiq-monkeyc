/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model.internal;

import com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage;
import com.blackdogit.connectiq.monkeyc.debug.model.ISymbolTableEntry;
import com.blackdogit.connectiq.monkeyc.debug.model.SymbolType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Table Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.SymbolTableEntryImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.SymbolTableEntryImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.blackdogit.connectiq.monkeyc.debug.model.internal.SymbolTableEntryImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolTableEntryImpl extends MinimalEObjectImpl.Container implements ISymbolTableEntry {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SymbolType TYPE_EDEFAULT = SymbolType.MODULE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SymbolType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolTableEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDebugInfoPackage.Literals.SYMBOL_TABLE_ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IDebugInfoPackage.SYMBOL_TABLE_ENTRY__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDebugInfoPackage.SYMBOL_TABLE_ENTRY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SymbolType newType) {
		SymbolType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IDebugInfoPackage.SYMBOL_TABLE_ENTRY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IDebugInfoPackage.SYMBOL_TABLE_ENTRY__SYMBOL:
				return getSymbol();
			case IDebugInfoPackage.SYMBOL_TABLE_ENTRY__ID:
				return getId();
			case IDebugInfoPackage.SYMBOL_TABLE_ENTRY__TYPE:
				return getType();
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
			case IDebugInfoPackage.SYMBOL_TABLE_ENTRY__SYMBOL:
				setSymbol((String)newValue);
				return;
			case IDebugInfoPackage.SYMBOL_TABLE_ENTRY__ID:
				setId((Integer)newValue);
				return;
			case IDebugInfoPackage.SYMBOL_TABLE_ENTRY__TYPE:
				setType((SymbolType)newValue);
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
			case IDebugInfoPackage.SYMBOL_TABLE_ENTRY__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case IDebugInfoPackage.SYMBOL_TABLE_ENTRY__ID:
				setId(ID_EDEFAULT);
				return;
			case IDebugInfoPackage.SYMBOL_TABLE_ENTRY__TYPE:
				setType(TYPE_EDEFAULT);
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
			case IDebugInfoPackage.SYMBOL_TABLE_ENTRY__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case IDebugInfoPackage.SYMBOL_TABLE_ENTRY__ID:
				return id != ID_EDEFAULT;
			case IDebugInfoPackage.SYMBOL_TABLE_ENTRY__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", type: "); //$NON-NLS-1$
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SymbolTableEntryImpl
