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
 * A representation of the model object '<em><b>Configurable Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.ConfigurableUnit#getOwnedVSpec <em>Owned VSpec</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.ConfigurableUnit#getOwnedVariationPoint <em>Owned Variation Point</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.ConfigurableUnit#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.ConfigurableUnit#getConfigurableContainerObject <em>Configurable Container Object</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.ConfigurableUnit#getOwnedVSpecResolution <em>Owned VSpec Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getConfigurableUnit()
 * @model
 * @generated
 */
public interface ConfigurableUnit extends CompositeVariationPoint {
	/**
	 * Returns the value of the '<em><b>Owned VSpec</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.VSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Internal VSpecs of the CU</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned VSpec</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getConfigurableUnit_OwnedVSpec()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VSpec> getOwnedVSpec();

	/**
	 * Returns the value of the '<em><b>Owned Variation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.VariationPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal variation points against the content of the base model object referenced by the unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Variation Point</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getConfigurableUnit_OwnedVariationPoint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariationPoint> getOwnedVariationPoint();

	/**
	 * Returns the value of the '<em><b>Owned Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraints wrt the internal VSPecs of the unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Constraint</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getConfigurableUnit_OwnedConstraint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getOwnedConstraint();

	/**
	 * Returns the value of the '<em><b>Configurable Container Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The container object in the base model which is configurable.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configurable Container Object</em>' containment reference.
	 * @see #setConfigurableContainerObject(ObjectHandle)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getConfigurableUnit_ConfigurableContainerObject()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ObjectHandle getConfigurableContainerObject();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.ConfigurableUnit#getConfigurableContainerObject <em>Configurable Container Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurable Container Object</em>' containment reference.
	 * @see #getConfigurableContainerObject()
	 * @generated
	 */
	void setConfigurableContainerObject(ObjectHandle value);

	/**
	 * Returns the value of the '<em><b>Owned VSpec Resolution</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.VSpecResolution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned VSpec Resolution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned VSpec Resolution</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getConfigurableUnit_OwnedVSpecResolution()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VSpecResolution> getOwnedVSpecResolution();

} // ConfigurableUnit
