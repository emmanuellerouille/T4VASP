/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.spem.executioncontext.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.kermeta.spem.executioncontext.ExecutionContext;
import org.kermeta.spem.executioncontext.ExecutioncontextFactory;
import org.kermeta.spem.executioncontext.ExecutioncontextPackage;
import org.kermeta.spem.executioncontext.Key;
import org.kermeta.spem.executioncontext.OnWhat;
import org.kermeta.spem.executioncontext.State;
import org.kermeta.spem.executioncontext.UnderExecution;
import org.kermeta.spem.executioncontext.Value;
import org.kermeta.spem.executioncontext.WorkUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutioncontextPackageImpl extends EPackageImpl implements ExecutioncontextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass underExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum onWhatEEnum = null;

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
	 * @see org.kermeta.spem.executioncontext.ExecutioncontextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExecutioncontextPackageImpl() {
		super(eNS_URI, ExecutioncontextFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExecutioncontextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExecutioncontextPackage init() {
		if (isInited) return (ExecutioncontextPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutioncontextPackage.eNS_URI);

		// Obtain or create and register package
		ExecutioncontextPackageImpl theExecutioncontextPackage = (ExecutioncontextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExecutioncontextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExecutioncontextPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theExecutioncontextPackage.createPackageContents();

		// Initialize created meta-data
		theExecutioncontextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExecutioncontextPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExecutioncontextPackage.eNS_URI, theExecutioncontextPackage);
		return theExecutioncontextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionContext() {
		return executionContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionContext_Name() {
		return (EAttribute)executionContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionContext_Keys() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionContext_Values() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionContext_WorkUnits() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionContext_UnderExecution() {
		return (EReference)executionContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKey() {
		return keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKey_Name() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKey_Value() {
		return (EReference)keyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Content() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_Key() {
		return (EReference)valueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkUnit() {
		return workUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkUnit_Name() {
		return (EAttribute)workUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkUnit_State() {
		return (EAttribute)workUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnderExecution() {
		return underExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnderExecution_WorkUnitHandleName() {
		return (EAttribute)underExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnderExecution_OnWhat() {
		return (EAttribute)underExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnderExecution_PrimitiveACName() {
		return (EAttribute)underExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnderExecution_WorkUnitName() {
		return (EAttribute)underExecutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getState() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOnWhat() {
		return onWhatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutioncontextFactory getExecutioncontextFactory() {
		return (ExecutioncontextFactory)getEFactoryInstance();
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
		executionContextEClass = createEClass(EXECUTION_CONTEXT);
		createEAttribute(executionContextEClass, EXECUTION_CONTEXT__NAME);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__KEYS);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__VALUES);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__WORK_UNITS);
		createEReference(executionContextEClass, EXECUTION_CONTEXT__UNDER_EXECUTION);

		keyEClass = createEClass(KEY);
		createEAttribute(keyEClass, KEY__NAME);
		createEReference(keyEClass, KEY__VALUE);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__CONTENT);
		createEReference(valueEClass, VALUE__KEY);

		workUnitEClass = createEClass(WORK_UNIT);
		createEAttribute(workUnitEClass, WORK_UNIT__NAME);
		createEAttribute(workUnitEClass, WORK_UNIT__STATE);

		underExecutionEClass = createEClass(UNDER_EXECUTION);
		createEAttribute(underExecutionEClass, UNDER_EXECUTION__WORK_UNIT_HANDLE_NAME);
		createEAttribute(underExecutionEClass, UNDER_EXECUTION__ON_WHAT);
		createEAttribute(underExecutionEClass, UNDER_EXECUTION__PRIMITIVE_AC_NAME);
		createEAttribute(underExecutionEClass, UNDER_EXECUTION__WORK_UNIT_NAME);

		// Create enums
		stateEEnum = createEEnum(STATE);
		onWhatEEnum = createEEnum(ON_WHAT);
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

		// Initialize classes and features; add operations and parameters
		initEClass(executionContextEClass, ExecutionContext.class, "ExecutionContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionContext_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionContext_Keys(), this.getKey(), null, "keys", null, 0, -1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionContext_Values(), this.getValue(), null, "values", null, 0, -1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionContext_WorkUnits(), this.getWorkUnit(), null, "workUnits", null, 0, -1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionContext_UnderExecution(), this.getUnderExecution(), null, "underExecution", null, 0, 1, ExecutionContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKey_Name(), ecorePackage.getEString(), "name", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKey_Value(), this.getValue(), this.getValue_Key(), "value", null, 1, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Content(), ecorePackage.getEString(), "content", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValue_Key(), this.getKey(), this.getKey_Value(), "key", null, 1, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workUnitEClass, WorkUnit.class, "WorkUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkUnit_State(), this.getState(), "state", null, 0, 1, WorkUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(underExecutionEClass, UnderExecution.class, "UnderExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnderExecution_WorkUnitHandleName(), ecorePackage.getEString(), "workUnitHandleName", null, 0, 1, UnderExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnderExecution_OnWhat(), this.getOnWhat(), "onWhat", null, 0, 1, UnderExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnderExecution_PrimitiveACName(), ecorePackage.getEString(), "primitiveACName", null, 0, 1, UnderExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnderExecution_WorkUnitName(), ecorePackage.getEString(), "workUnitName", null, 0, 1, UnderExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.NOT_STARTED);
		addEEnumLiteral(stateEEnum, State.ON_START);
		addEEnumLiteral(stateEEnum, State.END_INITIALIZATION);
		addEEnumLiteral(stateEEnum, State.ON_DO);
		addEEnumLiteral(stateEEnum, State.DONE);
		addEEnumLiteral(stateEEnum, State.ON_END);
		addEEnumLiteral(stateEEnum, State.END_FINALIZATION);
		addEEnumLiteral(stateEEnum, State.FINISHED);

		initEEnum(onWhatEEnum, OnWhat.class, "OnWhat");
		addEEnumLiteral(onWhatEEnum, OnWhat.ON_START);
		addEEnumLiteral(onWhatEEnum, OnWhat.ON_DO);
		addEEnumLiteral(onWhatEEnum, OnWhat.ON_END);

		// Create resource
		createResource(eNS_URI);
	}

} //ExecutioncontextPackageImpl
