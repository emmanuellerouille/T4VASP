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
 * A representation of the model object '<em><b>Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.VariationPoint#getBindingVspec <em>Binding Vspec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getVariationPoint()
 * @model abstract="true"
 * @generated
 */
public interface VariationPoint extends VPackageable {
	/**
	 * Returns the value of the '<em><b>Binding Vspec</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.VSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Vspec bound by this binding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Vspec</em>' reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVariationPoint_BindingVspec()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VSpec> getBindingVspec();

} // VariationPoint
