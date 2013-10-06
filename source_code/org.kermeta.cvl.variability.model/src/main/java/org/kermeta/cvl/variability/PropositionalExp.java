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
 * A representation of the model object '<em><b>Propositional Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.PropositionalExp#getLogicalOp <em>Logical Op</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.PropositionalExp#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getPropositionalExp()
 * @model
 * @generated
 */
public interface PropositionalExp extends LogicalExp {
	/**
	 * Returns the value of the '<em><b>Logical Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org.kermeta.cvl.variability.LogicalOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Op</em>' attribute.
	 * @see org.kermeta.cvl.variability.LogicalOp
	 * @see #setLogicalOp(LogicalOp)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getPropositionalExp_LogicalOp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LogicalOp getLogicalOp();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.PropositionalExp#getLogicalOp <em>Logical Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Op</em>' attribute.
	 * @see org.kermeta.cvl.variability.LogicalOp
	 * @see #getLogicalOp()
	 * @generated
	 */
	void setLogicalOp(LogicalOp value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.GeneralExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getPropositionalExp_Operand()
	 * @model containment="true" required="true" upper="3" ordered="false"
	 * @generated
	 */
	EList<GeneralExpression> getOperand();

} // PropositionalExp
