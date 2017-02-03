package org.babu.xtext.training.smalljava.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.babu.xtext.training.smalljava.services.SmalljavaDslGrammarAccess;
import org.babu.xtext.training.smalljava.smalljavaDsl.Attribute;
import org.babu.xtext.training.smalljava.smalljavaDsl.DataType;
import org.babu.xtext.training.smalljava.smalljavaDsl.Import;
import org.babu.xtext.training.smalljava.smalljavaDsl.NameSpace;
import org.babu.xtext.training.smalljava.smalljavaDsl.SmallClass;
import org.babu.xtext.training.smalljava.smalljavaDsl.SmalljavaDslPackage;
import org.babu.xtext.training.smalljava.smalljavaDsl.smallClassType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SmalljavaDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmalljavaDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SmalljavaDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SmalljavaDslPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case SmalljavaDslPackage.DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule()) {
					sequence_DataType(context, (DataType) semanticObject); 
					return; 
				}
				else break;
			case SmalljavaDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case SmalljavaDslPackage.NAME_SPACE:
				if(context == grammarAccess.getNameSpaceRule()) {
					sequence_NameSpace(context, (NameSpace) semanticObject); 
					return; 
				}
				else break;
			case SmalljavaDslPackage.SMALL_CLASS:
				if(context == grammarAccess.getSmallClassRule()) {
					sequence_SmallClass(context, (SmallClass) semanticObject); 
					return; 
				}
				else break;
			case SmalljavaDslPackage.SMALL_CLASS_TYPE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getSmallClassTypeRule()) {
					sequence_smallClassType(context, (smallClassType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (datatype=DataType array?='[]'? name=ID)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DataType}
	 */
	protected void sequence_DataType(EObject context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QNameWildCard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmalljavaDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmalljavaDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQNameWildCardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QName imports+=Import* smallClass=SmallClass)
	 */
	protected void sequence_NameSpace(EObject context, NameSpace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superClass=[SmallClass|ID]? attributes+=Attribute*)
	 */
	protected void sequence_SmallClass(EObject context, SmallClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=[SmallClass|ID]
	 */
	protected void sequence_smallClassType(EObject context, smallClassType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmalljavaDslPackage.Literals.SMALL_CLASS_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmalljavaDslPackage.Literals.SMALL_CLASS_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSmallClassTypeAccess().getTypeSmallClassIDTerminalRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
}
