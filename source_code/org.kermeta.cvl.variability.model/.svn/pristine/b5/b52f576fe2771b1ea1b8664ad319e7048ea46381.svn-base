/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.cvl.variability.VSpec;
import org.kermeta.cvl.variability.VSpecResolution;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSpec Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.VSpecResolutionImpl#getResolvedVSpec <em>Resolved VSpec</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.impl.VSpecResolutionImpl#getChildResolution <em>Child Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VSpecResolutionImpl extends VPackageableImpl implements VSpecResolution {
	/**
	 * The cached value of the '{@link #getResolvedVSpec() <em>Resolved VSpec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedVSpec()
	 * @generated
	 * @ordered
	 */
	protected VSpec resolvedVSpec;

	/**
	 * The cached value of the '{@link #getChildResolution() <em>Child Resolution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildResolution()
	 * @generated
	 * @ordered
	 */
	protected EList<VSpecResolution> childResolution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSpecResolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.VSPEC_RESOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSpec getResolvedVSpec() {
		if (resolvedVSpec != null && resolvedVSpec.eIsProxy()) {
			InternalEObject oldResolvedVSpec = (InternalEObject)resolvedVSpec;
			resolvedVSpec = (VSpec)eResolveProxy(oldResolvedVSpec);
			if (resolvedVSpec != oldResolvedVSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.VSPEC_RESOLUTION__RESOLVED_VSPEC, oldResolvedVSpec, resolvedVSpec));
			}
		}
		return resolvedVSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSpec basicGetResolvedVSpec() {
		return resolvedVSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedVSpec(VSpec newResolvedVSpec) {
		VSpec oldResolvedVSpec = resolvedVSpec;
		resolvedVSpec = newResolvedVSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VSPEC_RESOLUTION__RESOLVED_VSPEC, oldResolvedVSpec, resolvedVSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSpecResolution> getChildResolution() {
		if (childResolution == null) {
			childResolution = new EObjectContainmentEList<VSpecResolution>(VSpecResolution.class, this, VariabilityPackage.VSPEC_RESOLUTION__CHILD_RESOLUTION);
		}
		return childResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.VSPEC_RESOLUTION__CHILD_RESOLUTION:
				return ((InternalEList<?>)getChildResolution()).basicRemove(otherEnd, msgs);
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
			case VariabilityPackage.VSPEC_RESOLUTION__RESOLVED_VSPEC:
				if (resolve) return getResolvedVSpec();
				return basicGetResolvedVSpec();
			case VariabilityPackage.VSPEC_RESOLUTION__CHILD_RESOLUTION:
				return getChildResolution();
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
			case VariabilityPackage.VSPEC_RESOLUTION__RESOLVED_VSPEC:
				setResolvedVSpec((VSpec)newValue);
				return;
			case VariabilityPackage.VSPEC_RESOLUTION__CHILD_RESOLUTION:
				getChildResolution().clear();
				getChildResolution().addAll((Collection<? extends VSpecResolution>)newValue);
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
			case VariabilityPackage.VSPEC_RESOLUTION__RESOLVED_VSPEC:
				setResolvedVSpec((VSpec)null);
				return;
			case VariabilityPackage.VSPEC_RESOLUTION__CHILD_RESOLUTION:
				getChildResolution().clear();
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
			case VariabilityPackage.VSPEC_RESOLUTION__RESOLVED_VSPEC:
				return resolvedVSpec != null;
			case VariabilityPackage.VSPEC_RESOLUTION__CHILD_RESOLUTION:
				return childResolution != null && !childResolution.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VSpecResolutionImpl
