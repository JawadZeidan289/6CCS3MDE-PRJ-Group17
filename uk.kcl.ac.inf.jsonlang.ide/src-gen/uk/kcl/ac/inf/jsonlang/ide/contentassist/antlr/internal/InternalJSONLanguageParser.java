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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'null'", "'true'", "'false'", "'E'", "'e'", "'{'", "'}'", "','", "':'", "'['", "']'", "'-'", "'.'", "'+'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_INT=5;
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


    // $ANTLR start "entryRuleBoolean"
    // InternalJSONLanguage.g:153:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalJSONLanguage.g:154:1: ( ruleBoolean EOF )
            // InternalJSONLanguage.g:155:1: ruleBoolean EOF
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
    // InternalJSONLanguage.g:162:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:166:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalJSONLanguage.g:167:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalJSONLanguage.g:167:2: ( ( rule__Boolean__Alternatives ) )
            // InternalJSONLanguage.g:168:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalJSONLanguage.g:169:3: ( rule__Boolean__Alternatives )
            // InternalJSONLanguage.g:169:4: rule__Boolean__Alternatives
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
    // InternalJSONLanguage.g:178:1: entryRuleNull : ruleNull EOF ;
    public final void entryRuleNull() throws RecognitionException {
        try {
            // InternalJSONLanguage.g:179:1: ( ruleNull EOF )
            // InternalJSONLanguage.g:180:1: ruleNull EOF
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
    // InternalJSONLanguage.g:187:1: ruleNull : ( 'null' ) ;
    public final void ruleNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:191:2: ( ( 'null' ) )
            // InternalJSONLanguage.g:192:2: ( 'null' )
            {
            // InternalJSONLanguage.g:192:2: ( 'null' )
            // InternalJSONLanguage.g:193:3: 'null'
            {
             before(grammarAccess.getNullAccess().getNullKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNullAccess().getNullKeyword()); 

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
    // InternalJSONLanguage.g:203:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalJSONLanguage.g:207:1: ( ruleNumber EOF )
            // InternalJSONLanguage.g:208:1: ruleNumber EOF
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

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalJSONLanguage.g:218:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:223:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalJSONLanguage.g:224:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalJSONLanguage.g:224:2: ( ( rule__Number__Group__0 ) )
            // InternalJSONLanguage.g:225:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalJSONLanguage.g:226:3: ( rule__Number__Group__0 )
            // InternalJSONLanguage.g:226:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalJSONLanguage.g:235:1: rule__Value__Alternatives : ( ( rulejSONLanguage ) | ( ruleArray ) | ( RULE_STRING ) | ( ruleNumber ) | ( ruleBoolean ) | ( ruleNull ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:239:1: ( ( rulejSONLanguage ) | ( ruleArray ) | ( RULE_STRING ) | ( ruleNumber ) | ( ruleBoolean ) | ( ruleNull ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 20:
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
            case 22:
            case 23:
                {
                alt1=4;
                }
                break;
            case 12:
            case 13:
                {
                alt1=5;
                }
                break;
            case 11:
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
                    // InternalJSONLanguage.g:240:2: ( rulejSONLanguage )
                    {
                    // InternalJSONLanguage.g:240:2: ( rulejSONLanguage )
                    // InternalJSONLanguage.g:241:3: rulejSONLanguage
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
                    // InternalJSONLanguage.g:246:2: ( ruleArray )
                    {
                    // InternalJSONLanguage.g:246:2: ( ruleArray )
                    // InternalJSONLanguage.g:247:3: ruleArray
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
                    // InternalJSONLanguage.g:252:2: ( RULE_STRING )
                    {
                    // InternalJSONLanguage.g:252:2: ( RULE_STRING )
                    // InternalJSONLanguage.g:253:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJSONLanguage.g:258:2: ( ruleNumber )
                    {
                    // InternalJSONLanguage.g:258:2: ( ruleNumber )
                    // InternalJSONLanguage.g:259:3: ruleNumber
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
                    // InternalJSONLanguage.g:264:2: ( ruleBoolean )
                    {
                    // InternalJSONLanguage.g:264:2: ( ruleBoolean )
                    // InternalJSONLanguage.g:265:3: ruleBoolean
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
                    // InternalJSONLanguage.g:270:2: ( ruleNull )
                    {
                    // InternalJSONLanguage.g:270:2: ( ruleNull )
                    // InternalJSONLanguage.g:271:3: ruleNull
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
    // InternalJSONLanguage.g:280:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:284:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJSONLanguage.g:285:2: ( 'true' )
                    {
                    // InternalJSONLanguage.g:285:2: ( 'true' )
                    // InternalJSONLanguage.g:286:3: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSONLanguage.g:291:2: ( 'false' )
                    {
                    // InternalJSONLanguage.g:291:2: ( 'false' )
                    // InternalJSONLanguage.g:292:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__Number__Alternatives_4_0"
    // InternalJSONLanguage.g:301:1: rule__Number__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__Number__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:305:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJSONLanguage.g:306:2: ( 'E' )
                    {
                    // InternalJSONLanguage.g:306:2: ( 'E' )
                    // InternalJSONLanguage.g:307:3: 'E'
                    {
                     before(grammarAccess.getNumberAccess().getEKeyword_4_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSONLanguage.g:312:2: ( 'e' )
                    {
                    // InternalJSONLanguage.g:312:2: ( 'e' )
                    // InternalJSONLanguage.g:313:3: 'e'
                    {
                     before(grammarAccess.getNumberAccess().getEKeyword_4_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__Number__Alternatives_4_0"


    // $ANTLR start "rule__JSONLanguage__Group__0"
    // InternalJSONLanguage.g:322:1: rule__JSONLanguage__Group__0 : rule__JSONLanguage__Group__0__Impl rule__JSONLanguage__Group__1 ;
    public final void rule__JSONLanguage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:326:1: ( rule__JSONLanguage__Group__0__Impl rule__JSONLanguage__Group__1 )
            // InternalJSONLanguage.g:327:2: rule__JSONLanguage__Group__0__Impl rule__JSONLanguage__Group__1
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
    // InternalJSONLanguage.g:334:1: rule__JSONLanguage__Group__0__Impl : ( '{' ) ;
    public final void rule__JSONLanguage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:338:1: ( ( '{' ) )
            // InternalJSONLanguage.g:339:1: ( '{' )
            {
            // InternalJSONLanguage.g:339:1: ( '{' )
            // InternalJSONLanguage.g:340:2: '{'
            {
             before(grammarAccess.getJSONLanguageAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalJSONLanguage.g:349:1: rule__JSONLanguage__Group__1 : rule__JSONLanguage__Group__1__Impl rule__JSONLanguage__Group__2 ;
    public final void rule__JSONLanguage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:353:1: ( rule__JSONLanguage__Group__1__Impl rule__JSONLanguage__Group__2 )
            // InternalJSONLanguage.g:354:2: rule__JSONLanguage__Group__1__Impl rule__JSONLanguage__Group__2
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
    // InternalJSONLanguage.g:361:1: rule__JSONLanguage__Group__1__Impl : ( ( rule__JSONLanguage__Group_1__0 )? ) ;
    public final void rule__JSONLanguage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:365:1: ( ( ( rule__JSONLanguage__Group_1__0 )? ) )
            // InternalJSONLanguage.g:366:1: ( ( rule__JSONLanguage__Group_1__0 )? )
            {
            // InternalJSONLanguage.g:366:1: ( ( rule__JSONLanguage__Group_1__0 )? )
            // InternalJSONLanguage.g:367:2: ( rule__JSONLanguage__Group_1__0 )?
            {
             before(grammarAccess.getJSONLanguageAccess().getGroup_1()); 
            // InternalJSONLanguage.g:368:2: ( rule__JSONLanguage__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJSONLanguage.g:368:3: rule__JSONLanguage__Group_1__0
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
    // InternalJSONLanguage.g:376:1: rule__JSONLanguage__Group__2 : rule__JSONLanguage__Group__2__Impl ;
    public final void rule__JSONLanguage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:380:1: ( rule__JSONLanguage__Group__2__Impl )
            // InternalJSONLanguage.g:381:2: rule__JSONLanguage__Group__2__Impl
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
    // InternalJSONLanguage.g:387:1: rule__JSONLanguage__Group__2__Impl : ( '}' ) ;
    public final void rule__JSONLanguage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:391:1: ( ( '}' ) )
            // InternalJSONLanguage.g:392:1: ( '}' )
            {
            // InternalJSONLanguage.g:392:1: ( '}' )
            // InternalJSONLanguage.g:393:2: '}'
            {
             before(grammarAccess.getJSONLanguageAccess().getRightCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalJSONLanguage.g:403:1: rule__JSONLanguage__Group_1__0 : rule__JSONLanguage__Group_1__0__Impl rule__JSONLanguage__Group_1__1 ;
    public final void rule__JSONLanguage__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:407:1: ( rule__JSONLanguage__Group_1__0__Impl rule__JSONLanguage__Group_1__1 )
            // InternalJSONLanguage.g:408:2: rule__JSONLanguage__Group_1__0__Impl rule__JSONLanguage__Group_1__1
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
    // InternalJSONLanguage.g:415:1: rule__JSONLanguage__Group_1__0__Impl : ( ( rule__JSONLanguage__StatementAssignment_1_0 ) ) ;
    public final void rule__JSONLanguage__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:419:1: ( ( ( rule__JSONLanguage__StatementAssignment_1_0 ) ) )
            // InternalJSONLanguage.g:420:1: ( ( rule__JSONLanguage__StatementAssignment_1_0 ) )
            {
            // InternalJSONLanguage.g:420:1: ( ( rule__JSONLanguage__StatementAssignment_1_0 ) )
            // InternalJSONLanguage.g:421:2: ( rule__JSONLanguage__StatementAssignment_1_0 )
            {
             before(grammarAccess.getJSONLanguageAccess().getStatementAssignment_1_0()); 
            // InternalJSONLanguage.g:422:2: ( rule__JSONLanguage__StatementAssignment_1_0 )
            // InternalJSONLanguage.g:422:3: rule__JSONLanguage__StatementAssignment_1_0
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
    // InternalJSONLanguage.g:430:1: rule__JSONLanguage__Group_1__1 : rule__JSONLanguage__Group_1__1__Impl ;
    public final void rule__JSONLanguage__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:434:1: ( rule__JSONLanguage__Group_1__1__Impl )
            // InternalJSONLanguage.g:435:2: rule__JSONLanguage__Group_1__1__Impl
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
    // InternalJSONLanguage.g:441:1: rule__JSONLanguage__Group_1__1__Impl : ( ( rule__JSONLanguage__Group_1_1__0 )* ) ;
    public final void rule__JSONLanguage__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:445:1: ( ( ( rule__JSONLanguage__Group_1_1__0 )* ) )
            // InternalJSONLanguage.g:446:1: ( ( rule__JSONLanguage__Group_1_1__0 )* )
            {
            // InternalJSONLanguage.g:446:1: ( ( rule__JSONLanguage__Group_1_1__0 )* )
            // InternalJSONLanguage.g:447:2: ( rule__JSONLanguage__Group_1_1__0 )*
            {
             before(grammarAccess.getJSONLanguageAccess().getGroup_1_1()); 
            // InternalJSONLanguage.g:448:2: ( rule__JSONLanguage__Group_1_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJSONLanguage.g:448:3: rule__JSONLanguage__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__JSONLanguage__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalJSONLanguage.g:457:1: rule__JSONLanguage__Group_1_1__0 : rule__JSONLanguage__Group_1_1__0__Impl rule__JSONLanguage__Group_1_1__1 ;
    public final void rule__JSONLanguage__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:461:1: ( rule__JSONLanguage__Group_1_1__0__Impl rule__JSONLanguage__Group_1_1__1 )
            // InternalJSONLanguage.g:462:2: rule__JSONLanguage__Group_1_1__0__Impl rule__JSONLanguage__Group_1_1__1
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
    // InternalJSONLanguage.g:469:1: rule__JSONLanguage__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__JSONLanguage__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:473:1: ( ( ',' ) )
            // InternalJSONLanguage.g:474:1: ( ',' )
            {
            // InternalJSONLanguage.g:474:1: ( ',' )
            // InternalJSONLanguage.g:475:2: ','
            {
             before(grammarAccess.getJSONLanguageAccess().getCommaKeyword_1_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalJSONLanguage.g:484:1: rule__JSONLanguage__Group_1_1__1 : rule__JSONLanguage__Group_1_1__1__Impl ;
    public final void rule__JSONLanguage__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:488:1: ( rule__JSONLanguage__Group_1_1__1__Impl )
            // InternalJSONLanguage.g:489:2: rule__JSONLanguage__Group_1_1__1__Impl
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
    // InternalJSONLanguage.g:495:1: rule__JSONLanguage__Group_1_1__1__Impl : ( ( rule__JSONLanguage__StatementAssignment_1_1_1 ) ) ;
    public final void rule__JSONLanguage__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:499:1: ( ( ( rule__JSONLanguage__StatementAssignment_1_1_1 ) ) )
            // InternalJSONLanguage.g:500:1: ( ( rule__JSONLanguage__StatementAssignment_1_1_1 ) )
            {
            // InternalJSONLanguage.g:500:1: ( ( rule__JSONLanguage__StatementAssignment_1_1_1 ) )
            // InternalJSONLanguage.g:501:2: ( rule__JSONLanguage__StatementAssignment_1_1_1 )
            {
             before(grammarAccess.getJSONLanguageAccess().getStatementAssignment_1_1_1()); 
            // InternalJSONLanguage.g:502:2: ( rule__JSONLanguage__StatementAssignment_1_1_1 )
            // InternalJSONLanguage.g:502:3: rule__JSONLanguage__StatementAssignment_1_1_1
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
    // InternalJSONLanguage.g:511:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:515:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalJSONLanguage.g:516:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
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
    // InternalJSONLanguage.g:523:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__KeyAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:527:1: ( ( ( rule__Statement__KeyAssignment_0 ) ) )
            // InternalJSONLanguage.g:528:1: ( ( rule__Statement__KeyAssignment_0 ) )
            {
            // InternalJSONLanguage.g:528:1: ( ( rule__Statement__KeyAssignment_0 ) )
            // InternalJSONLanguage.g:529:2: ( rule__Statement__KeyAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getKeyAssignment_0()); 
            // InternalJSONLanguage.g:530:2: ( rule__Statement__KeyAssignment_0 )
            // InternalJSONLanguage.g:530:3: rule__Statement__KeyAssignment_0
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
    // InternalJSONLanguage.g:538:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:542:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // InternalJSONLanguage.g:543:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
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
    // InternalJSONLanguage.g:550:1: rule__Statement__Group__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:554:1: ( ( ':' ) )
            // InternalJSONLanguage.g:555:1: ( ':' )
            {
            // InternalJSONLanguage.g:555:1: ( ':' )
            // InternalJSONLanguage.g:556:2: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalJSONLanguage.g:565:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:569:1: ( rule__Statement__Group__2__Impl )
            // InternalJSONLanguage.g:570:2: rule__Statement__Group__2__Impl
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
    // InternalJSONLanguage.g:576:1: rule__Statement__Group__2__Impl : ( ( rule__Statement__ValueAssignment_2 ) ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:580:1: ( ( ( rule__Statement__ValueAssignment_2 ) ) )
            // InternalJSONLanguage.g:581:1: ( ( rule__Statement__ValueAssignment_2 ) )
            {
            // InternalJSONLanguage.g:581:1: ( ( rule__Statement__ValueAssignment_2 ) )
            // InternalJSONLanguage.g:582:2: ( rule__Statement__ValueAssignment_2 )
            {
             before(grammarAccess.getStatementAccess().getValueAssignment_2()); 
            // InternalJSONLanguage.g:583:2: ( rule__Statement__ValueAssignment_2 )
            // InternalJSONLanguage.g:583:3: rule__Statement__ValueAssignment_2
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
    // InternalJSONLanguage.g:592:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:596:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // InternalJSONLanguage.g:597:2: rule__Array__Group__0__Impl rule__Array__Group__1
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
    // InternalJSONLanguage.g:604:1: rule__Array__Group__0__Impl : ( '[' ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:608:1: ( ( '[' ) )
            // InternalJSONLanguage.g:609:1: ( '[' )
            {
            // InternalJSONLanguage.g:609:1: ( '[' )
            // InternalJSONLanguage.g:610:2: '['
            {
             before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalJSONLanguage.g:619:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:623:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // InternalJSONLanguage.g:624:2: rule__Array__Group__1__Impl rule__Array__Group__2
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
    // InternalJSONLanguage.g:631:1: rule__Array__Group__1__Impl : ( ( rule__Array__Group_1__0 )? ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:635:1: ( ( ( rule__Array__Group_1__0 )? ) )
            // InternalJSONLanguage.g:636:1: ( ( rule__Array__Group_1__0 )? )
            {
            // InternalJSONLanguage.g:636:1: ( ( rule__Array__Group_1__0 )? )
            // InternalJSONLanguage.g:637:2: ( rule__Array__Group_1__0 )?
            {
             before(grammarAccess.getArrayAccess().getGroup_1()); 
            // InternalJSONLanguage.g:638:2: ( rule__Array__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_INT)||(LA6_0>=11 && LA6_0<=13)||LA6_0==16||LA6_0==20||(LA6_0>=22 && LA6_0<=23)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJSONLanguage.g:638:3: rule__Array__Group_1__0
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
    // InternalJSONLanguage.g:646:1: rule__Array__Group__2 : rule__Array__Group__2__Impl ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:650:1: ( rule__Array__Group__2__Impl )
            // InternalJSONLanguage.g:651:2: rule__Array__Group__2__Impl
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
    // InternalJSONLanguage.g:657:1: rule__Array__Group__2__Impl : ( ']' ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:661:1: ( ( ']' ) )
            // InternalJSONLanguage.g:662:1: ( ']' )
            {
            // InternalJSONLanguage.g:662:1: ( ']' )
            // InternalJSONLanguage.g:663:2: ']'
            {
             before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalJSONLanguage.g:673:1: rule__Array__Group_1__0 : rule__Array__Group_1__0__Impl rule__Array__Group_1__1 ;
    public final void rule__Array__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:677:1: ( rule__Array__Group_1__0__Impl rule__Array__Group_1__1 )
            // InternalJSONLanguage.g:678:2: rule__Array__Group_1__0__Impl rule__Array__Group_1__1
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
    // InternalJSONLanguage.g:685:1: rule__Array__Group_1__0__Impl : ( ( rule__Array__ValueAssignment_1_0 ) ) ;
    public final void rule__Array__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:689:1: ( ( ( rule__Array__ValueAssignment_1_0 ) ) )
            // InternalJSONLanguage.g:690:1: ( ( rule__Array__ValueAssignment_1_0 ) )
            {
            // InternalJSONLanguage.g:690:1: ( ( rule__Array__ValueAssignment_1_0 ) )
            // InternalJSONLanguage.g:691:2: ( rule__Array__ValueAssignment_1_0 )
            {
             before(grammarAccess.getArrayAccess().getValueAssignment_1_0()); 
            // InternalJSONLanguage.g:692:2: ( rule__Array__ValueAssignment_1_0 )
            // InternalJSONLanguage.g:692:3: rule__Array__ValueAssignment_1_0
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
    // InternalJSONLanguage.g:700:1: rule__Array__Group_1__1 : rule__Array__Group_1__1__Impl ;
    public final void rule__Array__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:704:1: ( rule__Array__Group_1__1__Impl )
            // InternalJSONLanguage.g:705:2: rule__Array__Group_1__1__Impl
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
    // InternalJSONLanguage.g:711:1: rule__Array__Group_1__1__Impl : ( ( rule__Array__Group_1_1__0 )* ) ;
    public final void rule__Array__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:715:1: ( ( ( rule__Array__Group_1_1__0 )* ) )
            // InternalJSONLanguage.g:716:1: ( ( rule__Array__Group_1_1__0 )* )
            {
            // InternalJSONLanguage.g:716:1: ( ( rule__Array__Group_1_1__0 )* )
            // InternalJSONLanguage.g:717:2: ( rule__Array__Group_1_1__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_1_1()); 
            // InternalJSONLanguage.g:718:2: ( rule__Array__Group_1_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJSONLanguage.g:718:3: rule__Array__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Array__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalJSONLanguage.g:727:1: rule__Array__Group_1_1__0 : rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1 ;
    public final void rule__Array__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:731:1: ( rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1 )
            // InternalJSONLanguage.g:732:2: rule__Array__Group_1_1__0__Impl rule__Array__Group_1_1__1
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
    // InternalJSONLanguage.g:739:1: rule__Array__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:743:1: ( ( ',' ) )
            // InternalJSONLanguage.g:744:1: ( ',' )
            {
            // InternalJSONLanguage.g:744:1: ( ',' )
            // InternalJSONLanguage.g:745:2: ','
            {
             before(grammarAccess.getArrayAccess().getCommaKeyword_1_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalJSONLanguage.g:754:1: rule__Array__Group_1_1__1 : rule__Array__Group_1_1__1__Impl ;
    public final void rule__Array__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:758:1: ( rule__Array__Group_1_1__1__Impl )
            // InternalJSONLanguage.g:759:2: rule__Array__Group_1_1__1__Impl
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
    // InternalJSONLanguage.g:765:1: rule__Array__Group_1_1__1__Impl : ( ( rule__Array__ValueAssignment_1_1_1 ) ) ;
    public final void rule__Array__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:769:1: ( ( ( rule__Array__ValueAssignment_1_1_1 ) ) )
            // InternalJSONLanguage.g:770:1: ( ( rule__Array__ValueAssignment_1_1_1 ) )
            {
            // InternalJSONLanguage.g:770:1: ( ( rule__Array__ValueAssignment_1_1_1 ) )
            // InternalJSONLanguage.g:771:2: ( rule__Array__ValueAssignment_1_1_1 )
            {
             before(grammarAccess.getArrayAccess().getValueAssignment_1_1_1()); 
            // InternalJSONLanguage.g:772:2: ( rule__Array__ValueAssignment_1_1_1 )
            // InternalJSONLanguage.g:772:3: rule__Array__ValueAssignment_1_1_1
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


    // $ANTLR start "rule__Number__Group__0"
    // InternalJSONLanguage.g:781:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:785:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalJSONLanguage.g:786:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

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
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalJSONLanguage.g:793:1: rule__Number__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:797:1: ( ( ( '-' )? ) )
            // InternalJSONLanguage.g:798:1: ( ( '-' )? )
            {
            // InternalJSONLanguage.g:798:1: ( ( '-' )? )
            // InternalJSONLanguage.g:799:2: ( '-' )?
            {
             before(grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
            // InternalJSONLanguage.g:800:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJSONLanguage.g:800:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalJSONLanguage.g:808:1: rule__Number__Group__1 : rule__Number__Group__1__Impl rule__Number__Group__2 ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:812:1: ( rule__Number__Group__1__Impl rule__Number__Group__2 )
            // InternalJSONLanguage.g:813:2: rule__Number__Group__1__Impl rule__Number__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Number__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__2();

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
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalJSONLanguage.g:820:1: rule__Number__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:824:1: ( ( ( RULE_INT )? ) )
            // InternalJSONLanguage.g:825:1: ( ( RULE_INT )? )
            {
            // InternalJSONLanguage.g:825:1: ( ( RULE_INT )? )
            // InternalJSONLanguage.g:826:2: ( RULE_INT )?
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
            // InternalJSONLanguage.g:827:2: ( RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_INT||LA9_1==23) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalJSONLanguage.g:827:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group__2"
    // InternalJSONLanguage.g:835:1: rule__Number__Group__2 : rule__Number__Group__2__Impl rule__Number__Group__3 ;
    public final void rule__Number__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:839:1: ( rule__Number__Group__2__Impl rule__Number__Group__3 )
            // InternalJSONLanguage.g:840:2: rule__Number__Group__2__Impl rule__Number__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Number__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__3();

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
    // $ANTLR end "rule__Number__Group__2"


    // $ANTLR start "rule__Number__Group__2__Impl"
    // InternalJSONLanguage.g:847:1: rule__Number__Group__2__Impl : ( ( '.' )? ) ;
    public final void rule__Number__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:851:1: ( ( ( '.' )? ) )
            // InternalJSONLanguage.g:852:1: ( ( '.' )? )
            {
            // InternalJSONLanguage.g:852:1: ( ( '.' )? )
            // InternalJSONLanguage.g:853:2: ( '.' )?
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_2()); 
            // InternalJSONLanguage.g:854:2: ( '.' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJSONLanguage.g:854:3: '.'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Number__Group__2__Impl"


    // $ANTLR start "rule__Number__Group__3"
    // InternalJSONLanguage.g:862:1: rule__Number__Group__3 : rule__Number__Group__3__Impl rule__Number__Group__4 ;
    public final void rule__Number__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:866:1: ( rule__Number__Group__3__Impl rule__Number__Group__4 )
            // InternalJSONLanguage.g:867:2: rule__Number__Group__3__Impl rule__Number__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Number__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__4();

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
    // $ANTLR end "rule__Number__Group__3"


    // $ANTLR start "rule__Number__Group__3__Impl"
    // InternalJSONLanguage.g:874:1: rule__Number__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:878:1: ( ( RULE_INT ) )
            // InternalJSONLanguage.g:879:1: ( RULE_INT )
            {
            // InternalJSONLanguage.g:879:1: ( RULE_INT )
            // InternalJSONLanguage.g:880:2: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Number__Group__3__Impl"


    // $ANTLR start "rule__Number__Group__4"
    // InternalJSONLanguage.g:889:1: rule__Number__Group__4 : rule__Number__Group__4__Impl ;
    public final void rule__Number__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:893:1: ( rule__Number__Group__4__Impl )
            // InternalJSONLanguage.g:894:2: rule__Number__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__4__Impl();

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
    // $ANTLR end "rule__Number__Group__4"


    // $ANTLR start "rule__Number__Group__4__Impl"
    // InternalJSONLanguage.g:900:1: rule__Number__Group__4__Impl : ( ( rule__Number__Group_4__0 )? ) ;
    public final void rule__Number__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:904:1: ( ( ( rule__Number__Group_4__0 )? ) )
            // InternalJSONLanguage.g:905:1: ( ( rule__Number__Group_4__0 )? )
            {
            // InternalJSONLanguage.g:905:1: ( ( rule__Number__Group_4__0 )? )
            // InternalJSONLanguage.g:906:2: ( rule__Number__Group_4__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_4()); 
            // InternalJSONLanguage.g:907:2: ( rule__Number__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=14 && LA11_0<=15)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJSONLanguage.g:907:3: rule__Number__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Number__Group__4__Impl"


    // $ANTLR start "rule__Number__Group_4__0"
    // InternalJSONLanguage.g:916:1: rule__Number__Group_4__0 : rule__Number__Group_4__0__Impl rule__Number__Group_4__1 ;
    public final void rule__Number__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:920:1: ( rule__Number__Group_4__0__Impl rule__Number__Group_4__1 )
            // InternalJSONLanguage.g:921:2: rule__Number__Group_4__0__Impl rule__Number__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Number__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_4__1();

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
    // $ANTLR end "rule__Number__Group_4__0"


    // $ANTLR start "rule__Number__Group_4__0__Impl"
    // InternalJSONLanguage.g:928:1: rule__Number__Group_4__0__Impl : ( ( rule__Number__Alternatives_4_0 ) ) ;
    public final void rule__Number__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:932:1: ( ( ( rule__Number__Alternatives_4_0 ) ) )
            // InternalJSONLanguage.g:933:1: ( ( rule__Number__Alternatives_4_0 ) )
            {
            // InternalJSONLanguage.g:933:1: ( ( rule__Number__Alternatives_4_0 ) )
            // InternalJSONLanguage.g:934:2: ( rule__Number__Alternatives_4_0 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_4_0()); 
            // InternalJSONLanguage.g:935:2: ( rule__Number__Alternatives_4_0 )
            // InternalJSONLanguage.g:935:3: rule__Number__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__Number__Group_4__0__Impl"


    // $ANTLR start "rule__Number__Group_4__1"
    // InternalJSONLanguage.g:943:1: rule__Number__Group_4__1 : rule__Number__Group_4__1__Impl rule__Number__Group_4__2 ;
    public final void rule__Number__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:947:1: ( rule__Number__Group_4__1__Impl rule__Number__Group_4__2 )
            // InternalJSONLanguage.g:948:2: rule__Number__Group_4__1__Impl rule__Number__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Number__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_4__2();

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
    // $ANTLR end "rule__Number__Group_4__1"


    // $ANTLR start "rule__Number__Group_4__1__Impl"
    // InternalJSONLanguage.g:955:1: rule__Number__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__Number__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:959:1: ( ( ( '-' )? ) )
            // InternalJSONLanguage.g:960:1: ( ( '-' )? )
            {
            // InternalJSONLanguage.g:960:1: ( ( '-' )? )
            // InternalJSONLanguage.g:961:2: ( '-' )?
            {
             before(grammarAccess.getNumberAccess().getHyphenMinusKeyword_4_1()); 
            // InternalJSONLanguage.g:962:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJSONLanguage.g:962:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__Number__Group_4__1__Impl"


    // $ANTLR start "rule__Number__Group_4__2"
    // InternalJSONLanguage.g:970:1: rule__Number__Group_4__2 : rule__Number__Group_4__2__Impl rule__Number__Group_4__3 ;
    public final void rule__Number__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:974:1: ( rule__Number__Group_4__2__Impl rule__Number__Group_4__3 )
            // InternalJSONLanguage.g:975:2: rule__Number__Group_4__2__Impl rule__Number__Group_4__3
            {
            pushFollow(FOLLOW_12);
            rule__Number__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_4__3();

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
    // $ANTLR end "rule__Number__Group_4__2"


    // $ANTLR start "rule__Number__Group_4__2__Impl"
    // InternalJSONLanguage.g:982:1: rule__Number__Group_4__2__Impl : ( ( '+' )? ) ;
    public final void rule__Number__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:986:1: ( ( ( '+' )? ) )
            // InternalJSONLanguage.g:987:1: ( ( '+' )? )
            {
            // InternalJSONLanguage.g:987:1: ( ( '+' )? )
            // InternalJSONLanguage.g:988:2: ( '+' )?
            {
             before(grammarAccess.getNumberAccess().getPlusSignKeyword_4_2()); 
            // InternalJSONLanguage.g:989:2: ( '+' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJSONLanguage.g:989:3: '+'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getPlusSignKeyword_4_2()); 

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
    // $ANTLR end "rule__Number__Group_4__2__Impl"


    // $ANTLR start "rule__Number__Group_4__3"
    // InternalJSONLanguage.g:997:1: rule__Number__Group_4__3 : rule__Number__Group_4__3__Impl ;
    public final void rule__Number__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1001:1: ( rule__Number__Group_4__3__Impl )
            // InternalJSONLanguage.g:1002:2: rule__Number__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group_4__3__Impl();

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
    // $ANTLR end "rule__Number__Group_4__3"


    // $ANTLR start "rule__Number__Group_4__3__Impl"
    // InternalJSONLanguage.g:1008:1: rule__Number__Group_4__3__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1012:1: ( ( RULE_INT ) )
            // InternalJSONLanguage.g:1013:1: ( RULE_INT )
            {
            // InternalJSONLanguage.g:1013:1: ( RULE_INT )
            // InternalJSONLanguage.g:1014:2: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_4_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_4_3()); 

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
    // $ANTLR end "rule__Number__Group_4__3__Impl"


    // $ANTLR start "rule__JSONLanguage__StatementAssignment_1_0"
    // InternalJSONLanguage.g:1024:1: rule__JSONLanguage__StatementAssignment_1_0 : ( ruleStatement ) ;
    public final void rule__JSONLanguage__StatementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1028:1: ( ( ruleStatement ) )
            // InternalJSONLanguage.g:1029:2: ( ruleStatement )
            {
            // InternalJSONLanguage.g:1029:2: ( ruleStatement )
            // InternalJSONLanguage.g:1030:3: ruleStatement
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
    // InternalJSONLanguage.g:1039:1: rule__JSONLanguage__StatementAssignment_1_1_1 : ( ruleStatement ) ;
    public final void rule__JSONLanguage__StatementAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1043:1: ( ( ruleStatement ) )
            // InternalJSONLanguage.g:1044:2: ( ruleStatement )
            {
            // InternalJSONLanguage.g:1044:2: ( ruleStatement )
            // InternalJSONLanguage.g:1045:3: ruleStatement
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
    // InternalJSONLanguage.g:1054:1: rule__Statement__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Statement__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1058:1: ( ( RULE_STRING ) )
            // InternalJSONLanguage.g:1059:2: ( RULE_STRING )
            {
            // InternalJSONLanguage.g:1059:2: ( RULE_STRING )
            // InternalJSONLanguage.g:1060:3: RULE_STRING
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
    // InternalJSONLanguage.g:1069:1: rule__Statement__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Statement__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1073:1: ( ( ruleValue ) )
            // InternalJSONLanguage.g:1074:2: ( ruleValue )
            {
            // InternalJSONLanguage.g:1074:2: ( ruleValue )
            // InternalJSONLanguage.g:1075:3: ruleValue
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
    // InternalJSONLanguage.g:1084:1: rule__Array__ValueAssignment_1_0 : ( ruleValue ) ;
    public final void rule__Array__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1088:1: ( ( ruleValue ) )
            // InternalJSONLanguage.g:1089:2: ( ruleValue )
            {
            // InternalJSONLanguage.g:1089:2: ( ruleValue )
            // InternalJSONLanguage.g:1090:3: ruleValue
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
    // InternalJSONLanguage.g:1099:1: rule__Array__ValueAssignment_1_1_1 : ( ruleValue ) ;
    public final void rule__Array__ValueAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSONLanguage.g:1103:1: ( ( ruleValue ) )
            // InternalJSONLanguage.g:1104:2: ( ruleValue )
            {
            // InternalJSONLanguage.g:1104:2: ( ruleValue )
            // InternalJSONLanguage.g:1105:3: ruleValue
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000D13830L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000F13830L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C00020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001400020L});

}