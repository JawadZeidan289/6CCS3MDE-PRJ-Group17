/*
 * generated by Xtext 2.24.0
 */
package uk.kcl.ac.inf.jsonlang.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractJSONLanguageValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(uk.kcl.ac.inf.jsonlang.jSONLanguage.JSONLanguagePackage.eINSTANCE);
		return result;
	}
}
