/*
* generated by Xtext
*/
package sle.fsml.input.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import sle.fsml.input.services.InputGrammarAccess;

public class InputParser extends AbstractContentAssistParser {
	
	@Inject
	private InputGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected sle.fsml.input.ui.contentassist.antlr.internal.InternalInputParser createParser() {
		sle.fsml.input.ui.contentassist.antlr.internal.InternalInputParser result = new sle.fsml.input.ui.contentassist.antlr.internal.InternalInputParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
					put(grammarAccess.getInputAccess().getGroup_1(), "rule__Input__Group_1__0");
					put(grammarAccess.getInputAccess().getGroup_3(), "rule__Input__Group_3__0");
					put(grammarAccess.getInputAccess().getGroup_3_1(), "rule__Input__Group_3_1__0");
					put(grammarAccess.getInputAccess().getNameAssignment_1_0(), "rule__Input__NameAssignment_1_0");
					put(grammarAccess.getInputAccess().getInputsAssignment_3_0(), "rule__Input__InputsAssignment_3_0");
					put(grammarAccess.getInputAccess().getInputsAssignment_3_1_1(), "rule__Input__InputsAssignment_3_1_1");
					put(grammarAccess.getInputEntryAccess().getValueAssignment(), "rule__InputEntry__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			sle.fsml.input.ui.contentassist.antlr.internal.InternalInputParser typedParser = (sle.fsml.input.ui.contentassist.antlr.internal.InternalInputParser) parser;
			typedParser.entryRuleInput();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_CM", "RULE_WS" };
	}
	
	public InputGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(InputGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
