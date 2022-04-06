/**
 */
package conference;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see conference.ConferenceFactory
 * @model kind="package"
 * @generated
 */
public interface ConferencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conference";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "conference";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConferencePackage eINSTANCE = conference.impl.ConferencePackageImpl.init();

	/**
	 * The meta object id for the '{@link conference.impl.ConferenceImpl <em>Conference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.ConferenceImpl
	 * @see conference.impl.ConferencePackageImpl#getConference()
	 * @generated
	 */
	int CONFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Venue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__VENUE = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__DATE = 2;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__PARTICIPANTS = 3;

	/**
	 * The feature id for the '<em><b>Agenda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__AGENDA = 4;

	/**
	 * The feature id for the '<em><b>Submissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__SUBMISSIONS = 5;

	/**
	 * The number of structural features of the '<em>Conference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Conference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conference.impl.AgendaImpl <em>Agenda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.AgendaImpl
	 * @see conference.impl.ConferencePackageImpl#getAgenda()
	 * @generated
	 */
	int AGENDA = 1;

	/**
	 * The feature id for the '<em><b>Days</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA__DAYS = 0;

	/**
	 * The number of structural features of the '<em>Agenda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Agenda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENDA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conference.impl.DayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.DayImpl
	 * @see conference.impl.ConferencePackageImpl#getDay()
	 * @generated
	 */
	int DAY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sessions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__SESSIONS = 1;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conference.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.SessionImpl
	 * @see conference.impl.ConferencePackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__END = 1;

	/**
	 * The feature id for the '<em><b>Talks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__TALKS = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__TITLE = 3;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conference.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.PersonImpl
	 * @see conference.impl.ConferencePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AFFILIATION = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conference.impl.PCMemberImpl <em>PC Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.PCMemberImpl
	 * @see conference.impl.ConferencePackageImpl#getPCMember()
	 * @generated
	 */
	int PC_MEMBER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MEMBER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MEMBER__AFFILIATION = PERSON__AFFILIATION;

	/**
	 * The feature id for the '<em><b>Assigned Reviews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MEMBER__ASSIGNED_REVIEWS = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PC Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MEMBER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PC Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_MEMBER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conference.impl.SpeakerImpl <em>Speaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.SpeakerImpl
	 * @see conference.impl.ConferencePackageImpl#getSpeaker()
	 * @generated
	 */
	int SPEAKER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__AFFILIATION = PERSON__AFFILIATION;

	/**
	 * The number of structural features of the '<em>Speaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Speaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link conference.impl.SubmissionImpl <em>Submission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.SubmissionImpl
	 * @see conference.impl.ConferencePackageImpl#getSubmission()
	 * @generated
	 */
	int SUBMISSION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION__ACCEPTED = 2;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION__REVIEWERS = 3;

	/**
	 * The number of structural features of the '<em>Submission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Submission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conference.DayType <em>Day Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.DayType
	 * @see conference.impl.ConferencePackageImpl#getDayType()
	 * @generated
	 */
	int DAY_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link conference.Conference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference</em>'.
	 * @see conference.Conference
	 * @generated
	 */
	EClass getConference();

	/**
	 * Returns the meta object for the attribute '{@link conference.Conference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Conference#getName()
	 * @see #getConference()
	 * @generated
	 */
	EAttribute getConference_Name();

	/**
	 * Returns the meta object for the attribute '{@link conference.Conference#getVenue <em>Venue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Venue</em>'.
	 * @see conference.Conference#getVenue()
	 * @see #getConference()
	 * @generated
	 */
	EAttribute getConference_Venue();

	/**
	 * Returns the meta object for the attribute '{@link conference.Conference#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see conference.Conference#getDate()
	 * @see #getConference()
	 * @generated
	 */
	EAttribute getConference_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Conference#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see conference.Conference#getParticipants()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Participants();

	/**
	 * Returns the meta object for the containment reference '{@link conference.Conference#getAgenda <em>Agenda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agenda</em>'.
	 * @see conference.Conference#getAgenda()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Agenda();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Conference#getSubmissions <em>Submissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submissions</em>'.
	 * @see conference.Conference#getSubmissions()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Submissions();

	/**
	 * Returns the meta object for class '{@link conference.Agenda <em>Agenda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agenda</em>'.
	 * @see conference.Agenda
	 * @generated
	 */
	EClass getAgenda();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Agenda#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Days</em>'.
	 * @see conference.Agenda#getDays()
	 * @see #getAgenda()
	 * @generated
	 */
	EReference getAgenda_Days();

	/**
	 * Returns the meta object for class '{@link conference.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see conference.Day
	 * @generated
	 */
	EClass getDay();

	/**
	 * Returns the meta object for the attribute '{@link conference.Day#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Day#getName()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Day#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sessions</em>'.
	 * @see conference.Day#getSessions()
	 * @see #getDay()
	 * @generated
	 */
	EReference getDay_Sessions();

	/**
	 * Returns the meta object for class '{@link conference.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see conference.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the attribute '{@link conference.Session#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see conference.Session#getStart()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_Start();

	/**
	 * Returns the meta object for the attribute '{@link conference.Session#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see conference.Session#getEnd()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_End();

	/**
	 * Returns the meta object for the reference list '{@link conference.Session#getTalks <em>Talks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Talks</em>'.
	 * @see conference.Session#getTalks()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Talks();

	/**
	 * Returns the meta object for the attribute '{@link conference.Session#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see conference.Session#getTitle()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_Title();

	/**
	 * Returns the meta object for class '{@link conference.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see conference.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link conference.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link conference.Person#getAffiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affiliation</em>'.
	 * @see conference.Person#getAffiliation()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Affiliation();

	/**
	 * Returns the meta object for class '{@link conference.PCMember <em>PC Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PC Member</em>'.
	 * @see conference.PCMember
	 * @generated
	 */
	EClass getPCMember();

	/**
	 * Returns the meta object for the reference list '{@link conference.PCMember#getAssignedReviews <em>Assigned Reviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Reviews</em>'.
	 * @see conference.PCMember#getAssignedReviews()
	 * @see #getPCMember()
	 * @generated
	 */
	EReference getPCMember_AssignedReviews();

	/**
	 * Returns the meta object for class '{@link conference.Speaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speaker</em>'.
	 * @see conference.Speaker
	 * @generated
	 */
	EClass getSpeaker();

	/**
	 * Returns the meta object for class '{@link conference.Submission <em>Submission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submission</em>'.
	 * @see conference.Submission
	 * @generated
	 */
	EClass getSubmission();

	/**
	 * Returns the meta object for the attribute '{@link conference.Submission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Submission#getName()
	 * @see #getSubmission()
	 * @generated
	 */
	EAttribute getSubmission_Name();

	/**
	 * Returns the meta object for the attribute '{@link conference.Submission#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see conference.Submission#getTitle()
	 * @see #getSubmission()
	 * @generated
	 */
	EAttribute getSubmission_Title();

	/**
	 * Returns the meta object for the attribute '{@link conference.Submission#isAccepted <em>Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted</em>'.
	 * @see conference.Submission#isAccepted()
	 * @see #getSubmission()
	 * @generated
	 */
	EAttribute getSubmission_Accepted();

	/**
	 * Returns the meta object for the reference list '{@link conference.Submission#getReviewers <em>Reviewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reviewers</em>'.
	 * @see conference.Submission#getReviewers()
	 * @see #getSubmission()
	 * @generated
	 */
	EReference getSubmission_Reviewers();

	/**
	 * Returns the meta object for enum '{@link conference.DayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Day Type</em>'.
	 * @see conference.DayType
	 * @generated
	 */
	EEnum getDayType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConferenceFactory getConferenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link conference.impl.ConferenceImpl <em>Conference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.ConferenceImpl
		 * @see conference.impl.ConferencePackageImpl#getConference()
		 * @generated
		 */
		EClass CONFERENCE = eINSTANCE.getConference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE__NAME = eINSTANCE.getConference_Name();

		/**
		 * The meta object literal for the '<em><b>Venue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE__VENUE = eINSTANCE.getConference_Venue();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE__DATE = eINSTANCE.getConference_Date();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__PARTICIPANTS = eINSTANCE.getConference_Participants();

		/**
		 * The meta object literal for the '<em><b>Agenda</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__AGENDA = eINSTANCE.getConference_Agenda();

		/**
		 * The meta object literal for the '<em><b>Submissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__SUBMISSIONS = eINSTANCE.getConference_Submissions();

		/**
		 * The meta object literal for the '{@link conference.impl.AgendaImpl <em>Agenda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.AgendaImpl
		 * @see conference.impl.ConferencePackageImpl#getAgenda()
		 * @generated
		 */
		EClass AGENDA = eINSTANCE.getAgenda();

		/**
		 * The meta object literal for the '<em><b>Days</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENDA__DAYS = eINSTANCE.getAgenda_Days();

		/**
		 * The meta object literal for the '{@link conference.impl.DayImpl <em>Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.DayImpl
		 * @see conference.impl.ConferencePackageImpl#getDay()
		 * @generated
		 */
		EClass DAY = eINSTANCE.getDay();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__NAME = eINSTANCE.getDay_Name();

		/**
		 * The meta object literal for the '<em><b>Sessions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAY__SESSIONS = eINSTANCE.getDay_Sessions();

		/**
		 * The meta object literal for the '{@link conference.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.SessionImpl
		 * @see conference.impl.ConferencePackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__START = eINSTANCE.getSession_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__END = eINSTANCE.getSession_End();

		/**
		 * The meta object literal for the '<em><b>Talks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__TALKS = eINSTANCE.getSession_Talks();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__TITLE = eINSTANCE.getSession_Title();

		/**
		 * The meta object literal for the '{@link conference.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.PersonImpl
		 * @see conference.impl.ConferencePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Affiliation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AFFILIATION = eINSTANCE.getPerson_Affiliation();

		/**
		 * The meta object literal for the '{@link conference.impl.PCMemberImpl <em>PC Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.PCMemberImpl
		 * @see conference.impl.ConferencePackageImpl#getPCMember()
		 * @generated
		 */
		EClass PC_MEMBER = eINSTANCE.getPCMember();

		/**
		 * The meta object literal for the '<em><b>Assigned Reviews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PC_MEMBER__ASSIGNED_REVIEWS = eINSTANCE.getPCMember_AssignedReviews();

		/**
		 * The meta object literal for the '{@link conference.impl.SpeakerImpl <em>Speaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.SpeakerImpl
		 * @see conference.impl.ConferencePackageImpl#getSpeaker()
		 * @generated
		 */
		EClass SPEAKER = eINSTANCE.getSpeaker();

		/**
		 * The meta object literal for the '{@link conference.impl.SubmissionImpl <em>Submission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.SubmissionImpl
		 * @see conference.impl.ConferencePackageImpl#getSubmission()
		 * @generated
		 */
		EClass SUBMISSION = eINSTANCE.getSubmission();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMISSION__NAME = eINSTANCE.getSubmission_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMISSION__TITLE = eINSTANCE.getSubmission_Title();

		/**
		 * The meta object literal for the '<em><b>Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMISSION__ACCEPTED = eINSTANCE.getSubmission_Accepted();

		/**
		 * The meta object literal for the '<em><b>Reviewers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMISSION__REVIEWERS = eINSTANCE.getSubmission_Reviewers();

		/**
		 * The meta object literal for the '{@link conference.DayType <em>Day Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.DayType
		 * @see conference.impl.ConferencePackageImpl#getDayType()
		 * @generated
		 */
		EEnum DAY_TYPE = eINSTANCE.getDayType();

	}

} //ConferencePackage
