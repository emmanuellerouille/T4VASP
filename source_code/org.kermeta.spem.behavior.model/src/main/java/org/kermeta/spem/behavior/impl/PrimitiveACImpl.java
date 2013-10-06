/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.spem.behavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.kermeta.spem.behavior.Action;
import org.kermeta.spem.behavior.BehaviorPackage;
import org.kermeta.spem.behavior.PostCondition;
import org.kermeta.spem.behavior.PreCondition;
import org.kermeta.spem.behavior.PrimitiveAC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive AC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.spem.behavior.impl.PrimitiveACImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.impl.PrimitiveACImpl#getPostConditions <em>Post Conditions</em>}</li>
 *   <li>{@link org.kermeta.spem.behavior.impl.PrimitiveACImpl#getPreConditions <em>Pre Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveACImpl extends ACImpl implements PrimitiveAC {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The cached value of the '{@link #getPostConditions() <em>Post Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<PostCondition> postConditions;

	/**
	 * The cached value of the '{@link #getPreConditions() <em>Pre Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<PreCondition> preConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveACImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.PRIMITIVE_AC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Action)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.PRIMITIVE_AC__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.PRIMITIVE_AC__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PostCondition> getPostConditions() {
		if (postConditions == null) {
			postConditions = new EObjectResolvingEList<PostCondition>(PostCondition.class, this, BehaviorPackage.PRIMITIVE_AC__POST_CONDITIONS);
		}
		return postConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreCondition> getPreConditions() {
		if (preConditions == null) {
			preConditions = new EObjectResolvingEList<PreCondition>(PreCondition.class, this, BehaviorPackage.PRIMITIVE_AC__PRE_CONDITIONS);
		}
		return preConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.PRIMITIVE_AC__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case BehaviorPackage.PRIMITIVE_AC__POST_CONDITIONS:
				return getPostConditions();
			case BehaviorPackage.PRIMITIVE_AC__PRE_CONDITIONS:
				return getPreConditions();
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
			case BehaviorPackage.PRIMITIVE_AC__ACTION:
				setAction((Action)newValue);
				return;
			case BehaviorPackage.PRIMITIVE_AC__POST_CONDITIONS:
				getPostConditions().clear();
				getPostConditions().addAll((Collection<? extends PostCondition>)newValue);
				return;
			case BehaviorPackage.PRIMITIVE_AC__PRE_CONDITIONS:
				getPreConditions().clear();
				getPreConditions().addAll((Collection<? extends PreCondition>)newValue);
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
			case BehaviorPackage.PRIMITIVE_AC__ACTION:
				setAction((Action)null);
				return;
			case BehaviorPackage.PRIMITIVE_AC__POST_CONDITIONS:
				getPostConditions().clear();
				return;
			case BehaviorPackage.PRIMITIVE_AC__PRE_CONDITIONS:
				getPreConditions().clear();
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
			case BehaviorPackage.PRIMITIVE_AC__ACTION:
				return action != null;
			case BehaviorPackage.PRIMITIVE_AC__POST_CONDITIONS:
				return postConditions != null && !postConditions.isEmpty();
			case BehaviorPackage.PRIMITIVE_AC__PRE_CONDITIONS:
				return preConditions != null && !preConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PrimitiveACImpl
