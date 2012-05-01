/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.operations.PastMedicalHistorySectionConsultOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Past Medical History Section Consult</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PastMedicalHistorySectionConsultImpl extends SectionImpl implements PastMedicalHistorySectionConsult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PastMedicalHistorySectionConsultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDTPackage.Literals.PAST_MEDICAL_HISTORY_SECTION_CONSULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePastMedicalHistorySectionConsultTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PastMedicalHistorySectionConsultOperations.validatePastMedicalHistorySectionConsultTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePastMedicalHistorySectionConsultCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PastMedicalHistorySectionConsultOperations.validatePastMedicalHistorySectionConsultCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePastMedicalHistorySectionConsultText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PastMedicalHistorySectionConsultOperations.validatePastMedicalHistorySectionConsultText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PastMedicalHistorySectionConsult init() {
		CDAUtil.init(this);
		return this;
	}
} // PastMedicalHistorySectionConsultImpl
