/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.Variable#getReplacementFragmentTypesubsetstype <em>Replacement Fragment Typesubsetstype</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.Variable#getDefaulValue <em>Defaul Value</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.Variable#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends VSpec {
	/**
	 * Returns the value of the '<em><b>Replacement Fragment Typesubsetstype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacement Fragment Typesubsetstype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement Fragment Typesubsetstype</em>' reference.
	 * @see #setReplacementFragmentTypesubsetstype(ReplacementFragmentType)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVariable_ReplacementFragmentTypesubsetstype()
	 * @model ordered="false"
	 * @generated
	 */
	ReplacementFragmentType getReplacementFragmentTypesubsetstype();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.Variable#getReplacementFragmentTypesubsetstype <em>Replacement Fragment Typesubsetstype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Fragment Typesubsetstype</em>' reference.
	 * @see #getReplacementFragmentTypesubsetstype()
	 * @generated
	 */
	void setReplacementFragmentTypesubsetstype(ReplacementFragmentType value);

	/**
	 * Returns the value of the '<em><b>Defaul Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defaul Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaul Value</em>' containment reference.
	 * @see #setDefaulValue(ValueSpecification)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVariable_DefaulValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getDefaulValue();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.Variable#getDefaulValue <em>Defaul Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaul Value</em>' containment reference.
	 * @see #getDefaulValue()
	 * @generated
	 */
	void setDefaulValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Variabletype)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVariable_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Variabletype getType();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.Variable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Variabletype value);

} // Variable
