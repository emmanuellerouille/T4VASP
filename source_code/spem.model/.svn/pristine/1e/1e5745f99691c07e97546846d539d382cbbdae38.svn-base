/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import spem.Category;
import spem.DescribableElement;
import spem.Guidance;
import spem.Metric;
import spem.SpemPackage;

import spem.uma.EstimatingConsideration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Describable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link spem.impl.DescribableElementImpl#getPresentationName <em>Presentation Name</em>}</li>
 *   <li>{@link spem.impl.DescribableElementImpl#getBriefDescription <em>Brief Description</em>}</li>
 *   <li>{@link spem.impl.DescribableElementImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link spem.impl.DescribableElementImpl#getMainDescription <em>Main Description</em>}</li>
 *   <li>{@link spem.impl.DescribableElementImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link spem.impl.DescribableElementImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link spem.impl.DescribableElementImpl#getPresentedAfter <em>Presented After</em>}</li>
 *   <li>{@link spem.impl.DescribableElementImpl#getPresentedBefore <em>Presented Before</em>}</li>
 *   <li>{@link spem.impl.DescribableElementImpl#getKeyConsideration <em>Key Consideration</em>}</li>
 *   <li>{@link spem.impl.DescribableElementImpl#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DescribableElementImpl extends ExtensibleElementImpl implements DescribableElement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescribableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpemPackage.Literals.DESCRIBABLE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME, oldPresentationName, presentationName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION, oldBriefDescription, briefDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE, oldPurpose, purpose));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION, oldMainDescription, mainDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guidance> getGuidance() {
		if (guidance == null) {
			guidance = new EObjectResolvingEList<Guidance>(Guidance.class, this, SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE);
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
			metric = new EObjectResolvingEList<Metric>(Metric.class, this, SpemPackage.DESCRIBABLE_ELEMENT__METRIC);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_AFTER, oldPresentedAfter, presentedAfter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_AFTER, oldPresentedAfter, presentedAfter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_BEFORE, oldPresentedBefore, presentedBefore));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_BEFORE, oldPresentedBefore, presentedBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EstimatingConsideration> getKeyConsideration() {
		if (keyConsideration == null) {
			keyConsideration = new EObjectResolvingEList<EstimatingConsideration>(EstimatingConsideration.class, this, SpemPackage.DESCRIBABLE_ELEMENT__KEY_CONSIDERATION);
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
			category = new EObjectResolvingEList<Category>(Category.class, this, SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME:
				return getPresentationName();
			case SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION:
				return getBriefDescription();
			case SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE:
				return getPurpose();
			case SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION:
				return getMainDescription();
			case SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE:
				return getGuidance();
			case SpemPackage.DESCRIBABLE_ELEMENT__METRIC:
				return getMetric();
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_AFTER:
				if (resolve) return getPresentedAfter();
				return basicGetPresentedAfter();
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_BEFORE:
				if (resolve) return getPresentedBefore();
				return basicGetPresentedBefore();
			case SpemPackage.DESCRIBABLE_ELEMENT__KEY_CONSIDERATION:
				return getKeyConsideration();
			case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY:
				return getCategory();
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
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME:
				setPresentationName((String)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION:
				setBriefDescription((String)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE:
				setPurpose((String)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION:
				setMainDescription((String)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE:
				getGuidance().clear();
				getGuidance().addAll((Collection<? extends Guidance>)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__METRIC:
				getMetric().clear();
				getMetric().addAll((Collection<? extends Metric>)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_AFTER:
				setPresentedAfter((DescribableElement)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_BEFORE:
				setPresentedBefore((DescribableElement)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__KEY_CONSIDERATION:
				getKeyConsideration().clear();
				getKeyConsideration().addAll((Collection<? extends EstimatingConsideration>)newValue);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
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
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME:
				setPresentationName(PRESENTATION_NAME_EDEFAULT);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION:
				setBriefDescription(BRIEF_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION:
				setMainDescription(MAIN_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE:
				getGuidance().clear();
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__METRIC:
				getMetric().clear();
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_AFTER:
				setPresentedAfter((DescribableElement)null);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_BEFORE:
				setPresentedBefore((DescribableElement)null);
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__KEY_CONSIDERATION:
				getKeyConsideration().clear();
				return;
			case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY:
				getCategory().clear();
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
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME:
				return PRESENTATION_NAME_EDEFAULT == null ? presentationName != null : !PRESENTATION_NAME_EDEFAULT.equals(presentationName);
			case SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION:
				return BRIEF_DESCRIPTION_EDEFAULT == null ? briefDescription != null : !BRIEF_DESCRIPTION_EDEFAULT.equals(briefDescription);
			case SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION:
				return MAIN_DESCRIPTION_EDEFAULT == null ? mainDescription != null : !MAIN_DESCRIPTION_EDEFAULT.equals(mainDescription);
			case SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE:
				return guidance != null && !guidance.isEmpty();
			case SpemPackage.DESCRIBABLE_ELEMENT__METRIC:
				return metric != null && !metric.isEmpty();
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_AFTER:
				return presentedAfter != null;
			case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTED_BEFORE:
				return presentedBefore != null;
			case SpemPackage.DESCRIBABLE_ELEMENT__KEY_CONSIDERATION:
				return keyConsideration != null && !keyConsideration.isEmpty();
			case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY:
				return category != null && !category.isEmpty();
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
		result.append(" (presentationName: ");
		result.append(presentationName);
		result.append(", briefDescription: ");
		result.append(briefDescription);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", mainDescription: ");
		result.append(mainDescription);
		result.append(')');
		return result.toString();
	}

} //DescribableElementImpl
