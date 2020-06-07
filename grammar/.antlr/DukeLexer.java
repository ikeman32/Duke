// Generated from /home/duke/github/Duke/grammar/Duke.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DukeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Block=1, Bool=2, Choose=3, Declare=4, Decrement=5, Defaut=6, Double=7, 
		Else=8, If=9, Increment=10, Integer=11, Loop=12, Separator=13, String=14, 
		Nonterminal=15, Terminal=16, Id=17, BlockComment=18, LineComment=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Block", "Bool", "Choose", "Declare", "Decrement", "Defaut", "Double", 
		"Else", "If", "Increment", "Integer", "Loop", "Separator", "String", "Nonterminal", 
		"Terminal", "Id", "Num", "Letter", "BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'Boolean'", "'Choose'", "'I want'", "'sub'", "'Default'", 
		"'Double'", "'Else'", "'If'", "'add'", "'Integer'", "'Loop'", "','", "'String'", 
		"';'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Block", "Bool", "Choose", "Declare", "Decrement", "Defaut", "Double", 
		"Else", "If", "Increment", "Integer", "Loop", "Separator", "String", "Nonterminal", 
		"Terminal", "Id", "BlockComment", "LineComment"
	};
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


	public DukeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Duke.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\7\25\u0089\n\25\f\25\16\25\u008c\13\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0097\n\26\f\26\16\26\u009a\13"+
		"\26\3\26\3\26\3\u008a\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\2)\24+\25\3\2\5\3\2\62;\5"+
		"\2C\\aac|\4\2\f\f\17\17\2\u009c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5"+
		"/\3\2\2\2\7\67\3\2\2\2\t>\3\2\2\2\13E\3\2\2\2\rI\3\2\2\2\17Q\3\2\2\2\21"+
		"X\3\2\2\2\23]\3\2\2\2\25`\3\2\2\2\27d\3\2\2\2\31l\3\2\2\2\33q\3\2\2\2"+
		"\35s\3\2\2\2\37z\3\2\2\2!|\3\2\2\2#~\3\2\2\2%\u0080\3\2\2\2\'\u0082\3"+
		"\2\2\2)\u0084\3\2\2\2+\u0092\3\2\2\2-.\7<\2\2.\4\3\2\2\2/\60\7D\2\2\60"+
		"\61\7q\2\2\61\62\7q\2\2\62\63\7n\2\2\63\64\7g\2\2\64\65\7c\2\2\65\66\7"+
		"p\2\2\66\6\3\2\2\2\678\7E\2\289\7j\2\29:\7q\2\2:;\7q\2\2;<\7u\2\2<=\7"+
		"g\2\2=\b\3\2\2\2>?\7K\2\2?@\7\"\2\2@A\7y\2\2AB\7c\2\2BC\7p\2\2CD\7v\2"+
		"\2D\n\3\2\2\2EF\7u\2\2FG\7w\2\2GH\7d\2\2H\f\3\2\2\2IJ\7F\2\2JK\7g\2\2"+
		"KL\7h\2\2LM\7c\2\2MN\7w\2\2NO\7n\2\2OP\7v\2\2P\16\3\2\2\2QR\7F\2\2RS\7"+
		"q\2\2ST\7w\2\2TU\7d\2\2UV\7n\2\2VW\7g\2\2W\20\3\2\2\2XY\7G\2\2YZ\7n\2"+
		"\2Z[\7u\2\2[\\\7g\2\2\\\22\3\2\2\2]^\7K\2\2^_\7h\2\2_\24\3\2\2\2`a\7c"+
		"\2\2ab\7f\2\2bc\7f\2\2c\26\3\2\2\2de\7K\2\2ef\7p\2\2fg\7v\2\2gh\7g\2\2"+
		"hi\7i\2\2ij\7g\2\2jk\7t\2\2k\30\3\2\2\2lm\7N\2\2mn\7q\2\2no\7q\2\2op\7"+
		"r\2\2p\32\3\2\2\2qr\7.\2\2r\34\3\2\2\2st\7U\2\2tu\7v\2\2uv\7t\2\2vw\7"+
		"k\2\2wx\7p\2\2xy\7i\2\2y\36\3\2\2\2z{\7=\2\2{ \3\2\2\2|}\7\60\2\2}\"\3"+
		"\2\2\2~\177\3\2\2\2\177$\3\2\2\2\u0080\u0081\t\2\2\2\u0081&\3\2\2\2\u0082"+
		"\u0083\t\3\2\2\u0083(\3\2\2\2\u0084\u0085\7\61\2\2\u0085\u0086\7,\2\2"+
		"\u0086\u008a\3\2\2\2\u0087\u0089\13\2\2\2\u0088\u0087\3\2\2\2\u0089\u008c"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7,\2\2\u008e\u008f\7\61\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\b\25\2\2\u0091*\3\2\2\2\u0092\u0093\7\61\2\2\u0093\u0094"+
		"\7\61\2\2\u0094\u0098\3\2\2\2\u0095\u0097\n\4\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\b\26\2\2\u009c,\3\2\2\2\5\2\u008a"+
		"\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}