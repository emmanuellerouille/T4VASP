/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Existence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.ObjectExistence#getOptionalObject <em>Optional Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.variability.VariabilityPackage#getObjectExistence()
 * @model
 * @generated
 */
public interface ObjectExistence extends Existence {
	/**
	 * Returns the value of the '<em><b>Optional Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The&nbsp;object&nbsp;handle&nbsp;identifying&nbsp;the&nbsp;base&nbsp;model&nbsp;object&nbsp;whose&nbsp;existence&nbsp;is&nbsp;in&nbsp;question.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional Object</em>' containment reference.
	 * @see #setOptionalObject(ObjectHandle)
	 * @see org.kermeta.cvl.variability.VariabilityPackage#getObjectExistence_OptionalObject()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ObjectHandle getOptionalObject();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.variability.ObjectExistence#getOptionalObject <em>Optional Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Object</em>' containment reference.
	 * @see #getOptionalObject()
	 * @generated
	 */
	void setOptionalObject(ObjectHandle value);

} // ObjectExistence
