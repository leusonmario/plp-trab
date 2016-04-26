/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.exp1.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.exp1.services.Exp1GrammarAccess;

@SuppressWarnings("all")
public class Exp1SyntacticSequencer extends AbstractSyntacticSequencer {

	protected Exp1GrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (Exp1GrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getOPERADORRule())
			return getOPERADORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getVALORINTEIRORule())
			return getVALORINTEIROToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal OPERADOR:
	 * 	'+' | '-';
	 */
	protected String getOPERADORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * terminal VALORINTEIRO:
	 * 	('1'..'9') ('0'..'9')*;
	 */
	protected String getVALORINTEIROToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}