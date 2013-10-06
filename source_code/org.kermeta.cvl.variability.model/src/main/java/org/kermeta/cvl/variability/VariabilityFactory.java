/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.cvl.variability.VariabilityPackage
 * @generated
 */
public interface VariabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariabilityFactory eINSTANCE = org.kermeta.cvl.variability.impl.VariabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
	Choice createChoice();

	/**
	 * Returns a new object of class '<em>Multiplicity Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Interval</em>'.
	 * @generated
	 */
	MultiplicityInterval createMultiplicityInterval();

	/**
	 * Returns a new object of class '<em>VSpec Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSpec Derivation</em>'.
	 * @generated
	 */
	VSpecDerivation createVSpecDerivation();

	/**
	 * Returns a new object of class '<em>VClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VClassifier</em>'.
	 * @generated
	 */
	VClassifier createVClassifier();

	/**
	 * Returns a new object of class '<em>Fragment Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fragment Substitution</em>'.
	 * @generated
	 */
	FragmentSubstitution createFragmentSubstitution();

	/**
	 * Returns a new object of class '<em>Choice Variation Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice Variation Point</em>'.
	 * @generated
	 */
	ChoiceVariationPoint createChoiceVariationPoint();

	/**
	 * Returns a new object of class '<em>Placement Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placement Fragment</em>'.
	 * @generated
	 */
	PlacementFragment createPlacementFragment();

	/**
	 * Returns a new object of class '<em>Replacement Fragment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replacement Fragment Type</em>'.
	 * @generated
	 */
	ReplacementFragmentType createReplacementFragmentType();

	/**
	 * Returns a new object of class '<em>Variabletype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variabletype</em>'.
	 * @generated
	 */
	Variabletype createVariabletype();

	/**
	 * Returns a new object of class '<em>Object Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Substitution</em>'.
	 * @generated
	 */
	ObjectSubstitution createObjectSubstitution();

	/**
	 * Returns a new object of class '<em>Object Handle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Handle</em>'.
	 * @generated
	 */
	ObjectHandle createObjectHandle();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Primitve Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitve Type</em>'.
	 * @generated
	 */
	PrimitveType createPrimitveType();

	/**
	 * Returns a new object of class '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Type</em>'.
	 * @generated
	 */
	ObjectType createObjectType();

	/**
	 * Returns a new object of class '<em>VInterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VInterface</em>'.
	 * @generated
	 */
	VInterface createVInterface();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Slot Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot Assignment</em>'.
	 * @generated
	 */
	SlotAssignment createSlotAssignment();

	/**
	 * Returns a new object of class '<em>Fixed Slot Value Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Slot Value Assignment</em>'.
	 * @generated
	 */
	FixedSlotValueAssignment createFixedSlotValueAssignment();

	/**
	 * Returns a new object of class '<em>Fixed Object Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Object Substitution</em>'.
	 * @generated
	 */
	FixedObjectSubstitution createFixedObjectSubstitution();

	/**
	 * Returns a new object of class '<em>Object Existence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Existence</em>'.
	 * @generated
	 */
	ObjectExistence createObjectExistence();

	/**
	 * Returns a new object of class '<em>Link Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Assignment</em>'.
	 * @generated
	 */
	LinkAssignment createLinkAssignment();

	/**
	 * Returns a new object of class '<em>Link Handle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Handle</em>'.
	 * @generated
	 */
	LinkHandle createLinkHandle();

	/**
	 * Returns a new object of class '<em>Configurable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configurable Unit</em>'.
	 * @generated
	 */
	ConfigurableUnit createConfigurableUnit();

	/**
	 * Returns a new object of class '<em>Composite Variation Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Variation Point</em>'.
	 * @generated
	 */
	CompositeVariationPoint createCompositeVariationPoint();

	/**
	 * Returns a new object of class '<em>CV Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CV Spec</em>'.
	 * @generated
	 */
	CVSpec createCVSpec();

	/**
	 * Returns a new object of class '<em>VConfiguration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VConfiguration</em>'.
	 * @generated
	 */
	VConfiguration createVConfiguration();

	/**
	 * Returns a new object of class '<em>VSpec2 VSpec Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSpec2 VSpec Mapping</em>'.
	 * @generated
	 */
	VSpec2VSpecMapping createVSpec2VSpecMapping();

	/**
	 * Returns a new object of class '<em>Link Existence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Existence</em>'.
	 * @generated
	 */
	LinkExistence createLinkExistence();

	/**
	 * Returns a new object of class '<em>Opaque Variation Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Variation Point</em>'.
	 * @generated
	 */
	OpaqueVariationPoint createOpaqueVariationPoint();

	/**
	 * Returns a new object of class '<em>Object Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Specification</em>'.
	 * @generated
	 */
	ObjectSpecification createObjectSpecification();

	/**
	 * Returns a new object of class '<em>Replacement Fragment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replacement Fragment Specification</em>'.
	 * @generated
	 */
	ReplacementFragmentSpecification createReplacementFragmentSpecification();

	/**
	 * Returns a new object of class '<em>VPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VPackage</em>'.
	 * @generated
	 */
	VPackage createVPackage();

	/**
	 * Returns a new object of class '<em>To Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Binding</em>'.
	 * @generated
	 */
	ToBinding createToBinding();

	/**
	 * Returns a new object of class '<em>To Placement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Placement</em>'.
	 * @generated
	 */
	ToPlacement createToPlacement();

	/**
	 * Returns a new object of class '<em>To Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>To Replacement</em>'.
	 * @generated
	 */
	ToReplacement createToReplacement();

	/**
	 * Returns a new object of class '<em>From Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>From Binding</em>'.
	 * @generated
	 */
	FromBinding createFromBinding();

	/**
	 * Returns a new object of class '<em>From Placement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>From Placement</em>'.
	 * @generated
	 */
	FromPlacement createFromPlacement();

	/**
	 * Returns a new object of class '<em>From Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>From Replacement</em>'.
	 * @generated
	 */
	FromReplacement createFromReplacement();

	/**
	 * Returns a new object of class '<em>Propositional Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propositional Exp</em>'.
	 * @generated
	 */
	PropositionalExp createPropositionalExp();

	/**
	 * Returns a new object of class '<em>Quantified Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantified Set</em>'.
	 * @generated
	 */
	QuantifiedSet createQuantifiedSet();

	/**
	 * Returns a new object of class '<em>Set Comprehension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Comprehension</em>'.
	 * @generated
	 */
	SetComprehension createSetComprehension();

	/**
	 * Returns a new object of class '<em>Set Compr Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Compr Variable</em>'.
	 * @generated
	 */
	SetComprVariable createSetComprVariable();

	/**
	 * Returns a new object of class '<em>Set Compr Var Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Compr Var Reference</em>'.
	 * @generated
	 */
	SetComprVarReference createSetComprVarReference();

	/**
	 * Returns a new object of class '<em>Compare Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare Exp</em>'.
	 * @generated
	 */
	CompareExp createCompareExp();

	/**
	 * Returns a new object of class '<em>Integer Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value Spec</em>'.
	 * @generated
	 */
	IntegerValueSpec createIntegerValueSpec();

	/**
	 * Returns a new object of class '<em>Boolean Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value Spec</em>'.
	 * @generated
	 */
	BooleanValueSpec createBooleanValueSpec();

	/**
	 * Returns a new object of class '<em>Float Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Value Spec</em>'.
	 * @generated
	 */
	FloatValueSpec createFloatValueSpec();

	/**
	 * Returns a new object of class '<em>String Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value Spec</em>'.
	 * @generated
	 */
	StringValueSpec createStringValueSpec();

	/**
	 * Returns a new object of class '<em>Function Exp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Exp</em>'.
	 * @generated
	 */
	FunctionExp createFunctionExp();

	/**
	 * Returns a new object of class '<em>VSpec Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSpec Reference</em>'.
	 * @generated
	 */
	VSpecReference createVSpecReference();

	/**
	 * Returns a new object of class '<em>VSpec To Config Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSpec To Config Mapping</em>'.
	 * @generated
	 */
	VSpecToConfigMapping createVSpecToConfigMapping();

	/**
	 * Returns a new object of class '<em>Slot Value Existence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot Value Existence</em>'.
	 * @generated
	 */
	SlotValueExistence createSlotValueExistence();

	/**
	 * Returns a new object of class '<em>Parametric Link Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametric Link Assignment</em>'.
	 * @generated
	 */
	ParametricLinkAssignment createParametricLinkAssignment();

	/**
	 * Returns a new object of class '<em>Parametric Object Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametric Object Substitution</em>'.
	 * @generated
	 */
	ParametricObjectSubstitution createParametricObjectSubstitution();

	/**
	 * Returns a new object of class '<em>Parametric Slot Assignmet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametric Slot Assignmet</em>'.
	 * @generated
	 */
	ParametricSlotAssignmet createParametricSlotAssignmet();

	/**
	 * Returns a new object of class '<em>Expression1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression1</em>'.
	 * @generated
	 */
	Expression1 createExpression1();

	/**
	 * Returns a new object of class '<em>Choice Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice Derivation</em>'.
	 * @generated
	 */
	ChoiceDerivation createChoiceDerivation();

	/**
	 * Returns a new object of class '<em>Variable Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Derivation</em>'.
	 * @generated
	 */
	VariableDerivation createVariableDerivation();

	/**
	 * Returns a new object of class '<em>CV Spec Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CV Spec Derivation</em>'.
	 * @generated
	 */
	CVSpecDerivation createCVSpecDerivation();

	/**
	 * Returns a new object of class '<em>Configurable Unit Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configurable Unit Usage</em>'.
	 * @generated
	 */
	ConfigurableUnitUsage createConfigurableUnitUsage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VariabilityPackage getVariabilityPackage();

} //VariabilityFactory
