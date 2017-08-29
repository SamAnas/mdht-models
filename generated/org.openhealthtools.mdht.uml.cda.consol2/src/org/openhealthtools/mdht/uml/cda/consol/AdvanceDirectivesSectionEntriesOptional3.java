/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advance Directives Section Entries Optional3</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAdvanceDirectivesSectionEntriesOptional3()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AdvanceDirectivesSectionEntriesOptionalTemplateId' templateId.root='2.16.840.1.113883.10.20.22.2.21' templateId.extension='2017-05-01' constraints.validation.warning='AdvanceDirectivesSectionEntriesOptionalAdvanceDirectiveObservation AdvanceDirectivesSectionEntriesOptional2AdvanceDirectiveOrganizer'"
 * @generated
 */
public interface AdvanceDirectivesSectionEntriesOptional3 extends AdvanceDirectivesSectionEntriesOptional2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::AdvanceDirectiveOrganizer)).oclAsType(consol::AdvanceDirectiveOrganizer)'"
	 * @generated
	 */
	AdvanceDirectiveOrganizer getConsolAdvanceDirectiveOrganizers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSectionEntriesOptional3 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSectionEntriesOptional3 init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdvanceDirectivesSectionEntriesOptional3
