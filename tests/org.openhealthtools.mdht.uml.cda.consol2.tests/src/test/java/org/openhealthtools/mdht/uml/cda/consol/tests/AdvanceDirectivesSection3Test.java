
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection3;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectivesSection3Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directives Section3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection3#validateAdvanceDirectivesSection3AdvanceDirectiveObservation3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section3 Advance Directive Observation3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection3#validateAdvanceDirectivesSection3AdvanceDirectiveOrganizer2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section3 Advance Directive Organizer2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection3#validateAdvanceDirectivesSection3AdvanceDirectiveOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section3 Advance Directive Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection3#getAdvanceDirectiveObservation3s() <em>Get Advance Directive Observation3s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection3#getAdvanceDirectiveOrganizer2s() <em>Get Advance Directive Organizer2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection3#validateAdvanceDirectivesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directives Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection3#getConsolAdvanceDirectiveOrganizers() <em>Get Consol Advance Directive Organizers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectivesSection3Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceDirectivesSection3AdvanceDirectiveObservation3() {
		OperationsTestCase<AdvanceDirectivesSection3> validateAdvanceDirectivesSection3AdvanceDirectiveObservation3TestCase = new OperationsTestCase<AdvanceDirectivesSection3>(
			"validateAdvanceDirectivesSection3AdvanceDirectiveObservation3",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION3_ADVANCE_DIRECTIVE_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection3 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection3Operations.validateAdvanceDirectivesSection3AdvanceDirectiveObservation3(
					(AdvanceDirectivesSection3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection3AdvanceDirectiveObservation3TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceDirectivesSection3AdvanceDirectiveOrganizer2() {
		OperationsTestCase<AdvanceDirectivesSection3> validateAdvanceDirectivesSection3AdvanceDirectiveOrganizer2TestCase = new OperationsTestCase<AdvanceDirectivesSection3>(
			"validateAdvanceDirectivesSection3AdvanceDirectiveOrganizer2",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION3_ADVANCE_DIRECTIVE_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection3 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection3Operations.validateAdvanceDirectivesSection3AdvanceDirectiveOrganizer2(
					(AdvanceDirectivesSection3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection3AdvanceDirectiveOrganizer2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceDirectivesSection3AdvanceDirectiveOrganizer() {
		OperationsTestCase<AdvanceDirectivesSection3> validateAdvanceDirectivesSection3AdvanceDirectiveOrganizerTestCase = new OperationsTestCase<AdvanceDirectivesSection3>(
			"validateAdvanceDirectivesSection3AdvanceDirectiveOrganizer",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION3_ADVANCE_DIRECTIVE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection3 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection3Operations.validateAdvanceDirectivesSection3AdvanceDirectiveOrganizer(
					(AdvanceDirectivesSection3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSection3AdvanceDirectiveOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetAdvanceDirectiveObservation3s() {

		AdvanceDirectivesSection3 target = objectFactory.create();
		target.getAdvanceDirectiveObservation3s();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetAdvanceDirectiveOrganizer2s() {

		AdvanceDirectivesSection3 target = objectFactory.create();
		target.getAdvanceDirectiveOrganizer2s();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceDirectivesSectionEntriesOptionalTemplateId() {
		OperationsTestCase<AdvanceDirectivesSection3> validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AdvanceDirectivesSection3>(
			"validateAdvanceDirectivesSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection3 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectivesSection3Operations.validateAdvanceDirectivesSectionEntriesOptionalTemplateId(
					(AdvanceDirectivesSection3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectivesSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetConsolAdvanceDirectiveOrganizers() {

		AdvanceDirectivesSection3 target = objectFactory.create();
		target.getConsolAdvanceDirectiveOrganizers();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectivesSection3Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectivesSection3> {
		public AdvanceDirectivesSection3 create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectivesSection3();
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
	private static class ConstructorTestClass extends AdvanceDirectivesSection3Operations {
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

} // AdvanceDirectivesSection3Operations
