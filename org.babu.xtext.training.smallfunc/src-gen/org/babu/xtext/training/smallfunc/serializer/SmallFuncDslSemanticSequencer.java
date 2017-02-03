package org.babu.xtext.training.smallfunc.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.babu.xtext.training.smallfunc.services.SmallFuncDslGrammarAccess;
import org.babu.xtext.training.smallfunc.smallFuncDsl.Attribute;
import org.babu.xtext.training.smallfunc.smallFuncDsl.DataType;
import org.babu.xtext.training.smallfunc.smallFuncDsl.Import;
import org.babu.xtext.training.smallfunc.smallFuncDsl.NameSpace;
import org.babu.xtext.training.smallfunc.smallFuncDsl.Param;
import org.babu.xtext.training.smallfunc.smallFuncDsl.SmallFunc;
import org.babu.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslPackage;
import org.babu.xtext.training.smallfunc.smallFuncDsl.smallClassType;
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
public class SmallFuncDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmallFuncDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SmallFuncDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SmallFuncDslPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case SmallFuncDslPackage.DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule()) {
					sequence_DataType(context, (DataType) semanticObject); 
					return; 
				}
				else break;
			case SmallFuncDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case SmallFuncDslPackage.NAME_SPACE:
				if(context == grammarAccess.getNameSpaceRule()) {
					sequence_NameSpace(context, (NameSpace) semanticObject); 
					return; 
				}
				else break;
			case SmallFuncDslPackage.PARAM:
				if(context == grammarAccess.getParamRule()) {
					sequence_Param(context, (Param) semanticObject); 
					return; 
				}
				else break;
			case SmallFuncDslPackage.SMALL_FUNC:
				if(context == grammarAccess.getSmallFuncRule()) {
					sequence_SmallFunc(context, (SmallFunc) semanticObject); 
					return; 
				}
				else break;
			case SmallFuncDslPackage.SMALL_CLASS_TYPE:
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
			if(transientValues.isValueTransient(semanticObject, SmallFuncDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallFuncDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQNameWildCardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QName imports+=Import* smallFunc=SmallFunc)
	 */
	protected void sequence_NameSpace(EObject context, NameSpace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dataType=DataType name=ID)
	 */
	protected void sequence_Param(EObject context, Param semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallFuncDslPackage.Literals.PARAM__DATA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallFuncDslPackage.Literals.PARAM__DATA_TYPE));
			if(transientValues.isValueTransient(semanticObject, SmallFuncDslPackage.Literals.PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallFuncDslPackage.Literals.PARAM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamAccess().getDataTypeDataTypeParserRuleCall_0_0(), semanticObject.getDataType());
		feeder.accept(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (params+=Param params+=Param*)?)
	 */
	protected void sequence_SmallFunc(EObject context, SmallFunc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=[SmallClass|ID]
	 */
	protected void sequence_smallClassType(EObject context, smallClassType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallFuncDslPackage.Literals.SMALL_CLASS_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallFuncDslPackage.Literals.SMALL_CLASS_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSmallClassTypeAccess().getTypeSmallClassIDTerminalRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
}
