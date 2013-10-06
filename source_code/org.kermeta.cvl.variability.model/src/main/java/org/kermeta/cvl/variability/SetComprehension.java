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
 * A representation of the model object '<em><b>Set Comprehension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.SetComprehension#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.SetComprehension#getSetComprVariable <em>Set Compr Variable</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.SetComprehension#getGeneralExpression <em>General Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getSetComprehension()
 * @model
 * @generated
 */
public interface SetComprehension extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getSetComprehension_Expression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.SetComprehension#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Set Compr Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Compr Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Compr Variable</em>' containment reference.
	 * @see #setSetComprVariable(SetComprVariable)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getSetComprehension_SetComprVariable()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SetComprVariable getSetComprVariable();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.SetComprehension#getSetComprVariable <em>Set Compr Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Compr Variable</em>' containment reference.
	 * @see #getSetComprVariable()
	 * @generated
	 */
	void setSetComprVariable(SetComprVariable value);

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
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getSetComprehension_GeneralExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<GeneralExpression> getGeneralExpression();

} // SetComprehension
