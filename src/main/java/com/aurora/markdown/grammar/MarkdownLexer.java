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
		InlineCodeContent=26, InlineCodeEnd=27, LanguageMode=28, LanguageEmptyMode=29, 
		LanguageModeEnd=30, EmptyChar=31, NotEmptyChar=32, BlockCodeEnd=33;
	public static final int
		INLINE_CODE_MODE=1, BLOCK_CODE_MODE=2, BLOCK_CODE_LANGUAGE_MODE=3, BLOCK_CODE_CONTENT_MODE=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INLINE_CODE_MODE", "BLOCK_CODE_MODE", "BLOCK_CODE_LANGUAGE_MODE", 
		"BLOCK_CODE_CONTENT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Letter", "Digit", "Space", "Tab", "Newline", "Star", "Tilde", "Underscore", 
			"Colon", "Slash", "LeftBracket", "RightBracket", "LeftParenthesis", "RightParenthesis", 
			"AtSign", "QuestionMark", "Ampersand", "Hash", "Equal", "Dot", "Plus", 
			"Minus", "Percent", "InlineBacktick", "BlockBacktick", "InlineCodeContent", 
			"InlineCodeEnd", "LanguageMode", "LanguageEmptyMode", "LanguageModeEnd", 
			"EmptyChar", "NotEmptyChar", "BlockCodeEnd"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "' '", "'\\t'", null, "'*'", "'~'", "'_'", "':'", "'/'", 
			"'['", "']'", "'('", "')'", "'@'", "'?'", "'&'", "'#'", "'='", "'.'", 
			"'+'", "'-'", "'%'", null, null, null, null, null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Letter", "Digit", "Space", "Tab", "Newline", "Star", "Tilde", 
			"Underscore", "Colon", "Slash", "LeftBracket", "RightBracket", "LeftParenthesis", 
			"RightParenthesis", "AtSign", "QuestionMark", "Ampersand", "Hash", "Equal", 
			"Dot", "Plus", "Minus", "Percent", "InlineBacktick", "BlockBacktick", 
			"InlineCodeContent", "InlineCodeEnd", "LanguageMode", "LanguageEmptyMode", 
			"LanguageModeEnd", "EmptyChar", "NotEmptyChar", "BlockCodeEnd"
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


	    public void popUntilDefaultMode() {
	        while (_modeStack.size() > 0) {
	            popMode();
	        }
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 32:
			BlockCodeEnd_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void BlockCodeEnd_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			   popUntilDefaultMode();

			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000!\u00a8\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff\uffff"+
		"\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0003\u0004Q\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0004\u0019\u0084\b\u0019\u000b\u0019\f\u0019\u0085\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0004"+
		"\u001b\u008e\b\u001b\u000b\u001b\f\u001b\u008f\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0003\u001d"+
		"\u0099\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0000\u0000!\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005"+
		"\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d"+
		"\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015/\u0016"+
		"1\u00173\u00185\u00197\u001a9\u001b;\u001c=\u001d?\u001eA\u001fC E!\u0005"+
		"\u0000\u0001\u0002\u0003\u0004\u0004\u0002\u0000AZaz\u0001\u000009\u0003"+
		"\u0000\n\n\r\r``\u0003\u0000\t\n\r\r  \u00a8\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u00019\u0001\u0000\u0000\u0000"+
		"\u0002;\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0003?"+
		"\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0004C\u0001\u0000"+
		"\u0000\u0000\u0004E\u0001\u0000\u0000\u0000\u0005G\u0001\u0000\u0000\u0000"+
		"\u0007I\u0001\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000bM\u0001"+
		"\u0000\u0000\u0000\rP\u0001\u0000\u0000\u0000\u000fT\u0001\u0000\u0000"+
		"\u0000\u0011V\u0001\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000\u0015"+
		"Z\u0001\u0000\u0000\u0000\u0017\\\u0001\u0000\u0000\u0000\u0019^\u0001"+
		"\u0000\u0000\u0000\u001b`\u0001\u0000\u0000\u0000\u001db\u0001\u0000\u0000"+
		"\u0000\u001fd\u0001\u0000\u0000\u0000!f\u0001\u0000\u0000\u0000#h\u0001"+
		"\u0000\u0000\u0000%j\u0001\u0000\u0000\u0000\'l\u0001\u0000\u0000\u0000"+
		")n\u0001\u0000\u0000\u0000+p\u0001\u0000\u0000\u0000-r\u0001\u0000\u0000"+
		"\u0000/t\u0001\u0000\u0000\u00001v\u0001\u0000\u0000\u00003x\u0001\u0000"+
		"\u0000\u00005|\u0001\u0000\u0000\u00007\u0083\u0001\u0000\u0000\u0000"+
		"9\u0087\u0001\u0000\u0000\u0000;\u008d\u0001\u0000\u0000\u0000=\u0093"+
		"\u0001\u0000\u0000\u0000?\u0098\u0001\u0000\u0000\u0000A\u009e\u0001\u0000"+
		"\u0000\u0000C\u00a0\u0001\u0000\u0000\u0000E\u00a2\u0001\u0000\u0000\u0000"+
		"GH\u0007\u0000\u0000\u0000H\u0006\u0001\u0000\u0000\u0000IJ\u0007\u0001"+
		"\u0000\u0000J\b\u0001\u0000\u0000\u0000KL\u0005 \u0000\u0000L\n\u0001"+
		"\u0000\u0000\u0000MN\u0005\t\u0000\u0000N\f\u0001\u0000\u0000\u0000OQ"+
		"\u0005\r\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RS\u0005\n\u0000\u0000S\u000e\u0001\u0000\u0000"+
		"\u0000TU\u0005*\u0000\u0000U\u0010\u0001\u0000\u0000\u0000VW\u0005~\u0000"+
		"\u0000W\u0012\u0001\u0000\u0000\u0000XY\u0005_\u0000\u0000Y\u0014\u0001"+
		"\u0000\u0000\u0000Z[\u0005:\u0000\u0000[\u0016\u0001\u0000\u0000\u0000"+
		"\\]\u0005/\u0000\u0000]\u0018\u0001\u0000\u0000\u0000^_\u0005[\u0000\u0000"+
		"_\u001a\u0001\u0000\u0000\u0000`a\u0005]\u0000\u0000a\u001c\u0001\u0000"+
		"\u0000\u0000bc\u0005(\u0000\u0000c\u001e\u0001\u0000\u0000\u0000de\u0005"+
		")\u0000\u0000e \u0001\u0000\u0000\u0000fg\u0005@\u0000\u0000g\"\u0001"+
		"\u0000\u0000\u0000hi\u0005?\u0000\u0000i$\u0001\u0000\u0000\u0000jk\u0005"+
		"&\u0000\u0000k&\u0001\u0000\u0000\u0000lm\u0005#\u0000\u0000m(\u0001\u0000"+
		"\u0000\u0000no\u0005=\u0000\u0000o*\u0001\u0000\u0000\u0000pq\u0005.\u0000"+
		"\u0000q,\u0001\u0000\u0000\u0000rs\u0005+\u0000\u0000s.\u0001\u0000\u0000"+
		"\u0000tu\u0005-\u0000\u0000u0\u0001\u0000\u0000\u0000vw\u0005%\u0000\u0000"+
		"w2\u0001\u0000\u0000\u0000xy\u0005`\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z{\u0006\u0017\u0000\u0000{4\u0001\u0000\u0000\u0000|}\u0005`\u0000\u0000"+
		"}~\u0005`\u0000\u0000~\u007f\u0005`\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0006\u0018\u0001\u0000\u00816\u0001\u0000\u0000"+
		"\u0000\u0082\u0084\b\u0002\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u00868\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005`\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0006\u001a\u0002\u0000\u008a:\u0001\u0000\u0000\u0000\u008b\u008e\u0003"+
		"\u0005\u0000\u0000\u008c\u008e\u0003\u0007\u0001\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0006"+
		"\u001b\u0003\u0000\u0092<\u0001\u0000\u0000\u0000\u0093\u0094\u0005\n"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0006\u001c"+
		"\u0004\u0000\u0096>\u0001\u0000\u0000\u0000\u0097\u0099\u0005\r\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0005\n\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0006\u001d\u0004\u0000"+
		"\u009d@\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0003\u0000\u0000\u009f"+
		"B\u0001\u0000\u0000\u0000\u00a0\u00a1\b\u0003\u0000\u0000\u00a1D\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005`\u0000\u0000\u00a3\u00a4\u0005`\u0000"+
		"\u0000\u00a4\u00a5\u0005`\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0006 \u0005\u0000\u00a7F\u0001\u0000\u0000\u0000\n\u0000"+
		"\u0001\u0002\u0003\u0004P\u0085\u008d\u008f\u0098\u0006\u0005\u0001\u0000"+
		"\u0005\u0002\u0000\u0004\u0000\u0000\u0005\u0003\u0000\u0005\u0004\u0000"+
		"\u0001 \u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}