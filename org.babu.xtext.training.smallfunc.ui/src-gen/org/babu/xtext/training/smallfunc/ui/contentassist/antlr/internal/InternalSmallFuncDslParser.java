package org.babu.xtext.training.smallfunc.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.babu.xtext.training.smallfunc.services.SmallFuncDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallFuncDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'boolean'", "'int'", "'float'", "'namespace'", "'.'", "'*'", "'import'", "'def'", "'('", "')'", "'{'", "'}'", "','"
    };
    public static final int RULE_ID=4;
    public static final int T__24=24;
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


        public InternalSmallFuncDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallFuncDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallFuncDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g"; }


     
     	private SmallFuncDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SmallFuncDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleNameSpace"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:60:1: entryRuleNameSpace : ruleNameSpace EOF ;
    public final void entryRuleNameSpace() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:61:1: ( ruleNameSpace EOF )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:62:1: ruleNameSpace EOF
            {
             before(grammarAccess.getNameSpaceRule()); 
            pushFollow(FOLLOW_ruleNameSpace_in_entryRuleNameSpace61);
            ruleNameSpace();

            state._fsp--;

             after(grammarAccess.getNameSpaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameSpace68); 

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
    // $ANTLR end "entryRuleNameSpace"


    // $ANTLR start "ruleNameSpace"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:69:1: ruleNameSpace : ( ( rule__NameSpace__Group__0 ) ) ;
    public final void ruleNameSpace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:73:2: ( ( ( rule__NameSpace__Group__0 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:74:1: ( ( rule__NameSpace__Group__0 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:74:1: ( ( rule__NameSpace__Group__0 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:75:1: ( rule__NameSpace__Group__0 )
            {
             before(grammarAccess.getNameSpaceAccess().getGroup()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:76:1: ( rule__NameSpace__Group__0 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:76:2: rule__NameSpace__Group__0
            {
            pushFollow(FOLLOW_rule__NameSpace__Group__0_in_ruleNameSpace94);
            rule__NameSpace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameSpaceAccess().getGroup()); 

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
    // $ANTLR end "ruleNameSpace"


    // $ANTLR start "entryRuleQName"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:88:1: entryRuleQName : ruleQName EOF ;
    public final void entryRuleQName() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:89:1: ( ruleQName EOF )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:90:1: ruleQName EOF
            {
             before(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_ruleQName_in_entryRuleQName121);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQName128); 

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
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:97:1: ruleQName : ( ( rule__QName__Group__0 ) ) ;
    public final void ruleQName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:101:2: ( ( ( rule__QName__Group__0 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:102:1: ( ( rule__QName__Group__0 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:102:1: ( ( rule__QName__Group__0 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:103:1: ( rule__QName__Group__0 )
            {
             before(grammarAccess.getQNameAccess().getGroup()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:104:1: ( rule__QName__Group__0 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:104:2: rule__QName__Group__0
            {
            pushFollow(FOLLOW_rule__QName__Group__0_in_ruleQName154);
            rule__QName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRuleQNameWildCard"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:116:1: entryRuleQNameWildCard : ruleQNameWildCard EOF ;
    public final void entryRuleQNameWildCard() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:117:1: ( ruleQNameWildCard EOF )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:118:1: ruleQNameWildCard EOF
            {
             before(grammarAccess.getQNameWildCardRule()); 
            pushFollow(FOLLOW_ruleQNameWildCard_in_entryRuleQNameWildCard181);
            ruleQNameWildCard();

            state._fsp--;

             after(grammarAccess.getQNameWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNameWildCard188); 

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
    // $ANTLR end "entryRuleQNameWildCard"


    // $ANTLR start "ruleQNameWildCard"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:125:1: ruleQNameWildCard : ( ( rule__QNameWildCard__Group__0 ) ) ;
    public final void ruleQNameWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:129:2: ( ( ( rule__QNameWildCard__Group__0 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:130:1: ( ( rule__QNameWildCard__Group__0 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:130:1: ( ( rule__QNameWildCard__Group__0 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:131:1: ( rule__QNameWildCard__Group__0 )
            {
             before(grammarAccess.getQNameWildCardAccess().getGroup()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:132:1: ( rule__QNameWildCard__Group__0 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:132:2: rule__QNameWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QNameWildCard__Group__0_in_ruleQNameWildCard214);
            rule__QNameWildCard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQNameWildCardAccess().getGroup()); 

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
    // $ANTLR end "ruleQNameWildCard"


    // $ANTLR start "entryRuleImport"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:144:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:145:1: ( ruleImport EOF )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:146:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport241);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport248); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:153:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:157:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:158:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:158:1: ( ( rule__Import__Group__0 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:159:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:160:1: ( rule__Import__Group__0 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:160:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport274);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleSmallFunc"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:172:1: entryRuleSmallFunc : ruleSmallFunc EOF ;
    public final void entryRuleSmallFunc() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:173:1: ( ruleSmallFunc EOF )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:174:1: ruleSmallFunc EOF
            {
             before(grammarAccess.getSmallFuncRule()); 
            pushFollow(FOLLOW_ruleSmallFunc_in_entryRuleSmallFunc301);
            ruleSmallFunc();

            state._fsp--;

             after(grammarAccess.getSmallFuncRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallFunc308); 

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
    // $ANTLR end "entryRuleSmallFunc"


    // $ANTLR start "ruleSmallFunc"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:181:1: ruleSmallFunc : ( ( rule__SmallFunc__Group__0 ) ) ;
    public final void ruleSmallFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:185:2: ( ( ( rule__SmallFunc__Group__0 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:186:1: ( ( rule__SmallFunc__Group__0 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:186:1: ( ( rule__SmallFunc__Group__0 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:187:1: ( rule__SmallFunc__Group__0 )
            {
             before(grammarAccess.getSmallFuncAccess().getGroup()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:188:1: ( rule__SmallFunc__Group__0 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:188:2: rule__SmallFunc__Group__0
            {
            pushFollow(FOLLOW_rule__SmallFunc__Group__0_in_ruleSmallFunc334);
            rule__SmallFunc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmallFuncAccess().getGroup()); 

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
    // $ANTLR end "ruleSmallFunc"


    // $ANTLR start "entryRuleParam"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:200:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:201:1: ( ruleParam EOF )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:202:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam361);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam368); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:209:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:213:2: ( ( ( rule__Param__Group__0 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:214:1: ( ( rule__Param__Group__0 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:214:1: ( ( rule__Param__Group__0 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:215:1: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:216:1: ( rule__Param__Group__0 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:216:2: rule__Param__Group__0
            {
            pushFollow(FOLLOW_rule__Param__Group__0_in_ruleParam394);
            rule__Param__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleDataType"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:230:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:231:1: ( ruleDataType EOF )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:232:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType423);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType430); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:239:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:243:2: ( ( ( rule__DataType__Alternatives ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:244:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:244:1: ( ( rule__DataType__Alternatives ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:245:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:246:1: ( rule__DataType__Alternatives )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:246:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType456);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRulesimpleType"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:258:1: entryRulesimpleType : rulesimpleType EOF ;
    public final void entryRulesimpleType() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:259:1: ( rulesimpleType EOF )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:260:1: rulesimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_rulesimpleType_in_entryRulesimpleType483);
            rulesimpleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimpleType490); 

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
    // $ANTLR end "entryRulesimpleType"


    // $ANTLR start "rulesimpleType"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:267:1: rulesimpleType : ( ( rule__SimpleType__Alternatives ) ) ;
    public final void rulesimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:271:2: ( ( ( rule__SimpleType__Alternatives ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:272:1: ( ( rule__SimpleType__Alternatives ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:272:1: ( ( rule__SimpleType__Alternatives ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:273:1: ( rule__SimpleType__Alternatives )
            {
             before(grammarAccess.getSimpleTypeAccess().getAlternatives()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:274:1: ( rule__SimpleType__Alternatives )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:274:2: rule__SimpleType__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleType__Alternatives_in_rulesimpleType516);
            rule__SimpleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getAlternatives()); 

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
    // $ANTLR end "rulesimpleType"


    // $ANTLR start "entryRulesmallClassType"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:286:1: entryRulesmallClassType : rulesmallClassType EOF ;
    public final void entryRulesmallClassType() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:287:1: ( rulesmallClassType EOF )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:288:1: rulesmallClassType EOF
            {
             before(grammarAccess.getSmallClassTypeRule()); 
            pushFollow(FOLLOW_rulesmallClassType_in_entryRulesmallClassType543);
            rulesmallClassType();

            state._fsp--;

             after(grammarAccess.getSmallClassTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesmallClassType550); 

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
    // $ANTLR end "entryRulesmallClassType"


    // $ANTLR start "rulesmallClassType"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:295:1: rulesmallClassType : ( ( rule__SmallClassType__TypeAssignment ) ) ;
    public final void rulesmallClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:299:2: ( ( ( rule__SmallClassType__TypeAssignment ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:300:1: ( ( rule__SmallClassType__TypeAssignment ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:300:1: ( ( rule__SmallClassType__TypeAssignment ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:301:1: ( rule__SmallClassType__TypeAssignment )
            {
             before(grammarAccess.getSmallClassTypeAccess().getTypeAssignment()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:302:1: ( rule__SmallClassType__TypeAssignment )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:302:2: rule__SmallClassType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__SmallClassType__TypeAssignment_in_rulesmallClassType576);
            rule__SmallClassType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSmallClassTypeAccess().getTypeAssignment()); 

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
    // $ANTLR end "rulesmallClassType"


    // $ANTLR start "rule__DataType__Alternatives"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:314:1: rule__DataType__Alternatives : ( ( ( rule__DataType__Group_0__0 ) ) | ( rulesmallClassType ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:318:1: ( ( ( rule__DataType__Group_0__0 ) ) | ( rulesmallClassType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=14)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:319:1: ( ( rule__DataType__Group_0__0 ) )
                    {
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:319:1: ( ( rule__DataType__Group_0__0 ) )
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:320:1: ( rule__DataType__Group_0__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_0()); 
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:321:1: ( rule__DataType__Group_0__0 )
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:321:2: rule__DataType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DataType__Group_0__0_in_rule__DataType__Alternatives612);
                    rule__DataType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:325:6: ( rulesmallClassType )
                    {
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:325:6: ( rulesmallClassType )
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:326:1: rulesmallClassType
                    {
                     before(grammarAccess.getDataTypeAccess().getSmallClassTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulesmallClassType_in_rule__DataType__Alternatives630);
                    rulesmallClassType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getSmallClassTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__SimpleType__Alternatives"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:336:1: rule__SimpleType__Alternatives : ( ( 'String' ) | ( 'boolean' ) | ( 'int' ) | ( 'float' ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:340:1: ( ( 'String' ) | ( 'boolean' ) | ( 'int' ) | ( 'float' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:341:1: ( 'String' )
                    {
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:341:1: ( 'String' )
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:342:1: 'String'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__SimpleType__Alternatives663); 
                     after(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:349:6: ( 'boolean' )
                    {
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:349:6: ( 'boolean' )
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:350:1: 'boolean'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__SimpleType__Alternatives683); 
                     after(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:357:6: ( 'int' )
                    {
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:357:6: ( 'int' )
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:358:1: 'int'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__SimpleType__Alternatives703); 
                     after(grammarAccess.getSimpleTypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:365:6: ( 'float' )
                    {
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:365:6: ( 'float' )
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:366:1: 'float'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getFloatKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__SimpleType__Alternatives723); 
                     after(grammarAccess.getSimpleTypeAccess().getFloatKeyword_3()); 

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
    // $ANTLR end "rule__SimpleType__Alternatives"


    // $ANTLR start "rule__NameSpace__Group__0"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:380:1: rule__NameSpace__Group__0 : rule__NameSpace__Group__0__Impl rule__NameSpace__Group__1 ;
    public final void rule__NameSpace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:384:1: ( rule__NameSpace__Group__0__Impl rule__NameSpace__Group__1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:385:2: rule__NameSpace__Group__0__Impl rule__NameSpace__Group__1
            {
            pushFollow(FOLLOW_rule__NameSpace__Group__0__Impl_in_rule__NameSpace__Group__0755);
            rule__NameSpace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameSpace__Group__1_in_rule__NameSpace__Group__0758);
            rule__NameSpace__Group__1();

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
    // $ANTLR end "rule__NameSpace__Group__0"


    // $ANTLR start "rule__NameSpace__Group__0__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:392:1: rule__NameSpace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__NameSpace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:396:1: ( ( 'namespace' ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:397:1: ( 'namespace' )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:397:1: ( 'namespace' )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:398:1: 'namespace'
            {
             before(grammarAccess.getNameSpaceAccess().getNamespaceKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__NameSpace__Group__0__Impl786); 
             after(grammarAccess.getNameSpaceAccess().getNamespaceKeyword_0()); 

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
    // $ANTLR end "rule__NameSpace__Group__0__Impl"


    // $ANTLR start "rule__NameSpace__Group__1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:411:1: rule__NameSpace__Group__1 : rule__NameSpace__Group__1__Impl rule__NameSpace__Group__2 ;
    public final void rule__NameSpace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:415:1: ( rule__NameSpace__Group__1__Impl rule__NameSpace__Group__2 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:416:2: rule__NameSpace__Group__1__Impl rule__NameSpace__Group__2
            {
            pushFollow(FOLLOW_rule__NameSpace__Group__1__Impl_in_rule__NameSpace__Group__1817);
            rule__NameSpace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameSpace__Group__2_in_rule__NameSpace__Group__1820);
            rule__NameSpace__Group__2();

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
    // $ANTLR end "rule__NameSpace__Group__1"


    // $ANTLR start "rule__NameSpace__Group__1__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:423:1: rule__NameSpace__Group__1__Impl : ( ( rule__NameSpace__NameAssignment_1 ) ) ;
    public final void rule__NameSpace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:427:1: ( ( ( rule__NameSpace__NameAssignment_1 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:428:1: ( ( rule__NameSpace__NameAssignment_1 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:428:1: ( ( rule__NameSpace__NameAssignment_1 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:429:1: ( rule__NameSpace__NameAssignment_1 )
            {
             before(grammarAccess.getNameSpaceAccess().getNameAssignment_1()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:430:1: ( rule__NameSpace__NameAssignment_1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:430:2: rule__NameSpace__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NameSpace__NameAssignment_1_in_rule__NameSpace__Group__1__Impl847);
            rule__NameSpace__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNameSpaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NameSpace__Group__1__Impl"


    // $ANTLR start "rule__NameSpace__Group__2"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:440:1: rule__NameSpace__Group__2 : rule__NameSpace__Group__2__Impl rule__NameSpace__Group__3 ;
    public final void rule__NameSpace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:444:1: ( rule__NameSpace__Group__2__Impl rule__NameSpace__Group__3 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:445:2: rule__NameSpace__Group__2__Impl rule__NameSpace__Group__3
            {
            pushFollow(FOLLOW_rule__NameSpace__Group__2__Impl_in_rule__NameSpace__Group__2877);
            rule__NameSpace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameSpace__Group__3_in_rule__NameSpace__Group__2880);
            rule__NameSpace__Group__3();

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
    // $ANTLR end "rule__NameSpace__Group__2"


    // $ANTLR start "rule__NameSpace__Group__2__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:452:1: rule__NameSpace__Group__2__Impl : ( ( rule__NameSpace__ImportsAssignment_2 )* ) ;
    public final void rule__NameSpace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:456:1: ( ( ( rule__NameSpace__ImportsAssignment_2 )* ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:457:1: ( ( rule__NameSpace__ImportsAssignment_2 )* )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:457:1: ( ( rule__NameSpace__ImportsAssignment_2 )* )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:458:1: ( rule__NameSpace__ImportsAssignment_2 )*
            {
             before(grammarAccess.getNameSpaceAccess().getImportsAssignment_2()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:459:1: ( rule__NameSpace__ImportsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:459:2: rule__NameSpace__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__NameSpace__ImportsAssignment_2_in_rule__NameSpace__Group__2__Impl907);
            	    rule__NameSpace__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getNameSpaceAccess().getImportsAssignment_2()); 

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
    // $ANTLR end "rule__NameSpace__Group__2__Impl"


    // $ANTLR start "rule__NameSpace__Group__3"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:469:1: rule__NameSpace__Group__3 : rule__NameSpace__Group__3__Impl ;
    public final void rule__NameSpace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:473:1: ( rule__NameSpace__Group__3__Impl )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:474:2: rule__NameSpace__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NameSpace__Group__3__Impl_in_rule__NameSpace__Group__3938);
            rule__NameSpace__Group__3__Impl();

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
    // $ANTLR end "rule__NameSpace__Group__3"


    // $ANTLR start "rule__NameSpace__Group__3__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:480:1: rule__NameSpace__Group__3__Impl : ( ( rule__NameSpace__SmallFuncAssignment_3 ) ) ;
    public final void rule__NameSpace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:484:1: ( ( ( rule__NameSpace__SmallFuncAssignment_3 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:485:1: ( ( rule__NameSpace__SmallFuncAssignment_3 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:485:1: ( ( rule__NameSpace__SmallFuncAssignment_3 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:486:1: ( rule__NameSpace__SmallFuncAssignment_3 )
            {
             before(grammarAccess.getNameSpaceAccess().getSmallFuncAssignment_3()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:487:1: ( rule__NameSpace__SmallFuncAssignment_3 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:487:2: rule__NameSpace__SmallFuncAssignment_3
            {
            pushFollow(FOLLOW_rule__NameSpace__SmallFuncAssignment_3_in_rule__NameSpace__Group__3__Impl965);
            rule__NameSpace__SmallFuncAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNameSpaceAccess().getSmallFuncAssignment_3()); 

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
    // $ANTLR end "rule__NameSpace__Group__3__Impl"


    // $ANTLR start "rule__QName__Group__0"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:505:1: rule__QName__Group__0 : rule__QName__Group__0__Impl rule__QName__Group__1 ;
    public final void rule__QName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:509:1: ( rule__QName__Group__0__Impl rule__QName__Group__1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:510:2: rule__QName__Group__0__Impl rule__QName__Group__1
            {
            pushFollow(FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__01003);
            rule__QName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QName__Group__1_in_rule__QName__Group__01006);
            rule__QName__Group__1();

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
    // $ANTLR end "rule__QName__Group__0"


    // $ANTLR start "rule__QName__Group__0__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:517:1: rule__QName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:521:1: ( ( RULE_ID ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:522:1: ( RULE_ID )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:522:1: ( RULE_ID )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:523:1: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QName__Group__0__Impl1033); 
             after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QName__Group__0__Impl"


    // $ANTLR start "rule__QName__Group__1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:534:1: rule__QName__Group__1 : rule__QName__Group__1__Impl ;
    public final void rule__QName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:538:1: ( rule__QName__Group__1__Impl )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:539:2: rule__QName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__11062);
            rule__QName__Group__1__Impl();

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
    // $ANTLR end "rule__QName__Group__1"


    // $ANTLR start "rule__QName__Group__1__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:545:1: rule__QName__Group__1__Impl : ( ( rule__QName__Group_1__0 )* ) ;
    public final void rule__QName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:549:1: ( ( ( rule__QName__Group_1__0 )* ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:550:1: ( ( rule__QName__Group_1__0 )* )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:550:1: ( ( rule__QName__Group_1__0 )* )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:551:1: ( rule__QName__Group_1__0 )*
            {
             before(grammarAccess.getQNameAccess().getGroup_1()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:552:1: ( rule__QName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:552:2: rule__QName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QName__Group_1__0_in_rule__QName__Group__1__Impl1089);
            	    rule__QName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QName__Group__1__Impl"


    // $ANTLR start "rule__QName__Group_1__0"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:566:1: rule__QName__Group_1__0 : rule__QName__Group_1__0__Impl rule__QName__Group_1__1 ;
    public final void rule__QName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:570:1: ( rule__QName__Group_1__0__Impl rule__QName__Group_1__1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:571:2: rule__QName__Group_1__0__Impl rule__QName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QName__Group_1__0__Impl_in_rule__QName__Group_1__01124);
            rule__QName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QName__Group_1__1_in_rule__QName__Group_1__01127);
            rule__QName__Group_1__1();

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
    // $ANTLR end "rule__QName__Group_1__0"


    // $ANTLR start "rule__QName__Group_1__0__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:578:1: rule__QName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:582:1: ( ( '.' ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:583:1: ( '.' )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:583:1: ( '.' )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:584:1: '.'
            {
             before(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__QName__Group_1__0__Impl1155); 
             after(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QName__Group_1__0__Impl"


    // $ANTLR start "rule__QName__Group_1__1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:597:1: rule__QName__Group_1__1 : rule__QName__Group_1__1__Impl ;
    public final void rule__QName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:601:1: ( rule__QName__Group_1__1__Impl )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:602:2: rule__QName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QName__Group_1__1__Impl_in_rule__QName__Group_1__11186);
            rule__QName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QName__Group_1__1"


    // $ANTLR start "rule__QName__Group_1__1__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:608:1: rule__QName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:612:1: ( ( RULE_ID ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:613:1: ( RULE_ID )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:613:1: ( RULE_ID )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:614:1: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QName__Group_1__1__Impl1213); 
             after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QName__Group_1__1__Impl"


    // $ANTLR start "rule__QNameWildCard__Group__0"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:629:1: rule__QNameWildCard__Group__0 : rule__QNameWildCard__Group__0__Impl rule__QNameWildCard__Group__1 ;
    public final void rule__QNameWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:633:1: ( rule__QNameWildCard__Group__0__Impl rule__QNameWildCard__Group__1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:634:2: rule__QNameWildCard__Group__0__Impl rule__QNameWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QNameWildCard__Group__0__Impl_in_rule__QNameWildCard__Group__01246);
            rule__QNameWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QNameWildCard__Group__1_in_rule__QNameWildCard__Group__01249);
            rule__QNameWildCard__Group__1();

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
    // $ANTLR end "rule__QNameWildCard__Group__0"


    // $ANTLR start "rule__QNameWildCard__Group__0__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:641:1: rule__QNameWildCard__Group__0__Impl : ( ruleQName ) ;
    public final void rule__QNameWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:645:1: ( ( ruleQName ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:646:1: ( ruleQName )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:646:1: ( ruleQName )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:647:1: ruleQName
            {
             before(grammarAccess.getQNameWildCardAccess().getQNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQName_in_rule__QNameWildCard__Group__0__Impl1276);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getQNameWildCardAccess().getQNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QNameWildCard__Group__0__Impl"


    // $ANTLR start "rule__QNameWildCard__Group__1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:658:1: rule__QNameWildCard__Group__1 : rule__QNameWildCard__Group__1__Impl ;
    public final void rule__QNameWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:662:1: ( rule__QNameWildCard__Group__1__Impl )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:663:2: rule__QNameWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QNameWildCard__Group__1__Impl_in_rule__QNameWildCard__Group__11305);
            rule__QNameWildCard__Group__1__Impl();

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
    // $ANTLR end "rule__QNameWildCard__Group__1"


    // $ANTLR start "rule__QNameWildCard__Group__1__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:669:1: rule__QNameWildCard__Group__1__Impl : ( ( '*' )? ) ;
    public final void rule__QNameWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:673:1: ( ( ( '*' )? ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:674:1: ( ( '*' )? )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:674:1: ( ( '*' )? )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:675:1: ( '*' )?
            {
             before(grammarAccess.getQNameWildCardAccess().getAsteriskKeyword_1()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:676:1: ( '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:677:2: '*'
                    {
                    match(input,17,FOLLOW_17_in_rule__QNameWildCard__Group__1__Impl1334); 

                    }
                    break;

            }

             after(grammarAccess.getQNameWildCardAccess().getAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QNameWildCard__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:692:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:696:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:697:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01371);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01374);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:704:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:708:1: ( ( 'import' ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:709:1: ( 'import' )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:709:1: ( 'import' )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:710:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Import__Group__0__Impl1402); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:723:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:727:1: ( rule__Import__Group__1__Impl )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:728:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11433);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:734:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:738:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:739:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:739:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:740:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:741:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:741:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1460);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__SmallFunc__Group__0"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:755:1: rule__SmallFunc__Group__0 : rule__SmallFunc__Group__0__Impl rule__SmallFunc__Group__1 ;
    public final void rule__SmallFunc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:759:1: ( rule__SmallFunc__Group__0__Impl rule__SmallFunc__Group__1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:760:2: rule__SmallFunc__Group__0__Impl rule__SmallFunc__Group__1
            {
            pushFollow(FOLLOW_rule__SmallFunc__Group__0__Impl_in_rule__SmallFunc__Group__01494);
            rule__SmallFunc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunc__Group__1_in_rule__SmallFunc__Group__01497);
            rule__SmallFunc__Group__1();

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
    // $ANTLR end "rule__SmallFunc__Group__0"


    // $ANTLR start "rule__SmallFunc__Group__0__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:767:1: rule__SmallFunc__Group__0__Impl : ( 'def' ) ;
    public final void rule__SmallFunc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:771:1: ( ( 'def' ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:772:1: ( 'def' )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:772:1: ( 'def' )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:773:1: 'def'
            {
             before(grammarAccess.getSmallFuncAccess().getDefKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__SmallFunc__Group__0__Impl1525); 
             after(grammarAccess.getSmallFuncAccess().getDefKeyword_0()); 

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
    // $ANTLR end "rule__SmallFunc__Group__0__Impl"


    // $ANTLR start "rule__SmallFunc__Group__1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:786:1: rule__SmallFunc__Group__1 : rule__SmallFunc__Group__1__Impl rule__SmallFunc__Group__2 ;
    public final void rule__SmallFunc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:790:1: ( rule__SmallFunc__Group__1__Impl rule__SmallFunc__Group__2 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:791:2: rule__SmallFunc__Group__1__Impl rule__SmallFunc__Group__2
            {
            pushFollow(FOLLOW_rule__SmallFunc__Group__1__Impl_in_rule__SmallFunc__Group__11556);
            rule__SmallFunc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunc__Group__2_in_rule__SmallFunc__Group__11559);
            rule__SmallFunc__Group__2();

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
    // $ANTLR end "rule__SmallFunc__Group__1"


    // $ANTLR start "rule__SmallFunc__Group__1__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:798:1: rule__SmallFunc__Group__1__Impl : ( ( rule__SmallFunc__NameAssignment_1 ) ) ;
    public final void rule__SmallFunc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:802:1: ( ( ( rule__SmallFunc__NameAssignment_1 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:803:1: ( ( rule__SmallFunc__NameAssignment_1 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:803:1: ( ( rule__SmallFunc__NameAssignment_1 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:804:1: ( rule__SmallFunc__NameAssignment_1 )
            {
             before(grammarAccess.getSmallFuncAccess().getNameAssignment_1()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:805:1: ( rule__SmallFunc__NameAssignment_1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:805:2: rule__SmallFunc__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SmallFunc__NameAssignment_1_in_rule__SmallFunc__Group__1__Impl1586);
            rule__SmallFunc__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmallFuncAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SmallFunc__Group__1__Impl"


    // $ANTLR start "rule__SmallFunc__Group__2"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:815:1: rule__SmallFunc__Group__2 : rule__SmallFunc__Group__2__Impl rule__SmallFunc__Group__3 ;
    public final void rule__SmallFunc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:819:1: ( rule__SmallFunc__Group__2__Impl rule__SmallFunc__Group__3 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:820:2: rule__SmallFunc__Group__2__Impl rule__SmallFunc__Group__3
            {
            pushFollow(FOLLOW_rule__SmallFunc__Group__2__Impl_in_rule__SmallFunc__Group__21616);
            rule__SmallFunc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunc__Group__3_in_rule__SmallFunc__Group__21619);
            rule__SmallFunc__Group__3();

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
    // $ANTLR end "rule__SmallFunc__Group__2"


    // $ANTLR start "rule__SmallFunc__Group__2__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:827:1: rule__SmallFunc__Group__2__Impl : ( '(' ) ;
    public final void rule__SmallFunc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:831:1: ( ( '(' ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:832:1: ( '(' )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:832:1: ( '(' )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:833:1: '('
            {
             before(grammarAccess.getSmallFuncAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__SmallFunc__Group__2__Impl1647); 
             after(grammarAccess.getSmallFuncAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__SmallFunc__Group__2__Impl"


    // $ANTLR start "rule__SmallFunc__Group__3"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:846:1: rule__SmallFunc__Group__3 : rule__SmallFunc__Group__3__Impl rule__SmallFunc__Group__4 ;
    public final void rule__SmallFunc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:850:1: ( rule__SmallFunc__Group__3__Impl rule__SmallFunc__Group__4 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:851:2: rule__SmallFunc__Group__3__Impl rule__SmallFunc__Group__4
            {
            pushFollow(FOLLOW_rule__SmallFunc__Group__3__Impl_in_rule__SmallFunc__Group__31678);
            rule__SmallFunc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunc__Group__4_in_rule__SmallFunc__Group__31681);
            rule__SmallFunc__Group__4();

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
    // $ANTLR end "rule__SmallFunc__Group__3"


    // $ANTLR start "rule__SmallFunc__Group__3__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:858:1: rule__SmallFunc__Group__3__Impl : ( ( rule__SmallFunc__Group_3__0 )? ) ;
    public final void rule__SmallFunc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:862:1: ( ( ( rule__SmallFunc__Group_3__0 )? ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:863:1: ( ( rule__SmallFunc__Group_3__0 )? )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:863:1: ( ( rule__SmallFunc__Group_3__0 )? )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:864:1: ( rule__SmallFunc__Group_3__0 )?
            {
             before(grammarAccess.getSmallFuncAccess().getGroup_3()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:865:1: ( rule__SmallFunc__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||(LA6_0>=11 && LA6_0<=14)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:865:2: rule__SmallFunc__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SmallFunc__Group_3__0_in_rule__SmallFunc__Group__3__Impl1708);
                    rule__SmallFunc__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmallFuncAccess().getGroup_3()); 

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
    // $ANTLR end "rule__SmallFunc__Group__3__Impl"


    // $ANTLR start "rule__SmallFunc__Group__4"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:875:1: rule__SmallFunc__Group__4 : rule__SmallFunc__Group__4__Impl rule__SmallFunc__Group__5 ;
    public final void rule__SmallFunc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:879:1: ( rule__SmallFunc__Group__4__Impl rule__SmallFunc__Group__5 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:880:2: rule__SmallFunc__Group__4__Impl rule__SmallFunc__Group__5
            {
            pushFollow(FOLLOW_rule__SmallFunc__Group__4__Impl_in_rule__SmallFunc__Group__41739);
            rule__SmallFunc__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunc__Group__5_in_rule__SmallFunc__Group__41742);
            rule__SmallFunc__Group__5();

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
    // $ANTLR end "rule__SmallFunc__Group__4"


    // $ANTLR start "rule__SmallFunc__Group__4__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:887:1: rule__SmallFunc__Group__4__Impl : ( ')' ) ;
    public final void rule__SmallFunc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:891:1: ( ( ')' ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:892:1: ( ')' )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:892:1: ( ')' )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:893:1: ')'
            {
             before(grammarAccess.getSmallFuncAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__SmallFunc__Group__4__Impl1770); 
             after(grammarAccess.getSmallFuncAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__SmallFunc__Group__4__Impl"


    // $ANTLR start "rule__SmallFunc__Group__5"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:906:1: rule__SmallFunc__Group__5 : rule__SmallFunc__Group__5__Impl rule__SmallFunc__Group__6 ;
    public final void rule__SmallFunc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:910:1: ( rule__SmallFunc__Group__5__Impl rule__SmallFunc__Group__6 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:911:2: rule__SmallFunc__Group__5__Impl rule__SmallFunc__Group__6
            {
            pushFollow(FOLLOW_rule__SmallFunc__Group__5__Impl_in_rule__SmallFunc__Group__51801);
            rule__SmallFunc__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunc__Group__6_in_rule__SmallFunc__Group__51804);
            rule__SmallFunc__Group__6();

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
    // $ANTLR end "rule__SmallFunc__Group__5"


    // $ANTLR start "rule__SmallFunc__Group__5__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:918:1: rule__SmallFunc__Group__5__Impl : ( '{' ) ;
    public final void rule__SmallFunc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:922:1: ( ( '{' ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:923:1: ( '{' )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:923:1: ( '{' )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:924:1: '{'
            {
             before(grammarAccess.getSmallFuncAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__SmallFunc__Group__5__Impl1832); 
             after(grammarAccess.getSmallFuncAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__SmallFunc__Group__5__Impl"


    // $ANTLR start "rule__SmallFunc__Group__6"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:937:1: rule__SmallFunc__Group__6 : rule__SmallFunc__Group__6__Impl ;
    public final void rule__SmallFunc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:941:1: ( rule__SmallFunc__Group__6__Impl )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:942:2: rule__SmallFunc__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SmallFunc__Group__6__Impl_in_rule__SmallFunc__Group__61863);
            rule__SmallFunc__Group__6__Impl();

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
    // $ANTLR end "rule__SmallFunc__Group__6"


    // $ANTLR start "rule__SmallFunc__Group__6__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:948:1: rule__SmallFunc__Group__6__Impl : ( '}' ) ;
    public final void rule__SmallFunc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:952:1: ( ( '}' ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:953:1: ( '}' )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:953:1: ( '}' )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:954:1: '}'
            {
             before(grammarAccess.getSmallFuncAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__SmallFunc__Group__6__Impl1891); 
             after(grammarAccess.getSmallFuncAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__SmallFunc__Group__6__Impl"


    // $ANTLR start "rule__SmallFunc__Group_3__0"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:981:1: rule__SmallFunc__Group_3__0 : rule__SmallFunc__Group_3__0__Impl rule__SmallFunc__Group_3__1 ;
    public final void rule__SmallFunc__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:985:1: ( rule__SmallFunc__Group_3__0__Impl rule__SmallFunc__Group_3__1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:986:2: rule__SmallFunc__Group_3__0__Impl rule__SmallFunc__Group_3__1
            {
            pushFollow(FOLLOW_rule__SmallFunc__Group_3__0__Impl_in_rule__SmallFunc__Group_3__01936);
            rule__SmallFunc__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunc__Group_3__1_in_rule__SmallFunc__Group_3__01939);
            rule__SmallFunc__Group_3__1();

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
    // $ANTLR end "rule__SmallFunc__Group_3__0"


    // $ANTLR start "rule__SmallFunc__Group_3__0__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:993:1: rule__SmallFunc__Group_3__0__Impl : ( ( rule__SmallFunc__ParamsAssignment_3_0 ) ) ;
    public final void rule__SmallFunc__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:997:1: ( ( ( rule__SmallFunc__ParamsAssignment_3_0 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:998:1: ( ( rule__SmallFunc__ParamsAssignment_3_0 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:998:1: ( ( rule__SmallFunc__ParamsAssignment_3_0 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:999:1: ( rule__SmallFunc__ParamsAssignment_3_0 )
            {
             before(grammarAccess.getSmallFuncAccess().getParamsAssignment_3_0()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1000:1: ( rule__SmallFunc__ParamsAssignment_3_0 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1000:2: rule__SmallFunc__ParamsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__SmallFunc__ParamsAssignment_3_0_in_rule__SmallFunc__Group_3__0__Impl1966);
            rule__SmallFunc__ParamsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSmallFuncAccess().getParamsAssignment_3_0()); 

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
    // $ANTLR end "rule__SmallFunc__Group_3__0__Impl"


    // $ANTLR start "rule__SmallFunc__Group_3__1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1010:1: rule__SmallFunc__Group_3__1 : rule__SmallFunc__Group_3__1__Impl ;
    public final void rule__SmallFunc__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1014:1: ( rule__SmallFunc__Group_3__1__Impl )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1015:2: rule__SmallFunc__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SmallFunc__Group_3__1__Impl_in_rule__SmallFunc__Group_3__11996);
            rule__SmallFunc__Group_3__1__Impl();

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
    // $ANTLR end "rule__SmallFunc__Group_3__1"


    // $ANTLR start "rule__SmallFunc__Group_3__1__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1021:1: rule__SmallFunc__Group_3__1__Impl : ( ( rule__SmallFunc__Group_3_1__0 )* ) ;
    public final void rule__SmallFunc__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1025:1: ( ( ( rule__SmallFunc__Group_3_1__0 )* ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1026:1: ( ( rule__SmallFunc__Group_3_1__0 )* )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1026:1: ( ( rule__SmallFunc__Group_3_1__0 )* )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1027:1: ( rule__SmallFunc__Group_3_1__0 )*
            {
             before(grammarAccess.getSmallFuncAccess().getGroup_3_1()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1028:1: ( rule__SmallFunc__Group_3_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1028:2: rule__SmallFunc__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SmallFunc__Group_3_1__0_in_rule__SmallFunc__Group_3__1__Impl2023);
            	    rule__SmallFunc__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSmallFuncAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__SmallFunc__Group_3__1__Impl"


    // $ANTLR start "rule__SmallFunc__Group_3_1__0"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1042:1: rule__SmallFunc__Group_3_1__0 : rule__SmallFunc__Group_3_1__0__Impl rule__SmallFunc__Group_3_1__1 ;
    public final void rule__SmallFunc__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1046:1: ( rule__SmallFunc__Group_3_1__0__Impl rule__SmallFunc__Group_3_1__1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1047:2: rule__SmallFunc__Group_3_1__0__Impl rule__SmallFunc__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__SmallFunc__Group_3_1__0__Impl_in_rule__SmallFunc__Group_3_1__02058);
            rule__SmallFunc__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallFunc__Group_3_1__1_in_rule__SmallFunc__Group_3_1__02061);
            rule__SmallFunc__Group_3_1__1();

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
    // $ANTLR end "rule__SmallFunc__Group_3_1__0"


    // $ANTLR start "rule__SmallFunc__Group_3_1__0__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1054:1: rule__SmallFunc__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__SmallFunc__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1058:1: ( ( ',' ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1059:1: ( ',' )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1059:1: ( ',' )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1060:1: ','
            {
             before(grammarAccess.getSmallFuncAccess().getCommaKeyword_3_1_0()); 
            match(input,24,FOLLOW_24_in_rule__SmallFunc__Group_3_1__0__Impl2089); 
             after(grammarAccess.getSmallFuncAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__SmallFunc__Group_3_1__0__Impl"


    // $ANTLR start "rule__SmallFunc__Group_3_1__1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1073:1: rule__SmallFunc__Group_3_1__1 : rule__SmallFunc__Group_3_1__1__Impl ;
    public final void rule__SmallFunc__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1077:1: ( rule__SmallFunc__Group_3_1__1__Impl )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1078:2: rule__SmallFunc__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SmallFunc__Group_3_1__1__Impl_in_rule__SmallFunc__Group_3_1__12120);
            rule__SmallFunc__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__SmallFunc__Group_3_1__1"


    // $ANTLR start "rule__SmallFunc__Group_3_1__1__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1084:1: rule__SmallFunc__Group_3_1__1__Impl : ( ( rule__SmallFunc__ParamsAssignment_3_1_1 ) ) ;
    public final void rule__SmallFunc__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1088:1: ( ( ( rule__SmallFunc__ParamsAssignment_3_1_1 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1089:1: ( ( rule__SmallFunc__ParamsAssignment_3_1_1 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1089:1: ( ( rule__SmallFunc__ParamsAssignment_3_1_1 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1090:1: ( rule__SmallFunc__ParamsAssignment_3_1_1 )
            {
             before(grammarAccess.getSmallFuncAccess().getParamsAssignment_3_1_1()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1091:1: ( rule__SmallFunc__ParamsAssignment_3_1_1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1091:2: rule__SmallFunc__ParamsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__SmallFunc__ParamsAssignment_3_1_1_in_rule__SmallFunc__Group_3_1__1__Impl2147);
            rule__SmallFunc__ParamsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSmallFuncAccess().getParamsAssignment_3_1_1()); 

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
    // $ANTLR end "rule__SmallFunc__Group_3_1__1__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1105:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1109:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1110:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__02181);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__02184);
            rule__Param__Group__1();

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
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1117:1: rule__Param__Group__0__Impl : ( ( rule__Param__DataTypeAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1121:1: ( ( ( rule__Param__DataTypeAssignment_0 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1122:1: ( ( rule__Param__DataTypeAssignment_0 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1122:1: ( ( rule__Param__DataTypeAssignment_0 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1123:1: ( rule__Param__DataTypeAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getDataTypeAssignment_0()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1124:1: ( rule__Param__DataTypeAssignment_0 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1124:2: rule__Param__DataTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Param__DataTypeAssignment_0_in_rule__Param__Group__0__Impl2211);
            rule__Param__DataTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getDataTypeAssignment_0()); 

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
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1134:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1138:1: ( rule__Param__Group__1__Impl )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1139:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__12241);
            rule__Param__Group__1__Impl();

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
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1145:1: rule__Param__Group__1__Impl : ( ( rule__Param__NameAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1149:1: ( ( ( rule__Param__NameAssignment_1 ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1150:1: ( ( rule__Param__NameAssignment_1 ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1150:1: ( ( rule__Param__NameAssignment_1 ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1151:1: ( rule__Param__NameAssignment_1 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_1()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1152:1: ( rule__Param__NameAssignment_1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1152:2: rule__Param__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Param__NameAssignment_1_in_rule__Param__Group__1__Impl2268);
            rule__Param__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group_0__0"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1167:1: rule__DataType__Group_0__0 : rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 ;
    public final void rule__DataType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1171:1: ( rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1172:2: rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1
            {
            pushFollow(FOLLOW_rule__DataType__Group_0__0__Impl_in_rule__DataType__Group_0__02303);
            rule__DataType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group_0__1_in_rule__DataType__Group_0__02306);
            rule__DataType__Group_0__1();

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
    // $ANTLR end "rule__DataType__Group_0__0"


    // $ANTLR start "rule__DataType__Group_0__0__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1179:1: rule__DataType__Group_0__0__Impl : ( () ) ;
    public final void rule__DataType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1183:1: ( ( () ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1184:1: ( () )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1184:1: ( () )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1185:1: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1186:1: ()
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1188:1: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__0__Impl"


    // $ANTLR start "rule__DataType__Group_0__1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1198:1: rule__DataType__Group_0__1 : rule__DataType__Group_0__1__Impl ;
    public final void rule__DataType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1202:1: ( rule__DataType__Group_0__1__Impl )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1203:2: rule__DataType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group_0__1__Impl_in_rule__DataType__Group_0__12364);
            rule__DataType__Group_0__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_0__1"


    // $ANTLR start "rule__DataType__Group_0__1__Impl"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1209:1: rule__DataType__Group_0__1__Impl : ( rulesimpleType ) ;
    public final void rule__DataType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1213:1: ( ( rulesimpleType ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1214:1: ( rulesimpleType )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1214:1: ( rulesimpleType )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1215:1: rulesimpleType
            {
             before(grammarAccess.getDataTypeAccess().getSimpleTypeParserRuleCall_0_1()); 
            pushFollow(FOLLOW_rulesimpleType_in_rule__DataType__Group_0__1__Impl2391);
            rulesimpleType();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getSimpleTypeParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__DataType__Group_0__1__Impl"


    // $ANTLR start "rule__NameSpace__NameAssignment_1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1231:1: rule__NameSpace__NameAssignment_1 : ( ruleQName ) ;
    public final void rule__NameSpace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1235:1: ( ( ruleQName ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1236:1: ( ruleQName )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1236:1: ( ruleQName )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1237:1: ruleQName
            {
             before(grammarAccess.getNameSpaceAccess().getNameQNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQName_in_rule__NameSpace__NameAssignment_12429);
            ruleQName();

            state._fsp--;

             after(grammarAccess.getNameSpaceAccess().getNameQNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NameSpace__NameAssignment_1"


    // $ANTLR start "rule__NameSpace__ImportsAssignment_2"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1246:1: rule__NameSpace__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__NameSpace__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1250:1: ( ( ruleImport ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1251:1: ( ruleImport )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1251:1: ( ruleImport )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1252:1: ruleImport
            {
             before(grammarAccess.getNameSpaceAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__NameSpace__ImportsAssignment_22460);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getNameSpaceAccess().getImportsImportParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NameSpace__ImportsAssignment_2"


    // $ANTLR start "rule__NameSpace__SmallFuncAssignment_3"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1261:1: rule__NameSpace__SmallFuncAssignment_3 : ( ruleSmallFunc ) ;
    public final void rule__NameSpace__SmallFuncAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1265:1: ( ( ruleSmallFunc ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1266:1: ( ruleSmallFunc )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1266:1: ( ruleSmallFunc )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1267:1: ruleSmallFunc
            {
             before(grammarAccess.getNameSpaceAccess().getSmallFuncSmallFuncParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSmallFunc_in_rule__NameSpace__SmallFuncAssignment_32491);
            ruleSmallFunc();

            state._fsp--;

             after(grammarAccess.getNameSpaceAccess().getSmallFuncSmallFuncParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__NameSpace__SmallFuncAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1276:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQNameWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1280:1: ( ( ruleQNameWildCard ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1281:1: ( ruleQNameWildCard )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1281:1: ( ruleQNameWildCard )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1282:1: ruleQNameWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQNameWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQNameWildCard_in_rule__Import__ImportedNamespaceAssignment_12522);
            ruleQNameWildCard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQNameWildCardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__SmallFunc__NameAssignment_1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1291:1: rule__SmallFunc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SmallFunc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1295:1: ( ( RULE_ID ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1296:1: ( RULE_ID )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1296:1: ( RULE_ID )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1297:1: RULE_ID
            {
             before(grammarAccess.getSmallFuncAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallFunc__NameAssignment_12553); 
             after(grammarAccess.getSmallFuncAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SmallFunc__NameAssignment_1"


    // $ANTLR start "rule__SmallFunc__ParamsAssignment_3_0"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1306:1: rule__SmallFunc__ParamsAssignment_3_0 : ( ruleParam ) ;
    public final void rule__SmallFunc__ParamsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1310:1: ( ( ruleParam ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1311:1: ( ruleParam )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1311:1: ( ruleParam )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1312:1: ruleParam
            {
             before(grammarAccess.getSmallFuncAccess().getParamsParamParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__SmallFunc__ParamsAssignment_3_02584);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getSmallFuncAccess().getParamsParamParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__SmallFunc__ParamsAssignment_3_0"


    // $ANTLR start "rule__SmallFunc__ParamsAssignment_3_1_1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1321:1: rule__SmallFunc__ParamsAssignment_3_1_1 : ( ruleParam ) ;
    public final void rule__SmallFunc__ParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1325:1: ( ( ruleParam ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1326:1: ( ruleParam )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1326:1: ( ruleParam )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1327:1: ruleParam
            {
             before(grammarAccess.getSmallFuncAccess().getParamsParamParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__SmallFunc__ParamsAssignment_3_1_12615);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getSmallFuncAccess().getParamsParamParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__SmallFunc__ParamsAssignment_3_1_1"


    // $ANTLR start "rule__Param__DataTypeAssignment_0"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1336:1: rule__Param__DataTypeAssignment_0 : ( ruleDataType ) ;
    public final void rule__Param__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1340:1: ( ( ruleDataType ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1341:1: ( ruleDataType )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1341:1: ( ruleDataType )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1342:1: ruleDataType
            {
             before(grammarAccess.getParamAccess().getDataTypeDataTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__Param__DataTypeAssignment_02646);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getParamAccess().getDataTypeDataTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Param__DataTypeAssignment_0"


    // $ANTLR start "rule__Param__NameAssignment_1"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1351:1: rule__Param__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1355:1: ( ( RULE_ID ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1356:1: ( RULE_ID )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1356:1: ( RULE_ID )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1357:1: RULE_ID
            {
             before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Param__NameAssignment_12677); 
             after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Param__NameAssignment_1"


    // $ANTLR start "rule__SmallClassType__TypeAssignment"
    // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1369:1: rule__SmallClassType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SmallClassType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1373:1: ( ( ( RULE_ID ) ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1374:1: ( ( RULE_ID ) )
            {
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1374:1: ( ( RULE_ID ) )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1375:1: ( RULE_ID )
            {
             before(grammarAccess.getSmallClassTypeAccess().getTypeSmallClassCrossReference_0()); 
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1376:1: ( RULE_ID )
            // ../org.babu.xtext.training.smallfunc.ui/src-gen/org/babu/xtext/training/smallfunc/ui/contentassist/antlr/internal/InternalSmallFuncDsl.g:1377:1: RULE_ID
            {
             before(grammarAccess.getSmallClassTypeAccess().getTypeSmallClassIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallClassType__TypeAssignment2715); 
             after(grammarAccess.getSmallClassTypeAccess().getTypeSmallClassIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getSmallClassTypeAccess().getTypeSmallClassCrossReference_0()); 

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
    // $ANTLR end "rule__SmallClassType__TypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNameSpace_in_entryRuleNameSpace61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameSpace68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__0_in_ruleNameSpace94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_entryRuleQName121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQName128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__0_in_ruleQName154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNameWildCard_in_entryRuleQNameWildCard181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNameWildCard188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QNameWildCard__Group__0_in_ruleQNameWildCard214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallFunc_in_entryRuleSmallFunc301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallFunc308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__0_in_ruleSmallFunc334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0_in_ruleParam394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimpleType_in_entryRulesimpleType483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimpleType490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Alternatives_in_rulesimpleType516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmallClassType_in_entryRulesmallClassType543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesmallClassType550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClassType__TypeAssignment_in_rulesmallClassType576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__0_in_rule__DataType__Alternatives612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmallClassType_in_rule__DataType__Alternatives630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SimpleType__Alternatives663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SimpleType__Alternatives683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SimpleType__Alternatives703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SimpleType__Alternatives723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__0__Impl_in_rule__NameSpace__Group__0755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__1_in_rule__NameSpace__Group__0758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NameSpace__Group__0__Impl786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__1__Impl_in_rule__NameSpace__Group__1817 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__2_in_rule__NameSpace__Group__1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameSpace__NameAssignment_1_in_rule__NameSpace__Group__1__Impl847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__2__Impl_in_rule__NameSpace__Group__2877 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__3_in_rule__NameSpace__Group__2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameSpace__ImportsAssignment_2_in_rule__NameSpace__Group__2__Impl907 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__3__Impl_in_rule__NameSpace__Group__3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameSpace__SmallFuncAssignment_3_in_rule__NameSpace__Group__3__Impl965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__01003 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QName__Group__1_in_rule__QName__Group__01006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QName__Group__0__Impl1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__11062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group_1__0_in_rule__QName__Group__1__Impl1089 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__QName__Group_1__0__Impl_in_rule__QName__Group_1__01124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QName__Group_1__1_in_rule__QName__Group_1__01127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QName__Group_1__0__Impl1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group_1__1__Impl_in_rule__QName__Group_1__11186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QName__Group_1__1__Impl1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QNameWildCard__Group__0__Impl_in_rule__QNameWildCard__Group__01246 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__QNameWildCard__Group__1_in_rule__QNameWildCard__Group__01249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_rule__QNameWildCard__Group__0__Impl1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QNameWildCard__Group__1__Impl_in_rule__QNameWildCard__Group__11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QNameWildCard__Group__1__Impl1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Import__Group__0__Impl1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__0__Impl_in_rule__SmallFunc__Group__01494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__1_in_rule__SmallFunc__Group__01497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SmallFunc__Group__0__Impl1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__1__Impl_in_rule__SmallFunc__Group__11556 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__2_in_rule__SmallFunc__Group__11559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__NameAssignment_1_in_rule__SmallFunc__Group__1__Impl1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__2__Impl_in_rule__SmallFunc__Group__21616 = new BitSet(new long[]{0x0000000000207810L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__3_in_rule__SmallFunc__Group__21619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SmallFunc__Group__2__Impl1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__3__Impl_in_rule__SmallFunc__Group__31678 = new BitSet(new long[]{0x0000000000207810L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__4_in_rule__SmallFunc__Group__31681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group_3__0_in_rule__SmallFunc__Group__3__Impl1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__4__Impl_in_rule__SmallFunc__Group__41739 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__5_in_rule__SmallFunc__Group__41742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SmallFunc__Group__4__Impl1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__5__Impl_in_rule__SmallFunc__Group__51801 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__6_in_rule__SmallFunc__Group__51804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SmallFunc__Group__5__Impl1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group__6__Impl_in_rule__SmallFunc__Group__61863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SmallFunc__Group__6__Impl1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group_3__0__Impl_in_rule__SmallFunc__Group_3__01936 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group_3__1_in_rule__SmallFunc__Group_3__01939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__ParamsAssignment_3_0_in_rule__SmallFunc__Group_3__0__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group_3__1__Impl_in_rule__SmallFunc__Group_3__11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group_3_1__0_in_rule__SmallFunc__Group_3__1__Impl2023 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group_3_1__0__Impl_in_rule__SmallFunc__Group_3_1__02058 = new BitSet(new long[]{0x0000000000007810L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group_3_1__1_in_rule__SmallFunc__Group_3_1__02061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SmallFunc__Group_3_1__0__Impl2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__Group_3_1__1__Impl_in_rule__SmallFunc__Group_3_1__12120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallFunc__ParamsAssignment_3_1_1_in_rule__SmallFunc__Group_3_1__1__Impl2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__02181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__02184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__DataTypeAssignment_0_in_rule__Param__Group__0__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__12241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__NameAssignment_1_in_rule__Param__Group__1__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__0__Impl_in_rule__DataType__Group_0__02303 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__1_in_rule__DataType__Group_0__02306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__1__Impl_in_rule__DataType__Group_0__12364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimpleType_in_rule__DataType__Group_0__1__Impl2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_rule__NameSpace__NameAssignment_12429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__NameSpace__ImportsAssignment_22460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallFunc_in_rule__NameSpace__SmallFuncAssignment_32491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNameWildCard_in_rule__Import__ImportedNamespaceAssignment_12522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallFunc__NameAssignment_12553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__SmallFunc__ParamsAssignment_3_02584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__SmallFunc__ParamsAssignment_3_1_12615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Param__DataTypeAssignment_02646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Param__NameAssignment_12677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallClassType__TypeAssignment2715 = new BitSet(new long[]{0x0000000000000002L});

}