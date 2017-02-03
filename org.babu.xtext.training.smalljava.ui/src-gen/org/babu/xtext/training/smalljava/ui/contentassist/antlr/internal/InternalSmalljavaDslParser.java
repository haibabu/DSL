package org.babu.xtext.training.smalljava.ui.contentassist.antlr.internal; 

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
import org.babu.xtext.training.smalljava.services.SmalljavaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmalljavaDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'boolean'", "'int'", "'float'", "'namespace'", "'.'", "'*'", "'import'", "'class'", "'{'", "'}'", "'extends'", "'[]'"
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
    public String getGrammarFileName() { return "../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g"; }


     
     	private SmalljavaDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SmalljavaDslGrammarAccess grammarAccess) {
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:60:1: entryRuleNameSpace : ruleNameSpace EOF ;
    public final void entryRuleNameSpace() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:61:1: ( ruleNameSpace EOF )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:62:1: ruleNameSpace EOF
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:69:1: ruleNameSpace : ( ( rule__NameSpace__Group__0 ) ) ;
    public final void ruleNameSpace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:73:2: ( ( ( rule__NameSpace__Group__0 ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:74:1: ( ( rule__NameSpace__Group__0 ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:74:1: ( ( rule__NameSpace__Group__0 ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:75:1: ( rule__NameSpace__Group__0 )
            {
             before(grammarAccess.getNameSpaceAccess().getGroup()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:76:1: ( rule__NameSpace__Group__0 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:76:2: rule__NameSpace__Group__0
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:88:1: entryRuleQName : ruleQName EOF ;
    public final void entryRuleQName() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:89:1: ( ruleQName EOF )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:90:1: ruleQName EOF
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:97:1: ruleQName : ( ( rule__QName__Group__0 ) ) ;
    public final void ruleQName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:101:2: ( ( ( rule__QName__Group__0 ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:102:1: ( ( rule__QName__Group__0 ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:102:1: ( ( rule__QName__Group__0 ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:103:1: ( rule__QName__Group__0 )
            {
             before(grammarAccess.getQNameAccess().getGroup()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:104:1: ( rule__QName__Group__0 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:104:2: rule__QName__Group__0
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:116:1: entryRuleQNameWildCard : ruleQNameWildCard EOF ;
    public final void entryRuleQNameWildCard() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:117:1: ( ruleQNameWildCard EOF )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:118:1: ruleQNameWildCard EOF
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:125:1: ruleQNameWildCard : ( ( rule__QNameWildCard__Group__0 ) ) ;
    public final void ruleQNameWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:129:2: ( ( ( rule__QNameWildCard__Group__0 ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:130:1: ( ( rule__QNameWildCard__Group__0 ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:130:1: ( ( rule__QNameWildCard__Group__0 ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:131:1: ( rule__QNameWildCard__Group__0 )
            {
             before(grammarAccess.getQNameWildCardAccess().getGroup()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:132:1: ( rule__QNameWildCard__Group__0 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:132:2: rule__QNameWildCard__Group__0
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:144:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:145:1: ( ruleImport EOF )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:146:1: ruleImport EOF
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:153:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:157:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:158:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:158:1: ( ( rule__Import__Group__0 ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:159:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:160:1: ( rule__Import__Group__0 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:160:2: rule__Import__Group__0
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


    // $ANTLR start "entryRuleSmallClass"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:172:1: entryRuleSmallClass : ruleSmallClass EOF ;
    public final void entryRuleSmallClass() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:173:1: ( ruleSmallClass EOF )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:174:1: ruleSmallClass EOF
            {
             before(grammarAccess.getSmallClassRule()); 
            pushFollow(FOLLOW_ruleSmallClass_in_entryRuleSmallClass301);
            ruleSmallClass();

            state._fsp--;

             after(grammarAccess.getSmallClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallClass308); 

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
    // $ANTLR end "entryRuleSmallClass"


    // $ANTLR start "ruleSmallClass"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:181:1: ruleSmallClass : ( ( rule__SmallClass__Group__0 ) ) ;
    public final void ruleSmallClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:185:2: ( ( ( rule__SmallClass__Group__0 ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:186:1: ( ( rule__SmallClass__Group__0 ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:186:1: ( ( rule__SmallClass__Group__0 ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:187:1: ( rule__SmallClass__Group__0 )
            {
             before(grammarAccess.getSmallClassAccess().getGroup()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:188:1: ( rule__SmallClass__Group__0 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:188:2: rule__SmallClass__Group__0
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__0_in_ruleSmallClass334);
            rule__SmallClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmallClassAccess().getGroup()); 

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
    // $ANTLR end "ruleSmallClass"


    // $ANTLR start "entryRuleAttribute"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:200:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:201:1: ( ruleAttribute EOF )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:202:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute361);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute368); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:209:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:213:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:214:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:214:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:215:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:216:1: ( rule__Attribute__Group__0 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:216:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute394);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDataType"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:228:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:229:1: ( ruleDataType EOF )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:230:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType421);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType428); 

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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:237:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:241:2: ( ( ( rule__DataType__Alternatives ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:242:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:242:1: ( ( rule__DataType__Alternatives ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:243:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:244:1: ( rule__DataType__Alternatives )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:244:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType454);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:256:1: entryRulesimpleType : rulesimpleType EOF ;
    public final void entryRulesimpleType() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:257:1: ( rulesimpleType EOF )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:258:1: rulesimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_rulesimpleType_in_entryRulesimpleType481);
            rulesimpleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimpleType488); 

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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:265:1: rulesimpleType : ( ( rule__SimpleType__Alternatives ) ) ;
    public final void rulesimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:269:2: ( ( ( rule__SimpleType__Alternatives ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:270:1: ( ( rule__SimpleType__Alternatives ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:270:1: ( ( rule__SimpleType__Alternatives ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:271:1: ( rule__SimpleType__Alternatives )
            {
             before(grammarAccess.getSimpleTypeAccess().getAlternatives()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:272:1: ( rule__SimpleType__Alternatives )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:272:2: rule__SimpleType__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleType__Alternatives_in_rulesimpleType514);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:284:1: entryRulesmallClassType : rulesmallClassType EOF ;
    public final void entryRulesmallClassType() throws RecognitionException {
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:285:1: ( rulesmallClassType EOF )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:286:1: rulesmallClassType EOF
            {
             before(grammarAccess.getSmallClassTypeRule()); 
            pushFollow(FOLLOW_rulesmallClassType_in_entryRulesmallClassType541);
            rulesmallClassType();

            state._fsp--;

             after(grammarAccess.getSmallClassTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesmallClassType548); 

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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:293:1: rulesmallClassType : ( ( rule__SmallClassType__TypeAssignment ) ) ;
    public final void rulesmallClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:297:2: ( ( ( rule__SmallClassType__TypeAssignment ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:298:1: ( ( rule__SmallClassType__TypeAssignment ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:298:1: ( ( rule__SmallClassType__TypeAssignment ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:299:1: ( rule__SmallClassType__TypeAssignment )
            {
             before(grammarAccess.getSmallClassTypeAccess().getTypeAssignment()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:300:1: ( rule__SmallClassType__TypeAssignment )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:300:2: rule__SmallClassType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__SmallClassType__TypeAssignment_in_rulesmallClassType574);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:312:1: rule__DataType__Alternatives : ( ( ( rule__DataType__Group_0__0 ) ) | ( rulesmallClassType ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:316:1: ( ( ( rule__DataType__Group_0__0 ) ) | ( rulesmallClassType ) )
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
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:317:1: ( ( rule__DataType__Group_0__0 ) )
                    {
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:317:1: ( ( rule__DataType__Group_0__0 ) )
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:318:1: ( rule__DataType__Group_0__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_0()); 
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:319:1: ( rule__DataType__Group_0__0 )
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:319:2: rule__DataType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DataType__Group_0__0_in_rule__DataType__Alternatives610);
                    rule__DataType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:323:6: ( rulesmallClassType )
                    {
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:323:6: ( rulesmallClassType )
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:324:1: rulesmallClassType
                    {
                     before(grammarAccess.getDataTypeAccess().getSmallClassTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulesmallClassType_in_rule__DataType__Alternatives628);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:334:1: rule__SimpleType__Alternatives : ( ( 'String' ) | ( 'boolean' ) | ( 'int' ) | ( 'float' ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:338:1: ( ( 'String' ) | ( 'boolean' ) | ( 'int' ) | ( 'float' ) )
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
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:339:1: ( 'String' )
                    {
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:339:1: ( 'String' )
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:340:1: 'String'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__SimpleType__Alternatives661); 
                     after(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:347:6: ( 'boolean' )
                    {
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:347:6: ( 'boolean' )
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:348:1: 'boolean'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__SimpleType__Alternatives681); 
                     after(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:355:6: ( 'int' )
                    {
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:355:6: ( 'int' )
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:356:1: 'int'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__SimpleType__Alternatives701); 
                     after(grammarAccess.getSimpleTypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:363:6: ( 'float' )
                    {
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:363:6: ( 'float' )
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:364:1: 'float'
                    {
                     before(grammarAccess.getSimpleTypeAccess().getFloatKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__SimpleType__Alternatives721); 
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:378:1: rule__NameSpace__Group__0 : rule__NameSpace__Group__0__Impl rule__NameSpace__Group__1 ;
    public final void rule__NameSpace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:382:1: ( rule__NameSpace__Group__0__Impl rule__NameSpace__Group__1 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:383:2: rule__NameSpace__Group__0__Impl rule__NameSpace__Group__1
            {
            pushFollow(FOLLOW_rule__NameSpace__Group__0__Impl_in_rule__NameSpace__Group__0753);
            rule__NameSpace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameSpace__Group__1_in_rule__NameSpace__Group__0756);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:390:1: rule__NameSpace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__NameSpace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:394:1: ( ( 'namespace' ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:395:1: ( 'namespace' )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:395:1: ( 'namespace' )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:396:1: 'namespace'
            {
             before(grammarAccess.getNameSpaceAccess().getNamespaceKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__NameSpace__Group__0__Impl784); 
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:409:1: rule__NameSpace__Group__1 : rule__NameSpace__Group__1__Impl rule__NameSpace__Group__2 ;
    public final void rule__NameSpace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:413:1: ( rule__NameSpace__Group__1__Impl rule__NameSpace__Group__2 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:414:2: rule__NameSpace__Group__1__Impl rule__NameSpace__Group__2
            {
            pushFollow(FOLLOW_rule__NameSpace__Group__1__Impl_in_rule__NameSpace__Group__1815);
            rule__NameSpace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameSpace__Group__2_in_rule__NameSpace__Group__1818);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:421:1: rule__NameSpace__Group__1__Impl : ( ( rule__NameSpace__NameAssignment_1 ) ) ;
    public final void rule__NameSpace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:425:1: ( ( ( rule__NameSpace__NameAssignment_1 ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:426:1: ( ( rule__NameSpace__NameAssignment_1 ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:426:1: ( ( rule__NameSpace__NameAssignment_1 ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:427:1: ( rule__NameSpace__NameAssignment_1 )
            {
             before(grammarAccess.getNameSpaceAccess().getNameAssignment_1()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:428:1: ( rule__NameSpace__NameAssignment_1 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:428:2: rule__NameSpace__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NameSpace__NameAssignment_1_in_rule__NameSpace__Group__1__Impl845);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:438:1: rule__NameSpace__Group__2 : rule__NameSpace__Group__2__Impl rule__NameSpace__Group__3 ;
    public final void rule__NameSpace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:442:1: ( rule__NameSpace__Group__2__Impl rule__NameSpace__Group__3 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:443:2: rule__NameSpace__Group__2__Impl rule__NameSpace__Group__3
            {
            pushFollow(FOLLOW_rule__NameSpace__Group__2__Impl_in_rule__NameSpace__Group__2875);
            rule__NameSpace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameSpace__Group__3_in_rule__NameSpace__Group__2878);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:450:1: rule__NameSpace__Group__2__Impl : ( ( rule__NameSpace__ImportsAssignment_2 )* ) ;
    public final void rule__NameSpace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:454:1: ( ( ( rule__NameSpace__ImportsAssignment_2 )* ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:455:1: ( ( rule__NameSpace__ImportsAssignment_2 )* )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:455:1: ( ( rule__NameSpace__ImportsAssignment_2 )* )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:456:1: ( rule__NameSpace__ImportsAssignment_2 )*
            {
             before(grammarAccess.getNameSpaceAccess().getImportsAssignment_2()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:457:1: ( rule__NameSpace__ImportsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:457:2: rule__NameSpace__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__NameSpace__ImportsAssignment_2_in_rule__NameSpace__Group__2__Impl905);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:467:1: rule__NameSpace__Group__3 : rule__NameSpace__Group__3__Impl ;
    public final void rule__NameSpace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:471:1: ( rule__NameSpace__Group__3__Impl )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:472:2: rule__NameSpace__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NameSpace__Group__3__Impl_in_rule__NameSpace__Group__3936);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:478:1: rule__NameSpace__Group__3__Impl : ( ( rule__NameSpace__SmallClassAssignment_3 ) ) ;
    public final void rule__NameSpace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:482:1: ( ( ( rule__NameSpace__SmallClassAssignment_3 ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:483:1: ( ( rule__NameSpace__SmallClassAssignment_3 ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:483:1: ( ( rule__NameSpace__SmallClassAssignment_3 ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:484:1: ( rule__NameSpace__SmallClassAssignment_3 )
            {
             before(grammarAccess.getNameSpaceAccess().getSmallClassAssignment_3()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:485:1: ( rule__NameSpace__SmallClassAssignment_3 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:485:2: rule__NameSpace__SmallClassAssignment_3
            {
            pushFollow(FOLLOW_rule__NameSpace__SmallClassAssignment_3_in_rule__NameSpace__Group__3__Impl963);
            rule__NameSpace__SmallClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNameSpaceAccess().getSmallClassAssignment_3()); 

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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:503:1: rule__QName__Group__0 : rule__QName__Group__0__Impl rule__QName__Group__1 ;
    public final void rule__QName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:507:1: ( rule__QName__Group__0__Impl rule__QName__Group__1 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:508:2: rule__QName__Group__0__Impl rule__QName__Group__1
            {
            pushFollow(FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__01001);
            rule__QName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QName__Group__1_in_rule__QName__Group__01004);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:515:1: rule__QName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:519:1: ( ( RULE_ID ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:520:1: ( RULE_ID )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:520:1: ( RULE_ID )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:521:1: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QName__Group__0__Impl1031); 
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:532:1: rule__QName__Group__1 : rule__QName__Group__1__Impl ;
    public final void rule__QName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:536:1: ( rule__QName__Group__1__Impl )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:537:2: rule__QName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__11060);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:543:1: rule__QName__Group__1__Impl : ( ( rule__QName__Group_1__0 )* ) ;
    public final void rule__QName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:547:1: ( ( ( rule__QName__Group_1__0 )* ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:548:1: ( ( rule__QName__Group_1__0 )* )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:548:1: ( ( rule__QName__Group_1__0 )* )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:549:1: ( rule__QName__Group_1__0 )*
            {
             before(grammarAccess.getQNameAccess().getGroup_1()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:550:1: ( rule__QName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:550:2: rule__QName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QName__Group_1__0_in_rule__QName__Group__1__Impl1087);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:564:1: rule__QName__Group_1__0 : rule__QName__Group_1__0__Impl rule__QName__Group_1__1 ;
    public final void rule__QName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:568:1: ( rule__QName__Group_1__0__Impl rule__QName__Group_1__1 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:569:2: rule__QName__Group_1__0__Impl rule__QName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QName__Group_1__0__Impl_in_rule__QName__Group_1__01122);
            rule__QName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QName__Group_1__1_in_rule__QName__Group_1__01125);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:576:1: rule__QName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:580:1: ( ( '.' ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:581:1: ( '.' )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:581:1: ( '.' )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:582:1: '.'
            {
             before(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__QName__Group_1__0__Impl1153); 
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:595:1: rule__QName__Group_1__1 : rule__QName__Group_1__1__Impl ;
    public final void rule__QName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:599:1: ( rule__QName__Group_1__1__Impl )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:600:2: rule__QName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QName__Group_1__1__Impl_in_rule__QName__Group_1__11184);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:606:1: rule__QName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:610:1: ( ( RULE_ID ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:611:1: ( RULE_ID )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:611:1: ( RULE_ID )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:612:1: RULE_ID
            {
             before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QName__Group_1__1__Impl1211); 
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:627:1: rule__QNameWildCard__Group__0 : rule__QNameWildCard__Group__0__Impl rule__QNameWildCard__Group__1 ;
    public final void rule__QNameWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:631:1: ( rule__QNameWildCard__Group__0__Impl rule__QNameWildCard__Group__1 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:632:2: rule__QNameWildCard__Group__0__Impl rule__QNameWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QNameWildCard__Group__0__Impl_in_rule__QNameWildCard__Group__01244);
            rule__QNameWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QNameWildCard__Group__1_in_rule__QNameWildCard__Group__01247);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:639:1: rule__QNameWildCard__Group__0__Impl : ( ruleQName ) ;
    public final void rule__QNameWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:643:1: ( ( ruleQName ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:644:1: ( ruleQName )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:644:1: ( ruleQName )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:645:1: ruleQName
            {
             before(grammarAccess.getQNameWildCardAccess().getQNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQName_in_rule__QNameWildCard__Group__0__Impl1274);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:656:1: rule__QNameWildCard__Group__1 : rule__QNameWildCard__Group__1__Impl ;
    public final void rule__QNameWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:660:1: ( rule__QNameWildCard__Group__1__Impl )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:661:2: rule__QNameWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QNameWildCard__Group__1__Impl_in_rule__QNameWildCard__Group__11303);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:667:1: rule__QNameWildCard__Group__1__Impl : ( ( '*' )? ) ;
    public final void rule__QNameWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:671:1: ( ( ( '*' )? ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:672:1: ( ( '*' )? )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:672:1: ( ( '*' )? )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:673:1: ( '*' )?
            {
             before(grammarAccess.getQNameWildCardAccess().getAsteriskKeyword_1()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:674:1: ( '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:675:2: '*'
                    {
                    match(input,17,FOLLOW_17_in_rule__QNameWildCard__Group__1__Impl1332); 

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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:690:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:694:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:695:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01369);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01372);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:702:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:706:1: ( ( 'import' ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:707:1: ( 'import' )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:707:1: ( 'import' )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:708:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Import__Group__0__Impl1400); 
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:721:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:725:1: ( rule__Import__Group__1__Impl )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:726:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11431);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:732:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:736:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:737:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:737:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:738:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:739:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:739:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1458);
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


    // $ANTLR start "rule__SmallClass__Group__0"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:753:1: rule__SmallClass__Group__0 : rule__SmallClass__Group__0__Impl rule__SmallClass__Group__1 ;
    public final void rule__SmallClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:757:1: ( rule__SmallClass__Group__0__Impl rule__SmallClass__Group__1 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:758:2: rule__SmallClass__Group__0__Impl rule__SmallClass__Group__1
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__0__Impl_in_rule__SmallClass__Group__01492);
            rule__SmallClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__1_in_rule__SmallClass__Group__01495);
            rule__SmallClass__Group__1();

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
    // $ANTLR end "rule__SmallClass__Group__0"


    // $ANTLR start "rule__SmallClass__Group__0__Impl"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:765:1: rule__SmallClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__SmallClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:769:1: ( ( 'class' ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:770:1: ( 'class' )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:770:1: ( 'class' )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:771:1: 'class'
            {
             before(grammarAccess.getSmallClassAccess().getClassKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__SmallClass__Group__0__Impl1523); 
             after(grammarAccess.getSmallClassAccess().getClassKeyword_0()); 

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
    // $ANTLR end "rule__SmallClass__Group__0__Impl"


    // $ANTLR start "rule__SmallClass__Group__1"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:784:1: rule__SmallClass__Group__1 : rule__SmallClass__Group__1__Impl rule__SmallClass__Group__2 ;
    public final void rule__SmallClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:788:1: ( rule__SmallClass__Group__1__Impl rule__SmallClass__Group__2 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:789:2: rule__SmallClass__Group__1__Impl rule__SmallClass__Group__2
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__1__Impl_in_rule__SmallClass__Group__11554);
            rule__SmallClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__2_in_rule__SmallClass__Group__11557);
            rule__SmallClass__Group__2();

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
    // $ANTLR end "rule__SmallClass__Group__1"


    // $ANTLR start "rule__SmallClass__Group__1__Impl"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:796:1: rule__SmallClass__Group__1__Impl : ( ( rule__SmallClass__NameAssignment_1 ) ) ;
    public final void rule__SmallClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:800:1: ( ( ( rule__SmallClass__NameAssignment_1 ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:801:1: ( ( rule__SmallClass__NameAssignment_1 ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:801:1: ( ( rule__SmallClass__NameAssignment_1 ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:802:1: ( rule__SmallClass__NameAssignment_1 )
            {
             before(grammarAccess.getSmallClassAccess().getNameAssignment_1()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:803:1: ( rule__SmallClass__NameAssignment_1 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:803:2: rule__SmallClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SmallClass__NameAssignment_1_in_rule__SmallClass__Group__1__Impl1584);
            rule__SmallClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmallClassAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SmallClass__Group__1__Impl"


    // $ANTLR start "rule__SmallClass__Group__2"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:813:1: rule__SmallClass__Group__2 : rule__SmallClass__Group__2__Impl rule__SmallClass__Group__3 ;
    public final void rule__SmallClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:817:1: ( rule__SmallClass__Group__2__Impl rule__SmallClass__Group__3 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:818:2: rule__SmallClass__Group__2__Impl rule__SmallClass__Group__3
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__2__Impl_in_rule__SmallClass__Group__21614);
            rule__SmallClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__3_in_rule__SmallClass__Group__21617);
            rule__SmallClass__Group__3();

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
    // $ANTLR end "rule__SmallClass__Group__2"


    // $ANTLR start "rule__SmallClass__Group__2__Impl"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:825:1: rule__SmallClass__Group__2__Impl : ( ( rule__SmallClass__Group_2__0 )? ) ;
    public final void rule__SmallClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:829:1: ( ( ( rule__SmallClass__Group_2__0 )? ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:830:1: ( ( rule__SmallClass__Group_2__0 )? )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:830:1: ( ( rule__SmallClass__Group_2__0 )? )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:831:1: ( rule__SmallClass__Group_2__0 )?
            {
             before(grammarAccess.getSmallClassAccess().getGroup_2()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:832:1: ( rule__SmallClass__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:832:2: rule__SmallClass__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SmallClass__Group_2__0_in_rule__SmallClass__Group__2__Impl1644);
                    rule__SmallClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmallClassAccess().getGroup_2()); 

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
    // $ANTLR end "rule__SmallClass__Group__2__Impl"


    // $ANTLR start "rule__SmallClass__Group__3"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:842:1: rule__SmallClass__Group__3 : rule__SmallClass__Group__3__Impl rule__SmallClass__Group__4 ;
    public final void rule__SmallClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:846:1: ( rule__SmallClass__Group__3__Impl rule__SmallClass__Group__4 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:847:2: rule__SmallClass__Group__3__Impl rule__SmallClass__Group__4
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__3__Impl_in_rule__SmallClass__Group__31675);
            rule__SmallClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__4_in_rule__SmallClass__Group__31678);
            rule__SmallClass__Group__4();

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
    // $ANTLR end "rule__SmallClass__Group__3"


    // $ANTLR start "rule__SmallClass__Group__3__Impl"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:854:1: rule__SmallClass__Group__3__Impl : ( '{' ) ;
    public final void rule__SmallClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:858:1: ( ( '{' ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:859:1: ( '{' )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:859:1: ( '{' )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:860:1: '{'
            {
             before(grammarAccess.getSmallClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__SmallClass__Group__3__Impl1706); 
             after(grammarAccess.getSmallClassAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__SmallClass__Group__3__Impl"


    // $ANTLR start "rule__SmallClass__Group__4"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:873:1: rule__SmallClass__Group__4 : rule__SmallClass__Group__4__Impl rule__SmallClass__Group__5 ;
    public final void rule__SmallClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:877:1: ( rule__SmallClass__Group__4__Impl rule__SmallClass__Group__5 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:878:2: rule__SmallClass__Group__4__Impl rule__SmallClass__Group__5
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__4__Impl_in_rule__SmallClass__Group__41737);
            rule__SmallClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__5_in_rule__SmallClass__Group__41740);
            rule__SmallClass__Group__5();

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
    // $ANTLR end "rule__SmallClass__Group__4"


    // $ANTLR start "rule__SmallClass__Group__4__Impl"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:885:1: rule__SmallClass__Group__4__Impl : ( ( rule__SmallClass__AttributesAssignment_4 )* ) ;
    public final void rule__SmallClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:889:1: ( ( ( rule__SmallClass__AttributesAssignment_4 )* ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:890:1: ( ( rule__SmallClass__AttributesAssignment_4 )* )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:890:1: ( ( rule__SmallClass__AttributesAssignment_4 )* )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:891:1: ( rule__SmallClass__AttributesAssignment_4 )*
            {
             before(grammarAccess.getSmallClassAccess().getAttributesAssignment_4()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:892:1: ( rule__SmallClass__AttributesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=11 && LA7_0<=14)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:892:2: rule__SmallClass__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SmallClass__AttributesAssignment_4_in_rule__SmallClass__Group__4__Impl1767);
            	    rule__SmallClass__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSmallClassAccess().getAttributesAssignment_4()); 

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
    // $ANTLR end "rule__SmallClass__Group__4__Impl"


    // $ANTLR start "rule__SmallClass__Group__5"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:902:1: rule__SmallClass__Group__5 : rule__SmallClass__Group__5__Impl ;
    public final void rule__SmallClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:906:1: ( rule__SmallClass__Group__5__Impl )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:907:2: rule__SmallClass__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__5__Impl_in_rule__SmallClass__Group__51798);
            rule__SmallClass__Group__5__Impl();

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
    // $ANTLR end "rule__SmallClass__Group__5"


    // $ANTLR start "rule__SmallClass__Group__5__Impl"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:913:1: rule__SmallClass__Group__5__Impl : ( '}' ) ;
    public final void rule__SmallClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:917:1: ( ( '}' ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:918:1: ( '}' )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:918:1: ( '}' )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:919:1: '}'
            {
             before(grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__SmallClass__Group__5__Impl1826); 
             after(grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__SmallClass__Group__5__Impl"


    // $ANTLR start "rule__SmallClass__Group_2__0"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:944:1: rule__SmallClass__Group_2__0 : rule__SmallClass__Group_2__0__Impl rule__SmallClass__Group_2__1 ;
    public final void rule__SmallClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:948:1: ( rule__SmallClass__Group_2__0__Impl rule__SmallClass__Group_2__1 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:949:2: rule__SmallClass__Group_2__0__Impl rule__SmallClass__Group_2__1
            {
            pushFollow(FOLLOW_rule__SmallClass__Group_2__0__Impl_in_rule__SmallClass__Group_2__01869);
            rule__SmallClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group_2__1_in_rule__SmallClass__Group_2__01872);
            rule__SmallClass__Group_2__1();

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
    // $ANTLR end "rule__SmallClass__Group_2__0"


    // $ANTLR start "rule__SmallClass__Group_2__0__Impl"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:956:1: rule__SmallClass__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__SmallClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:960:1: ( ( 'extends' ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:961:1: ( 'extends' )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:961:1: ( 'extends' )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:962:1: 'extends'
            {
             before(grammarAccess.getSmallClassAccess().getExtendsKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__SmallClass__Group_2__0__Impl1900); 
             after(grammarAccess.getSmallClassAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__SmallClass__Group_2__0__Impl"


    // $ANTLR start "rule__SmallClass__Group_2__1"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:975:1: rule__SmallClass__Group_2__1 : rule__SmallClass__Group_2__1__Impl ;
    public final void rule__SmallClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:979:1: ( rule__SmallClass__Group_2__1__Impl )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:980:2: rule__SmallClass__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SmallClass__Group_2__1__Impl_in_rule__SmallClass__Group_2__11931);
            rule__SmallClass__Group_2__1__Impl();

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
    // $ANTLR end "rule__SmallClass__Group_2__1"


    // $ANTLR start "rule__SmallClass__Group_2__1__Impl"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:986:1: rule__SmallClass__Group_2__1__Impl : ( ( rule__SmallClass__SuperClassAssignment_2_1 ) ) ;
    public final void rule__SmallClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:990:1: ( ( ( rule__SmallClass__SuperClassAssignment_2_1 ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:991:1: ( ( rule__SmallClass__SuperClassAssignment_2_1 ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:991:1: ( ( rule__SmallClass__SuperClassAssignment_2_1 ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:992:1: ( rule__SmallClass__SuperClassAssignment_2_1 )
            {
             before(grammarAccess.getSmallClassAccess().getSuperClassAssignment_2_1()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:993:1: ( rule__SmallClass__SuperClassAssignment_2_1 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:993:2: rule__SmallClass__SuperClassAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SmallClass__SuperClassAssignment_2_1_in_rule__SmallClass__Group_2__1__Impl1958);
            rule__SmallClass__SuperClassAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSmallClassAccess().getSuperClassAssignment_2_1()); 

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
    // $ANTLR end "rule__SmallClass__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1007:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1011:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1012:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01992);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01995);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1019:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__DatatypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1023:1: ( ( ( rule__Attribute__DatatypeAssignment_0 ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1024:1: ( ( rule__Attribute__DatatypeAssignment_0 ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1024:1: ( ( rule__Attribute__DatatypeAssignment_0 ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1025:1: ( rule__Attribute__DatatypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getDatatypeAssignment_0()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1026:1: ( rule__Attribute__DatatypeAssignment_0 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1026:2: rule__Attribute__DatatypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__DatatypeAssignment_0_in_rule__Attribute__Group__0__Impl2022);
            rule__Attribute__DatatypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDatatypeAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1036:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1040:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1041:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12052);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12055);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1048:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ArrayAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1052:1: ( ( ( rule__Attribute__ArrayAssignment_1 )? ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1053:1: ( ( rule__Attribute__ArrayAssignment_1 )? )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1053:1: ( ( rule__Attribute__ArrayAssignment_1 )? )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1054:1: ( rule__Attribute__ArrayAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getArrayAssignment_1()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1055:1: ( rule__Attribute__ArrayAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1055:2: rule__Attribute__ArrayAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__ArrayAssignment_1_in_rule__Attribute__Group__1__Impl2082);
                    rule__Attribute__ArrayAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getArrayAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1065:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1069:1: ( rule__Attribute__Group__2__Impl )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1070:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22113);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1076:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1080:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1081:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1081:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1082:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1083:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1083:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2140);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__DataType__Group_0__0"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1099:1: rule__DataType__Group_0__0 : rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 ;
    public final void rule__DataType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1103:1: ( rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1104:2: rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1
            {
            pushFollow(FOLLOW_rule__DataType__Group_0__0__Impl_in_rule__DataType__Group_0__02176);
            rule__DataType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group_0__1_in_rule__DataType__Group_0__02179);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1111:1: rule__DataType__Group_0__0__Impl : ( () ) ;
    public final void rule__DataType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1115:1: ( ( () ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1116:1: ( () )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1116:1: ( () )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1117:1: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1118:1: ()
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1120:1: 
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1130:1: rule__DataType__Group_0__1 : rule__DataType__Group_0__1__Impl ;
    public final void rule__DataType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1134:1: ( rule__DataType__Group_0__1__Impl )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1135:2: rule__DataType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group_0__1__Impl_in_rule__DataType__Group_0__12237);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1141:1: rule__DataType__Group_0__1__Impl : ( rulesimpleType ) ;
    public final void rule__DataType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1145:1: ( ( rulesimpleType ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1146:1: ( rulesimpleType )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1146:1: ( rulesimpleType )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1147:1: rulesimpleType
            {
             before(grammarAccess.getDataTypeAccess().getSimpleTypeParserRuleCall_0_1()); 
            pushFollow(FOLLOW_rulesimpleType_in_rule__DataType__Group_0__1__Impl2264);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1163:1: rule__NameSpace__NameAssignment_1 : ( ruleQName ) ;
    public final void rule__NameSpace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1167:1: ( ( ruleQName ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1168:1: ( ruleQName )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1168:1: ( ruleQName )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1169:1: ruleQName
            {
             before(grammarAccess.getNameSpaceAccess().getNameQNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQName_in_rule__NameSpace__NameAssignment_12302);
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
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1178:1: rule__NameSpace__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__NameSpace__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1182:1: ( ( ruleImport ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1183:1: ( ruleImport )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1183:1: ( ruleImport )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1184:1: ruleImport
            {
             before(grammarAccess.getNameSpaceAccess().getImportsImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__NameSpace__ImportsAssignment_22333);
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


    // $ANTLR start "rule__NameSpace__SmallClassAssignment_3"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1193:1: rule__NameSpace__SmallClassAssignment_3 : ( ruleSmallClass ) ;
    public final void rule__NameSpace__SmallClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1197:1: ( ( ruleSmallClass ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1198:1: ( ruleSmallClass )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1198:1: ( ruleSmallClass )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1199:1: ruleSmallClass
            {
             before(grammarAccess.getNameSpaceAccess().getSmallClassSmallClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSmallClass_in_rule__NameSpace__SmallClassAssignment_32364);
            ruleSmallClass();

            state._fsp--;

             after(grammarAccess.getNameSpaceAccess().getSmallClassSmallClassParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__NameSpace__SmallClassAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1208:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQNameWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1212:1: ( ( ruleQNameWildCard ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1213:1: ( ruleQNameWildCard )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1213:1: ( ruleQNameWildCard )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1214:1: ruleQNameWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQNameWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQNameWildCard_in_rule__Import__ImportedNamespaceAssignment_12395);
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


    // $ANTLR start "rule__SmallClass__NameAssignment_1"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1223:1: rule__SmallClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SmallClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1227:1: ( ( RULE_ID ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1228:1: ( RULE_ID )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1228:1: ( RULE_ID )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1229:1: RULE_ID
            {
             before(grammarAccess.getSmallClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallClass__NameAssignment_12426); 
             after(grammarAccess.getSmallClassAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SmallClass__NameAssignment_1"


    // $ANTLR start "rule__SmallClass__SuperClassAssignment_2_1"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1238:1: rule__SmallClass__SuperClassAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SmallClass__SuperClassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1242:1: ( ( ( RULE_ID ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1243:1: ( ( RULE_ID ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1243:1: ( ( RULE_ID ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1244:1: ( RULE_ID )
            {
             before(grammarAccess.getSmallClassAccess().getSuperClassSmallClassCrossReference_2_1_0()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1245:1: ( RULE_ID )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1246:1: RULE_ID
            {
             before(grammarAccess.getSmallClassAccess().getSuperClassSmallClassIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallClass__SuperClassAssignment_2_12461); 
             after(grammarAccess.getSmallClassAccess().getSuperClassSmallClassIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getSmallClassAccess().getSuperClassSmallClassCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__SmallClass__SuperClassAssignment_2_1"


    // $ANTLR start "rule__SmallClass__AttributesAssignment_4"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1257:1: rule__SmallClass__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__SmallClass__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1261:1: ( ( ruleAttribute ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1262:1: ( ruleAttribute )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1262:1: ( ruleAttribute )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1263:1: ruleAttribute
            {
             before(grammarAccess.getSmallClassAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__SmallClass__AttributesAssignment_42496);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSmallClassAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SmallClass__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__DatatypeAssignment_0"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1272:1: rule__Attribute__DatatypeAssignment_0 : ( ruleDataType ) ;
    public final void rule__Attribute__DatatypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1276:1: ( ( ruleDataType ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1277:1: ( ruleDataType )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1277:1: ( ruleDataType )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1278:1: ruleDataType
            {
             before(grammarAccess.getAttributeAccess().getDatatypeDataTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__Attribute__DatatypeAssignment_02527);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDatatypeDataTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__DatatypeAssignment_0"


    // $ANTLR start "rule__Attribute__ArrayAssignment_1"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1287:1: rule__Attribute__ArrayAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__Attribute__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1291:1: ( ( ( '[]' ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1292:1: ( ( '[]' ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1292:1: ( ( '[]' ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1293:1: ( '[]' )
            {
             before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1294:1: ( '[]' )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1295:1: '[]'
            {
             before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Attribute__ArrayAssignment_12563); 
             after(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Attribute__ArrayAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1310:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1314:1: ( ( RULE_ID ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1315:1: ( RULE_ID )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1315:1: ( RULE_ID )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1316:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_22602); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__SmallClassType__TypeAssignment"
    // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1325:1: rule__SmallClassType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SmallClassType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1329:1: ( ( ( RULE_ID ) ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1330:1: ( ( RULE_ID ) )
            {
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1330:1: ( ( RULE_ID ) )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1331:1: ( RULE_ID )
            {
             before(grammarAccess.getSmallClassTypeAccess().getTypeSmallClassCrossReference_0()); 
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1332:1: ( RULE_ID )
            // ../org.babu.xtext.training.smalljava.ui/src-gen/org/babu/xtext/training/smalljava/ui/contentassist/antlr/internal/InternalSmalljavaDsl.g:1333:1: RULE_ID
            {
             before(grammarAccess.getSmallClassTypeAccess().getTypeSmallClassIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallClassType__TypeAssignment2637); 
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
    public static final BitSet FOLLOW_ruleSmallClass_in_entryRuleSmallClass301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallClass308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__0_in_ruleSmallClass334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimpleType_in_entryRulesimpleType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimpleType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Alternatives_in_rulesimpleType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmallClassType_in_entryRulesmallClassType541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesmallClassType548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClassType__TypeAssignment_in_rulesmallClassType574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__0_in_rule__DataType__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmallClassType_in_rule__DataType__Alternatives628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SimpleType__Alternatives661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SimpleType__Alternatives681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SimpleType__Alternatives701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SimpleType__Alternatives721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__0__Impl_in_rule__NameSpace__Group__0753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__1_in_rule__NameSpace__Group__0756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NameSpace__Group__0__Impl784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__1__Impl_in_rule__NameSpace__Group__1815 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__2_in_rule__NameSpace__Group__1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameSpace__NameAssignment_1_in_rule__NameSpace__Group__1__Impl845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__2__Impl_in_rule__NameSpace__Group__2875 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__3_in_rule__NameSpace__Group__2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameSpace__ImportsAssignment_2_in_rule__NameSpace__Group__2__Impl905 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__NameSpace__Group__3__Impl_in_rule__NameSpace__Group__3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameSpace__SmallClassAssignment_3_in_rule__NameSpace__Group__3__Impl963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__0__Impl_in_rule__QName__Group__01001 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QName__Group__1_in_rule__QName__Group__01004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QName__Group__0__Impl1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group__1__Impl_in_rule__QName__Group__11060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group_1__0_in_rule__QName__Group__1__Impl1087 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__QName__Group_1__0__Impl_in_rule__QName__Group_1__01122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QName__Group_1__1_in_rule__QName__Group_1__01125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QName__Group_1__0__Impl1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QName__Group_1__1__Impl_in_rule__QName__Group_1__11184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QName__Group_1__1__Impl1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QNameWildCard__Group__0__Impl_in_rule__QNameWildCard__Group__01244 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__QNameWildCard__Group__1_in_rule__QNameWildCard__Group__01247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_rule__QNameWildCard__Group__0__Impl1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QNameWildCard__Group__1__Impl_in_rule__QNameWildCard__Group__11303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QNameWildCard__Group__1__Impl1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Import__Group__0__Impl1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__0__Impl_in_rule__SmallClass__Group__01492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__1_in_rule__SmallClass__Group__01495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SmallClass__Group__0__Impl1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__1__Impl_in_rule__SmallClass__Group__11554 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__2_in_rule__SmallClass__Group__11557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__NameAssignment_1_in_rule__SmallClass__Group__1__Impl1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__2__Impl_in_rule__SmallClass__Group__21614 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__3_in_rule__SmallClass__Group__21617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group_2__0_in_rule__SmallClass__Group__2__Impl1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__3__Impl_in_rule__SmallClass__Group__31675 = new BitSet(new long[]{0x0000000000207810L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__4_in_rule__SmallClass__Group__31678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SmallClass__Group__3__Impl1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__4__Impl_in_rule__SmallClass__Group__41737 = new BitSet(new long[]{0x0000000000207810L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__5_in_rule__SmallClass__Group__41740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__AttributesAssignment_4_in_rule__SmallClass__Group__4__Impl1767 = new BitSet(new long[]{0x0000000000007812L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__5__Impl_in_rule__SmallClass__Group__51798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SmallClass__Group__5__Impl1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group_2__0__Impl_in_rule__SmallClass__Group_2__01869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallClass__Group_2__1_in_rule__SmallClass__Group_2__01872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SmallClass__Group_2__0__Impl1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group_2__1__Impl_in_rule__SmallClass__Group_2__11931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__SuperClassAssignment_2_1_in_rule__SmallClass__Group_2__1__Impl1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01992 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DatatypeAssignment_0_in_rule__Attribute__Group__0__Impl2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12052 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ArrayAssignment_1_in_rule__Attribute__Group__1__Impl2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__0__Impl_in_rule__DataType__Group_0__02176 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__1_in_rule__DataType__Group_0__02179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_0__1__Impl_in_rule__DataType__Group_0__12237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimpleType_in_rule__DataType__Group_0__1__Impl2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_rule__NameSpace__NameAssignment_12302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__NameSpace__ImportsAssignment_22333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallClass_in_rule__NameSpace__SmallClassAssignment_32364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNameWildCard_in_rule__Import__ImportedNamespaceAssignment_12395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallClass__NameAssignment_12426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallClass__SuperClassAssignment_2_12461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__SmallClass__AttributesAssignment_42496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Attribute__DatatypeAssignment_02527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Attribute__ArrayAssignment_12563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_22602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallClassType__TypeAssignment2637 = new BitSet(new long[]{0x0000000000000002L});

}