/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Of Past Illness Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getHistoryOfPastIllnessSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HistoryOfPastIllnessSectionTemplateId HistoryOfPastIllnessSectionCode HistoryOfPastIllnessSectionCodeP' templateId.root='2.16.840.1.113883.10.20.22.2.20' templateId.extension='2015-08-01' code.code='11348-0' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='History of Past Illness' constraints.validation.dependOn.HistoryOfPastIllnessSectionCode='HistoryOfPastIllnessSectionCodeP' constraints.validation.info='HistoryOfPastIllnessSectionProblemObservation'"
 * @generated
 */
public interface HistoryOfPastIllnessSection2 extends HistoryOfPastIllnessSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)).oclAsType(consol::ProblemObservation2)'"
	 * @generated
	 */
	EList<ProblemObservation2> getConsolProblemObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // HistoryOfPastIllnessSection2
