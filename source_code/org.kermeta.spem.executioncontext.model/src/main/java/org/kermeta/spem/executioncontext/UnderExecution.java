/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.spem.executioncontext;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Under Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.spem.executioncontext.UnderExecution#getWorkUnitHandleName <em>Work Unit Handle Name</em>}</li>
 *   <li>{@link org.kermeta.spem.executioncontext.UnderExecution#getOnWhat <em>On What</em>}</li>
 *   <li>{@link org.kermeta.spem.executioncontext.UnderExecution#getPrimitiveACName <em>Primitive AC Name</em>}</li>
 *   <li>{@link org.kermeta.spem.executioncontext.UnderExecution#getWorkUnitName <em>Work Unit Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.spem.executioncontext.ExecutioncontextPackage#getUnderExecution()
 * @model
 * @generated
 */
public interface UnderExecution extends EObject {
	/**
	 * Returns the value of the '<em><b>Work Unit Handle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Unit Handle Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Unit Handle Name</em>' attribute.
	 * @see #setWorkUnitHandleName(String)
	 * @see org.kermeta.spem.executioncontext.ExecutioncontextPackage#getUnderExecution_WorkUnitHandleName()
	 * @model
	 * @generated
	 */
	String getWorkUnitHandleName();

	/**
	 * Sets the value of the '{@link org.kermeta.spem.executioncontext.UnderExecution#getWorkUnitHandleName <em>Work Unit Handle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Unit Handle Name</em>' attribute.
	 * @see #getWorkUnitHandleName()
	 * @generated
	 */
	void setWorkUnitHandleName(String value);

	/**
	 * Returns the value of the '<em><b>On What</b></em>' attribute.
	 * The literals are from the enumeration {@link org.kermeta.spem.executioncontext.OnWhat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On What</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On What</em>' attribute.
	 * @see org.kermeta.spem.executioncontext.OnWhat
	 * @see #setOnWhat(OnWhat)
	 * @see org.kermeta.spem.executioncontext.ExecutioncontextPackage#getUnderExecution_OnWhat()
	 * @model
	 * @generated
	 */
	OnWhat getOnWhat();

	/**
	 * Sets the value of the '{@link org.kermeta.spem.executioncontext.UnderExecution#getOnWhat <em>On What</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On What</em>' attribute.
	 * @see org.kermeta.spem.executioncontext.OnWhat
	 * @see #getOnWhat()
	 * @generated
	 */
	void setOnWhat(OnWhat value);

	/**
	 * Returns the value of the '<em><b>Primitive AC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive AC Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive AC Name</em>' attribute.
	 * @see #setPrimitiveACName(String)
	 * @see org.kermeta.spem.executioncontext.ExecutioncontextPackage#getUnderExecution_PrimitiveACName()
	 * @model
	 * @generated
	 */
	String getPrimitiveACName();

	/**
	 * Sets the value of the '{@link org.kermeta.spem.executioncontext.UnderExecution#getPrimitiveACName <em>Primitive AC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive AC Name</em>' attribute.
	 * @see #getPrimitiveACName()
	 * @generated
	 */
	void setPrimitiveACName(String value);

	/**
	 * Returns the value of the '<em><b>Work Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Unit Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Unit Name</em>' attribute.
	 * @see #setWorkUnitName(String)
	 * @see org.kermeta.spem.executioncontext.ExecutioncontextPackage#getUnderExecution_WorkUnitName()
	 * @model
	 * @generated
	 */
	String getWorkUnitName();

	/**
	 * Sets the value of the '{@link org.kermeta.spem.executioncontext.UnderExecution#getWorkUnitName <em>Work Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Unit Name</em>' attribute.
	 * @see #getWorkUnitName()
	 * @generated
	 */
	void setWorkUnitName(String value);

} // UnderExecution
