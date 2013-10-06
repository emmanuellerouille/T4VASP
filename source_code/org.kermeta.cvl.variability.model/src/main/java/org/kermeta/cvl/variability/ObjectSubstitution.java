/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.ObjectSubstitution#getPlacementObject <em>Placement Object</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.ObjectSubstitution#getReplacementObject <em>Replacement Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getObjectSubstitution()
 * @model
 * @generated
 */
public interface ObjectSubstitution extends ChoiceVariationPoint {
	/**
	 * Returns the value of the '<em><b>Placement Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The&nbsp;object handle identifying the base model object&nbsp;to&nbsp;be&nbsp;replaced&nbsp;by&nbsp;the replacement
	 * object&nbsp;in&nbsp;this&nbsp;substitution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Placement Object</em>' containment reference.
	 * @see #setPlacementObject(ObjectHandle)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getObjectSubstitution_PlacementObject()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ObjectHandle getPlacementObject();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.ObjectSubstitution#getPlacementObject <em>Placement Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Object</em>' containment reference.
	 * @see #getPlacementObject()
	 * @generated
	 */
	void setPlacementObject(ObjectHandle value);

	/**
	 * Returns the value of the '<em><b>Replacement Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The&nbsp;object handle identifying the base model object&nbsp;replacing&nbsp;to&nbsp;the&nbsp;placement&nbsp;object in this
	 * substitution. If no replacement is specified then the object is expected to arrive in a variable, that is the variation
	 * point must be bound to a variable to be acted on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replacement Object</em>' containment reference.
	 * @see #setReplacementObject(ObjectHandle)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getObjectSubstitution_ReplacementObject()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ObjectHandle getReplacementObject();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.ObjectSubstitution#getReplacementObject <em>Replacement Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Object</em>' containment reference.
	 * @see #getReplacementObject()
	 * @generated
	 */
	void setReplacementObject(ObjectHandle value);

} // ObjectSubstitution
