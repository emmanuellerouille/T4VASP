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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spem.MethodConfiguration;
import spem.MethodLibrary;
import spem.MethodPlugin;
import spem.SpemPackage;
import spem.ToolDefinition;

import spem.uma.ConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spem.impl.MethodLibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link spem.impl.MethodLibraryImpl#getOwnedMethodPlugin <em>Owned Method Plugin</em>}</li>
 *   <li>{@link spem.impl.MethodLibraryImpl#getPredefinedConfiguration <em>Predefined Configuration</em>}</li>
 *   <li>{@link spem.impl.MethodLibraryImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link spem.impl.MethodLibraryImpl#getConfigurationPackage <em>Configuration Package</em>}</li>
 *   <li>{@link spem.impl.MethodLibraryImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodLibraryImpl extends EObjectImpl implements MethodLibrary {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedMethodPlugin() <em>Owned Method Plugin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMethodPlugin()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodPlugin> ownedMethodPlugin;

	/**
	 * The cached value of the '{@link #getPredefinedConfiguration() <em>Predefined Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodConfiguration> predefinedConfiguration;

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected ToolDefinition tool;

	/**
	 * The cached value of the '{@link #getConfigurationPackage() <em>Configuration Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationPackage()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationPackage configurationPackage;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.METHOD_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.METHOD_LIBRARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodPlugin> getOwnedMethodPlugin() {
		if (ownedMethodPlugin == null) {
			ownedMethodPlugin = new EObjectContainmentEList<MethodPlugin>(MethodPlugin.class, this, SpemPackage.METHOD_LIBRARY__OWNED_METHOD_PLUGIN);
		}
		return ownedMethodPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodConfiguration> getPredefinedConfiguration() {
		if (predefinedConfiguration == null) {
			predefinedConfiguration = new EObjectContainmentEList<MethodConfiguration>(MethodConfiguration.class, this, SpemPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATION);
		}
		return predefinedConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolDefinition getTool() {
		if (tool != null && tool.eIsProxy()) {
			InternalEObject oldTool = (InternalEObject)tool;
			tool = (ToolDefinition)eResolveProxy(oldTool);
			if (tool != oldTool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.METHOD_LIBRARY__TOOL, oldTool, tool));
			}
		}
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolDefinition basicGetTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(ToolDefinition newTool) {
		ToolDefinition oldTool = tool;
		tool = newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.METHOD_LIBRARY__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPackage getConfigurationPackage() {
		return configurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationPackage(ConfigurationPackage newConfigurationPackage, NotificationChain msgs) {
		ConfigurationPackage oldConfigurationPackage = configurationPackage;
		configurationPackage = newConfigurationPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpemPackage.METHOD_LIBRARY__CONFIGURATION_PACKAGE, oldConfigurationPackage, newConfigurationPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationPackage(ConfigurationPackage newConfigurationPackage) {
		if (newConfigurationPackage != configurationPackage) {
			NotificationChain msgs = null;
			if (configurationPackage != null)
				msgs = ((InternalEObject)configurationPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpemPackage.METHOD_LIBRARY__CONFIGURATION_PACKAGE, null, msgs);
			if (newConfigurationPackage != null)
				msgs = ((InternalEObject)newConfigurationPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpemPackage.METHOD_LIBRARY__CONFIGURATION_PACKAGE, null, msgs);
			msgs = basicSetConfigurationPackage(newConfigurationPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.METHOD_LIBRARY__CONFIGURATION_PACKAGE, newConfigurationPackage, newConfigurationPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAny() {
		if (any == null) {
			any = new EObjectContainmentEList<EObject>(EObject.class, this, SpemPackage.METHOD_LIBRARY__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.METHOD_LIBRARY__OWNED_METHOD_PLUGIN:
				return ((InternalEList<?>)getOwnedMethodPlugin()).basicRemove(otherEnd, msgs);
			case SpemPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATION:
				return ((InternalEList<?>)getPredefinedConfiguration()).basicRemove(otherEnd, msgs);
			case SpemPackage.METHOD_LIBRARY__CONFIGURATION_PACKAGE:
				return basicSetConfigurationPackage(null, msgs);
			case SpemPackage.METHOD_LIBRARY__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case SpemPackage.METHOD_LIBRARY__NAME:
				return getName();
			case SpemPackage.METHOD_LIBRARY__OWNED_METHOD_PLUGIN:
				return getOwnedMethodPlugin();
			case SpemPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATION:
				return getPredefinedConfiguration();
			case SpemPackage.METHOD_LIBRARY__TOOL:
				if (resolve) return getTool();
				return basicGetTool();
			case SpemPackage.METHOD_LIBRARY__CONFIGURATION_PACKAGE:
				return getConfigurationPackage();
			case SpemPackage.METHOD_LIBRARY__ANY:
				return getAny();
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
			case SpemPackage.METHOD_LIBRARY__NAME:
				setName((String)newValue);
				return;
			case SpemPackage.METHOD_LIBRARY__OWNED_METHOD_PLUGIN:
				getOwnedMethodPlugin().clear();
				getOwnedMethodPlugin().addAll((Collection<? extends MethodPlugin>)newValue);
				return;
			case SpemPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATION:
				getPredefinedConfiguration().clear();
				getPredefinedConfiguration().addAll((Collection<? extends MethodConfiguration>)newValue);
				return;
			case SpemPackage.METHOD_LIBRARY__TOOL:
				setTool((ToolDefinition)newValue);
				return;
			case SpemPackage.METHOD_LIBRARY__CONFIGURATION_PACKAGE:
				setConfigurationPackage((ConfigurationPackage)newValue);
				return;
			case SpemPackage.METHOD_LIBRARY__ANY:
				getAny().clear();
				getAny().addAll((Collection<? extends EObject>)newValue);
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
			case SpemPackage.METHOD_LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpemPackage.METHOD_LIBRARY__OWNED_METHOD_PLUGIN:
				getOwnedMethodPlugin().clear();
				return;
			case SpemPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATION:
				getPredefinedConfiguration().clear();
				return;
			case SpemPackage.METHOD_LIBRARY__TOOL:
				setTool((ToolDefinition)null);
				return;
			case SpemPackage.METHOD_LIBRARY__CONFIGURATION_PACKAGE:
				setConfigurationPackage((ConfigurationPackage)null);
				return;
			case SpemPackage.METHOD_LIBRARY__ANY:
				getAny().clear();
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
			case SpemPackage.METHOD_LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpemPackage.METHOD_LIBRARY__OWNED_METHOD_PLUGIN:
				return ownedMethodPlugin != null && !ownedMethodPlugin.isEmpty();
			case SpemPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATION:
				return predefinedConfiguration != null && !predefinedConfiguration.isEmpty();
			case SpemPackage.METHOD_LIBRARY__TOOL:
				return tool != null;
			case SpemPackage.METHOD_LIBRARY__CONFIGURATION_PACKAGE:
				return configurationPackage != null;
			case SpemPackage.METHOD_LIBRARY__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MethodLibraryImpl
