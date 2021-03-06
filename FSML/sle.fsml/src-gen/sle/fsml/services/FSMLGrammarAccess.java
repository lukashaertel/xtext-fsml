/*
* generated by Xtext
*/
package sle.fsml.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class FSMLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class FSMElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FSM");
		private final Assignment cStatesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStatesFSMStateParserRuleCall_0 = (RuleCall)cStatesAssignment.eContents().get(0);
		
		//FSM:
		//	states+=FSMState*;
		public ParserRule getRule() { return rule; }

		//states+=FSMState*
		public Assignment getStatesAssignment() { return cStatesAssignment; }

		//FSMState
		public RuleCall getStatesFSMStateParserRuleCall_0() { return cStatesFSMStateParserRuleCall_0; }
	}

	public class FSMStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FSMState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cInitialAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cInitialInitialKeyword_0_0 = (Keyword)cInitialAssignment_0.eContents().get(0);
		private final Keyword cStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTransitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTransitionsFSMTransitionParserRuleCall_4_0 = (RuleCall)cTransitionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//FSMState:
		//	initial?="initial"? "state" name=ID "{" transitions+=FSMTransition* "}";
		public ParserRule getRule() { return rule; }

		//initial?="initial"? "state" name=ID "{" transitions+=FSMTransition* "}"
		public Group getGroup() { return cGroup; }

		//initial?="initial"?
		public Assignment getInitialAssignment_0() { return cInitialAssignment_0; }

		//"initial"
		public Keyword getInitialInitialKeyword_0_0() { return cInitialInitialKeyword_0_0; }

		//"state"
		public Keyword getStateKeyword_1() { return cStateKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//transitions+=FSMTransition*
		public Assignment getTransitionsAssignment_4() { return cTransitionsAssignment_4; }

		//FSMTransition
		public RuleCall getTransitionsFSMTransitionParserRuleCall_4_0() { return cTransitionsFSMTransitionParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class FSMTransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FSMTransition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cInputAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cInputIDTerminalRuleCall_0_0 = (RuleCall)cInputAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cSolidusKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cActionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cActionIDTerminalRuleCall_1_1_0 = (RuleCall)cActionAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTargetAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cTargetFSMStateCrossReference_2_1_0 = (CrossReference)cTargetAssignment_2_1.eContents().get(0);
		private final RuleCall cTargetFSMStateIDTerminalRuleCall_2_1_0_1 = (RuleCall)cTargetFSMStateCrossReference_2_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FSMTransition:
		//	input=ID ("/" action=ID)? ("->" target=[FSMState])? ";";
		public ParserRule getRule() { return rule; }

		//input=ID ("/" action=ID)? ("->" target=[FSMState])? ";"
		public Group getGroup() { return cGroup; }

		//input=ID
		public Assignment getInputAssignment_0() { return cInputAssignment_0; }

		//ID
		public RuleCall getInputIDTerminalRuleCall_0_0() { return cInputIDTerminalRuleCall_0_0; }

		//("/" action=ID)?
		public Group getGroup_1() { return cGroup_1; }

		//"/"
		public Keyword getSolidusKeyword_1_0() { return cSolidusKeyword_1_0; }

		//action=ID
		public Assignment getActionAssignment_1_1() { return cActionAssignment_1_1; }

		//ID
		public RuleCall getActionIDTerminalRuleCall_1_1_0() { return cActionIDTerminalRuleCall_1_1_0; }

		//("->" target=[FSMState])?
		public Group getGroup_2() { return cGroup_2; }

		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_2_0() { return cHyphenMinusGreaterThanSignKeyword_2_0; }

		//target=[FSMState]
		public Assignment getTargetAssignment_2_1() { return cTargetAssignment_2_1; }

		//[FSMState]
		public CrossReference getTargetFSMStateCrossReference_2_1_0() { return cTargetFSMStateCrossReference_2_1_0; }

		//ID
		public RuleCall getTargetFSMStateIDTerminalRuleCall_2_1_0_1() { return cTargetFSMStateIDTerminalRuleCall_2_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	
	
	private FSMElements pFSM;
	private FSMStateElements pFSMState;
	private FSMTransitionElements pFSMTransition;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public FSMLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("sle.fsml.FSML".equals(grammar.getName())) {
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
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//FSM:
	//	states+=FSMState*;
	public FSMElements getFSMAccess() {
		return (pFSM != null) ? pFSM : (pFSM = new FSMElements());
	}
	
	public ParserRule getFSMRule() {
		return getFSMAccess().getRule();
	}

	//FSMState:
	//	initial?="initial"? "state" name=ID "{" transitions+=FSMTransition* "}";
	public FSMStateElements getFSMStateAccess() {
		return (pFSMState != null) ? pFSMState : (pFSMState = new FSMStateElements());
	}
	
	public ParserRule getFSMStateRule() {
		return getFSMStateAccess().getRule();
	}

	//FSMTransition:
	//	input=ID ("/" action=ID)? ("->" target=[FSMState])? ";";
	public FSMTransitionElements getFSMTransitionAccess() {
		return (pFSMTransition != null) ? pFSMTransition : (pFSMTransition = new FSMTransitionElements());
	}
	
	public ParserRule getFSMTransitionRule() {
		return getFSMTransitionAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
