/**
 */
package conference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Day Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see conference.ConferencePackage#getDayType()
 * @model
 * @generated
 */
public enum DayType implements Enumerator {
	/**
	 * The '<em><b>MON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MON_VALUE
	 * @generated
	 * @ordered
	 */
	MON(0, "MON", "MON"),

	/**
	 * The '<em><b>TUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUE_VALUE
	 * @generated
	 * @ordered
	 */
	TUE(1, "TUE", "TUE"),

	/**
	 * The '<em><b>WED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WED_VALUE
	 * @generated
	 * @ordered
	 */
	WED(2, "WED", "WED"),

	/**
	 * The '<em><b>THU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THU_VALUE
	 * @generated
	 * @ordered
	 */
	THU(3, "THU", "THU"),

	/**
	 * The '<em><b>FRI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRI_VALUE
	 * @generated
	 * @ordered
	 */
	FRI(4, "FRI", "FRI"),

	/**
	 * The '<em><b>SAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAT_VALUE
	 * @generated
	 * @ordered
	 */
	SAT(5, "SAT", "SAT"),

	/**
	 * The '<em><b>SUN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUN_VALUE
	 * @generated
	 * @ordered
	 */
	SUN(6, "SUN", "SUN");

	/**
	 * The '<em><b>MON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MON_VALUE = 0;

	/**
	 * The '<em><b>TUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TUE_VALUE = 1;

	/**
	 * The '<em><b>WED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WED_VALUE = 2;

	/**
	 * The '<em><b>THU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THU_VALUE = 3;

	/**
	 * The '<em><b>FRI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRI_VALUE = 4;

	/**
	 * The '<em><b>SAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAT_VALUE = 5;

	/**
	 * The '<em><b>SUN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Day Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DayType[] VALUES_ARRAY =
		new DayType[] {
			MON,
			TUE,
			WED,
			THU,
			FRI,
			SAT,
			SUN,
		};

	/**
	 * A public read-only list of all the '<em><b>Day Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DayType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Day Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DayType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DayType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Day Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DayType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DayType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Day Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DayType get(int value) {
		switch (value) {
			case MON_VALUE: return MON;
			case TUE_VALUE: return TUE;
			case WED_VALUE: return WED;
			case THU_VALUE: return THU;
			case FRI_VALUE: return FRI;
			case SAT_VALUE: return SAT;
			case SUN_VALUE: return SUN;
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
	private DayType(int value, String name, String literal) {
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
	
} //DayType
