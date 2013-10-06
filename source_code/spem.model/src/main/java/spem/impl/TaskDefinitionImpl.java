/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spem.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spem.Category;
import spem.DescribableElement;
import spem.ExtensibleElement;
import spem.Guidance;
import spem.Kind;
import spem.MethodContentElement;
import spem.MethodContentKind;
import spem.MethodContentPackageableElement;
import spem.Metric;
import spem.Qualification;
import spem.SpemPackage;
import spem.Step;
import spem.TaskDefinition;
import spem.ToolDefinition;
import spem.VariabilityElement;
import spem.VariabilityType;

import spem.uma.EstimatingConsideration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getPresentationName <em>Presentation Name</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getBriefDescription <em>Brief Description</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getMainDescription <em>Main Description</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getPresentedAfter <em>Presented After</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getPresentedBefore <em>Presented Before</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getKeyConsideration <em>Key Consideration</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getVariabilityType <em>Variability Type</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getVariabilityBasedOnElement <em>Variability Based On Element</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getSuppressedMethodContentElement <em>Suppressed Method Content Element</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getMethodContentKind <em>Method Content Kind</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getChangeDescription <em>Change Description</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getUsedTool <em>Used Tool</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link spem.impl.TaskDefinitionImpl#getRequiredQualification <em>Required Qualification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskDefinitionImpl extends WorkDefinitionImpl implements TaskDefinition {
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Kind kind;

	/**
	 * The default value of the '{@link #getPresentationName() <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresentationName() <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationName()
	 * @generated
	 * @ordered
	 */
	protected String presentationName = PRESENTATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBriefDescription() <em>Brief Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBriefDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String BRIEF_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBriefDescription() <em>Brief Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBriefDescription()
	 * @generated
	 * @ordered
	 */
	protected String briefDescription = BRIEF_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMainDescription() <em>Main Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainDescription() <em>Main Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainDescription()
	 * @generated
	 * @ordered
	 */
	protected String mainDescription = MAIN_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuidance() <em>Guidance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected EList<Guidance> guidance;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected EList<Metric> metric;

	/**
	 * The cached value of the '{@link #getPresentedAfter() <em>Presented After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentedAfter()
	 * @generated
	 * @ordered
	 */
	protected DescribableElement presentedAfter;

	/**
	 * The cached value of the '{@link #getPresentedBefore() <em>Presented Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentedBefore()
	 * @generated
	 * @ordered
	 */
	protected DescribableElement presentedBefore;

	/**
	 * The cached value of the '{@link #getKeyConsideration() <em>Key Consideration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyConsideration()
	 * @generated
	 * @ordered
	 */
	protected EList<EstimatingConsideration> keyConsideration;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * The default value of the '{@link #getVariabilityType() <em>Variability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariabilityType()
	 * @generated
	 * @ordered
	 */
	protected static final VariabilityType VARIABILITY_TYPE_EDEFAULT = VariabilityType.NA;

	/**
	 * The cached value of the '{@link #getVariabilityType() <em>Variability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariabilityType()
	 * @generated
	 * @ordered
	 */
	protected VariabilityType variabilityType = VARIABILITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariabilityBasedOnElement() <em>Variability Based On Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariabilityBasedOnElement()
	 * @generated
	 * @ordered
	 */
	protected VariabilityElement variabilityBasedOnElement;

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
	 * The cached value of the '{@link #getSuppressedMethodContentElement() <em>Suppressed Method Content Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppressedMethodContentElement()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodContentElement> suppressedMethodContentElement;

	/**
	 * The cached value of the '{@link #getMethodContentKind() <em>Method Content Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodContentKind()
	 * @generated
	 * @ordered
	 */
	protected MethodContentKind methodContentKind;

	/**
	 * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected String copyright = COPYRIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<String> author;

	/**
	 * The default value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHANGE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected Date changeDate = CHANGE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeDescription() <em>Change Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeDescription() <em>Change Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDescription()
	 * @generated
	 * @ordered
	 */
	protected String changeDescription = CHANGE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsedTool() <em>Used Tool</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedTool()
	 * @generated
	 * @ordered
	 */
	protected EList<ToolDefinition> usedTool;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> step;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskDefinition> alternative;

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
	protected TaskDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.TASK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject)kind;
			kind = (Kind)eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.TASK_DEFINITION__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(Kind newKind) {
		Kind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresentationName() {
		return presentationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationName(String newPresentationName) {
		String oldPresentationName = presentationName;
		presentationName = newPresentationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__PRESENTATION_NAME, oldPresentationName, presentationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBriefDescription() {
		return briefDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBriefDescription(String newBriefDescription) {
		String oldBriefDescription = briefDescription;
		briefDescription = newBriefDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__BRIEF_DESCRIPTION, oldBriefDescription, briefDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainDescription() {
		return mainDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainDescription(String newMainDescription) {
		String oldMainDescription = mainDescription;
		mainDescription = newMainDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__MAIN_DESCRIPTION, oldMainDescription, mainDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guidance> getGuidance() {
		if (guidance == null) {
			guidance = new EObjectResolvingEList<Guidance>(Guidance.class, this, SpemPackage.TASK_DEFINITION__GUIDANCE);
		}
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metric> getMetric() {
		if (metric == null) {
			metric = new EObjectResolvingEList<Metric>(Metric.class, this, SpemPackage.TASK_DEFINITION__METRIC);
		}
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescribableElement getPresentedAfter() {
		if (presentedAfter != null && presentedAfter.eIsProxy()) {
			InternalEObject oldPresentedAfter = (InternalEObject)presentedAfter;
			presentedAfter = (DescribableElement)eResolveProxy(oldPresentedAfter);
			if (presentedAfter != oldPresentedAfter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.TASK_DEFINITION__PRESENTED_AFTER, oldPresentedAfter, presentedAfter));
			}
		}
		return presentedAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescribableElement basicGetPresentedAfter() {
		return presentedAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentedAfter(DescribableElement newPresentedAfter) {
		DescribableElement oldPresentedAfter = presentedAfter;
		presentedAfter = newPresentedAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__PRESENTED_AFTER, oldPresentedAfter, presentedAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescribableElement getPresentedBefore() {
		if (presentedBefore != null && presentedBefore.eIsProxy()) {
			InternalEObject oldPresentedBefore = (InternalEObject)presentedBefore;
			presentedBefore = (DescribableElement)eResolveProxy(oldPresentedBefore);
			if (presentedBefore != oldPresentedBefore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.TASK_DEFINITION__PRESENTED_BEFORE, oldPresentedBefore, presentedBefore));
			}
		}
		return presentedBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescribableElement basicGetPresentedBefore() {
		return presentedBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentedBefore(DescribableElement newPresentedBefore) {
		DescribableElement oldPresentedBefore = presentedBefore;
		presentedBefore = newPresentedBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__PRESENTED_BEFORE, oldPresentedBefore, presentedBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EstimatingConsideration> getKeyConsideration() {
		if (keyConsideration == null) {
			keyConsideration = new EObjectResolvingEList<EstimatingConsideration>(EstimatingConsideration.class, this, SpemPackage.TASK_DEFINITION__KEY_CONSIDERATION);
		}
		return keyConsideration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, SpemPackage.TASK_DEFINITION__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityType getVariabilityType() {
		return variabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariabilityType(VariabilityType newVariabilityType) {
		VariabilityType oldVariabilityType = variabilityType;
		variabilityType = newVariabilityType == null ? VARIABILITY_TYPE_EDEFAULT : newVariabilityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__VARIABILITY_TYPE, oldVariabilityType, variabilityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityElement getVariabilityBasedOnElement() {
		if (variabilityBasedOnElement != null && variabilityBasedOnElement.eIsProxy()) {
			InternalEObject oldVariabilityBasedOnElement = (InternalEObject)variabilityBasedOnElement;
			variabilityBasedOnElement = (VariabilityElement)eResolveProxy(oldVariabilityBasedOnElement);
			if (variabilityBasedOnElement != oldVariabilityBasedOnElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
			}
		}
		return variabilityBasedOnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityElement basicGetVariabilityBasedOnElement() {
		return variabilityBasedOnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariabilityBasedOnElement(VariabilityElement newVariabilityBasedOnElement) {
		VariabilityElement oldVariabilityBasedOnElement = variabilityBasedOnElement;
		variabilityBasedOnElement = newVariabilityBasedOnElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT, oldVariabilityBasedOnElement, variabilityBasedOnElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodContentElement> getSuppressedMethodContentElement() {
		if (suppressedMethodContentElement == null) {
			suppressedMethodContentElement = new EObjectResolvingEList<MethodContentElement>(MethodContentElement.class, this, SpemPackage.TASK_DEFINITION__SUPPRESSED_METHOD_CONTENT_ELEMENT);
		}
		return suppressedMethodContentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodContentKind getMethodContentKind() {
		if (methodContentKind != null && methodContentKind.eIsProxy()) {
			InternalEObject oldMethodContentKind = (InternalEObject)methodContentKind;
			methodContentKind = (MethodContentKind)eResolveProxy(oldMethodContentKind);
			if (methodContentKind != oldMethodContentKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND, oldMethodContentKind, methodContentKind));
			}
		}
		return methodContentKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodContentKind basicGetMethodContentKind() {
		return methodContentKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodContentKind(MethodContentKind newMethodContentKind) {
		MethodContentKind oldMethodContentKind = methodContentKind;
		methodContentKind = newMethodContentKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND, oldMethodContentKind, methodContentKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(String newCopyright) {
		String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAuthor() {
		if (author == null) {
			author = new EDataTypeUniqueEList<String>(String.class, this, SpemPackage.TASK_DEFINITION__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getChangeDate() {
		return changeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeDate(Date newChangeDate) {
		Date oldChangeDate = changeDate;
		changeDate = newChangeDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__CHANGE_DATE, oldChangeDate, changeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChangeDescription() {
		return changeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeDescription(String newChangeDescription) {
		String oldChangeDescription = changeDescription;
		changeDescription = newChangeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__CHANGE_DESCRIPTION, oldChangeDescription, changeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.TASK_DEFINITION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ToolDefinition> getUsedTool() {
		if (usedTool == null) {
			usedTool = new EObjectResolvingEList<ToolDefinition>(ToolDefinition.class, this, SpemPackage.TASK_DEFINITION__USED_TOOL);
		}
		return usedTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<Step>(Step.class, this, SpemPackage.TASK_DEFINITION__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskDefinition> getAlternative() {
		if (alternative == null) {
			alternative = new EObjectResolvingEList<TaskDefinition>(TaskDefinition.class, this, SpemPackage.TASK_DEFINITION__ALTERNATIVE);
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qualification> getRequiredQualification() {
		if (requiredQualification == null) {
			requiredQualification = new EObjectResolvingEList<Qualification>(Qualification.class, this, SpemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION);
		}
		return requiredQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.TASK_DEFINITION__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.TASK_DEFINITION__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case SpemPackage.TASK_DEFINITION__PRESENTATION_NAME:
				return getPresentationName();
			case SpemPackage.TASK_DEFINITION__BRIEF_DESCRIPTION:
				return getBriefDescription();
			case SpemPackage.TASK_DEFINITION__PURPOSE:
				return getPurpose();
			case SpemPackage.TASK_DEFINITION__MAIN_DESCRIPTION:
				return getMainDescription();
			case SpemPackage.TASK_DEFINITION__GUIDANCE:
				return getGuidance();
			case SpemPackage.TASK_DEFINITION__METRIC:
				return getMetric();
			case SpemPackage.TASK_DEFINITION__PRESENTED_AFTER:
				if (resolve) return getPresentedAfter();
				return basicGetPresentedAfter();
			case SpemPackage.TASK_DEFINITION__PRESENTED_BEFORE:
				if (resolve) return getPresentedBefore();
				return basicGetPresentedBefore();
			case SpemPackage.TASK_DEFINITION__KEY_CONSIDERATION:
				return getKeyConsideration();
			case SpemPackage.TASK_DEFINITION__CATEGORY:
				return getCategory();
			case SpemPackage.TASK_DEFINITION__VARIABILITY_TYPE:
				return getVariabilityType();
			case SpemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT:
				if (resolve) return getVariabilityBasedOnElement();
				return basicGetVariabilityBasedOnElement();
			case SpemPackage.TASK_DEFINITION__NAME:
				return getName();
			case SpemPackage.TASK_DEFINITION__SUPPRESSED_METHOD_CONTENT_ELEMENT:
				return getSuppressedMethodContentElement();
			case SpemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND:
				if (resolve) return getMethodContentKind();
				return basicGetMethodContentKind();
			case SpemPackage.TASK_DEFINITION__COPYRIGHT:
				return getCopyright();
			case SpemPackage.TASK_DEFINITION__AUTHOR:
				return getAuthor();
			case SpemPackage.TASK_DEFINITION__CHANGE_DATE:
				return getChangeDate();
			case SpemPackage.TASK_DEFINITION__CHANGE_DESCRIPTION:
				return getChangeDescription();
			case SpemPackage.TASK_DEFINITION__VERSION:
				return getVersion();
			case SpemPackage.TASK_DEFINITION__USED_TOOL:
				return getUsedTool();
			case SpemPackage.TASK_DEFINITION__STEP:
				return getStep();
			case SpemPackage.TASK_DEFINITION__ALTERNATIVE:
				return getAlternative();
			case SpemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION:
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
			case SpemPackage.TASK_DEFINITION__KIND:
				setKind((Kind)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__PRESENTATION_NAME:
				setPresentationName((String)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__BRIEF_DESCRIPTION:
				setBriefDescription((String)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__PURPOSE:
				setPurpose((String)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__MAIN_DESCRIPTION:
				setMainDescription((String)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__GUIDANCE:
				getGuidance().clear();
				getGuidance().addAll((Collection<? extends Guidance>)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__METRIC:
				getMetric().clear();
				getMetric().addAll((Collection<? extends Metric>)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__PRESENTED_AFTER:
				setPresentedAfter((DescribableElement)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__PRESENTED_BEFORE:
				setPresentedBefore((DescribableElement)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__KEY_CONSIDERATION:
				getKeyConsideration().clear();
				getKeyConsideration().addAll((Collection<? extends EstimatingConsideration>)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__VARIABILITY_TYPE:
				setVariabilityType((VariabilityType)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__SUPPRESSED_METHOD_CONTENT_ELEMENT:
				getSuppressedMethodContentElement().clear();
				getSuppressedMethodContentElement().addAll((Collection<? extends MethodContentElement>)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND:
				setMethodContentKind((MethodContentKind)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends String>)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__CHANGE_DATE:
				setChangeDate((Date)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__CHANGE_DESCRIPTION:
				setChangeDescription((String)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__VERSION:
				setVersion((String)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__USED_TOOL:
				getUsedTool().clear();
				getUsedTool().addAll((Collection<? extends ToolDefinition>)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__ALTERNATIVE:
				getAlternative().clear();
				getAlternative().addAll((Collection<? extends TaskDefinition>)newValue);
				return;
			case SpemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION:
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
			case SpemPackage.TASK_DEFINITION__KIND:
				setKind((Kind)null);
				return;
			case SpemPackage.TASK_DEFINITION__PRESENTATION_NAME:
				setPresentationName(PRESENTATION_NAME_EDEFAULT);
				return;
			case SpemPackage.TASK_DEFINITION__BRIEF_DESCRIPTION:
				setBriefDescription(BRIEF_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.TASK_DEFINITION__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case SpemPackage.TASK_DEFINITION__MAIN_DESCRIPTION:
				setMainDescription(MAIN_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.TASK_DEFINITION__GUIDANCE:
				getGuidance().clear();
				return;
			case SpemPackage.TASK_DEFINITION__METRIC:
				getMetric().clear();
				return;
			case SpemPackage.TASK_DEFINITION__PRESENTED_AFTER:
				setPresentedAfter((DescribableElement)null);
				return;
			case SpemPackage.TASK_DEFINITION__PRESENTED_BEFORE:
				setPresentedBefore((DescribableElement)null);
				return;
			case SpemPackage.TASK_DEFINITION__KEY_CONSIDERATION:
				getKeyConsideration().clear();
				return;
			case SpemPackage.TASK_DEFINITION__CATEGORY:
				getCategory().clear();
				return;
			case SpemPackage.TASK_DEFINITION__VARIABILITY_TYPE:
				setVariabilityType(VARIABILITY_TYPE_EDEFAULT);
				return;
			case SpemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT:
				setVariabilityBasedOnElement((VariabilityElement)null);
				return;
			case SpemPackage.TASK_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpemPackage.TASK_DEFINITION__SUPPRESSED_METHOD_CONTENT_ELEMENT:
				getSuppressedMethodContentElement().clear();
				return;
			case SpemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND:
				setMethodContentKind((MethodContentKind)null);
				return;
			case SpemPackage.TASK_DEFINITION__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case SpemPackage.TASK_DEFINITION__AUTHOR:
				getAuthor().clear();
				return;
			case SpemPackage.TASK_DEFINITION__CHANGE_DATE:
				setChangeDate(CHANGE_DATE_EDEFAULT);
				return;
			case SpemPackage.TASK_DEFINITION__CHANGE_DESCRIPTION:
				setChangeDescription(CHANGE_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.TASK_DEFINITION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case SpemPackage.TASK_DEFINITION__USED_TOOL:
				getUsedTool().clear();
				return;
			case SpemPackage.TASK_DEFINITION__STEP:
				getStep().clear();
				return;
			case SpemPackage.TASK_DEFINITION__ALTERNATIVE:
				getAlternative().clear();
				return;
			case SpemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION:
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
			case SpemPackage.TASK_DEFINITION__KIND:
				return kind != null;
			case SpemPackage.TASK_DEFINITION__PRESENTATION_NAME:
				return PRESENTATION_NAME_EDEFAULT == null ? presentationName != null : !PRESENTATION_NAME_EDEFAULT.equals(presentationName);
			case SpemPackage.TASK_DEFINITION__BRIEF_DESCRIPTION:
				return BRIEF_DESCRIPTION_EDEFAULT == null ? briefDescription != null : !BRIEF_DESCRIPTION_EDEFAULT.equals(briefDescription);
			case SpemPackage.TASK_DEFINITION__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case SpemPackage.TASK_DEFINITION__MAIN_DESCRIPTION:
				return MAIN_DESCRIPTION_EDEFAULT == null ? mainDescription != null : !MAIN_DESCRIPTION_EDEFAULT.equals(mainDescription);
			case SpemPackage.TASK_DEFINITION__GUIDANCE:
				return guidance != null && !guidance.isEmpty();
			case SpemPackage.TASK_DEFINITION__METRIC:
				return metric != null && !metric.isEmpty();
			case SpemPackage.TASK_DEFINITION__PRESENTED_AFTER:
				return presentedAfter != null;
			case SpemPackage.TASK_DEFINITION__PRESENTED_BEFORE:
				return presentedBefore != null;
			case SpemPackage.TASK_DEFINITION__KEY_CONSIDERATION:
				return keyConsideration != null && !keyConsideration.isEmpty();
			case SpemPackage.TASK_DEFINITION__CATEGORY:
				return category != null && !category.isEmpty();
			case SpemPackage.TASK_DEFINITION__VARIABILITY_TYPE:
				return variabilityType != VARIABILITY_TYPE_EDEFAULT;
			case SpemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT:
				return variabilityBasedOnElement != null;
			case SpemPackage.TASK_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpemPackage.TASK_DEFINITION__SUPPRESSED_METHOD_CONTENT_ELEMENT:
				return suppressedMethodContentElement != null && !suppressedMethodContentElement.isEmpty();
			case SpemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND:
				return methodContentKind != null;
			case SpemPackage.TASK_DEFINITION__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case SpemPackage.TASK_DEFINITION__AUTHOR:
				return author != null && !author.isEmpty();
			case SpemPackage.TASK_DEFINITION__CHANGE_DATE:
				return CHANGE_DATE_EDEFAULT == null ? changeDate != null : !CHANGE_DATE_EDEFAULT.equals(changeDate);
			case SpemPackage.TASK_DEFINITION__CHANGE_DESCRIPTION:
				return CHANGE_DESCRIPTION_EDEFAULT == null ? changeDescription != null : !CHANGE_DESCRIPTION_EDEFAULT.equals(changeDescription);
			case SpemPackage.TASK_DEFINITION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case SpemPackage.TASK_DEFINITION__USED_TOOL:
				return usedTool != null && !usedTool.isEmpty();
			case SpemPackage.TASK_DEFINITION__STEP:
				return step != null && !step.isEmpty();
			case SpemPackage.TASK_DEFINITION__ALTERNATIVE:
				return alternative != null && !alternative.isEmpty();
			case SpemPackage.TASK_DEFINITION__REQUIRED_QUALIFICATION:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ExtensibleElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.TASK_DEFINITION__KIND: return SpemPackage.EXTENSIBLE_ELEMENT__KIND;
				default: return -1;
			}
		}
		if (baseClass == DescribableElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.TASK_DEFINITION__PRESENTATION_NAME: return SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME;
				case SpemPackage.TASK_DEFINITION__BRIEF_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION;
				case SpemPackage.TASK_DEFINITION__PURPOSE: return SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE;
				case SpemPackage.TASK_DEFINITION__MAIN_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION;
				case SpemPackage.TASK_DEFINITION__GUIDANCE: return SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE;
				case SpemPackage.TASK_DEFINITION__METRIC: return SpemPackage.DESCRIBABLE_ELEMENT__METRIC;
				case SpemPackage.TASK_DEFINITION__PRESENTED_AFTER: return SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_AFTER;
				case SpemPackage.TASK_DEFINITION__PRESENTED_BEFORE: return SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_BEFORE;
				case SpemPackage.TASK_DEFINITION__KEY_CONSIDERATION: return SpemPackage.DESCRIBABLE_ELEMENT__KEY_CONSIDERATION;
				case SpemPackage.TASK_DEFINITION__CATEGORY: return SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.TASK_DEFINITION__VARIABILITY_TYPE: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE;
				case SpemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT: return SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MethodContentPackageableElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.TASK_DEFINITION__NAME: return SpemPackage.METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == MethodContentElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.TASK_DEFINITION__SUPPRESSED_METHOD_CONTENT_ELEMENT: return SpemPackage.METHOD_CONTENT_ELEMENT__SUPPRESSED_METHOD_CONTENT_ELEMENT;
				case SpemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND: return SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND;
				case SpemPackage.TASK_DEFINITION__COPYRIGHT: return SpemPackage.METHOD_CONTENT_ELEMENT__COPYRIGHT;
				case SpemPackage.TASK_DEFINITION__AUTHOR: return SpemPackage.METHOD_CONTENT_ELEMENT__AUTHOR;
				case SpemPackage.TASK_DEFINITION__CHANGE_DATE: return SpemPackage.METHOD_CONTENT_ELEMENT__CHANGE_DATE;
				case SpemPackage.TASK_DEFINITION__CHANGE_DESCRIPTION: return SpemPackage.METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION;
				case SpemPackage.TASK_DEFINITION__VERSION: return SpemPackage.METHOD_CONTENT_ELEMENT__VERSION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ExtensibleElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.EXTENSIBLE_ELEMENT__KIND: return SpemPackage.TASK_DEFINITION__KIND;
				default: return -1;
			}
		}
		if (baseClass == DescribableElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME: return SpemPackage.TASK_DEFINITION__PRESENTATION_NAME;
				case SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION: return SpemPackage.TASK_DEFINITION__BRIEF_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE: return SpemPackage.TASK_DEFINITION__PURPOSE;
				case SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION: return SpemPackage.TASK_DEFINITION__MAIN_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE: return SpemPackage.TASK_DEFINITION__GUIDANCE;
				case SpemPackage.DESCRIBABLE_ELEMENT__METRIC: return SpemPackage.TASK_DEFINITION__METRIC;
				case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_AFTER: return SpemPackage.TASK_DEFINITION__PRESENTED_AFTER;
				case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_BEFORE: return SpemPackage.TASK_DEFINITION__PRESENTED_BEFORE;
				case SpemPackage.DESCRIBABLE_ELEMENT__KEY_CONSIDERATION: return SpemPackage.TASK_DEFINITION__KEY_CONSIDERATION;
				case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY: return SpemPackage.TASK_DEFINITION__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == VariabilityElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_TYPE: return SpemPackage.TASK_DEFINITION__VARIABILITY_TYPE;
				case SpemPackage.VARIABILITY_ELEMENT__VARIABILITY_BASED_ON_ELEMENT: return SpemPackage.TASK_DEFINITION__VARIABILITY_BASED_ON_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MethodContentPackageableElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.METHOD_CONTENT_PACKAGEABLE_ELEMENT__NAME: return SpemPackage.TASK_DEFINITION__NAME;
				default: return -1;
			}
		}
		if (baseClass == MethodContentElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.METHOD_CONTENT_ELEMENT__SUPPRESSED_METHOD_CONTENT_ELEMENT: return SpemPackage.TASK_DEFINITION__SUPPRESSED_METHOD_CONTENT_ELEMENT;
				case SpemPackage.METHOD_CONTENT_ELEMENT__METHOD_CONTENT_KIND: return SpemPackage.TASK_DEFINITION__METHOD_CONTENT_KIND;
				case SpemPackage.METHOD_CONTENT_ELEMENT__COPYRIGHT: return SpemPackage.TASK_DEFINITION__COPYRIGHT;
				case SpemPackage.METHOD_CONTENT_ELEMENT__AUTHOR: return SpemPackage.TASK_DEFINITION__AUTHOR;
				case SpemPackage.METHOD_CONTENT_ELEMENT__CHANGE_DATE: return SpemPackage.TASK_DEFINITION__CHANGE_DATE;
				case SpemPackage.METHOD_CONTENT_ELEMENT__CHANGE_DESCRIPTION: return SpemPackage.TASK_DEFINITION__CHANGE_DESCRIPTION;
				case SpemPackage.METHOD_CONTENT_ELEMENT__VERSION: return SpemPackage.TASK_DEFINITION__VERSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (presentationName: ");
		result.append(presentationName);
		result.append(", briefDescription: ");
		result.append(briefDescription);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", mainDescription: ");
		result.append(mainDescription);
		result.append(", variabilityType: ");
		result.append(variabilityType);
		result.append(", name: ");
		result.append(name);
		result.append(", copyright: ");
		result.append(copyright);
		result.append(", author: ");
		result.append(author);
		result.append(", changeDate: ");
		result.append(changeDate);
		result.append(", changeDescription: ");
		result.append(changeDescription);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //TaskDefinitionImpl
