/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSpec Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.VSpecDerivation#getDerivedVSpec <em>Derived VSpec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getVSpecDerivation()
 * @model
 * @generated
 */
public interface VSpecDerivation extends EObject {
	/**
	 * Returns the value of the '<em><b>Derived VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived VSpec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived VSpec</em>' reference.
	 * @see #setDerivedVSpec(VSpec)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVSpecDerivation_DerivedVSpec()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VSpec getDerivedVSpec();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.VSpecDerivation#getDerivedVSpec <em>Derived VSpec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived VSpec</em>' reference.
	 * @see #getDerivedVSpec()
	 * @generated
	 */
	void setDerivedVSpec(VSpec value);

} // VSpecDerivation
