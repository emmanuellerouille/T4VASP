/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import spem.OptionalityKind;
import spem.ParameterDirectionKind;
import spem.SpemPackage;
import spem.WorkDefinitionParameter;
import spem.WorkProductDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Definition Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spem.impl.WorkDefinitionParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link spem.impl.WorkDefinitionParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link spem.impl.WorkDefinitionParameterImpl#getOptionality <em>Optionality</em>}</li>
 *   <li>{@link spem.impl.WorkDefinitionParameterImpl#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkDefinitionParameterImpl extends EObjectImpl implements WorkDefinitionParameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterDirectionKind DIRECTION_EDEFAULT = ParameterDirectionKind.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected ParameterDirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionality() <em>Optionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionality()
	 * @generated
	 * @ordered
	 */
	protected static final OptionalityKind OPTIONALITY_EDEFAULT = OptionalityKind.MANDATORY;

	/**
	 * The cached value of the '{@link #getOptionality() <em>Optionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionality()
	 * @generated
	 * @ordered
	 */
	protected OptionalityKind optionality = OPTIONALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected WorkProductDefinition parameterType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkDefinitionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.WORK_DEFINITION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_DEFINITION_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ParameterDirectionKind newDirection) {
		ParameterDirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_DEFINITION_PARAMETER__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalityKind getOptionality() {
		return optionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionality(OptionalityKind newOptionality) {
		OptionalityKind oldOptionality = optionality;
		optionality = newOptionality == null ? OPTIONALITY_EDEFAULT : newOptionality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_DEFINITION_PARAMETER__OPTIONALITY, oldOptionality, optionality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition getParameterType() {
		if (parameterType != null && parameterType.eIsProxy()) {
			InternalEObject oldParameterType = (InternalEObject)parameterType;
			parameterType = (WorkProductDefinition)eResolveProxy(oldParameterType);
			if (parameterType != oldParameterType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.WORK_DEFINITION_PARAMETER__PARAMETER_TYPE, oldParameterType, parameterType));
			}
		}
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductDefinition basicGetParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(WorkProductDefinition newParameterType) {
		WorkProductDefinition oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.WORK_DEFINITION_PARAMETER__PARAMETER_TYPE, oldParameterType, parameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.WORK_DEFINITION_PARAMETER__NAME:
				return getName();
			case SpemPackage.WORK_DEFINITION_PARAMETER__DIRECTION:
				return getDirection();
			case SpemPackage.WORK_DEFINITION_PARAMETER__OPTIONALITY:
				return getOptionality();
			case SpemPackage.WORK_DEFINITION_PARAMETER__PARAMETER_TYPE:
				if (resolve) return getParameterType();
				return basicGetParameterType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpemPackage.WORK_DEFINITION_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case SpemPackage.WORK_DEFINITION_PARAMETER__DIRECTION:
				setDirection((ParameterDirectionKind)newValue);
				return;
			case SpemPackage.WORK_DEFINITION_PARAMETER__OPTIONALITY:
				setOptionality((OptionalityKind)newValue);
				return;
			case SpemPackage.WORK_DEFINITION_PARAMETER__PARAMETER_TYPE:
				setParameterType((WorkProductDefinition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpemPackage.WORK_DEFINITION_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpemPackage.WORK_DEFINITION_PARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case SpemPackage.WORK_DEFINITION_PARAMETER__OPTIONALITY:
				setOptionality(OPTIONALITY_EDEFAULT);
				return;
			case SpemPackage.WORK_DEFINITION_PARAMETER__PARAMETER_TYPE:
				setParameterType((WorkProductDefinition)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpemPackage.WORK_DEFINITION_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpemPackage.WORK_DEFINITION_PARAMETER__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case SpemPackage.WORK_DEFINITION_PARAMETER__OPTIONALITY:
				return optionality != OPTIONALITY_EDEFAULT;
			case SpemPackage.WORK_DEFINITION_PARAMETER__PARAMETER_TYPE:
				return parameterType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", direction: ");
		result.append(direction);
		result.append(", optionality: ");
		result.append(optionality);
		result.append(')');
		return result.toString();
	}

} //WorkDefinitionParameterImpl
