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

import org.kermeta.cvl.variability.ChoiceDerivation;
import org.kermeta.cvl.variability.Constraint;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.ChoiceDerivationImpl#getDerivingConstraint <em>Deriving Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceDerivationImpl extends VSpecDerivationImpl implements ChoiceDerivation {
	/**
	 * The cached value of the '{@link #getDerivingConstraint() <em>Deriving Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivingConstraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint derivingConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceDerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.CHOICE_DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getDerivingConstraint() {
		return derivingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivingConstraint(Constraint newDerivingConstraint, NotificationChain msgs) {
		Constraint oldDerivingConstraint = derivingConstraint;
		derivingConstraint = newDerivingConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityPackage.CHOICE_DERIVATION__DERIVING_CONSTRAINT, oldDerivingConstraint, newDerivingConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivingConstraint(Constraint newDerivingConstraint) {
		if (newDerivingConstraint != derivingConstraint) {
			NotificationChain msgs = null;
			if (derivingConstraint != null)
				msgs = ((InternalEObject)derivingConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.CHOICE_DERIVATION__DERIVING_CONSTRAINT, null, msgs);
			if (newDerivingConstraint != null)
				msgs = ((InternalEObject)newDerivingConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.CHOICE_DERIVATION__DERIVING_CONSTRAINT, null, msgs);
			msgs = basicSetDerivingConstraint(newDerivingConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CHOICE_DERIVATION__DERIVING_CONSTRAINT, newDerivingConstraint, newDerivingConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.CHOICE_DERIVATION__DERIVING_CONSTRAINT:
				return basicSetDerivingConstraint(null, msgs);
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
			case VariabilityPackage.CHOICE_DERIVATION__DERIVING_CONSTRAINT:
				return getDerivingConstraint();
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
			case VariabilityPackage.CHOICE_DERIVATION__DERIVING_CONSTRAINT:
				setDerivingConstraint((Constraint)newValue);
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
			case VariabilityPackage.CHOICE_DERIVATION__DERIVING_CONSTRAINT:
				setDerivingConstraint((Constraint)null);
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
			case VariabilityPackage.CHOICE_DERIVATION__DERIVING_CONSTRAINT:
				return derivingConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //ChoiceDerivationImpl
