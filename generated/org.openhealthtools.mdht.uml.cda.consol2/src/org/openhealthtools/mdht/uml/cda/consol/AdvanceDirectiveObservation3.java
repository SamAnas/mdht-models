/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advance Directive Observation3</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAdvanceDirectiveObservation3()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AdvanceDirectiveObservationTemplateId AdvanceDirectiveObservation2Value AdvanceDirectiveObservation2ValueP AdvanceDirectiveObservationCodeP AdvanceDirectiveObservation2CDTranslation AdvanceDirectiveObservation2CDTranslationP' templateId.root='2.16.840.1.113883.10.20.22.4.48' templateId.extension='2017-05-01' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.warning='AdvanceDirectiveObservationCode' constraints.validation.dependOn.AdvanceDirectiveObservationCode='AdvanceDirectiveObservationCodeP' constraints.validation.query='AdvanceDirectiveObservation2CDTranslation AdvanceDirectiveObservation2CDTranslationP'"
 * @generated
 */
public interface AdvanceDirectiveObservation3 extends AdvanceDirectiveObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2ValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation3 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation3 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdvanceDirectiveObservation3
