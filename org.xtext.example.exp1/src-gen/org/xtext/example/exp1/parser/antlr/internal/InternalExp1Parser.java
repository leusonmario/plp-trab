package org.xtext.example.exp1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.exp1.services.Exp1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExp1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VALORINTEIRO", "RULE_OPERADOR", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='"
    };
    public static final int RULE_VALORINTEIRO=5;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_OPERADOR=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalExp1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExp1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExp1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalExp1.g"; }



     	private Exp1GrammarAccess grammarAccess;

        public InternalExp1Parser(TokenStream input, Exp1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Exp1";
       	}

       	@Override
       	protected Exp1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExp1"
    // InternalExp1.g:64:1: entryRuleExp1 returns [EObject current=null] : iv_ruleExp1= ruleExp1 EOF ;
    public final EObject entryRuleExp1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp1 = null;


        try {
            // InternalExp1.g:64:45: (iv_ruleExp1= ruleExp1 EOF )
            // InternalExp1.g:65:2: iv_ruleExp1= ruleExp1 EOF
            {
             newCompositeNode(grammarAccess.getExp1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp1=ruleExp1();

            state._fsp--;

             current =iv_ruleExp1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp1"


    // $ANTLR start "ruleExp1"
    // InternalExp1.g:71:1: ruleExp1 returns [EObject current=null] : ( (lv_expressoes_0_0= ruleExpressao ) )* ;
    public final EObject ruleExp1() throws RecognitionException {
        EObject current = null;

        EObject lv_expressoes_0_0 = null;



        	enterRule();

        try {
            // InternalExp1.g:77:2: ( ( (lv_expressoes_0_0= ruleExpressao ) )* )
            // InternalExp1.g:78:2: ( (lv_expressoes_0_0= ruleExpressao ) )*
            {
            // InternalExp1.g:78:2: ( (lv_expressoes_0_0= ruleExpressao ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_VALORINTEIRO)||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExp1.g:79:3: (lv_expressoes_0_0= ruleExpressao )
            	    {
            	    // InternalExp1.g:79:3: (lv_expressoes_0_0= ruleExpressao )
            	    // InternalExp1.g:80:4: lv_expressoes_0_0= ruleExpressao
            	    {

            	    				newCompositeNode(grammarAccess.getExp1Access().getExpressoesExpressaoParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_expressoes_0_0=ruleExpressao();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getExp1Rule());
            	    				}
            	    				add(
            	    					current,
            	    					"expressoes",
            	    					lv_expressoes_0_0,
            	    					"org.xtext.example.exp1.Exp1.Expressao");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp1"


    // $ANTLR start "entryRuleExpressao"
    // InternalExp1.g:100:1: entryRuleExpressao returns [EObject current=null] : iv_ruleExpressao= ruleExpressao EOF ;
    public final EObject entryRuleExpressao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressao = null;


        try {
            // InternalExp1.g:100:50: (iv_ruleExpressao= ruleExpressao EOF )
            // InternalExp1.g:101:2: iv_ruleExpressao= ruleExpressao EOF
            {
             newCompositeNode(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressao=ruleExpressao();

            state._fsp--;

             current =iv_ruleExpressao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalExp1.g:107:1: ruleExpressao returns [EObject current=null] : (this_DecVariavel_0= ruleDecVariavel | this_ExpAritmetica_1= ruleExpAritmetica ) ;
    public final EObject ruleExpressao() throws RecognitionException {
        EObject current = null;

        EObject this_DecVariavel_0 = null;

        EObject this_ExpAritmetica_1 = null;



        	enterRule();

        try {
            // InternalExp1.g:113:2: ( (this_DecVariavel_0= ruleDecVariavel | this_ExpAritmetica_1= ruleExpAritmetica ) )
            // InternalExp1.g:114:2: (this_DecVariavel_0= ruleDecVariavel | this_ExpAritmetica_1= ruleExpAritmetica )
            {
            // InternalExp1.g:114:2: (this_DecVariavel_0= ruleDecVariavel | this_ExpAritmetica_1= ruleExpAritmetica )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_VALORINTEIRO)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExp1.g:115:3: this_DecVariavel_0= ruleDecVariavel
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getDecVariavelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DecVariavel_0=ruleDecVariavel();

                    state._fsp--;


                    			current = this_DecVariavel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExp1.g:124:3: this_ExpAritmetica_1= ruleExpAritmetica
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getExpAritmeticaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpAritmetica_1=ruleExpAritmetica();

                    state._fsp--;


                    			current = this_ExpAritmetica_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleDecVariavel"
    // InternalExp1.g:136:1: entryRuleDecVariavel returns [EObject current=null] : iv_ruleDecVariavel= ruleDecVariavel EOF ;
    public final EObject entryRuleDecVariavel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecVariavel = null;


        try {
            // InternalExp1.g:136:52: (iv_ruleDecVariavel= ruleDecVariavel EOF )
            // InternalExp1.g:137:2: iv_ruleDecVariavel= ruleDecVariavel EOF
            {
             newCompositeNode(grammarAccess.getDecVariavelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecVariavel=ruleDecVariavel();

            state._fsp--;

             current =iv_ruleDecVariavel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecVariavel"


    // $ANTLR start "ruleDecVariavel"
    // InternalExp1.g:143:1: ruleDecVariavel returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_VALORINTEIRO ) ) ) ;
    public final EObject ruleDecVariavel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalExp1.g:149:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_VALORINTEIRO ) ) ) )
            // InternalExp1.g:150:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_VALORINTEIRO ) ) )
            {
            // InternalExp1.g:150:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_VALORINTEIRO ) ) )
            // InternalExp1.g:151:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_VALORINTEIRO ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDecVariavelAccess().getVarKeyword_0());
            		
            // InternalExp1.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExp1.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExp1.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalExp1.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDecVariavelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecVariavelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDecVariavelAccess().getEqualsSignKeyword_2());
            		
            // InternalExp1.g:177:3: ( (lv_value_3_0= RULE_VALORINTEIRO ) )
            // InternalExp1.g:178:4: (lv_value_3_0= RULE_VALORINTEIRO )
            {
            // InternalExp1.g:178:4: (lv_value_3_0= RULE_VALORINTEIRO )
            // InternalExp1.g:179:5: lv_value_3_0= RULE_VALORINTEIRO
            {
            lv_value_3_0=(Token)match(input,RULE_VALORINTEIRO,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getDecVariavelAccess().getValueVALORINTEIROTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecVariavelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.exp1.Exp1.VALORINTEIRO");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecVariavel"


    // $ANTLR start "entryRuleExpAritmetica"
    // InternalExp1.g:199:1: entryRuleExpAritmetica returns [EObject current=null] : iv_ruleExpAritmetica= ruleExpAritmetica EOF ;
    public final EObject entryRuleExpAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpAritmetica = null;


        try {
            // InternalExp1.g:199:54: (iv_ruleExpAritmetica= ruleExpAritmetica EOF )
            // InternalExp1.g:200:2: iv_ruleExpAritmetica= ruleExpAritmetica EOF
            {
             newCompositeNode(grammarAccess.getExpAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpAritmetica=ruleExpAritmetica();

            state._fsp--;

             current =iv_ruleExpAritmetica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpAritmetica"


    // $ANTLR start "ruleExpAritmetica"
    // InternalExp1.g:206:1: ruleExpAritmetica returns [EObject current=null] : ( (this_VALORINTEIRO_0= RULE_VALORINTEIRO | ( (otherlv_1= RULE_ID ) ) ) this_OPERADOR_2= RULE_OPERADOR (this_VALORINTEIRO_3= RULE_VALORINTEIRO | ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleExpAritmetica() throws RecognitionException {
        EObject current = null;

        Token this_VALORINTEIRO_0=null;
        Token otherlv_1=null;
        Token this_OPERADOR_2=null;
        Token this_VALORINTEIRO_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalExp1.g:212:2: ( ( (this_VALORINTEIRO_0= RULE_VALORINTEIRO | ( (otherlv_1= RULE_ID ) ) ) this_OPERADOR_2= RULE_OPERADOR (this_VALORINTEIRO_3= RULE_VALORINTEIRO | ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalExp1.g:213:2: ( (this_VALORINTEIRO_0= RULE_VALORINTEIRO | ( (otherlv_1= RULE_ID ) ) ) this_OPERADOR_2= RULE_OPERADOR (this_VALORINTEIRO_3= RULE_VALORINTEIRO | ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalExp1.g:213:2: ( (this_VALORINTEIRO_0= RULE_VALORINTEIRO | ( (otherlv_1= RULE_ID ) ) ) this_OPERADOR_2= RULE_OPERADOR (this_VALORINTEIRO_3= RULE_VALORINTEIRO | ( (otherlv_4= RULE_ID ) ) ) )
            // InternalExp1.g:214:3: (this_VALORINTEIRO_0= RULE_VALORINTEIRO | ( (otherlv_1= RULE_ID ) ) ) this_OPERADOR_2= RULE_OPERADOR (this_VALORINTEIRO_3= RULE_VALORINTEIRO | ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalExp1.g:214:3: (this_VALORINTEIRO_0= RULE_VALORINTEIRO | ( (otherlv_1= RULE_ID ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_VALORINTEIRO) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalExp1.g:215:4: this_VALORINTEIRO_0= RULE_VALORINTEIRO
                    {
                    this_VALORINTEIRO_0=(Token)match(input,RULE_VALORINTEIRO,FOLLOW_7); 

                    				newLeafNode(this_VALORINTEIRO_0, grammarAccess.getExpAritmeticaAccess().getVALORINTEIROTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalExp1.g:220:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalExp1.g:220:4: ( (otherlv_1= RULE_ID ) )
                    // InternalExp1.g:221:5: (otherlv_1= RULE_ID )
                    {
                    // InternalExp1.g:221:5: (otherlv_1= RULE_ID )
                    // InternalExp1.g:222:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpAritmeticaRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_1, grammarAccess.getExpAritmeticaAccess().getSequelofDecVariavelCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            this_OPERADOR_2=(Token)match(input,RULE_OPERADOR,FOLLOW_8); 

            			newLeafNode(this_OPERADOR_2, grammarAccess.getExpAritmeticaAccess().getOPERADORTerminalRuleCall_1());
            		
            // InternalExp1.g:238:3: (this_VALORINTEIRO_3= RULE_VALORINTEIRO | ( (otherlv_4= RULE_ID ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_VALORINTEIRO) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExp1.g:239:4: this_VALORINTEIRO_3= RULE_VALORINTEIRO
                    {
                    this_VALORINTEIRO_3=(Token)match(input,RULE_VALORINTEIRO,FOLLOW_2); 

                    				newLeafNode(this_VALORINTEIRO_3, grammarAccess.getExpAritmeticaAccess().getVALORINTEIROTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalExp1.g:244:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalExp1.g:244:4: ( (otherlv_4= RULE_ID ) )
                    // InternalExp1.g:245:5: (otherlv_4= RULE_ID )
                    {
                    // InternalExp1.g:245:5: (otherlv_4= RULE_ID )
                    // InternalExp1.g:246:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpAritmeticaRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getExpAritmeticaAccess().getSequelofDecVariavelCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpAritmetica"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});

}