/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Conference#getName <em>Name</em>}</li>
 *   <li>{@link conference.Conference#getVenue <em>Venue</em>}</li>
 *   <li>{@link conference.Conference#getDate <em>Date</em>}</li>
 *   <li>{@link conference.Conference#getParticipants <em>Participants</em>}</li>
 *   <li>{@link conference.Conference#getAgenda <em>Agenda</em>}</li>
 *   <li>{@link conference.Conference#getSubmissions <em>Submissions</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getConference()
 * @model
 * @generated
 */
public interface Conference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conference.ConferencePackage#getConference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conference.Conference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Venue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Venue</em>' attribute.
	 * @see #setVenue(String)
	 * @see conference.ConferencePackage#getConference_Venue()
	 * @model
	 * @generated
	 */
	String getVenue();

	/**
	 * Sets the value of the '{@link conference.Conference#getVenue <em>Venue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Venue</em>' attribute.
	 * @see #getVenue()
	 * @generated
	 */
	void setVenue(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see conference.ConferencePackage#getConference_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link conference.Conference#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link conference.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see conference.ConferencePackage#getConference_Participants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getParticipants();

	/**
	 * Returns the value of the '<em><b>Agenda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agenda</em>' containment reference.
	 * @see #setAgenda(Agenda)
	 * @see conference.ConferencePackage#getConference_Agenda()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Agenda getAgenda();

	/**
	 * Sets the value of the '{@link conference.Conference#getAgenda <em>Agenda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agenda</em>' containment reference.
	 * @see #getAgenda()
	 * @generated
	 */
	void setAgenda(Agenda value);

	/**
	 * Returns the value of the '<em><b>Submissions</b></em>' containment reference list.
	 * The list contents are of type {@link conference.Submission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submissions</em>' containment reference list.
	 * @see conference.ConferencePackage#getConference_Submissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Submission> getSubmissions();

} // Conference
