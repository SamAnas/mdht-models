
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional3;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectivesSectionEntriesOptional3Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directives Section Entries Optional3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional3#getConsolAdvanceDirectiveOrganizers() <em>Get Consol Advance Directive Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional3#validateAdvanceDirectivesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional3#validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Advance Directive Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional3#validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional2 Advance Directive Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional3#getConsolAdvanceDirectiveObservation2s() <em>Get Consol Advance Directive Observation2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectivesSectionEntriesOptional3Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testGetConsolAdvanceDirectiveOrganizers() {

		AdvanceDirectivesSectionEntriesOptional3 target = objectFactory.create();
		target.getConsolAdvanceDirectiveOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceDirectivesSectionEntriesOptionalTemplateId() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional3> validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional3>(
			"validateAdvanceDirectivesSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional3 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptional3Operations.validateAdvanceDirectivesSectionEntriesOptionalTemplateId(
					(AdvanceDirectivesSectionEntriesOptional3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional3> validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservationTestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional3>(
			"validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_ADVANCE_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional3 target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation2().init());
			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional3 target) {
				target.getEntries().clear();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptional3Operations.validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation(
					(AdvanceDirectivesSectionEntriesOptional3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer() {
		OperationsTestCase<AdvanceDirectivesSectionEntriesOptional3> validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizerTestCase = new OperationsTestCase<AdvanceDirectivesSectionEntriesOptional3>(
			"validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSectionEntriesOptional3 target) {
				target.init();
				target.addOrganizer(ConsolFactory.eINSTANCE.createAdvanceDirectiveOrganizer().init());
			}

			@Override
			protected void updateToPass(AdvanceDirectivesSectionEntriesOptional3 target) {
				target.getEntries().clear();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSectionEntriesOptional3Operations.validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer(
					(AdvanceDirectivesSectionEntriesOptional3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetConsolAdvanceDirectiveObservation2s() {

		AdvanceDirectivesSectionEntriesOptional3 target = objectFactory.create();
		target.getConsolAdvanceDirectiveObservation2s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectivesSectionEntriesOptional3Operations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectivesSectionEntriesOptional3> {
		public AdvanceDirectivesSectionEntriesOptional3 create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectivesSectionEntriesOptional3();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends AdvanceDirectivesSectionEntriesOptional3Operations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // AdvanceDirectivesSectionEntriesOptional3Operations
