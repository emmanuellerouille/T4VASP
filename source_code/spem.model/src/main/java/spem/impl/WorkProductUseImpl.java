/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spem.LifeCycleSpecification;
import spem.SpemPackage;
import spem.WorkProductDefinition;
import spem.WorkProductUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spem.impl.WorkProductUseImpl#getWorkProduct <em>Work Product</em>}</li>
 *   <li>{@link spem.impl.WorkProductUseImpl#getLifeCycle <em>Life Cycle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkProductUseImpl extends MethodContentUseImpl implements WorkProductUse {
	/**
	 * The cached value of the '{@link #getWorkProduct() <em>Work Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected WorkProductDefinition workProduct;

	/**
	 * The cached value of the '{@link #getLifeCycle() <em>Life Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCycle()
	 * @generated
	 * @ordered
	 */
	protected LifeCycleSpecification lifeCycle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.WORK_PRODUCT_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition getWorkProduct() {
		if (workProduct != null && workProduct.eIsProxy()) {
			InternalEObject oldWorkProduct = (InternalEObject)workProduct;
			workProduct = (WorkProductDefinition)eResolveProxy(oldWorkProduct);
			if (workProduct != oldWorkProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT, oldWorkProduct, workProduct));
			}
		}
		return workProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition basicGetWorkProduct() {
		return workProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkProduct(WorkProductDefinition newWorkProduct) {
		WorkProductDefinition oldWorkProduct = workProduct;
		workProduct = newWorkProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT, oldWorkProduct, workProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeCycleSpecification getLifeCycle() {
		return lifeCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifeCycle(LifeCycleSpecification newLifeCycle, NotificationChain msgs) {
		LifeCycleSpecification oldLifeCycle = lifeCycle;
		lifeCycle = newLifeCycle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_PRODUCT_USE__LIFE_CYCLE, oldLifeCycle, newLifeCycle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeCycle(LifeCycleSpecification newLifeCycle) {
		if (newLifeCycle != lifeCycle) {
			NotificationChain msgs = null;
			if (lifeCycle != null)
				msgs = ((InternalEObject)lifeCycle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpemPackage.WORK_PRODUCT_USE__LIFE_CYCLE, null, msgs);
			if (newLifeCycle != null)
				msgs = ((InternalEObject)newLifeCycle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpemPackage.WORK_PRODUCT_USE__LIFE_CYCLE, null, msgs);
			msgs = basicSetLifeCycle(newLifeCycle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_PRODUCT_USE__LIFE_CYCLE, newLifeCycle, newLifeCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.WORK_PRODUCT_USE__LIFE_CYCLE:
				return basicSetLifeCycle(null, msgs);
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
			case SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT:
				if (resolve) return getWorkProduct();
				return basicGetWorkProduct();
			case SpemPackage.WORK_PRODUCT_USE__LIFE_CYCLE:
				return getLifeCycle();
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
			case SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT:
				setWorkProduct((WorkProductDefinition)newValue);
				return;
			case SpemPackage.WORK_PRODUCT_USE__LIFE_CYCLE:
				setLifeCycle((LifeCycleSpecification)newValue);
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
			case SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT:
				setWorkProduct((WorkProductDefinition)null);
				return;
			case SpemPackage.WORK_PRODUCT_USE__LIFE_CYCLE:
				setLifeCycle((LifeCycleSpecification)null);
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
			case SpemPackage.WORK_PRODUCT_USE__WORK_PRODUCT:
				return workProduct != null;
			case SpemPackage.WORK_PRODUCT_USE__LIFE_CYCLE:
				return lifeCycle != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkProductUseImpl
