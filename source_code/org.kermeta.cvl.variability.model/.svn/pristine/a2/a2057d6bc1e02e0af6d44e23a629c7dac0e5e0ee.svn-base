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

import org.kermeta.cvl.variability.Choice;
import org.kermeta.cvl.variability.ChoiceVariationPoint;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Variation Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.ChoiceVariationPointImpl#getBindingChoice <em>Binding Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceVariationPointImpl extends VariationPointImpl implements ChoiceVariationPoint {
	/**
	 * The cached value of the '{@link #getBindingChoice() <em>Binding Choice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingChoice()
	 * @generated
	 * @ordered
	 */
	protected EList<Choice> bindingChoice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceVariationPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.CHOICE_VARIATION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choice> getBindingChoice() {
		if (bindingChoice == null) {
			bindingChoice = new EObjectResolvingEList<Choice>(Choice.class, this, VariabilityPackage.CHOICE_VARIATION_POINT__BINDING_CHOICE);
		}
		return bindingChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariabilityPackage.CHOICE_VARIATION_POINT__BINDING_CHOICE:
				return getBindingChoice();
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
			case VariabilityPackage.CHOICE_VARIATION_POINT__BINDING_CHOICE:
				getBindingChoice().clear();
				getBindingChoice().addAll((Collection<? extends Choice>)newValue);
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
			case VariabilityPackage.CHOICE_VARIATION_POINT__BINDING_CHOICE:
				getBindingChoice().clear();
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
			case VariabilityPackage.CHOICE_VARIATION_POINT__BINDING_CHOICE:
				return bindingChoice != null && !bindingChoice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChoiceVariationPointImpl
