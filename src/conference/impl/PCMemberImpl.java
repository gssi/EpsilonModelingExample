/**
 */
package conference.impl;

import conference.ConferencePackage;
import conference.PCMember;
import conference.Submission;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PC Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conference.impl.PCMemberImpl#getAssignedReviews <em>Assigned Reviews</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMemberImpl extends PersonImpl implements PCMember {
	/**
	 * The cached value of the '{@link #getAssignedReviews() <em>Assigned Reviews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedReviews()
	 * @generated
	 * @ordered
	 */
	protected EList<Submission> assignedReviews;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.PC_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Submission> getAssignedReviews() {
		if (assignedReviews == null) {
			assignedReviews = new EObjectWithInverseResolvingEList.ManyInverse<Submission>(Submission.class, this, ConferencePackage.PC_MEMBER__ASSIGNED_REVIEWS, ConferencePackage.SUBMISSION__REVIEWERS);
		}
		return assignedReviews;
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
			case ConferencePackage.PC_MEMBER__ASSIGNED_REVIEWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedReviews()).basicAdd(otherEnd, msgs);
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
			case ConferencePackage.PC_MEMBER__ASSIGNED_REVIEWS:
				return ((InternalEList<?>)getAssignedReviews()).basicRemove(otherEnd, msgs);
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
			case ConferencePackage.PC_MEMBER__ASSIGNED_REVIEWS:
				return getAssignedReviews();
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
			case ConferencePackage.PC_MEMBER__ASSIGNED_REVIEWS:
				getAssignedReviews().clear();
				getAssignedReviews().addAll((Collection<? extends Submission>)newValue);
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
			case ConferencePackage.PC_MEMBER__ASSIGNED_REVIEWS:
				getAssignedReviews().clear();
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
			case ConferencePackage.PC_MEMBER__ASSIGNED_REVIEWS:
				return assignedReviews != null && !assignedReviews.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCMemberImpl
