package uk.kcl.ac.inf.jsonlang.typing.validation;

import com.google.inject.Inject;
import it.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import uk.kcl.ac.inf.jsonlang.typing.jsonlangTypingSystem;
import uk.kcl.ac.inf.jsonlang.validation.AbstractJSONLanguageValidator;

@SuppressWarnings("all")
public class jsonlangTypingSystemValidator extends AbstractJSONLanguageValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected jsonlangTypingSystem xsemanticsSystem;
  
  protected jsonlangTypingSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
}
