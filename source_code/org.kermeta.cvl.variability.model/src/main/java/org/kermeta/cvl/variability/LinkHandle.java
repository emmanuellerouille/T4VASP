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
 * A representation of the model object '<em><b>Link Handle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.LinkHandle#getLinkRef <em>Link Ref</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.LinkHandle#getLinkOwner <em>Link Owner</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.LinkHandle#getReferencedObject <em>Referenced Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getLinkHandle()
 * @model
 * @generated
 */
public interface LinkHandle extends VPackageable {
	/**
	 * Returns the value of the '<em><b>Link Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Ref</em>' attribute.
	 * @see #setLinkRef(String)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getLinkHandle_LinkRef()
	 * @model
	 * @generated
	 */
	String getLinkRef();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.LinkHandle#getLinkRef <em>Link Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Ref</em>' attribute.
	 * @see #getLinkRef()
	 * @generated
	 */
	void setLinkRef(String value);

	/**
	 * Returns the value of the '<em><b>Link Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Owner</em>' reference.
	 * @see #setLinkOwner(EObject)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getLinkHandle_LinkOwner()
	 * @model
	 * @generated
	 */
	EObject getLinkOwner();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.LinkHandle#getLinkOwner <em>Link Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Owner</em>' reference.
	 * @see #getLinkOwner()
	 * @generated
	 */
	void setLinkOwner(EObject value);

	/**
	 * Returns the value of the '<em><b>Referenced Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Object</em>' reference.
	 * @see #setReferencedObject(EObject)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getLinkHandle_ReferencedObject()
	 * @model
	 * @generated
	 */
	EObject getReferencedObject();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.LinkHandle#getReferencedObject <em>Referenced Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Object</em>' reference.
	 * @see #getReferencedObject()
	 * @generated
	 */
	void setReferencedObject(EObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<?> getEnd();

} // LinkHandle
