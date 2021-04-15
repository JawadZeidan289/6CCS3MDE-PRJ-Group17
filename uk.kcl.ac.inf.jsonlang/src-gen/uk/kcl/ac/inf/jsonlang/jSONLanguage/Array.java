/**
 * generated by Xtext 2.24.0
 */
package uk.kcl.ac.inf.jsonlang.jSONLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.kcl.ac.inf.jsonlang.jSONLanguage.Array#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.kcl.ac.inf.jsonlang.jSONLanguage.JSONLanguagePackage#getArray()
 * @model
 * @generated
 */
public interface Array extends Value
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link uk.kcl.ac.inf.jsonlang.jSONLanguage.Value}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see uk.kcl.ac.inf.jsonlang.jSONLanguage.JSONLanguagePackage#getArray_Value()
   * @model containment="true"
   * @generated
   */
  EList<Value> getValue();

} // Array
