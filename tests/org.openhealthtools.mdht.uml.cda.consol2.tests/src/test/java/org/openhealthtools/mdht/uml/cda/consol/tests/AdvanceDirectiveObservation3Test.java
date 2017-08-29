
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.vocab.NullFlavor;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation3;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveObservation3Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation3#validateAdvanceDirectiveObservation2ValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation3#validateAdvanceDirectiveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation3#validateAdvanceDirectiveObservation2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation3#validateAdvanceDirectiveObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation3#validateAdvanceDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation3#validateAdvanceDirectiveObservation2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation3#validateAdvanceDirectiveObservation2CDTranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 CD Translation P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveObservation3Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceDirectiveObservation2ValueP() {
		OperationsTestCase<AdvanceDirectiveObservation3> validateAdvanceDirectiveObservation2ValuePTestCase = new OperationsTestCase<AdvanceDirectiveObservation3>(
			"validateAdvanceDirectiveObservation2ValueP", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation3 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation3 target) {
				target.getValues().clear();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation3Operations.validateAdvanceDirectiveObservation2ValueP(
					(AdvanceDirectiveObservation3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2ValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceDirectiveObservationTemplateId() {
		OperationsTestCase<AdvanceDirectiveObservation3> validateAdvanceDirectiveObservationTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation3>(
			"validateAdvanceDirectiveObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation3 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation3Operations.validateAdvanceDirectiveObservationTemplateId(
					(AdvanceDirectiveObservation3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceDirectiveObservation2Value() {
		OperationsTestCase<AdvanceDirectiveObservation3> validateAdvanceDirectiveObservation2ValueTestCase = new OperationsTestCase<AdvanceDirectiveObservation3>(
			"validateAdvanceDirectiveObservation2Value", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation3 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation3 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("385741000", "2.16.840.1.113883.6.96");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation3Operations.validateAdvanceDirectiveObservation2Value(
					(AdvanceDirectiveObservation3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceDirectiveObservationCodeP() {
		OperationsTestCase<AdvanceDirectiveObservation3> validateAdvanceDirectiveObservationCodePTestCase = new OperationsTestCase<AdvanceDirectiveObservation3>(
			"validateAdvanceDirectiveObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation3 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation3Operations.validateAdvanceDirectiveObservationCodeP(
					(AdvanceDirectiveObservation3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceDirectiveObservationCode() {
		OperationsTestCase<AdvanceDirectiveObservation3> validateAdvanceDirectiveObservationCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation3>(
			"validateAdvanceDirectiveObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// {
			// this.addPassTest(passTest);
			// /*
			// * <ocl>
			// (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and
			// self.code.oclIsKindOf(datatypes::CD) and let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in value.codeSystem =
			// '2.16.840.1.113883.6.96' and (value.code = '52765003' or value.code = '61420007' or value.code = '71388002' or value.code = '78823007'
			// or value.code = '89666000' or value.code = '225204009' or value.code = '281789004' or value.code = '304251008'))
			// </ocl>
			//
			// */
			// }

			// @Override
			// protected void updateToFail(AdvanceDirectiveObservation3 target) {
			//
			// }

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AdvanceDirectiveObservation3 target) {
						// incorrect nullFlavor and no entries that are required supplied
						target.init();
						target.setNullFlavor(NullFlavor.ASKU);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AdvanceDirectiveObservation3 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("1111111", "2.16.840.1.113883.6.96"));
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AdvanceDirectiveObservation3 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("52765003", "1.11.111.1.113883.6.96"));
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AdvanceDirectiveObservation3 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("75773-2", "2.16.840.1.113883.6.1"));
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AdvanceDirectiveObservation3 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("81352-7", "2.16.840.1.113883.6.1"));
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AdvanceDirectiveObservation3 target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("81351-9", "2.16.840.1.113883.6.1"));
					}
				});
			}

			// @Override
			// protected void updateToPass(AdvanceDirectiveObservation3 target) {
			// target.init();
			//
			// CD cd = DatatypesFactory.eINSTANCE.createCD();
			// target.setCode(cd);
			//
			// }

			@Override
			protected void setDependency(AdvanceDirectiveObservation3 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation3Operations.validateAdvanceDirectiveObservationCode(
					(AdvanceDirectiveObservation3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceDirectiveObservation2CDTranslation() {
		OperationsTestCase<AdvanceDirectiveObservation3> validateAdvanceDirectiveObservation2CDTranslationTestCase = new OperationsTestCase<AdvanceDirectiveObservation3>(
			"validateAdvanceDirectiveObservation2CDTranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation3 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation3Operations.validateAdvanceDirectiveObservation2CDTranslation(
					(AdvanceDirectiveObservation3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CDTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceDirectiveObservation2CDTranslationP() {
		OperationsTestCase<AdvanceDirectiveObservation3> validateAdvanceDirectiveObservation2CDTranslationPTestCase = new OperationsTestCase<AdvanceDirectiveObservation3>(
			"validateAdvanceDirectiveObservation2CDTranslationP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation3 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation3 target) {
				target.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation3Operations.validateAdvanceDirectiveObservation2CDTranslationP(
					(AdvanceDirectiveObservation3) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CDTranslationPTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveObservation3Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveObservation3> {
		public AdvanceDirectiveObservation3 create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation3();
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
	private static class ConstructorTestClass extends AdvanceDirectiveObservation3Operations {
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

} // AdvanceDirectiveObservation3Operations
