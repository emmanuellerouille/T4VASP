/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.kermeta.cvl.variability.ConfigurableUnit;
import org.kermeta.cvl.variability.VariabilityFactory;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * This is the item provider adapter for a {@link org.kermeta.cvl.variability.ConfigurableUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurableUnitItemProvider
	extends CompositeVariationPointItemProvider
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
	public ConfigurableUnitItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC);
			childrenFeatures.add(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT);
			childrenFeatures.add(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_CONSTRAINT);
			childrenFeatures.add(VariabilityPackage.Literals.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT);
			childrenFeatures.add(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION);
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
	 * This returns ConfigurableUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConfigurableUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConfigurableUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ConfigurableUnit_type") :
			getString("_UI_ConfigurableUnit_type") + " " + label;
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

		switch (notification.getFeatureID(ConfigurableUnit.class)) {
			case VariabilityPackage.CONFIGURABLE_UNIT__OWNED_VSPEC:
			case VariabilityPackage.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT:
			case VariabilityPackage.CONFIGURABLE_UNIT__OWNED_CONSTRAINT:
			case VariabilityPackage.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT:
			case VariabilityPackage.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION:
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
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC,
				 VariabilityFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC,
				 VariabilityFactory.eINSTANCE.createVClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC,
				 VariabilityFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC,
				 VariabilityFactory.eINSTANCE.createCVSpec()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createChoiceVariationPoint()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createFragmentSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createPlacementFragment()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createObjectSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createSlotAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createObjectExistence()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createLinkAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createCompositeVariationPoint()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createConfigurableUnit()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createLinkExistence()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createOpaqueVariationPoint()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createSlotValueExistence()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createParametricLinkAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createParametricObjectSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createParametricSlotAssignmet()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT,
				 VariabilityFactory.eINSTANCE.createConfigurableUnitUsage()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_CONSTRAINT,
				 VariabilityFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT,
				 VariabilityFactory.eINSTANCE.createObjectHandle()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION,
				 VariabilityFactory.eINSTANCE.createVConfiguration()));
	}

}
