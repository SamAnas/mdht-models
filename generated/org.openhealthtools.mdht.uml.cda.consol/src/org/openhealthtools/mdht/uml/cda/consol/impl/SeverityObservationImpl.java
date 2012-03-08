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
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.SeverityObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Severity Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SeverityObservationImpl extends ObservationImpl implements SeverityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeverityObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SEVERITY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservationTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservationOperations.validateSeverityObservationTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservationReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservationOperations.validateSeverityObservationReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservationOperations.validateSeverityObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservationOperations.validateSeverityObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservationOperations.validateSeverityObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservationOperations.validateSeverityObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservationOperations.validateSeverityObservationText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservationOperations.validateSeverityObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityObservationOperations.validateSeverityObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // SeverityObservationImpl
