/*
* generated by Xtext
*/
grammar InternalMyCCT;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.babu.xtext.cct.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleCCT
entryRuleCCT returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCCTRule()); }
	 iv_ruleCCT=ruleCCT 
	 { $current=$iv_ruleCCT.current; } 
	 EOF 
;

// Rule CCT
ruleCCT returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getCCTAccess().getFileFileParserRuleCall_0_0()); 
	    }
		lv_file_0_0=ruleFile		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCCTRule());
	        }
       		set(
       			$current, 
       			"file",
        		lv_file_0_0, 
        		"File");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getCCTAccess().getLoopLoopParserRuleCall_1_0()); 
	    }
		lv_Loop_1_0=ruleLoop		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCCTRule());
	        }
       		add(
       			$current, 
       			"Loop",
        		lv_Loop_1_0, 
        		"Loop");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getCCTAccess().getConditionConditionParserRuleCall_2_0()); 
	    }
		lv_condition_2_0=ruleCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCCTRule());
	        }
       		add(
       			$current, 
       			"condition",
        		lv_condition_2_0, 
        		"Condition");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getCCTAccess().getValueValueParserRuleCall_3_0()); 
	    }
		lv_value_3_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCCTRule());
	        }
       		add(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFile
entryRuleFile returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFileRule()); }
	 iv_ruleFile=ruleFile 
	 { $current=$iv_ruleFile.current; } 
	 EOF 
;

// Rule File
ruleFile returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='@FILE(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFileAccess().getFILEKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getFileAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFileRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFileAccess().getRightParenthesisKeyword_2());
    }
)
;





// Entry rule entryRuleLoop
entryRuleLoop returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLoopRule()); }
	 iv_ruleLoop=ruleLoop 
	 { $current=$iv_ruleLoop.current; } 
	 EOF 
;

// Rule Loop
ruleLoop returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='@FOR(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getFORKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getLoopAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLoopRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getRightParenthesisKeyword_2());
    }
)
;





// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	 iv_ruleCondition=ruleCondition 
	 { $current=$iv_ruleCondition.current; } 
	 EOF 
;

// Rule Condition
ruleCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='@IF(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIFKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getRightParenthesisKeyword_2());
    }
)
;





// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	 iv_ruleValue=ruleValue 
	 { $current=$iv_ruleValue.current; } 
	 EOF 
;

// Rule Value
ruleValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='@VALUE(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getValueAccess().getVALUEKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getValueAccess().getRightParenthesisKeyword_2());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


