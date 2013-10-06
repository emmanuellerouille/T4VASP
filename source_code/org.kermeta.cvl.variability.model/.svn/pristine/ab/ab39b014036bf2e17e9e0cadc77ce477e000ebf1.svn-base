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
 * A representation of the model object '<em><b>VSpec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.VSpec#getGroupMultiplicity <em>Group Multiplicity</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.VSpec#getResolutionTime <em>Resolution Time</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.VSpec#getChildVSpec <em>Child VSpec</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.VSpec#getDerivation <em>Derivation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getVSpec()
 * @model abstract="true"
 * @generated
 */
public interface VSpec extends VPackageable {
	/**
	 * Returns the value of the '<em><b>Group Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 *     The group multiplicity of the VSpec. If the VSpec is resolved positively and has a group multiplicity then the number
	 *     of<br />
	 *     its children resolved positively must conform to the specified multiplicity interval.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Multiplicity</em>' containment reference.
	 * @see #setGroupMultiplicity(MultiplicityInterval)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVSpec_GroupMultiplicity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	MultiplicityInterval getGroupMultiplicity();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.VSpec#getGroupMultiplicity <em>Group Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Multiplicity</em>' containment reference.
	 * @see #getGroupMultiplicity()
	 * @generated
	 */
	void setGroupMultiplicity(MultiplicityInterval value);

	/**
	 * Returns the value of the '<em><b>Resolution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The latest life-cycle stage at which this VSpec is expected to be resolved, e.g. "Design", "Link", "Build", "PostBuild", etc.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution Time</em>' attribute.
	 * @see #setResolutionTime(String)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVSpec_ResolutionTime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getResolutionTime();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.VSpec#getResolutionTime <em>Resolution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Time</em>' attribute.
	 * @see #getResolutionTime()
	 * @generated
	 */
	void setResolutionTime(String value);

	/**
	 * Returns the value of the '<em><b>Child VSpec</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.VSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 *     The childSpecs of a VSpec are its children in the VSpec tree, i.e. this association defines the VSpec tree structure.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child VSpec</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVSpec_ChildVSpec()
	 * @model containment="true"
	 * @generated
	 */
	EList<VSpec> getChildVSpec();

	/**
	 * Returns the value of the '<em><b>Derivation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation</em>' containment reference.
	 * @see #setDerivation(VSpecDerivation)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getVSpec_Derivation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	VSpecDerivation getDerivation();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.VSpec#getDerivation <em>Derivation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation</em>' containment reference.
	 * @see #getDerivation()
	 * @generated
	 */
	void setDerivation(VSpecDerivation value);

} // VSpec
