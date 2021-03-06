/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.CompositeVariationPoint#getBindingCVSpec <em>Binding CV Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getCompositeVariationPoint()
 * @model
 * @generated
 */
public interface CompositeVariationPoint extends VariationPoint {
	/**
	 * Returns the value of the '<em><b>Binding CV Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The explicitly exposed interface of an encapsulated CU</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding CV Spec</em>' reference.
	 * @see #setBindingCVSpec(CVSpec)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getCompositeVariationPoint_BindingCVSpec()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CVSpec getBindingCVSpec();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.CompositeVariationPoint#getBindingCVSpec <em>Binding CV Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding CV Spec</em>' reference.
	 * @see #getBindingCVSpec()
	 * @generated
	 */
	void setBindingCVSpec(CVSpec value);

} // CompositeVariationPoint
