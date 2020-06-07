// Generated from /home/duke/github/Duke/grammar/Duke.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DukeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Block=1, Bool=2, Choose=3, Declare=4, Decrement=5, Defaut=6, Double=7, 
		Else=8, If=9, Increment=10, Integer=11, Loop=12, Separator=13, String=14, 
		Nonterminal=15, Terminal=16, Id=17, BlockComment=18, LineComment=19;
	public static final int
		RULE_ifStatement = 0;
	public static final String[] ruleNames = {
		"ifStatement"
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

	@Override
	public String getGrammarFileName() { return "Duke.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DukeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(DukeParser.If, 0); }
		public TerminalNode Separator() { return getToken(DukeParser.Separator, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2);
			match(If);
			setState(3);
			match(Separator);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\b\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\2\2\3\2\2\2\2\6\2\4\3\2\2\2\4\5\7\13\2\2\5\6\7\17\2\2\6\3"+
		"\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}