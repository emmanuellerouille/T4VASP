/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.resolution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.kermeta.cvl.variability.VariabilityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.kermeta.cvl.resolution.ResolutionFactory
 * @model kind="package"
 * @generated
 */
public interface ResolutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resolution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///resolution.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resolution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResolutionPackage eINSTANCE = org.kermeta.cvl.resolution.impl.ResolutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.cvl.resolution.impl.VPackageResolutionImpl <em>VPackage Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.cvl.resolution.impl.VPackageResolutionImpl
	 * @see org.kermeta.cvl.resolution.impl.ResolutionPackageImpl#getVPackageResolution()
	 * @generated
	 */
	int VPACKAGE_RESOLUTION = 0;

	/**
	 * The feature id for the '<em><b>Packaged Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>VPackage Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPACKAGE_RESOLUTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.kermeta.cvl.resolution.impl.ChoiceResolutionImpl <em>Choice Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.cvl.resolution.impl.ChoiceResolutionImpl
	 * @see org.kermeta.cvl.resolution.impl.ResolutionPackageImpl#getChoiceResolution()
	 * @generated
	 */
	int CHOICE_RESOLUTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_RESOLUTION__NAME = VariabilityPackage.VSPEC_RESOLUTION__NAME;

	/**
	 * The feature id for the '<em><b>Resolved VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_RESOLUTION__RESOLVED_VSPEC = VariabilityPackage.VSPEC_RESOLUTION__RESOLVED_VSPEC;

	/**
	 * The feature id for the '<em><b>Child Resolution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_RESOLUTION__CHILD_RESOLUTION = VariabilityPackage.VSPEC_RESOLUTION__CHILD_RESOLUTION;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_RESOLUTION__DECISION = VariabilityPackage.VSPEC_RESOLUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved Choice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_RESOLUTION__RESOLVED_CHOICE = VariabilityPackage.VSPEC_RESOLUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choice Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_RESOLUTION_FEATURE_COUNT = VariabilityPackage.VSPEC_RESOLUTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.cvl.resolution.impl.VariableValueAssignmentImpl <em>Variable Value Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.cvl.resolution.impl.VariableValueAssignmentImpl
	 * @see org.kermeta.cvl.resolution.impl.ResolutionPackageImpl#getVariableValueAssignment()
	 * @generated
	 */
	int VARIABLE_VALUE_ASSIGNMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ASSIGNMENT__NAME = VariabilityPackage.VSPEC_RESOLUTION__NAME;

	/**
	 * The feature id for the '<em><b>Resolved VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ASSIGNMENT__RESOLVED_VSPEC = VariabilityPackage.VSPEC_RESOLUTION__RESOLVED_VSPEC;

	/**
	 * The feature id for the '<em><b>Child Resolution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ASSIGNMENT__CHILD_RESOLUTION = VariabilityPackage.VSPEC_RESOLUTION__CHILD_RESOLUTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ASSIGNMENT__VALUE = VariabilityPackage.VSPEC_RESOLUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ASSIGNMENT__RESOLVED_VARIABLE = VariabilityPackage.VSPEC_RESOLUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Value Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_ASSIGNMENT_FEATURE_COUNT = VariabilityPackage.VSPEC_RESOLUTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.cvl.resolution.impl.VInstanceImpl <em>VInstance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.cvl.resolution.impl.VInstanceImpl
	 * @see org.kermeta.cvl.resolution.impl.ResolutionPackageImpl#getVInstance()
	 * @generated
	 */
	int VINSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINSTANCE__NAME = VariabilityPackage.VSPEC_RESOLUTION__NAME;

	/**
	 * The feature id for the '<em><b>Resolved VSpec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINSTANCE__RESOLVED_VSPEC = VariabilityPackage.VSPEC_RESOLUTION__RESOLVED_VSPEC;

	/**
	 * The feature id for the '<em><b>Child Resolution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINSTANCE__CHILD_RESOLUTION = VariabilityPackage.VSPEC_RESOLUTION__CHILD_RESOLUTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINSTANCE__TYPE = VariabilityPackage.VSPEC_RESOLUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VInstance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VINSTANCE_FEATURE_COUNT = VariabilityPackage.VSPEC_RESOLUTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.kermeta.cvl.resolution.VPackageResolution <em>VPackage Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPackage Resolution</em>'.
	 * @see org.kermeta.cvl.resolution.VPackageResolution
	 * @generated
	 */
	EClass getVPackageResolution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.cvl.resolution.VPackageResolution#getPackagedElements <em>Packaged Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packaged Elements</em>'.
	 * @see org.kermeta.cvl.resolution.VPackageResolution#getPackagedElements()
	 * @see #getVPackageResolution()
	 * @generated
	 */
	EReference getVPackageResolution_PackagedElements();

	/**
	 * Returns the meta object for class '{@link org.kermeta.cvl.resolution.ChoiceResolution <em>Choice Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Resolution</em>'.
	 * @see org.kermeta.cvl.resolution.ChoiceResolution
	 * @generated
	 */
	EClass getChoiceResolution();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.cvl.resolution.ChoiceResolution#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision</em>'.
	 * @see org.kermeta.cvl.resolution.ChoiceResolution#getDecision()
	 * @see #getChoiceResolution()
	 * @generated
	 */
	EAttribute getChoiceResolution_Decision();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.cvl.resolution.ChoiceResolution#getResolvedChoice <em>Resolved Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Choice</em>'.
	 * @see org.kermeta.cvl.resolution.ChoiceResolution#getResolvedChoice()
	 * @see #getChoiceResolution()
	 * @generated
	 */
	EReference getChoiceResolution_ResolvedChoice();

	/**
	 * Returns the meta object for class '{@link org.kermeta.cvl.resolution.VariableValueAssignment <em>Variable Value Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Value Assignment</em>'.
	 * @see org.kermeta.cvl.resolution.VariableValueAssignment
	 * @generated
	 */
	EClass getVariableValueAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.cvl.resolution.VariableValueAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.kermeta.cvl.resolution.VariableValueAssignment#getValue()
	 * @see #getVariableValueAssignment()
	 * @generated
	 */
	EReference getVariableValueAssignment_Value();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.cvl.resolution.VariableValueAssignment#getResolvedVariable <em>Resolved Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved Variable</em>'.
	 * @see org.kermeta.cvl.resolution.VariableValueAssignment#getResolvedVariable()
	 * @see #getVariableValueAssignment()
	 * @generated
	 */
	EReference getVariableValueAssignment_ResolvedVariable();

	/**
	 * Returns the meta object for class '{@link org.kermeta.cvl.resolution.VInstance <em>VInstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VInstance</em>'.
	 * @see org.kermeta.cvl.resolution.VInstance
	 * @generated
	 */
	EClass getVInstance();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.cvl.resolution.VInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.kermeta.cvl.resolution.VInstance#getType()
	 * @see #getVInstance()
	 * @generated
	 */
	EReference getVInstance_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResolutionFactory getResolutionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.kermeta.cvl.resolution.impl.VPackageResolutionImpl <em>VPackage Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.cvl.resolution.impl.VPackageResolutionImpl
		 * @see org.kermeta.cvl.resolution.impl.ResolutionPackageImpl#getVPackageResolution()
		 * @generated
		 */
		EClass VPACKAGE_RESOLUTION = eINSTANCE.getVPackageResolution();

		/**
		 * The meta object literal for the '<em><b>Packaged Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPACKAGE_RESOLUTION__PACKAGED_ELEMENTS = eINSTANCE.getVPackageResolution_PackagedElements();

		/**
		 * The meta object literal for the '{@link org.kermeta.cvl.resolution.impl.ChoiceResolutionImpl <em>Choice Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.cvl.resolution.impl.ChoiceResolutionImpl
		 * @see org.kermeta.cvl.resolution.impl.ResolutionPackageImpl#getChoiceResolution()
		 * @generated
		 */
		EClass CHOICE_RESOLUTION = eINSTANCE.getChoiceResolution();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE_RESOLUTION__DECISION = eINSTANCE.getChoiceResolution_Decision();

		/**
		 * The meta object literal for the '<em><b>Resolved Choice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE_RESOLUTION__RESOLVED_CHOICE = eINSTANCE.getChoiceResolution_ResolvedChoice();

		/**
		 * The meta object literal for the '{@link org.kermeta.cvl.resolution.impl.VariableValueAssignmentImpl <em>Variable Value Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.cvl.resolution.impl.VariableValueAssignmentImpl
		 * @see org.kermeta.cvl.resolution.impl.ResolutionPackageImpl#getVariableValueAssignment()
		 * @generated
		 */
		EClass VARIABLE_VALUE_ASSIGNMENT = eINSTANCE.getVariableValueAssignment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_VALUE_ASSIGNMENT__VALUE = eINSTANCE.getVariableValueAssignment_Value();

		/**
		 * The meta object literal for the '<em><b>Resolved Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_VALUE_ASSIGNMENT__RESOLVED_VARIABLE = eINSTANCE.getVariableValueAssignment_ResolvedVariable();

		/**
		 * The meta object literal for the '{@link org.kermeta.cvl.resolution.impl.VInstanceImpl <em>VInstance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.cvl.resolution.impl.VInstanceImpl
		 * @see org.kermeta.cvl.resolution.impl.ResolutionPackageImpl#getVInstance()
		 * @generated
		 */
		EClass VINSTANCE = eINSTANCE.getVInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VINSTANCE__TYPE = eINSTANCE.getVInstance_Type();

	}

} //ResolutionPackage
