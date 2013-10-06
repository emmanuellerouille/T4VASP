/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spem.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import spem.MethodPlugin;
import spem.SpemFactory;
import spem.SpemPackage;

import spem.uma.UmaFactory;

/**
 * This is the item provider adapter for a {@link spem.MethodPlugin} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodPluginItemProvider
	extends MethodLibraryPackageableElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPluginItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUserChangeablePropertyDescriptor(object);
			addSupportingPropertyDescriptor(object);
			addBasePluginPropertyDescriptor(object);
			addReferencedMethodPluginPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the User Changeable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserChangeablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodPlugin_userChangeable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodPlugin_userChangeable_feature", "_UI_MethodPlugin_type"),
				 SpemPackage.Literals.METHOD_PLUGIN__USER_CHANGEABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supporting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodPlugin_supporting_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodPlugin_supporting_feature", "_UI_MethodPlugin_type"),
				 SpemPackage.Literals.METHOD_PLUGIN__SUPPORTING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Plugin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePluginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodPlugin_basePlugin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodPlugin_basePlugin_feature", "_UI_MethodPlugin_type"),
				 SpemPackage.Literals.METHOD_PLUGIN__BASE_PLUGIN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referenced Method Plugin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedMethodPluginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodPlugin_referencedMethodPlugin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodPlugin_referencedMethodPlugin_feature", "_UI_MethodPlugin_type"),
				 SpemPackage.Literals.METHOD_PLUGIN__REFERENCED_METHOD_PLUGIN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE);
			childrenFeatures.add(SpemPackage.Literals.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MethodPlugin.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MethodPlugin"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MethodPlugin)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MethodPlugin_type") :
			getString("_UI_MethodPlugin_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MethodPlugin.class)) {
			case SpemPackage.METHOD_PLUGIN__USER_CHANGEABLE:
			case SpemPackage.METHOD_PLUGIN__SUPPORTING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpemPackage.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE:
			case SpemPackage.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE,
				 SpemFactory.eINSTANCE.createMethodContentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE,
				 UmaFactory.eINSTANCE.createCategoryPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE,
				 UmaFactory.eINSTANCE.createRoleDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE,
				 UmaFactory.eINSTANCE.createTaskDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE,
				 UmaFactory.eINSTANCE.createWorkProductDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE,
				 UmaFactory.eINSTANCE.createGuidancePackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE,
				 UmaFactory.eINSTANCE.createDisciplinePackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE,
				 UmaFactory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE,
				 UmaFactory.eINSTANCE.createWorkProductKindPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE,
				 UmaFactory.eINSTANCE.createRoleSetPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE,
				 UmaFactory.eINSTANCE.createToolDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE,
				 UmaFactory.eINSTANCE.createConfigurationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_METHOD_CONTENT_PACKAGE,
				 UmaFactory.eINSTANCE.createQualificationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE,
				 SpemFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE,
				 SpemFactory.eINSTANCE.createProcessComponent()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE,
				 UmaFactory.eINSTANCE.createCapabilityPatternPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE,
				 UmaFactory.eINSTANCE.createDeliveryProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_PLUGIN__OWNED_PROCESS_PACKAGE,
				 UmaFactory.eINSTANCE.createProcessComponentPackage()));
	}

}
