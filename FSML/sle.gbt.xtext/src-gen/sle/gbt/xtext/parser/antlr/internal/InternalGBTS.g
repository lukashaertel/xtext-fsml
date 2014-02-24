/*
* generated by Xtext
*/
grammar InternalGBTS;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package sle.gbt.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package sle.gbt.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sle.gbt.xtext.services.GBTSGrammarAccess;

}

@parser::members {

 	private GBTSGrammarAccess grammarAccess;
 	
    public InternalGBTSParser(TokenStream input, GBTSGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected GBTSGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getItemsItemParserRuleCall_0()); 
	    }
		lv_items_0_0=ruleItem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"items",
        		lv_items_0_0, 
        		"Item");
	        afterParserOrEnumRuleCall();
	    }

)
)+
;





// Entry rule entryRuleItem
entryRuleItem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getItemRule()); }
	 iv_ruleItem=ruleItem 
	 { $current=$iv_ruleItem.current; } 
	 EOF 
;

// Rule Item
ruleItem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getItemAccess().getDefParserRuleCall_0()); 
    }
    this_Def_0=ruleDef
    { 
        $current = $this_Def_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getItemAccess().getApplyParserRuleCall_1()); 
    }
    this_Apply_1=ruleApply
    { 
        $current = $this_Apply_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleDef
entryRuleDef returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefRule()); }
	 iv_ruleDef=ruleDef 
	 { $current=$iv_ruleDef.current; } 
	 EOF 
;

// Rule Def
ruleDef returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='def' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDefAccess().getDefKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDefAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDefRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDefAccess().getColonKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDefRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getDefAccess().getRefGrammarCrossReference_3_0()); 
	    }
		ruleGrammarID		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		lv_hasStartrule_4_0=	'start' 
    {
        newLeafNode(lv_hasStartrule_4_0, grammarAccess.getDefAccess().getHasStartruleStartKeyword_4_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDefRule());
	        }
       		setWithLastConsumed($current, "hasStartrule", true, "start");
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDefRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getDefAccess().getStartruleAbstractRuleCrossReference_4_1_0()); 
	}

)
))?(	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getDefAccess().getLeftCurlyBracketKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDefAccess().getSubstitutionsSubstitutionParserRuleCall_5_1_0()); 
	    }
		lv_substitutions_7_0=ruleSubstitution		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefRule());
	        }
       		add(
       			$current, 
       			"substitutions",
        		lv_substitutions_7_0, 
        		"Substitution");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getDefAccess().getRightCurlyBracketKeyword_5_2());
    }
)?)
;





// Entry rule entryRuleApply
entryRuleApply returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getApplyRule()); }
	 iv_ruleApply=ruleApply 
	 { $current=$iv_ruleApply.current; } 
	 EOF 
;

// Rule Apply
ruleApply returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='apply' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getApplyAccess().getApplyKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getApplyRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getApplyAccess().getDefDefCrossReference_1_0()); 
	}

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getApplyAccess().getColonKeyword_2());
    }
(
(
		lv_minOrIt_3_0=RULE_INT
		{
			newLeafNode(lv_minOrIt_3_0, grammarAccess.getApplyAccess().getMinOrItINTTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getApplyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"minOrIt",
        		lv_minOrIt_3_0, 
        		"INT");
	    }

)
)((
(
		lv_hasMax_4_0=	'..' 
    {
        newLeafNode(lv_hasMax_4_0, grammarAccess.getApplyAccess().getHasMaxFullStopFullStopKeyword_4_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getApplyRule());
	        }
       		setWithLastConsumed($current, "hasMax", true, "..");
	    }

)
)(
(
		lv_max_5_0=RULE_INT
		{
			newLeafNode(lv_max_5_0, grammarAccess.getApplyAccess().getMaxINTTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getApplyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"max",
        		lv_max_5_0, 
        		"INT");
	    }

)
)((
(
		lv_hasSpace_6_0=	'space' 
    {
        newLeafNode(lv_hasSpace_6_0, grammarAccess.getApplyAccess().getHasSpaceSpaceKeyword_4_2_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getApplyRule());
	        }
       		setWithLastConsumed($current, "hasSpace", true, "space");
	    }

)
)(
(
		lv_space_7_0=RULE_INT
		{
			newLeafNode(lv_space_7_0, grammarAccess.getApplyAccess().getSpaceINTTerminalRuleCall_4_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getApplyRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"space",
        		lv_space_7_0, 
        		"INT");
	    }

)
)))?)
;





// Entry rule entryRuleSubstitution
entryRuleSubstitution returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSubstitutionRule()); }
	 iv_ruleSubstitution=ruleSubstitution 
	 { $current=$iv_ruleSubstitution.current; } 
	 EOF 
;

// Rule Substitution
ruleSubstitution returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='substitute' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSubstitutionAccess().getSubstituteKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSubstitutionRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getSubstitutionAccess().getRuleAbstractRuleCrossReference_1_0()); 
	}

)
)	otherlv_2='with' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSubstitutionAccess().getWithKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSubstitutionAccess().getSubstitutionSGParserRuleCall_3_0()); 
	    }
		lv_substitution_3_0=ruleSG		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubstitutionRule());
	        }
       		set(
       			$current, 
       			"substitution",
        		lv_substitution_3_0, 
        		"SG");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getSubstitutionAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleSG
entryRuleSG returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSGRule()); }
	 iv_ruleSG=ruleSG 
	 { $current=$iv_ruleSG.current; } 
	 EOF 
;

// Rule SG
ruleSG returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getSGAccess().getAlternativeParserRuleCall()); 
    }
    this_Alternative_0=ruleAlternative
    { 
        $current = $this_Alternative_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleAlternative
entryRuleAlternative returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAlternativeRule()); }
	 iv_ruleAlternative=ruleAlternative 
	 { $current=$iv_ruleAlternative.current; } 
	 EOF 
;

// Rule Alternative
ruleAlternative returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAlternativeAccess().getSequenceParserRuleCall_0()); 
    }
    this_Sequence_0=ruleSequence
    { 
        $current = $this_Sequence_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0(),
            $current);
    }
)	otherlv_2='|' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAlternativeAccess().getVerticalLineKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAlternativeAccess().getRightAlternativeParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleAlternative		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAlternativeRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Alternative");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleSequence
entryRuleSequence returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSequenceRule()); }
	 iv_ruleSequence=ruleSequence 
	 { $current=$iv_ruleSequence.current; } 
	 EOF 
;

// Rule Sequence
ruleSequence returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSequenceAccess().getCardinalityParserRuleCall_0()); 
    }
    this_Cardinality_0=ruleCardinality
    { 
        $current = $this_Cardinality_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSequenceAccess().getRightSequenceParserRuleCall_1_1_0()); 
	    }
		lv_right_2_0=ruleSequence		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSequenceRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_2_0, 
        		"Sequence");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleCardinality
entryRuleCardinality returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCardinalityRule()); }
	 iv_ruleCardinality=ruleCardinality 
	 { $current=$iv_ruleCardinality.current; } 
	 EOF 
;

// Rule Cardinality
ruleCardinality returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getCardinalityAccess().getOperatedParserRuleCall_0()); 
    }
    this_Operated_0=ruleOperated
    { 
        $current = $this_Operated_0.current; 
        afterParserOrEnumRuleCall();
    }
(((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0(),
            $current);
    }
)	otherlv_2='?' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getQuestionMarkKeyword_1_0_1());
    }
)
    |((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0(),
            $current);
    }
)	otherlv_4='*' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_1_1());
    }
)
    |((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0(),
            $current);
    }
)	otherlv_6='+' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getCardinalityAccess().getPlusSignKeyword_1_2_1());
    }
))?)
;





// Entry rule entryRuleOperated
entryRuleOperated returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperatedRule()); }
	 iv_ruleOperated=ruleOperated 
	 { $current=$iv_ruleOperated.current; } 
	 EOF 
;

// Rule Operated
ruleOperated returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='->' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOperatedAccess().getHyphenMinusGreaterThanSignKeyword_0_0());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getOperatedAccess().getUntilAction_0_1(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_0_2_0()); 
	    }
		lv_of_2_0=ruleOperated		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperatedRule());
	        }
       		set(
       			$current, 
       			"of",
        		lv_of_2_0, 
        		"Operated");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(	otherlv_3='!' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getOperatedAccess().getExclamationMarkKeyword_1_0());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getOperatedAccess().getNegationAction_1_1(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_1_2_0()); 
	    }
		lv_of_5_0=ruleOperated		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperatedRule());
	        }
       		set(
       			$current, 
       			"of",
        		lv_of_5_0, 
        		"Operated");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |
    { 
        newCompositeNode(grammarAccess.getOperatedAccess().getTerminalParserRuleCall_2()); 
    }
    this_Terminal_6=ruleTerminal
    { 
        $current = $this_Terminal_6.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleTerminal
entryRuleTerminal returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTerminalRule()); }
	 iv_ruleTerminal=ruleTerminal 
	 { $current=$iv_ruleTerminal.current; } 
	 EOF 
;

// Rule Terminal
ruleTerminal returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getTerminalAccess().getRangeAction_0_0(),
            $current);
    }
)(
(
		lv_min_1_0=RULE_STRING
		{
			newLeafNode(lv_min_1_0, grammarAccess.getTerminalAccess().getMinSTRINGTerminalRuleCall_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTerminalRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"min",
        		lv_min_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='..' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTerminalAccess().getFullStopFullStopKeyword_0_2());
    }
(
(
		lv_max_3_0=RULE_STRING
		{
			newLeafNode(lv_max_3_0, grammarAccess.getTerminalAccess().getMaxSTRINGTerminalRuleCall_0_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTerminalRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"max",
        		lv_max_3_0, 
        		"STRING");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getTerminalAccess().getSingleAction_1_0(),
            $current);
    }
)(
(
		lv_token_5_0=RULE_STRING
		{
			newLeafNode(lv_token_5_0, grammarAccess.getTerminalAccess().getTokenSTRINGTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTerminalRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"token",
        		lv_token_5_0, 
        		"STRING");
	    }

)
))
    |
    { 
        newCompositeNode(grammarAccess.getTerminalAccess().getParenthesizedElementParserRuleCall_2()); 
    }
    this_ParenthesizedElement_6=ruleParenthesizedElement
    { 
        $current = $this_ParenthesizedElement_6.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleParenthesizedElement
entryRuleParenthesizedElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParenthesizedElementRule()); }
	 iv_ruleParenthesizedElement=ruleParenthesizedElement 
	 { $current=$iv_ruleParenthesizedElement.current; } 
	 EOF 
;

// Rule ParenthesizedElement
ruleParenthesizedElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0());
    }

    { 
        newCompositeNode(grammarAccess.getParenthesizedElementAccess().getAlternativeParserRuleCall_1()); 
    }
    this_Alternative_1=ruleAlternative
    { 
        $current = $this_Alternative_1.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2());
    }
)
;





// Entry rule entryRuleGrammarID
entryRuleGrammarID returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getGrammarIDRule()); } 
	 iv_ruleGrammarID=ruleGrammarID 
	 { $current=$iv_ruleGrammarID.current.getText(); }  
	 EOF 
;

// Rule GrammarID
ruleGrammarID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


