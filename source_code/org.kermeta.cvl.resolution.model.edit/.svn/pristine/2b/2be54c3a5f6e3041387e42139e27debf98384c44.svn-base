/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.resolution.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.kermeta.cvl.resolution.ResolutionFactory;
import org.kermeta.cvl.resolution.ResolutionPackage;
import org.kermeta.cvl.resolution.VPackageResolution;

import org.kermeta.cvl.variability.VariabilityFactory;

/**
 * This is the item provider adapter for a {@link org.kermeta.cvl.resolution.VPackageResolution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VPackageResolutionItemProvider
	extends ItemProviderAdapter
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
	public VPackageResolutionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS);
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
	 * This returns VPackageResolution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VPackageResolution"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_VPackageResolution_type");
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

		switch (notification.getFeatureID(VPackageResolution.class)) {
			case ResolutionPackage.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS:
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
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 ResolutionFactory.eINSTANCE.createChoiceResolution()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 ResolutionFactory.eINSTANCE.createVariableValueAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 ResolutionFactory.eINSTANCE.createVInstance()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createVClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createChoiceVariationPoint()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createFragmentSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createPlacementFragment()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createReplacementFragmentType()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createObjectSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createObjectHandle()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createVInterface()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createSlotAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createObjectExistence()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createLinkAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createLinkHandle()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createCompositeVariationPoint()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createConfigurableUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createCVSpec()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createVConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createLinkExistence()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createOpaqueVariationPoint()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createObjectSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createReplacementFragmentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createVPackage()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createIntegerValueSpec()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createBooleanValueSpec()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createFloatValueSpec()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createStringValueSpec()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createSlotValueExistence()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createParametricLinkAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createParametricObjectSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createParametricSlotAssignmet()));

		newChildDescriptors.add
			(createChildParameter
				(ResolutionPackage.Literals.VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS,
				 VariabilityFactory.eINSTANCE.createConfigurableUnitUsage()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ResolutionEditPlugin.INSTANCE;
	}

}
