/**
 */
package conference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Person#getName <em>Name</em>}</li>
 *   <li>{@link conference.Person#getAffiliation <em>Affiliation</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conference.ConferencePackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conference.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Affiliation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affiliation</em>' attribute.
	 * @see #setAffiliation(String)
	 * @see conference.ConferencePackage#getPerson_Affiliation()
	 * @model
	 * @generated
	 */
	String getAffiliation();

	/**
	 * Sets the value of the '{@link conference.Person#getAffiliation <em>Affiliation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affiliation</em>' attribute.
	 * @see #getAffiliation()
	 * @generated
	 */
	void setAffiliation(String value);

} // Person
