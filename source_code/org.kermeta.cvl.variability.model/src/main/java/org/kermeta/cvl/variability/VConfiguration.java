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
 * A representation of the model object '<em><b>VConfiguration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.VConfiguration#getVSpecResolution <em>VSpec Resolution</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.VConfiguration#isIsPartial <em>Is Partial</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.VConfiguration#getSuper <em>Super</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.VConfiguration#getResolvedVIRef <em>Resolved VI Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getVConfiguration()
 * @model
 * @generated
 */
public interface VConfiguration extends VSpecResolution, VPackageable {
	/**
	 * Returns the value of the '<em><b>VSpec Resolution</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.VSpecResolution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSpec Resolution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSpec Resolution</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVConfiguration_VSpecResolution()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VSpecResolution> getVSpecResolution();

	/**
	 * Returns the value of the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Partial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Partial</em>' attribute.
	 * @see #setIsPartial(boolean)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVConfiguration_IsPartial()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsPartial();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.VConfiguration#isIsPartial <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Partial</em>' attribute.
	 * @see #isIsPartial()
	 * @generated
	 */
	void setIsPartial(boolean value);

	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(VConfiguration)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVConfiguration_Super()
	 * @model ordered="false"
	 * @generated
	 */
	VConfiguration getSuper();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.VConfiguration#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(VConfiguration value);

	/**
	 * Returns the value of the '<em><b>Resolved VI Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved VI Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved VI Ref</em>' reference.
	 * @see #setResolvedVIRef(CVSpec)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVConfiguration_ResolvedVIRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CVSpec getResolvedVIRef();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.VConfiguration#getResolvedVIRef <em>Resolved VI Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved VI Ref</em>' reference.
	 * @see #getResolvedVIRef()
	 * @generated
	 */
	void setResolvedVIRef(CVSpec value);

} // VConfiguration
