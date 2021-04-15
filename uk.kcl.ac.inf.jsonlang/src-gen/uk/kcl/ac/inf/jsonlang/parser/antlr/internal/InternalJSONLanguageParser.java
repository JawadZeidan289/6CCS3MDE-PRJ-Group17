package uk.kcl.ac.inf.jsonlang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.kcl.ac.inf.jsonlang.services.JSONLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSONLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", "'null'", "'-'", "'.'", "'E'", "'e'", "'+'"
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

        public InternalJSONLanguageParser(TokenStream input, JSONLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "jSONLanguage";
       	}

       	@Override
       	protected JSONLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulejSONLanguage"
    // InternalJSONLanguage.g:64:1: entryRulejSONLanguage returns [EObject current=null] : iv_rulejSONLanguage= rulejSONLanguage EOF ;
    public final EObject entryRulejSONLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejSONLanguage = null;


        try {
            // InternalJSONLanguage.g:64:53: (iv_rulejSONLanguage= rulejSONLanguage EOF )
            // InternalJSONLanguage.g:65:2: iv_rulejSONLanguage= rulejSONLanguage EOF
            {
             newCompositeNode(grammarAccess.getJSONLanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulejSONLanguage=rulejSONLanguage();

            state._fsp--;

             current =iv_rulejSONLanguage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulejSONLanguage"


    // $ANTLR start "rulejSONLanguage"
    // InternalJSONLanguage.g:71:1: rulejSONLanguage returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_statement_1_0= ruleStatement ) ) (otherlv_2= ',' ( (lv_statement_3_0= ruleStatement ) ) )* )? otherlv_4= '}' ) ;
    public final EObject rulejSONLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statement_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalJSONLanguage.g:77:2: ( (otherlv_0= '{' ( ( (lv_statement_1_0= ruleStatement ) ) (otherlv_2= ',' ( (lv_statement_3_0= ruleStatement ) ) )* )? otherlv_4= '}' ) )
            // InternalJSONLanguage.g:78:2: (otherlv_0= '{' ( ( (lv_statement_1_0= ruleStatement ) ) (otherlv_2= ',' ( (lv_statement_3_0= ruleStatement ) ) )* )? otherlv_4= '}' )
            {
            // InternalJSONLanguage.g:78:2: (otherlv_0= '{' ( ( (lv_statement_1_0= ruleStatement ) ) (otherlv_2= ',' ( (lv_statement_3_0= ruleStatement ) ) )* )? otherlv_4= '}' )
            // InternalJSONLanguage.g:79:3: otherlv_0= '{' ( ( (lv_statement_1_0= ruleStatement ) ) (otherlv_2= ',' ( (lv_statement_3_0= ruleStatement ) ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJSONLanguageAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalJSONLanguage.g:83:3: ( ( (lv_statement_1_0= ruleStatement ) ) (otherlv_2= ',' ( (lv_statement_3_0= ruleStatement ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalJSONLanguage.g:84:4: ( (lv_statement_1_0= ruleStatement ) ) (otherlv_2= ',' ( (lv_statement_3_0= ruleStatement ) ) )*
                    {
                    // InternalJSONLanguage.g:84:4: ( (lv_statement_1_0= ruleStatement ) )
                    // InternalJSONLanguage.g:85:5: (lv_statement_1_0= ruleStatement )
                    {
                    // InternalJSONLanguage.g:85:5: (lv_statement_1_0= ruleStatement )
                    // InternalJSONLanguage.g:86:6: lv_statement_1_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getJSONLanguageAccess().getStatementStatementParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_statement_1_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJSONLanguageRule());
                    						}
                    						add(
                    							current,
                    							"statement",
                    							lv_statement_1_0,
                    							"uk.kcl.ac.inf.jsonlang.JSONLanguage.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJSONLanguage.g:103:4: (otherlv_2= ',' ( (lv_statement_3_0= ruleStatement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalJSONLanguage.g:104:5: otherlv_2= ',' ( (lv_statement_3_0= ruleStatement ) )
                    	    {
                    	    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getJSONLanguageAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalJSONLanguage.g:108:5: ( (lv_statement_3_0= ruleStatement ) )
                    	    // InternalJSONLanguage.g:109:6: (lv_statement_3_0= ruleStatement )
                    	    {
                    	    // InternalJSONLanguage.g:109:6: (lv_statement_3_0= ruleStatement )
                    	    // InternalJSONLanguage.g:110:7: lv_statement_3_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getJSONLanguageAccess().getStatementStatementParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_statement_3_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJSONLanguageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statement",
                    	    								lv_statement_3_0,
                    	    								"uk.kcl.ac.inf.jsonlang.JSONLanguage.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJSONLanguageAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulejSONLanguage"


    // $ANTLR start "entryRuleStatement"
    // InternalJSONLanguage.g:137:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalJSONLanguage.g:137:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalJSONLanguage.g:138:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalJSONLanguage.g:144:1: ruleStatement returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalJSONLanguage.g:150:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalJSONLanguage.g:151:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalJSONLanguage.g:151:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // InternalJSONLanguage.g:152:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalJSONLanguage.g:152:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalJSONLanguage.g:153:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalJSONLanguage.g:153:4: (lv_key_0_0= RULE_STRING )
            // InternalJSONLanguage.g:154:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_key_0_0, grammarAccess.getStatementAccess().getKeySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_1());
            		
            // InternalJSONLanguage.g:174:3: ( (lv_value_2_0= ruleValue ) )
            // InternalJSONLanguage.g:175:4: (lv_value_2_0= ruleValue )
            {
            // InternalJSONLanguage.g:175:4: (lv_value_2_0= ruleValue )
            // InternalJSONLanguage.g:176:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"uk.kcl.ac.inf.jsonlang.JSONLanguage.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleValue"
    // InternalJSONLanguage.g:197:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalJSONLanguage.g:197:46: (iv_ruleValue= ruleValue EOF )
            // InternalJSONLanguage.g:198:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalJSONLanguage.g:204:1: ruleValue returns [EObject current=null] : (this_jSONLanguage_0= rulejSONLanguage | this_Array_1= ruleArray | this_STRING_2= RULE_STRING | ruleNumber | ruleBoolean | ruleNull ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token this_STRING_2=null;
        EObject this_jSONLanguage_0 = null;

        EObject this_Array_1 = null;



        	enterRule();

        try {
            // InternalJSONLanguage.g:210:2: ( (this_jSONLanguage_0= rulejSONLanguage | this_Array_1= ruleArray | this_STRING_2= RULE_STRING | ruleNumber | ruleBoolean | ruleNull ) )
            // InternalJSONLanguage.g:211:2: (this_jSONLanguage_0= rulejSONLanguage | this_Array_1= ruleArray | this_STRING_2= RULE_STRING | ruleNumber | ruleBoolean | ruleNull )
            {
            // InternalJSONLanguage.g:211:2: (this_jSONLanguage_0= rulejSONLanguage | this_Array_1= ruleArray | this_STRING_2= RULE_STRING | ruleNumber | ruleBoolean | ruleNull )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            case RULE_INT:
            case 20:
            case 21:
                {
                alt3=4;
                }
                break;
            case 17:
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalJSONLanguage.g:212:3: this_jSONLanguage_0= rulejSONLanguage
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getJSONLanguageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_jSONLanguage_0=rulejSONLanguage();

                    state._fsp--;


                    			current = this_jSONLanguage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJSONLanguage.g:221:3: this_Array_1= ruleArray
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getArrayParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Array_1=ruleArray();

                    state._fsp--;


                    			current = this_Array_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJSONLanguage.g:230:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_2, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalJSONLanguage.g:235:3: ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNumberParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJSONLanguage.g:243:3: ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJSONLanguage.g:251:3: ruleNull
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNullParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    ruleNull();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleArray"
    // InternalJSONLanguage.g:262:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalJSONLanguage.g:262:46: (iv_ruleArray= ruleArray EOF )
            // InternalJSONLanguage.g:263:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalJSONLanguage.g:269:1: ruleArray returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* )? otherlv_4= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalJSONLanguage.g:275:2: ( (otherlv_0= '[' ( ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* )? otherlv_4= ']' ) )
            // InternalJSONLanguage.g:276:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* )? otherlv_4= ']' )
            {
            // InternalJSONLanguage.g:276:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* )? otherlv_4= ']' )
            // InternalJSONLanguage.g:277:3: otherlv_0= '[' ( ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalJSONLanguage.g:281:3: ( ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_INT)||LA5_0==11||LA5_0==15||(LA5_0>=17 && LA5_0<=21)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJSONLanguage.g:282:4: ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )*
                    {
                    // InternalJSONLanguage.g:282:4: ( (lv_value_1_0= ruleValue ) )
                    // InternalJSONLanguage.g:283:5: (lv_value_1_0= ruleValue )
                    {
                    // InternalJSONLanguage.g:283:5: (lv_value_1_0= ruleValue )
                    // InternalJSONLanguage.g:284:6: lv_value_1_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getArrayAccess().getValueValueParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_value_1_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"uk.kcl.ac.inf.jsonlang.JSONLanguage.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJSONLanguage.g:301:4: (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==12) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalJSONLanguage.g:302:5: otherlv_2= ',' ( (lv_value_3_0= ruleValue ) )
                    	    {
                    	    otherlv_2=(Token)match(input,12,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalJSONLanguage.g:306:5: ( (lv_value_3_0= ruleValue ) )
                    	    // InternalJSONLanguage.g:307:6: (lv_value_3_0= ruleValue )
                    	    {
                    	    // InternalJSONLanguage.g:307:6: (lv_value_3_0= ruleValue )
                    	    // InternalJSONLanguage.g:308:7: lv_value_3_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayAccess().getValueValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_value_3_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_3_0,
                    	    								"uk.kcl.ac.inf.jsonlang.JSONLanguage.Value");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleBoolean"
    // InternalJSONLanguage.g:335:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalJSONLanguage.g:335:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalJSONLanguage.g:336:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalJSONLanguage.g:342:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJSONLanguage.g:348:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalJSONLanguage.g:349:2: (kw= 'true' | kw= 'false' )
            {
            // InternalJSONLanguage.g:349:2: (kw= 'true' | kw= 'false' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalJSONLanguage.g:350:3: kw= 'true'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJSONLanguage.g:356:3: kw= 'false'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleNull"
    // InternalJSONLanguage.g:365:1: entryRuleNull returns [String current=null] : iv_ruleNull= ruleNull EOF ;
    public final String entryRuleNull() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNull = null;


        try {
            // InternalJSONLanguage.g:365:44: (iv_ruleNull= ruleNull EOF )
            // InternalJSONLanguage.g:366:2: iv_ruleNull= ruleNull EOF
            {
             newCompositeNode(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNull=ruleNull();

            state._fsp--;

             current =iv_ruleNull.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // InternalJSONLanguage.g:372:1: ruleNull returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'null' ;
    public final AntlrDatatypeRuleToken ruleNull() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJSONLanguage.g:378:2: (kw= 'null' )
            // InternalJSONLanguage.g:379:2: kw= 'null'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getNullAccess().getNullKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNull"


    // $ANTLR start "entryRuleNumber"
    // InternalJSONLanguage.g:387:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalJSONLanguage.g:389:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalJSONLanguage.g:390:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalJSONLanguage.g:399:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_8=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalJSONLanguage.g:406:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT )? ) )
            // InternalJSONLanguage.g:407:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT )? )
            {
            // InternalJSONLanguage.g:407:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT )? )
            // InternalJSONLanguage.g:408:3: (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT )?
            {
            // InternalJSONLanguage.g:408:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJSONLanguage.g:409:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalJSONLanguage.g:415:3: (this_INT_1= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_INT||LA8_1==21) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalJSONLanguage.g:416:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_10); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalJSONLanguage.g:424:3: (kw= '.' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJSONLanguage.g:425:4: kw= '.'
                    {
                    kw=(Token)match(input,21,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_2());
                    			

                    }
                    break;

            }

            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getNumberAccess().getINTTerminalRuleCall_3());
            		
            // InternalJSONLanguage.g:438:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=22 && LA13_0<=23)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJSONLanguage.g:439:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT
                    {
                    // InternalJSONLanguage.g:439:4: (kw= 'E' | kw= 'e' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==23) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalJSONLanguage.g:440:5: kw= 'E'
                            {
                            kw=(Token)match(input,22,FOLLOW_13); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalJSONLanguage.g:446:5: kw= 'e'
                            {
                            kw=(Token)match(input,23,FOLLOW_13); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalJSONLanguage.g:452:4: (kw= '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==20) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalJSONLanguage.g:453:5: kw= '-'
                            {
                            kw=(Token)match(input,20,FOLLOW_14); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    // InternalJSONLanguage.g:459:4: (kw= '+' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==24) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalJSONLanguage.g:460:5: kw= '+'
                            {
                            kw=(Token)match(input,24,FOLLOW_11); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getPlusSignKeyword_4_2());
                            				

                            }
                            break;

                    }

                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_8);
                    			

                    				newLeafNode(this_INT_8, grammarAccess.getNumberAccess().getINTTerminalRuleCall_4_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000003E8830L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003F8830L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001100020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000020L});

}