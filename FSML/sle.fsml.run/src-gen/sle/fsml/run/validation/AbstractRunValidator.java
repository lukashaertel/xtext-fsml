/*
 * generated by Xtext
 */
package sle.fsml.run.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractRunValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(sle.fsml.run.run.RunPackage.eINSTANCE);
		return result;
	}
}
