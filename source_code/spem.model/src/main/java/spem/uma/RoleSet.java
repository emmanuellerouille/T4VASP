/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spem.uma;

import org.eclipse.emf.common.util.EList;

import spem.MethodContentElement;
import spem.RoleDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spem.uma.RoleSet#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see spem.uma.UmaPackage#getRoleSet()
 * @model
 * @generated
 */
public interface RoleSet extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link spem.RoleDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see spem.uma.UmaPackage#getRoleSet_Role()
	 * @model
	 * @generated
	 */
	EList<RoleDefinition> getRole();

} // RoleSet
