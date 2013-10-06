/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spem.RoleUse#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see spem.SpemPackage#getRoleUse()
 * @model
 * @generated
 */
public interface RoleUse extends MethodContentUse {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(RoleDefinition)
	 * @see spem.SpemPackage#getRoleUse_Role()
	 * @model
	 * @generated
	 */
	RoleDefinition getRole();

	/**
	 * Sets the value of the '{@link spem.RoleUse#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleDefinition value);

} // RoleUse
