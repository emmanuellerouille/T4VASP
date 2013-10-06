/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spem.Qualification;
import spem.RoleDefinition;
import spem.SpemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spem.impl.RoleDefinitionImpl#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link spem.impl.RoleDefinitionImpl#getRequiredQualification <em>Required Qualification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleDefinitionImpl extends MethodContentElementImpl implements RoleDefinition {
	/**
	 * The cached value of the '{@link #getSynonym() <em>Synonym</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonym()
	 * @generated
	 * @ordered
	 */
	protected EList<String> synonym;

	/**
	 * The cached value of the '{@link #getRequiredQualification() <em>Required Qualification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredQualification()
	 * @generated
	 * @ordered
	 */
	protected EList<Qualification> requiredQualification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.ROLE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSynonym() {
		if (synonym == null) {
			synonym = new EDataTypeUniqueEList<String>(String.class, this, SpemPackage.ROLE_DEFINITION__SYNONYM);
		}
		return synonym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualification> getRequiredQualification() {
		if (requiredQualification == null) {
			requiredQualification = new EObjectResolvingEList<Qualification>(Qualification.class, this, SpemPackage.ROLE_DEFINITION__REQUIRED_QUALIFICATION);
		}
		return requiredQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.ROLE_DEFINITION__SYNONYM:
				return getSynonym();
			case SpemPackage.ROLE_DEFINITION__REQUIRED_QUALIFICATION:
				return getRequiredQualification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpemPackage.ROLE_DEFINITION__SYNONYM:
				getSynonym().clear();
				getSynonym().addAll((Collection<? extends String>)newValue);
				return;
			case SpemPackage.ROLE_DEFINITION__REQUIRED_QUALIFICATION:
				getRequiredQualification().clear();
				getRequiredQualification().addAll((Collection<? extends Qualification>)newValue);
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
			case SpemPackage.ROLE_DEFINITION__SYNONYM:
				getSynonym().clear();
				return;
			case SpemPackage.ROLE_DEFINITION__REQUIRED_QUALIFICATION:
				getRequiredQualification().clear();
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
			case SpemPackage.ROLE_DEFINITION__SYNONYM:
				return synonym != null && !synonym.isEmpty();
			case SpemPackage.ROLE_DEFINITION__REQUIRED_QUALIFICATION:
				return requiredQualification != null && !requiredQualification.isEmpty();
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
		result.append(" (synonym: ");
		result.append(synonym);
		result.append(')');
		return result.toString();
	}

} //RoleDefinitionImpl
