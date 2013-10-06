/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.resolution.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.cvl.resolution.ResolutionPackage;
import org.kermeta.cvl.resolution.VPackageResolution;

import org.kermeta.cvl.variability.VPackageable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VPackage Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.resolution.impl.VPackageResolutionImpl#getPackagedElements <em>Packaged Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VPackageResolutionImpl extends EObjectImpl implements VPackageResolution {
	/**
	 * The cached value of the '{@link #getPackagedElements() <em>Packaged Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<VPackageable> packagedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VPackageResolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResolutionPackage.Literals.VPACKAGE_RESOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VPackageable> getPackagedElements() {
		if (packagedElements == null) {
			packagedElements = new EObjectContainmentEList<VPackageable>(VPackageable.class, this, ResolutionPackage.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS);
		}
		return packagedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResolutionPackage.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS:
				return ((InternalEList<?>)getPackagedElements()).basicRemove(otherEnd, msgs);
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
			case ResolutionPackage.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS:
				return getPackagedElements();
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
			case ResolutionPackage.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS:
				getPackagedElements().clear();
				getPackagedElements().addAll((Collection<? extends VPackageable>)newValue);
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
			case ResolutionPackage.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS:
				getPackagedElements().clear();
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
			case ResolutionPackage.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS:
				return packagedElements != null && !packagedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VPackageResolutionImpl
