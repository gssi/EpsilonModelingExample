/**
 */
package conference.impl;

import conference.Agenda;
import conference.Conference;
import conference.ConferencePackage;
import conference.Person;
import conference.Submission;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conference.impl.ConferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link conference.impl.ConferenceImpl#getVenue <em>Venue</em>}</li>
 *   <li>{@link conference.impl.ConferenceImpl#getDate <em>Date</em>}</li>
 *   <li>{@link conference.impl.ConferenceImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link conference.impl.ConferenceImpl#getAgenda <em>Agenda</em>}</li>
 *   <li>{@link conference.impl.ConferenceImpl#getSubmissions <em>Submissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConferenceImpl extends MinimalEObjectImpl.Container implements Conference {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVenue() <em>Venue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenue()
	 * @generated
	 * @ordered
	 */
	protected static final String VENUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVenue() <em>Venue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenue()
	 * @generated
	 * @ordered
	 */
	protected String venue = VENUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> participants;

	/**
	 * The cached value of the '{@link #getAgenda() <em>Agenda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgenda()
	 * @generated
	 * @ordered
	 */
	protected Agenda agenda;

	/**
	 * The cached value of the '{@link #getSubmissions() <em>Submissions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Submission> submissions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.CONFERENCE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.CONFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVenue() {
		return venue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVenue(String newVenue) {
		String oldVenue = venue;
		venue = newVenue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.CONFERENCE__VENUE, oldVenue, venue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.CONFERENCE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Person>(Person.class, this, ConferencePackage.CONFERENCE__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agenda getAgenda() {
		return agenda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgenda(Agenda newAgenda, NotificationChain msgs) {
		Agenda oldAgenda = agenda;
		agenda = newAgenda;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConferencePackage.CONFERENCE__AGENDA, oldAgenda, newAgenda);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgenda(Agenda newAgenda) {
		if (newAgenda != agenda) {
			NotificationChain msgs = null;
			if (agenda != null)
				msgs = ((InternalEObject)agenda).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConferencePackage.CONFERENCE__AGENDA, null, msgs);
			if (newAgenda != null)
				msgs = ((InternalEObject)newAgenda).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConferencePackage.CONFERENCE__AGENDA, null, msgs);
			msgs = basicSetAgenda(newAgenda, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.CONFERENCE__AGENDA, newAgenda, newAgenda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Submission> getSubmissions() {
		if (submissions == null) {
			submissions = new EObjectContainmentEList<Submission>(Submission.class, this, ConferencePackage.CONFERENCE__SUBMISSIONS);
		}
		return submissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConferencePackage.CONFERENCE__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case ConferencePackage.CONFERENCE__AGENDA:
				return basicSetAgenda(null, msgs);
			case ConferencePackage.CONFERENCE__SUBMISSIONS:
				return ((InternalEList<?>)getSubmissions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConferencePackage.CONFERENCE__NAME:
				return getName();
			case ConferencePackage.CONFERENCE__VENUE:
				return getVenue();
			case ConferencePackage.CONFERENCE__DATE:
				return getDate();
			case ConferencePackage.CONFERENCE__PARTICIPANTS:
				return getParticipants();
			case ConferencePackage.CONFERENCE__AGENDA:
				return getAgenda();
			case ConferencePackage.CONFERENCE__SUBMISSIONS:
				return getSubmissions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConferencePackage.CONFERENCE__NAME:
				setName((String)newValue);
				return;
			case ConferencePackage.CONFERENCE__VENUE:
				setVenue((String)newValue);
				return;
			case ConferencePackage.CONFERENCE__DATE:
				setDate((String)newValue);
				return;
			case ConferencePackage.CONFERENCE__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Person>)newValue);
				return;
			case ConferencePackage.CONFERENCE__AGENDA:
				setAgenda((Agenda)newValue);
				return;
			case ConferencePackage.CONFERENCE__SUBMISSIONS:
				getSubmissions().clear();
				getSubmissions().addAll((Collection<? extends Submission>)newValue);
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
			case ConferencePackage.CONFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConferencePackage.CONFERENCE__VENUE:
				setVenue(VENUE_EDEFAULT);
				return;
			case ConferencePackage.CONFERENCE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ConferencePackage.CONFERENCE__PARTICIPANTS:
				getParticipants().clear();
				return;
			case ConferencePackage.CONFERENCE__AGENDA:
				setAgenda((Agenda)null);
				return;
			case ConferencePackage.CONFERENCE__SUBMISSIONS:
				getSubmissions().clear();
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
			case ConferencePackage.CONFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConferencePackage.CONFERENCE__VENUE:
				return VENUE_EDEFAULT == null ? venue != null : !VENUE_EDEFAULT.equals(venue);
			case ConferencePackage.CONFERENCE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ConferencePackage.CONFERENCE__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case ConferencePackage.CONFERENCE__AGENDA:
				return agenda != null;
			case ConferencePackage.CONFERENCE__SUBMISSIONS:
				return submissions != null && !submissions.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", venue: ");
		result.append(venue);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //ConferenceImpl
