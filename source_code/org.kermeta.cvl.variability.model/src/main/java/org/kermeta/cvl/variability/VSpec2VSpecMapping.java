/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSpec2 VSpec Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.VSpec2VSpecMapping#getDerivingConstraint <em>Deriving Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getVSpec2VSpecMapping()
 * @model
 * @generated
 */
public interface VSpec2VSpecMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Deriving Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deriving Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deriving Constraint</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVSpec2VSpecMapping_DerivingConstraint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getDerivingConstraint();

} // VSpec2VSpecMapping
