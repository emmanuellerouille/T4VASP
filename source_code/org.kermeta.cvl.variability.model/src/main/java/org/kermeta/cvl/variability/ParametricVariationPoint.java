/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametric Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.ParametricVariationPoint#getBindingVariable <em>Binding Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getParametricVariationPoint()
 * @model abstract="true"
 * @generated
 */
public interface ParametricVariationPoint extends VariationPoint {
	/**
	 * Returns the value of the '<em><b>Binding Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Variable</em>' reference.
	 * @see #setBindingVariable(Variable)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getParametricVariationPoint_BindingVariable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Variable getBindingVariable();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.ParametricVariationPoint#getBindingVariable <em>Binding Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Variable</em>' reference.
	 * @see #getBindingVariable()
	 * @generated
	 */
	void setBindingVariable(Variable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<?> getPropertyValue(String propertyName);

} // ParametricVariationPoint
