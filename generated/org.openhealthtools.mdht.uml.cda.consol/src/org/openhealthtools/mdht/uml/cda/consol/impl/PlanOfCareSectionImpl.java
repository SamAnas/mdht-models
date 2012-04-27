/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Of Care Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlanOfCareSectionImpl extends SectionImpl implements PlanOfCareSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PlanOfCareSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLAN_OF_CARE_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePlanOfCareSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePlanOfCareSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePlanOfCareSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePlanOfCareSectionPlanOfCareActivityAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityAct(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePlanOfCareSectionPlanOfCareActivityEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityEncounter(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePlanOfCareSectionPlanOfCareActivityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePlanOfCareSectionPlanOfCareActivityProcedure(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityProcedure(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePlanOfCareSectionPlanOfCareActivitySupply(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivitySupply(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PlanOfCareActivityAct getPlanOfCareActivityAct() {
		return PlanOfCareSectionOperations.getPlanOfCareActivityAct(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PlanOfCareActivityEncounter getPlanOfCareActivityEncounter() {
		return PlanOfCareSectionOperations.getPlanOfCareActivityEncounter(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PlanOfCareActivityObservation getPlanOfCareActivityObservation() {
		return PlanOfCareSectionOperations.getPlanOfCareActivityObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PlanOfCareActivityProcedure getPlanOfCareActivityProcedure() {
		return PlanOfCareSectionOperations.getPlanOfCareActivityProcedure(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PlanOfCareActivitySubstanceAdministration getPlanOfCareActivitySubstanceAdministration() {
		return PlanOfCareSectionOperations.getPlanOfCareActivitySubstanceAdministration(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PlanOfCareActivitySupply getPlanOfCareActivitySupply() {
		return PlanOfCareSectionOperations.getPlanOfCareActivitySupply(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PlanOfCareSection init() {
		CDAUtil.init(this);
		return this;
	}
} // PlanOfCareSectionImpl
