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

import org.kermeta.cvl.variability.GeneralExpression;
import org.kermeta.cvl.variability.LogicalOp;
import org.kermeta.cvl.variability.PropositionalExp;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propositional Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.PropositionalExpImpl#getLogicalOp <em>Logical Op</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.impl.PropositionalExpImpl#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropositionalExpImpl extends LogicalExpImpl implements PropositionalExp {
	/**
	 * The default value of the '{@link #getLogicalOp() <em>Logical Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOp()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOp LOGICAL_OP_EDEFAULT = LogicalOp.NOT;

	/**
	 * The cached value of the '{@link #getLogicalOp() <em>Logical Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOp()
	 * @generated
	 * @ordered
	 */
	protected LogicalOp logicalOp = LOGICAL_OP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralExpression> operand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropositionalExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.PROPOSITIONAL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOp getLogicalOp() {
		return logicalOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalOp(LogicalOp newLogicalOp) {
		LogicalOp oldLogicalOp = logicalOp;
		logicalOp = newLogicalOp == null ? LOGICAL_OP_EDEFAULT : newLogicalOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.PROPOSITIONAL_EXP__LOGICAL_OP, oldLogicalOp, logicalOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralExpression> getOperand() {
		if (operand == null) {
			operand = new EObjectContainmentEList<GeneralExpression>(GeneralExpression.class, this, VariabilityPackage.PROPOSITIONAL_EXP__OPERAND);
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.PROPOSITIONAL_EXP__OPERAND:
				return ((InternalEList<?>)getOperand()).basicRemove(otherEnd, msgs);
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
			case VariabilityPackage.PROPOSITIONAL_EXP__LOGICAL_OP:
				return getLogicalOp();
			case VariabilityPackage.PROPOSITIONAL_EXP__OPERAND:
				return getOperand();
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
			case VariabilityPackage.PROPOSITIONAL_EXP__LOGICAL_OP:
				setLogicalOp((LogicalOp)newValue);
				return;
			case VariabilityPackage.PROPOSITIONAL_EXP__OPERAND:
				getOperand().clear();
				getOperand().addAll((Collection<? extends GeneralExpression>)newValue);
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
			case VariabilityPackage.PROPOSITIONAL_EXP__LOGICAL_OP:
				setLogicalOp(LOGICAL_OP_EDEFAULT);
				return;
			case VariabilityPackage.PROPOSITIONAL_EXP__OPERAND:
				getOperand().clear();
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
			case VariabilityPackage.PROPOSITIONAL_EXP__LOGICAL_OP:
				return logicalOp != LOGICAL_OP_EDEFAULT;
			case VariabilityPackage.PROPOSITIONAL_EXP__OPERAND:
				return operand != null && !operand.isEmpty();
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
		result.append(" (logicalOp: ");
		result.append(logicalOp);
		result.append(')');
		return result.toString();
	}

} //PropositionalExpImpl
