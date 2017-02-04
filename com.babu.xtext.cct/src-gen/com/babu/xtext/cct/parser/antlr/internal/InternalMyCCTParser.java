package com.babu.xtext.cct.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.babu.xtext.cct.services.MyCCTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyCCTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@FILE('", "')'", "'@FOR('", "'@IF('", "'@VALUE('"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyCCTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyCCTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyCCTParser.tokenNames; }
    public String getGrammarFileName() { return "../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g"; }



     	private MyCCTGrammarAccess grammarAccess;
     	
        public InternalMyCCTParser(TokenStream input, MyCCTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CCT";	
       	}
       	
       	@Override
       	protected MyCCTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCCT"
    // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:67:1: entryRuleCCT returns [EObject current=null] : iv_ruleCCT= ruleCCT EOF ;
    public final EObject entryRuleCCT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCCT = null;


        try {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:68:2: (iv_ruleCCT= ruleCCT EOF )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:69:2: iv_ruleCCT= ruleCCT EOF
            {
             newCompositeNode(grammarAccess.getCCTRule()); 
            pushFollow(FOLLOW_ruleCCT_in_entryRuleCCT75);
            iv_ruleCCT=ruleCCT();

            state._fsp--;

             current =iv_ruleCCT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCCT85); 

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
    // $ANTLR end "entryRuleCCT"


    // $ANTLR start "ruleCCT"
    // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:76:1: ruleCCT returns [EObject current=null] : ( ( (lv_file_0_0= ruleFile ) ) ( (lv_Loop_1_0= ruleLoop ) )* ( (lv_condition_2_0= ruleCondition ) ) ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleCCT() throws RecognitionException {
        EObject current = null;

        EObject lv_file_0_0 = null;

        EObject lv_Loop_1_0 = null;

        EObject lv_condition_2_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:79:28: ( ( ( (lv_file_0_0= ruleFile ) ) ( (lv_Loop_1_0= ruleLoop ) )* ( (lv_condition_2_0= ruleCondition ) ) ( (lv_value_3_0= ruleValue ) ) ) )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:80:1: ( ( (lv_file_0_0= ruleFile ) ) ( (lv_Loop_1_0= ruleLoop ) )* ( (lv_condition_2_0= ruleCondition ) ) ( (lv_value_3_0= ruleValue ) ) )
            {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:80:1: ( ( (lv_file_0_0= ruleFile ) ) ( (lv_Loop_1_0= ruleLoop ) )* ( (lv_condition_2_0= ruleCondition ) ) ( (lv_value_3_0= ruleValue ) ) )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:80:2: ( (lv_file_0_0= ruleFile ) ) ( (lv_Loop_1_0= ruleLoop ) )* ( (lv_condition_2_0= ruleCondition ) ) ( (lv_value_3_0= ruleValue ) )
            {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:80:2: ( (lv_file_0_0= ruleFile ) )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:81:1: (lv_file_0_0= ruleFile )
            {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:81:1: (lv_file_0_0= ruleFile )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:82:3: lv_file_0_0= ruleFile
            {
             
            	        newCompositeNode(grammarAccess.getCCTAccess().getFileFileParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFile_in_ruleCCT131);
            lv_file_0_0=ruleFile();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCCTRule());
            	        }
                   		set(
                   			current, 
                   			"file",
                    		lv_file_0_0, 
                    		"File");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:98:2: ( (lv_Loop_1_0= ruleLoop ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:99:1: (lv_Loop_1_0= ruleLoop )
            	    {
            	    // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:99:1: (lv_Loop_1_0= ruleLoop )
            	    // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:100:3: lv_Loop_1_0= ruleLoop
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCCTAccess().getLoopLoopParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLoop_in_ruleCCT152);
            	    lv_Loop_1_0=ruleLoop();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCCTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Loop",
            	            		lv_Loop_1_0, 
            	            		"Loop");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:116:3: ( (lv_condition_2_0= ruleCondition ) )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:117:1: (lv_condition_2_0= ruleCondition )
            {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:117:1: (lv_condition_2_0= ruleCondition )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:118:3: lv_condition_2_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getCCTAccess().getConditionConditionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleCCT174);
            lv_condition_2_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCCTRule());
            	        }
                   		add(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:134:2: ( (lv_value_3_0= ruleValue ) )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:135:1: (lv_value_3_0= ruleValue )
            {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:135:1: (lv_value_3_0= ruleValue )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:136:3: lv_value_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getCCTAccess().getValueValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleCCT195);
            lv_value_3_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCCTRule());
            	        }
                   		add(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Value");
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
    // $ANTLR end "ruleCCT"


    // $ANTLR start "entryRuleFile"
    // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:160:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:161:2: (iv_ruleFile= ruleFile EOF )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:162:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile231);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile241); 

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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:169:1: ruleFile returns [EObject current=null] : (otherlv_0= '@FILE(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:172:28: ( (otherlv_0= '@FILE(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' ) )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:173:1: (otherlv_0= '@FILE(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:173:1: (otherlv_0= '@FILE(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:173:3: otherlv_0= '@FILE(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleFile278); 

                	newLeafNode(otherlv_0, grammarAccess.getFileAccess().getFILEKeyword_0());
                
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:177:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:178:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:178:1: (lv_name_1_0= RULE_ID )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:179:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFile295); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFileAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFile312); 

                	newLeafNode(otherlv_2, grammarAccess.getFileAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleLoop"
    // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:207:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:208:2: (iv_ruleLoop= ruleLoop EOF )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:209:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_ruleLoop_in_entryRuleLoop348);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoop358); 

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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:216:1: ruleLoop returns [EObject current=null] : (otherlv_0= '@FOR(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:219:28: ( (otherlv_0= '@FOR(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' ) )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:220:1: (otherlv_0= '@FOR(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:220:1: (otherlv_0= '@FOR(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:220:3: otherlv_0= '@FOR(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleLoop395); 

                	newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getFORKeyword_0());
                
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:224:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:225:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:225:1: (lv_name_1_0= RULE_ID )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:226:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLoop412); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLoopAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLoopRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleLoop429); 

                	newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleCondition"
    // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:254:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:255:2: (iv_ruleCondition= ruleCondition EOF )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:256:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition465);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition475); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:263:1: ruleCondition returns [EObject current=null] : (otherlv_0= '@IF(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:266:28: ( (otherlv_0= '@IF(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' ) )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:267:1: (otherlv_0= '@IF(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:267:1: (otherlv_0= '@IF(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:267:3: otherlv_0= '@IF(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleCondition512); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIFKeyword_0());
                
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:271:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:272:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:272:1: (lv_name_1_0= RULE_ID )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:273:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCondition529); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCondition546); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleValue"
    // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:301:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:302:2: (iv_ruleValue= ruleValue EOF )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:303:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue582);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue592); 

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
    // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:310:1: ruleValue returns [EObject current=null] : (otherlv_0= '@VALUE(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:313:28: ( (otherlv_0= '@VALUE(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' ) )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:314:1: (otherlv_0= '@VALUE(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:314:1: (otherlv_0= '@VALUE(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:314:3: otherlv_0= '@VALUE(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleValue629); 

                	newLeafNode(otherlv_0, grammarAccess.getValueAccess().getVALUEKeyword_0());
                
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:318:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:319:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:319:1: (lv_name_1_0= RULE_ID )
            // ../com.babu.xtext.cct/src-gen/com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.g:320:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue646); 

            			newLeafNode(lv_name_1_0, grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleValue663); 

                	newLeafNode(otherlv_2, grammarAccess.getValueAccess().getRightParenthesisKeyword_2());
                

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCCT_in_entryRuleCCT75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCCT85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_ruleCCT131 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleLoop_in_ruleCCT152 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleCCT174 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCCT195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFile278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFile295 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFile312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_entryRuleLoop348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoop358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleLoop395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLoop412 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLoop429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCondition512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCondition529 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCondition546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleValue629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue646 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleValue663 = new BitSet(new long[]{0x0000000000000002L});

}