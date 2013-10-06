/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.spem.executioncontext.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.spem.executioncontext.ExecutioncontextPackage;
import org.kermeta.spem.executioncontext.OnWhat;
import org.kermeta.spem.executioncontext.UnderExecution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Under Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.spem.executioncontext.impl.UnderExecutionImpl#getWorkUnitHandleName <em>Work Unit Handle Name</em>}</li>
 *   <li>{@link org.kermeta.spem.executioncontext.impl.UnderExecutionImpl#getOnWhat <em>On What</em>}</li>
 *   <li>{@link org.kermeta.spem.executioncontext.impl.UnderExecutionImpl#getPrimitiveACName <em>Primitive AC Name</em>}</li>
 *   <li>{@link org.kermeta.spem.executioncontext.impl.UnderExecutionImpl#getWorkUnitName <em>Work Unit Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnderExecutionImpl extends EObjectImpl implements UnderExecution {
	/**
	 * The default value of the '{@link #getWorkUnitHandleName() <em>Work Unit Handle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkUnitHandleName()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_UNIT_HANDLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkUnitHandleName() <em>Work Unit Handle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkUnitHandleName()
	 * @generated
	 * @ordered
	 */
	protected String workUnitHandleName = WORK_UNIT_HANDLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnWhat() <em>On What</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnWhat()
	 * @generated
	 * @ordered
	 */
	protected static final OnWhat ON_WHAT_EDEFAULT = OnWhat.ON_START;

	/**
	 * The cached value of the '{@link #getOnWhat() <em>On What</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnWhat()
	 * @generated
	 * @ordered
	 */
	protected OnWhat onWhat = ON_WHAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimitiveACName() <em>Primitive AC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveACName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMITIVE_AC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimitiveACName() <em>Primitive AC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveACName()
	 * @generated
	 * @ordered
	 */
	protected String primitiveACName = PRIMITIVE_AC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkUnitName() <em>Work Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkUnitName()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_UNIT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkUnitName() <em>Work Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkUnitName()
	 * @generated
	 * @ordered
	 */
	protected String workUnitName = WORK_UNIT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnderExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutioncontextPackage.Literals.UNDER_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkUnitHandleName() {
		return workUnitHandleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkUnitHandleName(String newWorkUnitHandleName) {
		String oldWorkUnitHandleName = workUnitHandleName;
		workUnitHandleName = newWorkUnitHandleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutioncontextPackage.UNDER_EXECUTION__WORK_UNIT_HANDLE_NAME, oldWorkUnitHandleName, workUnitHandleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnWhat getOnWhat() {
		return onWhat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnWhat(OnWhat newOnWhat) {
		OnWhat oldOnWhat = onWhat;
		onWhat = newOnWhat == null ? ON_WHAT_EDEFAULT : newOnWhat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutioncontextPackage.UNDER_EXECUTION__ON_WHAT, oldOnWhat, onWhat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimitiveACName() {
		return primitiveACName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveACName(String newPrimitiveACName) {
		String oldPrimitiveACName = primitiveACName;
		primitiveACName = newPrimitiveACName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutioncontextPackage.UNDER_EXECUTION__PRIMITIVE_AC_NAME, oldPrimitiveACName, primitiveACName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkUnitName() {
		return workUnitName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkUnitName(String newWorkUnitName) {
		String oldWorkUnitName = workUnitName;
		workUnitName = newWorkUnitName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutioncontextPackage.UNDER_EXECUTION__WORK_UNIT_NAME, oldWorkUnitName, workUnitName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutioncontextPackage.UNDER_EXECUTION__WORK_UNIT_HANDLE_NAME:
				return getWorkUnitHandleName();
			case ExecutioncontextPackage.UNDER_EXECUTION__ON_WHAT:
				return getOnWhat();
			case ExecutioncontextPackage.UNDER_EXECUTION__PRIMITIVE_AC_NAME:
				return getPrimitiveACName();
			case ExecutioncontextPackage.UNDER_EXECUTION__WORK_UNIT_NAME:
				return getWorkUnitName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExecutioncontextPackage.UNDER_EXECUTION__WORK_UNIT_HANDLE_NAME:
				setWorkUnitHandleName((String)newValue);
				return;
			case ExecutioncontextPackage.UNDER_EXECUTION__ON_WHAT:
				setOnWhat((OnWhat)newValue);
				return;
			case ExecutioncontextPackage.UNDER_EXECUTION__PRIMITIVE_AC_NAME:
				setPrimitiveACName((String)newValue);
				return;
			case ExecutioncontextPackage.UNDER_EXECUTION__WORK_UNIT_NAME:
				setWorkUnitName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExecutioncontextPackage.UNDER_EXECUTION__WORK_UNIT_HANDLE_NAME:
				setWorkUnitHandleName(WORK_UNIT_HANDLE_NAME_EDEFAULT);
				return;
			case ExecutioncontextPackage.UNDER_EXECUTION__ON_WHAT:
				setOnWhat(ON_WHAT_EDEFAULT);
				return;
			case ExecutioncontextPackage.UNDER_EXECUTION__PRIMITIVE_AC_NAME:
				setPrimitiveACName(PRIMITIVE_AC_NAME_EDEFAULT);
				return;
			case ExecutioncontextPackage.UNDER_EXECUTION__WORK_UNIT_NAME:
				setWorkUnitName(WORK_UNIT_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExecutioncontextPackage.UNDER_EXECUTION__WORK_UNIT_HANDLE_NAME:
				return WORK_UNIT_HANDLE_NAME_EDEFAULT == null ? workUnitHandleName != null : !WORK_UNIT_HANDLE_NAME_EDEFAULT.equals(workUnitHandleName);
			case ExecutioncontextPackage.UNDER_EXECUTION__ON_WHAT:
				return onWhat != ON_WHAT_EDEFAULT;
			case ExecutioncontextPackage.UNDER_EXECUTION__PRIMITIVE_AC_NAME:
				return PRIMITIVE_AC_NAME_EDEFAULT == null ? primitiveACName != null : !PRIMITIVE_AC_NAME_EDEFAULT.equals(primitiveACName);
			case ExecutioncontextPackage.UNDER_EXECUTION__WORK_UNIT_NAME:
				return WORK_UNIT_NAME_EDEFAULT == null ? workUnitName != null : !WORK_UNIT_NAME_EDEFAULT.equals(workUnitName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (workUnitHandleName: ");
		result.append(workUnitHandleName);
		result.append(", onWhat: ");
		result.append(onWhat);
		result.append(", primitiveACName: ");
		result.append(primitiveACName);
		result.append(", workUnitName: ");
		result.append(workUnitName);
		result.append(')');
		return result.toString();
	}

} //UnderExecutionImpl
