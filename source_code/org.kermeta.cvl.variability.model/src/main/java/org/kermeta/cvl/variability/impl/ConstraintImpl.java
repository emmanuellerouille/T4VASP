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

import org.kermeta.cvl.variability.Constraint;
import org.kermeta.cvl.variability.GeneralExpression;
import org.kermeta.cvl.variability.VSpec;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.ConstraintImpl#getGeneralExpression <em>General Expression</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.impl.ConstraintImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.impl.ConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.impl.ConstraintImpl#getConstraintLanguage <em>Constraint Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends VPackageableImpl implements Constraint {
	/**
	 * The cached value of the '{@link #getGeneralExpression() <em>General Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralExpression> generalExpression;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected VSpec context;

	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected String constraint = CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintLanguage() <em>Constraint Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintLanguage() <em>Constraint Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintLanguage()
	 * @generated
	 * @ordered
	 */
	protected String constraintLanguage = CONSTRAINT_LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralExpression> getGeneralExpression() {
		if (generalExpression == null) {
			generalExpression = new EObjectContainmentEList<GeneralExpression>(GeneralExpression.class, this, VariabilityPackage.CONSTRAINT__GENERAL_EXPRESSION);
		}
		return generalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSpec getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (VSpec)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariabilityPackage.CONSTRAINT__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSpec basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(VSpec newContext) {
		VSpec oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONSTRAINT__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(String newConstraint) {
		String oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONSTRAINT__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintLanguage() {
		return constraintLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintLanguage(String newConstraintLanguage) {
		String oldConstraintLanguage = constraintLanguage;
		constraintLanguage = newConstraintLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.CONSTRAINT__CONSTRAINT_LANGUAGE, oldConstraintLanguage, constraintLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.CONSTRAINT__GENERAL_EXPRESSION:
				return ((InternalEList<?>)getGeneralExpression()).basicRemove(otherEnd, msgs);
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
			case VariabilityPackage.CONSTRAINT__GENERAL_EXPRESSION:
				return getGeneralExpression();
			case VariabilityPackage.CONSTRAINT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case VariabilityPackage.CONSTRAINT__CONSTRAINT:
				return getConstraint();
			case VariabilityPackage.CONSTRAINT__CONSTRAINT_LANGUAGE:
				return getConstraintLanguage();
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
			case VariabilityPackage.CONSTRAINT__GENERAL_EXPRESSION:
				getGeneralExpression().clear();
				getGeneralExpression().addAll((Collection<? extends GeneralExpression>)newValue);
				return;
			case VariabilityPackage.CONSTRAINT__CONTEXT:
				setContext((VSpec)newValue);
				return;
			case VariabilityPackage.CONSTRAINT__CONSTRAINT:
				setConstraint((String)newValue);
				return;
			case VariabilityPackage.CONSTRAINT__CONSTRAINT_LANGUAGE:
				setConstraintLanguage((String)newValue);
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
			case VariabilityPackage.CONSTRAINT__GENERAL_EXPRESSION:
				getGeneralExpression().clear();
				return;
			case VariabilityPackage.CONSTRAINT__CONTEXT:
				setContext((VSpec)null);
				return;
			case VariabilityPackage.CONSTRAINT__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case VariabilityPackage.CONSTRAINT__CONSTRAINT_LANGUAGE:
				setConstraintLanguage(CONSTRAINT_LANGUAGE_EDEFAULT);
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
			case VariabilityPackage.CONSTRAINT__GENERAL_EXPRESSION:
				return generalExpression != null && !generalExpression.isEmpty();
			case VariabilityPackage.CONSTRAINT__CONTEXT:
				return context != null;
			case VariabilityPackage.CONSTRAINT__CONSTRAINT:
				return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
			case VariabilityPackage.CONSTRAINT__CONSTRAINT_LANGUAGE:
				return CONSTRAINT_LANGUAGE_EDEFAULT == null ? constraintLanguage != null : !CONSTRAINT_LANGUAGE_EDEFAULT.equals(constraintLanguage);
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
		result.append(" (constraint: ");
		result.append(constraint);
		result.append(", constraintLanguage: ");
		result.append(constraintLanguage);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
