/*
* generated by Xtext
*/
package sle.fsml.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import sle.fsml.services.FSMLGrammarAccess;

public class FSMLParser extends AbstractContentAssistParser {
	
	@Inject
	private FSMLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected sle.fsml.ui.contentassist.antlr.internal.InternalFSMLParser createParser() {
		sle.fsml.ui.contentassist.antlr.internal.InternalFSMLParser result = new sle.fsml.ui.contentassist.antlr.internal.InternalFSMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFSMStateAccess().getGroup(), "rule__FSMState__Group__0");
					put(grammarAccess.getFSMTransitionAccess().getGroup(), "rule__FSMTransition__Group__0");
					put(grammarAccess.getFSMTransitionAccess().getGroup_1(), "rule__FSMTransition__Group_1__0");
					put(grammarAccess.getFSMTransitionAccess().getGroup_2(), "rule__FSMTransition__Group_2__0");
					put(grammarAccess.getFSMAccess().getStatesAssignment(), "rule__FSM__StatesAssignment");
					put(grammarAccess.getFSMStateAccess().getInitialAssignment_0(), "rule__FSMState__InitialAssignment_0");
					put(grammarAccess.getFSMStateAccess().getNameAssignment_2(), "rule__FSMState__NameAssignment_2");
					put(grammarAccess.getFSMStateAccess().getTransitionsAssignment_4(), "rule__FSMState__TransitionsAssignment_4");
					put(grammarAccess.getFSMTransitionAccess().getInputAssignment_0(), "rule__FSMTransition__InputAssignment_0");
					put(grammarAccess.getFSMTransitionAccess().getWithActionAssignment_1_0(), "rule__FSMTransition__WithActionAssignment_1_0");
					put(grammarAccess.getFSMTransitionAccess().getActionAssignment_1_1(), "rule__FSMTransition__ActionAssignment_1_1");
					put(grammarAccess.getFSMTransitionAccess().getWithTargetAssignment_2_0(), "rule__FSMTransition__WithTargetAssignment_2_0");
					put(grammarAccess.getFSMTransitionAccess().getTargetAssignment_2_1(), "rule__FSMTransition__TargetAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			sle.fsml.ui.contentassist.antlr.internal.InternalFSMLParser typedParser = (sle.fsml.ui.contentassist.antlr.internal.InternalFSMLParser) parser;
			typedParser.entryRuleFSM();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FSMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FSMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}