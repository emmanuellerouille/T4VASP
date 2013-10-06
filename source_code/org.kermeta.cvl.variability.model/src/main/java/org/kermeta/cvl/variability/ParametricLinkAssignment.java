/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametric Link Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.ParametricLinkAssignment#getLinkEndIdentifier <em>Link End Identifier</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.ParametricLinkAssignment#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getParametricLinkAssignment()
 * @model
 * @generated
 */
public interface ParametricLinkAssignment extends ParametricVariationPoint {
	/**
	 * Returns the value of the '<em><b>Link End Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link End Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link End Identifier</em>' attribute.
	 * @see #setLinkEndIdentifier(String)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getParametricLinkAssignment_LinkEndIdentifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLinkEndIdentifier();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.ParametricLinkAssignment#getLinkEndIdentifier <em>Link End Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link End Identifier</em>' attribute.
	 * @see #getLinkEndIdentifier()
	 * @generated
	 */
	void setLinkEndIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(LinkHandle)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getParametricLinkAssignment_Link()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	LinkHandle getLink();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.ParametricLinkAssignment#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(LinkHandle value);

} // ParametricLinkAssignment
