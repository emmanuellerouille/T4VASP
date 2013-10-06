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
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spem.Category#getSubCategory <em>Sub Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see spem.SpemPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends MethodContentElement {
	/**
	 * Returns the value of the '<em><b>Sub Category</b></em>' reference list.
	 * The list contents are of type {@link spem.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Category</em>' reference list.
	 * @see spem.SpemPackage#getCategory_SubCategory()
	 * @model
	 * @generated
	 */
	EList<Category> getSubCategory();

} // Category
