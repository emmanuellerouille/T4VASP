/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.resolution.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.kermeta.cvl.resolution.ChoiceResolution;
import org.kermeta.cvl.resolution.ResolutionFactory;
import org.kermeta.cvl.resolution.ResolutionPackage;
import org.kermeta.cvl.resolution.VInstance;
import org.kermeta.cvl.resolution.VPackageResolution;
import org.kermeta.cvl.resolution.VariableValueAssignment;

import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResolutionPackageImpl extends EPackageImpl implements ResolutionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vPackageResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableValueAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vInstanceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.kermeta.cvl.resolution.ResolutionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResolutionPackageImpl() {
		super(eNS_URI, ResolutionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ResolutionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResolutionPackage init() {
		if (isInited) return (ResolutionPackage)EPackage.Registry.INSTANCE.getEPackage(ResolutionPackage.eNS_URI);

		// Obtain or create and register package
		ResolutionPackageImpl theResolutionPackage = (ResolutionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResolutionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResolutionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		VariabilityPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theResolutionPackage.createPackageContents();

		// Initialize created meta-data
		theResolutionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResolutionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResolutionPackage.eNS_URI, theResolutionPackage);
		return theResolutionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVPackageResolution() {
		return vPackageResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVPackageResolution_PackagedElements() {
		return (EReference)vPackageResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceResolution() {
		return choiceResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoiceResolution_Decision() {
		return (EAttribute)choiceResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoiceResolution_ResolvedChoice() {
		return (EReference)choiceResolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableValueAssignment() {
		return variableValueAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableValueAssignment_Value() {
		return (EReference)variableValueAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableValueAssignment_ResolvedVariable() {
		return (EReference)variableValueAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVInstance() {
		return vInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVInstance_Type() {
		return (EReference)vInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionFactory getResolutionFactory() {
		return (ResolutionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vPackageResolutionEClass = createEClass(VPACKAGE_RESOLUTION);
		createEReference(vPackageResolutionEClass, VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS);

		choiceResolutionEClass = createEClass(CHOICE_RESOLUTION);
		createEAttribute(choiceResolutionEClass, CHOICE_RESOLUTION__DECISION);
		createEReference(choiceResolutionEClass, CHOICE_RESOLUTION__RESOLVED_CHOICE);

		variableValueAssignmentEClass = createEClass(VARIABLE_VALUE_ASSIGNMENT);
		createEReference(variableValueAssignmentEClass, VARIABLE_VALUE_ASSIGNMENT__VALUE);
		createEReference(variableValueAssignmentEClass, VARIABLE_VALUE_ASSIGNMENT__RESOLVED_VARIABLE);

		vInstanceEClass = createEClass(VINSTANCE);
		createEReference(vInstanceEClass, VINSTANCE__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		VariabilityPackage theVariabilityPackage = (VariabilityPackage)EPackage.Registry.INSTANCE.getEPackage(VariabilityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		choiceResolutionEClass.getESuperTypes().add(theVariabilityPackage.getVSpecResolution());
		variableValueAssignmentEClass.getESuperTypes().add(theVariabilityPackage.getVSpecResolution());
		vInstanceEClass.getESuperTypes().add(theVariabilityPackage.getVSpecResolution());

		// Initialize classes and features; add operations and parameters
		initEClass(vPackageResolutionEClass, VPackageResolution.class, "VPackageResolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVPackageResolution_PackagedElements(), theVariabilityPackage.getVPackageable(), null, "packagedElements", null, 0, -1, VPackageResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceResolutionEClass, ChoiceResolution.class, "ChoiceResolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoiceResolution_Decision(), ecorePackage.getEBooleanObject(), "decision", "false", 1, 1, ChoiceResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChoiceResolution_ResolvedChoice(), theVariabilityPackage.getChoice(), null, "resolvedChoice", null, 1, 1, ChoiceResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableValueAssignmentEClass, VariableValueAssignment.class, "VariableValueAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableValueAssignment_Value(), theVariabilityPackage.getValueSpecification(), null, "value", null, 1, 1, VariableValueAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableValueAssignment_ResolvedVariable(), theVariabilityPackage.getVariable(), null, "resolvedVariable", null, 1, 1, VariableValueAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vInstanceEClass, VInstance.class, "VInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVInstance_Type(), theVariabilityPackage.getVClassifier(), null, "type", null, 1, 1, VInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ResolutionPackageImpl
