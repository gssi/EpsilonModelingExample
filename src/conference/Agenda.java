/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agenda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Agenda#getDays <em>Days</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getAgenda()
 * @model
 * @generated
 */
public interface Agenda extends EObject {
	/**
	 * Returns the value of the '<em><b>Days</b></em>' containment reference list.
	 * The list contents are of type {@link conference.Day}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days</em>' containment reference list.
	 * @see conference.ConferencePackage#getAgenda_Days()
	 * @model containment="true"
	 * @generated
	 */
	EList<Day> getDays();

} // Agenda
