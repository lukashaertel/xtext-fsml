/*
* generated by Xtext
*/
package sle.fsml.run.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import sle.fsml.run.services.RunGrammarAccess;

public class RunParser extends AbstractContentAssistParser {
	
	@Inject
	private RunGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected sle.fsml.run.ui.contentassist.antlr.internal.InternalRunParser createParser() {
		sle.fsml.run.ui.contentassist.antlr.internal.InternalRunParser result = new sle.fsml.run.ui.contentassist.antlr.internal.InternalRunParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRunfileAccess().getGroup(), "rule__Runfile__Group__0");
					put(grammarAccess.getRunAccess().getGroup(), "rule__Run__Group__0");
					put(grammarAccess.getRunfileAccess().getRunsAssignment_1(), "rule__Runfile__RunsAssignment_1");
					put(grammarAccess.getRunAccess().getMachineAssignment_1(), "rule__Run__MachineAssignment_1");
					put(grammarAccess.getRunAccess().getInputAssignment_3(), "rule__Run__InputAssignment_3");
					put(grammarAccess.getRunAccess().getTargetAssignment_5(), "rule__Run__TargetAssignment_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			sle.fsml.run.ui.contentassist.antlr.internal.InternalRunParser typedParser = (sle.fsml.run.ui.contentassist.antlr.internal.InternalRunParser) parser;
			typedParser.entryRuleRunfile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public RunGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RunGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}