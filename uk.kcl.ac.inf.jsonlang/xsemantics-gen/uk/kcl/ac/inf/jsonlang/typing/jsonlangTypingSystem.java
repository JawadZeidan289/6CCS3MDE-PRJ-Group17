package uk.kcl.ac.inf.jsonlang.typing;

import com.google.inject.Provider;
import it.xsemantics.runtime.ErrorInformation;
import it.xsemantics.runtime.Result;
import it.xsemantics.runtime.RuleApplicationTrace;
import it.xsemantics.runtime.RuleEnvironment;
import it.xsemantics.runtime.RuleFailedException;
import it.xsemantics.runtime.XsemanticsProvider;
import it.xsemantics.runtime.XsemanticsRuntimeSystem;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import uk.kcl.ac.inf.jsonlang.jSONLanguage.Array;
import uk.kcl.ac.inf.jsonlang.jSONLanguage.ComplexNumber;
import uk.kcl.ac.inf.jsonlang.jSONLanguage.IntNumber;
import uk.kcl.ac.inf.jsonlang.jSONLanguage.Null;
import uk.kcl.ac.inf.jsonlang.jSONLanguage.Text;
import uk.kcl.ac.inf.jsonlang.jSONLanguage.jSONLanguage;
import uk.kcl.ac.inf.jsonlang.typing.JsonLangType;

@SuppressWarnings("all")
public class jsonlangTypingSystem extends XsemanticsRuntimeSystem {
  public static final String INTLITERAL = "uk.kcl.ac.inf.jsonlang.typing.IntLiteral";
  
  public static final String COMPLEXLITERAL = "uk.kcl.ac.inf.jsonlang.typing.ComplexLiteral";
  
  public static final String BOOLLITERAL = "uk.kcl.ac.inf.jsonlang.typing.BoolLiteral";
  
  public static final String NULLLITERAL = "uk.kcl.ac.inf.jsonlang.typing.NullLiteral";
  
  public static final String STRINGLITERAL = "uk.kcl.ac.inf.jsonlang.typing.StringLiteral";
  
  public static final String ARRAYOBJECT = "uk.kcl.ac.inf.jsonlang.typing.ArrayObject";
  
  public static final String JSONLANGOBJECT = "uk.kcl.ac.inf.jsonlang.typing.JSONLangObject";
  
  private PolymorphicDispatcher<Result<JsonLangType>> typeDispatcher;
  
  public jsonlangTypingSystem() {
    init();
  }
  
  public void init() {
    typeDispatcher = buildPolymorphicDispatcher1(
    	"typeImpl", 3, "|-", ":");
  }
  
  public Result<JsonLangType> type(final EObject ex) {
    return type(new RuleEnvironment(), null, ex);
  }
  
  public Result<JsonLangType> type(final RuleEnvironment _environment_, final EObject ex) {
    return type(_environment_, null, ex);
  }
  
  public Result<JsonLangType> type(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final EObject ex) {
    return getFromCache("type", _environment_, _trace_,
    	new XsemanticsProvider<Result<JsonLangType>>(_environment_, _trace_) {
    		public Result<JsonLangType> doGet() {
    			try {
    				return typeInternal(_environment_, _trace_, ex);
    			} catch (Exception _e_type) {
    				return resultForFailure(_e_type);
    			}
    		}
    	}, ex);
  }
  
  protected Result<JsonLangType> typeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final EObject ex) {
    return getFromCache("typeInternal", _environment_, _trace_,
    	new XsemanticsProvider<Result<JsonLangType>>(_environment_, _trace_) {
    		public Result<JsonLangType> doGet() {
    			try {
    				checkParamsNotNull(ex);
    				return typeDispatcher.invoke(_environment_, _trace_, ex);
    			} catch (Exception _e_type) {
    				sneakyThrowRuleFailedException(_e_type);
    				return null;
    			}
    		}
    	}, ex);
  }
  
  protected void typeThrowException(final String _error, final String _issue, final Exception _ex, final EObject ex, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(ex);
    String _plus = ("Cannot type " + _stringRep);
    String error = _plus;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<JsonLangType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntNumber ex) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<JsonLangType> _result_ = applyRuleIntLiteral(G, _subtrace_, ex);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("IntLiteral") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleIntLiteral) {
    	typeThrowException(ruleName("IntLiteral") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + "JsonLangType",
    		INTLITERAL,
    		e_applyRuleIntLiteral, ex, new ErrorInformation[] {new ErrorInformation(ex)});
    	return null;
    }
  }
  
  protected Result<JsonLangType> applyRuleIntLiteral(final RuleEnvironment G, final RuleApplicationTrace _trace_, final IntNumber ex) throws RuleFailedException {
    
    return new Result<JsonLangType>(_applyRuleIntLiteral_1(G, ex));
  }
  
  private JsonLangType _applyRuleIntLiteral_1(final RuleEnvironment G, final IntNumber ex) throws RuleFailedException {
    return JsonLangType.INT;
  }
  
  protected Result<JsonLangType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final ComplexNumber ex) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<JsonLangType> _result_ = applyRuleComplexLiteral(G, _subtrace_, ex);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("ComplexLiteral") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleComplexLiteral) {
    	typeThrowException(ruleName("ComplexLiteral") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + "JsonLangType",
    		COMPLEXLITERAL,
    		e_applyRuleComplexLiteral, ex, new ErrorInformation[] {new ErrorInformation(ex)});
    	return null;
    }
  }
  
  protected Result<JsonLangType> applyRuleComplexLiteral(final RuleEnvironment G, final RuleApplicationTrace _trace_, final ComplexNumber ex) throws RuleFailedException {
    
    return new Result<JsonLangType>(_applyRuleComplexLiteral_1(G, ex));
  }
  
  private JsonLangType _applyRuleComplexLiteral_1(final RuleEnvironment G, final ComplexNumber ex) throws RuleFailedException {
    return JsonLangType.COMPLEX;
  }
  
  protected Result<JsonLangType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final uk.kcl.ac.inf.jsonlang.jSONLanguage.Boolean ex) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<JsonLangType> _result_ = applyRuleBoolLiteral(G, _subtrace_, ex);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("BoolLiteral") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleBoolLiteral) {
    	typeThrowException(ruleName("BoolLiteral") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + "JsonLangType",
    		BOOLLITERAL,
    		e_applyRuleBoolLiteral, ex, new ErrorInformation[] {new ErrorInformation(ex)});
    	return null;
    }
  }
  
  protected Result<JsonLangType> applyRuleBoolLiteral(final RuleEnvironment G, final RuleApplicationTrace _trace_, final uk.kcl.ac.inf.jsonlang.jSONLanguage.Boolean ex) throws RuleFailedException {
    
    return new Result<JsonLangType>(_applyRuleBoolLiteral_1(G, ex));
  }
  
  private JsonLangType _applyRuleBoolLiteral_1(final RuleEnvironment G, final uk.kcl.ac.inf.jsonlang.jSONLanguage.Boolean ex) throws RuleFailedException {
    return JsonLangType.BOOL;
  }
  
  protected Result<JsonLangType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Null ex) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<JsonLangType> _result_ = applyRuleNullLiteral(G, _subtrace_, ex);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("NullLiteral") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleNullLiteral) {
    	typeThrowException(ruleName("NullLiteral") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + "JsonLangType",
    		NULLLITERAL,
    		e_applyRuleNullLiteral, ex, new ErrorInformation[] {new ErrorInformation(ex)});
    	return null;
    }
  }
  
  protected Result<JsonLangType> applyRuleNullLiteral(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Null ex) throws RuleFailedException {
    
    return new Result<JsonLangType>(_applyRuleNullLiteral_1(G, ex));
  }
  
  private JsonLangType _applyRuleNullLiteral_1(final RuleEnvironment G, final Null ex) throws RuleFailedException {
    return JsonLangType.NULL;
  }
  
  protected Result<JsonLangType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Text ex) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<JsonLangType> _result_ = applyRuleStringLiteral(G, _subtrace_, ex);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("StringLiteral") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleStringLiteral) {
    	typeThrowException(ruleName("StringLiteral") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + "JsonLangType",
    		STRINGLITERAL,
    		e_applyRuleStringLiteral, ex, new ErrorInformation[] {new ErrorInformation(ex)});
    	return null;
    }
  }
  
  protected Result<JsonLangType> applyRuleStringLiteral(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Text ex) throws RuleFailedException {
    
    return new Result<JsonLangType>(_applyRuleStringLiteral_1(G, ex));
  }
  
  private JsonLangType _applyRuleStringLiteral_1(final RuleEnvironment G, final Text ex) throws RuleFailedException {
    return JsonLangType.STRING;
  }
  
  protected Result<JsonLangType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Array ex) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<JsonLangType> _result_ = applyRuleArrayObject(G, _subtrace_, ex);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("ArrayObject") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleArrayObject) {
    	typeThrowException(ruleName("ArrayObject") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + "JsonLangType",
    		ARRAYOBJECT,
    		e_applyRuleArrayObject, ex, new ErrorInformation[] {new ErrorInformation(ex)});
    	return null;
    }
  }
  
  protected Result<JsonLangType> applyRuleArrayObject(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Array ex) throws RuleFailedException {
    
    return new Result<JsonLangType>(_applyRuleArrayObject_1(G, ex));
  }
  
  private JsonLangType _applyRuleArrayObject_1(final RuleEnvironment G, final Array ex) throws RuleFailedException {
    return JsonLangType.ARRAY;
  }
  
  protected Result<JsonLangType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final jSONLanguage ex) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<JsonLangType> _result_ = applyRuleJSONLangObject(G, _subtrace_, ex);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("JSONLangObject") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleJSONLangObject) {
    	typeThrowException(ruleName("JSONLangObject") + stringRepForEnv(G) + " |- " + stringRep(ex) + " : " + "JsonLangType",
    		JSONLANGOBJECT,
    		e_applyRuleJSONLangObject, ex, new ErrorInformation[] {new ErrorInformation(ex)});
    	return null;
    }
  }
  
  protected Result<JsonLangType> applyRuleJSONLangObject(final RuleEnvironment G, final RuleApplicationTrace _trace_, final jSONLanguage ex) throws RuleFailedException {
    
    return new Result<JsonLangType>(_applyRuleJSONLangObject_1(G, ex));
  }
  
  private JsonLangType _applyRuleJSONLangObject_1(final RuleEnvironment G, final jSONLanguage ex) throws RuleFailedException {
    return JsonLangType.JSONLANGUAGE;
  }
}
