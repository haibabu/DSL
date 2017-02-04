/*
* generated by Xtext
*/
grammar InternalMyCCT;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package com.babu.xtext.cct.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.babu.xtext.cct.ui.contentassist.antlr.internal; 

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
import com.babu.xtext.cct.services.MyCCTGrammarAccess;

}

@parser::members {
 
 	private MyCCTGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(MyCCTGrammarAccess grammarAccess) {
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

}




// Entry rule entryRuleCCT
entryRuleCCT 
:
{ before(grammarAccess.getCCTRule()); }
	 ruleCCT
{ after(grammarAccess.getCCTRule()); } 
	 EOF 
;

// Rule CCT
ruleCCT
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCCTAccess().getGroup()); }
(rule__CCT__Group__0)
{ after(grammarAccess.getCCTAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFile
entryRuleFile 
:
{ before(grammarAccess.getFileRule()); }
	 ruleFile
{ after(grammarAccess.getFileRule()); } 
	 EOF 
;

// Rule File
ruleFile
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFileAccess().getGroup()); }
(rule__File__Group__0)
{ after(grammarAccess.getFileAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLoop
entryRuleLoop 
:
{ before(grammarAccess.getLoopRule()); }
	 ruleLoop
{ after(grammarAccess.getLoopRule()); } 
	 EOF 
;

// Rule Loop
ruleLoop
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLoopAccess().getGroup()); }
(rule__Loop__Group__0)
{ after(grammarAccess.getLoopAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCondition
entryRuleCondition 
:
{ before(grammarAccess.getConditionRule()); }
	 ruleCondition
{ after(grammarAccess.getConditionRule()); } 
	 EOF 
;

// Rule Condition
ruleCondition
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getConditionAccess().getGroup()); }
(rule__Condition__Group__0)
{ after(grammarAccess.getConditionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleValue
entryRuleValue 
:
{ before(grammarAccess.getValueRule()); }
	 ruleValue
{ after(grammarAccess.getValueRule()); } 
	 EOF 
;

// Rule Value
ruleValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getValueAccess().getGroup()); }
(rule__Value__Group__0)
{ after(grammarAccess.getValueAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__CCT__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CCT__Group__0__Impl
	rule__CCT__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CCT__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCCTAccess().getFileAssignment_0()); }
(rule__CCT__FileAssignment_0)
{ after(grammarAccess.getCCTAccess().getFileAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__CCT__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CCT__Group__1__Impl
	rule__CCT__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CCT__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCCTAccess().getLoopAssignment_1()); }
(rule__CCT__LoopAssignment_1)*
{ after(grammarAccess.getCCTAccess().getLoopAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__CCT__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CCT__Group__2__Impl
	rule__CCT__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CCT__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCCTAccess().getConditionAssignment_2()); }
(rule__CCT__ConditionAssignment_2)
{ after(grammarAccess.getCCTAccess().getConditionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__CCT__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CCT__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CCT__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCCTAccess().getValueAssignment_3()); }
(rule__CCT__ValueAssignment_3)
{ after(grammarAccess.getCCTAccess().getValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__File__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__File__Group__0__Impl
	rule__File__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFileAccess().getFILEKeyword_0()); }

	'@FILE(' 

{ after(grammarAccess.getFileAccess().getFILEKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__File__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__File__Group__1__Impl
	rule__File__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFileAccess().getNameAssignment_1()); }
(rule__File__NameAssignment_1)
{ after(grammarAccess.getFileAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__File__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__File__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__File__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFileAccess().getRightParenthesisKeyword_2()); }

	')' 

{ after(grammarAccess.getFileAccess().getRightParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Loop__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Loop__Group__0__Impl
	rule__Loop__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLoopAccess().getFORKeyword_0()); }

	'@FOR(' 

{ after(grammarAccess.getLoopAccess().getFORKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Loop__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Loop__Group__1__Impl
	rule__Loop__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLoopAccess().getNameAssignment_1()); }
(rule__Loop__NameAssignment_1)
{ after(grammarAccess.getLoopAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Loop__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Loop__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_2()); }

	')' 

{ after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Condition__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Condition__Group__0__Impl
	rule__Condition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionAccess().getIFKeyword_0()); }

	'@IF(' 

{ after(grammarAccess.getConditionAccess().getIFKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Condition__Group__1__Impl
	rule__Condition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionAccess().getNameAssignment_1()); }
(rule__Condition__NameAssignment_1)
{ after(grammarAccess.getConditionAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Condition__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionAccess().getRightParenthesisKeyword_2()); }

	')' 

{ after(grammarAccess.getConditionAccess().getRightParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Value__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Value__Group__0__Impl
	rule__Value__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getVALUEKeyword_0()); }

	'@VALUE(' 

{ after(grammarAccess.getValueAccess().getVALUEKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Value__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Value__Group__1__Impl
	rule__Value__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getNameAssignment_1()); }
(rule__Value__NameAssignment_1)
{ after(grammarAccess.getValueAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Value__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Value__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getRightParenthesisKeyword_2()); }

	')' 

{ after(grammarAccess.getValueAccess().getRightParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__CCT__FileAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCCTAccess().getFileFileParserRuleCall_0_0()); }
	ruleFile{ after(grammarAccess.getCCTAccess().getFileFileParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__CCT__LoopAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCCTAccess().getLoopLoopParserRuleCall_1_0()); }
	ruleLoop{ after(grammarAccess.getCCTAccess().getLoopLoopParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__CCT__ConditionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCCTAccess().getConditionConditionParserRuleCall_2_0()); }
	ruleCondition{ after(grammarAccess.getCCTAccess().getConditionConditionParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__CCT__ValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCCTAccess().getValueValueParserRuleCall_3_0()); }
	ruleValue{ after(grammarAccess.getCCTAccess().getValueValueParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__File__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFileAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getFileAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLoopAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getLoopAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Value__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

