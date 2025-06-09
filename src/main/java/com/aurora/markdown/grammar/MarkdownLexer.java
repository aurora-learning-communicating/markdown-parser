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
		Equal=19, Dot=20, Plus=21, Minus=22, Percent=23, InlineBacktick=24, BlockBacktick=25, 
		CodeContent=26, InlineCodeEnd=27, BlockCodeEnd=28;
	public static final int
		CODE_MODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "CODE_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Letter", "Digit", "Space", "Tab", "Newline", "Star", "Tilde", "Underscore", 
			"Colon", "Slash", "LeftBracket", "RightBracket", "LeftParenthesis", "RightParenthesis", 
			"AtSign", "QuestionMark", "Ampersand", "Hash", "Equal", "Dot", "Plus", 
			"Minus", "Percent", "InlineBacktick", "BlockBacktick", "CodeContent", 
			"InlineCodeEnd", "BlockCodeEnd"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "' '", "'\\t'", null, "'*'", "'~'", "'_'", "':'", "'/'", 
			"'['", "']'", "'('", "')'", "'@'", "'?'", "'&'", "'#'", "'='", "'.'", 
			"'+'", "'-'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Letter", "Digit", "Space", "Tab", "Newline", "Star", "Tilde", 
			"Underscore", "Colon", "Slash", "LeftBracket", "RightBracket", "LeftParenthesis", 
			"RightParenthesis", "AtSign", "QuestionMark", "Ampersand", "Hash", "Equal", 
			"Dot", "Plus", "Minus", "Percent", "InlineBacktick", "BlockBacktick", 
			"CodeContent", "InlineCodeEnd", "BlockCodeEnd"
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
		"\u0004\u0000\u001c\u0084\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000"+
		"\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003"+
		"\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006"+
		"\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002"+
		"\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002"+
		"\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002"+
		"\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002"+
		"\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002"+
		"\u0017\u0007\u0017\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002"+
		"\u001a\u0007\u001a\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0003\u0004D\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0004\u0019w\b\u0019\u000b\u0019\f\u0019x\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0000\u0000\u001c\u0002\u0001\u0004\u0002\u0006"+
		"\u0003\b\u0004\n\u0005\f\u0006\u000e\u0007\u0010\b\u0012\t\u0014\n\u0016"+
		"\u000b\u0018\f\u001a\r\u001c\u000e\u001e\u000f \u0010\"\u0011$\u0012&"+
		"\u0013(\u0014*\u0015,\u0016.\u00170\u00182\u00194\u001a6\u001b8\u001c"+
		"\u0002\u0000\u0001\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\n\n"+
		"\r\r``\u0084\u0000\u0002\u0001\u0000\u0000\u0000\u0000\u0004\u0001\u0000"+
		"\u0000\u0000\u0000\u0006\u0001\u0000\u0000\u0000\u0000\b\u0001\u0000\u0000"+
		"\u0000\u0000\n\u0001\u0000\u0000\u0000\u0000\f\u0001\u0000\u0000\u0000"+
		"\u0000\u000e\u0001\u0000\u0000\u0000\u0000\u0010\u0001\u0000\u0000\u0000"+
		"\u0000\u0012\u0001\u0000\u0000\u0000\u0000\u0014\u0001\u0000\u0000\u0000"+
		"\u0000\u0016\u0001\u0000\u0000\u0000\u0000\u0018\u0001\u0000\u0000\u0000"+
		"\u0000\u001a\u0001\u0000\u0000\u0000\u0000\u001c\u0001\u0000\u0000\u0000"+
		"\u0000\u001e\u0001\u0000\u0000\u0000\u0000 \u0001\u0000\u0000\u0000\u0000"+
		"\"\u0001\u0000\u0000\u0000\u0000$\u0001\u0000\u0000\u0000\u0000&\u0001"+
		"\u0000\u0000\u0000\u0000(\u0001\u0000\u0000\u0000\u0000*\u0001\u0000\u0000"+
		"\u0000\u0000,\u0001\u0000\u0000\u0000\u0000.\u0001\u0000\u0000\u0000\u0000"+
		"0\u0001\u0000\u0000\u0000\u00002\u0001\u0000\u0000\u0000\u00014\u0001"+
		"\u0000\u0000\u0000\u00016\u0001\u0000\u0000\u0000\u00018\u0001\u0000\u0000"+
		"\u0000\u0002:\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006"+
		">\u0001\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000"+
		"\u0000\fG\u0001\u0000\u0000\u0000\u000eI\u0001\u0000\u0000\u0000\u0010"+
		"K\u0001\u0000\u0000\u0000\u0012M\u0001\u0000\u0000\u0000\u0014O\u0001"+
		"\u0000\u0000\u0000\u0016Q\u0001\u0000\u0000\u0000\u0018S\u0001\u0000\u0000"+
		"\u0000\u001aU\u0001\u0000\u0000\u0000\u001cW\u0001\u0000\u0000\u0000\u001e"+
		"Y\u0001\u0000\u0000\u0000 [\u0001\u0000\u0000\u0000\"]\u0001\u0000\u0000"+
		"\u0000$_\u0001\u0000\u0000\u0000&a\u0001\u0000\u0000\u0000(c\u0001\u0000"+
		"\u0000\u0000*e\u0001\u0000\u0000\u0000,g\u0001\u0000\u0000\u0000.i\u0001"+
		"\u0000\u0000\u00000k\u0001\u0000\u0000\u00002o\u0001\u0000\u0000\u0000"+
		"4v\u0001\u0000\u0000\u00006z\u0001\u0000\u0000\u00008~\u0001\u0000\u0000"+
		"\u0000:;\u0007\u0000\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0007"+
		"\u0001\u0000\u0000=\u0005\u0001\u0000\u0000\u0000>?\u0005 \u0000\u0000"+
		"?\u0007\u0001\u0000\u0000\u0000@A\u0005\t\u0000\u0000A\t\u0001\u0000\u0000"+
		"\u0000BD\u0005\r\u0000\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EF\u0005\n\u0000\u0000F\u000b\u0001\u0000"+
		"\u0000\u0000GH\u0005*\u0000\u0000H\r\u0001\u0000\u0000\u0000IJ\u0005~"+
		"\u0000\u0000J\u000f\u0001\u0000\u0000\u0000KL\u0005_\u0000\u0000L\u0011"+
		"\u0001\u0000\u0000\u0000MN\u0005:\u0000\u0000N\u0013\u0001\u0000\u0000"+
		"\u0000OP\u0005/\u0000\u0000P\u0015\u0001\u0000\u0000\u0000QR\u0005[\u0000"+
		"\u0000R\u0017\u0001\u0000\u0000\u0000ST\u0005]\u0000\u0000T\u0019\u0001"+
		"\u0000\u0000\u0000UV\u0005(\u0000\u0000V\u001b\u0001\u0000\u0000\u0000"+
		"WX\u0005)\u0000\u0000X\u001d\u0001\u0000\u0000\u0000YZ\u0005@\u0000\u0000"+
		"Z\u001f\u0001\u0000\u0000\u0000[\\\u0005?\u0000\u0000\\!\u0001\u0000\u0000"+
		"\u0000]^\u0005&\u0000\u0000^#\u0001\u0000\u0000\u0000_`\u0005#\u0000\u0000"+
		"`%\u0001\u0000\u0000\u0000ab\u0005=\u0000\u0000b\'\u0001\u0000\u0000\u0000"+
		"cd\u0005.\u0000\u0000d)\u0001\u0000\u0000\u0000ef\u0005+\u0000\u0000f"+
		"+\u0001\u0000\u0000\u0000gh\u0005-\u0000\u0000h-\u0001\u0000\u0000\u0000"+
		"ij\u0005%\u0000\u0000j/\u0001\u0000\u0000\u0000kl\u0005`\u0000\u0000l"+
		"m\u0001\u0000\u0000\u0000mn\u0006\u0017\u0000\u0000n1\u0001\u0000\u0000"+
		"\u0000op\u0005`\u0000\u0000pq\u0005`\u0000\u0000qr\u0005`\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0006\u0018\u0000\u0000t3\u0001\u0000\u0000"+
		"\u0000uw\b\u0002\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y5\u0001\u0000"+
		"\u0000\u0000z{\u0005`\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0006\u001a"+
		"\u0001\u0000}7\u0001\u0000\u0000\u0000~\u007f\u0005`\u0000\u0000\u007f"+
		"\u0080\u0005`\u0000\u0000\u0080\u0081\u0005`\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0006\u001b\u0001\u0000\u00839\u0001\u0000"+
		"\u0000\u0000\u0004\u0000\u0001Cx\u0002\u0005\u0001\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}