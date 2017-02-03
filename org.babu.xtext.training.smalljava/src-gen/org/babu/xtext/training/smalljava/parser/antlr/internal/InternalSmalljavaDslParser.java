package org.babu.xtext.training.smalljava.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.babu.xtext.training.smalljava.services.SmalljavaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmalljavaDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'.'", "'*'", "'import'", "'class'", "'extends'", "'{'", "'}'", "'[]'", "'String'", "'boolean'", "'int'", "'float'"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSmalljavaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmalljavaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmalljavaDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g"; }



     	private SmalljavaDslGrammarAccess grammarAccess;
     	
        public InternalSmalljavaDslParser(TokenStream input, SmalljavaDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "NameSpace";	
       	}
       	
       	@Override
       	protected SmalljavaDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNameSpace"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:67:1: entryRuleNameSpace returns [EObject current=null] : iv_ruleNameSpace= ruleNameSpace EOF ;
    public final EObject entryRuleNameSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameSpace = null;


        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:68:2: (iv_ruleNameSpace= ruleNameSpace EOF )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:69:2: iv_ruleNameSpace= ruleNameSpace EOF
            {
             newCompositeNode(grammarAccess.getNameSpaceRule()); 
            pushFollow(FOLLOW_ruleNameSpace_in_entryRuleNameSpace75);
            iv_ruleNameSpace=ruleNameSpace();

            state._fsp--;

             current =iv_ruleNameSpace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameSpace85); 

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
    // $ANTLR end "entryRuleNameSpace"


    // $ANTLR start "ruleNameSpace"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:76:1: ruleNameSpace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallClass_3_0= ruleSmallClass ) ) ) ;
    public final EObject ruleNameSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_smallClass_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:79:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallClass_3_0= ruleSmallClass ) ) ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:80:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallClass_3_0= ruleSmallClass ) ) )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:80:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallClass_3_0= ruleSmallClass ) ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:80:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallClass_3_0= ruleSmallClass ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleNameSpace122); 

                	newLeafNode(otherlv_0, grammarAccess.getNameSpaceAccess().getNamespaceKeyword_0());
                
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:84:1: ( (lv_name_1_0= ruleQName ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:85:1: (lv_name_1_0= ruleQName )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:85:1: (lv_name_1_0= ruleQName )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:86:3: lv_name_1_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getNameSpaceAccess().getNameQNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleNameSpace143);
            lv_name_1_0=ruleQName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNameSpaceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:102:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNameSpaceAccess().getImportsImportParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleNameSpace164);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNameSpaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:120:3: ( (lv_smallClass_3_0= ruleSmallClass ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:121:1: (lv_smallClass_3_0= ruleSmallClass )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:121:1: (lv_smallClass_3_0= ruleSmallClass )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:122:3: lv_smallClass_3_0= ruleSmallClass
            {
             
            	        newCompositeNode(grammarAccess.getNameSpaceAccess().getSmallClassSmallClassParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSmallClass_in_ruleNameSpace186);
            lv_smallClass_3_0=ruleSmallClass();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNameSpaceRule());
            	        }
                   		set(
                   			current, 
                   			"smallClass",
                    		lv_smallClass_3_0, 
                    		"SmallClass");
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
    // $ANTLR end "ruleNameSpace"


    // $ANTLR start "entryRuleQName"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:146:1: entryRuleQName returns [String current=null] : iv_ruleQName= ruleQName EOF ;
    public final String entryRuleQName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQName = null;


        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:147:2: (iv_ruleQName= ruleQName EOF )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:148:2: iv_ruleQName= ruleQName EOF
            {
             newCompositeNode(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_ruleQName_in_entryRuleQName223);
            iv_ruleQName=ruleQName();

            state._fsp--;

             current =iv_ruleQName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQName234); 

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
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:155:1: ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:158:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:159:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:159:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:159:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQName274); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:166:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:167:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQName293); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQName308); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleQNameWildCard"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:187:1: entryRuleQNameWildCard returns [String current=null] : iv_ruleQNameWildCard= ruleQNameWildCard EOF ;
    public final String entryRuleQNameWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQNameWildCard = null;


        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:188:2: (iv_ruleQNameWildCard= ruleQNameWildCard EOF )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:189:2: iv_ruleQNameWildCard= ruleQNameWildCard EOF
            {
             newCompositeNode(grammarAccess.getQNameWildCardRule()); 
            pushFollow(FOLLOW_ruleQNameWildCard_in_entryRuleQNameWildCard356);
            iv_ruleQNameWildCard=ruleQNameWildCard();

            state._fsp--;

             current =iv_ruleQNameWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNameWildCard367); 

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
    // $ANTLR end "entryRuleQNameWildCard"


    // $ANTLR start "ruleQNameWildCard"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:196:1: ruleQNameWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QName_0= ruleQName (kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQNameWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QName_0 = null;


         enterRule(); 
            
        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:199:28: ( (this_QName_0= ruleQName (kw= '*' )? ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:200:1: (this_QName_0= ruleQName (kw= '*' )? )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:200:1: (this_QName_0= ruleQName (kw= '*' )? )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:201:5: this_QName_0= ruleQName (kw= '*' )?
            {
             
                    newCompositeNode(grammarAccess.getQNameWildCardAccess().getQNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQName_in_ruleQNameWildCard414);
            this_QName_0=ruleQName();

            state._fsp--;


            		current.merge(this_QName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:211:1: (kw= '*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:212:2: kw= '*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQNameWildCard433); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQNameWildCardAccess().getAsteriskKeyword_1()); 
                        

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
        }
        return current;
    }
    // $ANTLR end "ruleQNameWildCard"


    // $ANTLR start "entryRuleImport"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:225:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:226:2: (iv_ruleImport= ruleImport EOF )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:227:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport475);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport485); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:234:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:237:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWildCard ) ) ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:238:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWildCard ) ) )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:238:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWildCard ) ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:238:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQNameWildCard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport522); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:242:1: ( (lv_importedNamespace_1_0= ruleQNameWildCard ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:243:1: (lv_importedNamespace_1_0= ruleQNameWildCard )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:243:1: (lv_importedNamespace_1_0= ruleQNameWildCard )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:244:3: lv_importedNamespace_1_0= ruleQNameWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQNameWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQNameWildCard_in_ruleImport543);
            lv_importedNamespace_1_0=ruleQNameWildCard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QNameWildCard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleSmallClass"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:268:1: entryRuleSmallClass returns [EObject current=null] : iv_ruleSmallClass= ruleSmallClass EOF ;
    public final EObject entryRuleSmallClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallClass = null;


        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:269:2: (iv_ruleSmallClass= ruleSmallClass EOF )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:270:2: iv_ruleSmallClass= ruleSmallClass EOF
            {
             newCompositeNode(grammarAccess.getSmallClassRule()); 
            pushFollow(FOLLOW_ruleSmallClass_in_entryRuleSmallClass579);
            iv_ruleSmallClass=ruleSmallClass();

            state._fsp--;

             current =iv_ruleSmallClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallClass589); 

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
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:277:1: ruleSmallClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleSmallClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:280:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:281:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:281:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:281:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSmallClass626); 

                	newLeafNode(otherlv_0, grammarAccess.getSmallClassAccess().getClassKeyword_0());
                
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:285:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:286:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:286:1: (lv_name_1_0= RULE_ID )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:287:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallClass643); 

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

            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:303:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:303:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSmallClass661); 

                        	newLeafNode(otherlv_2, grammarAccess.getSmallClassAccess().getExtendsKeyword_2_0());
                        
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:307:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:308:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:308:1: (otherlv_3= RULE_ID )
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:309:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSmallClassRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallClass681); 

                    		newLeafNode(otherlv_3, grammarAccess.getSmallClassAccess().getSuperClassSmallClassCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSmallClass695); 

                	newLeafNode(otherlv_4, grammarAccess.getSmallClassAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:324:1: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=20 && LA5_0<=23)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:325:1: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:325:1: (lv_attributes_5_0= ruleAttribute )
            	    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:326:3: lv_attributes_5_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSmallClassAccess().getAttributesAttributeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleSmallClass716);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSmallClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_5_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleSmallClass729); 

                	newLeafNode(otherlv_6, grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleAttribute"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:354:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:355:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:356:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute765);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute775); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:363:1: ruleAttribute returns [EObject current=null] : ( ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_datatype_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:366:28: ( ( ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:367:1: ( ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:367:1: ( ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:367:2: ( (lv_datatype_0_0= ruleDataType ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:367:2: ( (lv_datatype_0_0= ruleDataType ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:368:1: (lv_datatype_0_0= ruleDataType )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:368:1: (lv_datatype_0_0= ruleDataType )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:369:3: lv_datatype_0_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDatatypeDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleAttribute821);
            lv_datatype_0_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"datatype",
                    		lv_datatype_0_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:385:2: ( (lv_array_1_0= '[]' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:386:1: (lv_array_1_0= '[]' )
                    {
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:386:1: (lv_array_1_0= '[]' )
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:387:3: lv_array_1_0= '[]'
                    {
                    lv_array_1_0=(Token)match(input,19,FOLLOW_19_in_ruleAttribute839); 

                            newLeafNode(lv_array_1_0, grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "array", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:400:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:401:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:401:1: (lv_name_2_0= RULE_ID )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:402:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute870); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDataType"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:426:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:427:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:428:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType911);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType921); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:435:1: ruleDataType returns [EObject current=null] : ( ( () rulesimpleType ) | this_smallClassType_2= rulesmallClassType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_smallClassType_2 = null;


         enterRule(); 
            
        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:438:28: ( ( ( () rulesimpleType ) | this_smallClassType_2= rulesmallClassType ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:439:1: ( ( () rulesimpleType ) | this_smallClassType_2= rulesmallClassType )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:439:1: ( ( () rulesimpleType ) | this_smallClassType_2= rulesmallClassType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=20 && LA7_0<=23)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:439:2: ( () rulesimpleType )
                    {
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:439:2: ( () rulesimpleType )
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:439:3: () rulesimpleType
                    {
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:439:3: ()
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:440:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDataTypeAccess().getDataTypeAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getSimpleTypeParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_rulesimpleType_in_ruleDataType972);
                    rulesimpleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:455:5: this_smallClassType_2= rulesmallClassType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getSmallClassTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulesmallClassType_in_ruleDataType1000);
                    this_smallClassType_2=rulesmallClassType();

                    state._fsp--;

                     
                            current = this_smallClassType_2; 
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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRulesimpleType"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:471:1: entryRulesimpleType returns [String current=null] : iv_rulesimpleType= rulesimpleType EOF ;
    public final String entryRulesimpleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesimpleType = null;


        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:472:2: (iv_rulesimpleType= rulesimpleType EOF )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:473:2: iv_rulesimpleType= rulesimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_rulesimpleType_in_entryRulesimpleType1036);
            iv_rulesimpleType=rulesimpleType();

            state._fsp--;

             current =iv_rulesimpleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimpleType1047); 

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
    // $ANTLR end "entryRulesimpleType"


    // $ANTLR start "rulesimpleType"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:480:1: rulesimpleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'float' ) ;
    public final AntlrDatatypeRuleToken rulesimpleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:483:28: ( (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'float' ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:484:1: (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'float' )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:484:1: (kw= 'String' | kw= 'boolean' | kw= 'int' | kw= 'float' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:485:2: kw= 'String'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_rulesimpleType1085); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:492:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_rulesimpleType1104); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getBooleanKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:499:2: kw= 'int'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_rulesimpleType1123); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:506:2: kw= 'float'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_rulesimpleType1142); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getFloatKeyword_3()); 
                        

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
    // $ANTLR end "rulesimpleType"


    // $ANTLR start "entryRulesmallClassType"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:519:1: entryRulesmallClassType returns [EObject current=null] : iv_rulesmallClassType= rulesmallClassType EOF ;
    public final EObject entryRulesmallClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesmallClassType = null;


        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:520:2: (iv_rulesmallClassType= rulesmallClassType EOF )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:521:2: iv_rulesmallClassType= rulesmallClassType EOF
            {
             newCompositeNode(grammarAccess.getSmallClassTypeRule()); 
            pushFollow(FOLLOW_rulesmallClassType_in_entryRulesmallClassType1182);
            iv_rulesmallClassType=rulesmallClassType();

            state._fsp--;

             current =iv_rulesmallClassType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesmallClassType1192); 

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
    // $ANTLR end "entryRulesmallClassType"


    // $ANTLR start "rulesmallClassType"
    // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:528:1: rulesmallClassType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulesmallClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:531:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:532:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:532:1: ( (otherlv_0= RULE_ID ) )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:533:1: (otherlv_0= RULE_ID )
            {
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:533:1: (otherlv_0= RULE_ID )
            // ../org.babu.xtext.training.smalljava/src-gen/org/babu/xtext/training/smalljava/parser/antlr/internal/InternalSmalljavaDsl.g:534:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallClassTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesmallClassType1236); 

            		newLeafNode(otherlv_0, grammarAccess.getSmallClassTypeAccess().getTypeSmallClassCrossReference_0()); 
            	

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
    // $ANTLR end "rulesmallClassType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNameSpace_in_entryRuleNameSpace75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameSpace85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNameSpace122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleNameSpace143 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNameSpace164 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleSmallClass_in_ruleNameSpace186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_entryRuleQName223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQName234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQName274 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQName293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQName308 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleQNameWildCard_in_entryRuleQNameWildCard356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNameWildCard367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleQNameWildCard414 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQNameWildCard433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQNameWildCard_in_ruleImport543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallClass_in_entryRuleSmallClass579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallClass589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSmallClass626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallClass643 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleSmallClass661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallClass681 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSmallClass695 = new BitSet(new long[]{0x0000000000F40010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSmallClass716 = new BitSet(new long[]{0x0000000000F40010L});
    public static final BitSet FOLLOW_18_in_ruleSmallClass729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleAttribute821 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleAttribute839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimpleType_in_ruleDataType972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmallClassType_in_ruleDataType1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimpleType_in_entryRulesimpleType1036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimpleType1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulesimpleType1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulesimpleType1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulesimpleType1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulesimpleType1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmallClassType_in_entryRulesmallClassType1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesmallClassType1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesmallClassType1236 = new BitSet(new long[]{0x0000000000000002L});

}