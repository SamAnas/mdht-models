/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation3;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Organizer2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer2#validateAdvanceDirectiveOrganizer2AdvanceDirectiveObservation3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer2 Advance Directive Observation3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer2#getAdvanceDirectiveObservation3s() <em>Get Advance Directive Observation3s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer2#validateAdvanceDirectiveOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveOrganizer2Operations extends AdvanceDirectiveOrganizerOperations {

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
	protected AdvanceDirectiveOrganizer2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveOrganizer2AdvanceDirectiveObservation3(AdvanceDirectiveOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer2 Advance Directive Observation3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveOrganizer2AdvanceDirectiveObservation3(AdvanceDirectiveOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER2_ADVANCE_DIRECTIVE_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::AdvanceDirectiveObservation3))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveOrganizer2AdvanceDirectiveObservation3(AdvanceDirectiveOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer2 Advance Directive Observation3</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveOrganizer2AdvanceDirectiveObservation3(AdvanceDirectiveOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER2_ADVANCE_DIRECTIVE_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveOrganizer2 The receiving '<em><b>Advance Directive Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveOrganizer2AdvanceDirectiveObservation3(
			AdvanceDirectiveOrganizer2 advanceDirectiveOrganizer2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER2_ADVANCE_DIRECTIVE_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_ORGANIZER2);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER2_ADVANCE_DIRECTIVE_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER2_ADVANCE_DIRECTIVE_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER2_ADVANCE_DIRECTIVE_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectiveOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVE_ORGANIZER2__ADVANCE_DIRECTIVE_ORGANIZER2_ADVANCE_DIRECTIVE_OBSERVATION3,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectiveOrganizer2AdvanceDirectiveOrganizer2AdvanceDirectiveObservation3"),
						new Object[] { advanceDirectiveOrganizer2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectiveObservation3s(AdvanceDirectiveOrganizer2) <em>Get Advance Directive Observation3s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectiveObservation3s(AdvanceDirectiveOrganizer2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVE_OBSERVATION3S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AdvanceDirectiveObservation3)).oclAsType(consol::AdvanceDirectiveObservation3)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectiveObservation3s(AdvanceDirectiveOrganizer2) <em>Get Advance Directive Observation3s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectiveObservation3s(AdvanceDirectiveOrganizer2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVE_OBSERVATION3S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AdvanceDirectiveObservation3> getAdvanceDirectiveObservation3s(
			AdvanceDirectiveOrganizer2 advanceDirectiveOrganizer2) {

		if (GET_ADVANCE_DIRECTIVE_OBSERVATION3S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ADVANCE_DIRECTIVE_ORGANIZER2,
				ConsolPackage.Literals.ADVANCE_DIRECTIVE_ORGANIZER2.getEAllOperations().get(64));
			try {
				GET_ADVANCE_DIRECTIVE_OBSERVATION3S__EOCL_QRY = helper.createQuery(
					GET_ADVANCE_DIRECTIVE_OBSERVATION3S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ADVANCE_DIRECTIVE_OBSERVATION3S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AdvanceDirectiveObservation3> result = (Collection<AdvanceDirectiveObservation3>) query.evaluate(
			advanceDirectiveOrganizer2);
		return new BasicEList.UnmodifiableEList<AdvanceDirectiveObservation3>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveOrganizerTemplateId(AdvanceDirectiveOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveOrganizerTemplateId(AdvanceDirectiveOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.108' and id.extension = '2017-05-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveOrganizerTemplateId(AdvanceDirectiveOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveOrganizerTemplateId(AdvanceDirectiveOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param advanceDirectiveOrganizer2 The receiving '<em><b>Advance Directive Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdvanceDirectiveOrganizerTemplateId(
			AdvanceDirectiveOrganizer2 advanceDirectiveOrganizer2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ADVANCE_DIRECTIVE_ORGANIZER2);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				advanceDirectiveOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ADVANCE_DIRECTIVE_ORGANIZER2__ADVANCE_DIRECTIVE_ORGANIZER_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"AdvanceDirectiveOrganizer2AdvanceDirectiveOrganizerTemplateId"),
						new Object[] { advanceDirectiveOrganizer2 }));
			}

			return false;
		}
		return true;
	}

} // AdvanceDirectiveOrganizer2Operations
