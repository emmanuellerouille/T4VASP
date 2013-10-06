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

import org.kermeta.cvl.variability.CompareExp;
import org.kermeta.cvl.variability.CompareOp;
import org.kermeta.cvl.variability.Expression;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.CompareExpImpl#getCompared <em>Compared</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.impl.CompareExpImpl#getCompareOp <em>Compare Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompareExpImpl extends LogicalExpImpl implements CompareExp {
	/**
	 * The cached value of the '{@link #getCompared() <em>Compared</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompared()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> compared;

	/**
	 * The default value of the '{@link #getCompareOp() <em>Compare Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareOp()
	 * @generated
	 * @ordered
	 */
	protected static final CompareOp COMPARE_OP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompareOp() <em>Compare Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareOp()
	 * @generated
	 * @ordered
	 */
	protected CompareOp compareOp = COMPARE_OP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompareExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.COMPARE_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getCompared() {
		if (compared == null) {
			compared = new EObjectContainmentEList<Expression>(Expression.class, this, VariabilityPackage.COMPARE_EXP__COMPARED);
		}
		return compared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompareOp getCompareOp() {
		return compareOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompareOp(CompareOp newCompareOp) {
		CompareOp oldCompareOp = compareOp;
		compareOp = newCompareOp == null ? COMPARE_OP_EDEFAULT : newCompareOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.COMPARE_EXP__COMPARE_OP, oldCompareOp, compareOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.COMPARE_EXP__COMPARED:
				return ((InternalEList<?>)getCompared()).basicRemove(otherEnd, msgs);
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
			case VariabilityPackage.COMPARE_EXP__COMPARED:
				return getCompared();
			case VariabilityPackage.COMPARE_EXP__COMPARE_OP:
				return getCompareOp();
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
			case VariabilityPackage.COMPARE_EXP__COMPARED:
				getCompared().clear();
				getCompared().addAll((Collection<? extends Expression>)newValue);
				return;
			case VariabilityPackage.COMPARE_EXP__COMPARE_OP:
				setCompareOp((CompareOp)newValue);
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
			case VariabilityPackage.COMPARE_EXP__COMPARED:
				getCompared().clear();
				return;
			case VariabilityPackage.COMPARE_EXP__COMPARE_OP:
				setCompareOp(COMPARE_OP_EDEFAULT);
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
			case VariabilityPackage.COMPARE_EXP__COMPARED:
				return compared != null && !compared.isEmpty();
			case VariabilityPackage.COMPARE_EXP__COMPARE_OP:
				return compareOp != COMPARE_OP_EDEFAULT;
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
		result.append(" (compareOp: ");
		result.append(compareOp);
		result.append(')');
		return result.toString();
	}

} //CompareExpImpl
