/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.cvl.variability.Expression1;
import org.kermeta.cvl.variability.VariabilityPackage;
import org.kermeta.cvl.variability.VariableDerivation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.VariableDerivationImpl#getDerivingExpression <em>Deriving Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDerivationImpl extends VSpecDerivationImpl implements VariableDerivation {
	/**
	 * The cached value of the '{@link #getDerivingExpression() <em>Deriving Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivingExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression1 derivingExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.VARIABLE_DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression1 getDerivingExpression() {
		return derivingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivingExpression(Expression1 newDerivingExpression, NotificationChain msgs) {
		Expression1 oldDerivingExpression = derivingExpression;
		derivingExpression = newDerivingExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION, oldDerivingExpression, newDerivingExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivingExpression(Expression1 newDerivingExpression) {
		if (newDerivingExpression != derivingExpression) {
			NotificationChain msgs = null;
			if (derivingExpression != null)
				msgs = ((InternalEObject)derivingExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION, null, msgs);
			if (newDerivingExpression != null)
				msgs = ((InternalEObject)newDerivingExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION, null, msgs);
			msgs = basicSetDerivingExpression(newDerivingExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION, newDerivingExpression, newDerivingExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION:
				return basicSetDerivingExpression(null, msgs);
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
			case VariabilityPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION:
				return getDerivingExpression();
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
			case VariabilityPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION:
				setDerivingExpression((Expression1)newValue);
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
			case VariabilityPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION:
				setDerivingExpression((Expression1)null);
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
			case VariabilityPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION:
				return derivingExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableDerivationImpl
