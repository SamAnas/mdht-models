
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveOrganizer2Operations;

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

public class AdvanceDirectiveOrganizer2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceDirectiveOrganizer2AdvanceDirectiveObservation3() {
		OperationsTestCase<AdvanceDirectiveOrganizer2> validateAdvanceDirectiveOrganizer2AdvanceDirectiveObservation3TestCase = new OperationsTestCase<AdvanceDirectiveOrganizer2>(
			"validateAdvanceDirectiveOrganizer2AdvanceDirectiveObservation3",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER2_ADVANCE_DIRECTIVE_OBSERVATION3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveOrganizer2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveOrganizer2 target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation3().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOrganizer2Operations.validateAdvanceDirectiveOrganizer2AdvanceDirectiveObservation3(
					(AdvanceDirectiveOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveOrganizer2AdvanceDirectiveObservation3TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetAdvanceDirectiveObservation3s() {

		AdvanceDirectiveOrganizer2 target = objectFactory.create();
		target.getAdvanceDirectiveObservation3s();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceDirectiveOrganizerTemplateId() {
		OperationsTestCase<AdvanceDirectiveOrganizer2> validateAdvanceDirectiveOrganizerTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveOrganizer2>(
			"validateAdvanceDirectiveOrganizerTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveOrganizer2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveOrganizer2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOrganizer2Operations.validateAdvanceDirectiveOrganizerTemplateId(
					(AdvanceDirectiveOrganizer2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveOrganizer2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveOrganizer2> {
		public AdvanceDirectiveOrganizer2 create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectiveOrganizer2();
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
	private static class ConstructorTestClass extends AdvanceDirectiveOrganizer2Operations {
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

} // AdvanceDirectiveOrganizer2Operations
