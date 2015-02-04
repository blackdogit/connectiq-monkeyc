/**
 */
package com.blackdogit.connectiq.monkeyc.debug.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Symbol Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.blackdogit.connectiq.monkeyc.debug.model.IDebugInfoPackage#getSymbolType()
 * @generated
 */
public enum SymbolType implements Enumerator {
	/**
	 * The '<em><b>MODULE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULE_VALUE
	 * @generated
	 * @ordered
	 */
	MODULE(0, "MODULE", "MODULE"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT(0, "OBJECT", "OBJECT"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>FIELD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	FIELD(0, "FIELD", "FIELD"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>METHOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD(0, "METHOD", "METHOD"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>MODULE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODULE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODULE
	 * @generated
	 * @ordered
	 */
	public static final int MODULE_VALUE = 0;

	/**
	 * The '<em><b>OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECT
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_VALUE = 0;

	/**
	 * The '<em><b>FIELD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIELD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIELD
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_VALUE = 0;

	/**
	 * The '<em><b>METHOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METHOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_VALUE = 0;

	/**
	 * An array of all the '<em><b>Symbol Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SymbolType[] VALUES_ARRAY =
		new SymbolType[] {
			MODULE,
			OBJECT,
			FIELD,
			METHOD,
		};

	/**
	 * A public read-only list of all the '<em><b>Symbol Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SymbolType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Symbol Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymbolType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SymbolType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Symbol Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymbolType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SymbolType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Symbol Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymbolType get(int value) {
		switch (value) {
			case MODULE_VALUE: return MODULE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SymbolType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SymbolType
