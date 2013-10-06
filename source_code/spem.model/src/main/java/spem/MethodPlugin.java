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
 * A representation of the model object '<em><b>Method Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spem.MethodPlugin#isUserChangeable <em>User Changeable</em>}</li>
 *   <li>{@link spem.MethodPlugin#getSupporting <em>Supporting</em>}</li>
 *   <li>{@link spem.MethodPlugin#getOwnedMethodContentPackage <em>Owned Method Content Package</em>}</li>
 *   <li>{@link spem.MethodPlugin#getOwnedProcessPackage <em>Owned Process Package</em>}</li>
 *   <li>{@link spem.MethodPlugin#getBasePlugin <em>Base Plugin</em>}</li>
 *   <li>{@link spem.MethodPlugin#getReferencedMethodPlugin <em>Referenced Method Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @see spem.SpemPackage#getMethodPlugin()
 * @model
 * @generated
 */
public interface MethodPlugin extends MethodLibraryPackageableElement {
	/**
	 * Returns the value of the '<em><b>User Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Changeable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Changeable</em>' attribute.
	 * @see #setUserChangeable(boolean)
	 * @see spem.SpemPackage#getMethodPlugin_UserChangeable()
	 * @model
	 * @generated
	 */
	boolean isUserChangeable();

	/**
	 * Sets the value of the '{@link spem.MethodPlugin#isUserChangeable <em>User Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Changeable</em>' attribute.
	 * @see #isUserChangeable()
	 * @generated
	 */
	void setUserChangeable(boolean value);

	/**
	 * Returns the value of the '<em><b>Supporting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting</em>' attribute.
	 * @see #setSupporting(Boolean)
	 * @see spem.SpemPackage#getMethodPlugin_Supporting()
	 * @model
	 * @generated
	 */
	Boolean getSupporting();

	/**
	 * Sets the value of the '{@link spem.MethodPlugin#getSupporting <em>Supporting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporting</em>' attribute.
	 * @see #getSupporting()
	 * @generated
	 */
	void setSupporting(Boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Method Content Package</b></em>' containment reference list.
	 * The list contents are of type {@link spem.MethodContentPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Method Content Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Method Content Package</em>' containment reference list.
	 * @see spem.SpemPackage#getMethodPlugin_OwnedMethodContentPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodContentPackage> getOwnedMethodContentPackage();

	/**
	 * Returns the value of the '<em><b>Owned Process Package</b></em>' containment reference list.
	 * The list contents are of type {@link spem.ProcessPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Process Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Process Package</em>' containment reference list.
	 * @see spem.SpemPackage#getMethodPlugin_OwnedProcessPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessPackage> getOwnedProcessPackage();

	/**
	 * Returns the value of the '<em><b>Base Plugin</b></em>' reference list.
	 * The list contents are of type {@link spem.MethodPlugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Plugin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Plugin</em>' reference list.
	 * @see spem.SpemPackage#getMethodPlugin_BasePlugin()
	 * @model
	 * @generated
	 */
	EList<MethodPlugin> getBasePlugin();

	/**
	 * Returns the value of the '<em><b>Referenced Method Plugin</b></em>' reference list.
	 * The list contents are of type {@link spem.MethodPlugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Method Plugin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Method Plugin</em>' reference list.
	 * @see spem.SpemPackage#getMethodPlugin_ReferencedMethodPlugin()
	 * @model
	 * @generated
	 */
	EList<MethodPlugin> getReferencedMethodPlugin();

} // MethodPlugin
