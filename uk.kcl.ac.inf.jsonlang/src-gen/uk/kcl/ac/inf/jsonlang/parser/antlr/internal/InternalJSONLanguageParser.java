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
    // InternalJSONLanguage.g:204:1: ruleValue returns [EObject current=null] : (this_jSONLanguage_0= rulejSONLanguage | this_Array_1= ruleArray | this_Text_2= ruleText | this_Number_3= ruleNumber | this_Boolean_4= ruleBoolean | this_Null_5= ruleNull ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_jSONLanguage_0 = null;

        EObject this_Array_1 = null;

        EObject this_Text_2 = null;

        EObject this_Number_3 = null;

        EObject this_Boolean_4 = null;

        EObject this_Null_5 = null;



        	enterRule();

        try {
            // InternalJSONLanguage.g:210:2: ( (this_jSONLanguage_0= rulejSONLanguage | this_Array_1= ruleArray | this_Text_2= ruleText | this_Number_3= ruleNumber | this_Boolean_4= ruleBoolean | this_Null_5= ruleNull ) )
            // InternalJSONLanguage.g:211:2: (this_jSONLanguage_0= rulejSONLanguage | this_Array_1= ruleArray | this_Text_2= ruleText | this_Number_3= ruleNumber | this_Boolean_4= ruleBoolean | this_Null_5= ruleNull )
            {
            // InternalJSONLanguage.g:211:2: (this_jSONLanguage_0= rulejSONLanguage | this_Array_1= ruleArray | this_Text_2= ruleText | this_Number_3= ruleNumber | this_Boolean_4= ruleBoolean | this_Null_5= ruleNull )
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
                    // InternalJSONLanguage.g:230:3: this_Text_2= ruleText
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getTextParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_2=ruleText();

                    state._fsp--;


                    			current = this_Text_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJSONLanguage.g:239:3: this_Number_3= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNumberParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_3=ruleNumber();

                    state._fsp--;


                    			current = this_Number_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJSONLanguage.g:248:3: this_Boolean_4= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_4=ruleBoolean();

                    state._fsp--;


                    			current = this_Boolean_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJSONLanguage.g:257:3: this_Null_5= ruleNull
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNullParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Null_5=ruleNull();

                    state._fsp--;


                    			current = this_Null_5;
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
    // InternalJSONLanguage.g:269:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalJSONLanguage.g:269:46: (iv_ruleArray= ruleArray EOF )
            // InternalJSONLanguage.g:270:2: iv_ruleArray= ruleArray EOF
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
    // InternalJSONLanguage.g:276:1: ruleArray returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* )? otherlv_4= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalJSONLanguage.g:282:2: ( (otherlv_0= '[' ( ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* )? otherlv_4= ']' ) )
            // InternalJSONLanguage.g:283:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* )? otherlv_4= ']' )
            {
            // InternalJSONLanguage.g:283:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* )? otherlv_4= ']' )
            // InternalJSONLanguage.g:284:3: otherlv_0= '[' ( ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalJSONLanguage.g:288:3: ( ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_INT)||LA5_0==11||LA5_0==15||(LA5_0>=17 && LA5_0<=21)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJSONLanguage.g:289:4: ( (lv_value_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )*
                    {
                    // InternalJSONLanguage.g:289:4: ( (lv_value_1_0= ruleValue ) )
                    // InternalJSONLanguage.g:290:5: (lv_value_1_0= ruleValue )
                    {
                    // InternalJSONLanguage.g:290:5: (lv_value_1_0= ruleValue )
                    // InternalJSONLanguage.g:291:6: lv_value_1_0= ruleValue
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

                    // InternalJSONLanguage.g:308:4: (otherlv_2= ',' ( (lv_value_3_0= ruleValue ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==12) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalJSONLanguage.g:309:5: otherlv_2= ',' ( (lv_value_3_0= ruleValue ) )
                    	    {
                    	    otherlv_2=(Token)match(input,12,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalJSONLanguage.g:313:5: ( (lv_value_3_0= ruleValue ) )
                    	    // InternalJSONLanguage.g:314:6: (lv_value_3_0= ruleValue )
                    	    {
                    	    // InternalJSONLanguage.g:314:6: (lv_value_3_0= ruleValue )
                    	    // InternalJSONLanguage.g:315:7: lv_value_3_0= ruleValue
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


    // $ANTLR start "entryRuleText"
    // InternalJSONLanguage.g:342:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalJSONLanguage.g:342:45: (iv_ruleText= ruleText EOF )
            // InternalJSONLanguage.g:343:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalJSONLanguage.g:349:1: ruleText returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalJSONLanguage.g:355:2: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalJSONLanguage.g:356:2: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalJSONLanguage.g:356:2: ( (lv_val_0_0= RULE_STRING ) )
            // InternalJSONLanguage.g:357:3: (lv_val_0_0= RULE_STRING )
            {
            // InternalJSONLanguage.g:357:3: (lv_val_0_0= RULE_STRING )
            // InternalJSONLanguage.g:358:4: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getTextAccess().getValSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleBoolean"
    // InternalJSONLanguage.g:377:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalJSONLanguage.g:377:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalJSONLanguage.g:378:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
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
    // InternalJSONLanguage.g:384:1: ruleBoolean returns [EObject current=null] : ( ( (lv_val_0_0= 'true' ) ) | otherlv_1= 'false' ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJSONLanguage.g:390:2: ( ( ( (lv_val_0_0= 'true' ) ) | otherlv_1= 'false' ) )
            // InternalJSONLanguage.g:391:2: ( ( (lv_val_0_0= 'true' ) ) | otherlv_1= 'false' )
            {
            // InternalJSONLanguage.g:391:2: ( ( (lv_val_0_0= 'true' ) ) | otherlv_1= 'false' )
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
                    // InternalJSONLanguage.g:392:3: ( (lv_val_0_0= 'true' ) )
                    {
                    // InternalJSONLanguage.g:392:3: ( (lv_val_0_0= 'true' ) )
                    // InternalJSONLanguage.g:393:4: (lv_val_0_0= 'true' )
                    {
                    // InternalJSONLanguage.g:393:4: (lv_val_0_0= 'true' )
                    // InternalJSONLanguage.g:394:5: lv_val_0_0= 'true'
                    {
                    lv_val_0_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_val_0_0, grammarAccess.getBooleanAccess().getValTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJSONLanguage.g:407:3: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                    		

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
    // InternalJSONLanguage.g:415:1: entryRuleNull returns [EObject current=null] : iv_ruleNull= ruleNull EOF ;
    public final EObject entryRuleNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNull = null;


        try {
            // InternalJSONLanguage.g:415:45: (iv_ruleNull= ruleNull EOF )
            // InternalJSONLanguage.g:416:2: iv_ruleNull= ruleNull EOF
            {
             newCompositeNode(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNull=ruleNull();

            state._fsp--;

             current =iv_ruleNull; 
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
    // InternalJSONLanguage.g:422:1: ruleNull returns [EObject current=null] : ( (lv_val_0_0= 'null' ) ) ;
    public final EObject ruleNull() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalJSONLanguage.g:428:2: ( ( (lv_val_0_0= 'null' ) ) )
            // InternalJSONLanguage.g:429:2: ( (lv_val_0_0= 'null' ) )
            {
            // InternalJSONLanguage.g:429:2: ( (lv_val_0_0= 'null' ) )
            // InternalJSONLanguage.g:430:3: (lv_val_0_0= 'null' )
            {
            // InternalJSONLanguage.g:430:3: (lv_val_0_0= 'null' )
            // InternalJSONLanguage.g:431:4: lv_val_0_0= 'null'
            {
            lv_val_0_0=(Token)match(input,19,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getNullAccess().getValNullKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNullRule());
            				}
            				setWithLastConsumed(current, "val", lv_val_0_0, "null");
            			

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
    // $ANTLR end "ruleNull"


    // $ANTLR start "entryRuleNumber"
    // InternalJSONLanguage.g:446:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalJSONLanguage.g:446:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalJSONLanguage.g:447:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalJSONLanguage.g:453:1: ruleNumber returns [EObject current=null] : (this_IntNumber_0= ruleIntNumber | this_ComplexNumber_1= ruleComplexNumber ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        EObject this_IntNumber_0 = null;

        EObject this_ComplexNumber_1 = null;



        	enterRule();

        try {
            // InternalJSONLanguage.g:459:2: ( (this_IntNumber_0= ruleIntNumber | this_ComplexNumber_1= ruleComplexNumber ) )
            // InternalJSONLanguage.g:460:2: (this_IntNumber_0= ruleIntNumber | this_ComplexNumber_1= ruleComplexNumber )
            {
            // InternalJSONLanguage.g:460:2: (this_IntNumber_0= ruleIntNumber | this_ComplexNumber_1= ruleComplexNumber )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalJSONLanguage.g:461:3: this_IntNumber_0= ruleIntNumber
                    {

                    			newCompositeNode(grammarAccess.getNumberAccess().getIntNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntNumber_0=ruleIntNumber();

                    state._fsp--;


                    			current = this_IntNumber_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJSONLanguage.g:470:3: this_ComplexNumber_1= ruleComplexNumber
                    {

                    			newCompositeNode(grammarAccess.getNumberAccess().getComplexNumberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexNumber_1=ruleComplexNumber();

                    state._fsp--;


                    			current = this_ComplexNumber_1;
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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleIntNumber"
    // InternalJSONLanguage.g:482:1: entryRuleIntNumber returns [EObject current=null] : iv_ruleIntNumber= ruleIntNumber EOF ;
    public final EObject entryRuleIntNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntNumber = null;


        try {
            // InternalJSONLanguage.g:482:50: (iv_ruleIntNumber= ruleIntNumber EOF )
            // InternalJSONLanguage.g:483:2: iv_ruleIntNumber= ruleIntNumber EOF
            {
             newCompositeNode(grammarAccess.getIntNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntNumber=ruleIntNumber();

            state._fsp--;

             current =iv_ruleIntNumber; 
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
    // $ANTLR end "entryRuleIntNumber"


    // $ANTLR start "ruleIntNumber"
    // InternalJSONLanguage.g:489:1: ruleIntNumber returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntNumber() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalJSONLanguage.g:495:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalJSONLanguage.g:496:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalJSONLanguage.g:496:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalJSONLanguage.g:497:3: (lv_val_0_0= RULE_INT )
            {
            // InternalJSONLanguage.g:497:3: (lv_val_0_0= RULE_INT )
            // InternalJSONLanguage.g:498:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntNumberAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntNumber"


    // $ANTLR start "entryRuleComplexNumber"
    // InternalJSONLanguage.g:517:1: entryRuleComplexNumber returns [EObject current=null] : iv_ruleComplexNumber= ruleComplexNumber EOF ;
    public final EObject entryRuleComplexNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexNumber = null;


        try {
            // InternalJSONLanguage.g:517:54: (iv_ruleComplexNumber= ruleComplexNumber EOF )
            // InternalJSONLanguage.g:518:2: iv_ruleComplexNumber= ruleComplexNumber EOF
            {
             newCompositeNode(grammarAccess.getComplexNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexNumber=ruleComplexNumber();

            state._fsp--;

             current =iv_ruleComplexNumber; 
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
    // $ANTLR end "entryRuleComplexNumber"


    // $ANTLR start "ruleComplexNumber"
    // InternalJSONLanguage.g:524:1: ruleComplexNumber returns [EObject current=null] : ( (lv_val_0_0= ruleCOMPLEX ) ) ;
    public final EObject ruleComplexNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalJSONLanguage.g:530:2: ( ( (lv_val_0_0= ruleCOMPLEX ) ) )
            // InternalJSONLanguage.g:531:2: ( (lv_val_0_0= ruleCOMPLEX ) )
            {
            // InternalJSONLanguage.g:531:2: ( (lv_val_0_0= ruleCOMPLEX ) )
            // InternalJSONLanguage.g:532:3: (lv_val_0_0= ruleCOMPLEX )
            {
            // InternalJSONLanguage.g:532:3: (lv_val_0_0= ruleCOMPLEX )
            // InternalJSONLanguage.g:533:4: lv_val_0_0= ruleCOMPLEX
            {

            				newCompositeNode(grammarAccess.getComplexNumberAccess().getValCOMPLEXParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleCOMPLEX();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getComplexNumberRule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"uk.kcl.ac.inf.jsonlang.JSONLanguage.COMPLEX");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleComplexNumber"


    // $ANTLR start "entryRuleCOMPLEX"
    // InternalJSONLanguage.g:553:1: entryRuleCOMPLEX returns [String current=null] : iv_ruleCOMPLEX= ruleCOMPLEX EOF ;
    public final String entryRuleCOMPLEX() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMPLEX = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalJSONLanguage.g:555:2: (iv_ruleCOMPLEX= ruleCOMPLEX EOF )
            // InternalJSONLanguage.g:556:2: iv_ruleCOMPLEX= ruleCOMPLEX EOF
            {
             newCompositeNode(grammarAccess.getCOMPLEXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOMPLEX=ruleCOMPLEX();

            state._fsp--;

             current =iv_ruleCOMPLEX.getText(); 
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
    // $ANTLR end "entryRuleCOMPLEX"


    // $ANTLR start "ruleCOMPLEX"
    // InternalJSONLanguage.g:565:1: ruleCOMPLEX returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleCOMPLEX() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_8=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalJSONLanguage.g:572:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT )? ) )
            // InternalJSONLanguage.g:573:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT )? )
            {
            // InternalJSONLanguage.g:573:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT )? )
            // InternalJSONLanguage.g:574:3: (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT )?
            {
            // InternalJSONLanguage.g:574:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJSONLanguage.g:575:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCOMPLEXAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalJSONLanguage.g:581:3: (this_INT_1= RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_INT||LA9_1==21) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalJSONLanguage.g:582:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_10); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getCOMPLEXAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalJSONLanguage.g:590:3: (kw= '.' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJSONLanguage.g:591:4: kw= '.'
                    {
                    kw=(Token)match(input,21,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCOMPLEXAccess().getFullStopKeyword_2());
                    			

                    }
                    break;

            }

            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getCOMPLEXAccess().getINTTerminalRuleCall_3());
            		
            // InternalJSONLanguage.g:604:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=22 && LA14_0<=23)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJSONLanguage.g:605:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? (kw= '+' )? this_INT_8= RULE_INT
                    {
                    // InternalJSONLanguage.g:605:4: (kw= 'E' | kw= 'e' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==23) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalJSONLanguage.g:606:5: kw= 'E'
                            {
                            kw=(Token)match(input,22,FOLLOW_13); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getCOMPLEXAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalJSONLanguage.g:612:5: kw= 'e'
                            {
                            kw=(Token)match(input,23,FOLLOW_13); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getCOMPLEXAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalJSONLanguage.g:618:4: (kw= '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==20) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalJSONLanguage.g:619:5: kw= '-'
                            {
                            kw=(Token)match(input,20,FOLLOW_14); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getCOMPLEXAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    // InternalJSONLanguage.g:625:4: (kw= '+' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==24) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalJSONLanguage.g:626:5: kw= '+'
                            {
                            kw=(Token)match(input,24,FOLLOW_11); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getCOMPLEXAccess().getPlusSignKeyword_4_2());
                            				

                            }
                            break;

                    }

                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_8);
                    			

                    				newLeafNode(this_INT_8, grammarAccess.getCOMPLEXAccess().getINTTerminalRuleCall_4_3());
                    			

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
    // $ANTLR end "ruleCOMPLEX"

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