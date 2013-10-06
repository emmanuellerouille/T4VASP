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
 * A representation of the model object '<em><b>ACL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.spem.behavior.ACL#getACs <em>ACs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.spem.behavior.BehaviorPackage#getACL()
 * @model
 * @generated
 */
public interface ACL extends AC {
	/**
	 * Returns the value of the '<em><b>ACs</b></em>' reference list.
	 * The list contents are of type {@link org.kermeta.spem.behavior.AC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ACs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACs</em>' reference list.
	 * @see org.kermeta.spem.behavior.BehaviorPackage#getACL_ACs()
	 * @model required="true"
	 * @generated
	 */
	EList<AC> getACs();

} // ACL
