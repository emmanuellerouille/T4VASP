/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spem.TeamProfile#getSubTeam <em>Sub Team</em>}</li>
 *   <li>{@link spem.TeamProfile#getSuperTeam <em>Super Team</em>}</li>
 *   <li>{@link spem.TeamProfile#getTeamRole <em>Team Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see spem.SpemPackage#getTeamProfile()
 * @model
 * @generated
 */
public interface TeamProfile extends BreakdownElement {
	/**
	 * Returns the value of the '<em><b>Sub Team</b></em>' containment reference list.
	 * The list contents are of type {@link spem.TeamProfile}.
	 * It is bidirectional and its opposite is '{@link spem.TeamProfile#getSuperTeam <em>Super Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Team</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Team</em>' containment reference list.
	 * @see spem.SpemPackage#getTeamProfile_SubTeam()
	 * @see spem.TeamProfile#getSuperTeam
	 * @model opposite="superTeam" containment="true"
	 * @generated
	 */
	EList<TeamProfile> getSubTeam();

	/**
	 * Returns the value of the '<em><b>Super Team</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link spem.TeamProfile#getSubTeam <em>Sub Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Team</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Team</em>' container reference.
	 * @see #setSuperTeam(TeamProfile)
	 * @see spem.SpemPackage#getTeamProfile_SuperTeam()
	 * @see spem.TeamProfile#getSubTeam
	 * @model opposite="subTeam" transient="false"
	 * @generated
	 */
	TeamProfile getSuperTeam();

	/**
	 * Sets the value of the '{@link spem.TeamProfile#getSuperTeam <em>Super Team</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Team</em>' container reference.
	 * @see #getSuperTeam()
	 * @generated
	 */
	void setSuperTeam(TeamProfile value);

	/**
	 * Returns the value of the '<em><b>Team Role</b></em>' reference list.
	 * The list contents are of type {@link spem.RoleUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Role</em>' reference list.
	 * @see spem.SpemPackage#getTeamProfile_TeamRole()
	 * @model
	 * @generated
	 */
	EList<RoleUse> getTeamRole();

} // TeamProfile
