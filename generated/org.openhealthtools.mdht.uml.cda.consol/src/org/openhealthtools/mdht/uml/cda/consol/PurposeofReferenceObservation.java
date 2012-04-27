/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purposeof Reference Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPurposeofReferenceObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation value.codeSystemName='DCM' templateId.root='2.16.840.1.113883.10.20.6.2.9' constraints.validation.error='PurposeofReferenceObservationTemplateId PurposeofReferenceObservationClassCode PurposeofReferenceObservationCode PurposeofReferenceObservationMoodCode' constraints.validation.warning='PurposeofReferenceObservationValue' classCode='OBS' moodCode='EVN' value.codeSystem='1.2.840.10008.2.16.4'"
 * @generated
 */
public interface PurposeofReferenceObservation extends Observation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.9')
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.6.2.9\')'"
	* @generated
	*/
	boolean validatePurposeofReferenceObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.classCode=vocab::ActClassObservation::OBS
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
	* @generated
	*/
	boolean validatePurposeofReferenceObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	* @generated
	*/
	boolean validatePurposeofReferenceObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
	* @generated
	*/
	boolean validatePurposeofReferenceObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and 
	* let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	* value.codeSystem = '1.2.840.10008.2.16.4' and not value.code.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'1.2.840.10008.2.16.4\' and not value.code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validatePurposeofReferenceObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PurposeofReferenceObservation init();
} // PurposeofReferenceObservation
