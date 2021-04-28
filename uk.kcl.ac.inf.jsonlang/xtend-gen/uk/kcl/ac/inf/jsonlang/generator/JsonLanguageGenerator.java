/**
 * generated by Xtext 2.24.0
 */
package uk.kcl.ac.inf.jsonlang.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.kcl.ac.inf.jsonlang.jsonLanguage.JsonProgram;
import uk.kcl.ac.inf.jsonlang.jsonLanguage.Statement;
import uk.kcl.ac.inf.jsonlang.jsonLanguage.Value;
import uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.ArrayImpl;
import uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.BooleanImpl;
import uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.ComplexNumberImpl;
import uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.IntNumberImpl;
import uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.JsonProgramImpl;
import uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.NullImpl;
import uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.StatementImpl;
import uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.TextImpl;
import uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.ValueImpl;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class JsonLanguageGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final JsonProgram model = ((JsonProgram) _head);
    fsa.generateFile(this.deriveTargetFileNameFor(model, resource), this.generate(model));
  }
  
  public String deriveTargetFileNameFor(final JsonProgram model, final Resource resource) {
    return resource.getURI().appendFileExtension("txt").lastSegment();
  }
  
  public CharSequence generate(final JsonProgram model) {
    CharSequence _xblockexpression = null;
    {
      final EList<Statement> statements = model.getStatement();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Program contains:");
      _builder.newLine();
      _builder.newLine();
      CharSequence _checkStatement = this.checkStatement(statements);
      _builder.append(_checkStatement);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence checkStatement(final EList<Statement> statements) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Statement s : statements) {
        final StatementImpl statement = ((StatementImpl) s);
        _builder.newLineIfNotEmpty();
        CharSequence _switchResult = null;
        String _string = statement.getValue().getClass().toString();
        if (_string != null) {
          switch (_string) {
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.JsonProgramImpl":
              CharSequence _xblockexpression = null;
              {
                Value _value = s.getValue();
                final JsonProgramImpl value = ((JsonProgramImpl) _value);
                final String key = s.getKey();
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.newLine();
                _builder_1.append("    ");
                _builder_1.append("Program \'");
                _builder_1.append(key, "    ");
                _builder_1.append("\' contains : ");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("\t");
                Object _checkStatement = this.checkStatement(value.getStatement());
                _builder_1.append(_checkStatement, "\t");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("\t");
                _builder_1.newLine();
                _xblockexpression = _builder_1;
              }
              _switchResult = _xblockexpression;
              break;
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.TextImpl":
              CharSequence _xblockexpression_1 = null;
              {
                Value _value = s.getValue();
                final TextImpl value = ((TextImpl) _value);
                final String key = s.getKey();
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("    ");
                _builder_1.append("key \'");
                _builder_1.append(key, "    ");
                _builder_1.append("\' has value : ");
                String _val = value.getVal();
                _builder_1.append(_val, "    ");
                _builder_1.append(" (String)");
                _xblockexpression_1 = _builder_1;
              }
              _switchResult = _xblockexpression_1;
              break;
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.IntNumberImpl":
              CharSequence _xblockexpression_2 = null;
              {
                Value _value = s.getValue();
                final IntNumberImpl value = ((IntNumberImpl) _value);
                final String key = s.getKey();
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("    ");
                _builder_1.append("key \'");
                _builder_1.append(key, "    ");
                _builder_1.append("\' has value : ");
                String _val = value.getVal();
                _builder_1.append(_val, "    ");
                _builder_1.append(" (Int)");
                _xblockexpression_2 = _builder_1;
              }
              _switchResult = _xblockexpression_2;
              break;
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.ComplexNumberImpl":
              CharSequence _xblockexpression_3 = null;
              {
                Value _value = s.getValue();
                final ComplexNumberImpl value = ((ComplexNumberImpl) _value);
                final String key = s.getKey();
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("    ");
                _builder_1.append("key \'");
                _builder_1.append(key, "    ");
                _builder_1.append("\' has value : ");
                float _val = value.getVal();
                _builder_1.append(_val, "    ");
                _builder_1.append(" (Complex)");
                _xblockexpression_3 = _builder_1;
              }
              _switchResult = _xblockexpression_3;
              break;
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.BooleanImpl":
              CharSequence _xblockexpression_4 = null;
              {
                Value _value = s.getValue();
                final BooleanImpl value = ((BooleanImpl) _value);
                final String key = s.getKey();
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("    ");
                _builder_1.append("key \'");
                _builder_1.append(key, "    ");
                _builder_1.append("\' has value : ");
                String _val = value.getVal();
                _builder_1.append(_val, "    ");
                _builder_1.append(" (Boolean)");
                _xblockexpression_4 = _builder_1;
              }
              _switchResult = _xblockexpression_4;
              break;
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.NullImpl":
              CharSequence _xblockexpression_5 = null;
              {
                Value _value = s.getValue();
                final NullImpl value = ((NullImpl) _value);
                final String key = s.getKey();
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("    ");
                _builder_1.append("key \'");
                _builder_1.append(key, "    ");
                _builder_1.append("\' has value : ");
                String _val = value.getVal();
                _builder_1.append(_val, "    ");
                _builder_1.append(" (Null)");
                _xblockexpression_5 = _builder_1;
              }
              _switchResult = _xblockexpression_5;
              break;
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.ArrayImpl":
              CharSequence _xblockexpression_6 = null;
              {
                Value _value = s.getValue();
                final ArrayImpl value = ((ArrayImpl) _value);
                final String key = s.getKey();
                final EList<Value> list = value.getValue();
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("    ");
                _builder_1.append("List \'");
                _builder_1.append(key, "    ");
                _builder_1.append("\' contains : [");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("\t");
                CharSequence _checkValues = this.checkValues(list);
                _builder_1.append(_checkValues, "\t");
                _builder_1.append("]");
                _xblockexpression_6 = _builder_1;
              }
              _switchResult = _xblockexpression_6;
              break;
          }
        }
        _builder.append(_switchResult);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence checkValues(final EList<Value> values) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Value v : values) {
        final ValueImpl statement = ((ValueImpl) v);
        _builder.newLineIfNotEmpty();
        CharSequence _switchResult = null;
        String _string = statement.getClass().toString();
        if (_string != null) {
          switch (_string) {
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.JsonProgramImpl":
              CharSequence _xblockexpression = null;
              {
                final JsonProgramImpl value = ((JsonProgramImpl) v);
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("\t\t\t\t");
                _builder_1.newLine();
                _builder_1.append("\t\t\t\t    ");
                _builder_1.append("Program containing : ");
                _builder_1.newLine();
                Object _checkStatement = this.checkStatement(value.getStatement());
                _builder_1.append(_checkStatement);
                _builder_1.newLineIfNotEmpty();
                _builder_1.newLine();
                _xblockexpression = _builder_1;
              }
              _switchResult = _xblockexpression;
              break;
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.TextImpl":
              CharSequence _xblockexpression_1 = null;
              {
                final TextImpl value = ((TextImpl) v);
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("    ");
                String _val = value.getVal();
                _builder_1.append(_val, "    ");
                _builder_1.append(" (String)");
                _xblockexpression_1 = _builder_1;
              }
              _switchResult = _xblockexpression_1;
              break;
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.IntNumberImpl":
              CharSequence _xblockexpression_2 = null;
              {
                final IntNumberImpl value = ((IntNumberImpl) v);
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("    ");
                String _val = value.getVal();
                _builder_1.append(_val, "    ");
                _builder_1.append(" (Int)");
                _xblockexpression_2 = _builder_1;
              }
              _switchResult = _xblockexpression_2;
              break;
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.ComplexNumberImpl":
              CharSequence _xblockexpression_3 = null;
              {
                final ComplexNumberImpl value = ((ComplexNumberImpl) v);
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("    ");
                float _val = value.getVal();
                _builder_1.append(_val, "    ");
                _builder_1.append(" (Complex)");
                _xblockexpression_3 = _builder_1;
              }
              _switchResult = _xblockexpression_3;
              break;
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.BooleanImpl":
              CharSequence _xblockexpression_4 = null;
              {
                final BooleanImpl value = ((BooleanImpl) v);
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("    ");
                String _val = value.getVal();
                _builder_1.append(_val, "    ");
                _builder_1.append(" (Boolean)");
                _xblockexpression_4 = _builder_1;
              }
              _switchResult = _xblockexpression_4;
              break;
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.NullImpl":
              CharSequence _xblockexpression_5 = null;
              {
                final NullImpl value = ((NullImpl) v);
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("    ");
                String _val = value.getVal();
                _builder_1.append(_val, "    ");
                _builder_1.append(" (Null)");
                _xblockexpression_5 = _builder_1;
              }
              _switchResult = _xblockexpression_5;
              break;
            case "class uk.kcl.ac.inf.jsonlang.jsonLanguage.impl.ArrayImpl":
              CharSequence _xblockexpression_6 = null;
              {
                final ArrayImpl value = ((ArrayImpl) v);
                final EList<Value> list = value.getValue();
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("    ");
                _builder_1.append("List containing : [");
                _builder_1.newLine();
                _builder_1.append("\t");
                Object _checkValues = this.checkValues(list);
                _builder_1.append(_checkValues, "\t");
                _builder_1.append("]");
                _xblockexpression_6 = _builder_1;
              }
              _switchResult = _xblockexpression_6;
              break;
          }
        }
        _builder.append(_switchResult);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
