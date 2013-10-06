/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Breakdown Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spem.BreakdownElement#isHasMultipleOccurrences <em>Has Multiple Occurrences</em>}</li>
 *   <li>{@link spem.BreakdownElement#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link spem.BreakdownElement#isIsPlanned <em>Is Planned</em>}</li>
 *   <li>{@link spem.BreakdownElement#getPlanningData <em>Planning Data</em>}</li>
 *   <li>{@link spem.BreakdownElement#getUsageGuidance <em>Usage Guidance</em>}</li>
 * </ul>
 * </p>
 *
 * @see spem.SpemPackage#getBreakdownElement()
 * @model abstract="true"
 * @generated
 */
public interface BreakdownElement extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Has Multiple Occurrences</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Multiple Occurrences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Multiple Occurrences</em>' attribute.
	 * @see #setHasMultipleOccurrences(boolean)
	 * @see spem.SpemPackage#getBreakdownElement_HasMultipleOccurrences()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isHasMultipleOccurrences();

	/**
	 * Sets the value of the '{@link spem.BreakdownElement#isHasMultipleOccurrences <em>Has Multiple Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Multiple Occurrences</em>' attribute.
	 * @see #isHasMultipleOccurrences()
	 * @generated
	 */
	void setHasMultipleOccurrences(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see spem.SpemPackage#getBreakdownElement_IsOptional()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link spem.BreakdownElement#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Planned</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Planned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Planned</em>' attribute.
	 * @see #setIsPlanned(boolean)
	 * @see spem.SpemPackage#getBreakdownElement_IsPlanned()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsPlanned();

	/**
	 * Sets the value of the '{@link spem.BreakdownElement#isIsPlanned <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Planned</em>' attribute.
	 * @see #isIsPlanned()
	 * @generated
	 */
	void setIsPlanned(boolean value);

	/**
	 * Returns the value of the '<em><b>Planning Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planning Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Data</em>' containment reference.
	 * @see #setPlanningData(PlanningData)
	 * @see spem.SpemPackage#getBreakdownElement_PlanningData()
	 * @model containment="true"
	 * @generated
	 */
	PlanningData getPlanningData();

	/**
	 * Sets the value of the '{@link spem.BreakdownElement#getPlanningData <em>Planning Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Data</em>' containment reference.
	 * @see #getPlanningData()
	 * @generated
	 */
	void setPlanningData(PlanningData value);

	/**
	 * Returns the value of the '<em><b>Usage Guidance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Guidance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Guidance</em>' reference.
	 * @see #setUsageGuidance(Guidance)
	 * @see spem.SpemPackage#getBreakdownElement_UsageGuidance()
	 * @model
	 * @generated
	 */
	Guidance getUsageGuidance();

	/**
	 * Sets the value of the '{@link spem.BreakdownElement#getUsageGuidance <em>Usage Guidance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Guidance</em>' reference.
	 * @see #getUsageGuidance()
	 * @generated
	 */
	void setUsageGuidance(Guidance value);

} // BreakdownElement
