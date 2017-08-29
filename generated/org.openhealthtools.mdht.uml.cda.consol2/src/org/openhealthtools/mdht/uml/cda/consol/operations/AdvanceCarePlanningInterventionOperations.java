/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Care Planning Intervention</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionEntryReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Entry Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention#validateAdvanceCarePlanningInterventionPerformerTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Performer Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceCarePlanningInterventionOperations extends ClinicalStatementOperations {

	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceCarePlanningInterventionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionTemplateId(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionTemplateId(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.204' and id.extension = '2017-05-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionTemplateId(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionTemplateId(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceCarePlanningInterventionTemplateId(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceCarePlanningIntervention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionTemplateId"),
						new Object[] { advanceCarePlanningIntervention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionClassCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionClassCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::PROC";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionClassCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionClassCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceCarePlanningInterventionClassCode(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceCarePlanningIntervention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionClassCode"),
						new Object[] { advanceCarePlanningIntervention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionMoodCodeP(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Mood Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionMoodCodeP(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionMoodCodeP(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Mood Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionMoodCodeP(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceCarePlanningInterventionMoodCodeP(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceCarePlanningIntervention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionMoodCodeP"),
						new Object[] { advanceCarePlanningIntervention }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningInterventionMoodCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningInterventionMoodCodeP", passToken);
				}
				passToken.add(advanceCarePlanningIntervention);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionMoodCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionMoodCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentProcedureMood) and " +
			"let value : vocab::x_DocumentProcedureMood = self.moodCode.oclAsType(vocab::x_DocumentProcedureMood) in " +
			"value = vocab::x_DocumentProcedureMood::APT or value = vocab::x_DocumentProcedureMood::ARQ or value = vocab::x_DocumentProcedureMood::INT or value = vocab::x_DocumentProcedureMood::PRMS or value = vocab::x_DocumentProcedureMood::PRP or value = vocab::x_DocumentProcedureMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionMoodCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionMoodCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceCarePlanningInterventionMoodCode(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningInterventionMoodCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(advanceCarePlanningIntervention)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceCarePlanningIntervention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionMoodCode"),
						new Object[] { advanceCarePlanningIntervention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionId(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionId(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionId(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionId(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceCarePlanningInterventionId(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceCarePlanningIntervention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_ID,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionId"),
						new Object[] { advanceCarePlanningIntervention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '713603004' or value.code = '713662007' or value.code = '713604005' or value.code = '99497' or value.code = '99498'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceCarePlanningInterventionCode(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceCarePlanningIntervention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionCode"),
						new Object[] { advanceCarePlanningIntervention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionCodeP(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionCodeP(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionCodeP(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionCodeP(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceCarePlanningInterventionCodeP(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceCarePlanningIntervention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionCodeP"),
						new Object[] { advanceCarePlanningIntervention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionStatusCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionStatusCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " +
			"value.code = 'completed' or value.code = 'active' or value.code = 'aborted' or value.code = 'cancelled')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionStatusCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionStatusCode(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceCarePlanningInterventionStatusCode(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceCarePlanningIntervention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionStatusCode"),
						new Object[] { advanceCarePlanningIntervention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionStatusCodeP(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionStatusCodeP(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionStatusCodeP(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionStatusCodeP(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceCarePlanningInterventionStatusCodeP(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceCarePlanningIntervention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionStatusCodeP"),
						new Object[] { advanceCarePlanningIntervention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionEffectiveTime(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionEffectiveTime(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionEffectiveTime(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionEffectiveTime(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceCarePlanningInterventionEffectiveTime(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceCarePlanningIntervention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionEffectiveTime"),
						new Object[] { advanceCarePlanningIntervention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionPerformer(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionPerformer(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->exists(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionPerformer(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionPerformer(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceCarePlanningInterventionPerformer(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceCarePlanningIntervention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionPerformer"),
						new Object[] { advanceCarePlanningIntervention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionAuthor(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionAuthor(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionAuthor(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionAuthor(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceCarePlanningInterventionAuthor(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceCarePlanningIntervention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_AUTHOR,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionAuthor"),
						new Object[] { advanceCarePlanningIntervention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionEntryReference(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Entry Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionEntryReference(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::EntryReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionEntryReference(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Entry Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionEntryReference(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceCarePlanningInterventionEntryReference(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceCarePlanningIntervention)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_ENTRY_REFERENCE,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionEntryReference"),
						new Object[] { advanceCarePlanningIntervention }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionIVLTSLow(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionIVLTSLow(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionIVLTSLow(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionIVLTSLow(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceCarePlanningInterventionIVLTSLow(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceCarePlanningIntervention);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionIVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionIVLTSHigh(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionIVLTSHigh(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionIVLTSHigh(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionIVLTSHigh(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceCarePlanningInterventionIVLTSHigh(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceCarePlanningIntervention);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionIVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceCarePlanningInterventionPerformerTime(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Performer Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionPerformerTime(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceCarePlanningInterventionPerformerTime(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Care Planning Intervention Performer Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceCarePlanningInterventionPerformerTime(AdvanceCarePlanningIntervention, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceCarePlanningIntervention The receiving '<em><b>Advance Care Planning Intervention</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAdvanceCarePlanningInterventionPerformerTime(
			AdvanceCarePlanningIntervention advanceCarePlanningIntervention, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_CARE_PLANNING_INTERVENTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			advanceCarePlanningIntervention);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.ADVANCE_CARE_PLANNING_INTERVENTION__ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER_TIME,
							ConsolPlugin.INSTANCE.getString(
								"AdvanceCarePlanningInterventionAdvanceCarePlanningInterventionPerformerTime"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // AdvanceCarePlanningInterventionOperations
