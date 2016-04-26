package org.xtext.example.exp1.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.exp1.services.Exp1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExp1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALORINTEIRO", "RULE_OPERADOR", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='"
    };
    public static final int RULE_VALORINTEIRO=4;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_OPERADOR=5;
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

    	public void setGrammarAccess(Exp1GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleExp1"
    // InternalExp1.g:53:1: entryRuleExp1 : ruleExp1 EOF ;
    public final void entryRuleExp1() throws RecognitionException {
        try {
            // InternalExp1.g:54:1: ( ruleExp1 EOF )
            // InternalExp1.g:55:1: ruleExp1 EOF
            {
             before(grammarAccess.getExp1Rule()); 
            pushFollow(FOLLOW_1);
            ruleExp1();

            state._fsp--;

             after(grammarAccess.getExp1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExp1"


    // $ANTLR start "ruleExp1"
    // InternalExp1.g:62:1: ruleExp1 : ( ( rule__Exp1__ExpressoesAssignment )* ) ;
    public final void ruleExp1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:66:2: ( ( ( rule__Exp1__ExpressoesAssignment )* ) )
            // InternalExp1.g:67:2: ( ( rule__Exp1__ExpressoesAssignment )* )
            {
            // InternalExp1.g:67:2: ( ( rule__Exp1__ExpressoesAssignment )* )
            // InternalExp1.g:68:3: ( rule__Exp1__ExpressoesAssignment )*
            {
             before(grammarAccess.getExp1Access().getExpressoesAssignment()); 
            // InternalExp1.g:69:3: ( rule__Exp1__ExpressoesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_VALORINTEIRO||LA1_0==RULE_ID||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExp1.g:69:4: rule__Exp1__ExpressoesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Exp1__ExpressoesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getExp1Access().getExpressoesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp1"


    // $ANTLR start "entryRuleExpressao"
    // InternalExp1.g:78:1: entryRuleExpressao : ruleExpressao EOF ;
    public final void entryRuleExpressao() throws RecognitionException {
        try {
            // InternalExp1.g:79:1: ( ruleExpressao EOF )
            // InternalExp1.g:80:1: ruleExpressao EOF
            {
             before(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getExpressaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalExp1.g:87:1: ruleExpressao : ( ( rule__Expressao__Alternatives ) ) ;
    public final void ruleExpressao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:91:2: ( ( ( rule__Expressao__Alternatives ) ) )
            // InternalExp1.g:92:2: ( ( rule__Expressao__Alternatives ) )
            {
            // InternalExp1.g:92:2: ( ( rule__Expressao__Alternatives ) )
            // InternalExp1.g:93:3: ( rule__Expressao__Alternatives )
            {
             before(grammarAccess.getExpressaoAccess().getAlternatives()); 
            // InternalExp1.g:94:3: ( rule__Expressao__Alternatives )
            // InternalExp1.g:94:4: rule__Expressao__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expressao__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleDecVariavel"
    // InternalExp1.g:103:1: entryRuleDecVariavel : ruleDecVariavel EOF ;
    public final void entryRuleDecVariavel() throws RecognitionException {
        try {
            // InternalExp1.g:104:1: ( ruleDecVariavel EOF )
            // InternalExp1.g:105:1: ruleDecVariavel EOF
            {
             before(grammarAccess.getDecVariavelRule()); 
            pushFollow(FOLLOW_1);
            ruleDecVariavel();

            state._fsp--;

             after(grammarAccess.getDecVariavelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecVariavel"


    // $ANTLR start "ruleDecVariavel"
    // InternalExp1.g:112:1: ruleDecVariavel : ( ( rule__DecVariavel__Group__0 ) ) ;
    public final void ruleDecVariavel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:116:2: ( ( ( rule__DecVariavel__Group__0 ) ) )
            // InternalExp1.g:117:2: ( ( rule__DecVariavel__Group__0 ) )
            {
            // InternalExp1.g:117:2: ( ( rule__DecVariavel__Group__0 ) )
            // InternalExp1.g:118:3: ( rule__DecVariavel__Group__0 )
            {
             before(grammarAccess.getDecVariavelAccess().getGroup()); 
            // InternalExp1.g:119:3: ( rule__DecVariavel__Group__0 )
            // InternalExp1.g:119:4: rule__DecVariavel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DecVariavel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecVariavelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecVariavel"


    // $ANTLR start "entryRuleExpAritmetica"
    // InternalExp1.g:128:1: entryRuleExpAritmetica : ruleExpAritmetica EOF ;
    public final void entryRuleExpAritmetica() throws RecognitionException {
        try {
            // InternalExp1.g:129:1: ( ruleExpAritmetica EOF )
            // InternalExp1.g:130:1: ruleExpAritmetica EOF
            {
             before(grammarAccess.getExpAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpAritmetica();

            state._fsp--;

             after(grammarAccess.getExpAritmeticaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpAritmetica"


    // $ANTLR start "ruleExpAritmetica"
    // InternalExp1.g:137:1: ruleExpAritmetica : ( ( rule__ExpAritmetica__Group__0 ) ) ;
    public final void ruleExpAritmetica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:141:2: ( ( ( rule__ExpAritmetica__Group__0 ) ) )
            // InternalExp1.g:142:2: ( ( rule__ExpAritmetica__Group__0 ) )
            {
            // InternalExp1.g:142:2: ( ( rule__ExpAritmetica__Group__0 ) )
            // InternalExp1.g:143:3: ( rule__ExpAritmetica__Group__0 )
            {
             before(grammarAccess.getExpAritmeticaAccess().getGroup()); 
            // InternalExp1.g:144:3: ( rule__ExpAritmetica__Group__0 )
            // InternalExp1.g:144:4: rule__ExpAritmetica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpAritmetica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAritmeticaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpAritmetica"


    // $ANTLR start "rule__Expressao__Alternatives"
    // InternalExp1.g:152:1: rule__Expressao__Alternatives : ( ( ruleDecVariavel ) | ( ruleExpAritmetica ) );
    public final void rule__Expressao__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:156:1: ( ( ruleDecVariavel ) | ( ruleExpAritmetica ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_VALORINTEIRO||LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExp1.g:157:2: ( ruleDecVariavel )
                    {
                    // InternalExp1.g:157:2: ( ruleDecVariavel )
                    // InternalExp1.g:158:3: ruleDecVariavel
                    {
                     before(grammarAccess.getExpressaoAccess().getDecVariavelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDecVariavel();

                    state._fsp--;

                     after(grammarAccess.getExpressaoAccess().getDecVariavelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExp1.g:163:2: ( ruleExpAritmetica )
                    {
                    // InternalExp1.g:163:2: ( ruleExpAritmetica )
                    // InternalExp1.g:164:3: ruleExpAritmetica
                    {
                     before(grammarAccess.getExpressaoAccess().getExpAritmeticaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpAritmetica();

                    state._fsp--;

                     after(grammarAccess.getExpressaoAccess().getExpAritmeticaParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Alternatives"


    // $ANTLR start "rule__ExpAritmetica__Alternatives_0"
    // InternalExp1.g:173:1: rule__ExpAritmetica__Alternatives_0 : ( ( RULE_VALORINTEIRO ) | ( ( rule__ExpAritmetica__SequelofAssignment_0_1 ) ) );
    public final void rule__ExpAritmetica__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:177:1: ( ( RULE_VALORINTEIRO ) | ( ( rule__ExpAritmetica__SequelofAssignment_0_1 ) ) )
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
                    // InternalExp1.g:178:2: ( RULE_VALORINTEIRO )
                    {
                    // InternalExp1.g:178:2: ( RULE_VALORINTEIRO )
                    // InternalExp1.g:179:3: RULE_VALORINTEIRO
                    {
                     before(grammarAccess.getExpAritmeticaAccess().getVALORINTEIROTerminalRuleCall_0_0()); 
                    match(input,RULE_VALORINTEIRO,FOLLOW_2); 
                     after(grammarAccess.getExpAritmeticaAccess().getVALORINTEIROTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExp1.g:184:2: ( ( rule__ExpAritmetica__SequelofAssignment_0_1 ) )
                    {
                    // InternalExp1.g:184:2: ( ( rule__ExpAritmetica__SequelofAssignment_0_1 ) )
                    // InternalExp1.g:185:3: ( rule__ExpAritmetica__SequelofAssignment_0_1 )
                    {
                     before(grammarAccess.getExpAritmeticaAccess().getSequelofAssignment_0_1()); 
                    // InternalExp1.g:186:3: ( rule__ExpAritmetica__SequelofAssignment_0_1 )
                    // InternalExp1.g:186:4: rule__ExpAritmetica__SequelofAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpAritmetica__SequelofAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAritmeticaAccess().getSequelofAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Alternatives_0"


    // $ANTLR start "rule__ExpAritmetica__Alternatives_2"
    // InternalExp1.g:194:1: rule__ExpAritmetica__Alternatives_2 : ( ( RULE_VALORINTEIRO ) | ( ( rule__ExpAritmetica__SequelofAssignment_2_1 ) ) );
    public final void rule__ExpAritmetica__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:198:1: ( ( RULE_VALORINTEIRO ) | ( ( rule__ExpAritmetica__SequelofAssignment_2_1 ) ) )
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
                    // InternalExp1.g:199:2: ( RULE_VALORINTEIRO )
                    {
                    // InternalExp1.g:199:2: ( RULE_VALORINTEIRO )
                    // InternalExp1.g:200:3: RULE_VALORINTEIRO
                    {
                     before(grammarAccess.getExpAritmeticaAccess().getVALORINTEIROTerminalRuleCall_2_0()); 
                    match(input,RULE_VALORINTEIRO,FOLLOW_2); 
                     after(grammarAccess.getExpAritmeticaAccess().getVALORINTEIROTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExp1.g:205:2: ( ( rule__ExpAritmetica__SequelofAssignment_2_1 ) )
                    {
                    // InternalExp1.g:205:2: ( ( rule__ExpAritmetica__SequelofAssignment_2_1 ) )
                    // InternalExp1.g:206:3: ( rule__ExpAritmetica__SequelofAssignment_2_1 )
                    {
                     before(grammarAccess.getExpAritmeticaAccess().getSequelofAssignment_2_1()); 
                    // InternalExp1.g:207:3: ( rule__ExpAritmetica__SequelofAssignment_2_1 )
                    // InternalExp1.g:207:4: rule__ExpAritmetica__SequelofAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpAritmetica__SequelofAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAritmeticaAccess().getSequelofAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Alternatives_2"


    // $ANTLR start "rule__DecVariavel__Group__0"
    // InternalExp1.g:215:1: rule__DecVariavel__Group__0 : rule__DecVariavel__Group__0__Impl rule__DecVariavel__Group__1 ;
    public final void rule__DecVariavel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:219:1: ( rule__DecVariavel__Group__0__Impl rule__DecVariavel__Group__1 )
            // InternalExp1.g:220:2: rule__DecVariavel__Group__0__Impl rule__DecVariavel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DecVariavel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecVariavel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecVariavel__Group__0"


    // $ANTLR start "rule__DecVariavel__Group__0__Impl"
    // InternalExp1.g:227:1: rule__DecVariavel__Group__0__Impl : ( 'var' ) ;
    public final void rule__DecVariavel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:231:1: ( ( 'var' ) )
            // InternalExp1.g:232:1: ( 'var' )
            {
            // InternalExp1.g:232:1: ( 'var' )
            // InternalExp1.g:233:2: 'var'
            {
             before(grammarAccess.getDecVariavelAccess().getVarKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDecVariavelAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecVariavel__Group__0__Impl"


    // $ANTLR start "rule__DecVariavel__Group__1"
    // InternalExp1.g:242:1: rule__DecVariavel__Group__1 : rule__DecVariavel__Group__1__Impl rule__DecVariavel__Group__2 ;
    public final void rule__DecVariavel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:246:1: ( rule__DecVariavel__Group__1__Impl rule__DecVariavel__Group__2 )
            // InternalExp1.g:247:2: rule__DecVariavel__Group__1__Impl rule__DecVariavel__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DecVariavel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecVariavel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecVariavel__Group__1"


    // $ANTLR start "rule__DecVariavel__Group__1__Impl"
    // InternalExp1.g:254:1: rule__DecVariavel__Group__1__Impl : ( ( rule__DecVariavel__NameAssignment_1 ) ) ;
    public final void rule__DecVariavel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:258:1: ( ( ( rule__DecVariavel__NameAssignment_1 ) ) )
            // InternalExp1.g:259:1: ( ( rule__DecVariavel__NameAssignment_1 ) )
            {
            // InternalExp1.g:259:1: ( ( rule__DecVariavel__NameAssignment_1 ) )
            // InternalExp1.g:260:2: ( rule__DecVariavel__NameAssignment_1 )
            {
             before(grammarAccess.getDecVariavelAccess().getNameAssignment_1()); 
            // InternalExp1.g:261:2: ( rule__DecVariavel__NameAssignment_1 )
            // InternalExp1.g:261:3: rule__DecVariavel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DecVariavel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDecVariavelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecVariavel__Group__1__Impl"


    // $ANTLR start "rule__DecVariavel__Group__2"
    // InternalExp1.g:269:1: rule__DecVariavel__Group__2 : rule__DecVariavel__Group__2__Impl rule__DecVariavel__Group__3 ;
    public final void rule__DecVariavel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:273:1: ( rule__DecVariavel__Group__2__Impl rule__DecVariavel__Group__3 )
            // InternalExp1.g:274:2: rule__DecVariavel__Group__2__Impl rule__DecVariavel__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DecVariavel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DecVariavel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecVariavel__Group__2"


    // $ANTLR start "rule__DecVariavel__Group__2__Impl"
    // InternalExp1.g:281:1: rule__DecVariavel__Group__2__Impl : ( '=' ) ;
    public final void rule__DecVariavel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:285:1: ( ( '=' ) )
            // InternalExp1.g:286:1: ( '=' )
            {
            // InternalExp1.g:286:1: ( '=' )
            // InternalExp1.g:287:2: '='
            {
             before(grammarAccess.getDecVariavelAccess().getEqualsSignKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDecVariavelAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecVariavel__Group__2__Impl"


    // $ANTLR start "rule__DecVariavel__Group__3"
    // InternalExp1.g:296:1: rule__DecVariavel__Group__3 : rule__DecVariavel__Group__3__Impl ;
    public final void rule__DecVariavel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:300:1: ( rule__DecVariavel__Group__3__Impl )
            // InternalExp1.g:301:2: rule__DecVariavel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DecVariavel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecVariavel__Group__3"


    // $ANTLR start "rule__DecVariavel__Group__3__Impl"
    // InternalExp1.g:307:1: rule__DecVariavel__Group__3__Impl : ( ( rule__DecVariavel__ValueAssignment_3 ) ) ;
    public final void rule__DecVariavel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:311:1: ( ( ( rule__DecVariavel__ValueAssignment_3 ) ) )
            // InternalExp1.g:312:1: ( ( rule__DecVariavel__ValueAssignment_3 ) )
            {
            // InternalExp1.g:312:1: ( ( rule__DecVariavel__ValueAssignment_3 ) )
            // InternalExp1.g:313:2: ( rule__DecVariavel__ValueAssignment_3 )
            {
             before(grammarAccess.getDecVariavelAccess().getValueAssignment_3()); 
            // InternalExp1.g:314:2: ( rule__DecVariavel__ValueAssignment_3 )
            // InternalExp1.g:314:3: rule__DecVariavel__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DecVariavel__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDecVariavelAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecVariavel__Group__3__Impl"


    // $ANTLR start "rule__ExpAritmetica__Group__0"
    // InternalExp1.g:323:1: rule__ExpAritmetica__Group__0 : rule__ExpAritmetica__Group__0__Impl rule__ExpAritmetica__Group__1 ;
    public final void rule__ExpAritmetica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:327:1: ( rule__ExpAritmetica__Group__0__Impl rule__ExpAritmetica__Group__1 )
            // InternalExp1.g:328:2: rule__ExpAritmetica__Group__0__Impl rule__ExpAritmetica__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExpAritmetica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpAritmetica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group__0"


    // $ANTLR start "rule__ExpAritmetica__Group__0__Impl"
    // InternalExp1.g:335:1: rule__ExpAritmetica__Group__0__Impl : ( ( rule__ExpAritmetica__Alternatives_0 ) ) ;
    public final void rule__ExpAritmetica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:339:1: ( ( ( rule__ExpAritmetica__Alternatives_0 ) ) )
            // InternalExp1.g:340:1: ( ( rule__ExpAritmetica__Alternatives_0 ) )
            {
            // InternalExp1.g:340:1: ( ( rule__ExpAritmetica__Alternatives_0 ) )
            // InternalExp1.g:341:2: ( rule__ExpAritmetica__Alternatives_0 )
            {
             before(grammarAccess.getExpAritmeticaAccess().getAlternatives_0()); 
            // InternalExp1.g:342:2: ( rule__ExpAritmetica__Alternatives_0 )
            // InternalExp1.g:342:3: rule__ExpAritmetica__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpAritmetica__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAritmeticaAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group__0__Impl"


    // $ANTLR start "rule__ExpAritmetica__Group__1"
    // InternalExp1.g:350:1: rule__ExpAritmetica__Group__1 : rule__ExpAritmetica__Group__1__Impl rule__ExpAritmetica__Group__2 ;
    public final void rule__ExpAritmetica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:354:1: ( rule__ExpAritmetica__Group__1__Impl rule__ExpAritmetica__Group__2 )
            // InternalExp1.g:355:2: rule__ExpAritmetica__Group__1__Impl rule__ExpAritmetica__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ExpAritmetica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpAritmetica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group__1"


    // $ANTLR start "rule__ExpAritmetica__Group__1__Impl"
    // InternalExp1.g:362:1: rule__ExpAritmetica__Group__1__Impl : ( RULE_OPERADOR ) ;
    public final void rule__ExpAritmetica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:366:1: ( ( RULE_OPERADOR ) )
            // InternalExp1.g:367:1: ( RULE_OPERADOR )
            {
            // InternalExp1.g:367:1: ( RULE_OPERADOR )
            // InternalExp1.g:368:2: RULE_OPERADOR
            {
             before(grammarAccess.getExpAritmeticaAccess().getOPERADORTerminalRuleCall_1()); 
            match(input,RULE_OPERADOR,FOLLOW_2); 
             after(grammarAccess.getExpAritmeticaAccess().getOPERADORTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group__1__Impl"


    // $ANTLR start "rule__ExpAritmetica__Group__2"
    // InternalExp1.g:377:1: rule__ExpAritmetica__Group__2 : rule__ExpAritmetica__Group__2__Impl ;
    public final void rule__ExpAritmetica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:381:1: ( rule__ExpAritmetica__Group__2__Impl )
            // InternalExp1.g:382:2: rule__ExpAritmetica__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpAritmetica__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group__2"


    // $ANTLR start "rule__ExpAritmetica__Group__2__Impl"
    // InternalExp1.g:388:1: rule__ExpAritmetica__Group__2__Impl : ( ( rule__ExpAritmetica__Alternatives_2 ) ) ;
    public final void rule__ExpAritmetica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:392:1: ( ( ( rule__ExpAritmetica__Alternatives_2 ) ) )
            // InternalExp1.g:393:1: ( ( rule__ExpAritmetica__Alternatives_2 ) )
            {
            // InternalExp1.g:393:1: ( ( rule__ExpAritmetica__Alternatives_2 ) )
            // InternalExp1.g:394:2: ( rule__ExpAritmetica__Alternatives_2 )
            {
             before(grammarAccess.getExpAritmeticaAccess().getAlternatives_2()); 
            // InternalExp1.g:395:2: ( rule__ExpAritmetica__Alternatives_2 )
            // InternalExp1.g:395:3: rule__ExpAritmetica__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpAritmetica__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getExpAritmeticaAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__Group__2__Impl"


    // $ANTLR start "rule__Exp1__ExpressoesAssignment"
    // InternalExp1.g:404:1: rule__Exp1__ExpressoesAssignment : ( ruleExpressao ) ;
    public final void rule__Exp1__ExpressoesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:408:1: ( ( ruleExpressao ) )
            // InternalExp1.g:409:2: ( ruleExpressao )
            {
            // InternalExp1.g:409:2: ( ruleExpressao )
            // InternalExp1.g:410:3: ruleExpressao
            {
             before(grammarAccess.getExp1Access().getExpressoesExpressaoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getExp1Access().getExpressoesExpressaoParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp1__ExpressoesAssignment"


    // $ANTLR start "rule__DecVariavel__NameAssignment_1"
    // InternalExp1.g:419:1: rule__DecVariavel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DecVariavel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:423:1: ( ( RULE_ID ) )
            // InternalExp1.g:424:2: ( RULE_ID )
            {
            // InternalExp1.g:424:2: ( RULE_ID )
            // InternalExp1.g:425:3: RULE_ID
            {
             before(grammarAccess.getDecVariavelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDecVariavelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecVariavel__NameAssignment_1"


    // $ANTLR start "rule__DecVariavel__ValueAssignment_3"
    // InternalExp1.g:434:1: rule__DecVariavel__ValueAssignment_3 : ( RULE_VALORINTEIRO ) ;
    public final void rule__DecVariavel__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:438:1: ( ( RULE_VALORINTEIRO ) )
            // InternalExp1.g:439:2: ( RULE_VALORINTEIRO )
            {
            // InternalExp1.g:439:2: ( RULE_VALORINTEIRO )
            // InternalExp1.g:440:3: RULE_VALORINTEIRO
            {
             before(grammarAccess.getDecVariavelAccess().getValueVALORINTEIROTerminalRuleCall_3_0()); 
            match(input,RULE_VALORINTEIRO,FOLLOW_2); 
             after(grammarAccess.getDecVariavelAccess().getValueVALORINTEIROTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecVariavel__ValueAssignment_3"


    // $ANTLR start "rule__ExpAritmetica__SequelofAssignment_0_1"
    // InternalExp1.g:449:1: rule__ExpAritmetica__SequelofAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExpAritmetica__SequelofAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:453:1: ( ( ( RULE_ID ) ) )
            // InternalExp1.g:454:2: ( ( RULE_ID ) )
            {
            // InternalExp1.g:454:2: ( ( RULE_ID ) )
            // InternalExp1.g:455:3: ( RULE_ID )
            {
             before(grammarAccess.getExpAritmeticaAccess().getSequelofDecVariavelCrossReference_0_1_0()); 
            // InternalExp1.g:456:3: ( RULE_ID )
            // InternalExp1.g:457:4: RULE_ID
            {
             before(grammarAccess.getExpAritmeticaAccess().getSequelofDecVariavelIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpAritmeticaAccess().getSequelofDecVariavelIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getExpAritmeticaAccess().getSequelofDecVariavelCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__SequelofAssignment_0_1"


    // $ANTLR start "rule__ExpAritmetica__SequelofAssignment_2_1"
    // InternalExp1.g:468:1: rule__ExpAritmetica__SequelofAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExpAritmetica__SequelofAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExp1.g:472:1: ( ( ( RULE_ID ) ) )
            // InternalExp1.g:473:2: ( ( RULE_ID ) )
            {
            // InternalExp1.g:473:2: ( ( RULE_ID ) )
            // InternalExp1.g:474:3: ( RULE_ID )
            {
             before(grammarAccess.getExpAritmeticaAccess().getSequelofDecVariavelCrossReference_2_1_0()); 
            // InternalExp1.g:475:3: ( RULE_ID )
            // InternalExp1.g:476:4: RULE_ID
            {
             before(grammarAccess.getExpAritmeticaAccess().getSequelofDecVariavelIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpAritmeticaAccess().getSequelofDecVariavelIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getExpAritmeticaAccess().getSequelofDecVariavelCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAritmetica__SequelofAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002052L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000050L});

}