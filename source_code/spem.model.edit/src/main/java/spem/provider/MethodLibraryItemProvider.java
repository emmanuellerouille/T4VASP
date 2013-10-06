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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import spem.MethodLibrary;
import spem.SpemFactory;
import spem.SpemPackage;

import spem.uma.UmaFactory;

/**
 * This is the item provider adapter for a {@link spem.MethodLibrary} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodLibraryItemProvider
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
	public MethodLibraryItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addToolPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodLibrary_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodLibrary_name_feature", "_UI_MethodLibrary_type"),
				 SpemPackage.Literals.METHOD_LIBRARY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MethodLibrary_tool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MethodLibrary_tool_feature", "_UI_MethodLibrary_type"),
				 SpemPackage.Literals.METHOD_LIBRARY__TOOL,
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
			childrenFeatures.add(SpemPackage.Literals.METHOD_LIBRARY__OWNED_METHOD_PLUGIN);
			childrenFeatures.add(SpemPackage.Literals.METHOD_LIBRARY__PREDEFINED_CONFIGURATION);
			childrenFeatures.add(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE);
			childrenFeatures.add(SpemPackage.Literals.METHOD_LIBRARY__ANY);
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
	 * This returns MethodLibrary.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MethodLibrary"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MethodLibrary)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MethodLibrary_type") :
			getString("_UI_MethodLibrary_type") + " " + label;
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

		switch (notification.getFeatureID(MethodLibrary.class)) {
			case SpemPackage.METHOD_LIBRARY__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpemPackage.METHOD_LIBRARY__OWNED_METHOD_PLUGIN:
			case SpemPackage.METHOD_LIBRARY__PREDEFINED_CONFIGURATION:
			case SpemPackage.METHOD_LIBRARY__CONFIGURATION_PACKAGE:
			case SpemPackage.METHOD_LIBRARY__ANY:
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
				(SpemPackage.Literals.METHOD_LIBRARY__OWNED_METHOD_PLUGIN,
				 SpemFactory.eINSTANCE.createMethodPlugin()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__PREDEFINED_CONFIGURATION,
				 SpemFactory.eINSTANCE.createMethodConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE,
				 UmaFactory.eINSTANCE.createConfigurationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createWorkDefinitionParameter()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createWorkSequence()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createProcessPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createRoleUse()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createProcessResponsibilityAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createWorkProductUse()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createWorkProductUseRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createProcessParameter()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createMilestone()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createGuidance()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createMetric()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createToolDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createTaskDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createStep()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createWorkProductDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createRoleDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createWorkProductDefinitionRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createDefault_TaskDefinitionPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createDefault_ResponsibilityAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createDefault_TaskDefinitionParameter()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createQualification()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createMethodContentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createPlanningData()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createTaskUse()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createCompositeRole()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createTeamProfile()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createProcessComponent()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createProcessComponentUse()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createMethodConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createMethodPlugin()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createMethodLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createWorkProductPort()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createWorkProductPortConnector()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 SpemFactory.eINSTANCE.createWorkProductKind()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createCapabilityPattern()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createChecklist()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createConcept()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createCategoryPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createCustomCategory()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createDeliverable()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createDeliveryProcess()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createDiscipline()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createDisciplineGrouping()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createRoot()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createDomain()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createEstimatingConsideration()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createExample()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createIteration()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createPhase()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createPractice()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createProcessPlanningTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createReport()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createReusableAsset()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createRoadmap()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createTermDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createToolMentor()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createWhitepaper()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createGuideline()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createSupportingMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createRoleDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createTaskDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createWorkProductDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createGuidancePackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createDisciplinePackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createDomainPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createWorkProductKindPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createRoleSetPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createToolDefinitionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createConfigurationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createCapabilityPatternPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createDeliveryProcessPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createRoleSet()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createQualificationPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SpemPackage.Literals.METHOD_LIBRARY__ANY,
				 UmaFactory.eINSTANCE.createProcessComponentPackage()));
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
			childFeature == SpemPackage.Literals.METHOD_LIBRARY__OWNED_METHOD_PLUGIN ||
			childFeature == SpemPackage.Literals.METHOD_LIBRARY__ANY ||
			childFeature == SpemPackage.Literals.METHOD_LIBRARY__PREDEFINED_CONFIGURATION ||
			childFeature == SpemPackage.Literals.METHOD_LIBRARY__CONFIGURATION_PACKAGE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Spem2EditPlugin.INSTANCE;
	}

}
