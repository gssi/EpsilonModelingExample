/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PC Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.PCMember#getAssignedReviews <em>Assigned Reviews</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getPCMember()
 * @model
 * @generated
 */
public interface PCMember extends Person {
	/**
	 * Returns the value of the '<em><b>Assigned Reviews</b></em>' reference list.
	 * The list contents are of type {@link conference.Submission}.
	 * It is bidirectional and its opposite is '{@link conference.Submission#getReviewers <em>Reviewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Reviews</em>' reference list.
	 * @see conference.ConferencePackage#getPCMember_AssignedReviews()
	 * @see conference.Submission#getReviewers
	 * @model opposite="reviewers"
	 * @generated
	 */
	EList<Submission> getAssignedReviews();

} // PCMember
