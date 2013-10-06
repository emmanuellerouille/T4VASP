/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.spem.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.spem.behavior.AC;
import org.kermeta.spem.behavior.Action;
import org.kermeta.spem.behavior.BehaviorPackage;
import org.kermeta.spem.behavior.Condition;
import org.kermeta.spem.behavior.Container;
import org.kermeta.spem.behavior.Expression;
import org.kermeta.spem.behavior.WorkUnitHandle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.spem.behavior.impl.ContainerImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.impl.ContainerImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.impl.ContainerImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.impl.ContainerImpl#getWorkUnitHandles <em>Work Unit Handles</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.impl.ContainerImpl#getACs <em>ACs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerImpl extends EObjectImpl implements Container {
	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expressions;

	/**
	 * The cached value of the '{@link #getWorkUnitHandles() <em>Work Unit Handles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkUnitHandles()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkUnitHandle> workUnitHandles;

	/**
	 * The cached value of the '{@link #getACs() <em>ACs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACs()
	 * @generated
	 * @ordered
	 */
	protected EList<AC> aCs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, BehaviorPackage.CONTAINER__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, BehaviorPackage.CONTAINER__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<Expression>(Expression.class, this, BehaviorPackage.CONTAINER__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkUnitHandle> getWorkUnitHandles() {
		if (workUnitHandles == null) {
			workUnitHandles = new EObjectContainmentEList<WorkUnitHandle>(WorkUnitHandle.class, this, BehaviorPackage.CONTAINER__WORK_UNIT_HANDLES);
		}
		return workUnitHandles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AC> getACs() {
		if (aCs == null) {
			aCs = new EObjectContainmentEList<AC>(AC.class, this, BehaviorPackage.CONTAINER__ACS);
		}
		return aCs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.CONTAINER__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.CONTAINER__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.CONTAINER__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.CONTAINER__WORK_UNIT_HANDLES:
				return ((InternalEList<?>)getWorkUnitHandles()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.CONTAINER__ACS:
				return ((InternalEList<?>)getACs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.CONTAINER__CONDITIONS:
				return getConditions();
			case BehaviorPackage.CONTAINER__ACTIONS:
				return getActions();
			case BehaviorPackage.CONTAINER__EXPRESSIONS:
				return getExpressions();
			case BehaviorPackage.CONTAINER__WORK_UNIT_HANDLES:
				return getWorkUnitHandles();
			case BehaviorPackage.CONTAINER__ACS:
				return getACs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorPackage.CONTAINER__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
				return;
			case BehaviorPackage.CONTAINER__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case BehaviorPackage.CONTAINER__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends Expression>)newValue);
				return;
			case BehaviorPackage.CONTAINER__WORK_UNIT_HANDLES:
				getWorkUnitHandles().clear();
				getWorkUnitHandles().addAll((Collection<? extends WorkUnitHandle>)newValue);
				return;
			case BehaviorPackage.CONTAINER__ACS:
				getACs().clear();
				getACs().addAll((Collection<? extends AC>)newValue);
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
			case BehaviorPackage.CONTAINER__CONDITIONS:
				getConditions().clear();
				return;
			case BehaviorPackage.CONTAINER__ACTIONS:
				getActions().clear();
				return;
			case BehaviorPackage.CONTAINER__EXPRESSIONS:
				getExpressions().clear();
				return;
			case BehaviorPackage.CONTAINER__WORK_UNIT_HANDLES:
				getWorkUnitHandles().clear();
				return;
			case BehaviorPackage.CONTAINER__ACS:
				getACs().clear();
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
			case BehaviorPackage.CONTAINER__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case BehaviorPackage.CONTAINER__ACTIONS:
				return actions != null && !actions.isEmpty();
			case BehaviorPackage.CONTAINER__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
			case BehaviorPackage.CONTAINER__WORK_UNIT_HANDLES:
				return workUnitHandles != null && !workUnitHandles.isEmpty();
			case BehaviorPackage.CONTAINER__ACS:
				return aCs != null && !aCs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
