package org.xtext.example.java.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.example.java.myJava1.MyJava1Package;
import org.xtext.example.java.myJava1.SmallClass;
import org.xtext.example.java.services.MyJava1GrammarAccess;

@SuppressWarnings("all")
public class MyJava1SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyJava1GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyJava1Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyJava1Package.SMALL_CLASS:
				if(context == grammarAccess.getSmallClassRule()) {
					sequence_SmallClass(context, (SmallClass) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID superClass=[SmallClass|ID]?)
	 */
	protected void sequence_SmallClass(EObject context, SmallClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
