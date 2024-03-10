package gen;// Generated from C:/Users/jonah_pc/IdeaProjects/ReversePolishCalculator.java/src/ReversePolishCalculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReversePolishCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MUL=3, DIV=4, POW=5, LPAREN=6, RPAREN=7, FUNC=8, E=9, 
		PI=10, NUMBER=11, FLOAT=12, SCIENTIFIC=13, WHITESPACE=14;
	public static final int
		RULE_expression = 0, RULE_term = 1, RULE_factor = 2, RULE_base = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "term", "factor", "base"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'**'", "'('", "')'", null, "'e'", 
			"'pi'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MUL", "DIV", "POW", "LPAREN", "RPAREN", "FUNC", 
			"E", "PI", "NUMBER", "FLOAT", "SCIENTIFIC", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ReversePolishCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReversePolishCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ReversePolishCalculatorParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ReversePolishCalculatorParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ReversePolishCalculatorParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ReversePolishCalculatorParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReversePolishCalculatorListener ) ((ReversePolishCalculatorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReversePolishCalculatorListener ) ((ReversePolishCalculatorListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReversePolishCalculatorVisitor ) return ((ReversePolishCalculatorVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			term();
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(13);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(9);
					match(PLUS);
					setState(10);
					term();
					}
					break;
				case MINUS:
					{
					setState(11);
					match(MINUS);
					setState(12);
					term();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(ReversePolishCalculatorParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ReversePolishCalculatorParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ReversePolishCalculatorParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ReversePolishCalculatorParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReversePolishCalculatorListener ) ((ReversePolishCalculatorListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReversePolishCalculatorListener ) ((ReversePolishCalculatorListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReversePolishCalculatorVisitor ) return ((ReversePolishCalculatorVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			factor();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				setState(23);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(19);
					match(MUL);
					setState(20);
					factor();
					}
					break;
				case DIV:
					{
					setState(21);
					match(DIV);
					setState(22);
					factor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public List<BaseContext> base() {
			return getRuleContexts(BaseContext.class);
		}
		public BaseContext base(int i) {
			return getRuleContext(BaseContext.class,i);
		}
		public List<TerminalNode> POW() { return getTokens(ReversePolishCalculatorParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(ReversePolishCalculatorParser.POW, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReversePolishCalculatorListener ) ((ReversePolishCalculatorListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReversePolishCalculatorListener ) ((ReversePolishCalculatorListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReversePolishCalculatorVisitor ) return ((ReversePolishCalculatorVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			base();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POW) {
				{
				{
				setState(29);
				match(POW);
				setState(30);
				base();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ReversePolishCalculatorParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReversePolishCalculatorParser.RPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(ReversePolishCalculatorParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(ReversePolishCalculatorParser.FLOAT, 0); }
		public TerminalNode SCIENTIFIC() { return getToken(ReversePolishCalculatorParser.SCIENTIFIC, 0); }
		public TerminalNode FUNC() { return getToken(ReversePolishCalculatorParser.FUNC, 0); }
		public TerminalNode E() { return getToken(ReversePolishCalculatorParser.E, 0); }
		public TerminalNode PI() { return getToken(ReversePolishCalculatorParser.PI, 0); }
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReversePolishCalculatorListener ) ((ReversePolishCalculatorListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReversePolishCalculatorListener ) ((ReversePolishCalculatorListener)listener).exitBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReversePolishCalculatorVisitor ) return ((ReversePolishCalculatorVisitor<? extends T>)visitor).visitBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_base);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(LPAREN);
				setState(37);
				expression();
				setState(38);
				match(RPAREN);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(NUMBER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(FLOAT);
				}
				break;
			case SCIENTIFIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(SCIENTIFIC);
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				match(FUNC);
				setState(44);
				match(LPAREN);
				setState(45);
				expression();
				setState(46);
				match(RPAREN);
				}
				break;
			case E:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				match(E);
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 7);
				{
				setState(49);
				match(PI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000e5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002 \b\u0002\n\u0002\f\u0002#\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u00033\b\u0003\u0001\u0003\u0000\u0000\u0004"+
		"\u0000\u0002\u0004\u0006\u0000\u0000;\u0000\b\u0001\u0000\u0000\u0000"+
		"\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u001c\u0001\u0000\u0000\u0000"+
		"\u00062\u0001\u0000\u0000\u0000\b\u000f\u0003\u0002\u0001\u0000\t\n\u0005"+
		"\u0001\u0000\u0000\n\u000e\u0003\u0002\u0001\u0000\u000b\f\u0005\u0002"+
		"\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\t\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f"+
		"\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0001"+
		"\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0019"+
		"\u0003\u0004\u0002\u0000\u0013\u0014\u0005\u0003\u0000\u0000\u0014\u0018"+
		"\u0003\u0004\u0002\u0000\u0015\u0016\u0005\u0004\u0000\u0000\u0016\u0018"+
		"\u0003\u0004\u0002\u0000\u0017\u0013\u0001\u0000\u0000\u0000\u0017\u0015"+
		"\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0003"+
		"\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c!\u0003"+
		"\u0006\u0003\u0000\u001d\u001e\u0005\u0005\u0000\u0000\u001e \u0003\u0006"+
		"\u0003\u0000\u001f\u001d\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0005\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0006\u0000\u0000"+
		"%&\u0003\u0000\u0000\u0000&\'\u0005\u0007\u0000\u0000\'3\u0001\u0000\u0000"+
		"\u0000(3\u0005\u000b\u0000\u0000)3\u0005\f\u0000\u0000*3\u0005\r\u0000"+
		"\u0000+,\u0005\b\u0000\u0000,-\u0005\u0006\u0000\u0000-.\u0003\u0000\u0000"+
		"\u0000./\u0005\u0007\u0000\u0000/3\u0001\u0000\u0000\u000003\u0005\t\u0000"+
		"\u000013\u0005\n\u0000\u00002$\u0001\u0000\u0000\u00002(\u0001\u0000\u0000"+
		"\u00002)\u0001\u0000\u0000\u00002*\u0001\u0000\u0000\u00002+\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0007"+
		"\u0001\u0000\u0000\u0000\u0006\r\u000f\u0017\u0019!2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}