/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.cvl.variability.CVSpec;
import org.kermeta.cvl.variability.VInterface;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CV Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.CVSpecImpl#getVInterface <em>VInterface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CVSpecImpl extends VSpecImpl implements CVSpec {
	/**
	 * The cached value of the '{@link #getVInterface() <em>VInterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVInterface()
	 * @generated
	 * @ordered
	 */
	protected VInterface vInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CVSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.CV_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VInterface getVInterface() {
		if (vInterface != null && vInterface.eIsProxy()) {
			InternalEObject oldVInterface = (InternalEObject)vInterface;
			vInterface = (VInterface)eResolveProxy(oldVInterface);
			if (vInterface != oldVInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.CV_SPEC__VINTERFACE, oldVInterface, vInterface));
			}
		}
		return vInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VInterface basicGetVInterface() {
		return vInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVInterface(VInterface newVInterface) {
		VInterface oldVInterface = vInterface;
		vInterface = newVInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CV_SPEC__VINTERFACE, oldVInterface, vInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariabilityPackage.CV_SPEC__VINTERFACE:
				if (resolve) return getVInterface();
				return basicGetVInterface();
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
			case VariabilityPackage.CV_SPEC__VINTERFACE:
				setVInterface((VInterface)newValue);
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
			case VariabilityPackage.CV_SPEC__VINTERFACE:
				setVInterface((VInterface)null);
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
			case VariabilityPackage.CV_SPEC__VINTERFACE:
				return vInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //CVSpecImpl
