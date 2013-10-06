/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeatable Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.RepeatableVariationPoint#getBindingClassifier <em>Binding Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getRepeatableVariationPoint()
 * @model abstract="true"
 * @generated
 */
public interface RepeatableVariationPoint extends VariationPoint {
	/**
	 * Returns the value of the '<em><b>Binding Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Classifier</em>' reference.
	 * @see #setBindingClassifier(VClassifier)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getRepeatableVariationPoint_BindingClassifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VClassifier getBindingClassifier();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.RepeatableVariationPoint#getBindingClassifier <em>Binding Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Classifier</em>' reference.
	 * @see #getBindingClassifier()
	 * @generated
	 */
	void setBindingClassifier(VClassifier value);

} // RepeatableVariationPoint
