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

import org.kermeta.cvl.variability.CVSpec;
import org.kermeta.cvl.variability.VConfiguration;
import org.kermeta.cvl.variability.VSpecResolution;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VConfiguration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.VConfigurationImpl#getVSpecResolution <em>VSpec Resolution</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.impl.VConfigurationImpl#isIsPartial <em>Is Partial</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.impl.VConfigurationImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.impl.VConfigurationImpl#getResolvedVIRef <em>Resolved VI Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VConfigurationImpl extends VSpecResolutionImpl implements VConfiguration {
	/**
	 * The cached value of the '{@link #getVSpecResolution() <em>VSpec Resolution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSpecResolution()
	 * @generated
	 * @ordered
	 */
	protected EList<VSpecResolution> vSpecResolution;

	/**
	 * The default value of the '{@link #isIsPartial() <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PARTIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPartial() <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartial()
	 * @generated
	 * @ordered
	 */
	protected boolean isPartial = IS_PARTIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected VConfiguration super_;

	/**
	 * The cached value of the '{@link #getResolvedVIRef() <em>Resolved VI Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedVIRef()
	 * @generated
	 * @ordered
	 */
	protected CVSpec resolvedVIRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.VCONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSpecResolution> getVSpecResolution() {
		if (vSpecResolution == null) {
			vSpecResolution = new EObjectContainmentEList<VSpecResolution>(VSpecResolution.class, this, VariabilityPackage.VCONFIGURATION__VSPEC_RESOLUTION);
		}
		return vSpecResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPartial() {
		return isPartial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPartial(boolean newIsPartial) {
		boolean oldIsPartial = isPartial;
		isPartial = newIsPartial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VCONFIGURATION__IS_PARTIAL, oldIsPartial, isPartial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VConfiguration getSuper() {
		if (super_ != null && super_.eIsProxy()) {
			InternalEObject oldSuper = (InternalEObject)super_;
			super_ = (VConfiguration)eResolveProxy(oldSuper);
			if (super_ != oldSuper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.VCONFIGURATION__SUPER, oldSuper, super_));
			}
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VConfiguration basicGetSuper() {
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(VConfiguration newSuper) {
		VConfiguration oldSuper = super_;
		super_ = newSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VCONFIGURATION__SUPER, oldSuper, super_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVSpec getResolvedVIRef() {
		if (resolvedVIRef != null && resolvedVIRef.eIsProxy()) {
			InternalEObject oldResolvedVIRef = (InternalEObject)resolvedVIRef;
			resolvedVIRef = (CVSpec)eResolveProxy(oldResolvedVIRef);
			if (resolvedVIRef != oldResolvedVIRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.VCONFIGURATION__RESOLVED_VI_REF, oldResolvedVIRef, resolvedVIRef));
			}
		}
		return resolvedVIRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVSpec basicGetResolvedVIRef() {
		return resolvedVIRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedVIRef(CVSpec newResolvedVIRef) {
		CVSpec oldResolvedVIRef = resolvedVIRef;
		resolvedVIRef = newResolvedVIRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.VCONFIGURATION__RESOLVED_VI_REF, oldResolvedVIRef, resolvedVIRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.VCONFIGURATION__VSPEC_RESOLUTION:
				return ((InternalEList<?>)getVSpecResolution()).basicRemove(otherEnd, msgs);
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
			case VariabilityPackage.VCONFIGURATION__VSPEC_RESOLUTION:
				return getVSpecResolution();
			case VariabilityPackage.VCONFIGURATION__IS_PARTIAL:
				return isIsPartial();
			case VariabilityPackage.VCONFIGURATION__SUPER:
				if (resolve) return getSuper();
				return basicGetSuper();
			case VariabilityPackage.VCONFIGURATION__RESOLVED_VI_REF:
				if (resolve) return getResolvedVIRef();
				return basicGetResolvedVIRef();
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
			case VariabilityPackage.VCONFIGURATION__VSPEC_RESOLUTION:
				getVSpecResolution().clear();
				getVSpecResolution().addAll((Collection<? extends VSpecResolution>)newValue);
				return;
			case VariabilityPackage.VCONFIGURATION__IS_PARTIAL:
				setIsPartial((Boolean)newValue);
				return;
			case VariabilityPackage.VCONFIGURATION__SUPER:
				setSuper((VConfiguration)newValue);
				return;
			case VariabilityPackage.VCONFIGURATION__RESOLVED_VI_REF:
				setResolvedVIRef((CVSpec)newValue);
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
			case VariabilityPackage.VCONFIGURATION__VSPEC_RESOLUTION:
				getVSpecResolution().clear();
				return;
			case VariabilityPackage.VCONFIGURATION__IS_PARTIAL:
				setIsPartial(IS_PARTIAL_EDEFAULT);
				return;
			case VariabilityPackage.VCONFIGURATION__SUPER:
				setSuper((VConfiguration)null);
				return;
			case VariabilityPackage.VCONFIGURATION__RESOLVED_VI_REF:
				setResolvedVIRef((CVSpec)null);
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
			case VariabilityPackage.VCONFIGURATION__VSPEC_RESOLUTION:
				return vSpecResolution != null && !vSpecResolution.isEmpty();
			case VariabilityPackage.VCONFIGURATION__IS_PARTIAL:
				return isPartial != IS_PARTIAL_EDEFAULT;
			case VariabilityPackage.VCONFIGURATION__SUPER:
				return super_ != null;
			case VariabilityPackage.VCONFIGURATION__RESOLVED_VI_REF:
				return resolvedVIRef != null;
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
		result.append(" (isPartial: ");
		result.append(isPartial);
		result.append(')');
		return result.toString();
	}

} //VConfigurationImpl
