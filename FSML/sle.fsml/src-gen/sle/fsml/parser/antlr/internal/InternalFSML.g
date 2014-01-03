/*
* generated by Xtext
*/
grammar InternalFSML;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package sle.fsml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package sle.fsml.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sle.fsml.services.FSMLGrammarAccess;

}

@parser::members {

 	private FSMLGrammarAccess grammarAccess;
 	
    public InternalFSMLParser(TokenStream input, FSMLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "FSM";	
   	}
   	
   	@Override
   	protected FSMLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleFSM
entryRuleFSM returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFSMRule()); }
	 iv_ruleFSM=ruleFSM 
	 { $current=$iv_ruleFSM.current; } 
	 EOF 
;

// Rule FSM
ruleFSM returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getFSMAccess().getStatesFSMStateParserRuleCall_0()); 
	    }
		lv_states_0_0=ruleFSMState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFSMRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_0_0, 
        		"FSMState");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleFSMState
entryRuleFSMState returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFSMStateRule()); }
	 iv_ruleFSMState=ruleFSMState 
	 { $current=$iv_ruleFSMState.current; } 
	 EOF 
;

// Rule FSMState
ruleFSMState returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_initial_0_0=	'initial' 
    {
        newLeafNode(lv_initial_0_0, grammarAccess.getFSMStateAccess().getInitialInitialKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFSMStateRule());
	        }
       		setWithLastConsumed($current, "initial", true, "initial");
	    }

)
)?	otherlv_1='state' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFSMStateAccess().getStateKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getFSMStateAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFSMStateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFSMStateAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFSMStateAccess().getTransitionsFSMTransitionParserRuleCall_4_0()); 
	    }
		lv_transitions_4_0=ruleFSMTransition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFSMStateRule());
	        }
       		add(
       			$current, 
       			"transitions",
        		lv_transitions_4_0, 
        		"FSMTransition");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFSMStateAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleFSMTransition
entryRuleFSMTransition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFSMTransitionRule()); }
	 iv_ruleFSMTransition=ruleFSMTransition 
	 { $current=$iv_ruleFSMTransition.current; } 
	 EOF 
;

// Rule FSMTransition
ruleFSMTransition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_input_0_0=RULE_ID
		{
			newLeafNode(lv_input_0_0, grammarAccess.getFSMTransitionAccess().getInputIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFSMTransitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"input",
        		lv_input_0_0, 
        		"ID");
	    }

)
)((
(
		lv_withAction_1_0=	'/' 
    {
        newLeafNode(lv_withAction_1_0, grammarAccess.getFSMTransitionAccess().getWithActionSolidusKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFSMTransitionRule());
	        }
       		setWithLastConsumed($current, "withAction", true, "/");
	    }

)
)(
(
		lv_action_2_0=RULE_ID
		{
			newLeafNode(lv_action_2_0, grammarAccess.getFSMTransitionAccess().getActionIDTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFSMTransitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"action",
        		lv_action_2_0, 
        		"ID");
	    }

)
))?((
(
		lv_withTarget_3_0=	'->' 
    {
        newLeafNode(lv_withTarget_3_0, grammarAccess.getFSMTransitionAccess().getWithTargetHyphenMinusGreaterThanSignKeyword_2_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFSMTransitionRule());
	        }
       		setWithLastConsumed($current, "withTarget", true, "->");
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getFSMTransitionRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getFSMTransitionAccess().getTargetFSMStateCrossReference_2_1_0()); 
	}

)
))?	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFSMTransitionAccess().getSemicolonKeyword_3());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

