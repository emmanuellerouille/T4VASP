/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.kermeta.cvl.variability.ArithmeticCompareOp;
import org.kermeta.cvl.variability.ArithmeticFunction;
import org.kermeta.cvl.variability.BooleanValueSpec;
import org.kermeta.cvl.variability.BoundaryElementBinding;
import org.kermeta.cvl.variability.CVSpec;
import org.kermeta.cvl.variability.CVSpecDerivation;
import org.kermeta.cvl.variability.Choice;
import org.kermeta.cvl.variability.ChoiceDerivation;
import org.kermeta.cvl.variability.ChoiceVariationPoint;
import org.kermeta.cvl.variability.CompareExp;
import org.kermeta.cvl.variability.CompareOp;
import org.kermeta.cvl.variability.CompositeVariationPoint;
import org.kermeta.cvl.variability.ConfigurableUnit;
import org.kermeta.cvl.variability.ConfigurableUnitUsage;
import org.kermeta.cvl.variability.Constraint;
import org.kermeta.cvl.variability.Existence;
import org.kermeta.cvl.variability.Expression;
import org.kermeta.cvl.variability.Expression1;
import org.kermeta.cvl.variability.FixedObjectSubstitution;
import org.kermeta.cvl.variability.FixedSlotValueAssignment;
import org.kermeta.cvl.variability.FloatValueSpec;
import org.kermeta.cvl.variability.FragmentSubstitution;
import org.kermeta.cvl.variability.FromBinding;
import org.kermeta.cvl.variability.FromPlacement;
import org.kermeta.cvl.variability.FromReplacement;
import org.kermeta.cvl.variability.Function;
import org.kermeta.cvl.variability.FunctionExp;
import org.kermeta.cvl.variability.GeneralExpression;
import org.kermeta.cvl.variability.IntSetFunction;
import org.kermeta.cvl.variability.IntegerValueSpec;
import org.kermeta.cvl.variability.LinkAssignment;
import org.kermeta.cvl.variability.LinkExistence;
import org.kermeta.cvl.variability.LinkHandle;
import org.kermeta.cvl.variability.LogicalExp;
import org.kermeta.cvl.variability.LogicalOp;
import org.kermeta.cvl.variability.MultiplicityInterval;
import org.kermeta.cvl.variability.ObjectExistence;
import org.kermeta.cvl.variability.ObjectHandle;
import org.kermeta.cvl.variability.ObjectSpecification;
import org.kermeta.cvl.variability.ObjectSubstitution;
import org.kermeta.cvl.variability.ObjectType;
import org.kermeta.cvl.variability.OpaqueVariationPoint;
import org.kermeta.cvl.variability.ParametricLinkAssignment;
import org.kermeta.cvl.variability.ParametricObjectSubstitution;
import org.kermeta.cvl.variability.ParametricSlotAssignmet;
import org.kermeta.cvl.variability.ParametricVariationPoint;
import org.kermeta.cvl.variability.PlacementBoundaryElement;
import org.kermeta.cvl.variability.PlacementFragment;
import org.kermeta.cvl.variability.PrimitiveTypeEnum;
import org.kermeta.cvl.variability.PrimitiveValueSpecification;
import org.kermeta.cvl.variability.PrimitveType;
import org.kermeta.cvl.variability.PropositionalExp;
import org.kermeta.cvl.variability.QuantifiedSet;
import org.kermeta.cvl.variability.Quantifier;
import org.kermeta.cvl.variability.RepeatableVariationPoint;
import org.kermeta.cvl.variability.ReplacementBoundaryElement;
import org.kermeta.cvl.variability.ReplacementFragmentSpecification;
import org.kermeta.cvl.variability.ReplacementFragmentType;
import org.kermeta.cvl.variability.SetCompareOp;
import org.kermeta.cvl.variability.SetComprVarReference;
import org.kermeta.cvl.variability.SetComprVariable;
import org.kermeta.cvl.variability.SetComprehension;
import org.kermeta.cvl.variability.SetFunction;
import org.kermeta.cvl.variability.SlotAssignment;
import org.kermeta.cvl.variability.SlotValueExistence;
import org.kermeta.cvl.variability.StringFunction;
import org.kermeta.cvl.variability.StringValueSpec;
import org.kermeta.cvl.variability.ToBinding;
import org.kermeta.cvl.variability.ToPlacement;
import org.kermeta.cvl.variability.ToReplacement;
import org.kermeta.cvl.variability.VClassifier;
import org.kermeta.cvl.variability.VConfiguration;
import org.kermeta.cvl.variability.VInterface;
import org.kermeta.cvl.variability.VPackage;
import org.kermeta.cvl.variability.VPackageable;
import org.kermeta.cvl.variability.VSpec;
import org.kermeta.cvl.variability.VSpec2VSpecMapping;
import org.kermeta.cvl.variability.VSpecDerivation;
import org.kermeta.cvl.variability.VSpecReference;
import org.kermeta.cvl.variability.VSpecResolution;
import org.kermeta.cvl.variability.VSpecToConfigMapping;
import org.kermeta.cvl.variability.ValueSpecification;
import org.kermeta.cvl.variability.VariabilityFactory;
import org.kermeta.cvl.variability.VariabilityPackage;
import org.kermeta.cvl.variability.Variable;
import org.kermeta.cvl.variability.VariableDerivation;
import org.kermeta.cvl.variability.Variabletype;
import org.kermeta.cvl.variability.VariationPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariabilityPackageImpl extends EPackageImpl implements VariabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vPackageableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vSpecDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vSpecResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variationPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceVariationPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatableVariationPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryElementBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placementFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placementBoundaryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replacementFragmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variabletypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replacementBoundaryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectHandleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedSlotValueAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedObjectSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectExistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkHandleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurableUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeVariationPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cvSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vSpec2VSpecMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkExistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueVariationPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveValueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replacementFragmentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toPlacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toReplacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromPlacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromReplacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propositionalExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifiedSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setComprehensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setComprVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setComprVarReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatValueSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vSpecReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vSpecToConfigMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametricVariationPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotValueExistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametricLinkAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametricObjectSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametricSlotAssignmetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cvSpecDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurableUnitUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compareOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum setCompareOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmeticCompareOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stringFunctionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum setFunctionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intSetFunctionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmeticFunctionEEnum = null;

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
	 * @see org.kermeta.cvl.variability.VariabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VariabilityPackageImpl() {
		super(eNS_URI, VariabilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VariabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VariabilityPackage init() {
		if (isInited) return (VariabilityPackage)EPackage.Registry.INSTANCE.getEPackage(VariabilityPackage.eNS_URI);

		// Obtain or create and register package
		VariabilityPackageImpl theVariabilityPackage = (VariabilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VariabilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VariabilityPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVariabilityPackage.createPackageContents();

		// Initialize created meta-data
		theVariabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVariabilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VariabilityPackage.eNS_URI, theVariabilityPackage);
		return theVariabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoice_DefaultResolution() {
		return (EAttribute)choiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoice_IsImpliedByParent() {
		return (EAttribute)choiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSpec() {
		return vSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSpec_GroupMultiplicity() {
		return (EReference)vSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSpec_ResolutionTime() {
		return (EAttribute)vSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSpec_ChildVSpec() {
		return (EReference)vSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSpec_Derivation() {
		return (EReference)vSpecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVPackageable() {
		return vPackageableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVPackageable_Name() {
		return (EAttribute)vPackageableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityInterval() {
		return multiplicityIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityInterval_Upper() {
		return (EAttribute)multiplicityIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityInterval_Lower() {
		return (EAttribute)multiplicityIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSpecDerivation() {
		return vSpecDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSpecDerivation_DerivedVSpec() {
		return (EReference)vSpecDerivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVClassifier() {
		return vClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVClassifier_InstanceMultiplicity() {
		return (EReference)vClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSpecResolution() {
		return vSpecResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSpecResolution_ResolvedVSpec() {
		return (EReference)vSpecResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSpecResolution_ChildResolution() {
		return (EReference)vSpecResolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariationPoint() {
		return variationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariationPoint_BindingVspec() {
		return (EReference)variationPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFragmentSubstitution() {
		return fragmentSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragmentSubstitution_BoundaryElementBinding() {
		return (EReference)fragmentSubstitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragmentSubstitution_Placement() {
		return (EReference)fragmentSubstitutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFragmentSubstitution_Multi() {
		return (EAttribute)fragmentSubstitutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragmentSubstitution_Replacement() {
		return (EReference)fragmentSubstitutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceVariationPoint() {
		return choiceVariationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoiceVariationPoint_BindingChoice() {
		return (EReference)choiceVariationPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatableVariationPoint() {
		return repeatableVariationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatableVariationPoint_BindingClassifier() {
		return (EReference)repeatableVariationPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundaryElementBinding() {
		return boundaryElementBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundaryElementBinding_Name() {
		return (EAttribute)boundaryElementBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlacementFragment() {
		return placementFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlacementFragment_PlacementBoundaryElement() {
		return (EReference)placementFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlacementBoundaryElement() {
		return placementBoundaryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacementBoundaryElement_Name() {
		return (EAttribute)placementBoundaryElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplacementFragmentType() {
		return replacementFragmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplacementFragmentType_ReplacementBoundaryElement() {
		return (EReference)replacementFragmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplacementFragmentType_PlacementFragment() {
		return (EReference)replacementFragmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariabletype() {
		return variabletypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplacementBoundaryElement() {
		return replacementBoundaryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplacementBoundaryElement_Name() {
		return (EAttribute)replacementBoundaryElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSubstitution() {
		return objectSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSubstitution_PlacementObject() {
		return (EReference)objectSubstitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSubstitution_ReplacementObject() {
		return (EReference)objectSubstitutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectHandle() {
		return objectHandleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectHandle_Object() {
		return (EReference)objectHandleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectHandle_Ref() {
		return (EAttribute)objectHandleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistence() {
		return existenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_ReplacementFragmentTypesubsetstype() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_DefaulValue() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Type() {
		return (EReference)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecification_Type() {
		return (EReference)valueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitveType() {
		return primitveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitveType_Type() {
		return (EAttribute)primitveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectType() {
		return objectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_TheMetaClass() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVInterface() {
		return vInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVInterface_VSpec() {
		return (EReference)vInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVInterface_OwnedConstraint() {
		return (EReference)vInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVInterface_Super() {
		return (EReference)vInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_GeneralExpression() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Context() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Constraint() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_ConstraintLanguage() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralExpression() {
		return generalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotAssignment() {
		return slotAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotAssignment_SlotIdentifier() {
		return (EAttribute)slotAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotAssignment_Value() {
		return (EReference)slotAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotAssignment_SlotOwner() {
		return (EReference)slotAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedSlotValueAssignment() {
		return fixedSlotValueAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedObjectSubstitution() {
		return fixedObjectSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectExistence() {
		return objectExistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExistence_OptionalObject() {
		return (EReference)objectExistenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkAssignment() {
		return linkAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAssignment_Link() {
		return (EReference)linkAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkAssignment_LinkEndIdentifier() {
		return (EAttribute)linkAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAssignment_NewEnd() {
		return (EReference)linkAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkHandle() {
		return linkHandleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkHandle_LinkRef() {
		return (EAttribute)linkHandleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkHandle_LinkOwner() {
		return (EReference)linkHandleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkHandle_ReferencedObject() {
		return (EReference)linkHandleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurableUnit() {
		return configurableUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurableUnit_OwnedVSpec() {
		return (EReference)configurableUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurableUnit_OwnedVariationPoint() {
		return (EReference)configurableUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurableUnit_OwnedConstraint() {
		return (EReference)configurableUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurableUnit_ConfigurableContainerObject() {
		return (EReference)configurableUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurableUnit_OwnedVSpecResolution() {
		return (EReference)configurableUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeVariationPoint() {
		return compositeVariationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeVariationPoint_BindingCVSpec() {
		return (EReference)compositeVariationPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCVSpec() {
		return cvSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCVSpec_VInterface() {
		return (EReference)cvSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVConfiguration() {
		return vConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVConfiguration_VSpecResolution() {
		return (EReference)vConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVConfiguration_IsPartial() {
		return (EAttribute)vConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVConfiguration_Super() {
		return (EReference)vConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVConfiguration_ResolvedVIRef() {
		return (EReference)vConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSpec2VSpecMapping() {
		return vSpec2VSpecMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSpec2VSpecMapping_DerivingConstraint() {
		return (EReference)vSpec2VSpecMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkExistence() {
		return linkExistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkExistence_OptionalLink() {
		return (EReference)linkExistenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueVariationPoint() {
		return opaqueVariationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveValueSpecification() {
		return primitiveValueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveValueSpecification_Value() {
		return (EAttribute)primitiveValueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSpecification() {
		return objectSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSpecification_Object() {
		return (EReference)objectSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplacementFragmentSpecification() {
		return replacementFragmentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVPackage() {
		return vPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVPackage_PackageElement() {
		return (EReference)vPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToBinding() {
		return toBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToBinding_ToPlacement() {
		return (EReference)toBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToBinding_ToReplacement() {
		return (EReference)toBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToPlacement() {
		return toPlacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToPlacement_ToReplacement() {
		return (EReference)toPlacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToPlacement_PropertyName() {
		return (EAttribute)toPlacementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToPlacement_InsideBoundaryElement() {
		return (EReference)toPlacementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToPlacement_OutsideBoundaryElement() {
		return (EReference)toPlacementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToReplacement() {
		return toReplacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToReplacement_InsideBoundaryElement() {
		return (EReference)toReplacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToReplacement_ToPlacement() {
		return (EReference)toReplacementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFromBinding() {
		return fromBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromBinding_FromPlacement() {
		return (EReference)fromBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromBinding_FromReplacement() {
		return (EReference)fromBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFromPlacement() {
		return fromPlacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromPlacement_FromReplacement() {
		return (EReference)fromPlacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromPlacement_OutsideBoundaryElement() {
		return (EReference)fromPlacementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFromReplacement() {
		return fromReplacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFromReplacement_PropertyName() {
		return (EAttribute)fromReplacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromReplacement_InsideBoundaryElement() {
		return (EReference)fromReplacementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromReplacement_OutsideBoundaryElement() {
		return (EReference)fromReplacementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFromReplacement_FromPlacement() {
		return (EReference)fromReplacementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropositionalExp() {
		return propositionalExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropositionalExp_LogicalOp() {
		return (EAttribute)propositionalExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropositionalExp_Operand() {
		return (EReference)propositionalExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalExp() {
		return logicalExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifiedSet() {
		return quantifiedSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantifiedSet_Quantifier() {
		return (EAttribute)quantifiedSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetComprehension() {
		return setComprehensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetComprehension_Expression() {
		return (EReference)setComprehensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetComprehension_SetComprVariable() {
		return (EReference)setComprehensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetComprehension_GeneralExpression() {
		return (EReference)setComprehensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetComprVariable() {
		return setComprVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetComprVariable_Name() {
		return (EAttribute)setComprVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetComprVarReference() {
		return setComprVarReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetComprVarReference_SetComprVariable() {
		return (EReference)setComprVarReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompareExp() {
		return compareExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompareExp_Compared() {
		return (EReference)compareExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompareExp_CompareOp() {
		return (EAttribute)compareExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValueSpec() {
		return integerValueSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValueSpec() {
		return booleanValueSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatValueSpec() {
		return floatValueSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValueSpec() {
		return stringValueSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionExp() {
		return functionExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionExp_Function() {
		return (EAttribute)functionExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionExp_Operand() {
		return (EReference)functionExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSpecReference() {
		return vSpecReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSpecReference_VSpec() {
		return (EReference)vSpecReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSpecToConfigMapping() {
		return vSpecToConfigMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSpecToConfigMapping_ThenConfiguration() {
		return (EReference)vSpecToConfigMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSpecToConfigMapping_IfConstraint() {
		return (EReference)vSpecToConfigMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametricVariationPoint() {
		return parametricVariationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametricVariationPoint_BindingVariable() {
		return (EReference)parametricVariationPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotValueExistence() {
		return slotValueExistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotValueExistence_SlotIdentifier() {
		return (EAttribute)slotValueExistenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlotValueExistence_SlotOwner() {
		return (EReference)slotValueExistenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametricLinkAssignment() {
		return parametricLinkAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametricLinkAssignment_LinkEndIdentifier() {
		return (EAttribute)parametricLinkAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametricLinkAssignment_Link() {
		return (EReference)parametricLinkAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametricObjectSubstitution() {
		return parametricObjectSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametricObjectSubstitution_PlacementObject() {
		return (EReference)parametricObjectSubstitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametricSlotAssignmet() {
		return parametricSlotAssignmetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametricSlotAssignmet_SlotIdentifier() {
		return (EAttribute)parametricSlotAssignmetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametricSlotAssignmet_SlotOwner() {
		return (EReference)parametricSlotAssignmetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression1() {
		return expression1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression1_Expression() {
		return (EAttribute)expression1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression1_ExpressionLanguage() {
		return (EAttribute)expression1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceDerivation() {
		return choiceDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoiceDerivation_DerivingConstraint() {
		return (EReference)choiceDerivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDerivation() {
		return variableDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDerivation_DerivingExpression() {
		return (EReference)variableDerivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCVSpecDerivation() {
		return cvSpecDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCVSpecDerivation_MemberDerivation() {
		return (EReference)cvSpecDerivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurableUnitUsage() {
		return configurableUnitUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurableUnitUsage_UsedUnit() {
		return (EReference)configurableUnitUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurableUnitUsage_UsageReference() {
		return (EReference)configurableUnitUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurableUnitUsage_LinkEndIdentifier() {
		return (EAttribute)configurableUnitUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveTypeEnum() {
		return primitiveTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOp() {
		return logicalOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantifier() {
		return quantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompareOp() {
		return compareOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSetCompareOp() {
		return setCompareOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArithmeticCompareOp() {
		return arithmeticCompareOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFunction() {
		return functionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStringFunction() {
		return stringFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSetFunction() {
		return setFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntSetFunction() {
		return intSetFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArithmeticFunction() {
		return arithmeticFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityFactory getVariabilityFactory() {
		return (VariabilityFactory)getEFactoryInstance();
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
		choiceEClass = createEClass(CHOICE);
		createEAttribute(choiceEClass, CHOICE__DEFAULT_RESOLUTION);
		createEAttribute(choiceEClass, CHOICE__IS_IMPLIED_BY_PARENT);

		vSpecEClass = createEClass(VSPEC);
		createEReference(vSpecEClass, VSPEC__GROUP_MULTIPLICITY);
		createEAttribute(vSpecEClass, VSPEC__RESOLUTION_TIME);
		createEReference(vSpecEClass, VSPEC__CHILD_VSPEC);
		createEReference(vSpecEClass, VSPEC__DERIVATION);

		vPackageableEClass = createEClass(VPACKAGEABLE);
		createEAttribute(vPackageableEClass, VPACKAGEABLE__NAME);

		multiplicityIntervalEClass = createEClass(MULTIPLICITY_INTERVAL);
		createEAttribute(multiplicityIntervalEClass, MULTIPLICITY_INTERVAL__UPPER);
		createEAttribute(multiplicityIntervalEClass, MULTIPLICITY_INTERVAL__LOWER);

		vSpecDerivationEClass = createEClass(VSPEC_DERIVATION);
		createEReference(vSpecDerivationEClass, VSPEC_DERIVATION__DERIVED_VSPEC);

		vClassifierEClass = createEClass(VCLASSIFIER);
		createEReference(vClassifierEClass, VCLASSIFIER__INSTANCE_MULTIPLICITY);

		vSpecResolutionEClass = createEClass(VSPEC_RESOLUTION);
		createEReference(vSpecResolutionEClass, VSPEC_RESOLUTION__RESOLVED_VSPEC);
		createEReference(vSpecResolutionEClass, VSPEC_RESOLUTION__CHILD_RESOLUTION);

		variationPointEClass = createEClass(VARIATION_POINT);
		createEReference(variationPointEClass, VARIATION_POINT__BINDING_VSPEC);

		fragmentSubstitutionEClass = createEClass(FRAGMENT_SUBSTITUTION);
		createEReference(fragmentSubstitutionEClass, FRAGMENT_SUBSTITUTION__BOUNDARY_ELEMENT_BINDING);
		createEReference(fragmentSubstitutionEClass, FRAGMENT_SUBSTITUTION__PLACEMENT);
		createEAttribute(fragmentSubstitutionEClass, FRAGMENT_SUBSTITUTION__MULTI);
		createEReference(fragmentSubstitutionEClass, FRAGMENT_SUBSTITUTION__REPLACEMENT);

		choiceVariationPointEClass = createEClass(CHOICE_VARIATION_POINT);
		createEReference(choiceVariationPointEClass, CHOICE_VARIATION_POINT__BINDING_CHOICE);

		repeatableVariationPointEClass = createEClass(REPEATABLE_VARIATION_POINT);
		createEReference(repeatableVariationPointEClass, REPEATABLE_VARIATION_POINT__BINDING_CLASSIFIER);

		boundaryElementBindingEClass = createEClass(BOUNDARY_ELEMENT_BINDING);
		createEAttribute(boundaryElementBindingEClass, BOUNDARY_ELEMENT_BINDING__NAME);

		placementFragmentEClass = createEClass(PLACEMENT_FRAGMENT);
		createEReference(placementFragmentEClass, PLACEMENT_FRAGMENT__PLACEMENT_BOUNDARY_ELEMENT);

		placementBoundaryElementEClass = createEClass(PLACEMENT_BOUNDARY_ELEMENT);
		createEAttribute(placementBoundaryElementEClass, PLACEMENT_BOUNDARY_ELEMENT__NAME);

		replacementFragmentTypeEClass = createEClass(REPLACEMENT_FRAGMENT_TYPE);
		createEReference(replacementFragmentTypeEClass, REPLACEMENT_FRAGMENT_TYPE__REPLACEMENT_BOUNDARY_ELEMENT);
		createEReference(replacementFragmentTypeEClass, REPLACEMENT_FRAGMENT_TYPE__PLACEMENT_FRAGMENT);

		variabletypeEClass = createEClass(VARIABLETYPE);

		replacementBoundaryElementEClass = createEClass(REPLACEMENT_BOUNDARY_ELEMENT);
		createEAttribute(replacementBoundaryElementEClass, REPLACEMENT_BOUNDARY_ELEMENT__NAME);

		objectSubstitutionEClass = createEClass(OBJECT_SUBSTITUTION);
		createEReference(objectSubstitutionEClass, OBJECT_SUBSTITUTION__PLACEMENT_OBJECT);
		createEReference(objectSubstitutionEClass, OBJECT_SUBSTITUTION__REPLACEMENT_OBJECT);

		objectHandleEClass = createEClass(OBJECT_HANDLE);
		createEReference(objectHandleEClass, OBJECT_HANDLE__OBJECT);
		createEAttribute(objectHandleEClass, OBJECT_HANDLE__REF);

		existenceEClass = createEClass(EXISTENCE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__REPLACEMENT_FRAGMENT_TYPESUBSETSTYPE);
		createEReference(variableEClass, VARIABLE__DEFAUL_VALUE);
		createEReference(variableEClass, VARIABLE__TYPE);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);
		createEReference(valueSpecificationEClass, VALUE_SPECIFICATION__TYPE);

		primitveTypeEClass = createEClass(PRIMITVE_TYPE);
		createEAttribute(primitveTypeEClass, PRIMITVE_TYPE__TYPE);

		objectTypeEClass = createEClass(OBJECT_TYPE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__THE_META_CLASS);

		vInterfaceEClass = createEClass(VINTERFACE);
		createEReference(vInterfaceEClass, VINTERFACE__VSPEC);
		createEReference(vInterfaceEClass, VINTERFACE__OWNED_CONSTRAINT);
		createEReference(vInterfaceEClass, VINTERFACE__SUPER);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__GENERAL_EXPRESSION);
		createEReference(constraintEClass, CONSTRAINT__CONTEXT);
		createEAttribute(constraintEClass, CONSTRAINT__CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__CONSTRAINT_LANGUAGE);

		generalExpressionEClass = createEClass(GENERAL_EXPRESSION);

		slotAssignmentEClass = createEClass(SLOT_ASSIGNMENT);
		createEAttribute(slotAssignmentEClass, SLOT_ASSIGNMENT__SLOT_IDENTIFIER);
		createEReference(slotAssignmentEClass, SLOT_ASSIGNMENT__VALUE);
		createEReference(slotAssignmentEClass, SLOT_ASSIGNMENT__SLOT_OWNER);

		fixedSlotValueAssignmentEClass = createEClass(FIXED_SLOT_VALUE_ASSIGNMENT);

		fixedObjectSubstitutionEClass = createEClass(FIXED_OBJECT_SUBSTITUTION);

		objectExistenceEClass = createEClass(OBJECT_EXISTENCE);
		createEReference(objectExistenceEClass, OBJECT_EXISTENCE__OPTIONAL_OBJECT);

		linkAssignmentEClass = createEClass(LINK_ASSIGNMENT);
		createEReference(linkAssignmentEClass, LINK_ASSIGNMENT__LINK);
		createEAttribute(linkAssignmentEClass, LINK_ASSIGNMENT__LINK_END_IDENTIFIER);
		createEReference(linkAssignmentEClass, LINK_ASSIGNMENT__NEW_END);

		linkHandleEClass = createEClass(LINK_HANDLE);
		createEAttribute(linkHandleEClass, LINK_HANDLE__LINK_REF);
		createEReference(linkHandleEClass, LINK_HANDLE__LINK_OWNER);
		createEReference(linkHandleEClass, LINK_HANDLE__REFERENCED_OBJECT);

		configurableUnitEClass = createEClass(CONFIGURABLE_UNIT);
		createEReference(configurableUnitEClass, CONFIGURABLE_UNIT__OWNED_VSPEC);
		createEReference(configurableUnitEClass, CONFIGURABLE_UNIT__OWNED_VARIATION_POINT);
		createEReference(configurableUnitEClass, CONFIGURABLE_UNIT__OWNED_CONSTRAINT);
		createEReference(configurableUnitEClass, CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT);
		createEReference(configurableUnitEClass, CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION);

		compositeVariationPointEClass = createEClass(COMPOSITE_VARIATION_POINT);
		createEReference(compositeVariationPointEClass, COMPOSITE_VARIATION_POINT__BINDING_CV_SPEC);

		cvSpecEClass = createEClass(CV_SPEC);
		createEReference(cvSpecEClass, CV_SPEC__VINTERFACE);

		vConfigurationEClass = createEClass(VCONFIGURATION);
		createEReference(vConfigurationEClass, VCONFIGURATION__VSPEC_RESOLUTION);
		createEAttribute(vConfigurationEClass, VCONFIGURATION__IS_PARTIAL);
		createEReference(vConfigurationEClass, VCONFIGURATION__SUPER);
		createEReference(vConfigurationEClass, VCONFIGURATION__RESOLVED_VI_REF);

		vSpec2VSpecMappingEClass = createEClass(VSPEC2_VSPEC_MAPPING);
		createEReference(vSpec2VSpecMappingEClass, VSPEC2_VSPEC_MAPPING__DERIVING_CONSTRAINT);

		linkExistenceEClass = createEClass(LINK_EXISTENCE);
		createEReference(linkExistenceEClass, LINK_EXISTENCE__OPTIONAL_LINK);

		opaqueVariationPointEClass = createEClass(OPAQUE_VARIATION_POINT);

		primitiveValueSpecificationEClass = createEClass(PRIMITIVE_VALUE_SPECIFICATION);
		createEAttribute(primitiveValueSpecificationEClass, PRIMITIVE_VALUE_SPECIFICATION__VALUE);

		expressionEClass = createEClass(EXPRESSION);

		objectSpecificationEClass = createEClass(OBJECT_SPECIFICATION);
		createEReference(objectSpecificationEClass, OBJECT_SPECIFICATION__OBJECT);

		replacementFragmentSpecificationEClass = createEClass(REPLACEMENT_FRAGMENT_SPECIFICATION);

		vPackageEClass = createEClass(VPACKAGE);
		createEReference(vPackageEClass, VPACKAGE__PACKAGE_ELEMENT);

		toBindingEClass = createEClass(TO_BINDING);
		createEReference(toBindingEClass, TO_BINDING__TO_PLACEMENT);
		createEReference(toBindingEClass, TO_BINDING__TO_REPLACEMENT);

		toPlacementEClass = createEClass(TO_PLACEMENT);
		createEReference(toPlacementEClass, TO_PLACEMENT__TO_REPLACEMENT);
		createEAttribute(toPlacementEClass, TO_PLACEMENT__PROPERTY_NAME);
		createEReference(toPlacementEClass, TO_PLACEMENT__INSIDE_BOUNDARY_ELEMENT);
		createEReference(toPlacementEClass, TO_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT);

		toReplacementEClass = createEClass(TO_REPLACEMENT);
		createEReference(toReplacementEClass, TO_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT);
		createEReference(toReplacementEClass, TO_REPLACEMENT__TO_PLACEMENT);

		fromBindingEClass = createEClass(FROM_BINDING);
		createEReference(fromBindingEClass, FROM_BINDING__FROM_PLACEMENT);
		createEReference(fromBindingEClass, FROM_BINDING__FROM_REPLACEMENT);

		fromPlacementEClass = createEClass(FROM_PLACEMENT);
		createEReference(fromPlacementEClass, FROM_PLACEMENT__FROM_REPLACEMENT);
		createEReference(fromPlacementEClass, FROM_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT);

		fromReplacementEClass = createEClass(FROM_REPLACEMENT);
		createEAttribute(fromReplacementEClass, FROM_REPLACEMENT__PROPERTY_NAME);
		createEReference(fromReplacementEClass, FROM_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT);
		createEReference(fromReplacementEClass, FROM_REPLACEMENT__OUTSIDE_BOUNDARY_ELEMENT);
		createEReference(fromReplacementEClass, FROM_REPLACEMENT__FROM_PLACEMENT);

		propositionalExpEClass = createEClass(PROPOSITIONAL_EXP);
		createEAttribute(propositionalExpEClass, PROPOSITIONAL_EXP__LOGICAL_OP);
		createEReference(propositionalExpEClass, PROPOSITIONAL_EXP__OPERAND);

		logicalExpEClass = createEClass(LOGICAL_EXP);

		quantifiedSetEClass = createEClass(QUANTIFIED_SET);
		createEAttribute(quantifiedSetEClass, QUANTIFIED_SET__QUANTIFIER);

		setComprehensionEClass = createEClass(SET_COMPREHENSION);
		createEReference(setComprehensionEClass, SET_COMPREHENSION__EXPRESSION);
		createEReference(setComprehensionEClass, SET_COMPREHENSION__SET_COMPR_VARIABLE);
		createEReference(setComprehensionEClass, SET_COMPREHENSION__GENERAL_EXPRESSION);

		setComprVariableEClass = createEClass(SET_COMPR_VARIABLE);
		createEAttribute(setComprVariableEClass, SET_COMPR_VARIABLE__NAME);

		setComprVarReferenceEClass = createEClass(SET_COMPR_VAR_REFERENCE);
		createEReference(setComprVarReferenceEClass, SET_COMPR_VAR_REFERENCE__SET_COMPR_VARIABLE);

		compareExpEClass = createEClass(COMPARE_EXP);
		createEReference(compareExpEClass, COMPARE_EXP__COMPARED);
		createEAttribute(compareExpEClass, COMPARE_EXP__COMPARE_OP);

		integerValueSpecEClass = createEClass(INTEGER_VALUE_SPEC);

		booleanValueSpecEClass = createEClass(BOOLEAN_VALUE_SPEC);

		floatValueSpecEClass = createEClass(FLOAT_VALUE_SPEC);

		stringValueSpecEClass = createEClass(STRING_VALUE_SPEC);

		functionExpEClass = createEClass(FUNCTION_EXP);
		createEAttribute(functionExpEClass, FUNCTION_EXP__FUNCTION);
		createEReference(functionExpEClass, FUNCTION_EXP__OPERAND);

		vSpecReferenceEClass = createEClass(VSPEC_REFERENCE);
		createEReference(vSpecReferenceEClass, VSPEC_REFERENCE__VSPEC);

		vSpecToConfigMappingEClass = createEClass(VSPEC_TO_CONFIG_MAPPING);
		createEReference(vSpecToConfigMappingEClass, VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION);
		createEReference(vSpecToConfigMappingEClass, VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT);

		parametricVariationPointEClass = createEClass(PARAMETRIC_VARIATION_POINT);
		createEReference(parametricVariationPointEClass, PARAMETRIC_VARIATION_POINT__BINDING_VARIABLE);

		slotValueExistenceEClass = createEClass(SLOT_VALUE_EXISTENCE);
		createEAttribute(slotValueExistenceEClass, SLOT_VALUE_EXISTENCE__SLOT_IDENTIFIER);
		createEReference(slotValueExistenceEClass, SLOT_VALUE_EXISTENCE__SLOT_OWNER);

		parametricLinkAssignmentEClass = createEClass(PARAMETRIC_LINK_ASSIGNMENT);
		createEAttribute(parametricLinkAssignmentEClass, PARAMETRIC_LINK_ASSIGNMENT__LINK_END_IDENTIFIER);
		createEReference(parametricLinkAssignmentEClass, PARAMETRIC_LINK_ASSIGNMENT__LINK);

		parametricObjectSubstitutionEClass = createEClass(PARAMETRIC_OBJECT_SUBSTITUTION);
		createEReference(parametricObjectSubstitutionEClass, PARAMETRIC_OBJECT_SUBSTITUTION__PLACEMENT_OBJECT);

		parametricSlotAssignmetEClass = createEClass(PARAMETRIC_SLOT_ASSIGNMET);
		createEAttribute(parametricSlotAssignmetEClass, PARAMETRIC_SLOT_ASSIGNMET__SLOT_IDENTIFIER);
		createEReference(parametricSlotAssignmetEClass, PARAMETRIC_SLOT_ASSIGNMET__SLOT_OWNER);

		expression1EClass = createEClass(EXPRESSION1);
		createEAttribute(expression1EClass, EXPRESSION1__EXPRESSION);
		createEAttribute(expression1EClass, EXPRESSION1__EXPRESSION_LANGUAGE);

		choiceDerivationEClass = createEClass(CHOICE_DERIVATION);
		createEReference(choiceDerivationEClass, CHOICE_DERIVATION__DERIVING_CONSTRAINT);

		variableDerivationEClass = createEClass(VARIABLE_DERIVATION);
		createEReference(variableDerivationEClass, VARIABLE_DERIVATION__DERIVING_EXPRESSION);

		cvSpecDerivationEClass = createEClass(CV_SPEC_DERIVATION);
		createEReference(cvSpecDerivationEClass, CV_SPEC_DERIVATION__MEMBER_DERIVATION);

		configurableUnitUsageEClass = createEClass(CONFIGURABLE_UNIT_USAGE);
		createEReference(configurableUnitUsageEClass, CONFIGURABLE_UNIT_USAGE__USED_UNIT);
		createEReference(configurableUnitUsageEClass, CONFIGURABLE_UNIT_USAGE__USAGE_REFERENCE);
		createEAttribute(configurableUnitUsageEClass, CONFIGURABLE_UNIT_USAGE__LINK_END_IDENTIFIER);

		// Create enums
		primitiveTypeEnumEEnum = createEEnum(PRIMITIVE_TYPE_ENUM);
		logicalOpEEnum = createEEnum(LOGICAL_OP);
		quantifierEEnum = createEEnum(QUANTIFIER);
		compareOpEEnum = createEEnum(COMPARE_OP);
		setCompareOpEEnum = createEEnum(SET_COMPARE_OP);
		arithmeticCompareOpEEnum = createEEnum(ARITHMETIC_COMPARE_OP);
		functionEEnum = createEEnum(FUNCTION);
		stringFunctionEEnum = createEEnum(STRING_FUNCTION);
		setFunctionEEnum = createEEnum(SET_FUNCTION);
		intSetFunctionEEnum = createEEnum(INT_SET_FUNCTION);
		arithmeticFunctionEEnum = createEEnum(ARITHMETIC_FUNCTION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		choiceEClass.getESuperTypes().add(this.getVSpec());
		vSpecEClass.getESuperTypes().add(this.getVPackageable());
		vClassifierEClass.getESuperTypes().add(this.getVSpec());
		vSpecResolutionEClass.getESuperTypes().add(this.getVPackageable());
		variationPointEClass.getESuperTypes().add(this.getVPackageable());
		fragmentSubstitutionEClass.getESuperTypes().add(this.getChoiceVariationPoint());
		fragmentSubstitutionEClass.getESuperTypes().add(this.getRepeatableVariationPoint());
		choiceVariationPointEClass.getESuperTypes().add(this.getVariationPoint());
		repeatableVariationPointEClass.getESuperTypes().add(this.getVariationPoint());
		placementFragmentEClass.getESuperTypes().add(this.getVariationPoint());
		replacementFragmentTypeEClass.getESuperTypes().add(this.getVariabletype());
		replacementFragmentTypeEClass.getESuperTypes().add(this.getVPackageable());
		objectSubstitutionEClass.getESuperTypes().add(this.getChoiceVariationPoint());
		objectHandleEClass.getESuperTypes().add(this.getVPackageable());
		existenceEClass.getESuperTypes().add(this.getChoiceVariationPoint());
		variableEClass.getESuperTypes().add(this.getVSpec());
		valueSpecificationEClass.getESuperTypes().add(this.getVPackageable());
		primitveTypeEClass.getESuperTypes().add(this.getVariabletype());
		objectTypeEClass.getESuperTypes().add(this.getVariabletype());
		vInterfaceEClass.getESuperTypes().add(this.getVPackageable());
		constraintEClass.getESuperTypes().add(this.getVPackageable());
		slotAssignmentEClass.getESuperTypes().add(this.getChoiceVariationPoint());
		objectExistenceEClass.getESuperTypes().add(this.getExistence());
		linkAssignmentEClass.getESuperTypes().add(this.getChoiceVariationPoint());
		linkHandleEClass.getESuperTypes().add(this.getVPackageable());
		configurableUnitEClass.getESuperTypes().add(this.getCompositeVariationPoint());
		compositeVariationPointEClass.getESuperTypes().add(this.getVariationPoint());
		cvSpecEClass.getESuperTypes().add(this.getVSpec());
		vConfigurationEClass.getESuperTypes().add(this.getVSpecResolution());
		vConfigurationEClass.getESuperTypes().add(this.getVPackageable());
		linkExistenceEClass.getESuperTypes().add(this.getExistence());
		opaqueVariationPointEClass.getESuperTypes().add(this.getVariationPoint());
		primitiveValueSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		primitiveValueSpecificationEClass.getESuperTypes().add(this.getExpression1());
		expressionEClass.getESuperTypes().add(this.getGeneralExpression());
		objectSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		replacementFragmentSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		vPackageEClass.getESuperTypes().add(this.getVPackageable());
		toBindingEClass.getESuperTypes().add(this.getBoundaryElementBinding());
		toPlacementEClass.getESuperTypes().add(this.getPlacementBoundaryElement());
		toReplacementEClass.getESuperTypes().add(this.getReplacementBoundaryElement());
		fromBindingEClass.getESuperTypes().add(this.getBoundaryElementBinding());
		fromPlacementEClass.getESuperTypes().add(this.getPlacementBoundaryElement());
		fromReplacementEClass.getESuperTypes().add(this.getReplacementBoundaryElement());
		propositionalExpEClass.getESuperTypes().add(this.getLogicalExp());
		logicalExpEClass.getESuperTypes().add(this.getGeneralExpression());
		quantifiedSetEClass.getESuperTypes().add(this.getSetComprehension());
		quantifiedSetEClass.getESuperTypes().add(this.getLogicalExp());
		setComprehensionEClass.getESuperTypes().add(this.getExpression());
		setComprVarReferenceEClass.getESuperTypes().add(this.getExpression());
		compareExpEClass.getESuperTypes().add(this.getLogicalExp());
		integerValueSpecEClass.getESuperTypes().add(this.getPrimitiveValueSpecification());
		booleanValueSpecEClass.getESuperTypes().add(this.getPrimitiveValueSpecification());
		floatValueSpecEClass.getESuperTypes().add(this.getPrimitiveValueSpecification());
		stringValueSpecEClass.getESuperTypes().add(this.getPrimitiveValueSpecification());
		functionExpEClass.getESuperTypes().add(this.getExpression());
		vSpecReferenceEClass.getESuperTypes().add(this.getExpression());
		parametricVariationPointEClass.getESuperTypes().add(this.getVariationPoint());
		slotValueExistenceEClass.getESuperTypes().add(this.getExistence());
		parametricLinkAssignmentEClass.getESuperTypes().add(this.getParametricVariationPoint());
		parametricObjectSubstitutionEClass.getESuperTypes().add(this.getParametricVariationPoint());
		parametricSlotAssignmetEClass.getESuperTypes().add(this.getParametricVariationPoint());
		choiceDerivationEClass.getESuperTypes().add(this.getVSpecDerivation());
		variableDerivationEClass.getESuperTypes().add(this.getVSpecDerivation());
		cvSpecDerivationEClass.getESuperTypes().add(this.getVSpecDerivation());
		configurableUnitUsageEClass.getESuperTypes().add(this.getCompositeVariationPoint());

		// Initialize classes and features; add operations and parameters
		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoice_DefaultResolution(), ecorePackage.getEBoolean(), "defaultResolution", null, 0, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getChoice_IsImpliedByParent(), ecorePackage.getEBoolean(), "isImpliedByParent", null, 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vSpecEClass, VSpec.class, "VSpec", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSpec_GroupMultiplicity(), this.getMultiplicityInterval(), null, "groupMultiplicity", null, 0, 1, VSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVSpec_ResolutionTime(), ecorePackage.getEString(), "resolutionTime", null, 1, 1, VSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVSpec_ChildVSpec(), this.getVSpec(), null, "childVSpec", null, 0, -1, VSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSpec_Derivation(), this.getVSpecDerivation(), null, "derivation", null, 0, 1, VSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vPackageableEClass, VPackageable.class, "VPackageable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVPackageable_Name(), ecorePackage.getEString(), "name", null, 0, 1, VPackageable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityIntervalEClass, MultiplicityInterval.class, "MultiplicityInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityInterval_Upper(), ecorePackage.getEInt(), "upper", null, 1, 1, MultiplicityInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiplicityInterval_Lower(), ecorePackage.getEInt(), "lower", null, 1, 1, MultiplicityInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vSpecDerivationEClass, VSpecDerivation.class, "VSpecDerivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSpecDerivation_DerivedVSpec(), this.getVSpec(), null, "derivedVSpec", null, 1, 1, VSpecDerivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vClassifierEClass, VClassifier.class, "VClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVClassifier_InstanceMultiplicity(), this.getMultiplicityInterval(), null, "instanceMultiplicity", null, 1, 1, VClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vSpecResolutionEClass, VSpecResolution.class, "VSpecResolution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSpecResolution_ResolvedVSpec(), this.getVSpec(), null, "resolvedVSpec", null, 1, 1, VSpecResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVSpecResolution_ChildResolution(), this.getVSpecResolution(), null, "childResolution", null, 0, -1, VSpecResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variationPointEClass, VariationPoint.class, "VariationPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariationPoint_BindingVspec(), this.getVSpec(), null, "bindingVspec", null, 0, -1, VariationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fragmentSubstitutionEClass, FragmentSubstitution.class, "FragmentSubstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFragmentSubstitution_BoundaryElementBinding(), this.getBoundaryElementBinding(), null, "boundaryElementBinding", null, 0, -1, FragmentSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFragmentSubstitution_Placement(), this.getPlacementFragment(), null, "placement", null, 1, 1, FragmentSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFragmentSubstitution_Multi(), ecorePackage.getEBoolean(), "multi", null, 1, 1, FragmentSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFragmentSubstitution_Replacement(), this.getReplacementFragmentType(), null, "replacement", null, 0, 1, FragmentSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(choiceVariationPointEClass, ChoiceVariationPoint.class, "ChoiceVariationPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoiceVariationPoint_BindingChoice(), this.getChoice(), null, "bindingChoice", null, 0, -1, ChoiceVariationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(repeatableVariationPointEClass, RepeatableVariationPoint.class, "RepeatableVariationPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatableVariationPoint_BindingClassifier(), this.getVClassifier(), null, "bindingClassifier", null, 1, 1, RepeatableVariationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(boundaryElementBindingEClass, BoundaryElementBinding.class, "BoundaryElementBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundaryElementBinding_Name(), ecorePackage.getEString(), "name", null, 0, 1, BoundaryElementBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placementFragmentEClass, PlacementFragment.class, "PlacementFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlacementFragment_PlacementBoundaryElement(), this.getPlacementBoundaryElement(), null, "placementBoundaryElement", null, 0, -1, PlacementFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(placementBoundaryElementEClass, PlacementBoundaryElement.class, "PlacementBoundaryElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlacementBoundaryElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, PlacementBoundaryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replacementFragmentTypeEClass, ReplacementFragmentType.class, "ReplacementFragmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplacementFragmentType_ReplacementBoundaryElement(), this.getReplacementBoundaryElement(), null, "replacementBoundaryElement", null, 0, -1, ReplacementFragmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReplacementFragmentType_PlacementFragment(), this.getPlacementFragment(), null, "placementFragment", null, 0, -1, ReplacementFragmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variabletypeEClass, Variabletype.class, "Variabletype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(replacementBoundaryElementEClass, ReplacementBoundaryElement.class, "ReplacementBoundaryElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplacementBoundaryElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReplacementBoundaryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectSubstitutionEClass, ObjectSubstitution.class, "ObjectSubstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectSubstitution_PlacementObject(), this.getObjectHandle(), null, "placementObject", null, 1, 1, ObjectSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectSubstitution_ReplacementObject(), this.getObjectHandle(), null, "replacementObject", null, 1, 1, ObjectSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectHandleEClass, ObjectHandle.class, "ObjectHandle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectHandle_Object(), ecorePackage.getEObject(), null, "object", null, 0, 1, ObjectHandle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectHandle_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, ObjectHandle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(objectHandleEClass, ecorePackage.getEObject(), "getPropertyByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "propertyName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectHandleEClass, null, "getPropertyValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "propertyName", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(existenceEClass, Existence.class, "Existence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_ReplacementFragmentTypesubsetstype(), this.getReplacementFragmentType(), null, "replacementFragmentTypesubsetstype", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVariable_DefaulValue(), this.getValueSpecification(), null, "defaulValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVariable_Type(), this.getVariabletype(), null, "type", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSpecification_Type(), this.getVariabletype(), null, "type", null, 1, 1, ValueSpecification.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(primitveTypeEClass, PrimitveType.class, "PrimitveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitveType_Type(), this.getPrimitiveTypeEnum(), "type", null, 1, 1, PrimitveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectTypeEClass, ObjectType.class, "ObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectType_TheMetaClass(), ecorePackage.getEString(), "theMetaClass", null, 1, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vInterfaceEClass, VInterface.class, "VInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVInterface_VSpec(), this.getVSpec(), null, "vSpec", null, 0, -1, VInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVInterface_OwnedConstraint(), this.getConstraint(), null, "ownedConstraint", null, 0, -1, VInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVInterface_Super(), this.getVInterface(), null, "super", null, 0, 1, VInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_GeneralExpression(), this.getGeneralExpression(), null, "generalExpression", null, 1, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraint_Context(), this.getVSpec(), null, "context", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConstraint_ConstraintLanguage(), ecorePackage.getEString(), "constraintLanguage", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalExpressionEClass, GeneralExpression.class, "GeneralExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(slotAssignmentEClass, SlotAssignment.class, "SlotAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlotAssignment_SlotIdentifier(), ecorePackage.getEString(), "slotIdentifier", null, 1, 1, SlotAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSlotAssignment_Value(), this.getValueSpecification(), null, "value", null, 0, 1, SlotAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSlotAssignment_SlotOwner(), this.getObjectHandle(), null, "SlotOwner", null, 1, 1, SlotAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fixedSlotValueAssignmentEClass, FixedSlotValueAssignment.class, "FixedSlotValueAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixedObjectSubstitutionEClass, FixedObjectSubstitution.class, "FixedObjectSubstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectExistenceEClass, ObjectExistence.class, "ObjectExistence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectExistence_OptionalObject(), this.getObjectHandle(), null, "optionalObject", null, 1, 1, ObjectExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkAssignmentEClass, LinkAssignment.class, "LinkAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkAssignment_Link(), this.getLinkHandle(), null, "link", null, 1, 1, LinkAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLinkAssignment_LinkEndIdentifier(), ecorePackage.getEString(), "linkEndIdentifier", null, 1, 1, LinkAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkAssignment_NewEnd(), this.getObjectHandle(), null, "newEnd", null, 1, 1, LinkAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkHandleEClass, LinkHandle.class, "LinkHandle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkHandle_LinkRef(), ecorePackage.getEString(), "linkRef", null, 0, 1, LinkHandle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkHandle_LinkOwner(), ecorePackage.getEObject(), null, "linkOwner", null, 0, 1, LinkHandle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkHandle_ReferencedObject(), ecorePackage.getEObject(), null, "referencedObject", null, 0, 1, LinkHandle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(linkHandleEClass, null, "getEnd", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(configurableUnitEClass, ConfigurableUnit.class, "ConfigurableUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurableUnit_OwnedVSpec(), this.getVSpec(), null, "ownedVSpec", null, 0, -1, ConfigurableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfigurableUnit_OwnedVariationPoint(), this.getVariationPoint(), null, "ownedVariationPoint", null, 0, -1, ConfigurableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfigurableUnit_OwnedConstraint(), this.getConstraint(), null, "ownedConstraint", null, 0, -1, ConfigurableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfigurableUnit_ConfigurableContainerObject(), this.getObjectHandle(), null, "configurableContainerObject", null, 1, 1, ConfigurableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfigurableUnit_OwnedVSpecResolution(), this.getVSpecResolution(), null, "ownedVSpecResolution", null, 0, -1, ConfigurableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(compositeVariationPointEClass, CompositeVariationPoint.class, "CompositeVariationPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeVariationPoint_BindingCVSpec(), this.getCVSpec(), null, "bindingCVSpec", null, 1, 1, CompositeVariationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cvSpecEClass, CVSpec.class, "CVSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCVSpec_VInterface(), this.getVInterface(), null, "vInterface", null, 1, 1, CVSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vConfigurationEClass, VConfiguration.class, "VConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVConfiguration_VSpecResolution(), this.getVSpecResolution(), null, "vSpecResolution", null, 0, -1, VConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVConfiguration_IsPartial(), ecorePackage.getEBoolean(), "isPartial", null, 1, 1, VConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVConfiguration_Super(), this.getVConfiguration(), null, "super", null, 0, 1, VConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVConfiguration_ResolvedVIRef(), this.getCVSpec(), null, "resolvedVIRef", null, 1, 1, VConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vSpec2VSpecMappingEClass, VSpec2VSpecMapping.class, "VSpec2VSpecMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSpec2VSpecMapping_DerivingConstraint(), this.getConstraint(), null, "derivingConstraint", null, 0, -1, VSpec2VSpecMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(linkExistenceEClass, LinkExistence.class, "LinkExistence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkExistence_OptionalLink(), this.getLinkHandle(), null, "optionalLink", null, 1, 1, LinkExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(opaqueVariationPointEClass, OpaqueVariationPoint.class, "OpaqueVariationPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveValueSpecificationEClass, PrimitiveValueSpecification.class, "PrimitiveValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveValueSpecification_Value(), ecorePackage.getEString(), "value", null, 1, 1, PrimitiveValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectSpecificationEClass, ObjectSpecification.class, "ObjectSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectSpecification_Object(), this.getObjectHandle(), null, "object", null, 1, 1, ObjectSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(replacementFragmentSpecificationEClass, ReplacementFragmentSpecification.class, "ReplacementFragmentSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vPackageEClass, VPackage.class, "VPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVPackage_PackageElement(), this.getVPackageable(), null, "packageElement", null, 0, -1, VPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(toBindingEClass, ToBinding.class, "ToBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToBinding_ToPlacement(), this.getToPlacement(), null, "toPlacement", null, 1, 1, ToBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getToBinding_ToReplacement(), this.getToReplacement(), null, "toReplacement", null, 1, 1, ToBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(toPlacementEClass, ToPlacement.class, "ToPlacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToPlacement_ToReplacement(), this.getToReplacement(), this.getToReplacement_ToPlacement(), "toReplacement", null, 0, 1, ToPlacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getToPlacement_PropertyName(), ecorePackage.getEString(), "propertyName", null, 1, 1, ToPlacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getToPlacement_InsideBoundaryElement(), this.getObjectHandle(), null, "insideBoundaryElement", null, 0, -1, ToPlacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getToPlacement_OutsideBoundaryElement(), this.getObjectHandle(), null, "outsideBoundaryElement", null, 0, 1, ToPlacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(toReplacementEClass, ToReplacement.class, "ToReplacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToReplacement_InsideBoundaryElement(), this.getObjectHandle(), null, "insideBoundaryElement", null, 0, -1, ToReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getToReplacement_ToPlacement(), this.getToPlacement(), this.getToPlacement_ToReplacement(), "toPlacement", null, 0, 1, ToReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fromBindingEClass, FromBinding.class, "FromBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFromBinding_FromPlacement(), this.getFromPlacement(), null, "fromPlacement", null, 1, 1, FromBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFromBinding_FromReplacement(), this.getFromReplacement(), null, "fromReplacement", null, 1, 1, FromBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fromPlacementEClass, FromPlacement.class, "FromPlacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFromPlacement_FromReplacement(), this.getFromReplacement(), this.getFromReplacement_FromPlacement(), "fromReplacement", null, 0, 1, FromPlacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFromPlacement_OutsideBoundaryElement(), this.getObjectHandle(), null, "outsideBoundaryElement", null, 0, -1, FromPlacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fromReplacementEClass, FromReplacement.class, "FromReplacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFromReplacement_PropertyName(), ecorePackage.getEString(), "propertyName", null, 1, 1, FromReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFromReplacement_InsideBoundaryElement(), this.getObjectHandle(), null, "insideBoundaryElement", null, 0, 1, FromReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFromReplacement_OutsideBoundaryElement(), this.getObjectHandle(), null, "outsideBoundaryElement", null, 0, -1, FromReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFromReplacement_FromPlacement(), this.getFromPlacement(), this.getFromPlacement_FromReplacement(), "fromPlacement", null, 0, 1, FromReplacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propositionalExpEClass, PropositionalExp.class, "PropositionalExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropositionalExp_LogicalOp(), this.getLogicalOp(), "logicalOp", null, 1, 1, PropositionalExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPropositionalExp_Operand(), this.getGeneralExpression(), null, "operand", null, 1, 3, PropositionalExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(logicalExpEClass, LogicalExp.class, "LogicalExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantifiedSetEClass, QuantifiedSet.class, "QuantifiedSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantifiedSet_Quantifier(), this.getQuantifier(), "quantifier", null, 1, 1, QuantifiedSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setComprehensionEClass, SetComprehension.class, "SetComprehension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetComprehension_Expression(), this.getExpression(), null, "expression", null, 1, 1, SetComprehension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSetComprehension_SetComprVariable(), this.getSetComprVariable(), null, "setComprVariable", null, 0, 1, SetComprehension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSetComprehension_GeneralExpression(), this.getGeneralExpression(), null, "generalExpression", null, 0, -1, SetComprehension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setComprVariableEClass, SetComprVariable.class, "SetComprVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetComprVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, SetComprVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setComprVarReferenceEClass, SetComprVarReference.class, "SetComprVarReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetComprVarReference_SetComprVariable(), this.getSetComprVariable(), null, "setComprVariable", null, 1, 1, SetComprVarReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(compareExpEClass, CompareExp.class, "CompareExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompareExp_Compared(), this.getExpression(), null, "compared", null, 2, 2, CompareExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompareExp_CompareOp(), this.getCompareOp(), "compareOp", null, 1, 1, CompareExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(integerValueSpecEClass, IntegerValueSpec.class, "IntegerValueSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanValueSpecEClass, BooleanValueSpec.class, "BooleanValueSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatValueSpecEClass, FloatValueSpec.class, "FloatValueSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringValueSpecEClass, StringValueSpec.class, "StringValueSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionExpEClass, FunctionExp.class, "FunctionExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionExp_Function(), this.getFunction(), "function", null, 1, 1, FunctionExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFunctionExp_Operand(), this.getExpression(), null, "operand", null, 1, 2, FunctionExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vSpecReferenceEClass, VSpecReference.class, "VSpecReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSpecReference_VSpec(), this.getVSpec(), null, "vSpec", null, 1, 1, VSpecReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vSpecToConfigMappingEClass, VSpecToConfigMapping.class, "VSpecToConfigMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSpecToConfigMapping_ThenConfiguration(), this.getVConfiguration(), null, "thenConfiguration", null, 0, 1, VSpecToConfigMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVSpecToConfigMapping_IfConstraint(), this.getConstraint(), null, "ifConstraint", null, 1, 1, VSpecToConfigMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parametricVariationPointEClass, ParametricVariationPoint.class, "ParametricVariationPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametricVariationPoint_BindingVariable(), this.getVariable(), null, "bindingVariable", null, 1, 1, ParametricVariationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(parametricVariationPointEClass, null, "getPropertyValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "propertyName", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(slotValueExistenceEClass, SlotValueExistence.class, "SlotValueExistence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlotValueExistence_SlotIdentifier(), ecorePackage.getEString(), "slotIdentifier", null, 1, 1, SlotValueExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSlotValueExistence_SlotOwner(), this.getObjectHandle(), null, "slotOwner", null, 1, 1, SlotValueExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parametricLinkAssignmentEClass, ParametricLinkAssignment.class, "ParametricLinkAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametricLinkAssignment_LinkEndIdentifier(), ecorePackage.getEString(), "linkEndIdentifier", null, 1, 1, ParametricLinkAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParametricLinkAssignment_Link(), this.getLinkHandle(), null, "link", null, 1, 1, ParametricLinkAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parametricObjectSubstitutionEClass, ParametricObjectSubstitution.class, "ParametricObjectSubstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametricObjectSubstitution_PlacementObject(), this.getObjectHandle(), null, "placementObject", null, 1, 1, ParametricObjectSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parametricSlotAssignmetEClass, ParametricSlotAssignmet.class, "ParametricSlotAssignmet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametricSlotAssignmet_SlotIdentifier(), ecorePackage.getEString(), "slotIdentifier", null, 1, 1, ParametricSlotAssignmet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParametricSlotAssignmet_SlotOwner(), this.getObjectHandle(), null, "slotOwner", null, 1, 1, ParametricSlotAssignmet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(expression1EClass, Expression1.class, "Expression1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression1_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, Expression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExpression1_ExpressionLanguage(), ecorePackage.getEString(), "expressionLanguage", null, 1, 1, Expression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(choiceDerivationEClass, ChoiceDerivation.class, "ChoiceDerivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoiceDerivation_DerivingConstraint(), this.getConstraint(), null, "derivingConstraint", null, 1, 1, ChoiceDerivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variableDerivationEClass, VariableDerivation.class, "VariableDerivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDerivation_DerivingExpression(), this.getExpression1(), null, "derivingExpression", null, 1, 1, VariableDerivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cvSpecDerivationEClass, CVSpecDerivation.class, "CVSpecDerivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCVSpecDerivation_MemberDerivation(), this.getVSpecDerivation(), null, "memberDerivation", null, 0, -1, CVSpecDerivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(configurableUnitUsageEClass, ConfigurableUnitUsage.class, "ConfigurableUnitUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurableUnitUsage_UsedUnit(), this.getConfigurableUnit(), null, "usedUnit", null, 1, 1, ConfigurableUnitUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfigurableUnitUsage_UsageReference(), this.getLinkHandle(), null, "usageReference", null, 1, 1, ConfigurableUnitUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfigurableUnitUsage_LinkEndIdentifier(), ecorePackage.getEString(), "linkEndIdentifier", null, 1, 1, ConfigurableUnitUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(primitiveTypeEnumEEnum, PrimitiveTypeEnum.class, "PrimitiveTypeEnum");
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.STRING);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INTEGER);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.FLOAT);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BOOLEAN);

		initEEnum(logicalOpEEnum, LogicalOp.class, "LogicalOp");
		addEEnumLiteral(logicalOpEEnum, LogicalOp.NOT);
		addEEnumLiteral(logicalOpEEnum, LogicalOp.IFF);
		addEEnumLiteral(logicalOpEEnum, LogicalOp.IMPLIES);
		addEEnumLiteral(logicalOpEEnum, LogicalOp.OR);
		addEEnumLiteral(logicalOpEEnum, LogicalOp.XOR);
		addEEnumLiteral(logicalOpEEnum, LogicalOp.AND);
		addEEnumLiteral(logicalOpEEnum, LogicalOp.IMPLIES_ELSE);

		initEEnum(quantifierEEnum, Quantifier.class, "Quantifier");
		addEEnumLiteral(quantifierEEnum, Quantifier.NO);
		addEEnumLiteral(quantifierEEnum, Quantifier.LONE);
		addEEnumLiteral(quantifierEEnum, Quantifier.ONE);
		addEEnumLiteral(quantifierEEnum, Quantifier.SOME);
		addEEnumLiteral(quantifierEEnum, Quantifier.ALL);

		initEEnum(compareOpEEnum, CompareOp.class, "CompareOp");

		initEEnum(setCompareOpEEnum, SetCompareOp.class, "SetCompareOp");
		addEEnumLiteral(setCompareOpEEnum, SetCompareOp.EQ);
		addEEnumLiteral(setCompareOpEEnum, SetCompareOp.NEQ);
		addEEnumLiteral(setCompareOpEEnum, SetCompareOp.IN);
		addEEnumLiteral(setCompareOpEEnum, SetCompareOp.STRICT_IN);

		initEEnum(arithmeticCompareOpEEnum, ArithmeticCompareOp.class, "ArithmeticCompareOp");
		addEEnumLiteral(arithmeticCompareOpEEnum, ArithmeticCompareOp.LT);
		addEEnumLiteral(arithmeticCompareOpEEnum, ArithmeticCompareOp.GT);
		addEEnumLiteral(arithmeticCompareOpEEnum, ArithmeticCompareOp.LT_E);
		addEEnumLiteral(arithmeticCompareOpEEnum, ArithmeticCompareOp.GT_E);

		initEEnum(functionEEnum, Function.class, "Function");

		initEEnum(stringFunctionEEnum, StringFunction.class, "StringFunction");
		addEEnumLiteral(stringFunctionEEnum, StringFunction.CONCATENATION);
		addEEnumLiteral(stringFunctionEEnum, StringFunction.CAPITALIZE);

		initEEnum(setFunctionEEnum, SetFunction.class, "SetFunction");
		addEEnumLiteral(setFunctionEEnum, SetFunction.UNION);
		addEEnumLiteral(setFunctionEEnum, SetFunction.DIFFERENCE);
		addEEnumLiteral(setFunctionEEnum, SetFunction.INTERSECTION);
		addEEnumLiteral(setFunctionEEnum, SetFunction.JOIN);

		initEEnum(intSetFunctionEEnum, IntSetFunction.class, "IntSetFunction");
		addEEnumLiteral(intSetFunctionEEnum, IntSetFunction.SET_CARDINALITY);
		addEEnumLiteral(intSetFunctionEEnum, IntSetFunction.SUM);
		addEEnumLiteral(intSetFunctionEEnum, IntSetFunction.MIN);
		addEEnumLiteral(intSetFunctionEEnum, IntSetFunction.MAX);

		initEEnum(arithmeticFunctionEEnum, ArithmeticFunction.class, "ArithmeticFunction");
		addEEnumLiteral(arithmeticFunctionEEnum, ArithmeticFunction.NEGATION);
		addEEnumLiteral(arithmeticFunctionEEnum, ArithmeticFunction.PLUS);
		addEEnumLiteral(arithmeticFunctionEEnum, ArithmeticFunction.MINUS);
		addEEnumLiteral(arithmeticFunctionEEnum, ArithmeticFunction.MULTIPLY);

		// Create resource
		createResource(eNS_URI);
	}

} //VariabilityPackageImpl
