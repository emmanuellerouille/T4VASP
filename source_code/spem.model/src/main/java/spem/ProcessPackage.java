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
 * A representation of the model object '<em><b>Process Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spem.ProcessPackage#getOwnedProcessMember <em>Owned Process Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see spem.SpemPackage#getProcessPackage()
 * @model
 * @generated
 */
public interface ProcessPackage extends ProcessPackageableElement, MethodPluginPackageableElement {
	/**
	 * Returns the value of the '<em><b>Owned Process Member</b></em>' containment reference list.
	 * The list contents are of type {@link spem.ProcessPackageableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Process Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Process Member</em>' containment reference list.
	 * @see spem.SpemPackage#getProcessPackage_OwnedProcessMember()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessPackageableElement> getOwnedProcessMember();

} // ProcessPackage
