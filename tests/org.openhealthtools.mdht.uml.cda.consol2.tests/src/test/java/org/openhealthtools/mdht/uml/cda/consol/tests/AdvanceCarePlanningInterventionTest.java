
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.Act;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.EntryRelationship;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.eclipse.mdht.uml.hl7.vocab.x_DocumentProcedureMood;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningIntervention;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceCarePlanningInterventionOperations;

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

public class AdvanceCarePlanningInterventionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionTemplateId() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionTemplateIdTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {

			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionTemplateId(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionClassCode() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionClassCodeTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {

			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionClassCode(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionMoodCodeP() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionMoodCodePTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionMoodCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {

			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionMoodCodeP(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionMoodCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionMoodCode() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionMoodCodeTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {
				target.init();
				target.setMoodCode(x_DocumentProcedureMood.DEF);
			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.setMoodCode(x_DocumentProcedureMood.APT);
			}

			@Override
			protected void setDependency(AdvanceCarePlanningIntervention target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AdvanceCarePlanningInterventionMoodCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionMoodCode(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionId() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionIdTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionId", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionId(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionCode() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionCodeTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionCode", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 */
			@Override
			public void addFailTests() {
				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(AdvanceCarePlanningIntervention target) {
						target.init();

					}
				});

				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(AdvanceCarePlanningIntervention target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("7136030041", "2.16.840.1.113883.6.96"));

					}
				});

				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(AdvanceCarePlanningIntervention target) {
						target.init();
						target.setCode(DatatypesFactory.eINSTANCE.createCD("713603004", "1.11.111.1.113883.6.96"));

					}
				});
			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {

				target.setCode(DatatypesFactory.eINSTANCE.createCD("713603004", "2.16.840.1.113883.6.96"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionCode(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionCodeP() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionCodePTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {

			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionCodeP(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionStatusCode() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionStatusCodeTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionStatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {

			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionStatusCode(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionStatusCodeP() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionStatusCodePTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionStatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS("active"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionStatusCodeP(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionEffectiveTime() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionEffectiveTimeTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {

			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionEffectiveTime(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionPerformer() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionPerformerTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionPerformer",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionPerformer(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionAuthor() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionAuthorTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionAuthor", operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionAuthor(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionEntryReference() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionEntryReferenceTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionEntryReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_ENTRY_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 */
			@Override
			public void addFailTests() {
				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(AdvanceCarePlanningIntervention target) {
						target.init();

					}
				});

				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(AdvanceCarePlanningIntervention target) {
						target.init();
						Act act = ConsolFactory.eINSTANCE.createEntryReference().init();
						target.addAct(act);
					}
				});

			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				Act act = ConsolFactory.eINSTANCE.createEntryReference().init();
				target.addAct(act);
				((EntryRelationship) act.eContainer()).setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				;
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionEntryReference(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionEntryReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionIVLTSLow() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionIVLTSLowTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionIVLTSLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {

				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionIVLTSLow(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionIVLTSHigh() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionIVLTSHighTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionIVLTSHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionIVLTSHigh(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAdvanceCarePlanningInterventionPerformerTime() {
		OperationsTestCase<AdvanceCarePlanningIntervention> validateAdvanceCarePlanningInterventionPerformerTimeTestCase = new OperationsTestCase<AdvanceCarePlanningIntervention>(
			"validateAdvanceCarePlanningInterventionPerformerTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_ADVANCE_CARE_PLANNING_INTERVENTION_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceCarePlanningIntervention target) {

			}

			@Override
			protected void updateToPass(AdvanceCarePlanningIntervention target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceCarePlanningInterventionOperations.validateAdvanceCarePlanningInterventionPerformerTime(
					(AdvanceCarePlanningIntervention) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceCarePlanningInterventionPerformerTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceCarePlanningInterventionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceCarePlanningIntervention> {
		public AdvanceCarePlanningIntervention create() {
			return ConsolFactory.eINSTANCE.createAdvanceCarePlanningIntervention();
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
	private static class ConstructorTestClass extends AdvanceCarePlanningInterventionOperations {
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

} // AdvanceCarePlanningInterventionOperations
