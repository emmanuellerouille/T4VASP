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
 * A representation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spem.Milestone#getRequiredResult <em>Required Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see spem.SpemPackage#getMilestone()
 * @model
 * @generated
 */
public interface Milestone extends WorkBreakdownElement {
	/**
	 * Returns the value of the '<em><b>Required Result</b></em>' reference list.
	 * The list contents are of type {@link spem.WorkProductUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Result</em>' reference list.
	 * @see spem.SpemPackage#getMilestone_RequiredResult()
	 * @model
	 * @generated
	 */
	EList<WorkProductUse> getRequiredResult();

} // Milestone
