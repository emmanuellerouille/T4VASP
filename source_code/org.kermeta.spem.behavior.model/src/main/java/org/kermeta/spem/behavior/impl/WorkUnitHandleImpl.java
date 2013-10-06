/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.spem.behavior.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.spem.behavior.AC;
import org.kermeta.spem.behavior.BehaviorPackage;
import org.kermeta.spem.behavior.WorkUnitHandle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Unit Handle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.spem.behavior.impl.WorkUnitHandleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.impl.WorkUnitHandleImpl#getWorkUnit <em>Work Unit</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.impl.WorkUnitHandleImpl#getOnStart <em>On Start</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.impl.WorkUnitHandleImpl#getOnDo <em>On Do</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.impl.WorkUnitHandleImpl#getOnEnd <em>On End</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.impl.WorkUnitHandleImpl#isManualInitialization <em>Manual Initialization</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.impl.WorkUnitHandleImpl#isManualFinalization <em>Manual Finalization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkUnitHandleImpl extends EObjectImpl implements WorkUnitHandle {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkUnit() <em>Work Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkUnit()
	 * @generated
	 * @ordered
	 */
	protected EObject workUnit;

	/**
	 * The cached value of the '{@link #getOnStart() <em>On Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnStart()
	 * @generated
	 * @ordered
	 */
	protected AC onStart;

	/**
	 * The cached value of the '{@link #getOnDo() <em>On Do</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDo()
	 * @generated
	 * @ordered
	 */
	protected AC onDo;

	/**
	 * The cached value of the '{@link #getOnEnd() <em>On End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnEnd()
	 * @generated
	 * @ordered
	 */
	protected AC onEnd;

	/**
	 * The default value of the '{@link #isManualInitialization() <em>Manual Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualInitialization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANUAL_INITIALIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManualInitialization() <em>Manual Initialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualInitialization()
	 * @generated
	 * @ordered
	 */
	protected boolean manualInitialization = MANUAL_INITIALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isManualFinalization() <em>Manual Finalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualFinalization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANUAL_FINALIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManualFinalization() <em>Manual Finalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualFinalization()
	 * @generated
	 * @ordered
	 */
	protected boolean manualFinalization = MANUAL_FINALIZATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkUnitHandleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.WORK_UNIT_HANDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.WORK_UNIT_HANDLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWorkUnit() {
		if (workUnit != null && workUnit.eIsProxy()) {
			InternalEObject oldWorkUnit = (InternalEObject)workUnit;
			workUnit = eResolveProxy(oldWorkUnit);
			if (workUnit != oldWorkUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.WORK_UNIT_HANDLE__WORK_UNIT, oldWorkUnit, workUnit));
			}
		}
		return workUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetWorkUnit() {
		return workUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkUnit(EObject newWorkUnit) {
		EObject oldWorkUnit = workUnit;
		workUnit = newWorkUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.WORK_UNIT_HANDLE__WORK_UNIT, oldWorkUnit, workUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AC getOnStart() {
		if (onStart != null && onStart.eIsProxy()) {
			InternalEObject oldOnStart = (InternalEObject)onStart;
			onStart = (AC)eResolveProxy(oldOnStart);
			if (onStart != oldOnStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.WORK_UNIT_HANDLE__ON_START, oldOnStart, onStart));
			}
		}
		return onStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AC basicGetOnStart() {
		return onStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnStart(AC newOnStart) {
		AC oldOnStart = onStart;
		onStart = newOnStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.WORK_UNIT_HANDLE__ON_START, oldOnStart, onStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AC getOnDo() {
		if (onDo != null && onDo.eIsProxy()) {
			InternalEObject oldOnDo = (InternalEObject)onDo;
			onDo = (AC)eResolveProxy(oldOnDo);
			if (onDo != oldOnDo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.WORK_UNIT_HANDLE__ON_DO, oldOnDo, onDo));
			}
		}
		return onDo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AC basicGetOnDo() {
		return onDo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDo(AC newOnDo) {
		AC oldOnDo = onDo;
		onDo = newOnDo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.WORK_UNIT_HANDLE__ON_DO, oldOnDo, onDo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AC getOnEnd() {
		if (onEnd != null && onEnd.eIsProxy()) {
			InternalEObject oldOnEnd = (InternalEObject)onEnd;
			onEnd = (AC)eResolveProxy(oldOnEnd);
			if (onEnd != oldOnEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.WORK_UNIT_HANDLE__ON_END, oldOnEnd, onEnd));
			}
		}
		return onEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AC basicGetOnEnd() {
		return onEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnEnd(AC newOnEnd) {
		AC oldOnEnd = onEnd;
		onEnd = newOnEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.WORK_UNIT_HANDLE__ON_END, oldOnEnd, onEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isManualInitialization() {
		return manualInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualInitialization(boolean newManualInitialization) {
		boolean oldManualInitialization = manualInitialization;
		manualInitialization = newManualInitialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.WORK_UNIT_HANDLE__MANUAL_INITIALIZATION, oldManualInitialization, manualInitialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isManualFinalization() {
		return manualFinalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualFinalization(boolean newManualFinalization) {
		boolean oldManualFinalization = manualFinalization;
		manualFinalization = newManualFinalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.WORK_UNIT_HANDLE__MANUAL_FINALIZATION, oldManualFinalization, manualFinalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.WORK_UNIT_HANDLE__NAME:
				return getName();
			case BehaviorPackage.WORK_UNIT_HANDLE__WORK_UNIT:
				if (resolve) return getWorkUnit();
				return basicGetWorkUnit();
			case BehaviorPackage.WORK_UNIT_HANDLE__ON_START:
				if (resolve) return getOnStart();
				return basicGetOnStart();
			case BehaviorPackage.WORK_UNIT_HANDLE__ON_DO:
				if (resolve) return getOnDo();
				return basicGetOnDo();
			case BehaviorPackage.WORK_UNIT_HANDLE__ON_END:
				if (resolve) return getOnEnd();
				return basicGetOnEnd();
			case BehaviorPackage.WORK_UNIT_HANDLE__MANUAL_INITIALIZATION:
				return isManualInitialization();
			case BehaviorPackage.WORK_UNIT_HANDLE__MANUAL_FINALIZATION:
				return isManualFinalization();
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
			case BehaviorPackage.WORK_UNIT_HANDLE__NAME:
				setName((String)newValue);
				return;
			case BehaviorPackage.WORK_UNIT_HANDLE__WORK_UNIT:
				setWorkUnit((EObject)newValue);
				return;
			case BehaviorPackage.WORK_UNIT_HANDLE__ON_START:
				setOnStart((AC)newValue);
				return;
			case BehaviorPackage.WORK_UNIT_HANDLE__ON_DO:
				setOnDo((AC)newValue);
				return;
			case BehaviorPackage.WORK_UNIT_HANDLE__ON_END:
				setOnEnd((AC)newValue);
				return;
			case BehaviorPackage.WORK_UNIT_HANDLE__MANUAL_INITIALIZATION:
				setManualInitialization((Boolean)newValue);
				return;
			case BehaviorPackage.WORK_UNIT_HANDLE__MANUAL_FINALIZATION:
				setManualFinalization((Boolean)newValue);
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
			case BehaviorPackage.WORK_UNIT_HANDLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BehaviorPackage.WORK_UNIT_HANDLE__WORK_UNIT:
				setWorkUnit((EObject)null);
				return;
			case BehaviorPackage.WORK_UNIT_HANDLE__ON_START:
				setOnStart((AC)null);
				return;
			case BehaviorPackage.WORK_UNIT_HANDLE__ON_DO:
				setOnDo((AC)null);
				return;
			case BehaviorPackage.WORK_UNIT_HANDLE__ON_END:
				setOnEnd((AC)null);
				return;
			case BehaviorPackage.WORK_UNIT_HANDLE__MANUAL_INITIALIZATION:
				setManualInitialization(MANUAL_INITIALIZATION_EDEFAULT);
				return;
			case BehaviorPackage.WORK_UNIT_HANDLE__MANUAL_FINALIZATION:
				setManualFinalization(MANUAL_FINALIZATION_EDEFAULT);
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
			case BehaviorPackage.WORK_UNIT_HANDLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BehaviorPackage.WORK_UNIT_HANDLE__WORK_UNIT:
				return workUnit != null;
			case BehaviorPackage.WORK_UNIT_HANDLE__ON_START:
				return onStart != null;
			case BehaviorPackage.WORK_UNIT_HANDLE__ON_DO:
				return onDo != null;
			case BehaviorPackage.WORK_UNIT_HANDLE__ON_END:
				return onEnd != null;
			case BehaviorPackage.WORK_UNIT_HANDLE__MANUAL_INITIALIZATION:
				return manualInitialization != MANUAL_INITIALIZATION_EDEFAULT;
			case BehaviorPackage.WORK_UNIT_HANDLE__MANUAL_FINALIZATION:
				return manualFinalization != MANUAL_FINALIZATION_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", manualInitialization: ");
		result.append(manualInitialization);
		result.append(", manualFinalization: ");
		result.append(manualFinalization);
		result.append(')');
		return result.toString();
	}

} //WorkUnitHandleImpl
