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
 * A representation of the model object '<em><b>Placement Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.PlacementFragment#getPlacementBoundaryElement <em>Placement Boundary Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getPlacementFragment()
 * @model
 * @generated
 */
public interface PlacementFragment extends VariationPoint {
	/**
	 * Returns the value of the '<em><b>Placement Boundary Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.PlacementBoundaryElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The boundary elements captures all the relations from and to the fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Placement Boundary Element</em>' containment reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getPlacementFragment_PlacementBoundaryElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PlacementBoundaryElement> getPlacementBoundaryElement();

} // PlacementFragment
