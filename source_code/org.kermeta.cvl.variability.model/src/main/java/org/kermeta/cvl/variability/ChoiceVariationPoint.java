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
 * A representation of the model object '<em><b>Choice Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.ChoiceVariationPoint#getBindingChoice <em>Binding Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getChoiceVariationPoint()
 * @model
 * @generated
 */
public interface ChoiceVariationPoint extends VariationPoint {
	/**
	 * Returns the value of the '<em><b>Binding Choice</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.Choice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Choice</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Choice</em>' reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getChoiceVariationPoint_BindingChoice()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Choice> getBindingChoice();

} // ChoiceVariationPoint
