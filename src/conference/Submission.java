/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Submission#getName <em>Name</em>}</li>
 *   <li>{@link conference.Submission#getTitle <em>Title</em>}</li>
 *   <li>{@link conference.Submission#isAccepted <em>Accepted</em>}</li>
 *   <li>{@link conference.Submission#getReviewers <em>Reviewers</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getSubmission()
 * @model
 * @generated
 */
public interface Submission extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conference.ConferencePackage#getSubmission_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conference.Submission#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see conference.ConferencePackage#getSubmission_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link conference.Submission#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted</em>' attribute.
	 * @see #setAccepted(boolean)
	 * @see conference.ConferencePackage#getSubmission_Accepted()
	 * @model
	 * @generated
	 */
	boolean isAccepted();

	/**
	 * Sets the value of the '{@link conference.Submission#isAccepted <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepted</em>' attribute.
	 * @see #isAccepted()
	 * @generated
	 */
	void setAccepted(boolean value);

	/**
	 * Returns the value of the '<em><b>Reviewers</b></em>' reference list.
	 * The list contents are of type {@link conference.PCMember}.
	 * It is bidirectional and its opposite is '{@link conference.PCMember#getAssignedReviews <em>Assigned Reviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviewers</em>' reference list.
	 * @see conference.ConferencePackage#getSubmission_Reviewers()
	 * @see conference.PCMember#getAssignedReviews
	 * @model opposite="assignedReviews"
	 * @generated
	 */
	EList<PCMember> getReviewers();

} // Submission
