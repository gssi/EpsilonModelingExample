/**
 */
package conference;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see conference.ConferencePackage
 * @generated
 */
public interface ConferenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConferenceFactory eINSTANCE = conference.impl.ConferenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Conference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conference</em>'.
	 * @generated
	 */
	Conference createConference();

	/**
	 * Returns a new object of class '<em>Agenda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agenda</em>'.
	 * @generated
	 */
	Agenda createAgenda();

	/**
	 * Returns a new object of class '<em>Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Day</em>'.
	 * @generated
	 */
	Day createDay();

	/**
	 * Returns a new object of class '<em>Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session</em>'.
	 * @generated
	 */
	Session createSession();

	/**
	 * Returns a new object of class '<em>PC Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PC Member</em>'.
	 * @generated
	 */
	PCMember createPCMember();

	/**
	 * Returns a new object of class '<em>Speaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speaker</em>'.
	 * @generated
	 */
	Speaker createSpeaker();

	/**
	 * Returns a new object of class '<em>Submission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submission</em>'.
	 * @generated
	 */
	Submission createSubmission();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConferencePackage getConferencePackage();

} //ConferenceFactory
