/*
* generated by Xtext
*/
grammar InternalSmalljavaDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.babu.xtext.training.smalljava.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleNameSpace
entryRuleNameSpace 
:
{ before(grammarAccess.getNameSpaceRule()); }
	 ruleNameSpace
{ after(grammarAccess.getNameSpaceRule()); } 
	 EOF 
;

// Rule NameSpace
ruleNameSpace
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNameSpaceAccess().getGroup()); }
(rule__NameSpace__Group__0)
{ after(grammarAccess.getNameSpaceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQName
entryRuleQName 
:
{ before(grammarAccess.getQNameRule()); }
	 ruleQName
{ after(grammarAccess.getQNameRule()); } 
	 EOF 
;

// Rule QName
ruleQName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQNameAccess().getGroup()); }
(rule__QName__Group__0)
{ after(grammarAccess.getQNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQNameWildCard
entryRuleQNameWildCard 
:
{ before(grammarAccess.getQNameWildCardRule()); }
	 ruleQNameWildCard
{ after(grammarAccess.getQNameWildCardRule()); } 
	 EOF 
;

// Rule QNameWildCard
ruleQNameWildCard
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQNameWildCardAccess().getGroup()); }
(rule__QNameWildCard__Group__0)
{ after(grammarAccess.getQNameWildCardAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleImport
entryRuleImport 
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getImportAccess().getGroup()); }
(rule__Import__Group__0)
{ after(grammarAccess.getImportAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSmallClass
entryRuleSmallClass 
:
{ before(grammarAccess.getSmallClassRule()); }
	 ruleSmallClass
{ after(grammarAccess.getSmallClassRule()); } 
	 EOF 
;

// Rule SmallClass
ruleSmallClass
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSmallClassAccess().getGroup()); }
(rule__SmallClass__Group__0)
{ after(grammarAccess.getSmallClassAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAttribute
entryRuleAttribute 
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAttributeAccess().getGroup()); }
(rule__Attribute__Group__0)
{ after(grammarAccess.getAttributeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDataType
entryRuleDataType 
:
{ before(grammarAccess.getDataTypeRule()); }
	 ruleDataType
{ after(grammarAccess.getDataTypeRule()); } 
	 EOF 
;

// Rule DataType
ruleDataType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDataTypeAccess().getAlternatives()); }
(rule__DataType__Alternatives)
{ after(grammarAccess.getDataTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulesimpleType
entryRulesimpleType 
:
{ before(grammarAccess.getSimpleTypeRule()); }
	 rulesimpleType
{ after(grammarAccess.getSimpleTypeRule()); } 
	 EOF 
;

// Rule simpleType
rulesimpleType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSimpleTypeAccess().getAlternatives()); }
(rule__SimpleType__Alternatives)
{ after(grammarAccess.getSimpleTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulesmallClassType
entryRulesmallClassType 
:
{ before(grammarAccess.getSmallClassTypeRule()); }
	 rulesmallClassType
{ after(grammarAccess.getSmallClassTypeRule()); } 
	 EOF 
;

// Rule smallClassType
rulesmallClassType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSmallClassTypeAccess().getTypeAssignment()); }
(rule__SmallClassType__TypeAssignment)
{ after(grammarAccess.getSmallClassTypeAccess().getTypeAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__DataType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getGroup_0()); }
(rule__DataType__Group_0__0)
{ after(grammarAccess.getDataTypeAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getDataTypeAccess().getSmallClassTypeParserRuleCall_1()); }
	rulesmallClassType
{ after(grammarAccess.getDataTypeAccess().getSmallClassTypeParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); }

	'String' 

{ after(grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); }
)

    |(
{ before(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_1()); }

	'boolean' 

{ after(grammarAccess.getSimpleTypeAccess().getBooleanKeyword_1()); }
)

    |(
{ before(grammarAccess.getSimpleTypeAccess().getIntKeyword_2()); }

	'int' 

{ after(grammarAccess.getSimpleTypeAccess().getIntKeyword_2()); }
)

    |(
{ before(grammarAccess.getSimpleTypeAccess().getFloatKeyword_3()); }

	'float' 

{ after(grammarAccess.getSimpleTypeAccess().getFloatKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__NameSpace__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NameSpace__Group__0__Impl
	rule__NameSpace__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NameSpace__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNameSpaceAccess().getNamespaceKeyword_0()); }

	'namespace' 

{ after(grammarAccess.getNameSpaceAccess().getNamespaceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NameSpace__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NameSpace__Group__1__Impl
	rule__NameSpace__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NameSpace__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNameSpaceAccess().getNameAssignment_1()); }
(rule__NameSpace__NameAssignment_1)
{ after(grammarAccess.getNameSpaceAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NameSpace__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NameSpace__Group__2__Impl
	rule__NameSpace__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__NameSpace__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNameSpaceAccess().getImportsAssignment_2()); }
(rule__NameSpace__ImportsAssignment_2)*
{ after(grammarAccess.getNameSpaceAccess().getImportsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NameSpace__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NameSpace__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NameSpace__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNameSpaceAccess().getSmallClassAssignment_3()); }
(rule__NameSpace__SmallClassAssignment_3)
{ after(grammarAccess.getNameSpaceAccess().getSmallClassAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__QName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QName__Group__0__Impl
	rule__QName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQNameAccess().getGroup_1()); }
(rule__QName__Group_1__0)*
{ after(grammarAccess.getQNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QName__Group_1__0__Impl
	rule__QName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QNameWildCard__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QNameWildCard__Group__0__Impl
	rule__QNameWildCard__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QNameWildCard__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQNameWildCardAccess().getQNameParserRuleCall_0()); }
	ruleQName
{ after(grammarAccess.getQNameWildCardAccess().getQNameParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QNameWildCard__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QNameWildCard__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QNameWildCard__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQNameWildCardAccess().getAsteriskKeyword_1()); }
(
	'*' 
)?
{ after(grammarAccess.getQNameWildCardAccess().getAsteriskKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Import__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }

	'import' 

{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Import__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
(rule__Import__ImportedNamespaceAssignment_1)
{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__SmallClass__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallClass__Group__0__Impl
	rule__SmallClass__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallClass__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallClassAccess().getClassKeyword_0()); }

	'class' 

{ after(grammarAccess.getSmallClassAccess().getClassKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallClass__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallClass__Group__1__Impl
	rule__SmallClass__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallClass__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallClassAccess().getNameAssignment_1()); }
(rule__SmallClass__NameAssignment_1)
{ after(grammarAccess.getSmallClassAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallClass__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallClass__Group__2__Impl
	rule__SmallClass__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallClass__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallClassAccess().getGroup_2()); }
(rule__SmallClass__Group_2__0)?
{ after(grammarAccess.getSmallClassAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallClass__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallClass__Group__3__Impl
	rule__SmallClass__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallClass__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallClassAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getSmallClassAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallClass__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallClass__Group__4__Impl
	rule__SmallClass__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallClass__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallClassAccess().getAttributesAssignment_4()); }
(rule__SmallClass__AttributesAssignment_4)*
{ after(grammarAccess.getSmallClassAccess().getAttributesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallClass__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallClass__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallClass__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getSmallClassAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__SmallClass__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallClass__Group_2__0__Impl
	rule__SmallClass__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallClass__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallClassAccess().getExtendsKeyword_2_0()); }

	'extends' 

{ after(grammarAccess.getSmallClassAccess().getExtendsKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SmallClass__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SmallClass__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SmallClass__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallClassAccess().getSuperClassAssignment_2_1()); }
(rule__SmallClass__SuperClassAssignment_2_1)
{ after(grammarAccess.getSmallClassAccess().getSuperClassAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Attribute__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getDatatypeAssignment_0()); }
(rule__Attribute__DatatypeAssignment_0)
{ after(grammarAccess.getAttributeAccess().getDatatypeAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getArrayAssignment_1()); }
(rule__Attribute__ArrayAssignment_1)?
{ after(grammarAccess.getAttributeAccess().getArrayAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getNameAssignment_2()); }
(rule__Attribute__NameAssignment_2)
{ after(grammarAccess.getAttributeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__DataType__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group_0__0__Impl
	rule__DataType__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); }
(

)
{ after(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getSimpleTypeParserRuleCall_0_1()); }
	rulesimpleType
{ after(grammarAccess.getDataTypeAccess().getSimpleTypeParserRuleCall_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__NameSpace__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNameSpaceAccess().getNameQNameParserRuleCall_1_0()); }
	ruleQName{ after(grammarAccess.getNameSpaceAccess().getNameQNameParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NameSpace__ImportsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNameSpaceAccess().getImportsImportParserRuleCall_2_0()); }
	ruleImport{ after(grammarAccess.getNameSpaceAccess().getImportsImportParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NameSpace__SmallClassAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNameSpaceAccess().getSmallClassSmallClassParserRuleCall_3_0()); }
	ruleSmallClass{ after(grammarAccess.getNameSpaceAccess().getSmallClassSmallClassParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportedNamespaceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportedNamespaceQNameWildCardParserRuleCall_1_0()); }
	ruleQNameWildCard{ after(grammarAccess.getImportAccess().getImportedNamespaceQNameWildCardParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SmallClass__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallClassAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getSmallClassAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SmallClass__SuperClassAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallClassAccess().getSuperClassSmallClassCrossReference_2_1_0()); }
(
{ before(grammarAccess.getSmallClassAccess().getSuperClassSmallClassIDTerminalRuleCall_2_1_0_1()); }
	RULE_ID{ after(grammarAccess.getSmallClassAccess().getSuperClassSmallClassIDTerminalRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getSmallClassAccess().getSuperClassSmallClassCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SmallClass__AttributesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallClassAccess().getAttributesAttributeParserRuleCall_4_0()); }
	ruleAttribute{ after(grammarAccess.getSmallClassAccess().getAttributesAttributeParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__DatatypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getDatatypeDataTypeParserRuleCall_0_0()); }
	ruleDataType{ after(grammarAccess.getAttributeAccess().getDatatypeDataTypeParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__ArrayAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); }
(
{ before(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); }

	'[]' 

{ after(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); }
)

{ after(grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SmallClassType__TypeAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSmallClassTypeAccess().getTypeSmallClassCrossReference_0()); }
(
{ before(grammarAccess.getSmallClassTypeAccess().getTypeSmallClassIDTerminalRuleCall_0_1()); }
	RULE_ID{ after(grammarAccess.getSmallClassTypeAccess().getTypeSmallClassIDTerminalRuleCall_0_1()); }
)
{ after(grammarAccess.getSmallClassTypeAccess().getTypeSmallClassCrossReference_0()); }
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

