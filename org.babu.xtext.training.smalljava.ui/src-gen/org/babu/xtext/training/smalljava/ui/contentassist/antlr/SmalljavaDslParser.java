/*
* generated by Xtext
*/
package org.babu.xtext.training.smalljava.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.babu.xtext.training.smalljava.services.SmalljavaDslGrammarAccess;

public class SmalljavaDslParser extends AbstractContentAssistParser {
	
	@Inject
	private SmalljavaDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.babu.xtext.training.smalljava.ui.contentassist.antlr.internal.InternalSmalljavaDslParser createParser() {
		org.babu.xtext.training.smalljava.ui.contentassist.antlr.internal.InternalSmalljavaDslParser result = new org.babu.xtext.training.smalljava.ui.contentassist.antlr.internal.InternalSmalljavaDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
					put(grammarAccess.getSimpleTypeAccess().getAlternatives(), "rule__SimpleType__Alternatives");
					put(grammarAccess.getNameSpaceAccess().getGroup(), "rule__NameSpace__Group__0");
					put(grammarAccess.getQNameAccess().getGroup(), "rule__QName__Group__0");
					put(grammarAccess.getQNameAccess().getGroup_1(), "rule__QName__Group_1__0");
					put(grammarAccess.getQNameWildCardAccess().getGroup(), "rule__QNameWildCard__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getSmallClassAccess().getGroup(), "rule__SmallClass__Group__0");
					put(grammarAccess.getSmallClassAccess().getGroup_2(), "rule__SmallClass__Group_2__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getDataTypeAccess().getGroup_0(), "rule__DataType__Group_0__0");
					put(grammarAccess.getNameSpaceAccess().getNameAssignment_1(), "rule__NameSpace__NameAssignment_1");
					put(grammarAccess.getNameSpaceAccess().getImportsAssignment_2(), "rule__NameSpace__ImportsAssignment_2");
					put(grammarAccess.getNameSpaceAccess().getSmallClassAssignment_3(), "rule__NameSpace__SmallClassAssignment_3");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getSmallClassAccess().getNameAssignment_1(), "rule__SmallClass__NameAssignment_1");
					put(grammarAccess.getSmallClassAccess().getSuperClassAssignment_2_1(), "rule__SmallClass__SuperClassAssignment_2_1");
					put(grammarAccess.getSmallClassAccess().getAttributesAssignment_4(), "rule__SmallClass__AttributesAssignment_4");
					put(grammarAccess.getAttributeAccess().getDatatypeAssignment_0(), "rule__Attribute__DatatypeAssignment_0");
					put(grammarAccess.getAttributeAccess().getArrayAssignment_1(), "rule__Attribute__ArrayAssignment_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_2(), "rule__Attribute__NameAssignment_2");
					put(grammarAccess.getSmallClassTypeAccess().getTypeAssignment(), "rule__SmallClassType__TypeAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.babu.xtext.training.smalljava.ui.contentassist.antlr.internal.InternalSmalljavaDslParser typedParser = (org.babu.xtext.training.smalljava.ui.contentassist.antlr.internal.InternalSmalljavaDslParser) parser;
			typedParser.entryRuleNameSpace();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SmalljavaDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SmalljavaDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}