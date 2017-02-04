package org.xtext.example.java.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.java.services.MyJava1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyJava1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'extends'", "'{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
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


        public InternalMyJava1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyJava1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyJava1Parser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g"; }



     	private MyJava1GrammarAccess grammarAccess;
     	
        public InternalMyJava1Parser(TokenStream input, MyJava1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SmallClass";	
       	}
       	
       	@Override
       	protected MyJava1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSmallClass"
    // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:67:1: entryRuleSmallClass returns [EObject current=null] : iv_ruleSmallClass= ruleSmallClass EOF ;
    public final EObject entryRuleSmallClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallClass = null;


        try {
            // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:68:2: (iv_ruleSmallClass= ruleSmallClass EOF )
            // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:69:2: iv_ruleSmallClass= ruleSmallClass EOF
            {
             newCompositeNode(grammarAccess.getSmallClassRule()); 
            pushFollow(FOLLOW_ruleSmallClass_in_entryRuleSmallClass75);
            iv_ruleSmallClass=ruleSmallClass();

            state._fsp--;

             current =iv_ruleSmallClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallClass85); 

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
    // $ANTLR end "entryRuleSmallClass"


    // $ANTLR start "ruleSmallClass"
    // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:76:1: ruleSmallClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}' ) ;
    public final EObject ruleSmallClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:79:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}' ) )
            // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:80:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}' )
            {
            // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:80:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}' )
            // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:80:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSmallClass122); 

                	newLeafNode(otherlv_0, grammarAccess.getSmallClassAccess().getClassKeyword_0());
                
            // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallClass139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSmallClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:102:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:102:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSmallClass157); 

                        	newLeafNode(otherlv_2, grammarAccess.getSmallClassAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:106:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:107:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:107:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.myjava1/src-gen/org/xtext/example/java/parser/antlr/internal/InternalMyJava1.g:108:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSmallClassRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallClass177); 

                    		newLeafNode(otherlv_3, grammarAccess.getSmallClassAccess().getSuperClassSmallClassCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSmallClass191); 

                	newLeafNode(otherlv_4, grammarAccess.getSmallClassAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSmallClass203); 

                	newLeafNode(otherlv_5, grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSmallClass"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSmallClass_in_entryRuleSmallClass75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallClass85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSmallClass122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallClass139 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleSmallClass157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallClass177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSmallClass191 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSmallClass203 = new BitSet(new long[]{0x0000000000000002L});

}