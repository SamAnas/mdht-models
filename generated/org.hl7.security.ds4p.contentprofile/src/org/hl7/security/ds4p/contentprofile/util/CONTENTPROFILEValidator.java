/**
 */
package org.hl7.security.ds4p.contentprofile.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.mdht.uml.cda.util.CDAValidator;

import org.hl7.security.ds4p.contentprofile.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.hl7.security.ds4p.contentprofile.CONTENTPROFILEPackage
 * @generated
 */
public class CONTENTPROFILEValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CONTENTPROFILEValidator INSTANCE = new CONTENTPROFILEValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.hl7.security.ds4p.contentprofile";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Segmented Document Template Id' of 'Privacy Segmented Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_SEGMENTED_DOCUMENT__PRIVACY_SEGMENTED_DOCUMENT_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Segmented Document Author1' of 'Privacy Segmented Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_SEGMENTED_DOCUMENT__PRIVACY_SEGMENTED_DOCUMENT_AUTHOR1 = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Segmented Document Segmented Section' of 'Privacy Segmented Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_SEGMENTED_DOCUMENT__PRIVACY_SEGMENTED_DOCUMENT_SEGMENTED_SECTION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Segmented Document Privacy And Security Markings Section' of 'Privacy Segmented Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_SEGMENTED_DOCUMENT__PRIVACY_SEGMENTED_DOCUMENT_PRIVACY_AND_SECURITY_MARKINGS_SECTION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Segmented Section Template Id' of 'Privacy Segmented Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_SEGMENTED_SECTION__PRIVACY_SEGMENTED_SECTION_TEMPLATE_ID = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Segmented Section Confidentiality Code' of 'Privacy Segmented Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_SEGMENTED_SECTION__PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Segmented Section Confidentiality Code P' of 'Privacy Segmented Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_SEGMENTED_SECTION__PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE_P = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Segmented Section Author' of 'Privacy Segmented Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_SEGMENTED_SECTION__PRIVACY_SEGMENTED_SECTION_AUTHOR = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Markings Section Template Id' of 'Privacy Markings Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_MARKINGS_SECTION__PRIVACY_MARKINGS_SECTION_TEMPLATE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Markings Section Code' of 'Privacy Markings Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_MARKINGS_SECTION__PRIVACY_MARKINGS_SECTION_CODE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Markings Section Code P' of 'Privacy Markings Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_MARKINGS_SECTION__PRIVACY_MARKINGS_SECTION_CODE_P = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Markings Section Text' of 'Privacy Markings Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_MARKINGS_SECTION__PRIVACY_MARKINGS_SECTION_TEXT = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Markings Section Entry1' of 'Privacy Markings Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_MARKINGS_SECTION__PRIVACY_MARKINGS_SECTION_ENTRY1 = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Obligation Policy Security Observation Value P' of 'Obligation Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBLIGATION_POLICY_SECURITY_OBSERVATION__OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE_P = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Obligation Policy Security Observation Value' of 'Obligation Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBLIGATION_POLICY_SECURITY_OBSERVATION__OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Template Id' of 'Obligation Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBLIGATION_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_TEMPLATE_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code P' of 'Obligation Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBLIGATION_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE_P = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code' of 'Obligation Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBLIGATION_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Template Id' of 'Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_OBSERVATION__SECURITY_OBSERVATION_TEMPLATE_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code P' of 'Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE_P = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code' of 'Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Value' of 'Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_OBSERVATION__SECURITY_OBSERVATION_VALUE = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Value P' of 'Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_OBSERVATION__SECURITY_OBSERVATION_VALUE_P = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Mood Code' of 'Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECURITY_OBSERVATION__SECURITY_OBSERVATION_MOOD_CODE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Document Provenance Template Id' of 'Mandatory Document Provenance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_DOCUMENT_PROVENANCE__MANDATORY_DOCUMENT_PROVENANCE_TEMPLATE_ID = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Document Provenance Time' of 'Mandatory Document Provenance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_DOCUMENT_PROVENANCE__MANDATORY_DOCUMENT_PROVENANCE_TIME = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Document Provenance Assigned Author' of 'Mandatory Document Provenance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_DOCUMENT_PROVENANCE__MANDATORY_DOCUMENT_PROVENANCE_ASSIGNED_AUTHOR = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Document Assigned Author Template Id' of 'Mandatory Document Assigned Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TEMPLATE_ID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Document Assigned Author Telecom Email' of 'Mandatory Document Assigned Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_TELECOM_EMAIL = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Document Assigned Author Assigned Authoring Device' of 'Mandatory Document Assigned Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Document Assigned Author Assigned Person' of 'Mandatory Document Assigned Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_ASSIGNED_PERSON = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Document Assigned Author Represented Organization' of 'Mandatory Document Assigned Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_DOCUMENT_ASSIGNED_AUTHOR__MANDATORY_DOCUMENT_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Annotation Template Id' of 'Privacy Annotation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_TEMPLATE_ID = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Annotation Class Code' of 'Privacy Annotation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_CLASS_CODE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Annotation Mood Code' of 'Privacy Annotation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_MOOD_CODE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Annotation Status Code P' of 'Privacy Annotation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_STATUS_CODE_P = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Annotation Status Code' of 'Privacy Annotation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_STATUS_CODE = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Annotation Obligation Policy Security Observation' of 'Privacy Annotation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_OBLIGATION_POLICY_SECURITY_OBSERVATION = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Annotation Refrain Policy Security Observation' of 'Privacy Annotation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_REFRAIN_POLICY_SECURITY_OBSERVATION = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Annotation Purpose Of Use Security Observation' of 'Privacy Annotation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_PURPOSE_OF_USE_SECURITY_OBSERVATION = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Annotation Confidentiality Code Security Observation' of 'Privacy Annotation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_ANNOTATION__PRIVACY_ANNOTATION_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Refrain Policy Security Observation Code P' of 'Refrain Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFRAIN_POLICY_SECURITY_OBSERVATION__REFRAIN_POLICY_SECURITY_OBSERVATION_CODE_P = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Refrain Policy Security Observation Code' of 'Refrain Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFRAIN_POLICY_SECURITY_OBSERVATION__REFRAIN_POLICY_SECURITY_OBSERVATION_CODE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Refrain Policy Security Observation Value P' of 'Refrain Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFRAIN_POLICY_SECURITY_OBSERVATION__REFRAIN_POLICY_SECURITY_OBSERVATION_VALUE_P = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Refrain Policy Security Observation Value' of 'Refrain Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFRAIN_POLICY_SECURITY_OBSERVATION__REFRAIN_POLICY_SECURITY_OBSERVATION_VALUE = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Template Id' of 'Refrain Policy Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFRAIN_POLICY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_TEMPLATE_ID = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Of Use Security Observation Code P' of 'Purpose Of Use Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_OF_USE_SECURITY_OBSERVATION__PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE_P = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Of Use Security Observation Code' of 'Purpose Of Use Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_OF_USE_SECURITY_OBSERVATION__PURPOSE_OF_USE_SECURITY_OBSERVATION_CODE = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Of Use Security Observation Value P' of 'Purpose Of Use Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_OF_USE_SECURITY_OBSERVATION__PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE_P = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Of Use Security Observation Value' of 'Purpose Of Use Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_OF_USE_SECURITY_OBSERVATION__PURPOSE_OF_USE_SECURITY_OBSERVATION_VALUE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Template Id' of 'Purpose Of Use Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_OF_USE_SECURITY_OBSERVATION__SECURITY_OBSERVATION_TEMPLATE_ID = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Confidentiality Security Observation Value P' of 'Confidentiality Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIDENTIALITY_SECURITY_OBSERVATION__CONFIDENTIALITY_SECURITY_OBSERVATION_VALUE_P = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Confidentiality Security Observation Value' of 'Confidentiality Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIDENTIALITY_SECURITY_OBSERVATION__CONFIDENTIALITY_SECURITY_OBSERVATION_VALUE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Template Id' of 'Confidentiality Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIDENTIALITY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_TEMPLATE_ID = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code P' of 'Confidentiality Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIDENTIALITY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE_P = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Security Observation Code' of 'Confidentiality Security Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIDENTIALITY_SECURITY_OBSERVATION__SECURITY_OBSERVATION_CODE = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Protected Problem'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROTECTED_PROBLEM__PROBLEM_OBSERVATION_TEMPLATE_ID = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Protected Problem Problem Provenance' of 'Protected Problem'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROTECTED_PROBLEM__PROTECTED_PROBLEM_PROBLEM_PROVENANCE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Protected Problem Privacy Annotations' of 'Protected Problem'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROTECTED_PROBLEM__PROTECTED_PROBLEM_PRIVACY_ANNOTATIONS = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Entry Provenance Template Id' of 'Mandatory Entry Provenance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_ENTRY_PROVENANCE__MANDATORY_ENTRY_PROVENANCE_TEMPLATE_ID = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Entry Provenance Time' of 'Mandatory Entry Provenance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_ENTRY_PROVENANCE__MANDATORY_ENTRY_PROVENANCE_TIME = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Entry Provenance Assigned Author' of 'Mandatory Entry Provenance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_ENTRY_PROVENANCE__MANDATORY_ENTRY_PROVENANCE_ASSIGNED_AUTHOR = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Entry Assigned Author Template Id' of 'Mandatory Entry Assigned Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_ENTRY_ASSIGNED_AUTHOR__MANDATORY_ENTRY_ASSIGNED_AUTHOR_TEMPLATE_ID = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Entry Assigned Author Assigned Authoring Device' of 'Mandatory Entry Assigned Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_ENTRY_ASSIGNED_AUTHOR__MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Entry Assigned Author Assigned Person' of 'Mandatory Entry Assigned Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_ENTRY_ASSIGNED_AUTHOR__MANDATORY_ENTRY_ASSIGNED_AUTHOR_ASSIGNED_PERSON = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mandatory Entry Assigned Author Represented Organization' of 'Mandatory Entry Assigned Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANDATORY_ENTRY_ASSIGNED_AUTHOR__MANDATORY_ENTRY_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Annotation Entry Relationship Template Id' of 'Privacy Annotation Entry Relationship'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_TEMPLATE_ID = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Annotation Entry Relationship Organizer' of 'Privacy Annotation Entry Relationship'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP__PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP_ORGANIZER = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Markings Entry Template Id' of 'Privacy Markings Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_MARKINGS_ENTRY__PRIVACY_MARKINGS_ENTRY_TEMPLATE_ID = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Privacy Markings Entry Organizer' of 'Privacy Markings Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_MARKINGS_ENTRY__PRIVACY_MARKINGS_ENTRY_ORGANIZER = 70;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 70;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDAValidator cdaValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTENTPROFILEValidator() {
		super();
		cdaValidator = CDAValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CONTENTPROFILEPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CONTENTPROFILEPackage.PRIVACY_SEGMENTED_DOCUMENT:
				return validatePrivacySegmentedDocument((PrivacySegmentedDocument)value, diagnostics, context);
			case CONTENTPROFILEPackage.PRIVACY_SEGMENTED_SECTION:
				return validatePrivacySegmentedSection((PrivacySegmentedSection)value, diagnostics, context);
			case CONTENTPROFILEPackage.PRIVACY_MARKINGS_SECTION:
				return validatePrivacyMarkingsSection((PrivacyMarkingsSection)value, diagnostics, context);
			case CONTENTPROFILEPackage.OBLIGATION_POLICY_SECURITY_OBSERVATION:
				return validateObligationPolicySecurityObservation((ObligationPolicySecurityObservation)value, diagnostics, context);
			case CONTENTPROFILEPackage.SECURITY_OBSERVATION:
				return validateSecurityObservation((SecurityObservation)value, diagnostics, context);
			case CONTENTPROFILEPackage.MANDATORY_DOCUMENT_PROVENANCE:
				return validateMandatoryDocumentProvenance((MandatoryDocumentProvenance)value, diagnostics, context);
			case CONTENTPROFILEPackage.MANDATORY_DOCUMENT_ASSIGNED_AUTHOR:
				return validateMandatoryDocumentAssignedAuthor((MandatoryDocumentAssignedAuthor)value, diagnostics, context);
			case CONTENTPROFILEPackage.PRIVACY_ANNOTATION:
				return validatePrivacyAnnotation((PrivacyAnnotation)value, diagnostics, context);
			case CONTENTPROFILEPackage.REFRAIN_POLICY_SECURITY_OBSERVATION:
				return validateRefrainPolicySecurityObservation((RefrainPolicySecurityObservation)value, diagnostics, context);
			case CONTENTPROFILEPackage.PURPOSE_OF_USE_SECURITY_OBSERVATION:
				return validatePurposeOfUseSecurityObservation((PurposeOfUseSecurityObservation)value, diagnostics, context);
			case CONTENTPROFILEPackage.CONFIDENTIALITY_SECURITY_OBSERVATION:
				return validateConfidentialitySecurityObservation((ConfidentialitySecurityObservation)value, diagnostics, context);
			case CONTENTPROFILEPackage.PROTECTED_PROBLEM:
				return validateProtectedProblem((ProtectedProblem)value, diagnostics, context);
			case CONTENTPROFILEPackage.MANDATORY_ENTRY_PROVENANCE:
				return validateMandatoryEntryProvenance((MandatoryEntryProvenance)value, diagnostics, context);
			case CONTENTPROFILEPackage.MANDATORY_ENTRY_ASSIGNED_AUTHOR:
				return validateMandatoryEntryAssignedAuthor((MandatoryEntryAssignedAuthor)value, diagnostics, context);
			case CONTENTPROFILEPackage.PRIVACY_ANNOTATION_ENTRY_RELATIONSHIP:
				return validatePrivacyAnnotationEntryRelationship((PrivacyAnnotationEntryRelationship)value, diagnostics, context);
			case CONTENTPROFILEPackage.PRIVACY_MARKINGS_ENTRY:
				return validatePrivacyMarkingsEntry((PrivacyMarkingsEntry)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacySegmentedDocument(PrivacySegmentedDocument privacySegmentedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(privacySegmentedDocument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(privacySegmentedDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(privacySegmentedDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(privacySegmentedDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(privacySegmentedDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(privacySegmentedDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(privacySegmentedDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(privacySegmentedDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(privacySegmentedDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacySegmentedDocument_validatePrivacySegmentedDocumentTemplateId(privacySegmentedDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacySegmentedDocument_validatePrivacySegmentedDocumentAuthor1(privacySegmentedDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacySegmentedDocument_validatePrivacySegmentedDocumentSegmentedSection(privacySegmentedDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacySegmentedDocument_validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection(privacySegmentedDocument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePrivacySegmentedDocumentTemplateId constraint of '<em>Privacy Segmented Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacySegmentedDocument_validatePrivacySegmentedDocumentTemplateId(PrivacySegmentedDocument privacySegmentedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacySegmentedDocument.validatePrivacySegmentedDocumentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacySegmentedDocumentAuthor1 constraint of '<em>Privacy Segmented Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacySegmentedDocument_validatePrivacySegmentedDocumentAuthor1(PrivacySegmentedDocument privacySegmentedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacySegmentedDocument.validatePrivacySegmentedDocumentAuthor1(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacySegmentedDocumentSegmentedSection constraint of '<em>Privacy Segmented Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacySegmentedDocument_validatePrivacySegmentedDocumentSegmentedSection(PrivacySegmentedDocument privacySegmentedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacySegmentedDocument.validatePrivacySegmentedDocumentSegmentedSection(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection constraint of '<em>Privacy Segmented Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacySegmentedDocument_validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection(PrivacySegmentedDocument privacySegmentedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacySegmentedDocument.validatePrivacySegmentedDocumentPrivacyAndSecurityMarkingsSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacySegmentedSection(PrivacySegmentedSection privacySegmentedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(privacySegmentedSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(privacySegmentedSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(privacySegmentedSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(privacySegmentedSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(privacySegmentedSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(privacySegmentedSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(privacySegmentedSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(privacySegmentedSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(privacySegmentedSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(privacySegmentedSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(privacySegmentedSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacySegmentedSection_validatePrivacySegmentedSectionTemplateId(privacySegmentedSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacySegmentedSection_validatePrivacySegmentedSectionConfidentialityCode(privacySegmentedSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacySegmentedSection_validatePrivacySegmentedSectionConfidentialityCodeP(privacySegmentedSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacySegmentedSection_validatePrivacySegmentedSectionAuthor(privacySegmentedSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePrivacySegmentedSectionTemplateId constraint of '<em>Privacy Segmented Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacySegmentedSection_validatePrivacySegmentedSectionTemplateId(PrivacySegmentedSection privacySegmentedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacySegmentedSection.validatePrivacySegmentedSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacySegmentedSectionConfidentialityCode constraint of '<em>Privacy Segmented Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacySegmentedSection_validatePrivacySegmentedSectionConfidentialityCode(PrivacySegmentedSection privacySegmentedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacySegmentedSection.validatePrivacySegmentedSectionConfidentialityCode(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacySegmentedSectionConfidentialityCodeP constraint of '<em>Privacy Segmented Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacySegmentedSection_validatePrivacySegmentedSectionConfidentialityCodeP(PrivacySegmentedSection privacySegmentedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacySegmentedSection.validatePrivacySegmentedSectionConfidentialityCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacySegmentedSectionAuthor constraint of '<em>Privacy Segmented Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacySegmentedSection_validatePrivacySegmentedSectionAuthor(PrivacySegmentedSection privacySegmentedSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacySegmentedSection.validatePrivacySegmentedSectionAuthor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyMarkingsSection(PrivacyMarkingsSection privacyMarkingsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(privacyMarkingsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyMarkingsSection_validatePrivacyMarkingsSectionTemplateId(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyMarkingsSection_validatePrivacyMarkingsSectionCode(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyMarkingsSection_validatePrivacyMarkingsSectionCodeP(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyMarkingsSection_validatePrivacyMarkingsSectionText(privacyMarkingsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyMarkingsSection_validatePrivacyMarkingsSectionEntry1(privacyMarkingsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePrivacyMarkingsSectionTemplateId constraint of '<em>Privacy Markings Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyMarkingsSection_validatePrivacyMarkingsSectionTemplateId(PrivacyMarkingsSection privacyMarkingsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyMarkingsSection.validatePrivacyMarkingsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyMarkingsSectionCode constraint of '<em>Privacy Markings Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyMarkingsSection_validatePrivacyMarkingsSectionCode(PrivacyMarkingsSection privacyMarkingsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyMarkingsSection.validatePrivacyMarkingsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyMarkingsSectionCodeP constraint of '<em>Privacy Markings Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyMarkingsSection_validatePrivacyMarkingsSectionCodeP(PrivacyMarkingsSection privacyMarkingsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyMarkingsSection.validatePrivacyMarkingsSectionCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyMarkingsSectionText constraint of '<em>Privacy Markings Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyMarkingsSection_validatePrivacyMarkingsSectionText(PrivacyMarkingsSection privacyMarkingsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyMarkingsSection.validatePrivacyMarkingsSectionText(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyMarkingsSectionEntry1 constraint of '<em>Privacy Markings Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyMarkingsSection_validatePrivacyMarkingsSectionEntry1(PrivacyMarkingsSection privacyMarkingsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyMarkingsSection.validatePrivacyMarkingsSectionEntry1(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationPolicySecurityObservation(ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(obligationPolicySecurityObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateObligationPolicySecurityObservation_validateSecurityObservationTemplateId(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateObligationPolicySecurityObservation_validateSecurityObservationCodeP(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateObligationPolicySecurityObservation_validateSecurityObservationCode(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationValue(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationValueP(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationMoodCode(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateObligationPolicySecurityObservation_validateObligationPolicySecurityObservationValueP(obligationPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateObligationPolicySecurityObservation_validateObligationPolicySecurityObservationValue(obligationPolicySecurityObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateObligationPolicySecurityObservationValueP constraint of '<em>Obligation Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationPolicySecurityObservation_validateObligationPolicySecurityObservationValueP(ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return obligationPolicySecurityObservation.validateObligationPolicySecurityObservationValueP(diagnostics, context);
	}

	/**
	 * Validates the validateObligationPolicySecurityObservationValue constraint of '<em>Obligation Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationPolicySecurityObservation_validateObligationPolicySecurityObservationValue(ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return obligationPolicySecurityObservation.validateObligationPolicySecurityObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationTemplateId constraint of '<em>Obligation Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationPolicySecurityObservation_validateSecurityObservationTemplateId(ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return obligationPolicySecurityObservation.validateSecurityObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCodeP constraint of '<em>Obligation Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationPolicySecurityObservation_validateSecurityObservationCodeP(ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return obligationPolicySecurityObservation.validateSecurityObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCode constraint of '<em>Obligation Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligationPolicySecurityObservation_validateSecurityObservationCode(ObligationPolicySecurityObservation obligationPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return obligationPolicySecurityObservation.validateSecurityObservationCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation(SecurityObservation securityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(securityObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(securityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(securityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(securityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(securityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(securityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(securityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(securityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(securityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationTemplateId(securityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationCodeP(securityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationCode(securityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationValue(securityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationValueP(securityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationMoodCode(securityObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSecurityObservationTemplateId constraint of '<em>Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation_validateSecurityObservationTemplateId(SecurityObservation securityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityObservation.validateSecurityObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCodeP constraint of '<em>Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation_validateSecurityObservationCodeP(SecurityObservation securityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityObservation.validateSecurityObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCode constraint of '<em>Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation_validateSecurityObservationCode(SecurityObservation securityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityObservation.validateSecurityObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationValue constraint of '<em>Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation_validateSecurityObservationValue(SecurityObservation securityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityObservation.validateSecurityObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationValueP constraint of '<em>Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation_validateSecurityObservationValueP(SecurityObservation securityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityObservation.validateSecurityObservationValueP(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationMoodCode constraint of '<em>Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityObservation_validateSecurityObservationMoodCode(SecurityObservation securityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return securityObservation.validateSecurityObservationMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryDocumentProvenance(MandatoryDocumentProvenance mandatoryDocumentProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mandatoryDocumentProvenance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mandatoryDocumentProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mandatoryDocumentProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mandatoryDocumentProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mandatoryDocumentProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mandatoryDocumentProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mandatoryDocumentProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mandatoryDocumentProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mandatoryDocumentProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateAuthor_validateTypeCode(mandatoryDocumentProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateAuthor_validateContextControlCode(mandatoryDocumentProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryDocumentProvenance_validateMandatoryDocumentProvenanceTemplateId(mandatoryDocumentProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryDocumentProvenance_validateMandatoryDocumentProvenanceTime(mandatoryDocumentProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryDocumentProvenance_validateMandatoryDocumentProvenanceAssignedAuthor(mandatoryDocumentProvenance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMandatoryDocumentProvenanceTemplateId constraint of '<em>Mandatory Document Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryDocumentProvenance_validateMandatoryDocumentProvenanceTemplateId(MandatoryDocumentProvenance mandatoryDocumentProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryDocumentProvenance.validateMandatoryDocumentProvenanceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMandatoryDocumentProvenanceTime constraint of '<em>Mandatory Document Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryDocumentProvenance_validateMandatoryDocumentProvenanceTime(MandatoryDocumentProvenance mandatoryDocumentProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryDocumentProvenance.validateMandatoryDocumentProvenanceTime(diagnostics, context);
	}

	/**
	 * Validates the validateMandatoryDocumentProvenanceAssignedAuthor constraint of '<em>Mandatory Document Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryDocumentProvenance_validateMandatoryDocumentProvenanceAssignedAuthor(MandatoryDocumentProvenance mandatoryDocumentProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryDocumentProvenance.validateMandatoryDocumentProvenanceAssignedAuthor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryDocumentAssignedAuthor(MandatoryDocumentAssignedAuthor mandatoryDocumentAssignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mandatoryDocumentAssignedAuthor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateAssignedAuthor_validateAssignedAuthorChoice(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateAssignedAuthor_validateClassCode(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryDocumentAssignedAuthor_validateMandatoryDocumentAssignedAuthorTemplateId(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryDocumentAssignedAuthor_validateMandatoryDocumentAssignedAuthorTelecomEmail(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryDocumentAssignedAuthor_validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryDocumentAssignedAuthor_validateMandatoryDocumentAssignedAuthorAssignedPerson(mandatoryDocumentAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryDocumentAssignedAuthor_validateMandatoryDocumentAssignedAuthorRepresentedOrganization(mandatoryDocumentAssignedAuthor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMandatoryDocumentAssignedAuthorTemplateId constraint of '<em>Mandatory Document Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryDocumentAssignedAuthor_validateMandatoryDocumentAssignedAuthorTemplateId(MandatoryDocumentAssignedAuthor mandatoryDocumentAssignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryDocumentAssignedAuthor.validateMandatoryDocumentAssignedAuthorTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMandatoryDocumentAssignedAuthorTelecomEmail constraint of '<em>Mandatory Document Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryDocumentAssignedAuthor_validateMandatoryDocumentAssignedAuthorTelecomEmail(MandatoryDocumentAssignedAuthor mandatoryDocumentAssignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryDocumentAssignedAuthor.validateMandatoryDocumentAssignedAuthorTelecomEmail(diagnostics, context);
	}

	/**
	 * Validates the validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice constraint of '<em>Mandatory Document Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryDocumentAssignedAuthor_validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(MandatoryDocumentAssignedAuthor mandatoryDocumentAssignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryDocumentAssignedAuthor.validateMandatoryDocumentAssignedAuthorAssignedAuthoringDevice(diagnostics, context);
	}

	/**
	 * Validates the validateMandatoryDocumentAssignedAuthorAssignedPerson constraint of '<em>Mandatory Document Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryDocumentAssignedAuthor_validateMandatoryDocumentAssignedAuthorAssignedPerson(MandatoryDocumentAssignedAuthor mandatoryDocumentAssignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryDocumentAssignedAuthor.validateMandatoryDocumentAssignedAuthorAssignedPerson(diagnostics, context);
	}

	/**
	 * Validates the validateMandatoryDocumentAssignedAuthorRepresentedOrganization constraint of '<em>Mandatory Document Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryDocumentAssignedAuthor_validateMandatoryDocumentAssignedAuthorRepresentedOrganization(MandatoryDocumentAssignedAuthor mandatoryDocumentAssignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryDocumentAssignedAuthor.validateMandatoryDocumentAssignedAuthorRepresentedOrganization(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyAnnotation(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(privacyAnnotation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyAnnotation_validatePrivacyAnnotationTemplateId(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyAnnotation_validatePrivacyAnnotationClassCode(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyAnnotation_validatePrivacyAnnotationMoodCode(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyAnnotation_validatePrivacyAnnotationStatusCodeP(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyAnnotation_validatePrivacyAnnotationStatusCode(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyAnnotation_validatePrivacyAnnotationObligationPolicySecurityObservation(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyAnnotation_validatePrivacyAnnotationRefrainPolicySecurityObservation(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyAnnotation_validatePrivacyAnnotationPurposeOfUseSecurityObservation(privacyAnnotation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyAnnotation_validatePrivacyAnnotationConfidentialityCodeSecurityObservation(privacyAnnotation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePrivacyAnnotationTemplateId constraint of '<em>Privacy Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyAnnotation_validatePrivacyAnnotationTemplateId(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyAnnotation.validatePrivacyAnnotationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyAnnotationClassCode constraint of '<em>Privacy Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyAnnotation_validatePrivacyAnnotationClassCode(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyAnnotation.validatePrivacyAnnotationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyAnnotationMoodCode constraint of '<em>Privacy Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyAnnotation_validatePrivacyAnnotationMoodCode(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyAnnotation.validatePrivacyAnnotationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyAnnotationStatusCodeP constraint of '<em>Privacy Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyAnnotation_validatePrivacyAnnotationStatusCodeP(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyAnnotation.validatePrivacyAnnotationStatusCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyAnnotationStatusCode constraint of '<em>Privacy Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyAnnotation_validatePrivacyAnnotationStatusCode(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyAnnotation.validatePrivacyAnnotationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyAnnotationObligationPolicySecurityObservation constraint of '<em>Privacy Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyAnnotation_validatePrivacyAnnotationObligationPolicySecurityObservation(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyAnnotation.validatePrivacyAnnotationObligationPolicySecurityObservation(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyAnnotationRefrainPolicySecurityObservation constraint of '<em>Privacy Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyAnnotation_validatePrivacyAnnotationRefrainPolicySecurityObservation(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyAnnotation.validatePrivacyAnnotationRefrainPolicySecurityObservation(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyAnnotationPurposeOfUseSecurityObservation constraint of '<em>Privacy Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyAnnotation_validatePrivacyAnnotationPurposeOfUseSecurityObservation(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyAnnotation.validatePrivacyAnnotationPurposeOfUseSecurityObservation(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyAnnotationConfidentialityCodeSecurityObservation constraint of '<em>Privacy Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyAnnotation_validatePrivacyAnnotationConfidentialityCodeSecurityObservation(PrivacyAnnotation privacyAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyAnnotation.validatePrivacyAnnotationConfidentialityCodeSecurityObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefrainPolicySecurityObservation(RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refrainPolicySecurityObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefrainPolicySecurityObservation_validateSecurityObservationTemplateId(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationCodeP(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationCode(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationValue(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationValueP(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationMoodCode(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefrainPolicySecurityObservation_validateRefrainPolicySecurityObservationCodeP(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefrainPolicySecurityObservation_validateRefrainPolicySecurityObservationCode(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefrainPolicySecurityObservation_validateRefrainPolicySecurityObservationValueP(refrainPolicySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefrainPolicySecurityObservation_validateRefrainPolicySecurityObservationValue(refrainPolicySecurityObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateRefrainPolicySecurityObservationCodeP constraint of '<em>Refrain Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefrainPolicySecurityObservation_validateRefrainPolicySecurityObservationCodeP(RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return refrainPolicySecurityObservation.validateRefrainPolicySecurityObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateRefrainPolicySecurityObservationCode constraint of '<em>Refrain Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefrainPolicySecurityObservation_validateRefrainPolicySecurityObservationCode(RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return refrainPolicySecurityObservation.validateRefrainPolicySecurityObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateRefrainPolicySecurityObservationValueP constraint of '<em>Refrain Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefrainPolicySecurityObservation_validateRefrainPolicySecurityObservationValueP(RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return refrainPolicySecurityObservation.validateRefrainPolicySecurityObservationValueP(diagnostics, context);
	}

	/**
	 * Validates the validateRefrainPolicySecurityObservationValue constraint of '<em>Refrain Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefrainPolicySecurityObservation_validateRefrainPolicySecurityObservationValue(RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return refrainPolicySecurityObservation.validateRefrainPolicySecurityObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationTemplateId constraint of '<em>Refrain Policy Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefrainPolicySecurityObservation_validateSecurityObservationTemplateId(RefrainPolicySecurityObservation refrainPolicySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return refrainPolicySecurityObservation.validateSecurityObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeOfUseSecurityObservation(PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(purposeOfUseSecurityObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeOfUseSecurityObservation_validateSecurityObservationTemplateId(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationCodeP(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationCode(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationValue(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationValueP(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationMoodCode(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeOfUseSecurityObservation_validatePurposeOfUseSecurityObservationCodeP(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeOfUseSecurityObservation_validatePurposeOfUseSecurityObservationCode(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeOfUseSecurityObservation_validatePurposeOfUseSecurityObservationValueP(purposeOfUseSecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeOfUseSecurityObservation_validatePurposeOfUseSecurityObservationValue(purposeOfUseSecurityObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePurposeOfUseSecurityObservationCodeP constraint of '<em>Purpose Of Use Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeOfUseSecurityObservation_validatePurposeOfUseSecurityObservationCodeP(PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeOfUseSecurityObservation.validatePurposeOfUseSecurityObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeOfUseSecurityObservationCode constraint of '<em>Purpose Of Use Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeOfUseSecurityObservation_validatePurposeOfUseSecurityObservationCode(PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeOfUseSecurityObservation.validatePurposeOfUseSecurityObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeOfUseSecurityObservationValueP constraint of '<em>Purpose Of Use Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeOfUseSecurityObservation_validatePurposeOfUseSecurityObservationValueP(PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeOfUseSecurityObservation.validatePurposeOfUseSecurityObservationValueP(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeOfUseSecurityObservationValue constraint of '<em>Purpose Of Use Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeOfUseSecurityObservation_validatePurposeOfUseSecurityObservationValue(PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeOfUseSecurityObservation.validatePurposeOfUseSecurityObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationTemplateId constraint of '<em>Purpose Of Use Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeOfUseSecurityObservation_validateSecurityObservationTemplateId(PurposeOfUseSecurityObservation purposeOfUseSecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeOfUseSecurityObservation.validateSecurityObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentialitySecurityObservation(ConfidentialitySecurityObservation confidentialitySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(confidentialitySecurityObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfidentialitySecurityObservation_validateSecurityObservationTemplateId(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfidentialitySecurityObservation_validateSecurityObservationCodeP(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfidentialitySecurityObservation_validateSecurityObservationCode(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationValue(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationValueP(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecurityObservation_validateSecurityObservationMoodCode(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfidentialitySecurityObservation_validateConfidentialitySecurityObservationValueP(confidentialitySecurityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfidentialitySecurityObservation_validateConfidentialitySecurityObservationValue(confidentialitySecurityObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConfidentialitySecurityObservationValueP constraint of '<em>Confidentiality Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentialitySecurityObservation_validateConfidentialitySecurityObservationValueP(ConfidentialitySecurityObservation confidentialitySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return confidentialitySecurityObservation.validateConfidentialitySecurityObservationValueP(diagnostics, context);
	}

	/**
	 * Validates the validateConfidentialitySecurityObservationValue constraint of '<em>Confidentiality Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentialitySecurityObservation_validateConfidentialitySecurityObservationValue(ConfidentialitySecurityObservation confidentialitySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return confidentialitySecurityObservation.validateConfidentialitySecurityObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationTemplateId constraint of '<em>Confidentiality Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentialitySecurityObservation_validateSecurityObservationTemplateId(ConfidentialitySecurityObservation confidentialitySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return confidentialitySecurityObservation.validateSecurityObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCodeP constraint of '<em>Confidentiality Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentialitySecurityObservation_validateSecurityObservationCodeP(ConfidentialitySecurityObservation confidentialitySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return confidentialitySecurityObservation.validateSecurityObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateSecurityObservationCode constraint of '<em>Confidentiality Security Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidentialitySecurityObservation_validateSecurityObservationCode(ConfidentialitySecurityObservation confidentialitySecurityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return confidentialitySecurityObservation.validateSecurityObservationCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtectedProblem(ProtectedProblem protectedProblem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(protectedProblem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(protectedProblem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protectedProblem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protectedProblem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(protectedProblem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protectedProblem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(protectedProblem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(protectedProblem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(protectedProblem, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtectedProblem_validateProblemObservationTemplateId(protectedProblem, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtectedProblem_validateProtectedProblemProblemProvenance(protectedProblem, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtectedProblem_validateProtectedProblemPrivacyAnnotations(protectedProblem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Protected Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtectedProblem_validateProblemObservationTemplateId(ProtectedProblem protectedProblem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protectedProblem.validateProblemObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProtectedProblemProblemProvenance constraint of '<em>Protected Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtectedProblem_validateProtectedProblemProblemProvenance(ProtectedProblem protectedProblem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protectedProblem.validateProtectedProblemProblemProvenance(diagnostics, context);
	}

	/**
	 * Validates the validateProtectedProblemPrivacyAnnotations constraint of '<em>Protected Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtectedProblem_validateProtectedProblemPrivacyAnnotations(ProtectedProblem protectedProblem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protectedProblem.validateProtectedProblemPrivacyAnnotations(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryEntryProvenance(MandatoryEntryProvenance mandatoryEntryProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mandatoryEntryProvenance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mandatoryEntryProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mandatoryEntryProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mandatoryEntryProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mandatoryEntryProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mandatoryEntryProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mandatoryEntryProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mandatoryEntryProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mandatoryEntryProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateAuthor_validateTypeCode(mandatoryEntryProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateAuthor_validateContextControlCode(mandatoryEntryProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryEntryProvenance_validateMandatoryEntryProvenanceTemplateId(mandatoryEntryProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryEntryProvenance_validateMandatoryEntryProvenanceTime(mandatoryEntryProvenance, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryEntryProvenance_validateMandatoryEntryProvenanceAssignedAuthor(mandatoryEntryProvenance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMandatoryEntryProvenanceTemplateId constraint of '<em>Mandatory Entry Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryEntryProvenance_validateMandatoryEntryProvenanceTemplateId(MandatoryEntryProvenance mandatoryEntryProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryEntryProvenance.validateMandatoryEntryProvenanceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMandatoryEntryProvenanceTime constraint of '<em>Mandatory Entry Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryEntryProvenance_validateMandatoryEntryProvenanceTime(MandatoryEntryProvenance mandatoryEntryProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryEntryProvenance.validateMandatoryEntryProvenanceTime(diagnostics, context);
	}

	/**
	 * Validates the validateMandatoryEntryProvenanceAssignedAuthor constraint of '<em>Mandatory Entry Provenance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryEntryProvenance_validateMandatoryEntryProvenanceAssignedAuthor(MandatoryEntryProvenance mandatoryEntryProvenance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryEntryProvenance.validateMandatoryEntryProvenanceAssignedAuthor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryEntryAssignedAuthor(MandatoryEntryAssignedAuthor mandatoryEntryAssignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mandatoryEntryAssignedAuthor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mandatoryEntryAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mandatoryEntryAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mandatoryEntryAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mandatoryEntryAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mandatoryEntryAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mandatoryEntryAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mandatoryEntryAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mandatoryEntryAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateAssignedAuthor_validateAssignedAuthorChoice(mandatoryEntryAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateAssignedAuthor_validateClassCode(mandatoryEntryAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryEntryAssignedAuthor_validateMandatoryEntryAssignedAuthorTemplateId(mandatoryEntryAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryEntryAssignedAuthor_validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice(mandatoryEntryAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryEntryAssignedAuthor_validateMandatoryEntryAssignedAuthorAssignedPerson(mandatoryEntryAssignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validateMandatoryEntryAssignedAuthor_validateMandatoryEntryAssignedAuthorRepresentedOrganization(mandatoryEntryAssignedAuthor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMandatoryEntryAssignedAuthorTemplateId constraint of '<em>Mandatory Entry Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryEntryAssignedAuthor_validateMandatoryEntryAssignedAuthorTemplateId(MandatoryEntryAssignedAuthor mandatoryEntryAssignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryEntryAssignedAuthor.validateMandatoryEntryAssignedAuthorTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice constraint of '<em>Mandatory Entry Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryEntryAssignedAuthor_validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice(MandatoryEntryAssignedAuthor mandatoryEntryAssignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryEntryAssignedAuthor.validateMandatoryEntryAssignedAuthorAssignedAuthoringDevice(diagnostics, context);
	}

	/**
	 * Validates the validateMandatoryEntryAssignedAuthorAssignedPerson constraint of '<em>Mandatory Entry Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryEntryAssignedAuthor_validateMandatoryEntryAssignedAuthorAssignedPerson(MandatoryEntryAssignedAuthor mandatoryEntryAssignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryEntryAssignedAuthor.validateMandatoryEntryAssignedAuthorAssignedPerson(diagnostics, context);
	}

	/**
	 * Validates the validateMandatoryEntryAssignedAuthorRepresentedOrganization constraint of '<em>Mandatory Entry Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryEntryAssignedAuthor_validateMandatoryEntryAssignedAuthorRepresentedOrganization(MandatoryEntryAssignedAuthor mandatoryEntryAssignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mandatoryEntryAssignedAuthor.validateMandatoryEntryAssignedAuthorRepresentedOrganization(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyAnnotationEntryRelationship(PrivacyAnnotationEntryRelationship privacyAnnotationEntryRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(privacyAnnotationEntryRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(privacyAnnotationEntryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(privacyAnnotationEntryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(privacyAnnotationEntryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(privacyAnnotationEntryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(privacyAnnotationEntryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(privacyAnnotationEntryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(privacyAnnotationEntryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(privacyAnnotationEntryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateEntryRelationship_validateClinicalStatement(privacyAnnotationEntryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyAnnotationEntryRelationship_validatePrivacyAnnotationEntryRelationshipTemplateId(privacyAnnotationEntryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyAnnotationEntryRelationship_validatePrivacyAnnotationEntryRelationshipOrganizer(privacyAnnotationEntryRelationship, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePrivacyAnnotationEntryRelationshipTemplateId constraint of '<em>Privacy Annotation Entry Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyAnnotationEntryRelationship_validatePrivacyAnnotationEntryRelationshipTemplateId(PrivacyAnnotationEntryRelationship privacyAnnotationEntryRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyAnnotationEntryRelationship.validatePrivacyAnnotationEntryRelationshipTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyAnnotationEntryRelationshipOrganizer constraint of '<em>Privacy Annotation Entry Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyAnnotationEntryRelationship_validatePrivacyAnnotationEntryRelationshipOrganizer(PrivacyAnnotationEntryRelationship privacyAnnotationEntryRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyAnnotationEntryRelationship.validatePrivacyAnnotationEntryRelationshipOrganizer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyMarkingsEntry(PrivacyMarkingsEntry privacyMarkingsEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(privacyMarkingsEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(privacyMarkingsEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(privacyMarkingsEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(privacyMarkingsEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(privacyMarkingsEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(privacyMarkingsEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(privacyMarkingsEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(privacyMarkingsEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(privacyMarkingsEntry, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateEntry_validateClinicalStatement(privacyMarkingsEntry, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateEntry_validateContextConductionInd(privacyMarkingsEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyMarkingsEntry_validatePrivacyMarkingsEntryTemplateId(privacyMarkingsEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivacyMarkingsEntry_validatePrivacyMarkingsEntryOrganizer(privacyMarkingsEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePrivacyMarkingsEntryTemplateId constraint of '<em>Privacy Markings Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyMarkingsEntry_validatePrivacyMarkingsEntryTemplateId(PrivacyMarkingsEntry privacyMarkingsEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyMarkingsEntry.validatePrivacyMarkingsEntryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePrivacyMarkingsEntryOrganizer constraint of '<em>Privacy Markings Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyMarkingsEntry_validatePrivacyMarkingsEntryOrganizer(PrivacyMarkingsEntry privacyMarkingsEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyMarkingsEntry.validatePrivacyMarkingsEntryOrganizer(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CONTENTPROFILEPlugin.INSTANCE;
	}

} //CONTENTPROFILEValidator
