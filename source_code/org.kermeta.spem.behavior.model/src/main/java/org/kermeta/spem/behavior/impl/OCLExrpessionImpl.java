/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.spem.behavior.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.spem.behavior.BehaviorPackage;
import org.kermeta.spem.behavior.OCLExrpession;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Exrpession</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.spem.behavior.impl.OCLExrpessionImpl#getOclExpression <em>Ocl Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLExrpessionImpl extends ExpressionImpl implements OCLExrpession {
	/**
	 * The default value of the '{@link #getOclExpression() <em>Ocl Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String OCL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOclExpression() <em>Ocl Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclExpression()
	 * @generated
	 * @ordered
	 */
	protected String oclExpression = OCL_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLExrpessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.OCL_EXRPESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOclExpression() {
		return oclExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOclExpression(String newOclExpression) {
		String oldOclExpression = oclExpression;
		oclExpression = newOclExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.OCL_EXRPESSION__OCL_EXPRESSION, oldOclExpression, oclExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.OCL_EXRPESSION__OCL_EXPRESSION:
				return getOclExpression();
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
			case BehaviorPackage.OCL_EXRPESSION__OCL_EXPRESSION:
				setOclExpression((String)newValue);
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
			case BehaviorPackage.OCL_EXRPESSION__OCL_EXPRESSION:
				setOclExpression(OCL_EXPRESSION_EDEFAULT);
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
			case BehaviorPackage.OCL_EXRPESSION__OCL_EXPRESSION:
				return OCL_EXPRESSION_EDEFAULT == null ? oclExpression != null : !OCL_EXPRESSION_EDEFAULT.equals(oclExpression);
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
		result.append(" (oclExpression: ");
		result.append(oclExpression);
		result.append(')');
		return result.toString();
	}

} //OCLExrpessionImpl
