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
 * A representation of the model object '<em><b>Guidance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spem.Guidance#getAttachment <em>Attachment</em>}</li>
 * </ul>
 * </p>
 *
 * @see spem.SpemPackage#getGuidance()
 * @model
 * @generated
 */
public interface Guidance extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment</em>' attribute list.
	 * @see spem.SpemPackage#getGuidance_Attachment()
	 * @model
	 * @generated
	 */
	EList<String> getAttachment();

} // Guidance
