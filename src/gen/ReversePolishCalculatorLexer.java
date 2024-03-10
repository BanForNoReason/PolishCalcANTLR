package gen;// Generated from C:/Users/jonah_pc/IdeaProjects/ReversePolishCalculator.java/src/ReversePolishCalculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ReversePolishCalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MUL=3, DIV=4, POW=5, LPAREN=6, RPAREN=7, FUNC=8, E=9, 
		PI=10, NUMBER=11, FLOAT=12, SCIENTIFIC=13, WHITESPACE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "MUL", "DIV", "POW", "LPAREN", "RPAREN", "FUNC", "E", 
			"PI", "NUMBER", "FLOAT", "SCIENTIFIC", "WHITESPACE"
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


	public ReversePolishCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ReversePolishCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000e\u0089\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007T\b\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0004\n\\\b\n\u000b\n"+
		"\f\n]\u0001\u000b\u0004\u000ba\b\u000b\u000b\u000b\f\u000bb\u0001\u000b"+
		"\u0001\u000b\u0005\u000bg\b\u000b\n\u000b\f\u000bj\t\u000b\u0001\f\u0004"+
		"\fm\b\f\u000b\f\f\fn\u0001\f\u0001\f\u0005\fs\b\f\n\f\f\fv\t\f\u0003\f"+
		"x\b\f\u0001\f\u0001\f\u0003\f|\b\f\u0001\f\u0004\f\u007f\b\f\u000b\f\f"+
		"\f\u0080\u0001\r\u0004\r\u0084\b\r\u000b\r\f\r\u0085\u0001\r\u0001\r\u0000"+
		"\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u0001\u0000\u0004\u0001\u000009\u0002\u0000EEee\u0002\u0000++-"+
		"-\u0003\u0000\t\n\r\r  \u009c\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003\u001f\u0001"+
		"\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000\u0007#\u0001\u0000\u0000"+
		"\u0000\t%\u0001\u0000\u0000\u0000\u000b(\u0001\u0000\u0000\u0000\r*\u0001"+
		"\u0000\u0000\u0000\u000fS\u0001\u0000\u0000\u0000\u0011U\u0001\u0000\u0000"+
		"\u0000\u0013W\u0001\u0000\u0000\u0000\u0015[\u0001\u0000\u0000\u0000\u0017"+
		"`\u0001\u0000\u0000\u0000\u0019l\u0001\u0000\u0000\u0000\u001b\u0083\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005+\u0000\u0000\u001e\u0002\u0001\u0000"+
		"\u0000\u0000\u001f \u0005-\u0000\u0000 \u0004\u0001\u0000\u0000\u0000"+
		"!\"\u0005*\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000#$\u0005/\u0000"+
		"\u0000$\b\u0001\u0000\u0000\u0000%&\u0005*\u0000\u0000&\'\u0005*\u0000"+
		"\u0000\'\n\u0001\u0000\u0000\u0000()\u0005(\u0000\u0000)\f\u0001\u0000"+
		"\u0000\u0000*+\u0005)\u0000\u0000+\u000e\u0001\u0000\u0000\u0000,-\u0005"+
		"l\u0000\u0000-.\u0005o\u0000\u0000.T\u0005g\u0000\u0000/0\u0005l\u0000"+
		"\u00000T\u0005n\u0000\u000012\u0005s\u0000\u000023\u0005i\u0000\u0000"+
		"3T\u0005n\u0000\u000045\u0005c\u0000\u000056\u0005o\u0000\u00006T\u0005"+
		"s\u0000\u000078\u0005t\u0000\u000089\u0005a\u0000\u00009T\u0005n\u0000"+
		"\u0000:;\u0005a\u0000\u0000;<\u0005s\u0000\u0000<=\u0005i\u0000\u0000"+
		"=T\u0005n\u0000\u0000>?\u0005a\u0000\u0000?@\u0005c\u0000\u0000@A\u0005"+
		"o\u0000\u0000AT\u0005s\u0000\u0000BC\u0005a\u0000\u0000CD\u0005t\u0000"+
		"\u0000DE\u0005a\u0000\u0000ET\u0005n\u0000\u0000FG\u0005s\u0000\u0000"+
		"GH\u0005i\u0000\u0000HI\u0005n\u0000\u0000IT\u0005h\u0000\u0000JK\u0005"+
		"c\u0000\u0000KL\u0005o\u0000\u0000LM\u0005s\u0000\u0000MT\u0005h\u0000"+
		"\u0000NO\u0005t\u0000\u0000OP\u0005a\u0000\u0000PQ\u0005n\u0000\u0000"+
		"QT\u0005h\u0000\u0000RT\u0005!\u0000\u0000S,\u0001\u0000\u0000\u0000S"+
		"/\u0001\u0000\u0000\u0000S1\u0001\u0000\u0000\u0000S4\u0001\u0000\u0000"+
		"\u0000S7\u0001\u0000\u0000\u0000S:\u0001\u0000\u0000\u0000S>\u0001\u0000"+
		"\u0000\u0000SB\u0001\u0000\u0000\u0000SF\u0001\u0000\u0000\u0000SJ\u0001"+
		"\u0000\u0000\u0000SN\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"T\u0010\u0001\u0000\u0000\u0000UV\u0005e\u0000\u0000V\u0012\u0001\u0000"+
		"\u0000\u0000WX\u0005p\u0000\u0000XY\u0005i\u0000\u0000Y\u0014\u0001\u0000"+
		"\u0000\u0000Z\\\u0007\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\u0016\u0001\u0000\u0000\u0000_a\u0007\u0000\u0000\u0000`_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dh\u0005.\u0000\u0000eg\u0007"+
		"\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0018\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000km\u0007\u0000\u0000\u0000lk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000ow\u0001\u0000\u0000\u0000pt\u0005.\u0000\u0000"+
		"qs\u0007\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000ux\u0001\u0000"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000wp\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0007\u0001\u0000\u0000"+
		"z|\u0007\u0002\u0000\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|~\u0001\u0000\u0000\u0000}\u007f\u0007\u0000\u0000\u0000~}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u001a\u0001\u0000"+
		"\u0000\u0000\u0082\u0084\u0007\u0003\u0000\u0000\u0083\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0006\r\u0000\u0000\u0088\u001c\u0001\u0000\u0000"+
		"\u0000\u000b\u0000S]bhntw{\u0080\u0085\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}