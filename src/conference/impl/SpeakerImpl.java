/**
 */
package conference.impl;

import conference.ConferencePackage;
import conference.Speaker;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speaker</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpeakerImpl extends PersonImpl implements Speaker {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeakerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.SPEAKER;
	}

} //SpeakerImpl
