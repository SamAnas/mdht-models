/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Act;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getInsuranceProvider()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation statusCode.code='completed' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Payment sources' templateId.root='2.16.840.1.113883.3.88.11.83.5' constraints.validation.error='InsuranceProviderTemplateId InsuranceProviderInformationSource InsuranceProviderPaymentProviders InsuranceProviderHealthInsuranceType InsuranceProviderInsuranceInformation InsuranceProviderPatientInformation InsuranceProviderMemberId InsuranceProviderRelationshipToSubscriber InsuranceProviderRelationshipToSubscriberCodeSystem InsuranceProviderPatientName InsuranceProviderSubscriberId InsuranceProviderSubscriberAddress InsuranceProviderFinancialResponsibilityPartyType InsuranceProviderFinancialResponsibilityPartyTypeCode InsuranceProviderClassCode InsuranceProviderMoodCode InsuranceProviderId InsuranceProviderCode InsuranceProviderStatusCode InsuranceProviderPayerEntry' code.codeSystemName='LOINC' constraints.validation.warning='InsuranceProviderPayerEntryID InsuranceProviderHealthPlanCoverageStartTime InsuranceProviderHealthPlanCoverageStopTime InsuranceProviderMemberIdRoot InsuranceProviderSubscriberInformation InsuranceProviderSubscriberIdRoot InsuranceProviderFinancialResponsibilityPartyAddress' classCode='ACT' code.code='48768-6' constraints.validation.info='InsuranceProviderSequenceNumber InsuranceProviderInsuranceInfoSourceID InsuranceProviderInsuranceInfoSourceAddr' moodCode='DEF'"
 * @generated
 */
public interface InsuranceProvider extends Act {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.informant->isEmpty() 
	 *   or not self.getSection().informant->isEmpty()
	 *   or not self.getClinicalDocument().informant->isEmpty()
	 *   or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)
	 *   or (self.entryRelationship->exists(rel : cda::EntryRelationship | 
	 *    rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR
	 *    and rel.observation.code.code = '48766-0'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.informant->isEmpty() \r\n  or not self.getSection().informant->isEmpty()\r\n  or not self.getClinicalDocument().informant->isEmpty()\r\n  or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)\r\n  or (self.entryRelationship->exists(rel : cda::EntryRelationship | \r\n   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR\r\n   and rel.observation.code.code = \'48766-0\'))'"
	 * @generated
	 */
	boolean validateInsuranceProviderInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(rel : cda::EntryRelationship | not rel.sequenceNumber.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(rel : cda::EntryRelationship | not rel.sequenceNumber.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateInsuranceProviderSequenceNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))'"
	 * @generated
	 */
	boolean validateInsuranceProviderPaymentProviders(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | not a.id.root->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | not a.id.root->isEmpty())'"
	 * @generated
	 */
	boolean validateInsuranceProviderPayerEntryID(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.code.codeSystem = '2.16.840.1.113883.3.88.12.3221.5.2')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.code.codeSystem = \'2.16.840.1.113883.3.88.12.3221.5.2\')'"
	 * @generated
	 */
	boolean validateInsuranceProviderHealthInsuranceType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderInsuranceInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity.id->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity.id->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderInsuranceInfoSourceID(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity.addr->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity.addr->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderInsuranceInfoSourceAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.time.low->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.time.low->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderHealthPlanCoverageStartTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.time.high->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.time.high->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderHealthPlanCoverageStopTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT))'"
	 * @generated
	 */
	boolean validateInsuranceProviderPatientInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.id->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.id->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderMemberId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.id.root->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.id.root->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderMemberIdRoot(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderRelationshipToSubscriber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code.codeSystem = '2.16.840.1.113883.1.11.18877'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code.codeSystem = \'2.16.840.1.113883.1.11.18877\'))'"
	 * @generated
	 */
	boolean validateInsuranceProviderRelationshipToSubscriberCodeSystem(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.playingEntity.name->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.playingEntity.name->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderPatientName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD))'"
	 * @generated
	 */
	boolean validateInsuranceProviderSubscriberInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.id->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.id->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderSubscriberId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.id.root->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.id.root->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderSubscriberIdRoot(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.addr->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.addr->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderSubscriberAddress(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.typeCode = vocab::ParticipationPhysicalPerformer::PRF and per.assignedEntity.code->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.typeCode = vocab::ParticipationPhysicalPerformer::PRF and per.assignedEntity.code->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderFinancialResponsibilityPartyType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.code.codeSystem = '2.16.840.1.113883.1.11.10416'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.code.codeSystem = \'2.16.840.1.113883.1.11.10416\'))'"
	 * @generated
	 */
	boolean validateInsuranceProviderFinancialResponsibilityPartyTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.addr->size() > 0))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.addr->size() > 0))'"
	 * @generated
	 */
	boolean validateInsuranceProviderFinancialResponsibilityPartyAddress(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.5')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.5\')'"
	 * @generated
	 */
	boolean validateInsuranceProviderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::x_ActClassDocumentEntryAct::ACT'"
	 * @generated
	 */
	boolean validateInsuranceProviderClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::DEF
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_DocumentActMood::DEF'"
	 * @generated
	 */
	boolean validateInsuranceProviderMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	 * @generated
	 */
	boolean validateInsuranceProviderId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '48768-6' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (\r\nvalue.code = \'48768-6\' and value.codeSystem = \'2.16.840.1.113883.6.1\'))'"
	 * @generated
	 */
	boolean validateInsuranceProviderCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (\r\nvalue.code = \'completed\'))'"
	 * @generated
	 */
	boolean validateInsuranceProviderStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PayerEntry) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PayerEntry) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateInsuranceProviderPayerEntry(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PayerEntry)).oclAsType(consol::PayerEntry)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PayerEntry)).oclAsType(consol::PayerEntry)'"
	 * @generated
	 */
	EList<PayerEntry> getPayerEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceProvider init();
} // InsuranceProvider
