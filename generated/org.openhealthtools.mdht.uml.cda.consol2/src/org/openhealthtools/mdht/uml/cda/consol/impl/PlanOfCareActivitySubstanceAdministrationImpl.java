/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SubstanceAdministrationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivitySubstanceAdministrationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Of Care Activity Substance Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlanOfCareActivitySubstanceAdministrationImpl extends SubstanceAdministrationImpl
		implements PlanOfCareActivitySubstanceAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfCareActivitySubstanceAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivitySubstanceAdministrationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivitySubstanceAdministrationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivitySubstanceAdministrationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePlanOfCareActivitySubstanceAdministrationId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareActivitySubstanceAdministration init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareActivitySubstanceAdministration init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlanOfCareActivitySubstanceAdministrationImpl
