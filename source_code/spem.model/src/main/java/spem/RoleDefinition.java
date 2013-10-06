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
 * A representation of the model object '<em><b>Role Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spem.RoleDefinition#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link spem.RoleDefinition#getRequiredQualification <em>Required Qualification</em>}</li>
 * </ul>
 * </p>
 *
 * @see spem.SpemPackage#getRoleDefinition()
 * @model
 * @generated
 */
public interface RoleDefinition extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Synonym</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synonym</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synonym</em>' attribute list.
	 * @see spem.SpemPackage#getRoleDefinition_Synonym()
	 * @model
	 * @generated
	 */
	EList<String> getSynonym();

	/**
	 * Returns the value of the '<em><b>Required Qualification</b></em>' reference list.
	 * The list contents are of type {@link spem.Qualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Qualification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Qualification</em>' reference list.
	 * @see spem.SpemPackage#getRoleDefinition_RequiredQualification()
	 * @model
	 * @generated
	 */
	EList<Qualification> getRequiredQualification();

} // RoleDefinition
