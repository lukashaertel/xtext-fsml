/*
* generated by Xtext
*/
package sle.fsml.input.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class InputGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class InputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Input");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInputAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cInputsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cInputsInputEntryParserRuleCall_3_0_0 = (RuleCall)cInputsAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cInputsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cInputsInputEntryParserRuleCall_3_1_1_0 = (RuleCall)cInputsAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cFullStopKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Input:
		//	{Input} (name=ID ":")? "[" (inputs+=InputEntry ("," inputs+=InputEntry)*)? "]" ".";
		public ParserRule getRule() { return rule; }

		//{Input} (name=ID ":")? "[" (inputs+=InputEntry ("," inputs+=InputEntry)*)? "]" "."
		public Group getGroup() { return cGroup; }

		//{Input}
		public Action getInputAction_0() { return cInputAction_0; }

		//(name=ID ":")?
		public Group getGroup_1() { return cGroup_1; }

		//name=ID
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_0() { return cNameIDTerminalRuleCall_1_0_0; }

		//":"
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }

		//(inputs+=InputEntry ("," inputs+=InputEntry)*)?
		public Group getGroup_3() { return cGroup_3; }

		//inputs+=InputEntry
		public Assignment getInputsAssignment_3_0() { return cInputsAssignment_3_0; }

		//InputEntry
		public RuleCall getInputsInputEntryParserRuleCall_3_0_0() { return cInputsInputEntryParserRuleCall_3_0_0; }

		//("," inputs+=InputEntry)*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//inputs+=InputEntry
		public Assignment getInputsAssignment_3_1_1() { return cInputsAssignment_3_1_1; }

		//InputEntry
		public RuleCall getInputsInputEntryParserRuleCall_3_1_1_0() { return cInputsInputEntryParserRuleCall_3_1_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }

		//"."
		public Keyword getFullStopKeyword_5() { return cFullStopKeyword_5; }
	}

	public class InputEntryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InputEntry");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//InputEntry:
		//	value=ID;
		public ParserRule getRule() { return rule; }

		//value=ID
		public Assignment getValueAssignment() { return cValueAssignment; }

		//ID
		public RuleCall getValueIDTerminalRuleCall_0() { return cValueIDTerminalRuleCall_0; }
	}
	
	
	private InputElements pInput;
	private InputEntryElements pInputEntry;
	private TerminalRule tID;
	private TerminalRule tCM;
	private TerminalRule tWS;
	
	private final Grammar grammar;

	@Inject
	public InputGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("sle.fsml.input.Input".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Input:
	//	{Input} (name=ID ":")? "[" (inputs+=InputEntry ("," inputs+=InputEntry)*)? "]" ".";
	public InputElements getInputAccess() {
		return (pInput != null) ? pInput : (pInput = new InputElements());
	}
	
	public ParserRule getInputRule() {
		return getInputAccess().getRule();
	}

	//InputEntry:
	//	value=ID;
	public InputEntryElements getInputEntryAccess() {
		return (pInputEntry != null) ? pInputEntry : (pInputEntry = new InputEntryElements());
	}
	
	public ParserRule getInputEntryRule() {
		return getInputEntryAccess().getRule();
	}

	//terminal ID:
	//	("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal CM:
	//	"%" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getCMRule() {
		return (tCM != null) ? tCM : (tCM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "CM"));
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	} 
}
