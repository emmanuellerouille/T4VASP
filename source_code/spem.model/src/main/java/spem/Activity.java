/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spem.Activity#getUseKind <em>Use Kind</em>}</li>
 *   <li>{@link spem.Activity#getUsedActivity <em>Used Activity</em>}</li>
 *   <li>{@link spem.Activity#getNestedBreakdownElement <em>Nested Breakdown Element</em>}</li>
 *   <li>{@link spem.Activity#getSuppressedBreakdownElement <em>Suppressed Breakdown Element</em>}</li>
 *   <li>{@link spem.Activity#getOwnedProcessParameter <em>Owned Process Parameter</em>}</li>
 *   <li>{@link spem.Activity#getDefaultContext <em>Default Context</em>}</li>
 *   <li>{@link spem.Activity#getValidContext <em>Valid Context</em>}</li>
 *   <li>{@link spem.Activity#getAlternatives <em>Alternatives</em>}</li>
 *   <li>{@link spem.Activity#getHowToStaff <em>How To Staff</em>}</li>
 *   <li>{@link spem.Activity#isIsEnactable <em>Is Enactable</em>}</li>
 * </ul>
 * </p>
 *
 * @see spem.SpemPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends WorkDefinition, WorkBreakdownElement, VariabilityElement {
	/**
	 * Returns the value of the '<em><b>Use Kind</b></em>' attribute.
	 * The default value is <code>"na"</code>.
	 * The literals are from the enumeration {@link spem.ActivityUseKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Kind</em>' attribute.
	 * @see spem.ActivityUseKind
	 * @see #setUseKind(ActivityUseKind)
	 * @see spem.SpemPackage#getActivity_UseKind()
	 * @model default="na" required="true" ordered="false"
	 * @generated
	 */
	ActivityUseKind getUseKind();

	/**
	 * Sets the value of the '{@link spem.Activity#getUseKind <em>Use Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Kind</em>' attribute.
	 * @see spem.ActivityUseKind
	 * @see #getUseKind()
	 * @generated
	 */
	void setUseKind(ActivityUseKind value);

	/**
	 * Returns the value of the '<em><b>Used Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Activity</em>' reference.
	 * @see #setUsedActivity(Activity)
	 * @see spem.SpemPackage#getActivity_UsedActivity()
	 * @model
	 * @generated
	 */
	Activity getUsedActivity();

	/**
	 * Sets the value of the '{@link spem.Activity#getUsedActivity <em>Used Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Activity</em>' reference.
	 * @see #getUsedActivity()
	 * @generated
	 */
	void setUsedActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Nested Breakdown Element</b></em>' containment reference list.
	 * The list contents are of type {@link spem.BreakdownElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Breakdown Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Breakdown Element</em>' containment reference list.
	 * @see spem.SpemPackage#getActivity_NestedBreakdownElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<BreakdownElement> getNestedBreakdownElement();

	/**
	 * Returns the value of the '<em><b>Suppressed Breakdown Element</b></em>' reference list.
	 * The list contents are of type {@link spem.BreakdownElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppressed Breakdown Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppressed Breakdown Element</em>' reference list.
	 * @see spem.SpemPackage#getActivity_SuppressedBreakdownElement()
	 * @model
	 * @generated
	 */
	EList<BreakdownElement> getSuppressedBreakdownElement();

	/**
	 * Returns the value of the '<em><b>Owned Process Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link spem.ProcessParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Process Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Process Parameter</em>' containment reference list.
	 * @see spem.SpemPackage#getActivity_OwnedProcessParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessParameter> getOwnedProcessParameter();

	/**
	 * Returns the value of the '<em><b>Default Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Context</em>' reference.
	 * @see #setDefaultContext(MethodConfiguration)
	 * @see spem.SpemPackage#getActivity_DefaultContext()
	 * @model
	 * @generated
	 */
	MethodConfiguration getDefaultContext();

	/**
	 * Sets the value of the '{@link spem.Activity#getDefaultContext <em>Default Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Context</em>' reference.
	 * @see #getDefaultContext()
	 * @generated
	 */
	void setDefaultContext(MethodConfiguration value);

	/**
	 * Returns the value of the '<em><b>Valid Context</b></em>' reference list.
	 * The list contents are of type {@link spem.MethodConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Context</em>' reference list.
	 * @see spem.SpemPackage#getActivity_ValidContext()
	 * @model
	 * @generated
	 */
	EList<MethodConfiguration> getValidContext();

	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' reference list.
	 * The list contents are of type {@link spem.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternatives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternatives</em>' reference list.
	 * @see spem.SpemPackage#getActivity_Alternatives()
	 * @model
	 * @generated
	 */
	EList<Activity> getAlternatives();

	/**
	 * Returns the value of the '<em><b>How To Staff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>How To Staff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>How To Staff</em>' attribute.
	 * @see #setHowToStaff(String)
	 * @see spem.SpemPackage#getActivity_HowToStaff()
	 * @model
	 * @generated
	 */
	String getHowToStaff();

	/**
	 * Sets the value of the '{@link spem.Activity#getHowToStaff <em>How To Staff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>How To Staff</em>' attribute.
	 * @see #getHowToStaff()
	 * @generated
	 */
	void setHowToStaff(String value);

	/**
	 * Returns the value of the '<em><b>Is Enactable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Enactable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Enactable</em>' attribute.
	 * @see #setIsEnactable(boolean)
	 * @see spem.SpemPackage#getActivity_IsEnactable()
	 * @model
	 * @generated
	 */
	boolean isIsEnactable();

	/**
	 * Sets the value of the '{@link spem.Activity#isIsEnactable <em>Is Enactable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Enactable</em>' attribute.
	 * @see #isIsEnactable()
	 * @generated
	 */
	void setIsEnactable(boolean value);

} // Activity
