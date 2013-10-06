/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.spem.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive AC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.spem.behavior.PrimitiveAC#getAction <em>Action</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.PrimitiveAC#getPostConditions <em>Post Conditions</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.PrimitiveAC#getPreConditions <em>Pre Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.spem.behavior.BehaviorPackage#getPrimitiveAC()
 * @model
 * @generated
 */
public interface PrimitiveAC extends AC {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see org.kermeta.spem.behavior.BehaviorPackage#getPrimitiveAC_Action()
	 * @model required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link org.kermeta.spem.behavior.PrimitiveAC#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Post Conditions</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.spem.behavior.PostCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Conditions</em>' reference list.
	 * @see org.kermeta.spem.behavior.BehaviorPackage#getPrimitiveAC_PostConditions()
	 * @model
	 * @generated
	 */
	EList<PostCondition> getPostConditions();

	/**
	 * Returns the value of the '<em><b>Pre Conditions</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.spem.behavior.PreCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Conditions</em>' reference list.
	 * @see org.kermeta.spem.behavior.BehaviorPackage#getPrimitiveAC_PreConditions()
	 * @model
	 * @generated
	 */
	EList<PreCondition> getPreConditions();

} // PrimitiveAC
