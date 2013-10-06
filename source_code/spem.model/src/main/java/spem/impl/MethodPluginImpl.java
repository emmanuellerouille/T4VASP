/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spem.MethodContentPackage;
import spem.MethodPlugin;
import spem.ProcessPackage;
import spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Plugin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spem.impl.MethodPluginImpl#isUserChangeable <em>User Changeable</em>}</li>
 *   <li>{@link spem.impl.MethodPluginImpl#getSupporting <em>Supporting</em>}</li>
 *   <li>{@link spem.impl.MethodPluginImpl#getOwnedMethodContentPackage <em>Owned Method Content Package</em>}</li>
 *   <li>{@link spem.impl.MethodPluginImpl#getOwnedProcessPackage <em>Owned Process Package</em>}</li>
 *   <li>{@link spem.impl.MethodPluginImpl#getBasePlugin <em>Base Plugin</em>}</li>
 *   <li>{@link spem.impl.MethodPluginImpl#getReferencedMethodPlugin <em>Referenced Method Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodPluginImpl extends MethodLibraryPackageableElementImpl implements MethodPlugin {
	/**
	 * The default value of the '{@link #isUserChangeable() <em>User Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_CHANGEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUserChangeable() <em>User Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserChangeable()
	 * @generated
	 * @ordered
	 */
	protected boolean userChangeable = USER_CHANGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupporting() <em>Supporting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupporting()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPORTING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupporting() <em>Supporting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupporting()
	 * @generated
	 * @ordered
	 */
	protected Boolean supporting = SUPPORTING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedMethodContentPackage() <em>Owned Method Content Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMethodContentPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodContentPackage> ownedMethodContentPackage;

	/**
	 * The cached value of the '{@link #getOwnedProcessPackage() <em>Owned Process Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProcessPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessPackage> ownedProcessPackage;

	/**
	 * The cached value of the '{@link #getBasePlugin() <em>Base Plugin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePlugin()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodPlugin> basePlugin;

	/**
	 * The cached value of the '{@link #getReferencedMethodPlugin() <em>Referenced Method Plugin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedMethodPlugin()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodPlugin> referencedMethodPlugin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodPluginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.METHOD_PLUGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUserChangeable() {
		return userChangeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserChangeable(boolean newUserChangeable) {
		boolean oldUserChangeable = userChangeable;
		userChangeable = newUserChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.METHOD_PLUGIN__USER_CHANGEABLE, oldUserChangeable, userChangeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSupporting() {
		return supporting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupporting(Boolean newSupporting) {
		Boolean oldSupporting = supporting;
		supporting = newSupporting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.METHOD_PLUGIN__SUPPORTING, oldSupporting, supporting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodContentPackage> getOwnedMethodContentPackage() {
		if (ownedMethodContentPackage == null) {
			ownedMethodContentPackage = new EObjectContainmentEList<MethodContentPackage>(MethodContentPackage.class, this, SpemPackage.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE);
		}
		return ownedMethodContentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessPackage> getOwnedProcessPackage() {
		if (ownedProcessPackage == null) {
			ownedProcessPackage = new EObjectContainmentEList<ProcessPackage>(ProcessPackage.class, this, SpemPackage.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE);
		}
		return ownedProcessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodPlugin> getBasePlugin() {
		if (basePlugin == null) {
			basePlugin = new EObjectResolvingEList<MethodPlugin>(MethodPlugin.class, this, SpemPackage.METHOD_PLUGIN__BASE_PLUGIN);
		}
		return basePlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodPlugin> getReferencedMethodPlugin() {
		if (referencedMethodPlugin == null) {
			referencedMethodPlugin = new EObjectResolvingEList<MethodPlugin>(MethodPlugin.class, this, SpemPackage.METHOD_PLUGIN__REFERENCED_METHOD_PLUGIN);
		}
		return referencedMethodPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE:
				return ((InternalEList<?>)getOwnedMethodContentPackage()).basicRemove(otherEnd, msgs);
			case SpemPackage.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE:
				return ((InternalEList<?>)getOwnedProcessPackage()).basicRemove(otherEnd, msgs);
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
			case SpemPackage.METHOD_PLUGIN__USER_CHANGEABLE:
				return isUserChangeable();
			case SpemPackage.METHOD_PLUGIN__SUPPORTING:
				return getSupporting();
			case SpemPackage.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE:
				return getOwnedMethodContentPackage();
			case SpemPackage.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE:
				return getOwnedProcessPackage();
			case SpemPackage.METHOD_PLUGIN__BASE_PLUGIN:
				return getBasePlugin();
			case SpemPackage.METHOD_PLUGIN__REFERENCED_METHOD_PLUGIN:
				return getReferencedMethodPlugin();
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
			case SpemPackage.METHOD_PLUGIN__USER_CHANGEABLE:
				setUserChangeable((Boolean)newValue);
				return;
			case SpemPackage.METHOD_PLUGIN__SUPPORTING:
				setSupporting((Boolean)newValue);
				return;
			case SpemPackage.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE:
				getOwnedMethodContentPackage().clear();
				getOwnedMethodContentPackage().addAll((Collection<? extends MethodContentPackage>)newValue);
				return;
			case SpemPackage.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE:
				getOwnedProcessPackage().clear();
				getOwnedProcessPackage().addAll((Collection<? extends ProcessPackage>)newValue);
				return;
			case SpemPackage.METHOD_PLUGIN__BASE_PLUGIN:
				getBasePlugin().clear();
				getBasePlugin().addAll((Collection<? extends MethodPlugin>)newValue);
				return;
			case SpemPackage.METHOD_PLUGIN__REFERENCED_METHOD_PLUGIN:
				getReferencedMethodPlugin().clear();
				getReferencedMethodPlugin().addAll((Collection<? extends MethodPlugin>)newValue);
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
			case SpemPackage.METHOD_PLUGIN__USER_CHANGEABLE:
				setUserChangeable(USER_CHANGEABLE_EDEFAULT);
				return;
			case SpemPackage.METHOD_PLUGIN__SUPPORTING:
				setSupporting(SUPPORTING_EDEFAULT);
				return;
			case SpemPackage.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE:
				getOwnedMethodContentPackage().clear();
				return;
			case SpemPackage.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE:
				getOwnedProcessPackage().clear();
				return;
			case SpemPackage.METHOD_PLUGIN__BASE_PLUGIN:
				getBasePlugin().clear();
				return;
			case SpemPackage.METHOD_PLUGIN__REFERENCED_METHOD_PLUGIN:
				getReferencedMethodPlugin().clear();
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
			case SpemPackage.METHOD_PLUGIN__USER_CHANGEABLE:
				return userChangeable != USER_CHANGEABLE_EDEFAULT;
			case SpemPackage.METHOD_PLUGIN__SUPPORTING:
				return SUPPORTING_EDEFAULT == null ? supporting != null : !SUPPORTING_EDEFAULT.equals(supporting);
			case SpemPackage.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE:
				return ownedMethodContentPackage != null && !ownedMethodContentPackage.isEmpty();
			case SpemPackage.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE:
				return ownedProcessPackage != null && !ownedProcessPackage.isEmpty();
			case SpemPackage.METHOD_PLUGIN__BASE_PLUGIN:
				return basePlugin != null && !basePlugin.isEmpty();
			case SpemPackage.METHOD_PLUGIN__REFERENCED_METHOD_PLUGIN:
				return referencedMethodPlugin != null && !referencedMethodPlugin.isEmpty();
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
		result.append(" (userChangeable: ");
		result.append(userChangeable);
		result.append(", supporting: ");
		result.append(supporting);
		result.append(')');
		return result.toString();
	}

} //MethodPluginImpl
