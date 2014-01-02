/*
* generated by Xtext
*/
package sle.fsml.run.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class RunGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class RunfileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Runfile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRunfileAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRunsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRunsRunParserRuleCall_1_0 = (RuleCall)cRunsAssignment_1.eContents().get(0);
		
		//Runfile:
		//	{Runfile} runs+=Run+;
		public ParserRule getRule() { return rule; }

		//{Runfile} runs+=Run+
		public Group getGroup() { return cGroup; }

		//{Runfile}
		public Action getRunfileAction_0() { return cRunfileAction_0; }

		//runs+=Run+
		public Assignment getRunsAssignment_1() { return cRunsAssignment_1; }

		//Run
		public RuleCall getRunsRunParserRuleCall_1_0() { return cRunsRunParserRuleCall_1_0; }
	}

	public class RunElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Run");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRunKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMachineAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMachineMachineParserRuleCall_1_0 = (RuleCall)cMachineAssignment_1.eContents().get(0);
		private final Keyword cOnKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInputAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInputInputParserRuleCall_3_0 = (RuleCall)cInputAssignment_3.eContents().get(0);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTargetAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTargetSTRINGTerminalRuleCall_5_0 = (RuleCall)cTargetAssignment_5.eContents().get(0);
		
		//Run:
		//	"run" machine=Machine "on" input=Input "to" target=STRING;
		public ParserRule getRule() { return rule; }

		//"run" machine=Machine "on" input=Input "to" target=STRING
		public Group getGroup() { return cGroup; }

		//"run"
		public Keyword getRunKeyword_0() { return cRunKeyword_0; }

		//machine=Machine
		public Assignment getMachineAssignment_1() { return cMachineAssignment_1; }

		//Machine
		public RuleCall getMachineMachineParserRuleCall_1_0() { return cMachineMachineParserRuleCall_1_0; }

		//"on"
		public Keyword getOnKeyword_2() { return cOnKeyword_2; }

		//input=Input
		public Assignment getInputAssignment_3() { return cInputAssignment_3; }

		//Input
		public RuleCall getInputInputParserRuleCall_3_0() { return cInputInputParserRuleCall_3_0; }

		//"to"
		public Keyword getToKeyword_4() { return cToKeyword_4; }

		//target=STRING
		public Assignment getTargetAssignment_5() { return cTargetAssignment_5; }

		//STRING
		public RuleCall getTargetSTRINGTerminalRuleCall_5_0() { return cTargetSTRINGTerminalRuleCall_5_0; }
	}

	public class MachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Machine");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMachineReferenceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMachineLocationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Machine:
		//	MachineReference | MachineLocation;
		public ParserRule getRule() { return rule; }

		//MachineReference | MachineLocation
		public Alternatives getAlternatives() { return cAlternatives; }

		//MachineReference
		public RuleCall getMachineReferenceParserRuleCall_0() { return cMachineReferenceParserRuleCall_0; }

		//MachineLocation
		public RuleCall getMachineLocationParserRuleCall_1() { return cMachineLocationParserRuleCall_1; }
	}

	public class MachineReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MachineReference");
		private final Assignment cFsmAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cFsmFSMCrossReference_0 = (CrossReference)cFsmAssignment.eContents().get(0);
		private final RuleCall cFsmFSMIDTerminalRuleCall_0_1 = (RuleCall)cFsmFSMCrossReference_0.eContents().get(1);
		
		//MachineReference:
		//	fsm=[fsml::FSM];
		public ParserRule getRule() { return rule; }

		//fsm=[fsml::FSM]
		public Assignment getFsmAssignment() { return cFsmAssignment; }

		//[fsml::FSM]
		public CrossReference getFsmFSMCrossReference_0() { return cFsmFSMCrossReference_0; }

		//ID
		public RuleCall getFsmFSMIDTerminalRuleCall_0_1() { return cFsmFSMIDTerminalRuleCall_0_1; }
	}

	public class MachineLocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MachineLocation");
		private final Assignment cLocationAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cLocationSTRINGTerminalRuleCall_0 = (RuleCall)cLocationAssignment.eContents().get(0);
		
		//MachineLocation:
		//	location=STRING;
		public ParserRule getRule() { return rule; }

		//location=STRING
		public Assignment getLocationAssignment() { return cLocationAssignment; }

		//STRING
		public RuleCall getLocationSTRINGTerminalRuleCall_0() { return cLocationSTRINGTerminalRuleCall_0; }
	}

	public class InputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Input");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInputReferenceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cInputLocationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Input:
		//	InputReference | InputLocation;
		public ParserRule getRule() { return rule; }

		//InputReference | InputLocation
		public Alternatives getAlternatives() { return cAlternatives; }

		//InputReference
		public RuleCall getInputReferenceParserRuleCall_0() { return cInputReferenceParserRuleCall_0; }

		//InputLocation
		public RuleCall getInputLocationParserRuleCall_1() { return cInputLocationParserRuleCall_1; }
	}

	public class InputReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InputReference");
		private final Assignment cInputAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cInputInputCrossReference_0 = (CrossReference)cInputAssignment.eContents().get(0);
		private final RuleCall cInputInputIDTerminalRuleCall_0_1 = (RuleCall)cInputInputCrossReference_0.eContents().get(1);
		
		//InputReference:
		//	input=[input::Input];
		public ParserRule getRule() { return rule; }

		//input=[input::Input]
		public Assignment getInputAssignment() { return cInputAssignment; }

		//[input::Input]
		public CrossReference getInputInputCrossReference_0() { return cInputInputCrossReference_0; }

		//ID
		public RuleCall getInputInputIDTerminalRuleCall_0_1() { return cInputInputIDTerminalRuleCall_0_1; }
	}

	public class InputLocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InputLocation");
		private final Assignment cLocationAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cLocationSTRINGTerminalRuleCall_0 = (RuleCall)cLocationAssignment.eContents().get(0);
		
		//InputLocation:
		//	location=STRING;
		public ParserRule getRule() { return rule; }

		//location=STRING
		public Assignment getLocationAssignment() { return cLocationAssignment; }

		//STRING
		public RuleCall getLocationSTRINGTerminalRuleCall_0() { return cLocationSTRINGTerminalRuleCall_0; }
	}
	
	
	private RunfileElements pRunfile;
	private RunElements pRun;
	private MachineElements pMachine;
	private MachineReferenceElements pMachineReference;
	private MachineLocationElements pMachineLocation;
	private InputElements pInput;
	private InputReferenceElements pInputReference;
	private InputLocationElements pInputLocation;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public RunGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("sle.fsml.run.Run".equals(grammar.getName())) {
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

	
	//Runfile:
	//	{Runfile} runs+=Run+;
	public RunfileElements getRunfileAccess() {
		return (pRunfile != null) ? pRunfile : (pRunfile = new RunfileElements());
	}
	
	public ParserRule getRunfileRule() {
		return getRunfileAccess().getRule();
	}

	//Run:
	//	"run" machine=Machine "on" input=Input "to" target=STRING;
	public RunElements getRunAccess() {
		return (pRun != null) ? pRun : (pRun = new RunElements());
	}
	
	public ParserRule getRunRule() {
		return getRunAccess().getRule();
	}

	//Machine:
	//	MachineReference | MachineLocation;
	public MachineElements getMachineAccess() {
		return (pMachine != null) ? pMachine : (pMachine = new MachineElements());
	}
	
	public ParserRule getMachineRule() {
		return getMachineAccess().getRule();
	}

	//MachineReference:
	//	fsm=[fsml::FSM];
	public MachineReferenceElements getMachineReferenceAccess() {
		return (pMachineReference != null) ? pMachineReference : (pMachineReference = new MachineReferenceElements());
	}
	
	public ParserRule getMachineReferenceRule() {
		return getMachineReferenceAccess().getRule();
	}

	//MachineLocation:
	//	location=STRING;
	public MachineLocationElements getMachineLocationAccess() {
		return (pMachineLocation != null) ? pMachineLocation : (pMachineLocation = new MachineLocationElements());
	}
	
	public ParserRule getMachineLocationRule() {
		return getMachineLocationAccess().getRule();
	}

	//Input:
	//	InputReference | InputLocation;
	public InputElements getInputAccess() {
		return (pInput != null) ? pInput : (pInput = new InputElements());
	}
	
	public ParserRule getInputRule() {
		return getInputAccess().getRule();
	}

	//InputReference:
	//	input=[input::Input];
	public InputReferenceElements getInputReferenceAccess() {
		return (pInputReference != null) ? pInputReference : (pInputReference = new InputReferenceElements());
	}
	
	public ParserRule getInputReferenceRule() {
		return getInputReferenceAccess().getRule();
	}

	//InputLocation:
	//	location=STRING;
	public InputLocationElements getInputLocationAccess() {
		return (pInputLocation != null) ? pInputLocation : (pInputLocation = new InputLocationElements());
	}
	
	public ParserRule getInputLocationRule() {
		return getInputLocationAccess().getRule();
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
