/**
 */
package conference.impl;

import conference.ConferencePackage;
import conference.PCMember;
import conference.Submission;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conference.impl.SubmissionImpl#getName <em>Name</em>}</li>
 *   <li>{@link conference.impl.SubmissionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link conference.impl.SubmissionImpl#isAccepted <em>Accepted</em>}</li>
 *   <li>{@link conference.impl.SubmissionImpl#getReviewers <em>Reviewers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmissionImpl extends MinimalEObjectImpl.Container implements Submission {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAccepted() <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccepted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCEPTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAccepted() <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccepted()
	 * @generated
	 * @ordered
	 */
	protected boolean accepted = ACCEPTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReviewers() <em>Reviewers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewers()
	 * @generated
	 * @ordered
	 */
	protected EList<PCMember> reviewers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.SUBMISSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.SUBMISSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.SUBMISSION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAccepted() {
		return accepted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccepted(boolean newAccepted) {
		boolean oldAccepted = accepted;
		accepted = newAccepted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.SUBMISSION__ACCEPTED, oldAccepted, accepted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCMember> getReviewers() {
		if (reviewers == null) {
			reviewers = new EObjectWithInverseResolvingEList.ManyInverse<PCMember>(PCMember.class, this, ConferencePackage.SUBMISSION__REVIEWERS, ConferencePackage.PC_MEMBER__ASSIGNED_REVIEWS);
		}
		return reviewers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConferencePackage.SUBMISSION__REVIEWERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReviewers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConferencePackage.SUBMISSION__REVIEWERS:
				return ((InternalEList<?>)getReviewers()).basicRemove(otherEnd, msgs);
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
			case ConferencePackage.SUBMISSION__NAME:
				return getName();
			case ConferencePackage.SUBMISSION__TITLE:
				return getTitle();
			case ConferencePackage.SUBMISSION__ACCEPTED:
				return isAccepted();
			case ConferencePackage.SUBMISSION__REVIEWERS:
				return getReviewers();
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
			case ConferencePackage.SUBMISSION__NAME:
				setName((String)newValue);
				return;
			case ConferencePackage.SUBMISSION__TITLE:
				setTitle((String)newValue);
				return;
			case ConferencePackage.SUBMISSION__ACCEPTED:
				setAccepted((Boolean)newValue);
				return;
			case ConferencePackage.SUBMISSION__REVIEWERS:
				getReviewers().clear();
				getReviewers().addAll((Collection<? extends PCMember>)newValue);
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
			case ConferencePackage.SUBMISSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConferencePackage.SUBMISSION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ConferencePackage.SUBMISSION__ACCEPTED:
				setAccepted(ACCEPTED_EDEFAULT);
				return;
			case ConferencePackage.SUBMISSION__REVIEWERS:
				getReviewers().clear();
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
			case ConferencePackage.SUBMISSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConferencePackage.SUBMISSION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ConferencePackage.SUBMISSION__ACCEPTED:
				return accepted != ACCEPTED_EDEFAULT;
			case ConferencePackage.SUBMISSION__REVIEWERS:
				return reviewers != null && !reviewers.isEmpty();
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
		result.append(", title: ");
		result.append(title);
		result.append(", accepted: ");
		result.append(accepted);
		result.append(')');
		return result.toString();
	}

} //SubmissionImpl
