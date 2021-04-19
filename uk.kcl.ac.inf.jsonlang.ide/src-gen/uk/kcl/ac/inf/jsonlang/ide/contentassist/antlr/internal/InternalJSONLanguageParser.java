package uk.kcl.ac.inf.jsonlang.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.kcl.ac.inf.jsonlang.services.JSONLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSONLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'E'", "'e'", "'{'", "'}'", "','", "':'", "'['", "']'", "'-'", "'.'", "'+'", "'true'", "'null'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJSONLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJSONLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJSONLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJSONLanguage.g"; }


    	private JSONLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(JSONLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulejSONLanguage"
    // InternalJSONLanguage.g:53:1: entryRulejSONLanguage : rulejSONLanguage EOF ;
    public final void entryRulejSONLanguage() throws RecognitionException {
        try {
            // InternalJSONLanguage.g:54:1: ( rulejSONLanguage EOF )
            // InternalJSONLanguage.g:55:1: rulejSONLanguage EOF
            {
             before(grammarAccess.getJSONLanguageRule()); 
            pushFollow(FOLLOW_1);
            rulejSONLanguage();

            state._fsp--;

             after(grammarAccess.getJSONLanguageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulejSONLanguage"


    // $ANTLR start "rulejSONLanguage"
    // InternalJSONLanguage.g:62:1: rulejSONLanguage : ( ( rule__JSONLanguage__Group__0 ) ) ;
    public final void rulejSONLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:66:2: ( ( ( rule__JSONLanguage__Group__0 ) ) )
            // InternalJSONLanguage.g:67:2: ( ( rule__JSONLanguage__Group__0 ) )
            {
            // InternalJSONLanguage.g:67:2: ( ( rule__JSONLanguage__Group__0 ) )
            // InternalJSONLanguage.g:68:3: ( rule__JSONLanguage__Group__0 )
            {
             before(grammarAccess.getJSONLanguageAccess().getGroup()); 
            // InternalJSONLanguage.g:69:3: ( rule__JSONLanguage__Group__0 )
            // InternalJSONLanguage.g:69:4: rule__JSONLanguage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JSONLanguage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJSONLanguageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulejSONLanguage"


    // $ANTLR start "entryRuleStatement"
    // InternalJSONLanguage.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalJSONLanguage.g:79:1: ( ruleStatement EOF )
            // InternalJSONLanguage.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalJSONLanguage.g:87:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:91:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalJSONLanguage.g:92:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalJSONLanguage.g:92:2: ( ( rule__Statement__Group__0 ) )
            // InternalJSONLanguage.g:93:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalJSONLanguage.g:94:3: ( rule__Statement__Group__0 )
            // InternalJSONLanguage.g:94:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleValue"
    // InternalJSONLanguage.g:103:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalJSONLanguage.g:104:1: ( ruleValue EOF )
            // InternalJSONLanguage.g:105:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalJSONLanguage.g:112:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:116:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalJSONLanguage.g:117:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalJSONLanguage.g:117:2: ( ( rule__Value__Alternatives ) )
            // InternalJSONLanguage.g:118:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalJSONLanguage.g:119:3: ( rule__Value__Alternatives )
            // InternalJSONLanguage.g:119:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleArray"
    // InternalJSONLanguage.g:128:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // InternalJSONLanguage.g:129:1: ( ruleArray EOF )
            // InternalJSONLanguage.g:130:1: ruleArray EOF
            {
             before(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalJSONLanguage.g:137:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:141:2: ( ( ( rule__Array__Group__0 ) ) )
            // InternalJSONLanguage.g:142:2: ( ( rule__Array__Group__0 ) )
            {
            // InternalJSONLanguage.g:142:2: ( ( rule__Array__Group__0 ) )
            // InternalJSONLanguage.g:143:3: ( rule__Array__Group__0 )
            {
             before(grammarAccess.getArrayAccess().getGroup()); 
            // InternalJSONLanguage.g:144:3: ( rule__Array__Group__0 )
            // InternalJSONLanguage.g:144:4: rule__Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleText"
    // InternalJSONLanguage.g:153:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalJSONLanguage.g:154:1: ( ruleText EOF )
            // InternalJSONLanguage.g:155:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalJSONLanguage.g:162:1: ruleText : ( ( rule__Text__ValAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:166:2: ( ( ( rule__Text__ValAssignment ) ) )
            // InternalJSONLanguage.g:167:2: ( ( rule__Text__ValAssignment ) )
            {
            // InternalJSONLanguage.g:167:2: ( ( rule__Text__ValAssignment ) )
            // InternalJSONLanguage.g:168:3: ( rule__Text__ValAssignment )
            {
             before(grammarAccess.getTextAccess().getValAssignment()); 
            // InternalJSONLanguage.g:169:3: ( rule__Text__ValAssignment )
            // InternalJSONLanguage.g:169:4: rule__Text__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Text__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleBoolean"
    // InternalJSONLanguage.g:178:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalJSONLanguage.g:179:1: ( ruleBoolean EOF )
            // InternalJSONLanguage.g:180:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalJSONLanguage.g:187:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:191:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalJSONLanguage.g:192:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalJSONLanguage.g:192:2: ( ( rule__Boolean__Alternatives ) )
            // InternalJSONLanguage.g:193:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalJSONLanguage.g:194:3: ( rule__Boolean__Alternatives )
            // InternalJSONLanguage.g:194:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleNull"
    // InternalJSONLanguage.g:203:1: entryRuleNull : ruleNull EOF ;
    public final void entryRuleNull() throws RecognitionException {
        try {
            // InternalJSONLanguage.g:204:1: ( ruleNull EOF )
            // InternalJSONLanguage.g:205:1: ruleNull EOF
            {
             before(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_1);
            ruleNull();

            state._fsp--;

             after(grammarAccess.getNullRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // InternalJSONLanguage.g:212:1: ruleNull : ( ( rule__Null__ValAssignment ) ) ;
    public final void ruleNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:216:2: ( ( ( rule__Null__ValAssignment ) ) )
            // InternalJSONLanguage.g:217:2: ( ( rule__Null__ValAssignment ) )
            {
            // InternalJSONLanguage.g:217:2: ( ( rule__Null__ValAssignment ) )
            // InternalJSONLanguage.g:218:3: ( rule__Null__ValAssignment )
            {
             before(grammarAccess.getNullAccess().getValAssignment()); 
            // InternalJSONLanguage.g:219:3: ( rule__Null__ValAssignment )
            // InternalJSONLanguage.g:219:4: rule__Null__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Null__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNullAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNull"


    // $ANTLR start "entryRuleNumber"
    // InternalJSONLanguage.g:228:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalJSONLanguage.g:229:1: ( ruleNumber EOF )
            // InternalJSONLanguage.g:230:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalJSONLanguage.g:237:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:241:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalJSONLanguage.g:242:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalJSONLanguage.g:242:2: ( ( rule__Number__Alternatives ) )
            // InternalJSONLanguage.g:243:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalJSONLanguage.g:244:3: ( rule__Number__Alternatives )
            // InternalJSONLanguage.g:244:4: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleIntNumber"
    // InternalJSONLanguage.g:253:1: entryRuleIntNumber : ruleIntNumber EOF ;
    public final void entryRuleIntNumber() throws RecognitionException {
        try {
            // InternalJSONLanguage.g:254:1: ( ruleIntNumber EOF )
            // InternalJSONLanguage.g:255:1: ruleIntNumber EOF
            {
             before(grammarAccess.getIntNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleIntNumber();

            state._fsp--;

             after(grammarAccess.getIntNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntNumber"


    // $ANTLR start "ruleIntNumber"
    // InternalJSONLanguage.g:262:1: ruleIntNumber : ( ( rule__IntNumber__ValAssignment ) ) ;
    public final void ruleIntNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:266:2: ( ( ( rule__IntNumber__ValAssignment ) ) )
            // InternalJSONLanguage.g:267:2: ( ( rule__IntNumber__ValAssignment ) )
            {
            // InternalJSONLanguage.g:267:2: ( ( rule__IntNumber__ValAssignment ) )
            // InternalJSONLanguage.g:268:3: ( rule__IntNumber__ValAssignment )
            {
             before(grammarAccess.getIntNumberAccess().getValAssignment()); 
            // InternalJSONLanguage.g:269:3: ( rule__IntNumber__ValAssignment )
            // InternalJSONLanguage.g:269:4: rule__IntNumber__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntNumber__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntNumberAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntNumber"


    // $ANTLR start "entryRuleComplexNumber"
    // InternalJSONLanguage.g:278:1: entryRuleComplexNumber : ruleComplexNumber EOF ;
    public final void entryRuleComplexNumber() throws RecognitionException {
        try {
            // InternalJSONLanguage.g:279:1: ( ruleComplexNumber EOF )
            // InternalJSONLanguage.g:280:1: ruleComplexNumber EOF
            {
             before(grammarAccess.getComplexNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexNumber();

            state._fsp--;

             after(grammarAccess.getComplexNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexNumber"


    // $ANTLR start "ruleComplexNumber"
    // InternalJSONLanguage.g:287:1: ruleComplexNumber : ( ( rule__ComplexNumber__ValAssignment ) ) ;
    public final void ruleComplexNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:291:2: ( ( ( rule__ComplexNumber__ValAssignment ) ) )
            // InternalJSONLanguage.g:292:2: ( ( rule__ComplexNumber__ValAssignment ) )
            {
            // InternalJSONLanguage.g:292:2: ( ( rule__ComplexNumber__ValAssignment ) )
            // InternalJSONLanguage.g:293:3: ( rule__ComplexNumber__ValAssignment )
            {
             before(grammarAccess.getComplexNumberAccess().getValAssignment()); 
            // InternalJSONLanguage.g:294:3: ( rule__ComplexNumber__ValAssignment )
            // InternalJSONLanguage.g:294:4: rule__ComplexNumber__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ComplexNumber__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComplexNumberAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexNumber"


    // $ANTLR start "entryRuleCOMPLEX"
    // InternalJSONLanguage.g:303:1: entryRuleCOMPLEX : ruleCOMPLEX EOF ;
    public final void entryRuleCOMPLEX() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalJSONLanguage.g:307:1: ( ruleCOMPLEX EOF )
            // InternalJSONLanguage.g:308:1: ruleCOMPLEX EOF
            {
             before(grammarAccess.getCOMPLEXRule()); 
            pushFollow(FOLLOW_1);
            ruleCOMPLEX();

            state._fsp--;

             after(grammarAccess.getCOMPLEXRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCOMPLEX"


    // $ANTLR start "ruleCOMPLEX"
    // InternalJSONLanguage.g:318:1: ruleCOMPLEX : ( ( rule__COMPLEX__Group__0 ) ) ;
    public final void ruleCOMPLEX() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:323:2: ( ( ( rule__COMPLEX__Group__0 ) ) )
            // InternalJSONLanguage.g:324:2: ( ( rule__COMPLEX__Group__0 ) )
            {
            // InternalJSONLanguage.g:324:2: ( ( rule__COMPLEX__Group__0 ) )
            // InternalJSONLanguage.g:325:3: ( rule__COMPLEX__Group__0 )
            {
             before(grammarAccess.getCOMPLEXAccess().getGroup()); 
            // InternalJSONLanguage.g:326:3: ( rule__COMPLEX__Group__0 )
            // InternalJSONLanguage.g:326:4: rule__COMPLEX__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__COMPLEX__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCOMPLEXAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCOMPLEX"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalJSONLanguage.g:335:1: rule__Value__Alternatives : ( ( rulejSONLanguage ) | ( ruleArray ) | ( ruleText ) | ( ruleNumber ) | ( ruleBoolean ) | ( ruleNull ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:339:1: ( ( rulejSONLanguage ) | ( ruleArray ) | ( ruleText ) | ( ruleNumber ) | ( ruleBoolean ) | ( ruleNull ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
                {
                alt1=3;
                }
                break;
            case RULE_INT:
            case 20:
            case 21:
                {
                alt1=4;
                }
                break;
            case 11:
            case 23:
                {
                alt1=5;
                }
                break;
            case 24:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalJSONLanguage.g:340:2: ( rulejSONLanguage )
                    {
                    // InternalJSONLanguage.g:340:2: ( rulejSONLanguage )
                    // InternalJSONLanguage.g:341:3: rulejSONLanguage
                    {
                     before(grammarAccess.getValueAccess().getJSONLanguageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulejSONLanguage();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getJSONLanguageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSONLanguage.g:346:2: ( ruleArray )
                    {
                    // InternalJSONLanguage.g:346:2: ( ruleArray )
                    // InternalJSONLanguage.g:347:3: ruleArray
                    {
                     before(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArray();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getArrayParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSONLanguage.g:352:2: ( ruleText )
                    {
                    // InternalJSONLanguage.g:352:2: ( ruleText )
                    // InternalJSONLanguage.g:353:3: ruleText
                    {
                     before(grammarAccess.getValueAccess().getTextParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getTextParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJSONLanguage.g:358:2: ( ruleNumber )
                    {
                    // InternalJSONLanguage.g:358:2: ( ruleNumber )
                    // InternalJSONLanguage.g:359:3: ruleNumber
                    {
                     before(grammarAccess.getValueAccess().getNumberParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNumberParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJSONLanguage.g:364:2: ( ruleBoolean )
                    {
                    // InternalJSONLanguage.g:364:2: ( ruleBoolean )
                    // InternalJSONLanguage.g:365:3: ruleBoolean
                    {
                     before(grammarAccess.getValueAccess().getBooleanParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJSONLanguage.g:370:2: ( ruleNull )
                    {
                    // InternalJSONLanguage.g:370:2: ( ruleNull )
                    // InternalJSONLanguage.g:371:3: ruleNull
                    {
                     before(grammarAccess.getValueAccess().getNullParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNull();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNullParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalJSONLanguage.g:380:1: rule__Boolean__Alternatives : ( ( ( rule__Boolean__ValAssignment_0 ) ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:384:1: ( ( ( rule__Boolean__ValAssignment_0 ) ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJSONLanguage.g:385:2: ( ( rule__Boolean__ValAssignment_0 ) )
                    {
                    // InternalJSONLanguage.g:385:2: ( ( rule__Boolean__ValAssignment_0 ) )
                    // InternalJSONLanguage.g:386:3: ( rule__Boolean__ValAssignment_0 )
                    {
                     before(grammarAccess.getBooleanAccess().getValAssignment_0()); 
                    // InternalJSONLanguage.g:387:3: ( rule__Boolean__ValAssignment_0 )
                    // InternalJSONLanguage.g:387:4: rule__Boolean__ValAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Boolean__ValAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanAccess().getValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSONLanguage.g:391:2: ( 'false' )
                    {
                    // InternalJSONLanguage.g:391:2: ( 'false' )
                    // InternalJSONLanguage.g:392:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__Number__Alternatives"
    // InternalJSONLanguage.g:401:1: rule__Number__Alternatives : ( ( ruleIntNumber ) | ( ruleComplexNumber ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:405:1: ( ( ruleIntNumber ) | ( ruleComplexNumber ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=20 && LA3_0<=21)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJSONLanguage.g:406:2: ( ruleIntNumber )
                    {
                    // InternalJSONLanguage.g:406:2: ( ruleIntNumber )
                    // InternalJSONLanguage.g:407:3: ruleIntNumber
                    {
                     before(grammarAccess.getNumberAccess().getIntNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntNumber();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getIntNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSONLanguage.g:412:2: ( ruleComplexNumber )
                    {
                    // InternalJSONLanguage.g:412:2: ( ruleComplexNumber )
                    // InternalJSONLanguage.g:413:3: ruleComplexNumber
                    {
                     before(grammarAccess.getNumberAccess().getComplexNumberParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComplexNumber();

                    state._fsp--;

                     after(grammarAccess.getNumberAccess().getComplexNumberParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__COMPLEX__Alternatives_4_0"
    // InternalJSONLanguage.g:422:1: rule__COMPLEX__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__COMPLEX__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:426:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJSONLanguage.g:427:2: ( 'E' )
                    {
                    // InternalJSONLanguage.g:427:2: ( 'E' )
                    // InternalJSONLanguage.g:428:3: 'E'
                    {
                     before(grammarAccess.getCOMPLEXAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCOMPLEXAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSONLanguage.g:433:2: ( 'e' )
                    {
                    // InternalJSONLanguage.g:433:2: ( 'e' )
                    // InternalJSONLanguage.g:434:3: 'e'
                    {
                     before(grammarAccess.getCOMPLEXAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getCOMPLEXAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Alternatives_4_0"


    // $ANTLR start "rule__JSONLanguage__Group__0"
    // InternalJSONLanguage.g:443:1: rule__JSONLanguage__Group__0 : rule__JSONLanguage__Group__0__Impl rule__JSONLanguage__Group__1 ;
    public final void rule__JSONLanguage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:447:1: ( rule__JSONLanguage__Group__0__Impl rule__JSONLanguage__Group__1 )
            // InternalJSONLanguage.g:448:2: rule__JSONLanguage__Group__0__Impl rule__JSONLanguage__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__JSONLanguage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONLanguage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group__0"


    // $ANTLR start "rule__JSONLanguage__Group__0__Impl"
    // InternalJSONLanguage.g:455:1: rule__JSONLanguage__Group__0__Impl : ( '{' ) ;
    public final void rule__JSONLanguage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:459:1: ( ( '{' ) )
            // InternalJSONLanguage.g:460:1: ( '{' )
            {
            // InternalJSONLanguage.g:460:1: ( '{' )
            // InternalJSONLanguage.g:461:2: '{'
            {
             before(grammarAccess.getJSONLanguageAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJSONLanguageAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group__0__Impl"


    // $ANTLR start "rule__JSONLanguage__Group__1"
    // InternalJSONLanguage.g:470:1: rule__JSONLanguage__Group__1 : rule__JSONLanguage__Group__1__Impl rule__JSONLanguage__Group__2 ;
    public final void rule__JSONLanguage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:474:1: ( rule__JSONLanguage__Group__1__Impl rule__JSONLanguage__Group__2 )
            // InternalJSONLanguage.g:475:2: rule__JSONLanguage__Group__1__Impl rule__JSONLanguage__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__JSONLanguage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONLanguage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group__1"


    // $ANTLR start "rule__JSONLanguage__Group__1__Impl"
    // InternalJSONLanguage.g:482:1: rule__JSONLanguage__Group__1__Impl : ( ( rule__JSONLanguage__Group_1__0 )? ) ;
    public final void rule__JSONLanguage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:486:1: ( ( ( rule__JSONLanguage__Group_1__0 )? ) )
            // InternalJSONLanguage.g:487:1: ( ( rule__JSONLanguage__Group_1__0 )? )
            {
            // InternalJSONLanguage.g:487:1: ( ( rule__JSONLanguage__Group_1__0 )? )
            // InternalJSONLanguage.g:488:2: ( rule__JSONLanguage__Group_1__0 )?
            {
             before(grammarAccess.getJSONLanguageAccess().getGroup_1()); 
            // InternalJSONLanguage.g:489:2: ( rule__JSONLanguage__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJSONLanguage.g:489:3: rule__JSONLanguage__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JSONLanguage__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJSONLanguageAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group__1__Impl"


    // $ANTLR start "rule__JSONLanguage__Group__2"
    // InternalJSONLanguage.g:497:1: rule__JSONLanguage__Group__2 : rule__JSONLanguage__Group__2__Impl ;
    public final void rule__JSONLanguage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:501:1: ( rule__JSONLanguage__Group__2__Impl )
            // InternalJSONLanguage.g:502:2: rule__JSONLanguage__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONLanguage__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group__2"


    // $ANTLR start "rule__JSONLanguage__Group__2__Impl"
    // InternalJSONLanguage.g:508:1: rule__JSONLanguage__Group__2__Impl : ( '}' ) ;
    public final void rule__JSONLanguage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:512:1: ( ( '}' ) )
            // InternalJSONLanguage.g:513:1: ( '}' )
            {
            // InternalJSONLanguage.g:513:1: ( '}' )
            // InternalJSONLanguage.g:514:2: '}'
            {
             before(grammarAccess.getJSONLanguageAccess().getRightCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJSONLanguageAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group__2__Impl"


    // $ANTLR start "rule__JSONLanguage__Group_1__0"
    // InternalJSONLanguage.g:524:1: rule__JSONLanguage__Group_1__0 : rule__JSONLanguage__Group_1__0__Impl rule__JSONLanguage__Group_1__1 ;
    public final void rule__JSONLanguage__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:528:1: ( rule__JSONLanguage__Group_1__0__Impl rule__JSONLanguage__Group_1__1 )
            // InternalJSONLanguage.g:529:2: rule__JSONLanguage__Group_1__0__Impl rule__JSONLanguage__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__JSONLanguage__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONLanguage__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group_1__0"


    // $ANTLR start "rule__JSONLanguage__Group_1__0__Impl"
    // InternalJSONLanguage.g:536:1: rule__JSONLanguage__Group_1__0__Impl : ( ( rule__JSONLanguage__StatementAssignment_1_0 ) ) ;
    public final void rule__JSONLanguage__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:540:1: ( ( ( rule__JSONLanguage__StatementAssignment_1_0 ) ) )
            // InternalJSONLanguage.g:541:1: ( ( rule__JSONLanguage__StatementAssignment_1_0 ) )
            {
            // InternalJSONLanguage.g:541:1: ( ( rule__JSONLanguage__StatementAssignment_1_0 ) )
            // InternalJSONLanguage.g:542:2: ( rule__JSONLanguage__StatementAssignment_1_0 )
            {
             before(grammarAccess.getJSONLanguageAccess().getStatementAssignment_1_0()); 
            // InternalJSONLanguage.g:543:2: ( rule__JSONLanguage__StatementAssignment_1_0 )
            // InternalJSONLanguage.g:543:3: rule__JSONLanguage__StatementAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__JSONLanguage__StatementAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getJSONLanguageAccess().getStatementAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group_1__0__Impl"


    // $ANTLR start "rule__JSONLanguage__Group_1__1"
    // InternalJSONLanguage.g:551:1: rule__JSONLanguage__Group_1__1 : rule__JSONLanguage__Group_1__1__Impl ;
    public final void rule__JSONLanguage__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:555:1: ( rule__JSONLanguage__Group_1__1__Impl )
            // InternalJSONLanguage.g:556:2: rule__JSONLanguage__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONLanguage__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group_1__1"


    // $ANTLR start "rule__JSONLanguage__Group_1__1__Impl"
    // InternalJSONLanguage.g:562:1: rule__JSONLanguage__Group_1__1__Impl : ( ( rule__JSONLanguage__Group_1_1__0 )* ) ;
    public final void rule__JSONLanguage__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:566:1: ( ( ( rule__JSONLanguage__Group_1_1__0 )* ) )
            // InternalJSONLanguage.g:567:1: ( ( rule__JSONLanguage__Group_1_1__0 )* )
            {
            // InternalJSONLanguage.g:567:1: ( ( rule__JSONLanguage__Group_1_1__0 )* )
            // InternalJSONLanguage.g:568:2: ( rule__JSONLanguage__Group_1_1__0 )*
            {
             before(grammarAccess.getJSONLanguageAccess().getGroup_1_1()); 
            // InternalJSONLanguage.g:569:2: ( rule__JSONLanguage__Group_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJSONLanguage.g:569:3: rule__JSONLanguage__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__JSONLanguage__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJSONLanguageAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group_1__1__Impl"


    // $ANTLR start "rule__JSONLanguage__Group_1_1__0"
    // InternalJSONLanguage.g:578:1: rule__JSONLanguage__Group_1_1__0 : rule__JSONLanguage__Group_1_1__0__Impl rule__JSONLanguage__Group_1_1__1 ;
    public final void rule__JSONLanguage__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:582:1: ( rule__JSONLanguage__Group_1_1__0__Impl rule__JSONLanguage__Group_1_1__1 )
            // InternalJSONLanguage.g:583:2: rule__JSONLanguage__Group_1_1__0__Impl rule__JSONLanguage__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__JSONLanguage__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONLanguage__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group_1_1__0"


    // $ANTLR start "rule__JSONLanguage__Group_1_1__0__Impl"
    // InternalJSONLanguage.g:590:1: rule__JSONLanguage__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__JSONLanguage__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:594:1: ( ( ',' ) )
            // InternalJSONLanguage.g:595:1: ( ',' )
            {
            // InternalJSONLanguage.g:595:1: ( ',' )
            // InternalJSONLanguage.g:596:2: ','
            {
             before(grammarAccess.getJSONLanguageAccess().getCommaKeyword_1_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJSONLanguageAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group_1_1__0__Impl"


    // $ANTLR start "rule__JSONLanguage__Group_1_1__1"
    // InternalJSONLanguage.g:605:1: rule__JSONLanguage__Group_1_1__1 : rule__JSONLanguage__Group_1_1__1__Impl ;
    public final void rule__JSONLanguage__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:609:1: ( rule__JSONLanguage__Group_1_1__1__Impl )
            // InternalJSONLanguage.g:610:2: rule__JSONLanguage__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONLanguage__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group_1_1__1"


    // $ANTLR start "rule__JSONLanguage__Group_1_1__1__Impl"
    // InternalJSONLanguage.g:616:1: rule__JSONLanguage__Group_1_1__1__Impl : ( ( rule__JSONLanguage__StatementAssignment_1_1_1 ) ) ;
    public final void rule__JSONLanguage__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:620:1: ( ( ( rule__JSONLanguage__StatementAssignment_1_1_1 ) ) )
            // InternalJSONLanguage.g:621:1: ( ( rule__JSONLanguage__StatementAssignment_1_1_1 ) )
            {
            // InternalJSONLanguage.g:621:1: ( ( rule__JSONLanguage__StatementAssignment_1_1_1 ) )
            // InternalJSONLanguage.g:622:2: ( rule__JSONLanguage__StatementAssignment_1_1_1 )
            {
             before(grammarAccess.getJSONLanguageAccess().getStatementAssignment_1_1_1()); 
            // InternalJSONLanguage.g:623:2: ( rule__JSONLanguage__StatementAssignment_1_1_1 )
            // InternalJSONLanguage.g:623:3: rule__JSONLanguage__StatementAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JSONLanguage__StatementAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJSONLanguageAccess().getStatementAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__Group_1_1__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalJSONLanguage.g:632:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:636:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalJSONLanguage.g:637:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalJSONLanguage.g:644:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__KeyAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:648:1: ( ( ( rule__Statement__KeyAssignment_0 ) ) )
            // InternalJSONLanguage.g:649:1: ( ( rule__Statement__KeyAssignment_0 ) )
            {
            // InternalJSONLanguage.g:649:1: ( ( rule__Statement__KeyAssignment_0 ) )
            // InternalJSONLanguage.g:650:2: ( rule__Statement__KeyAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getKeyAssignment_0()); 
            // InternalJSONLanguage.g:651:2: ( rule__Statement__KeyAssignment_0 )
            // InternalJSONLanguage.g:651:3: rule__Statement__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalJSONLanguage.g:659:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:663:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // InternalJSONLanguage.g:664:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalJSONLanguage.g:671:1: rule__Statement__Group__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:675:1: ( ( ':' ) )
            // InternalJSONLanguage.g:676:1: ( ':' )
            {
            // InternalJSONLanguage.g:676:1: ( ':' )
            // InternalJSONLanguage.g:677:2: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__2"
    // InternalJSONLanguage.g:686:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:690:1: ( rule__Statement__Group__2__Impl )
            // InternalJSONLanguage.g:691:2: rule__Statement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__2"


    // $ANTLR start "rule__Statement__Group__2__Impl"
    // InternalJSONLanguage.g:697:1: rule__Statement__Group__2__Impl : ( ( rule__Statement__ValueAssignment_2 ) ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:701:1: ( ( ( rule__Statement__ValueAssignment_2 ) ) )
            // InternalJSONLanguage.g:702:1: ( ( rule__Statement__ValueAssignment_2 ) )
            {
            // InternalJSONLanguage.g:702:1: ( ( rule__Statement__ValueAssignment_2 ) )
            // InternalJSONLanguage.g:703:2: ( rule__Statement__ValueAssignment_2 )
            {
             before(grammarAccess.getStatementAccess().getValueAssignment_2()); 
            // InternalJSONLanguage.g:704:2: ( rule__Statement__ValueAssignment_2 )
            // InternalJSONLanguage.g:704:3: rule__Statement__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__2__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // InternalJSONLanguage.g:713:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:717:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // InternalJSONLanguage.g:718:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // InternalJSONLanguage.g:725:1: rule__Array__Group__0__Impl : ( '[' ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:729:1: ( ( '[' ) )
            // InternalJSONLanguage.g:730:1: ( '[' )
            {
            // InternalJSONLanguage.g:730:1: ( '[' )
            // InternalJSONLanguage.g:731:2: '['
            {
             before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // InternalJSONLanguage.g:740:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:744:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // InternalJSONLanguage.g:745:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // InternalJSONLanguage.g:752:1: rule__Array__Group__1__Impl : ( ( rule__Array__Group_1__0 )? ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:756:1: ( ( ( rule__Array__Group_1__0 )? ) )
            // InternalJSONLanguage.g:757:1: ( ( rule__Array__Group_1__0 )? )
            {
            // InternalJSONLanguage.g:757:1: ( ( rule__Array__Group_1__0 )? )
            // InternalJSONLanguage.g:758:2: ( rule__Array__Group_1__0 )?
            {
             before(grammarAccess.getArrayAccess().getGroup_1()); 
            // InternalJSONLanguage.g:759:2: ( rule__Array__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_STRING)||LA7_0==11||LA7_0==14||LA7_0==18||(LA7_0>=20 && LA7_0<=21)||(LA7_0>=23 && LA7_0<=24)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJSONLanguage.g:759:3: rule__Array__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Array__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // InternalJSONLanguage.g:767:1: rule__Array__Group__2 : rule__Array__Group__2__Impl ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:771:1: ( rule__Array__Group__2__Impl )
            // InternalJSONLanguage.g:772:2: rule__Array__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // InternalJSONLanguage.g:778:1: rule__Array__Group__2__Impl : ( ']' ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:782:1: ( ( ']' ) )
            // InternalJSONLanguage.g:783:1: ( ']' )
            {
            // InternalJSONLanguage.g:783:1: ( ']' )
            // InternalJSONLanguage.g:784:2: ']'
            {
             before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__Array__Group_1__0"
    // InternalJSONLanguage.g:794:1: rule__Array__Group_1__0 : rule__Array__Group_1__0__Impl rule__Array__Group_1__1 ;
    public final void rule__Array__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:798:1: ( rule__Array__Group_1__0__Impl rule__Array__Group_1__1 )
            // InternalJSONLanguage.g:799:2: rule__Array__Group_1__0__Impl rule__Array__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Array__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1__0"


    // $ANTLR start "rule__Array__Group_1__0__Impl"
    // InternalJSONLanguage.g:806:1: rule__Array__Group_1__0__Impl : ( ( rule__Array__ValueAssignment_1_0 ) ) ;
    public final void rule__Array__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:810:1: ( ( ( rule__Array__ValueAssignment_1_0 ) ) )
            // InternalJSONLanguage.g:811:1: ( ( rule__Array__ValueAssignment_1_0 ) )
            {
            // InternalJSONLanguage.g:811:1: ( ( rule__Array__ValueAssignment_1_0 ) )
            // InternalJSONLanguage.g:812:2: ( rule__Array__ValueAssignment_1_0 )
            {
             before(grammarAccess.getArrayAccess().getValueAssignment_1_0()); 
            // InternalJSONLanguage.g:813:2: ( rule__Array__ValueAssignment_1_0 )
            // InternalJSONLanguage.g:813:3: rule__Array__ValueAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Array__ValueAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getValueAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1__0__Impl"


    // $ANTLR start "rule__Array__Group_1__1"
    // InternalJSONLanguage.g:821:1: rule__Array__Group_1__1 : rule__Array__Group_1__1__Impl ;
    public final void rule__Array__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:825:1: ( rule__Array__Group_1__1__Impl )
            // InternalJSONLanguage.g:826:2: rule__Array__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1__1"


    // $ANTLR start "rule__Array__Group_1__1__Impl"
    // InternalJSONLanguage.g:832:1: rule__Array__Group_1__1__Impl : ( ( rule__Array__Group_1_1__0 )* ) ;
    public final void rule__Array__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:836:1: ( ( ( rule__Array__Group_1_1__0 )* ) )
            // InternalJSONLanguage.g:837:1: ( ( rule__Array__Group_1_1__0 )* )
            {
            // InternalJSONLanguage.g:837:1: ( ( rule__Array__Group_1_1__0 )* )
            // InternalJSONLanguage.g:838:2: ( rule__Array__Group_1_1__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_1_1()); 
            // InternalJSONLanguage.g:839:2: ( rule__Array__Group_1_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJSONLanguage.g:839:3: rule__Array__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Array__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getArrayAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1__1__Impl"


    // $ANTLR start "rule__Array__Group_1_1__0"
    // InternalJSONLanguage.g:848:1: rule__Array__Group_1_1__0 : rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1 ;
    public final void rule__Array__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:852:1: ( rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1 )
            // InternalJSONLanguage.g:853:2: rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Array__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1_1__0"


    // $ANTLR start "rule__Array__Group_1_1__0__Impl"
    // InternalJSONLanguage.g:860:1: rule__Array__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:864:1: ( ( ',' ) )
            // InternalJSONLanguage.g:865:1: ( ',' )
            {
            // InternalJSONLanguage.g:865:1: ( ',' )
            // InternalJSONLanguage.g:866:2: ','
            {
             before(grammarAccess.getArrayAccess().getCommaKeyword_1_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1_1__0__Impl"


    // $ANTLR start "rule__Array__Group_1_1__1"
    // InternalJSONLanguage.g:875:1: rule__Array__Group_1_1__1 : rule__Array__Group_1_1__1__Impl ;
    public final void rule__Array__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:879:1: ( rule__Array__Group_1_1__1__Impl )
            // InternalJSONLanguage.g:880:2: rule__Array__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1_1__1"


    // $ANTLR start "rule__Array__Group_1_1__1__Impl"
    // InternalJSONLanguage.g:886:1: rule__Array__Group_1_1__1__Impl : ( ( rule__Array__ValueAssignment_1_1_1 ) ) ;
    public final void rule__Array__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:890:1: ( ( ( rule__Array__ValueAssignment_1_1_1 ) ) )
            // InternalJSONLanguage.g:891:1: ( ( rule__Array__ValueAssignment_1_1_1 ) )
            {
            // InternalJSONLanguage.g:891:1: ( ( rule__Array__ValueAssignment_1_1_1 ) )
            // InternalJSONLanguage.g:892:2: ( rule__Array__ValueAssignment_1_1_1 )
            {
             before(grammarAccess.getArrayAccess().getValueAssignment_1_1_1()); 
            // InternalJSONLanguage.g:893:2: ( rule__Array__ValueAssignment_1_1_1 )
            // InternalJSONLanguage.g:893:3: rule__Array__ValueAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Array__ValueAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getValueAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_1_1__1__Impl"


    // $ANTLR start "rule__COMPLEX__Group__0"
    // InternalJSONLanguage.g:902:1: rule__COMPLEX__Group__0 : rule__COMPLEX__Group__0__Impl rule__COMPLEX__Group__1 ;
    public final void rule__COMPLEX__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:906:1: ( rule__COMPLEX__Group__0__Impl rule__COMPLEX__Group__1 )
            // InternalJSONLanguage.g:907:2: rule__COMPLEX__Group__0__Impl rule__COMPLEX__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__COMPLEX__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COMPLEX__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group__0"


    // $ANTLR start "rule__COMPLEX__Group__0__Impl"
    // InternalJSONLanguage.g:914:1: rule__COMPLEX__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__COMPLEX__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:918:1: ( ( ( '-' )? ) )
            // InternalJSONLanguage.g:919:1: ( ( '-' )? )
            {
            // InternalJSONLanguage.g:919:1: ( ( '-' )? )
            // InternalJSONLanguage.g:920:2: ( '-' )?
            {
             before(grammarAccess.getCOMPLEXAccess().getHyphenMinusKeyword_0()); 
            // InternalJSONLanguage.g:921:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJSONLanguage.g:921:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCOMPLEXAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group__0__Impl"


    // $ANTLR start "rule__COMPLEX__Group__1"
    // InternalJSONLanguage.g:929:1: rule__COMPLEX__Group__1 : rule__COMPLEX__Group__1__Impl rule__COMPLEX__Group__2 ;
    public final void rule__COMPLEX__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:933:1: ( rule__COMPLEX__Group__1__Impl rule__COMPLEX__Group__2 )
            // InternalJSONLanguage.g:934:2: rule__COMPLEX__Group__1__Impl rule__COMPLEX__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__COMPLEX__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COMPLEX__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group__1"


    // $ANTLR start "rule__COMPLEX__Group__1__Impl"
    // InternalJSONLanguage.g:941:1: rule__COMPLEX__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__COMPLEX__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:945:1: ( ( ( RULE_INT )? ) )
            // InternalJSONLanguage.g:946:1: ( ( RULE_INT )? )
            {
            // InternalJSONLanguage.g:946:1: ( ( RULE_INT )? )
            // InternalJSONLanguage.g:947:2: ( RULE_INT )?
            {
             before(grammarAccess.getCOMPLEXAccess().getINTTerminalRuleCall_1()); 
            // InternalJSONLanguage.g:948:2: ( RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_INT||LA10_1==21) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalJSONLanguage.g:948:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCOMPLEXAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group__1__Impl"


    // $ANTLR start "rule__COMPLEX__Group__2"
    // InternalJSONLanguage.g:956:1: rule__COMPLEX__Group__2 : rule__COMPLEX__Group__2__Impl rule__COMPLEX__Group__3 ;
    public final void rule__COMPLEX__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:960:1: ( rule__COMPLEX__Group__2__Impl rule__COMPLEX__Group__3 )
            // InternalJSONLanguage.g:961:2: rule__COMPLEX__Group__2__Impl rule__COMPLEX__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__COMPLEX__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COMPLEX__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group__2"


    // $ANTLR start "rule__COMPLEX__Group__2__Impl"
    // InternalJSONLanguage.g:968:1: rule__COMPLEX__Group__2__Impl : ( ( '.' )? ) ;
    public final void rule__COMPLEX__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:972:1: ( ( ( '.' )? ) )
            // InternalJSONLanguage.g:973:1: ( ( '.' )? )
            {
            // InternalJSONLanguage.g:973:1: ( ( '.' )? )
            // InternalJSONLanguage.g:974:2: ( '.' )?
            {
             before(grammarAccess.getCOMPLEXAccess().getFullStopKeyword_2()); 
            // InternalJSONLanguage.g:975:2: ( '.' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJSONLanguage.g:975:3: '.'
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCOMPLEXAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group__2__Impl"


    // $ANTLR start "rule__COMPLEX__Group__3"
    // InternalJSONLanguage.g:983:1: rule__COMPLEX__Group__3 : rule__COMPLEX__Group__3__Impl rule__COMPLEX__Group__4 ;
    public final void rule__COMPLEX__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:987:1: ( rule__COMPLEX__Group__3__Impl rule__COMPLEX__Group__4 )
            // InternalJSONLanguage.g:988:2: rule__COMPLEX__Group__3__Impl rule__COMPLEX__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__COMPLEX__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COMPLEX__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group__3"


    // $ANTLR start "rule__COMPLEX__Group__3__Impl"
    // InternalJSONLanguage.g:995:1: rule__COMPLEX__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__COMPLEX__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:999:1: ( ( RULE_INT ) )
            // InternalJSONLanguage.g:1000:1: ( RULE_INT )
            {
            // InternalJSONLanguage.g:1000:1: ( RULE_INT )
            // InternalJSONLanguage.g:1001:2: RULE_INT
            {
             before(grammarAccess.getCOMPLEXAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCOMPLEXAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group__3__Impl"


    // $ANTLR start "rule__COMPLEX__Group__4"
    // InternalJSONLanguage.g:1010:1: rule__COMPLEX__Group__4 : rule__COMPLEX__Group__4__Impl ;
    public final void rule__COMPLEX__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1014:1: ( rule__COMPLEX__Group__4__Impl )
            // InternalJSONLanguage.g:1015:2: rule__COMPLEX__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__COMPLEX__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group__4"


    // $ANTLR start "rule__COMPLEX__Group__4__Impl"
    // InternalJSONLanguage.g:1021:1: rule__COMPLEX__Group__4__Impl : ( ( rule__COMPLEX__Group_4__0 )? ) ;
    public final void rule__COMPLEX__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1025:1: ( ( ( rule__COMPLEX__Group_4__0 )? ) )
            // InternalJSONLanguage.g:1026:1: ( ( rule__COMPLEX__Group_4__0 )? )
            {
            // InternalJSONLanguage.g:1026:1: ( ( rule__COMPLEX__Group_4__0 )? )
            // InternalJSONLanguage.g:1027:2: ( rule__COMPLEX__Group_4__0 )?
            {
             before(grammarAccess.getCOMPLEXAccess().getGroup_4()); 
            // InternalJSONLanguage.g:1028:2: ( rule__COMPLEX__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=12 && LA12_0<=13)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJSONLanguage.g:1028:3: rule__COMPLEX__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__COMPLEX__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCOMPLEXAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group__4__Impl"


    // $ANTLR start "rule__COMPLEX__Group_4__0"
    // InternalJSONLanguage.g:1037:1: rule__COMPLEX__Group_4__0 : rule__COMPLEX__Group_4__0__Impl rule__COMPLEX__Group_4__1 ;
    public final void rule__COMPLEX__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1041:1: ( rule__COMPLEX__Group_4__0__Impl rule__COMPLEX__Group_4__1 )
            // InternalJSONLanguage.g:1042:2: rule__COMPLEX__Group_4__0__Impl rule__COMPLEX__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__COMPLEX__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COMPLEX__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group_4__0"


    // $ANTLR start "rule__COMPLEX__Group_4__0__Impl"
    // InternalJSONLanguage.g:1049:1: rule__COMPLEX__Group_4__0__Impl : ( ( rule__COMPLEX__Alternatives_4_0 ) ) ;
    public final void rule__COMPLEX__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1053:1: ( ( ( rule__COMPLEX__Alternatives_4_0 ) ) )
            // InternalJSONLanguage.g:1054:1: ( ( rule__COMPLEX__Alternatives_4_0 ) )
            {
            // InternalJSONLanguage.g:1054:1: ( ( rule__COMPLEX__Alternatives_4_0 ) )
            // InternalJSONLanguage.g:1055:2: ( rule__COMPLEX__Alternatives_4_0 )
            {
             before(grammarAccess.getCOMPLEXAccess().getAlternatives_4_0()); 
            // InternalJSONLanguage.g:1056:2: ( rule__COMPLEX__Alternatives_4_0 )
            // InternalJSONLanguage.g:1056:3: rule__COMPLEX__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__COMPLEX__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getCOMPLEXAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group_4__0__Impl"


    // $ANTLR start "rule__COMPLEX__Group_4__1"
    // InternalJSONLanguage.g:1064:1: rule__COMPLEX__Group_4__1 : rule__COMPLEX__Group_4__1__Impl rule__COMPLEX__Group_4__2 ;
    public final void rule__COMPLEX__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1068:1: ( rule__COMPLEX__Group_4__1__Impl rule__COMPLEX__Group_4__2 )
            // InternalJSONLanguage.g:1069:2: rule__COMPLEX__Group_4__1__Impl rule__COMPLEX__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__COMPLEX__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COMPLEX__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group_4__1"


    // $ANTLR start "rule__COMPLEX__Group_4__1__Impl"
    // InternalJSONLanguage.g:1076:1: rule__COMPLEX__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__COMPLEX__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1080:1: ( ( ( '-' )? ) )
            // InternalJSONLanguage.g:1081:1: ( ( '-' )? )
            {
            // InternalJSONLanguage.g:1081:1: ( ( '-' )? )
            // InternalJSONLanguage.g:1082:2: ( '-' )?
            {
             before(grammarAccess.getCOMPLEXAccess().getHyphenMinusKeyword_4_1()); 
            // InternalJSONLanguage.g:1083:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJSONLanguage.g:1083:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCOMPLEXAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group_4__1__Impl"


    // $ANTLR start "rule__COMPLEX__Group_4__2"
    // InternalJSONLanguage.g:1091:1: rule__COMPLEX__Group_4__2 : rule__COMPLEX__Group_4__2__Impl rule__COMPLEX__Group_4__3 ;
    public final void rule__COMPLEX__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1095:1: ( rule__COMPLEX__Group_4__2__Impl rule__COMPLEX__Group_4__3 )
            // InternalJSONLanguage.g:1096:2: rule__COMPLEX__Group_4__2__Impl rule__COMPLEX__Group_4__3
            {
            pushFollow(FOLLOW_12);
            rule__COMPLEX__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__COMPLEX__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group_4__2"


    // $ANTLR start "rule__COMPLEX__Group_4__2__Impl"
    // InternalJSONLanguage.g:1103:1: rule__COMPLEX__Group_4__2__Impl : ( ( '+' )? ) ;
    public final void rule__COMPLEX__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1107:1: ( ( ( '+' )? ) )
            // InternalJSONLanguage.g:1108:1: ( ( '+' )? )
            {
            // InternalJSONLanguage.g:1108:1: ( ( '+' )? )
            // InternalJSONLanguage.g:1109:2: ( '+' )?
            {
             before(grammarAccess.getCOMPLEXAccess().getPlusSignKeyword_4_2()); 
            // InternalJSONLanguage.g:1110:2: ( '+' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJSONLanguage.g:1110:3: '+'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCOMPLEXAccess().getPlusSignKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group_4__2__Impl"


    // $ANTLR start "rule__COMPLEX__Group_4__3"
    // InternalJSONLanguage.g:1118:1: rule__COMPLEX__Group_4__3 : rule__COMPLEX__Group_4__3__Impl ;
    public final void rule__COMPLEX__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1122:1: ( rule__COMPLEX__Group_4__3__Impl )
            // InternalJSONLanguage.g:1123:2: rule__COMPLEX__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__COMPLEX__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group_4__3"


    // $ANTLR start "rule__COMPLEX__Group_4__3__Impl"
    // InternalJSONLanguage.g:1129:1: rule__COMPLEX__Group_4__3__Impl : ( RULE_INT ) ;
    public final void rule__COMPLEX__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1133:1: ( ( RULE_INT ) )
            // InternalJSONLanguage.g:1134:1: ( RULE_INT )
            {
            // InternalJSONLanguage.g:1134:1: ( RULE_INT )
            // InternalJSONLanguage.g:1135:2: RULE_INT
            {
             before(grammarAccess.getCOMPLEXAccess().getINTTerminalRuleCall_4_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCOMPLEXAccess().getINTTerminalRuleCall_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COMPLEX__Group_4__3__Impl"


    // $ANTLR start "rule__JSONLanguage__StatementAssignment_1_0"
    // InternalJSONLanguage.g:1145:1: rule__JSONLanguage__StatementAssignment_1_0 : ( ruleStatement ) ;
    public final void rule__JSONLanguage__StatementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1149:1: ( ( ruleStatement ) )
            // InternalJSONLanguage.g:1150:2: ( ruleStatement )
            {
            // InternalJSONLanguage.g:1150:2: ( ruleStatement )
            // InternalJSONLanguage.g:1151:3: ruleStatement
            {
             before(grammarAccess.getJSONLanguageAccess().getStatementStatementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getJSONLanguageAccess().getStatementStatementParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__StatementAssignment_1_0"


    // $ANTLR start "rule__JSONLanguage__StatementAssignment_1_1_1"
    // InternalJSONLanguage.g:1160:1: rule__JSONLanguage__StatementAssignment_1_1_1 : ( ruleStatement ) ;
    public final void rule__JSONLanguage__StatementAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1164:1: ( ( ruleStatement ) )
            // InternalJSONLanguage.g:1165:2: ( ruleStatement )
            {
            // InternalJSONLanguage.g:1165:2: ( ruleStatement )
            // InternalJSONLanguage.g:1166:3: ruleStatement
            {
             before(grammarAccess.getJSONLanguageAccess().getStatementStatementParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getJSONLanguageAccess().getStatementStatementParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONLanguage__StatementAssignment_1_1_1"


    // $ANTLR start "rule__Statement__KeyAssignment_0"
    // InternalJSONLanguage.g:1175:1: rule__Statement__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Statement__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1179:1: ( ( RULE_STRING ) )
            // InternalJSONLanguage.g:1180:2: ( RULE_STRING )
            {
            // InternalJSONLanguage.g:1180:2: ( RULE_STRING )
            // InternalJSONLanguage.g:1181:3: RULE_STRING
            {
             before(grammarAccess.getStatementAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__KeyAssignment_0"


    // $ANTLR start "rule__Statement__ValueAssignment_2"
    // InternalJSONLanguage.g:1190:1: rule__Statement__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Statement__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1194:1: ( ( ruleValue ) )
            // InternalJSONLanguage.g:1195:2: ( ruleValue )
            {
            // InternalJSONLanguage.g:1195:2: ( ruleValue )
            // InternalJSONLanguage.g:1196:3: ruleValue
            {
             before(grammarAccess.getStatementAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ValueAssignment_2"


    // $ANTLR start "rule__Array__ValueAssignment_1_0"
    // InternalJSONLanguage.g:1205:1: rule__Array__ValueAssignment_1_0 : ( ruleValue ) ;
    public final void rule__Array__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1209:1: ( ( ruleValue ) )
            // InternalJSONLanguage.g:1210:2: ( ruleValue )
            {
            // InternalJSONLanguage.g:1210:2: ( ruleValue )
            // InternalJSONLanguage.g:1211:3: ruleValue
            {
             before(grammarAccess.getArrayAccess().getValueValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getValueValueParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__ValueAssignment_1_0"


    // $ANTLR start "rule__Array__ValueAssignment_1_1_1"
    // InternalJSONLanguage.g:1220:1: rule__Array__ValueAssignment_1_1_1 : ( ruleValue ) ;
    public final void rule__Array__ValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1224:1: ( ( ruleValue ) )
            // InternalJSONLanguage.g:1225:2: ( ruleValue )
            {
            // InternalJSONLanguage.g:1225:2: ( ruleValue )
            // InternalJSONLanguage.g:1226:3: ruleValue
            {
             before(grammarAccess.getArrayAccess().getValueValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getValueValueParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__ValueAssignment_1_1_1"


    // $ANTLR start "rule__Text__ValAssignment"
    // InternalJSONLanguage.g:1235:1: rule__Text__ValAssignment : ( RULE_STRING ) ;
    public final void rule__Text__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1239:1: ( ( RULE_STRING ) )
            // InternalJSONLanguage.g:1240:2: ( RULE_STRING )
            {
            // InternalJSONLanguage.g:1240:2: ( RULE_STRING )
            // InternalJSONLanguage.g:1241:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getValSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getValSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__ValAssignment"


    // $ANTLR start "rule__Boolean__ValAssignment_0"
    // InternalJSONLanguage.g:1250:1: rule__Boolean__ValAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__Boolean__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1254:1: ( ( ( 'true' ) ) )
            // InternalJSONLanguage.g:1255:2: ( ( 'true' ) )
            {
            // InternalJSONLanguage.g:1255:2: ( ( 'true' ) )
            // InternalJSONLanguage.g:1256:3: ( 'true' )
            {
             before(grammarAccess.getBooleanAccess().getValTrueKeyword_0_0()); 
            // InternalJSONLanguage.g:1257:3: ( 'true' )
            // InternalJSONLanguage.g:1258:4: 'true'
            {
             before(grammarAccess.getBooleanAccess().getValTrueKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBooleanAccess().getValTrueKeyword_0_0()); 

            }

             after(grammarAccess.getBooleanAccess().getValTrueKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__ValAssignment_0"


    // $ANTLR start "rule__Null__ValAssignment"
    // InternalJSONLanguage.g:1269:1: rule__Null__ValAssignment : ( ( 'null' ) ) ;
    public final void rule__Null__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1273:1: ( ( ( 'null' ) ) )
            // InternalJSONLanguage.g:1274:2: ( ( 'null' ) )
            {
            // InternalJSONLanguage.g:1274:2: ( ( 'null' ) )
            // InternalJSONLanguage.g:1275:3: ( 'null' )
            {
             before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            // InternalJSONLanguage.g:1276:3: ( 'null' )
            // InternalJSONLanguage.g:1277:4: 'null'
            {
             before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNullAccess().getValNullKeyword_0()); 

            }

             after(grammarAccess.getNullAccess().getValNullKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Null__ValAssignment"


    // $ANTLR start "rule__IntNumber__ValAssignment"
    // InternalJSONLanguage.g:1288:1: rule__IntNumber__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntNumber__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1292:1: ( ( RULE_INT ) )
            // InternalJSONLanguage.g:1293:2: ( RULE_INT )
            {
            // InternalJSONLanguage.g:1293:2: ( RULE_INT )
            // InternalJSONLanguage.g:1294:3: RULE_INT
            {
             before(grammarAccess.getIntNumberAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntNumberAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntNumber__ValAssignment"


    // $ANTLR start "rule__ComplexNumber__ValAssignment"
    // InternalJSONLanguage.g:1303:1: rule__ComplexNumber__ValAssignment : ( ruleCOMPLEX ) ;
    public final void rule__ComplexNumber__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1307:1: ( ( ruleCOMPLEX ) )
            // InternalJSONLanguage.g:1308:2: ( ruleCOMPLEX )
            {
            // InternalJSONLanguage.g:1308:2: ( ruleCOMPLEX )
            // InternalJSONLanguage.g:1309:3: ruleCOMPLEX
            {
             before(grammarAccess.getComplexNumberAccess().getValCOMPLEXParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCOMPLEX();

            state._fsp--;

             after(grammarAccess.getComplexNumberAccess().getValCOMPLEXParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexNumber__ValAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001B44830L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001BC4830L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000500010L});

}