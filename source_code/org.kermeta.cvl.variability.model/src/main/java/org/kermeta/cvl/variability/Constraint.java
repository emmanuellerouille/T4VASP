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
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.Constraint#getGeneralExpression <em>General Expression</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.Constraint#getContext <em>Context</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.Constraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.Constraint#getConstraintLanguage <em>Constraint Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends VPackageable {
	/**
	 * Returns the value of the '<em><b>General Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.GeneralExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Expression</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getConstraint_GeneralExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<GeneralExpression> getGeneralExpression();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(VSpec)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getConstraint_Context()
	 * @model ordered="false"
	 * @generated
	 */
	VSpec getContext();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.Constraint#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(VSpec value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see #setConstraint(String)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getConstraint_Constraint()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.Constraint#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Language</em>' attribute.
	 * @see #setConstraintLanguage(String)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getConstraint_ConstraintLanguage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getConstraintLanguage();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.Constraint#getConstraintLanguage <em>Constraint Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Language</em>' attribute.
	 * @see #getConstraintLanguage()
	 * @generated
	 */
	void setConstraintLanguage(String value);

} // Constraint
