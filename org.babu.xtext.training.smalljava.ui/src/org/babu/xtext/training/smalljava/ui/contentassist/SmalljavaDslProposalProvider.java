package org.babu.xtext.training.smalljava.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.base.Predicate;

public class SmalljavaDslProposalProvider extends
		AbstractSmalljavaDslProposalProvider {

/*
@Override
public void completeSmallClass_SuperClass(EObject model,
		Assignment assignment, ContentAssistContext context,
	ICompletionProposalAcceptor acceptor) {
	lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor, new Predicate<IEObjectDescription> {
		
		@Override
		public boolean apply(IEObjectDescription input) {
			// TODO Auto-generated method stub
			return false;
		}
	});
	
}


*/
}
