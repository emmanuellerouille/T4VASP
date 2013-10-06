/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.spem.behavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Unit Handle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.spem.behavior.WorkUnitHandle#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.WorkUnitHandle#getWorkUnit <em>Work Unit</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.WorkUnitHandle#getOnStart <em>On Start</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.WorkUnitHandle#getOnDo <em>On Do</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.WorkUnitHandle#getOnEnd <em>On End</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.WorkUnitHandle#isManualInitialization <em>Manual Initialization</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.WorkUnitHandle#isManualFinalization <em>Manual Finalization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.spem.behavior.BehaviorPackage#getWorkUnitHandle()
 * @model
 * @generated
 */
public interface WorkUnitHandle extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.kermeta.spem.behavior.BehaviorPackage#getWorkUnitHandle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.kermeta.spem.behavior.WorkUnitHandle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Work Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Unit</em>' reference.
	 * @see #setWorkUnit(EObject)
	 * @see org.kermeta.spem.behavior.BehaviorPackage#getWorkUnitHandle_WorkUnit()
	 * @model required="true"
	 * @generated
	 */
	EObject getWorkUnit();

	/**
	 * Sets the value of the '{@link org.kermeta.spem.behavior.WorkUnitHandle#getWorkUnit <em>Work Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Unit</em>' reference.
	 * @see #getWorkUnit()
	 * @generated
	 */
	void setWorkUnit(EObject value);

	/**
	 * Returns the value of the '<em><b>On Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Start</em>' reference.
	 * @see #setOnStart(AC)
	 * @see org.kermeta.spem.behavior.BehaviorPackage#getWorkUnitHandle_OnStart()
	 * @model
	 * @generated
	 */
	AC getOnStart();

	/**
	 * Sets the value of the '{@link org.kermeta.spem.behavior.WorkUnitHandle#getOnStart <em>On Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Start</em>' reference.
	 * @see #getOnStart()
	 * @generated
	 */
	void setOnStart(AC value);

	/**
	 * Returns the value of the '<em><b>On Do</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Do</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Do</em>' reference.
	 * @see #setOnDo(AC)
	 * @see org.kermeta.spem.behavior.BehaviorPackage#getWorkUnitHandle_OnDo()
	 * @model
	 * @generated
	 */
	AC getOnDo();

	/**
	 * Sets the value of the '{@link org.kermeta.spem.behavior.WorkUnitHandle#getOnDo <em>On Do</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Do</em>' reference.
	 * @see #getOnDo()
	 * @generated
	 */
	void setOnDo(AC value);

	/**
	 * Returns the value of the '<em><b>On End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On End</em>' reference.
	 * @see #setOnEnd(AC)
	 * @see org.kermeta.spem.behavior.BehaviorPackage#getWorkUnitHandle_OnEnd()
	 * @model
	 * @generated
	 */
	AC getOnEnd();

	/**
	 * Sets the value of the '{@link org.kermeta.spem.behavior.WorkUnitHandle#getOnEnd <em>On End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On End</em>' reference.
	 * @see #getOnEnd()
	 * @generated
	 */
	void setOnEnd(AC value);

	/**
	 * Returns the value of the '<em><b>Manual Initialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual Initialization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Initialization</em>' attribute.
	 * @see #setManualInitialization(boolean)
	 * @see org.kermeta.spem.behavior.BehaviorPackage#getWorkUnitHandle_ManualInitialization()
	 * @model
	 * @generated
	 */
	boolean isManualInitialization();

	/**
	 * Sets the value of the '{@link org.kermeta.spem.behavior.WorkUnitHandle#isManualInitialization <em>Manual Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Initialization</em>' attribute.
	 * @see #isManualInitialization()
	 * @generated
	 */
	void setManualInitialization(boolean value);

	/**
	 * Returns the value of the '<em><b>Manual Finalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual Finalization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Finalization</em>' attribute.
	 * @see #setManualFinalization(boolean)
	 * @see org.kermeta.spem.behavior.BehaviorPackage#getWorkUnitHandle_ManualFinalization()
	 * @model
	 * @generated
	 */
	boolean isManualFinalization();

	/**
	 * Sets the value of the '{@link org.kermeta.spem.behavior.WorkUnitHandle#isManualFinalization <em>Manual Finalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Finalization</em>' attribute.
	 * @see #isManualFinalization()
	 * @generated
	 */
	void setManualFinalization(boolean value);

} // WorkUnitHandle
