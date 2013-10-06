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

import org.kermeta.cvl.variability.SetComprVarReference;
import org.kermeta.cvl.variability.SetComprVariable;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Compr Var Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.SetComprVarReferenceImpl#getSetComprVariable <em>Set Compr Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetComprVarReferenceImpl extends ExpressionImpl implements SetComprVarReference {
	/**
	 * The cached value of the '{@link #getSetComprVariable() <em>Set Compr Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetComprVariable()
	 * @generated
	 * @ordered
	 */
	protected SetComprVariable setComprVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetComprVarReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.SET_COMPR_VAR_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetComprVariable getSetComprVariable() {
		if (setComprVariable != null && setComprVariable.eIsProxy()) {
			InternalEObject oldSetComprVariable = (InternalEObject)setComprVariable;
			setComprVariable = (SetComprVariable)eResolveProxy(oldSetComprVariable);
			if (setComprVariable != oldSetComprVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.SET_COMPR_VAR_REFERENCE__SET_COMPR_VARIABLE, oldSetComprVariable, setComprVariable));
			}
		}
		return setComprVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetComprVariable basicGetSetComprVariable() {
		return setComprVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetComprVariable(SetComprVariable newSetComprVariable) {
		SetComprVariable oldSetComprVariable = setComprVariable;
		setComprVariable = newSetComprVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.SET_COMPR_VAR_REFERENCE__SET_COMPR_VARIABLE, oldSetComprVariable, setComprVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariabilityPackage.SET_COMPR_VAR_REFERENCE__SET_COMPR_VARIABLE:
				if (resolve) return getSetComprVariable();
				return basicGetSetComprVariable();
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
			case VariabilityPackage.SET_COMPR_VAR_REFERENCE__SET_COMPR_VARIABLE:
				setSetComprVariable((SetComprVariable)newValue);
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
			case VariabilityPackage.SET_COMPR_VAR_REFERENCE__SET_COMPR_VARIABLE:
				setSetComprVariable((SetComprVariable)null);
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
			case VariabilityPackage.SET_COMPR_VAR_REFERENCE__SET_COMPR_VARIABLE:
				return setComprVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //SetComprVarReferenceImpl
