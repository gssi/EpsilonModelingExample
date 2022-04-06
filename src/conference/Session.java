/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Session#getStart <em>Start</em>}</li>
 *   <li>{@link conference.Session#getEnd <em>End</em>}</li>
 *   <li>{@link conference.Session#getTalks <em>Talks</em>}</li>
 *   <li>{@link conference.Session#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getSession()
 * @model
 * @generated
 */
public interface Session extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(String)
	 * @see conference.ConferencePackage#getSession_Start()
	 * @model
	 * @generated
	 */
	String getStart();

	/**
	 * Sets the value of the '{@link conference.Session#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see conference.ConferencePackage#getSession_End()
	 * @model
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link conference.Session#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Talks</b></em>' reference list.
	 * The list contents are of type {@link conference.Submission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talks</em>' reference list.
	 * @see conference.ConferencePackage#getSession_Talks()
	 * @model
	 * @generated
	 */
	EList<Submission> getTalks();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see conference.ConferencePackage#getSession_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link conference.Session#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Session
