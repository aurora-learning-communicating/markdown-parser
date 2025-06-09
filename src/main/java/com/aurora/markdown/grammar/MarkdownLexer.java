// Generated from MarkdownLexer.g4 by ANTLR 4.13.2
package com.aurora.markdown.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MarkdownLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Letter=1, Digit=2, Space=3, Tab=4, Newline=5, Star=6, Tilde=7, Underscore=8, 
		Colon=9, Slash=10, LeftBracket=11, RightBracket=12, LeftParenthesis=13, 
		RightParenthesis=14, AtSign=15, QuestionMark=16, Ampersand=17, Hash=18, 
		Equal=19, Dot=20, Plus=21, Minus=22, Percent=23, Backtick=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Letter", "Digit", "Space", "Tab", "Newline", "Star", "Tilde", "Underscore", 
			"Colon", "Slash", "LeftBracket", "RightBracket", "LeftParenthesis", "RightParenthesis", 
			"AtSign", "QuestionMark", "Ampersand", "Hash", "Equal", "Dot", "Plus", 
			"Minus", "Percent", "Backtick"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "' '", "'\\t'", null, "'*'", "'~'", "'_'", "':'", "'/'", 
			"'['", "']'", "'('", "')'", "'@'", "'?'", "'&'", "'#'", "'='", "'.'", 
			"'+'", "'-'", "'%'", "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Letter", "Digit", "Space", "Tab", "Newline", "Star", "Tilde", 
			"Underscore", "Colon", "Slash", "LeftBracket", "RightBracket", "LeftParenthesis", 
			"RightParenthesis", "AtSign", "QuestionMark", "Ampersand", "Hash", "Equal", 
			"Dot", "Plus", "Minus", "Percent", "Backtick"
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


	public MarkdownLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MarkdownLexer.g4"; }

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
		"\u0004\u0000\u0018d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0003\u0004;\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0000\u0000"+
		"\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u0018\u0001\u0000\u0002\u0002\u0000AZaz\u0001\u000009d\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00011\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u00055"+
		"\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t:\u0001\u0000"+
		"\u0000\u0000\u000b>\u0001\u0000\u0000\u0000\r@\u0001\u0000\u0000\u0000"+
		"\u000fB\u0001\u0000\u0000\u0000\u0011D\u0001\u0000\u0000\u0000\u0013F"+
		"\u0001\u0000\u0000\u0000\u0015H\u0001\u0000\u0000\u0000\u0017J\u0001\u0000"+
		"\u0000\u0000\u0019L\u0001\u0000\u0000\u0000\u001bN\u0001\u0000\u0000\u0000"+
		"\u001dP\u0001\u0000\u0000\u0000\u001fR\u0001\u0000\u0000\u0000!T\u0001"+
		"\u0000\u0000\u0000#V\u0001\u0000\u0000\u0000%X\u0001\u0000\u0000\u0000"+
		"\'Z\u0001\u0000\u0000\u0000)\\\u0001\u0000\u0000\u0000+^\u0001\u0000\u0000"+
		"\u0000-`\u0001\u0000\u0000\u0000/b\u0001\u0000\u0000\u000012\u0007\u0000"+
		"\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0007\u0001\u0000\u0000"+
		"4\u0004\u0001\u0000\u0000\u000056\u0005 \u0000\u00006\u0006\u0001\u0000"+
		"\u0000\u000078\u0005\t\u0000\u00008\b\u0001\u0000\u0000\u00009;\u0005"+
		"\r\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<=\u0005\n\u0000\u0000=\n\u0001\u0000\u0000\u0000>?"+
		"\u0005*\u0000\u0000?\f\u0001\u0000\u0000\u0000@A\u0005~\u0000\u0000A\u000e"+
		"\u0001\u0000\u0000\u0000BC\u0005_\u0000\u0000C\u0010\u0001\u0000\u0000"+
		"\u0000DE\u0005:\u0000\u0000E\u0012\u0001\u0000\u0000\u0000FG\u0005/\u0000"+
		"\u0000G\u0014\u0001\u0000\u0000\u0000HI\u0005[\u0000\u0000I\u0016\u0001"+
		"\u0000\u0000\u0000JK\u0005]\u0000\u0000K\u0018\u0001\u0000\u0000\u0000"+
		"LM\u0005(\u0000\u0000M\u001a\u0001\u0000\u0000\u0000NO\u0005)\u0000\u0000"+
		"O\u001c\u0001\u0000\u0000\u0000PQ\u0005@\u0000\u0000Q\u001e\u0001\u0000"+
		"\u0000\u0000RS\u0005?\u0000\u0000S \u0001\u0000\u0000\u0000TU\u0005&\u0000"+
		"\u0000U\"\u0001\u0000\u0000\u0000VW\u0005#\u0000\u0000W$\u0001\u0000\u0000"+
		"\u0000XY\u0005=\u0000\u0000Y&\u0001\u0000\u0000\u0000Z[\u0005.\u0000\u0000"+
		"[(\u0001\u0000\u0000\u0000\\]\u0005+\u0000\u0000]*\u0001\u0000\u0000\u0000"+
		"^_\u0005-\u0000\u0000_,\u0001\u0000\u0000\u0000`a\u0005%\u0000\u0000a"+
		".\u0001\u0000\u0000\u0000bc\u0005`\u0000\u0000c0\u0001\u0000\u0000\u0000"+
		"\u0002\u0000:\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}