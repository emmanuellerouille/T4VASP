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

import org.kermeta.cvl.variability.Expression;
import org.kermeta.cvl.variability.GeneralExpression;
import org.kermeta.cvl.variability.SetComprVariable;
import org.kermeta.cvl.variability.SetComprehension;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Comprehension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.SetComprehensionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.impl.SetComprehensionImpl#getSetComprVariable <em>Set Compr Variable</em>}</li>
 *   <li>{@link org.kermeta.cvl.variability.impl.SetComprehensionImpl#getGeneralExpression <em>General Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetComprehensionImpl extends ExpressionImpl implements SetComprehension {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getSetComprVariable() <em>Set Compr Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetComprVariable()
	 * @generated
	 * @ordered
	 */
	protected SetComprVariable setComprVariable;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetComprehensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.SET_COMPREHENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityPackage.SET_COMPREHENSION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.SET_COMPREHENSION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.SET_COMPREHENSION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.SET_COMPREHENSION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetComprVariable getSetComprVariable() {
		return setComprVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetComprVariable(SetComprVariable newSetComprVariable, NotificationChain msgs) {
		SetComprVariable oldSetComprVariable = setComprVariable;
		setComprVariable = newSetComprVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityPackage.SET_COMPREHENSION__SET_COMPR_VARIABLE, oldSetComprVariable, newSetComprVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetComprVariable(SetComprVariable newSetComprVariable) {
		if (newSetComprVariable != setComprVariable) {
			NotificationChain msgs = null;
			if (setComprVariable != null)
				msgs = ((InternalEObject)setComprVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.SET_COMPREHENSION__SET_COMPR_VARIABLE, null, msgs);
			if (newSetComprVariable != null)
				msgs = ((InternalEObject)newSetComprVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.SET_COMPREHENSION__SET_COMPR_VARIABLE, null, msgs);
			msgs = basicSetSetComprVariable(newSetComprVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.SET_COMPREHENSION__SET_COMPR_VARIABLE, newSetComprVariable, newSetComprVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralExpression> getGeneralExpression() {
		if (generalExpression == null) {
			generalExpression = new EObjectContainmentEList<GeneralExpression>(GeneralExpression.class, this, VariabilityPackage.SET_COMPREHENSION__GENERAL_EXPRESSION);
		}
		return generalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.SET_COMPREHENSION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case VariabilityPackage.SET_COMPREHENSION__SET_COMPR_VARIABLE:
				return basicSetSetComprVariable(null, msgs);
			case VariabilityPackage.SET_COMPREHENSION__GENERAL_EXPRESSION:
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
			case VariabilityPackage.SET_COMPREHENSION__EXPRESSION:
				return getExpression();
			case VariabilityPackage.SET_COMPREHENSION__SET_COMPR_VARIABLE:
				return getSetComprVariable();
			case VariabilityPackage.SET_COMPREHENSION__GENERAL_EXPRESSION:
				return getGeneralExpression();
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
			case VariabilityPackage.SET_COMPREHENSION__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case VariabilityPackage.SET_COMPREHENSION__SET_COMPR_VARIABLE:
				setSetComprVariable((SetComprVariable)newValue);
				return;
			case VariabilityPackage.SET_COMPREHENSION__GENERAL_EXPRESSION:
				getGeneralExpression().clear();
				getGeneralExpression().addAll((Collection<? extends GeneralExpression>)newValue);
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
			case VariabilityPackage.SET_COMPREHENSION__EXPRESSION:
				setExpression((Expression)null);
				return;
			case VariabilityPackage.SET_COMPREHENSION__SET_COMPR_VARIABLE:
				setSetComprVariable((SetComprVariable)null);
				return;
			case VariabilityPackage.SET_COMPREHENSION__GENERAL_EXPRESSION:
				getGeneralExpression().clear();
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
			case VariabilityPackage.SET_COMPREHENSION__EXPRESSION:
				return expression != null;
			case VariabilityPackage.SET_COMPREHENSION__SET_COMPR_VARIABLE:
				return setComprVariable != null;
			case VariabilityPackage.SET_COMPREHENSION__GENERAL_EXPRESSION:
				return generalExpression != null && !generalExpression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SetComprehensionImpl
