/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kermeta.cvl.variability.ObjectExistence;
import org.kermeta.cvl.variability.ObjectHandle;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Existence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.cvl.variability.impl.ObjectExistenceImpl#getOptionalObject <em>Optional Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectExistenceImpl extends ExistenceImpl implements ObjectExistence {
	/**
	 * The cached value of the '{@link #getOptionalObject() <em>Optional Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalObject()
	 * @generated
	 * @ordered
	 */
	protected ObjectHandle optionalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectExistenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariabilityPackage.Literals.OBJECT_EXISTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHandle getOptionalObject() {
		return optionalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionalObject(ObjectHandle newOptionalObject, NotificationChain msgs) {
		ObjectHandle oldOptionalObject = optionalObject;
		optionalObject = newOptionalObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariabilityPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT, oldOptionalObject, newOptionalObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalObject(ObjectHandle newOptionalObject) {
		if (newOptionalObject != optionalObject) {
			NotificationChain msgs = null;
			if (optionalObject != null)
				msgs = ((InternalEObject)optionalObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT, null, msgs);
			if (newOptionalObject != null)
				msgs = ((InternalEObject)newOptionalObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariabilityPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT, null, msgs);
			msgs = basicSetOptionalObject(newOptionalObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariabilityPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT, newOptionalObject, newOptionalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariabilityPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT:
				return basicSetOptionalObject(null, msgs);
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
			case VariabilityPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT:
				return getOptionalObject();
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
			case VariabilityPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT:
				setOptionalObject((ObjectHandle)newValue);
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
			case VariabilityPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT:
				setOptionalObject((ObjectHandle)null);
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
			case VariabilityPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT:
				return optionalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectExistenceImpl
