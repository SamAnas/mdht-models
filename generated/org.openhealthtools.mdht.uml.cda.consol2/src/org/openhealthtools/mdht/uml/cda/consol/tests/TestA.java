/*******************************************************************************
 * Copyright (c) 2017 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

/**
 * @author seanmuir
 *
 */
public class TestA {

	public static void walkHiearchy(EClass eClass) {
		for (EClass eClass2 : eClass.getESuperTypes()) {
			System.out.println("which inherits from " + eClass2.getName());
			if (!eClass2.getName().equals("ClinicalStatement")) {
				walkHiearchy(eClass2);
			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeIterator<EObject> packageContents = ConsolPackage.eINSTANCE.eAllContents();

		HashMap<EClass, ArrayList<EClass>> theSections = new HashMap<EClass, ArrayList<EClass>>();

		ArrayList<EClass> packageSections = new ArrayList<EClass>();

		ArrayList<EClass> rootSections = new ArrayList<EClass>();

		while (packageContents.hasNext()) {

			EObject packageObject = packageContents.next();

			if (packageObject instanceof EClass) {
				EClass eClass = (EClass) packageObject;
				boolean isSection = false;
				for (EClass eClass2 : eClass.getEAllSuperTypes()) {
					if ("Section".equals(eClass2.getName())) {
						isSection = true;
						break;
					}
				}

				if (isSection) {
					packageSections.add(eClass);
				}

			}

		}

		// ArrayList<EClass> baseClasses = new ArrayList<EClass>();
		//
		Set<EClass> sectionBaseClasses = new HashSet<EClass>();

		for (EClass section : packageSections) {
			for (EClass parentSection : section.getESuperTypes()) {
				// System.out.println("Adding " + parentSection.getName());
				sectionBaseClasses.add(parentSection);
			}
		}
		//
		//
		//
		// for (EClass ec2 : ec.getESuperTypes()) {
		// System.out.println(ec.getName() + "::" + ec2.getName());
		// base2.add(ec2);
		// }
		//
		// // boolean isBase = true;
		// // for (EClass ec2 : ec.getESuperTypes()) {
		// // if (packageBaseClass.contains(ec2)) {
		// // // remove.add(ec2);
		// // isBase = false;
		// // }
		// // }
		// // if (isBase) {
		// // baseClasses.add(ec);
		// // }
		// }

		Comparator<? super EClass> compare = new Comparator<EClass>() {

			@Override
			public int compare(EClass o1, EClass o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(packageSections, compare);

		for (EClass section : packageSections) {
			if (!sectionBaseClasses.contains(section)) {

				boolean isRealRoot = true;
				for (EClass sectionAgain : packageSections) {
					if (sectionAgain.getName().startsWith(section.getName()) &&
							!sectionAgain.getName().equals(section.getName())) {
						isRealRoot = false;
					}
				}
				if (isRealRoot) {
					rootSections.add(section);
				}
			}
		}

		for (EClass ec3 : rootSections) {
			theSections.put(ec3, new ArrayList<EClass>());
			theSections.get(ec3).addAll(ec3.getEAllSuperTypes());
			theSections.get(ec3).add(ec3);

			for (EClass sectionAgain : packageSections) {
				// System.out.println("aaa" + ec3.getName());
				// System.out.println("bbb" + sectionAgain.getName());
				if (ec3.getName().startsWith(sectionAgain.getName()) && !ec3.getName().equals(sectionAgain.getName())) {
					System.out.println("aaa" + ec3.getName());
					System.out.println("bbb" + sectionAgain.getName());
					theSections.get(ec3).add(sectionAgain);
				}
			}
			// for (EClass section : packageSections) {
			// if (!sectionBaseClasses.contains(section)) {
			// for (EClass sectionAgain : packageSections) {
			// if (sectionAgain.getName().contains(section.getName()) &&
			// !sectionAgain.getName().equals(section.getName())) {
			// System.out.println("aaa" + section.getName());
			// System.out.println("bbb" + sectionAgain.getName());
			// theSections.get(ec3).add(sectionAgain);
			// }
			// }
			// }
			// }
		}

		for (EClass theKey : theSections.keySet()) {
			System.out.println(theKey.getName());
			for (EClass theClass : theSections.get(theKey)) {
				System.out.print(theClass.getName() + " ");
			}
			System.out.println();
		}

	}

}
