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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.cvl.variability.Constraint;
import org.kermeta.cvl.variability.VConfiguration;
import org.kermeta.cvl.variability.VSpecToConfigMapping;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSpec To Config Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.VSpecToConfigMappingImpl#getThenConfiguration <em>Then Configuration</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.impl.VSpecToConfigMappingImpl#getIfConstraint <em>If Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VSpecToConfigMappingImpl extends EObjectImpl implements VSpecToConfigMapping {
	/**
	 * The cached value of the '{@link #getThenConfiguration() <em>Then Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenConfiguration()
	 * @generated
	 * @ordered
	 */
	protected VConfiguration thenConfiguration;

	/**
	 * The cached value of the '{@link #getIfConstraint() <em>If Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfConstraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint ifConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSpecToConfigMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.VSPEC_TO_CONFIG_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VConfiguration getThenConfiguration() {
		if (thenConfiguration != null && thenConfiguration.eIsProxy()) {
			InternalEObject oldThenConfiguration = (InternalEObject)thenConfiguration;
			thenConfiguration = (VConfiguration)eResolveProxy(oldThenConfiguration);
			if (thenConfiguration != oldThenConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION, oldThenConfiguration, thenConfiguration));
			}
		}
		return thenConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VConfiguration basicGetThenConfiguration() {
		return thenConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenConfiguration(VConfiguration newThenConfiguration) {
		VConfiguration oldThenConfiguration = thenConfiguration;
		thenConfiguration = newThenConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION, oldThenConfiguration, thenConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getIfConstraint() {
		return ifConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfConstraint(Constraint newIfConstraint, NotificationChain msgs) {
		Constraint oldIfConstraint = ifConstraint;
		ifConstraint = newIfConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT, oldIfConstraint, newIfConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfConstraint(Constraint newIfConstraint) {
		if (newIfConstraint != ifConstraint) {
			NotificationChain msgs = null;
			if (ifConstraint != null)
				msgs = ((InternalEObject)ifConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT, null, msgs);
			if (newIfConstraint != null)
				msgs = ((InternalEObject)newIfConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT, null, msgs);
			msgs = basicSetIfConstraint(newIfConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT, newIfConstraint, newIfConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT:
				return basicSetIfConstraint(null, msgs);
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
			case VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION:
				if (resolve) return getThenConfiguration();
				return basicGetThenConfiguration();
			case VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT:
				return getIfConstraint();
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
			case VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION:
				setThenConfiguration((VConfiguration)newValue);
				return;
			case VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT:
				setIfConstraint((Constraint)newValue);
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
			case VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION:
				setThenConfiguration((VConfiguration)null);
				return;
			case VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT:
				setIfConstraint((Constraint)null);
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
			case VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION:
				return thenConfiguration != null;
			case VariabilityPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT:
				return ifConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //VSpecToConfigMappingImpl
