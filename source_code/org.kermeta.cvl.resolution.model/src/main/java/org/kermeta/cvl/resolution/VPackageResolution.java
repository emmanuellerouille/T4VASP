/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.resolution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.kermeta.cvl.variability.VPackageable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VPackage Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.resolution.VPackageResolution#getPackagedElements <em>Packaged Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.resolution.ResolutionPackage#getVPackageResolution()
 * @model
 * @generated
 */
public interface VPackageResolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Packaged Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.VPackageable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaged Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaged Elements</em>' containment reference list.
	 * @see org.kermeta.cvl.resolution.ResolutionPackage#getVPackageResolution_PackagedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<VPackageable> getPackagedElements();

} // VPackageResolution
