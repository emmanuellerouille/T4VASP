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

import spem.ProcessComponent;
import spem.SpemFactory;
import spem.SpemPackage;

import spem.uma.UmaFactory;

/**
 * This is the item provider adapter for a {@link spem.ProcessComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessComponentItemProvider
	extends ProcessPackageItemProvider
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
	public ProcessComponentItemProvider(AdapterFactory adapterFactory) {
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

			addCopyrightPropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addChangeDatePropertyDescriptor(object);
			addChangeDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Copyright feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyrightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessComponent_copyright_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessComponent_copyright_feature", "_UI_ProcessComponent_type"),
				 SpemPackage.Literals.PROCESS_COMPONENT__COPYRIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessComponent_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessComponent_author_feature", "_UI_ProcessComponent_type"),
				 SpemPackage.Literals.PROCESS_COMPONENT__AUTHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessComponent_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessComponent_version_feature", "_UI_ProcessComponent_type"),
				 SpemPackage.Literals.PROCESS_COMPONENT__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Change Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessComponent_changeDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessComponent_changeDate_feature", "_UI_ProcessComponent_type"),
				 SpemPackage.Literals.PROCESS_COMPONENT__CHANGE_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Change Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessComponent_changeDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessComponent_changeDescription_feature", "_UI_ProcessComponent_type"),
				 SpemPackage.Literals.PROCESS_COMPONENT__CHANGE_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(SpemPackage.Literals.PROCESS_COMPONENT__PROCESS);
			childrenFeatures.add(SpemPackage.Literals.PROCESS_COMPONENT__OWNED_PORT);
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
	 * This returns ProcessComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcessComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProcessComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProcessComponent_type") :
			getString("_UI_ProcessComponent_type") + " " + label;
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

		switch (notification.getFeatureID(ProcessComponent.class)) {
			case SpemPackage.PROCESS_COMPONENT__COPYRIGHT:
			case SpemPackage.PROCESS_COMPONENT__AUTHOR:
			case SpemPackage.PROCESS_COMPONENT__VERSION:
			case SpemPackage.PROCESS_COMPONENT__CHANGE_DATE:
			case SpemPackage.PROCESS_COMPONENT__CHANGE_DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpemPackage.PROCESS_COMPONENT__PROCESS:
			case SpemPackage.PROCESS_COMPONENT__OWNED_PORT:
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
				(SpemPackage.Literals.PROCESS_COMPONENT__PROCESS,
				 SpemFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_COMPONENT__PROCESS,
				 UmaFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_COMPONENT__PROCESS,
				 UmaFactory.eINSTANCE.createCapabilityPattern()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_COMPONENT__PROCESS,
				 UmaFactory.eINSTANCE.createDeliveryProcess()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_COMPONENT__PROCESS,
				 UmaFactory.eINSTANCE.createIteration()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_COMPONENT__PROCESS,
				 UmaFactory.eINSTANCE.createPhase()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_COMPONENT__PROCESS,
				 UmaFactory.eINSTANCE.createProcessPlanningTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.PROCESS_COMPONENT__OWNED_PORT,
				 SpemFactory.eINSTANCE.createWorkProductPort()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SpemPackage.Literals.PROCESS_PACKAGE__OWNED_PROCESS_MEMBER ||
			childFeature == SpemPackage.Literals.PROCESS_COMPONENT__PROCESS ||
			childFeature == SpemPackage.Literals.PROCESS_COMPONENT__OWNED_PORT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
