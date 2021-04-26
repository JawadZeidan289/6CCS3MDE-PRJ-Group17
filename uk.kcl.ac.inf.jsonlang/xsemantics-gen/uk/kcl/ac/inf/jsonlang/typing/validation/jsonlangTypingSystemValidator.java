package uk.kcl.ac.inf.jsonlang.typing.validation;

import com.google.inject.Inject;
import it.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import uk.kcl.ac.inf.jsonlang.typing.jsonlangTypingSystem;
import uk.kcl.ac.inf.jsonlang.validation.AbstractJsonLanguageValidator;

@SuppressWarnings("all")
public class jsonlangTypingSystemValidator extends AbstractJsonLanguageValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected jsonlangTypingSystem xsemanticsSystem;
  
  protected jsonlangTypingSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
}
