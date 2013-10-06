/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.resolution.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.cvl.resolution.ChoiceResolution;
import org.kermeta.cvl.resolution.ResolutionPackage;

import org.kermeta.cvl.variability.Choice;

import org.kermeta.cvl.variability.impl.VSpecResolutionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.resolution.impl.ChoiceResolutionImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.kermeta.cvl.resolution.impl.ChoiceResolutionImpl#getResolvedChoice <em>Resolved Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceResolutionImpl extends VSpecResolutionImpl implements ChoiceResolution {
	/**
	 * The default value of the '{@link #getDecision() <em>Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DECISION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDecision() <em>Decision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecision()
	 * @generated
	 * @ordered
	 */
	protected Boolean decision = DECISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResolvedChoice() <em>Resolved Choice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedChoice()
	 * @generated
	 * @ordered
	 */
	protected Choice resolvedChoice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceResolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResolutionPackage.Literals.CHOICE_RESOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDecision() {
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecision(Boolean newDecision) {
		Boolean oldDecision = decision;
		decision = newDecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResolutionPackage.CHOICE_RESOLUTION__DECISION, oldDecision, decision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice getResolvedChoice() {
		if (resolvedChoice != null && resolvedChoice.eIsProxy()) {
			InternalEObject oldResolvedChoice = (InternalEObject)resolvedChoice;
			resolvedChoice = (Choice)eResolveProxy(oldResolvedChoice);
			if (resolvedChoice != oldResolvedChoice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResolutionPackage.CHOICE_RESOLUTION__RESOLVED_CHOICE, oldResolvedChoice, resolvedChoice));
			}
		}
		return resolvedChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice basicGetResolvedChoice() {
		return resolvedChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedChoice(Choice newResolvedChoice) {
		Choice oldResolvedChoice = resolvedChoice;
		resolvedChoice = newResolvedChoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResolutionPackage.CHOICE_RESOLUTION__RESOLVED_CHOICE, oldResolvedChoice, resolvedChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResolutionPackage.CHOICE_RESOLUTION__DECISION:
				return getDecision();
			case ResolutionPackage.CHOICE_RESOLUTION__RESOLVED_CHOICE:
				if (resolve) return getResolvedChoice();
				return basicGetResolvedChoice();
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
			case ResolutionPackage.CHOICE_RESOLUTION__DECISION:
				setDecision((Boolean)newValue);
				return;
			case ResolutionPackage.CHOICE_RESOLUTION__RESOLVED_CHOICE:
				setResolvedChoice((Choice)newValue);
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
			case ResolutionPackage.CHOICE_RESOLUTION__DECISION:
				setDecision(DECISION_EDEFAULT);
				return;
			case ResolutionPackage.CHOICE_RESOLUTION__RESOLVED_CHOICE:
				setResolvedChoice((Choice)null);
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
			case ResolutionPackage.CHOICE_RESOLUTION__DECISION:
				return DECISION_EDEFAULT == null ? decision != null : !DECISION_EDEFAULT.equals(decision);
			case ResolutionPackage.CHOICE_RESOLUTION__RESOLVED_CHOICE:
				return resolvedChoice != null;
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
		result.append(" (decision: ");
		result.append(decision);
		result.append(')');
		return result.toString();
	}

} //ChoiceResolutionImpl
