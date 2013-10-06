/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.variability.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.kermeta.cvl.variability.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.kermeta.cvl.variability.VariabilityPackage
 * @generated
 */
public class VariabilitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VariabilityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilitySwitch() {
		if (modelPackage == null) {
			modelPackage = VariabilityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VariabilityPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseVSpec(choice);
				if (result == null) result = caseVPackageable(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VSPEC: {
				VSpec vSpec = (VSpec)theEObject;
				T result = caseVSpec(vSpec);
				if (result == null) result = caseVPackageable(vSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VPACKAGEABLE: {
				VPackageable vPackageable = (VPackageable)theEObject;
				T result = caseVPackageable(vPackageable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.MULTIPLICITY_INTERVAL: {
				MultiplicityInterval multiplicityInterval = (MultiplicityInterval)theEObject;
				T result = caseMultiplicityInterval(multiplicityInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VSPEC_DERIVATION: {
				VSpecDerivation vSpecDerivation = (VSpecDerivation)theEObject;
				T result = caseVSpecDerivation(vSpecDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VCLASSIFIER: {
				VClassifier vClassifier = (VClassifier)theEObject;
				T result = caseVClassifier(vClassifier);
				if (result == null) result = caseVSpec(vClassifier);
				if (result == null) result = caseVPackageable(vClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VSPEC_RESOLUTION: {
				VSpecResolution vSpecResolution = (VSpecResolution)theEObject;
				T result = caseVSpecResolution(vSpecResolution);
				if (result == null) result = caseVPackageable(vSpecResolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VARIATION_POINT: {
				VariationPoint variationPoint = (VariationPoint)theEObject;
				T result = caseVariationPoint(variationPoint);
				if (result == null) result = caseVPackageable(variationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.FRAGMENT_SUBSTITUTION: {
				FragmentSubstitution fragmentSubstitution = (FragmentSubstitution)theEObject;
				T result = caseFragmentSubstitution(fragmentSubstitution);
				if (result == null) result = caseChoiceVariationPoint(fragmentSubstitution);
				if (result == null) result = caseRepeatableVariationPoint(fragmentSubstitution);
				if (result == null) result = caseVariationPoint(fragmentSubstitution);
				if (result == null) result = caseVPackageable(fragmentSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.CHOICE_VARIATION_POINT: {
				ChoiceVariationPoint choiceVariationPoint = (ChoiceVariationPoint)theEObject;
				T result = caseChoiceVariationPoint(choiceVariationPoint);
				if (result == null) result = caseVariationPoint(choiceVariationPoint);
				if (result == null) result = caseVPackageable(choiceVariationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.REPEATABLE_VARIATION_POINT: {
				RepeatableVariationPoint repeatableVariationPoint = (RepeatableVariationPoint)theEObject;
				T result = caseRepeatableVariationPoint(repeatableVariationPoint);
				if (result == null) result = caseVariationPoint(repeatableVariationPoint);
				if (result == null) result = caseVPackageable(repeatableVariationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.BOUNDARY_ELEMENT_BINDING: {
				BoundaryElementBinding boundaryElementBinding = (BoundaryElementBinding)theEObject;
				T result = caseBoundaryElementBinding(boundaryElementBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.PLACEMENT_FRAGMENT: {
				PlacementFragment placementFragment = (PlacementFragment)theEObject;
				T result = casePlacementFragment(placementFragment);
				if (result == null) result = caseVariationPoint(placementFragment);
				if (result == null) result = caseVPackageable(placementFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.PLACEMENT_BOUNDARY_ELEMENT: {
				PlacementBoundaryElement placementBoundaryElement = (PlacementBoundaryElement)theEObject;
				T result = casePlacementBoundaryElement(placementBoundaryElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.REPLACEMENT_FRAGMENT_TYPE: {
				ReplacementFragmentType replacementFragmentType = (ReplacementFragmentType)theEObject;
				T result = caseReplacementFragmentType(replacementFragmentType);
				if (result == null) result = caseVariabletype(replacementFragmentType);
				if (result == null) result = caseVPackageable(replacementFragmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VARIABLETYPE: {
				Variabletype variabletype = (Variabletype)theEObject;
				T result = caseVariabletype(variabletype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.REPLACEMENT_BOUNDARY_ELEMENT: {
				ReplacementBoundaryElement replacementBoundaryElement = (ReplacementBoundaryElement)theEObject;
				T result = caseReplacementBoundaryElement(replacementBoundaryElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.OBJECT_SUBSTITUTION: {
				ObjectSubstitution objectSubstitution = (ObjectSubstitution)theEObject;
				T result = caseObjectSubstitution(objectSubstitution);
				if (result == null) result = caseChoiceVariationPoint(objectSubstitution);
				if (result == null) result = caseVariationPoint(objectSubstitution);
				if (result == null) result = caseVPackageable(objectSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.OBJECT_HANDLE: {
				ObjectHandle objectHandle = (ObjectHandle)theEObject;
				T result = caseObjectHandle(objectHandle);
				if (result == null) result = caseVPackageable(objectHandle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.EXISTENCE: {
				Existence existence = (Existence)theEObject;
				T result = caseExistence(existence);
				if (result == null) result = caseChoiceVariationPoint(existence);
				if (result == null) result = caseVariationPoint(existence);
				if (result == null) result = caseVPackageable(existence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseVSpec(variable);
				if (result == null) result = caseVPackageable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VALUE_SPECIFICATION: {
				ValueSpecification valueSpecification = (ValueSpecification)theEObject;
				T result = caseValueSpecification(valueSpecification);
				if (result == null) result = caseVPackageable(valueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.PRIMITVE_TYPE: {
				PrimitveType primitveType = (PrimitveType)theEObject;
				T result = casePrimitveType(primitveType);
				if (result == null) result = caseVariabletype(primitveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.OBJECT_TYPE: {
				ObjectType objectType = (ObjectType)theEObject;
				T result = caseObjectType(objectType);
				if (result == null) result = caseVariabletype(objectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VINTERFACE: {
				VInterface vInterface = (VInterface)theEObject;
				T result = caseVInterface(vInterface);
				if (result == null) result = caseVPackageable(vInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseVPackageable(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.GENERAL_EXPRESSION: {
				GeneralExpression generalExpression = (GeneralExpression)theEObject;
				T result = caseGeneralExpression(generalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.SLOT_ASSIGNMENT: {
				SlotAssignment slotAssignment = (SlotAssignment)theEObject;
				T result = caseSlotAssignment(slotAssignment);
				if (result == null) result = caseChoiceVariationPoint(slotAssignment);
				if (result == null) result = caseVariationPoint(slotAssignment);
				if (result == null) result = caseVPackageable(slotAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.FIXED_SLOT_VALUE_ASSIGNMENT: {
				FixedSlotValueAssignment fixedSlotValueAssignment = (FixedSlotValueAssignment)theEObject;
				T result = caseFixedSlotValueAssignment(fixedSlotValueAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.FIXED_OBJECT_SUBSTITUTION: {
				FixedObjectSubstitution fixedObjectSubstitution = (FixedObjectSubstitution)theEObject;
				T result = caseFixedObjectSubstitution(fixedObjectSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.OBJECT_EXISTENCE: {
				ObjectExistence objectExistence = (ObjectExistence)theEObject;
				T result = caseObjectExistence(objectExistence);
				if (result == null) result = caseExistence(objectExistence);
				if (result == null) result = caseChoiceVariationPoint(objectExistence);
				if (result == null) result = caseVariationPoint(objectExistence);
				if (result == null) result = caseVPackageable(objectExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.LINK_ASSIGNMENT: {
				LinkAssignment linkAssignment = (LinkAssignment)theEObject;
				T result = caseLinkAssignment(linkAssignment);
				if (result == null) result = caseChoiceVariationPoint(linkAssignment);
				if (result == null) result = caseVariationPoint(linkAssignment);
				if (result == null) result = caseVPackageable(linkAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.LINK_HANDLE: {
				LinkHandle linkHandle = (LinkHandle)theEObject;
				T result = caseLinkHandle(linkHandle);
				if (result == null) result = caseVPackageable(linkHandle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.CONFIGURABLE_UNIT: {
				ConfigurableUnit configurableUnit = (ConfigurableUnit)theEObject;
				T result = caseConfigurableUnit(configurableUnit);
				if (result == null) result = caseCompositeVariationPoint(configurableUnit);
				if (result == null) result = caseVariationPoint(configurableUnit);
				if (result == null) result = caseVPackageable(configurableUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.COMPOSITE_VARIATION_POINT: {
				CompositeVariationPoint compositeVariationPoint = (CompositeVariationPoint)theEObject;
				T result = caseCompositeVariationPoint(compositeVariationPoint);
				if (result == null) result = caseVariationPoint(compositeVariationPoint);
				if (result == null) result = caseVPackageable(compositeVariationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.CV_SPEC: {
				CVSpec cvSpec = (CVSpec)theEObject;
				T result = caseCVSpec(cvSpec);
				if (result == null) result = caseVSpec(cvSpec);
				if (result == null) result = caseVPackageable(cvSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VCONFIGURATION: {
				VConfiguration vConfiguration = (VConfiguration)theEObject;
				T result = caseVConfiguration(vConfiguration);
				if (result == null) result = caseVSpecResolution(vConfiguration);
				if (result == null) result = caseVPackageable(vConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VSPEC2_VSPEC_MAPPING: {
				VSpec2VSpecMapping vSpec2VSpecMapping = (VSpec2VSpecMapping)theEObject;
				T result = caseVSpec2VSpecMapping(vSpec2VSpecMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.LINK_EXISTENCE: {
				LinkExistence linkExistence = (LinkExistence)theEObject;
				T result = caseLinkExistence(linkExistence);
				if (result == null) result = caseExistence(linkExistence);
				if (result == null) result = caseChoiceVariationPoint(linkExistence);
				if (result == null) result = caseVariationPoint(linkExistence);
				if (result == null) result = caseVPackageable(linkExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.OPAQUE_VARIATION_POINT: {
				OpaqueVariationPoint opaqueVariationPoint = (OpaqueVariationPoint)theEObject;
				T result = caseOpaqueVariationPoint(opaqueVariationPoint);
				if (result == null) result = caseVariationPoint(opaqueVariationPoint);
				if (result == null) result = caseVPackageable(opaqueVariationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.PRIMITIVE_VALUE_SPECIFICATION: {
				PrimitiveValueSpecification primitiveValueSpecification = (PrimitiveValueSpecification)theEObject;
				T result = casePrimitiveValueSpecification(primitiveValueSpecification);
				if (result == null) result = caseValueSpecification(primitiveValueSpecification);
				if (result == null) result = caseExpression1(primitiveValueSpecification);
				if (result == null) result = caseVPackageable(primitiveValueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseGeneralExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.OBJECT_SPECIFICATION: {
				ObjectSpecification objectSpecification = (ObjectSpecification)theEObject;
				T result = caseObjectSpecification(objectSpecification);
				if (result == null) result = caseValueSpecification(objectSpecification);
				if (result == null) result = caseVPackageable(objectSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.REPLACEMENT_FRAGMENT_SPECIFICATION: {
				ReplacementFragmentSpecification replacementFragmentSpecification = (ReplacementFragmentSpecification)theEObject;
				T result = caseReplacementFragmentSpecification(replacementFragmentSpecification);
				if (result == null) result = caseValueSpecification(replacementFragmentSpecification);
				if (result == null) result = caseVPackageable(replacementFragmentSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VPACKAGE: {
				VPackage vPackage = (VPackage)theEObject;
				T result = caseVPackage(vPackage);
				if (result == null) result = caseVPackageable(vPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.TO_BINDING: {
				ToBinding toBinding = (ToBinding)theEObject;
				T result = caseToBinding(toBinding);
				if (result == null) result = caseBoundaryElementBinding(toBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.TO_PLACEMENT: {
				ToPlacement toPlacement = (ToPlacement)theEObject;
				T result = caseToPlacement(toPlacement);
				if (result == null) result = casePlacementBoundaryElement(toPlacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.TO_REPLACEMENT: {
				ToReplacement toReplacement = (ToReplacement)theEObject;
				T result = caseToReplacement(toReplacement);
				if (result == null) result = caseReplacementBoundaryElement(toReplacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.FROM_BINDING: {
				FromBinding fromBinding = (FromBinding)theEObject;
				T result = caseFromBinding(fromBinding);
				if (result == null) result = caseBoundaryElementBinding(fromBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.FROM_PLACEMENT: {
				FromPlacement fromPlacement = (FromPlacement)theEObject;
				T result = caseFromPlacement(fromPlacement);
				if (result == null) result = casePlacementBoundaryElement(fromPlacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.FROM_REPLACEMENT: {
				FromReplacement fromReplacement = (FromReplacement)theEObject;
				T result = caseFromReplacement(fromReplacement);
				if (result == null) result = caseReplacementBoundaryElement(fromReplacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.PROPOSITIONAL_EXP: {
				PropositionalExp propositionalExp = (PropositionalExp)theEObject;
				T result = casePropositionalExp(propositionalExp);
				if (result == null) result = caseLogicalExp(propositionalExp);
				if (result == null) result = caseGeneralExpression(propositionalExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.LOGICAL_EXP: {
				LogicalExp logicalExp = (LogicalExp)theEObject;
				T result = caseLogicalExp(logicalExp);
				if (result == null) result = caseGeneralExpression(logicalExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.QUANTIFIED_SET: {
				QuantifiedSet quantifiedSet = (QuantifiedSet)theEObject;
				T result = caseQuantifiedSet(quantifiedSet);
				if (result == null) result = caseSetComprehension(quantifiedSet);
				if (result == null) result = caseLogicalExp(quantifiedSet);
				if (result == null) result = caseExpression(quantifiedSet);
				if (result == null) result = caseGeneralExpression(quantifiedSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.SET_COMPREHENSION: {
				SetComprehension setComprehension = (SetComprehension)theEObject;
				T result = caseSetComprehension(setComprehension);
				if (result == null) result = caseExpression(setComprehension);
				if (result == null) result = caseGeneralExpression(setComprehension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.SET_COMPR_VARIABLE: {
				SetComprVariable setComprVariable = (SetComprVariable)theEObject;
				T result = caseSetComprVariable(setComprVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.SET_COMPR_VAR_REFERENCE: {
				SetComprVarReference setComprVarReference = (SetComprVarReference)theEObject;
				T result = caseSetComprVarReference(setComprVarReference);
				if (result == null) result = caseExpression(setComprVarReference);
				if (result == null) result = caseGeneralExpression(setComprVarReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.COMPARE_EXP: {
				CompareExp compareExp = (CompareExp)theEObject;
				T result = caseCompareExp(compareExp);
				if (result == null) result = caseLogicalExp(compareExp);
				if (result == null) result = caseGeneralExpression(compareExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.INTEGER_VALUE_SPEC: {
				IntegerValueSpec integerValueSpec = (IntegerValueSpec)theEObject;
				T result = caseIntegerValueSpec(integerValueSpec);
				if (result == null) result = casePrimitiveValueSpecification(integerValueSpec);
				if (result == null) result = caseValueSpecification(integerValueSpec);
				if (result == null) result = caseExpression1(integerValueSpec);
				if (result == null) result = caseVPackageable(integerValueSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.BOOLEAN_VALUE_SPEC: {
				BooleanValueSpec booleanValueSpec = (BooleanValueSpec)theEObject;
				T result = caseBooleanValueSpec(booleanValueSpec);
				if (result == null) result = casePrimitiveValueSpecification(booleanValueSpec);
				if (result == null) result = caseValueSpecification(booleanValueSpec);
				if (result == null) result = caseExpression1(booleanValueSpec);
				if (result == null) result = caseVPackageable(booleanValueSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.FLOAT_VALUE_SPEC: {
				FloatValueSpec floatValueSpec = (FloatValueSpec)theEObject;
				T result = caseFloatValueSpec(floatValueSpec);
				if (result == null) result = casePrimitiveValueSpecification(floatValueSpec);
				if (result == null) result = caseValueSpecification(floatValueSpec);
				if (result == null) result = caseExpression1(floatValueSpec);
				if (result == null) result = caseVPackageable(floatValueSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.STRING_VALUE_SPEC: {
				StringValueSpec stringValueSpec = (StringValueSpec)theEObject;
				T result = caseStringValueSpec(stringValueSpec);
				if (result == null) result = casePrimitiveValueSpecification(stringValueSpec);
				if (result == null) result = caseValueSpecification(stringValueSpec);
				if (result == null) result = caseExpression1(stringValueSpec);
				if (result == null) result = caseVPackageable(stringValueSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.FUNCTION_EXP: {
				FunctionExp functionExp = (FunctionExp)theEObject;
				T result = caseFunctionExp(functionExp);
				if (result == null) result = caseExpression(functionExp);
				if (result == null) result = caseGeneralExpression(functionExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VSPEC_REFERENCE: {
				VSpecReference vSpecReference = (VSpecReference)theEObject;
				T result = caseVSpecReference(vSpecReference);
				if (result == null) result = caseExpression(vSpecReference);
				if (result == null) result = caseGeneralExpression(vSpecReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VSPEC_TO_CONFIG_MAPPING: {
				VSpecToConfigMapping vSpecToConfigMapping = (VSpecToConfigMapping)theEObject;
				T result = caseVSpecToConfigMapping(vSpecToConfigMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.PARAMETRIC_VARIATION_POINT: {
				ParametricVariationPoint parametricVariationPoint = (ParametricVariationPoint)theEObject;
				T result = caseParametricVariationPoint(parametricVariationPoint);
				if (result == null) result = caseVariationPoint(parametricVariationPoint);
				if (result == null) result = caseVPackageable(parametricVariationPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.SLOT_VALUE_EXISTENCE: {
				SlotValueExistence slotValueExistence = (SlotValueExistence)theEObject;
				T result = caseSlotValueExistence(slotValueExistence);
				if (result == null) result = caseExistence(slotValueExistence);
				if (result == null) result = caseChoiceVariationPoint(slotValueExistence);
				if (result == null) result = caseVariationPoint(slotValueExistence);
				if (result == null) result = caseVPackageable(slotValueExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.PARAMETRIC_LINK_ASSIGNMENT: {
				ParametricLinkAssignment parametricLinkAssignment = (ParametricLinkAssignment)theEObject;
				T result = caseParametricLinkAssignment(parametricLinkAssignment);
				if (result == null) result = caseParametricVariationPoint(parametricLinkAssignment);
				if (result == null) result = caseVariationPoint(parametricLinkAssignment);
				if (result == null) result = caseVPackageable(parametricLinkAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.PARAMETRIC_OBJECT_SUBSTITUTION: {
				ParametricObjectSubstitution parametricObjectSubstitution = (ParametricObjectSubstitution)theEObject;
				T result = caseParametricObjectSubstitution(parametricObjectSubstitution);
				if (result == null) result = caseParametricVariationPoint(parametricObjectSubstitution);
				if (result == null) result = caseVariationPoint(parametricObjectSubstitution);
				if (result == null) result = caseVPackageable(parametricObjectSubstitution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.PARAMETRIC_SLOT_ASSIGNMET: {
				ParametricSlotAssignmet parametricSlotAssignmet = (ParametricSlotAssignmet)theEObject;
				T result = caseParametricSlotAssignmet(parametricSlotAssignmet);
				if (result == null) result = caseParametricVariationPoint(parametricSlotAssignmet);
				if (result == null) result = caseVariationPoint(parametricSlotAssignmet);
				if (result == null) result = caseVPackageable(parametricSlotAssignmet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.EXPRESSION1: {
				Expression1 expression1 = (Expression1)theEObject;
				T result = caseExpression1(expression1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.CHOICE_DERIVATION: {
				ChoiceDerivation choiceDerivation = (ChoiceDerivation)theEObject;
				T result = caseChoiceDerivation(choiceDerivation);
				if (result == null) result = caseVSpecDerivation(choiceDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.VARIABLE_DERIVATION: {
				VariableDerivation variableDerivation = (VariableDerivation)theEObject;
				T result = caseVariableDerivation(variableDerivation);
				if (result == null) result = caseVSpecDerivation(variableDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.CV_SPEC_DERIVATION: {
				CVSpecDerivation cvSpecDerivation = (CVSpecDerivation)theEObject;
				T result = caseCVSpecDerivation(cvSpecDerivation);
				if (result == null) result = caseVSpecDerivation(cvSpecDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariabilityPackage.CONFIGURABLE_UNIT_USAGE: {
				ConfigurableUnitUsage configurableUnitUsage = (ConfigurableUnitUsage)theEObject;
				T result = caseConfigurableUnitUsage(configurableUnitUsage);
				if (result == null) result = caseCompositeVariationPoint(configurableUnitUsage);
				if (result == null) result = caseVariationPoint(configurableUnitUsage);
				if (result == null) result = caseVPackageable(configurableUnitUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSpec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSpec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSpec(VSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VPackageable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VPackageable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVPackageable(VPackageable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityInterval(MultiplicityInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSpec Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSpec Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSpecDerivation(VSpecDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVClassifier(VClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSpec Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSpec Resolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSpecResolution(VSpecResolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variation Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variation Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariationPoint(VariationPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragmentSubstitution(FragmentSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Variation Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Variation Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceVariationPoint(ChoiceVariationPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeatable Variation Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeatable Variation Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatableVariationPoint(RepeatableVariationPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary Element Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary Element Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundaryElementBinding(BoundaryElementBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placement Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placement Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacementFragment(PlacementFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placement Boundary Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placement Boundary Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacementBoundaryElement(PlacementBoundaryElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replacement Fragment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replacement Fragment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplacementFragmentType(ReplacementFragmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variabletype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variabletype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariabletype(Variabletype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replacement Boundary Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replacement Boundary Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplacementBoundaryElement(ReplacementBoundaryElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectSubstitution(ObjectSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Handle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Handle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectHandle(ObjectHandle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistence(Existence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitveType(PrimitveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectType(ObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VInterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVInterface(VInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralExpression(GeneralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotAssignment(SlotAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Slot Value Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Slot Value Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedSlotValueAssignment(FixedSlotValueAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Object Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Object Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedObjectSubstitution(FixedObjectSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectExistence(ObjectExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkAssignment(LinkAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Handle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Handle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkHandle(LinkHandle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurable Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurableUnit(ConfigurableUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Variation Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Variation Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeVariationPoint(CompositeVariationPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CV Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CV Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCVSpec(CVSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VConfiguration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VConfiguration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVConfiguration(VConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSpec2 VSpec Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSpec2 VSpec Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSpec2VSpecMapping(VSpec2VSpecMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkExistence(LinkExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Variation Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Variation Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueVariationPoint(OpaqueVariationPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveValueSpecification(PrimitiveValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectSpecification(ObjectSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replacement Fragment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replacement Fragment Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplacementFragmentSpecification(ReplacementFragmentSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVPackage(VPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToBinding(ToBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Placement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Placement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToPlacement(ToPlacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Replacement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToReplacement(ToReplacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromBinding(FromBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Placement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Placement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromPlacement(FromPlacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Replacement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromReplacement(FromReplacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propositional Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propositional Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropositionalExp(PropositionalExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalExp(LogicalExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantified Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantified Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifiedSet(QuantifiedSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Comprehension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Comprehension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetComprehension(SetComprehension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Compr Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Compr Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetComprVariable(SetComprVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Compr Var Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Compr Var Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetComprVarReference(SetComprVarReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compare Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compare Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompareExp(CompareExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValueSpec(IntegerValueSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValueSpec(BooleanValueSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Value Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatValueSpec(FloatValueSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValueSpec(StringValueSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionExp(FunctionExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSpec Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSpec Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSpecReference(VSpecReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSpec To Config Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSpec To Config Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSpecToConfigMapping(VSpecToConfigMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametric Variation Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametric Variation Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametricVariationPoint(ParametricVariationPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot Value Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot Value Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlotValueExistence(SlotValueExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametric Link Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametric Link Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametricLinkAssignment(ParametricLinkAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametric Object Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametric Object Substitution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametricObjectSubstitution(ParametricObjectSubstitution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametric Slot Assignmet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametric Slot Assignmet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametricSlotAssignmet(ParametricSlotAssignmet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression1(Expression1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceDerivation(ChoiceDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDerivation(VariableDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CV Spec Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CV Spec Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCVSpecDerivation(CVSpecDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurable Unit Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurable Unit Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurableUnitUsage(ConfigurableUnitUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VariabilitySwitch
