package org.xtext.example.java.ui.contentassist.antlr.internal; 

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
import org.xtext.example.java.services.MyJava1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyJava1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'{'", "'}'", "'extends'"
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
    public String getGrammarFileName() { return "../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g"; }


     
     	private MyJava1GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyJava1GrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSmallClass"
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:60:1: entryRuleSmallClass : ruleSmallClass EOF ;
    public final void entryRuleSmallClass() throws RecognitionException {
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:61:1: ( ruleSmallClass EOF )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:62:1: ruleSmallClass EOF
            {
             before(grammarAccess.getSmallClassRule()); 
            pushFollow(FOLLOW_ruleSmallClass_in_entryRuleSmallClass61);
            ruleSmallClass();

            state._fsp--;

             after(grammarAccess.getSmallClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallClass68); 

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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:69:1: ruleSmallClass : ( ( rule__SmallClass__Group__0 ) ) ;
    public final void ruleSmallClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:73:2: ( ( ( rule__SmallClass__Group__0 ) ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:74:1: ( ( rule__SmallClass__Group__0 ) )
            {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:74:1: ( ( rule__SmallClass__Group__0 ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:75:1: ( rule__SmallClass__Group__0 )
            {
             before(grammarAccess.getSmallClassAccess().getGroup()); 
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:76:1: ( rule__SmallClass__Group__0 )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:76:2: rule__SmallClass__Group__0
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__0_in_ruleSmallClass94);
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


    // $ANTLR start "rule__SmallClass__Group__0"
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:90:1: rule__SmallClass__Group__0 : rule__SmallClass__Group__0__Impl rule__SmallClass__Group__1 ;
    public final void rule__SmallClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:94:1: ( rule__SmallClass__Group__0__Impl rule__SmallClass__Group__1 )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:95:2: rule__SmallClass__Group__0__Impl rule__SmallClass__Group__1
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__0__Impl_in_rule__SmallClass__Group__0128);
            rule__SmallClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__1_in_rule__SmallClass__Group__0131);
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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:102:1: rule__SmallClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__SmallClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:106:1: ( ( 'class' ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:107:1: ( 'class' )
            {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:107:1: ( 'class' )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:108:1: 'class'
            {
             before(grammarAccess.getSmallClassAccess().getClassKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__SmallClass__Group__0__Impl159); 
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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:121:1: rule__SmallClass__Group__1 : rule__SmallClass__Group__1__Impl rule__SmallClass__Group__2 ;
    public final void rule__SmallClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:125:1: ( rule__SmallClass__Group__1__Impl rule__SmallClass__Group__2 )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:126:2: rule__SmallClass__Group__1__Impl rule__SmallClass__Group__2
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__1__Impl_in_rule__SmallClass__Group__1190);
            rule__SmallClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__2_in_rule__SmallClass__Group__1193);
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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:133:1: rule__SmallClass__Group__1__Impl : ( ( rule__SmallClass__NameAssignment_1 ) ) ;
    public final void rule__SmallClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:137:1: ( ( ( rule__SmallClass__NameAssignment_1 ) ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:138:1: ( ( rule__SmallClass__NameAssignment_1 ) )
            {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:138:1: ( ( rule__SmallClass__NameAssignment_1 ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:139:1: ( rule__SmallClass__NameAssignment_1 )
            {
             before(grammarAccess.getSmallClassAccess().getNameAssignment_1()); 
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:140:1: ( rule__SmallClass__NameAssignment_1 )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:140:2: rule__SmallClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SmallClass__NameAssignment_1_in_rule__SmallClass__Group__1__Impl220);
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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:150:1: rule__SmallClass__Group__2 : rule__SmallClass__Group__2__Impl rule__SmallClass__Group__3 ;
    public final void rule__SmallClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:154:1: ( rule__SmallClass__Group__2__Impl rule__SmallClass__Group__3 )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:155:2: rule__SmallClass__Group__2__Impl rule__SmallClass__Group__3
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__2__Impl_in_rule__SmallClass__Group__2250);
            rule__SmallClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__3_in_rule__SmallClass__Group__2253);
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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:162:1: rule__SmallClass__Group__2__Impl : ( ( rule__SmallClass__Group_2__0 )? ) ;
    public final void rule__SmallClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:166:1: ( ( ( rule__SmallClass__Group_2__0 )? ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:167:1: ( ( rule__SmallClass__Group_2__0 )? )
            {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:167:1: ( ( rule__SmallClass__Group_2__0 )? )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:168:1: ( rule__SmallClass__Group_2__0 )?
            {
             before(grammarAccess.getSmallClassAccess().getGroup_2()); 
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:169:1: ( rule__SmallClass__Group_2__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:169:2: rule__SmallClass__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SmallClass__Group_2__0_in_rule__SmallClass__Group__2__Impl280);
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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:179:1: rule__SmallClass__Group__3 : rule__SmallClass__Group__3__Impl rule__SmallClass__Group__4 ;
    public final void rule__SmallClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:183:1: ( rule__SmallClass__Group__3__Impl rule__SmallClass__Group__4 )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:184:2: rule__SmallClass__Group__3__Impl rule__SmallClass__Group__4
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__3__Impl_in_rule__SmallClass__Group__3311);
            rule__SmallClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group__4_in_rule__SmallClass__Group__3314);
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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:191:1: rule__SmallClass__Group__3__Impl : ( '{' ) ;
    public final void rule__SmallClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:195:1: ( ( '{' ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:196:1: ( '{' )
            {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:196:1: ( '{' )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:197:1: '{'
            {
             before(grammarAccess.getSmallClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__SmallClass__Group__3__Impl342); 
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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:210:1: rule__SmallClass__Group__4 : rule__SmallClass__Group__4__Impl ;
    public final void rule__SmallClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:214:1: ( rule__SmallClass__Group__4__Impl )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:215:2: rule__SmallClass__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SmallClass__Group__4__Impl_in_rule__SmallClass__Group__4373);
            rule__SmallClass__Group__4__Impl();

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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:221:1: rule__SmallClass__Group__4__Impl : ( '}' ) ;
    public final void rule__SmallClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:225:1: ( ( '}' ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:226:1: ( '}' )
            {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:226:1: ( '}' )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:227:1: '}'
            {
             before(grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__SmallClass__Group__4__Impl401); 
             after(grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__SmallClass__Group_2__0"
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:250:1: rule__SmallClass__Group_2__0 : rule__SmallClass__Group_2__0__Impl rule__SmallClass__Group_2__1 ;
    public final void rule__SmallClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:254:1: ( rule__SmallClass__Group_2__0__Impl rule__SmallClass__Group_2__1 )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:255:2: rule__SmallClass__Group_2__0__Impl rule__SmallClass__Group_2__1
            {
            pushFollow(FOLLOW_rule__SmallClass__Group_2__0__Impl_in_rule__SmallClass__Group_2__0442);
            rule__SmallClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmallClass__Group_2__1_in_rule__SmallClass__Group_2__0445);
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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:262:1: rule__SmallClass__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__SmallClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:266:1: ( ( 'extends' ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:267:1: ( 'extends' )
            {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:267:1: ( 'extends' )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:268:1: 'extends'
            {
             before(grammarAccess.getSmallClassAccess().getExtendsKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__SmallClass__Group_2__0__Impl473); 
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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:281:1: rule__SmallClass__Group_2__1 : rule__SmallClass__Group_2__1__Impl ;
    public final void rule__SmallClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:285:1: ( rule__SmallClass__Group_2__1__Impl )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:286:2: rule__SmallClass__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SmallClass__Group_2__1__Impl_in_rule__SmallClass__Group_2__1504);
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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:292:1: rule__SmallClass__Group_2__1__Impl : ( ( rule__SmallClass__SuperClassAssignment_2_1 ) ) ;
    public final void rule__SmallClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:296:1: ( ( ( rule__SmallClass__SuperClassAssignment_2_1 ) ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:297:1: ( ( rule__SmallClass__SuperClassAssignment_2_1 ) )
            {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:297:1: ( ( rule__SmallClass__SuperClassAssignment_2_1 ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:298:1: ( rule__SmallClass__SuperClassAssignment_2_1 )
            {
             before(grammarAccess.getSmallClassAccess().getSuperClassAssignment_2_1()); 
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:299:1: ( rule__SmallClass__SuperClassAssignment_2_1 )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:299:2: rule__SmallClass__SuperClassAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SmallClass__SuperClassAssignment_2_1_in_rule__SmallClass__Group_2__1__Impl531);
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


    // $ANTLR start "rule__SmallClass__NameAssignment_1"
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:314:1: rule__SmallClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SmallClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:318:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:319:1: ( RULE_ID )
            {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:319:1: ( RULE_ID )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:320:1: RULE_ID
            {
             before(grammarAccess.getSmallClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallClass__NameAssignment_1570); 
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
    // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:329:1: rule__SmallClass__SuperClassAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SmallClass__SuperClassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:333:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:334:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:334:1: ( ( RULE_ID ) )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:335:1: ( RULE_ID )
            {
             before(grammarAccess.getSmallClassAccess().getSuperClassSmallClassCrossReference_2_1_0()); 
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:336:1: ( RULE_ID )
            // ../org.xtext.example.myjava1.ui/src-gen/org/xtext/example/java/ui/contentassist/antlr/internal/InternalMyJava1.g:337:1: RULE_ID
            {
             before(grammarAccess.getSmallClassAccess().getSuperClassSmallClassIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmallClass__SuperClassAssignment_2_1605); 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSmallClass_in_entryRuleSmallClass61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallClass68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__0_in_ruleSmallClass94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__0__Impl_in_rule__SmallClass__Group__0128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__1_in_rule__SmallClass__Group__0131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SmallClass__Group__0__Impl159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__1__Impl_in_rule__SmallClass__Group__1190 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__2_in_rule__SmallClass__Group__1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__NameAssignment_1_in_rule__SmallClass__Group__1__Impl220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__2__Impl_in_rule__SmallClass__Group__2250 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__3_in_rule__SmallClass__Group__2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group_2__0_in_rule__SmallClass__Group__2__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__3__Impl_in_rule__SmallClass__Group__3311 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__4_in_rule__SmallClass__Group__3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SmallClass__Group__3__Impl342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group__4__Impl_in_rule__SmallClass__Group__4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SmallClass__Group__4__Impl401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group_2__0__Impl_in_rule__SmallClass__Group_2__0442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmallClass__Group_2__1_in_rule__SmallClass__Group_2__0445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SmallClass__Group_2__0__Impl473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__Group_2__1__Impl_in_rule__SmallClass__Group_2__1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmallClass__SuperClassAssignment_2_1_in_rule__SmallClass__Group_2__1__Impl531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallClass__NameAssignment_1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmallClass__SuperClassAssignment_2_1605 = new BitSet(new long[]{0x0000000000000002L});

}