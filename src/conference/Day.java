/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Day#getName <em>Name</em>}</li>
 *   <li>{@link conference.Day#getSessions <em>Sessions</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getDay()
 * @model
 * @generated
 */
public interface Day extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link conference.DayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see conference.DayType
	 * @see #setName(DayType)
	 * @see conference.ConferencePackage#getDay_Name()
	 * @model
	 * @generated
	 */
	DayType getName();

	/**
	 * Sets the value of the '{@link conference.Day#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see conference.DayType
	 * @see #getName()
	 * @generated
	 */
	void setName(DayType value);

	/**
	 * Returns the value of the '<em><b>Sessions</b></em>' containment reference list.
	 * The list contents are of type {@link conference.Session}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessions</em>' containment reference list.
	 * @see conference.ConferencePackage#getDay_Sessions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Session> getSessions();

} // Day
