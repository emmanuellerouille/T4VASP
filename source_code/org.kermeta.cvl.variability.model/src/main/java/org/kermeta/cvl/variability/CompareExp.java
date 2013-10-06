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
 * A representation of the model object '<em><b>Compare Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.CompareExp#getCompared <em>Compared</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.CompareExp#getCompareOp <em>Compare Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getCompareExp()
 * @model
 * @generated
 */
public interface CompareExp extends LogicalExp {
	/**
	 * Returns the value of the '<em><b>Compared</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compared</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compared</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getCompareExp_Compared()
	 * @model containment="true" lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<Expression> getCompared();

	/**
	 * Returns the value of the '<em><b>Compare Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org.kermeta.cvl.variability.CompareOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare Op</em>' attribute.
	 * @see org.kermeta.cvl.variability.CompareOp
	 * @see #setCompareOp(CompareOp)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getCompareExp_CompareOp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CompareOp getCompareOp();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.CompareExp#getCompareOp <em>Compare Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare Op</em>' attribute.
	 * @see org.kermeta.cvl.variability.CompareOp
	 * @see #getCompareOp()
	 * @generated
	 */
	void setCompareOp(CompareOp value);

} // CompareExp
