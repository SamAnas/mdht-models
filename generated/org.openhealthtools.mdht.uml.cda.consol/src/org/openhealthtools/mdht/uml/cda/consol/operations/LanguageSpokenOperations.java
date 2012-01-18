/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.LanguageSpoken;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Language Spoken</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LanguageSpoken#validateLanguageSpokenNoProficiencyLevelCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken No Proficiency Level Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LanguageSpoken#validateLanguageSpokenLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LanguageSpoken#validateLanguageSpokenModeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Mode Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageSpokenOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageSpokenOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLanguageSpokenNoProficiencyLevelCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken No Proficiency Level Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenNoProficiencyLevelCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.proficiencyLevelCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateLanguageSpokenNoProficiencyLevelCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken No Proficiency Level Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenNoProficiencyLevelCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.proficiencyLevelCode.oclIsUndefined()
	 * @param languageSpoken The receiving '<em><b>Language Spoken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLanguageSpokenNoProficiencyLevelCode(LanguageSpoken languageSpoken,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LANGUAGE_SPOKEN);
			try {
				VALIDATE_LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			languageSpoken)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE,
					ConsolPlugin.INSTANCE.getString("LanguageSpokenNoProficiencyLevelCode"),
					new Object[] { languageSpoken }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLanguageSpokenLanguageCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenLanguageCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LANGUAGE_SPOKEN_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in ("
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateLanguageSpokenLanguageCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenLanguageCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_LANGUAGE_SPOKEN_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined()))
	 * @param languageSpoken The receiving '<em><b>Language Spoken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLanguageSpokenLanguageCode(LanguageSpoken languageSpoken,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_LANGUAGE_SPOKEN_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LANGUAGE_SPOKEN);
			try {
				VALIDATE_LANGUAGE_SPOKEN_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LANGUAGE_SPOKEN_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LANGUAGE_SPOKEN_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			languageSpoken)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_LANGUAGE_CODE,
					ConsolPlugin.INSTANCE.getString("LanguageSpokenLanguageCode"), new Object[] { languageSpoken }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLanguageSpokenModeCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Mode Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenModeCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LANGUAGE_SPOKEN_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.modeCode.oclIsUndefined() or self.modeCode.isNullFlavorUndefined()) implies (self.modeCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR')))";

	/**
	 * The cached OCL invariant for the '{@link #validateLanguageSpokenModeCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Spoken Mode Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLanguageSpokenModeCode(LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_LANGUAGE_SPOKEN_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.modeCode.oclIsUndefined() or self.modeCode.isNullFlavorUndefined()) implies (self.modeCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.modeCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR')))
	 * @param languageSpoken The receiving '<em><b>Language Spoken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLanguageSpokenModeCode(LanguageSpoken languageSpoken, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_LANGUAGE_SPOKEN_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LANGUAGE_SPOKEN);
			try {
				VALIDATE_LANGUAGE_SPOKEN_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LANGUAGE_SPOKEN_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LANGUAGE_SPOKEN_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			languageSpoken)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_MODE_CODE,
					ConsolPlugin.INSTANCE.getString("LanguageSpokenModeCode"), new Object[] { languageSpoken }));
			}
			return false;
		}
		return true;
	}

} // LanguageSpokenOperations
