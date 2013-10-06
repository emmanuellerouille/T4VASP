/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.cvl.resolution;

import org.kermeta.cvl.variability.VSpecResolution;
import org.kermeta.cvl.variability.ValueSpecification;
import org.kermeta.cvl.variability.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Value Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.cvl.resolution.VariableValueAssignment#getValue <em>Value</em>}</li>
 *   <li>{@link org.kermeta.cvl.resolution.VariableValueAssignment#getResolvedVariable <em>Resolved Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.cvl.resolution.ResolutionPackage#getVariableValueAssignment()
 * @model
 * @generated
 */
public interface VariableValueAssignment extends VSpecResolution {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueSpecification)
	 * @see org.kermeta.cvl.resolution.ResolutionPackage#getVariableValueAssignment_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueSpecification getValue();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.resolution.VariableValueAssignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Resolved Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Variable</em>' reference.
	 * @see #setResolvedVariable(Variable)
	 * @see org.kermeta.cvl.resolution.ResolutionPackage#getVariableValueAssignment_ResolvedVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getResolvedVariable();

	/**
	 * Sets the value of the '{@link org.kermeta.cvl.resolution.VariableValueAssignment#getResolvedVariable <em>Resolved Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved Variable</em>' reference.
	 * @see #getResolvedVariable()
	 * @generated
	 */
	void setResolvedVariable(Variable value);

} // VariableValueAssignment
