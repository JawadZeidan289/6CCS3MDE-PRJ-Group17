/*
 * generated by Xtext 2.24.0
 */
package uk.kcl.ac.inf.jsonlang.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class JSONLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class JSONLanguageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.kcl.ac.inf.jsonlang.JSONLanguage.jSONLanguage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cStatementAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cStatementStatementParserRuleCall_1_0_0 = (RuleCall)cStatementAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cStatementAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cStatementStatementParserRuleCall_1_1_1_0 = (RuleCall)cStatementAssignment_1_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//jSONLanguage:
		//	'{' (statement+=Statement (',' statement+=Statement)*)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' (statement+=Statement (',' statement+=Statement)*)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//(statement+=Statement (',' statement+=Statement)*)?
		public Group getGroup_1() { return cGroup_1; }
		
		//statement+=Statement
		public Assignment getStatementAssignment_1_0() { return cStatementAssignment_1_0; }
		
		//Statement
		public RuleCall getStatementStatementParserRuleCall_1_0_0() { return cStatementStatementParserRuleCall_1_0_0; }
		
		//(',' statement+=Statement)*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//statement+=Statement
		public Assignment getStatementAssignment_1_1_1() { return cStatementAssignment_1_1_1; }
		
		//Statement
		public RuleCall getStatementStatementParserRuleCall_1_1_1_0() { return cStatementStatementParserRuleCall_1_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.kcl.ac.inf.jsonlang.JSONLanguage.Statement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cKeyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cKeySTRINGTerminalRuleCall_0_0 = (RuleCall)cKeyAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Statement:
		//	key=STRING ':' value=Value;
		@Override public ParserRule getRule() { return rule; }
		
		//key=STRING ':' value=Value
		public Group getGroup() { return cGroup; }
		
		//key=STRING
		public Assignment getKeyAssignment_0() { return cKeyAssignment_0; }
		
		//STRING
		public RuleCall getKeySTRINGTerminalRuleCall_0_0() { return cKeySTRINGTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//value=Value
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_2_0() { return cValueValueParserRuleCall_2_0; }
	}
	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.kcl.ac.inf.jsonlang.JSONLanguage.Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cJSONLanguageParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cArrayParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cNumberParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cBooleanParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cNullParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//Value:
		//	jSONLanguage | Array | STRING | Number | Boolean | Null;
		@Override public ParserRule getRule() { return rule; }
		
		//jSONLanguage | Array | STRING | Number | Boolean | Null
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//jSONLanguage
		public RuleCall getJSONLanguageParserRuleCall_0() { return cJSONLanguageParserRuleCall_0; }
		
		//Array
		public RuleCall getArrayParserRuleCall_1() { return cArrayParserRuleCall_1; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_2() { return cSTRINGTerminalRuleCall_2; }
		
		//Number
		public RuleCall getNumberParserRuleCall_3() { return cNumberParserRuleCall_3; }
		
		//Boolean
		public RuleCall getBooleanParserRuleCall_4() { return cBooleanParserRuleCall_4; }
		
		//Null
		public RuleCall getNullParserRuleCall_5() { return cNullParserRuleCall_5; }
	}
	public class ArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.kcl.ac.inf.jsonlang.JSONLanguage.Array");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cValueValueParserRuleCall_1_0_0 = (RuleCall)cValueAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cValueValueParserRuleCall_1_1_1_0 = (RuleCall)cValueAssignment_1_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Array:
		//	'[' (value+=Value (',' value+=Value)*)? ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'[' (value+=Value (',' value+=Value)*)? ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//(value+=Value (',' value+=Value)*)?
		public Group getGroup_1() { return cGroup_1; }
		
		//value+=Value
		public Assignment getValueAssignment_1_0() { return cValueAssignment_1_0; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_1_0_0() { return cValueValueParserRuleCall_1_0_0; }
		
		//(',' value+=Value)*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }
		
		//value+=Value
		public Assignment getValueAssignment_1_1_1() { return cValueAssignment_1_1_1; }
		
		//Value
		public RuleCall getValueValueParserRuleCall_1_1_1_0() { return cValueValueParserRuleCall_1_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }
	}
	public class BooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.kcl.ac.inf.jsonlang.JSONLanguage.Boolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//Boolean:
		//	'true' | 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	public class NullElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.kcl.ac.inf.jsonlang.JSONLanguage.Null");
		private final Keyword cNullKeyword = (Keyword)rule.eContents().get(1);
		
		//Null:
		//	'null';
		@Override public ParserRule getRule() { return rule; }
		
		//'null'
		public Keyword getNullKeyword() { return cNullKeyword; }
	}
	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.kcl.ac.inf.jsonlang.JSONLanguage.Number");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_4_0 = (Alternatives)cGroup_4.eContents().get(0);
		private final Keyword cEKeyword_4_0_0 = (Keyword)cAlternatives_4_0.eContents().get(0);
		private final Keyword cEKeyword_4_0_1 = (Keyword)cAlternatives_4_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Keyword cPlusSignKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_4_3 = (RuleCall)cGroup_4.eContents().get(3);
		
		//Number ecore::EFloat hidden():
		//	'-'? INT? '.'? INT (('E' | 'e') '-'? '+'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT? '.'? INT (('E' | 'e') '-'? '+'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//'.'?
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
		
		//(('E' | 'e') '-'? '+'? INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//('E' | 'e')
		public Alternatives getAlternatives_4_0() { return cAlternatives_4_0; }
		
		//'E'
		public Keyword getEKeyword_4_0_0() { return cEKeyword_4_0_0; }
		
		//'e'
		public Keyword getEKeyword_4_0_1() { return cEKeyword_4_0_1; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_4_1() { return cHyphenMinusKeyword_4_1; }
		
		//'+'?
		public Keyword getPlusSignKeyword_4_2() { return cPlusSignKeyword_4_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4_3() { return cINTTerminalRuleCall_4_3; }
	}
	
	
	private final JSONLanguageElements pJSONLanguage;
	private final StatementElements pStatement;
	private final ValueElements pValue;
	private final ArrayElements pArray;
	private final BooleanElements pBoolean;
	private final NullElements pNull;
	private final NumberElements pNumber;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public JSONLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pJSONLanguage = new JSONLanguageElements();
		this.pStatement = new StatementElements();
		this.pValue = new ValueElements();
		this.pArray = new ArrayElements();
		this.pBoolean = new BooleanElements();
		this.pNull = new NullElements();
		this.pNumber = new NumberElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uk.kcl.ac.inf.jsonlang.JSONLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//jSONLanguage:
	//	'{' (statement+=Statement (',' statement+=Statement)*)?
	//	'}';
	public JSONLanguageElements getJSONLanguageAccess() {
		return pJSONLanguage;
	}
	
	public ParserRule getJSONLanguageRule() {
		return getJSONLanguageAccess().getRule();
	}
	
	//Statement:
	//	key=STRING ':' value=Value;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//Value:
	//	jSONLanguage | Array | STRING | Number | Boolean | Null;
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}
	
	//Array:
	//	'[' (value+=Value (',' value+=Value)*)? ']';
	public ArrayElements getArrayAccess() {
		return pArray;
	}
	
	public ParserRule getArrayRule() {
		return getArrayAccess().getRule();
	}
	
	//Boolean:
	//	'true' | 'false';
	public BooleanElements getBooleanAccess() {
		return pBoolean;
	}
	
	public ParserRule getBooleanRule() {
		return getBooleanAccess().getRule();
	}
	
	//Null:
	//	'null';
	public NullElements getNullAccess() {
		return pNull;
	}
	
	public ParserRule getNullRule() {
		return getNullAccess().getRule();
	}
	
	//Number ecore::EFloat hidden():
	//	'-'? INT? '.'? INT (('E' | 'e') '-'? '+'? INT)?;
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
