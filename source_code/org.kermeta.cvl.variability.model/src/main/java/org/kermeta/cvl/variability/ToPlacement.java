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
 * A representation of the model object '<em><b>To Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.ToPlacement#getToReplacement <em>To Replacement</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.ToPlacement#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.ToPlacement#getInsideBoundaryElement <em>Inside Boundary Element</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.ToPlacement#getOutsideBoundaryElement <em>Outside Boundary Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getToPlacement()
 * @model
 * @generated
 */
public interface ToPlacement extends PlacementBoundaryElement {
	/**
	 * Returns the value of the '<em><b>To Replacement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.kermeta.cvl.variability.ToReplacement#getToPlacement <em>To Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a ToReplacement in a containing replacement fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Replacement</em>' reference.
	 * @see #setToReplacement(ToReplacement)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getToPlacement_ToReplacement()
	 * @see org.kermeta.cvl.variability.ToReplacement#getToPlacement
	 * @model opposite="toPlacement" ordered="false"
	 * @generated
	 */
	ToReplacement getToReplacement();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.ToPlacement#getToReplacement <em>To Replacement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Replacement</em>' reference.
	 * @see #getToReplacement()
	 * @generated
	 */
	void setToReplacement(ToReplacement value);

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the attribute to be changed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getToPlacement_PropertyName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.ToPlacement#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Inside Boundary Element</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.cvl.variability.ObjectHandle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model elements that are referred to by outside model elements. Used to distinguish miltiplicity references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inside Boundary Element</em>' reference list.
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getToPlacement_InsideBoundaryElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ObjectHandle> getInsideBoundaryElement();

	/**
	 * Returns the value of the '<em><b>Outside Boundary Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outside model elements that refer model elements inside the fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outside Boundary Element</em>' reference.
	 * @see #setOutsideBoundaryElement(ObjectHandle)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getToPlacement_OutsideBoundaryElement()
	 * @model ordered="false"
	 * @generated
	 */
	ObjectHandle getOutsideBoundaryElement();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.ToPlacement#getOutsideBoundaryElement <em>Outside Boundary Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outside Boundary Element</em>' reference.
	 * @see #getOutsideBoundaryElement()
	 * @generated
	 */
	void setOutsideBoundaryElement(ObjectHandle value);

} // ToPlacement
