/*
* generated by Xtext
*/
package sle.gbt.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import sle.gbt.xtext.services.GBTSGrammarAccess;

public class GBTSParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private GBTSGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected sle.gbt.xtext.parser.antlr.internal.InternalGBTSParser createParser(XtextTokenStream stream) {
		return new sle.gbt.xtext.parser.antlr.internal.InternalGBTSParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public GBTSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GBTSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}