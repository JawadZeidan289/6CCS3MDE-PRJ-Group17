/**
 * generated by Xtext 2.24.0
 */
package uk.kcl.ac.inf.jsonlang;

import uk.kcl.ac.inf.jsonlang.JsonLanguageStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class JsonLanguageStandaloneSetup extends JsonLanguageStandaloneSetupGenerated {
  public static void doSetup() {
    new JsonLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
