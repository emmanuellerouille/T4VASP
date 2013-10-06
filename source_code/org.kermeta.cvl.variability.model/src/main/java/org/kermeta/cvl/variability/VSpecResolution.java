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
 * A representation of the model object '<em><b>VSpec Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.VSpecResolution#getResolvedVSpec <em>Resolved VSpec</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.VSpecResolution#getChildResolution <em>Child Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getVSpecResolution()
 * @model abstract="true"
 * @generated
 */
public interface VSpecResolution extends VPackageable {
	/**
	 * Returns the value of the '<em><b>Resolved VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The&nbsp;VSpec&nbsp;this&nbsp;VSpecResolution&nbsp;resolves.Due to&nbsp;VSpec inheritance and VClassifiers, a given VPSec
	 * may have several VSpecResolutions resolving it, where each resolution is in the context of its parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolved VSpec</em>' reference.
	 * @see #setResolvedVSpec(VSpec)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVSpecResolution_ResolvedVSpec()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VSpec getResolvedVSpec();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.VSpecResolution#getResolvedVSpec <em>Resolved VSpec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved VSpec</em>' reference.
	 * @see #getResolvedVSpec()
	 * @generated
	 */
	void setResolvedVSpec(VSpec value);

	/**
	 * Returns the value of the '<em><b>Child Resolution</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.VSpecResolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The child resolutions of this VSpecResolution. A given VSpecResolution is interpreted in the context of its parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Resolution</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVSpecResolution_ChildResolution()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VSpecResolution> getChildResolution();

} // VSpecResolution
