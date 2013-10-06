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

import org.kermeta.cvl.variability.SetComprehension;
import org.kermeta.cvl.variability.VariabilityFactory;
import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * This is the item provider adapter for a {@link org.kermeta.cvl.variability.SetComprehension} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SetComprehensionItemProvider
	extends ExpressionItemProvider
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
	public SetComprehensionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(VariabilityPackage.Literals.SET_COMPREHENSION__EXPRESSION);
			childrenFeatures.add(VariabilityPackage.Literals.SET_COMPREHENSION__SET_COMPR_VARIABLE);
			childrenFeatures.add(VariabilityPackage.Literals.SET_COMPREHENSION__GENERAL_EXPRESSION);
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
	 * This returns SetComprehension.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SetComprehension"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SetComprehension_type");
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

		switch (notification.getFeatureID(SetComprehension.class)) {
			case VariabilityPackage.SET_COMPREHENSION__EXPRESSION:
			case VariabilityPackage.SET_COMPREHENSION__SET_COMPR_VARIABLE:
			case VariabilityPackage.SET_COMPREHENSION__GENERAL_EXPRESSION:
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
				(VariabilityPackage.Literals.SET_COMPREHENSION__EXPRESSION,
				 VariabilityFactory.eINSTANCE.createSetComprehension()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.SET_COMPREHENSION__EXPRESSION,
				 VariabilityFactory.eINSTANCE.createQuantifiedSet()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.SET_COMPREHENSION__EXPRESSION,
				 VariabilityFactory.eINSTANCE.createSetComprVarReference()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.SET_COMPREHENSION__EXPRESSION,
				 VariabilityFactory.eINSTANCE.createFunctionExp()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.SET_COMPREHENSION__EXPRESSION,
				 VariabilityFactory.eINSTANCE.createVSpecReference()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.SET_COMPREHENSION__SET_COMPR_VARIABLE,
				 VariabilityFactory.eINSTANCE.createSetComprVariable()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.SET_COMPREHENSION__GENERAL_EXPRESSION,
				 VariabilityFactory.eINSTANCE.createPropositionalExp()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.SET_COMPREHENSION__GENERAL_EXPRESSION,
				 VariabilityFactory.eINSTANCE.createSetComprehension()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.SET_COMPREHENSION__GENERAL_EXPRESSION,
				 VariabilityFactory.eINSTANCE.createQuantifiedSet()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.SET_COMPREHENSION__GENERAL_EXPRESSION,
				 VariabilityFactory.eINSTANCE.createSetComprVarReference()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.SET_COMPREHENSION__GENERAL_EXPRESSION,
				 VariabilityFactory.eINSTANCE.createCompareExp()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.SET_COMPREHENSION__GENERAL_EXPRESSION,
				 VariabilityFactory.eINSTANCE.createFunctionExp()));

		newChildDescriptors.add
			(createChildParameter
				(VariabilityPackage.Literals.SET_COMPREHENSION__GENERAL_EXPRESSION,
				 VariabilityFactory.eINSTANCE.createVSpecReference()));
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
			childFeature == VariabilityPackage.Literals.SET_COMPREHENSION__EXPRESSION ||
			childFeature == VariabilityPackage.Literals.SET_COMPREHENSION__GENERAL_EXPRESSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
