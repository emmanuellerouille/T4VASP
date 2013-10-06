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
 * A representation of the model object '<em><b>VInterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.VInterface#getVSpec <em>VSpec</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.VInterface#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.VInterface#getSuper <em>Super</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getVInterface()
 * @model
 * @generated
 */
public interface VInterface extends VPackageable {
	/**
	 * Returns the value of the '<em><b>VSpec</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.VSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 *     The VSpecs of the VInterface. They are in effect the configuration parameters of units typed by this interface.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VSpec</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVInterface_VSpec()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VSpec> getVSpec();

	/**
	 * Returns the value of the '<em><b>Owned Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraints&nbsp;over&nbsp;the&nbsp;VSPecs&nbsp;over&nbsp;this&nbsp;VInterface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Constraint</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVInterface_OwnedConstraint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getOwnedConstraint();

	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An inherited interface. </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(VInterface)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVInterface_Super()
	 * @model ordered="false"
	 * @generated
	 */
	VInterface getSuper();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.VInterface#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(VInterface value);

} // VInterface
