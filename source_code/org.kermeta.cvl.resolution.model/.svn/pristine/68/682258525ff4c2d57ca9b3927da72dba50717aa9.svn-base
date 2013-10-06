/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.resolution.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kermeta.cvl.resolution.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResolutionFactoryImpl extends EFactoryImpl implements ResolutionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResolutionFactory init() {
		try {
			ResolutionFactory theResolutionFactory = (ResolutionFactory)EPackage.Registry.INSTANCE.getEFactory("http:///resolution.ecore"); 
			if (theResolutionFactory != null) {
				return theResolutionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResolutionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResolutionPackage.VPACKAGE_RESOLUTION: return createVPackageResolution();
			case ResolutionPackage.CHOICE_RESOLUTION: return createChoiceResolution();
			case ResolutionPackage.VARIABLE_VALUE_ASSIGNMENT: return createVariableValueAssignment();
			case ResolutionPackage.VINSTANCE: return createVInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPackageResolution createVPackageResolution() {
		VPackageResolutionImpl vPackageResolution = new VPackageResolutionImpl();
		return vPackageResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceResolution createChoiceResolution() {
		ChoiceResolutionImpl choiceResolution = new ChoiceResolutionImpl();
		return choiceResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableValueAssignment createVariableValueAssignment() {
		VariableValueAssignmentImpl variableValueAssignment = new VariableValueAssignmentImpl();
		return variableValueAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VInstance createVInstance() {
		VInstanceImpl vInstance = new VInstanceImpl();
		return vInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionPackage getResolutionPackage() {
		return (ResolutionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResolutionPackage getPackage() {
		return ResolutionPackage.eINSTANCE;
	}

} //ResolutionFactoryImpl
