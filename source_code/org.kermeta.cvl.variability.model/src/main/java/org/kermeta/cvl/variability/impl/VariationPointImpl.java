/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.kermeta.cvl.variability.VSpec;
import org.kermeta.cvl.variability.VariabilityPackage;
import org.kermeta.cvl.variability.VariationPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variation Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.VariationPointImpl#getBindingVspec <em>Binding Vspec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VariationPointImpl extends VPackageableImpl implements VariationPoint {
	/**
	 * The cached value of the '{@link #getBindingVspec() <em>Binding Vspec</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingVspec()
	 * @generated
	 * @ordered
	 */
	protected EList<VSpec> bindingVspec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariationPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.VARIATION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSpec> getBindingVspec() {
		if (bindingVspec == null) {
			bindingVspec = new EObjectResolvingEList<VSpec>(VSpec.class, this, VariabilityPackage.VARIATION_POINT__BINDING_VSPEC);
		}
		return bindingVspec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariabilityPackage.VARIATION_POINT__BINDING_VSPEC:
				return getBindingVspec();
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
			case VariabilityPackage.VARIATION_POINT__BINDING_VSPEC:
				getBindingVspec().clear();
				getBindingVspec().addAll((Collection<? extends VSpec>)newValue);
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
			case VariabilityPackage.VARIATION_POINT__BINDING_VSPEC:
				getBindingVspec().clear();
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
			case VariabilityPackage.VARIATION_POINT__BINDING_VSPEC:
				return bindingVspec != null && !bindingVspec.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariationPointImpl
