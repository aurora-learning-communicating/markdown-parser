// Generated from MarkdownRule.g4 by ANTLR 4.13.2
package com.aurora.markdown.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MarkdownRule extends Parser {
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
		RULE_start = 0, RULE_markdown = 1, RULE_inline = 2, RULE_indent = 3, RULE_plainText = 4, 
		RULE_inlineCode = 5, RULE_emphasis = 6, RULE_boldTag = 7, RULE_boldElement = 8, 
		RULE_bold = 9, RULE_italicTag = 10, RULE_italicElement = 11, RULE_italic = 12, 
		RULE_strikeThroughTag = 13, RULE_strikeThroughElement = 14, RULE_strikeThrough = 15, 
		RULE_urlLink = 16, RULE_altText = 17, RULE_url = 18, RULE_colonSlashSlash = 19, 
		RULE_scheme = 20, RULE_host = 21, RULE_hostname = 22, RULE_v6host = 23, 
		RULE_port = 24, RULE_path = 25, RULE_user = 26, RULE_login = 27, RULE_password = 28, 
		RULE_frag = 29, RULE_query = 30, RULE_search = 31, RULE_searchparameter = 32, 
		RULE_string = 33, RULE_hex = 34, RULE_block = 35, RULE_blockCodeLanguage = 36, 
		RULE_blockCodeContent = 37, RULE_blockCode = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "markdown", "inline", "indent", "plainText", "inlineCode", "emphasis", 
			"boldTag", "boldElement", "bold", "italicTag", "italicElement", "italic", 
			"strikeThroughTag", "strikeThroughElement", "strikeThrough", "urlLink", 
			"altText", "url", "colonSlashSlash", "scheme", "host", "hostname", "v6host", 
			"port", "path", "user", "login", "password", "frag", "query", "search", 
			"searchparameter", "string", "hex", "block", "blockCodeLanguage", "blockCodeContent", 
			"blockCode"
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

	@Override
	public String getGrammarFileName() { return "MarkdownRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MarkdownRule(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MarkdownRule.EOF, 0); }
		public List<MarkdownContext> markdown() {
			return getRuleContexts(MarkdownContext.class);
		}
		public MarkdownContext markdown(int i) {
			return getRuleContext(MarkdownContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50333894L) != 0)) {
				{
				{
				setState(78);
				markdown();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(EOF);
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
	public static class MarkdownContext extends ParserRuleContext {
		public InlineContext inline() {
			return getRuleContext(InlineContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MarkdownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markdown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterMarkdown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitMarkdown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitMarkdown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkdownContext markdown() throws RecognitionException {
		MarkdownContext _localctx = new MarkdownContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_markdown);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
			case Digit:
			case Star:
			case Tilde:
			case LeftBracket:
			case InlineBacktick:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				inline();
				}
				break;
			case BlockBacktick:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InlineContext extends ParserRuleContext {
		public PlainTextContext plainText() {
			return getRuleContext(PlainTextContext.class,0);
		}
		public InlineCodeContext inlineCode() {
			return getRuleContext(InlineCodeContext.class,0);
		}
		public EmphasisContext emphasis() {
			return getRuleContext(EmphasisContext.class,0);
		}
		public UrlLinkContext urlLink() {
			return getRuleContext(UrlLinkContext.class,0);
		}
		public InlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterInline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitInline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitInline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineContext inline() throws RecognitionException {
		InlineContext _localctx = new InlineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inline);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				plainText();
				}
				break;
			case InlineBacktick:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				inlineCode();
				}
				break;
			case Star:
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				emphasis();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				urlLink();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IndentContext extends ParserRuleContext {
		public List<TerminalNode> Space() { return getTokens(MarkdownRule.Space); }
		public TerminalNode Space(int i) {
			return getToken(MarkdownRule.Space, i);
		}
		public TerminalNode Tab() { return getToken(MarkdownRule.Tab, 0); }
		public IndentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterIndent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitIndent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitIndent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndentContext indent() throws RecognitionException {
		IndentContext _localctx = new IndentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_indent);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Space:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					match(Space);
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space );
				}
				break;
			case Tab:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(Tab);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PlainTextContext extends ParserRuleContext {
		public List<TerminalNode> Letter() { return getTokens(MarkdownRule.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(MarkdownRule.Letter, i);
		}
		public List<TerminalNode> Digit() { return getTokens(MarkdownRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(MarkdownRule.Digit, i);
		}
		public PlainTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plainText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterPlainText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitPlainText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitPlainText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlainTextContext plainText() throws RecognitionException {
		PlainTextContext _localctx = new PlainTextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_plainText);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(104);
					_la = _input.LA(1);
					if ( !(_la==Letter || _la==Digit) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(107); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class InlineCodeContext extends ParserRuleContext {
		public Token content;
		public TerminalNode InlineBacktick() { return getToken(MarkdownRule.InlineBacktick, 0); }
		public TerminalNode InlineCodeEnd() { return getToken(MarkdownRule.InlineCodeEnd, 0); }
		public TerminalNode InlineCodeContent() { return getToken(MarkdownRule.InlineCodeContent, 0); }
		public InlineCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterInlineCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitInlineCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitInlineCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineCodeContext inlineCode() throws RecognitionException {
		InlineCodeContext _localctx = new InlineCodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inlineCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(InlineBacktick);
			setState(110);
			((InlineCodeContext)_localctx).content = match(InlineCodeContent);
			setState(111);
			match(InlineCodeEnd);
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
	public static class EmphasisContext extends ParserRuleContext {
		public BoldContext bold() {
			return getRuleContext(BoldContext.class,0);
		}
		public ItalicContext italic() {
			return getRuleContext(ItalicContext.class,0);
		}
		public StrikeThroughContext strikeThrough() {
			return getRuleContext(StrikeThroughContext.class,0);
		}
		public EmphasisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emphasis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterEmphasis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitEmphasis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitEmphasis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmphasisContext emphasis() throws RecognitionException {
		EmphasisContext _localctx = new EmphasisContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_emphasis);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				bold();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				italic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				strikeThrough();
				}
				break;
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
	public static class BoldTagContext extends ParserRuleContext {
		public List<TerminalNode> Star() { return getTokens(MarkdownRule.Star); }
		public TerminalNode Star(int i) {
			return getToken(MarkdownRule.Star, i);
		}
		public BoldTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boldTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterBoldTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitBoldTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitBoldTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoldTagContext boldTag() throws RecognitionException {
		BoldTagContext _localctx = new BoldTagContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boldTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(Star);
			setState(119);
			match(Star);
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
	public static class BoldElementContext extends ParserRuleContext {
		public PlainTextContext plainText() {
			return getRuleContext(PlainTextContext.class,0);
		}
		public InlineCodeContext inlineCode() {
			return getRuleContext(InlineCodeContext.class,0);
		}
		public StrikeThroughContext strikeThrough() {
			return getRuleContext(StrikeThroughContext.class,0);
		}
		public ItalicContext italic() {
			return getRuleContext(ItalicContext.class,0);
		}
		public UrlLinkContext urlLink() {
			return getRuleContext(UrlLinkContext.class,0);
		}
		public BoldElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boldElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterBoldElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitBoldElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitBoldElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoldElementContext boldElement() throws RecognitionException {
		BoldElementContext _localctx = new BoldElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boldElement);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				plainText();
				}
				break;
			case InlineBacktick:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				inlineCode();
				}
				break;
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				strikeThrough();
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				italic();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				urlLink();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoldContext extends ParserRuleContext {
		public BoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bold; }
	 
		public BoldContext() { }
		public void copyFrom(BoldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoldMultiContext extends BoldContext {
		public List<BoldTagContext> boldTag() {
			return getRuleContexts(BoldTagContext.class);
		}
		public BoldTagContext boldTag(int i) {
			return getRuleContext(BoldTagContext.class,i);
		}
		public List<BoldElementContext> boldElement() {
			return getRuleContexts(BoldElementContext.class);
		}
		public BoldElementContext boldElement(int i) {
			return getRuleContext(BoldElementContext.class,i);
		}
		public List<IndentContext> indent() {
			return getRuleContexts(IndentContext.class);
		}
		public IndentContext indent(int i) {
			return getRuleContext(IndentContext.class,i);
		}
		public BoldMultiContext(BoldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterBoldMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitBoldMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitBoldMulti(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoldSingleContext extends BoldContext {
		public List<BoldTagContext> boldTag() {
			return getRuleContexts(BoldTagContext.class);
		}
		public BoldTagContext boldTag(int i) {
			return getRuleContext(BoldTagContext.class,i);
		}
		public BoldElementContext boldElement() {
			return getRuleContext(BoldElementContext.class,0);
		}
		public BoldSingleContext(BoldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterBoldSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitBoldSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitBoldSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoldContext bold() throws RecognitionException {
		BoldContext _localctx = new BoldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bold);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new BoldSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				boldTag();
				setState(129);
				boldElement();
				setState(130);
				boldTag();
				}
				break;
			case 2:
				_localctx = new BoldMultiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				boldTag();
				setState(133);
				boldElement();
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					indent();
					setState(135);
					boldElement();
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space || _la==Tab );
				setState(141);
				boldTag();
				}
				break;
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
	public static class ItalicTagContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(MarkdownRule.Star, 0); }
		public ItalicTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italicTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterItalicTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitItalicTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitItalicTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItalicTagContext italicTag() throws RecognitionException {
		ItalicTagContext _localctx = new ItalicTagContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_italicTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(Star);
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
	public static class ItalicElementContext extends ParserRuleContext {
		public BoldContext bold() {
			return getRuleContext(BoldContext.class,0);
		}
		public InlineCodeContext inlineCode() {
			return getRuleContext(InlineCodeContext.class,0);
		}
		public StrikeThroughContext strikeThrough() {
			return getRuleContext(StrikeThroughContext.class,0);
		}
		public PlainTextContext plainText() {
			return getRuleContext(PlainTextContext.class,0);
		}
		public UrlLinkContext urlLink() {
			return getRuleContext(UrlLinkContext.class,0);
		}
		public ItalicElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italicElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterItalicElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitItalicElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitItalicElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItalicElementContext italicElement() throws RecognitionException {
		ItalicElementContext _localctx = new ItalicElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_italicElement);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				bold();
				}
				break;
			case InlineBacktick:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				inlineCode();
				}
				break;
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				strikeThrough();
				}
				break;
			case Letter:
			case Digit:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				plainText();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				urlLink();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItalicContext extends ParserRuleContext {
		public ItalicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italic; }
	 
		public ItalicContext() { }
		public void copyFrom(ItalicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ItalicMutliContext extends ItalicContext {
		public List<ItalicTagContext> italicTag() {
			return getRuleContexts(ItalicTagContext.class);
		}
		public ItalicTagContext italicTag(int i) {
			return getRuleContext(ItalicTagContext.class,i);
		}
		public List<ItalicElementContext> italicElement() {
			return getRuleContexts(ItalicElementContext.class);
		}
		public ItalicElementContext italicElement(int i) {
			return getRuleContext(ItalicElementContext.class,i);
		}
		public List<IndentContext> indent() {
			return getRuleContexts(IndentContext.class);
		}
		public IndentContext indent(int i) {
			return getRuleContext(IndentContext.class,i);
		}
		public ItalicMutliContext(ItalicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterItalicMutli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitItalicMutli(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitItalicMutli(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ItalicSingleContext extends ItalicContext {
		public List<ItalicTagContext> italicTag() {
			return getRuleContexts(ItalicTagContext.class);
		}
		public ItalicTagContext italicTag(int i) {
			return getRuleContext(ItalicTagContext.class,i);
		}
		public ItalicElementContext italicElement() {
			return getRuleContext(ItalicElementContext.class,0);
		}
		public ItalicSingleContext(ItalicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterItalicSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitItalicSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitItalicSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItalicContext italic() throws RecognitionException {
		ItalicContext _localctx = new ItalicContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_italic);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ItalicSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				italicTag();
				setState(155);
				italicElement();
				setState(156);
				italicTag();
				}
				break;
			case 2:
				_localctx = new ItalicMutliContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				italicTag();
				setState(159);
				italicElement();
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(160);
					indent();
					setState(161);
					italicElement();
					}
					}
					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space || _la==Tab );
				setState(167);
				italicTag();
				}
				break;
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
	public static class StrikeThroughTagContext extends ParserRuleContext {
		public List<TerminalNode> Tilde() { return getTokens(MarkdownRule.Tilde); }
		public TerminalNode Tilde(int i) {
			return getToken(MarkdownRule.Tilde, i);
		}
		public StrikeThroughTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strikeThroughTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterStrikeThroughTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitStrikeThroughTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitStrikeThroughTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrikeThroughTagContext strikeThroughTag() throws RecognitionException {
		StrikeThroughTagContext _localctx = new StrikeThroughTagContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_strikeThroughTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(Tilde);
			setState(172);
			match(Tilde);
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
	public static class StrikeThroughElementContext extends ParserRuleContext {
		public ItalicContext italic() {
			return getRuleContext(ItalicContext.class,0);
		}
		public BoldContext bold() {
			return getRuleContext(BoldContext.class,0);
		}
		public InlineCodeContext inlineCode() {
			return getRuleContext(InlineCodeContext.class,0);
		}
		public PlainTextContext plainText() {
			return getRuleContext(PlainTextContext.class,0);
		}
		public UrlLinkContext urlLink() {
			return getRuleContext(UrlLinkContext.class,0);
		}
		public StrikeThroughElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strikeThroughElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterStrikeThroughElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitStrikeThroughElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitStrikeThroughElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrikeThroughElementContext strikeThroughElement() throws RecognitionException {
		StrikeThroughElementContext _localctx = new StrikeThroughElementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_strikeThroughElement);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				italic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				bold();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				inlineCode();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				plainText();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				urlLink();
				}
				break;
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
	public static class StrikeThroughContext extends ParserRuleContext {
		public StrikeThroughContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strikeThrough; }
	 
		public StrikeThroughContext() { }
		public void copyFrom(StrikeThroughContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrikeThroughMultiContext extends StrikeThroughContext {
		public List<StrikeThroughTagContext> strikeThroughTag() {
			return getRuleContexts(StrikeThroughTagContext.class);
		}
		public StrikeThroughTagContext strikeThroughTag(int i) {
			return getRuleContext(StrikeThroughTagContext.class,i);
		}
		public List<StrikeThroughElementContext> strikeThroughElement() {
			return getRuleContexts(StrikeThroughElementContext.class);
		}
		public StrikeThroughElementContext strikeThroughElement(int i) {
			return getRuleContext(StrikeThroughElementContext.class,i);
		}
		public List<IndentContext> indent() {
			return getRuleContexts(IndentContext.class);
		}
		public IndentContext indent(int i) {
			return getRuleContext(IndentContext.class,i);
		}
		public StrikeThroughMultiContext(StrikeThroughContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterStrikeThroughMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitStrikeThroughMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitStrikeThroughMulti(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrikeThroughSingleContext extends StrikeThroughContext {
		public List<StrikeThroughTagContext> strikeThroughTag() {
			return getRuleContexts(StrikeThroughTagContext.class);
		}
		public StrikeThroughTagContext strikeThroughTag(int i) {
			return getRuleContext(StrikeThroughTagContext.class,i);
		}
		public StrikeThroughElementContext strikeThroughElement() {
			return getRuleContext(StrikeThroughElementContext.class,0);
		}
		public StrikeThroughSingleContext(StrikeThroughContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterStrikeThroughSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitStrikeThroughSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitStrikeThroughSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrikeThroughContext strikeThrough() throws RecognitionException {
		StrikeThroughContext _localctx = new StrikeThroughContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_strikeThrough);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new StrikeThroughSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				strikeThroughTag();
				setState(182);
				strikeThroughElement();
				setState(183);
				strikeThroughTag();
				}
				break;
			case 2:
				_localctx = new StrikeThroughMultiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				strikeThroughTag();
				setState(186);
				strikeThroughElement();
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(187);
					indent();
					setState(188);
					strikeThroughElement();
					}
					}
					setState(192); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space || _la==Tab );
				setState(194);
				strikeThroughTag();
				}
				break;
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
	public static class UrlLinkContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(MarkdownRule.LeftBracket, 0); }
		public AltTextContext altText() {
			return getRuleContext(AltTextContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MarkdownRule.RightBracket, 0); }
		public TerminalNode LeftParenthesis() { return getToken(MarkdownRule.LeftParenthesis, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(MarkdownRule.RightParenthesis, 0); }
		public UrlLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urlLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterUrlLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitUrlLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitUrlLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlLinkContext urlLink() throws RecognitionException {
		UrlLinkContext _localctx = new UrlLinkContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_urlLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(LeftBracket);
			setState(199);
			altText();
			setState(200);
			match(RightBracket);
			setState(201);
			match(LeftParenthesis);
			setState(202);
			url();
			setState(203);
			match(RightParenthesis);
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
	public static class AltTextContext extends ParserRuleContext {
		public List<PlainTextContext> plainText() {
			return getRuleContexts(PlainTextContext.class);
		}
		public PlainTextContext plainText(int i) {
			return getRuleContext(PlainTextContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(MarkdownRule.Space); }
		public TerminalNode Space(int i) {
			return getToken(MarkdownRule.Space, i);
		}
		public AltTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterAltText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitAltText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitAltText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltTextContext altText() throws RecognitionException {
		AltTextContext _localctx = new AltTextContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_altText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			plainText();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(206);
				match(Space);
				setState(207);
				plainText();
				}
				}
				setState(212);
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
	public static class UrlContext extends ParserRuleContext {
		public SchemeContext scheme() {
			return getRuleContext(SchemeContext.class,0);
		}
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public ColonSlashSlashContext colonSlashSlash() {
			return getRuleContext(ColonSlashSlashContext.class,0);
		}
		public TerminalNode Colon() { return getToken(MarkdownRule.Colon, 0); }
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public TerminalNode Slash() { return getToken(MarkdownRule.Slash, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public FragContext frag() {
			return getRuleContext(FragContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			scheme();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(214);
				colonSlashSlash();
				}
			}

			setState(217);
			host();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(218);
				match(Colon);
				setState(219);
				port();
				}
			}

			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(222);
				match(Slash);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388998L) != 0)) {
					{
					setState(223);
					path();
					}
				}

				}
			}

			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(228);
				query();
				}
			}

			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Hash) {
				{
				setState(231);
				frag();
				}
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
	public static class ColonSlashSlashContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(MarkdownRule.Colon, 0); }
		public List<TerminalNode> Slash() { return getTokens(MarkdownRule.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(MarkdownRule.Slash, i);
		}
		public ColonSlashSlashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonSlashSlash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterColonSlashSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitColonSlashSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitColonSlashSlash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonSlashSlashContext colonSlashSlash() throws RecognitionException {
		ColonSlashSlashContext _localctx = new ColonSlashSlashContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_colonSlashSlash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(Colon);
			setState(235);
			match(Slash);
			setState(236);
			match(Slash);
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
	public static class SchemeContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitScheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitScheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeContext scheme() throws RecognitionException {
		SchemeContext _localctx = new SchemeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			string();
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
	public static class HostContext extends ParserRuleContext {
		public HostnameContext hostname() {
			return getRuleContext(HostnameContext.class,0);
		}
		public TerminalNode Slash() { return getToken(MarkdownRule.Slash, 0); }
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterHost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitHost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitHost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_host);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(240);
				match(Slash);
				}
			}

			setState(243);
			hostname();
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
	public static class HostnameContext extends ParserRuleContext {
		public HostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostname; }
	 
		public HostnameContext() { }
		public void copyFrom(HostnameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IPv6HostContext extends HostnameContext {
		public TerminalNode LeftBracket() { return getToken(MarkdownRule.LeftBracket, 0); }
		public V6hostContext v6host() {
			return getRuleContext(V6hostContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MarkdownRule.RightBracket, 0); }
		public IPv6HostContext(HostnameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterIPv6Host(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitIPv6Host(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitIPv6Host(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DomainNameOrIPv4HostContext extends HostnameContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DomainNameOrIPv4HostContext(HostnameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterDomainNameOrIPv4Host(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitDomainNameOrIPv4Host(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitDomainNameOrIPv4Host(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnameContext hostname() throws RecognitionException {
		HostnameContext _localctx = new HostnameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_hostname);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
			case Digit:
			case Tilde:
			case Underscore:
			case Percent:
				_localctx = new DomainNameOrIPv4HostContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				string();
				}
				break;
			case LeftBracket:
				_localctx = new IPv6HostContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(LeftBracket);
				setState(247);
				v6host();
				setState(248);
				match(RightBracket);
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

	@SuppressWarnings("CheckReturnValue")
	public static class V6hostContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(MarkdownRule.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(MarkdownRule.Colon, i);
		}
		public List<TerminalNode> Digit() { return getTokens(MarkdownRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(MarkdownRule.Digit, i);
		}
		public V6hostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v6host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterV6host(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitV6host(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitV6host(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V6hostContext v6host() throws RecognitionException {
		V6hostContext _localctx = new V6hostContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_v6host);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(252);
				match(Colon);
				setState(253);
				match(Colon);
				}
			}

			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(256);
				string();
				}
				break;
			case 2:
				{
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(257);
					match(Digit);
					}
					}
					setState(260); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Digit );
				}
				break;
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(264);
				match(Colon);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(265);
					match(Colon);
					}
				}

				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(268);
					string();
					}
					break;
				case 2:
					{
					setState(270); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(269);
						match(Digit);
						}
						}
						setState(272); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Digit );
					}
					break;
				}
				}
				}
				setState(280);
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
	public static class PortContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(MarkdownRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(MarkdownRule.Digit, i);
		}
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitPort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitPort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(281);
				match(Digit);
				}
				}
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Digit );
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
	public static class PathContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> Slash() { return getTokens(MarkdownRule.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(MarkdownRule.Slash, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_path);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			string();
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(287);
					match(Slash);
					setState(288);
					string();
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(294);
				match(Slash);
				}
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
	public static class UserContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			string();
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
	public static class LoginContext extends ParserRuleContext {
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TerminalNode AtSign() { return getToken(MarkdownRule.AtSign, 0); }
		public TerminalNode Slash() { return getToken(MarkdownRule.Slash, 0); }
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public LoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_login; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterLogin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitLogin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoginContext login() throws RecognitionException {
		LoginContext _localctx = new LoginContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_login);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			user();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(300);
				match(Slash);
				setState(301);
				password();
				}
			}

			setState(304);
			match(AtSign);
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
	public static class PasswordContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitPassword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			string();
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
	public static class FragContext extends ParserRuleContext {
		public TerminalNode Hash() { return getToken(MarkdownRule.Hash, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> Digit() { return getTokens(MarkdownRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(MarkdownRule.Digit, i);
		}
		public FragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterFrag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitFrag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitFrag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragContext frag() throws RecognitionException {
		FragContext _localctx = new FragContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_frag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(Hash);
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(309);
				string();
				}
				break;
			case 2:
				{
				setState(311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(310);
					match(Digit);
					}
					}
					setState(313); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Digit );
				}
				break;
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
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode QuestionMark() { return getToken(MarkdownRule.QuestionMark, 0); }
		public SearchContext search() {
			return getRuleContext(SearchContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(QuestionMark);
			setState(318);
			search();
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
	public static class SearchContext extends ParserRuleContext {
		public List<SearchparameterContext> searchparameter() {
			return getRuleContexts(SearchparameterContext.class);
		}
		public SearchparameterContext searchparameter(int i) {
			return getRuleContext(SearchparameterContext.class,i);
		}
		public List<TerminalNode> Ampersand() { return getTokens(MarkdownRule.Ampersand); }
		public TerminalNode Ampersand(int i) {
			return getToken(MarkdownRule.Ampersand, i);
		}
		public SearchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterSearch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitSearch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitSearch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchContext search() throws RecognitionException {
		SearchContext _localctx = new SearchContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_search);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			searchparameter();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Ampersand) {
				{
				{
				setState(321);
				match(Ampersand);
				setState(322);
				searchparameter();
				}
				}
				setState(327);
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
	public static class SearchparameterContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode Equal() { return getToken(MarkdownRule.Equal, 0); }
		public HexContext hex() {
			return getRuleContext(HexContext.class,0);
		}
		public List<TerminalNode> Digit() { return getTokens(MarkdownRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(MarkdownRule.Digit, i);
		}
		public SearchparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterSearchparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitSearchparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitSearchparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchparameterContext searchparameter() throws RecognitionException {
		SearchparameterContext _localctx = new SearchparameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_searchparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			string();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(329);
				match(Equal);
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(330);
					string();
					}
					break;
				case 2:
					{
					setState(332); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(331);
						match(Digit);
						}
						}
						setState(334); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Digit );
					}
					break;
				case 3:
					{
					setState(336);
					hex();
					}
					break;
				}
				}
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
	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> Letter() { return getTokens(MarkdownRule.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(MarkdownRule.Letter, i);
		}
		public TerminalNode Tilde() { return getToken(MarkdownRule.Tilde, 0); }
		public List<TerminalNode> Digit() { return getTokens(MarkdownRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(MarkdownRule.Digit, i);
		}
		public List<HexContext> hex() {
			return getRuleContexts(HexContext.class);
		}
		public HexContext hex(int i) {
			return getRuleContext(HexContext.class,i);
		}
		public List<TerminalNode> Underscore() { return getTokens(MarkdownRule.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(MarkdownRule.Underscore, i);
		}
		public List<TerminalNode> Dot() { return getTokens(MarkdownRule.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(MarkdownRule.Dot, i);
		}
		public List<TerminalNode> Plus() { return getTokens(MarkdownRule.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(MarkdownRule.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(MarkdownRule.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(MarkdownRule.Minus, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_string);
		try {
			int _alt;
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Letter:
					{
					setState(341);
					match(Letter);
					}
					break;
				case Tilde:
					{
					setState(342);
					match(Tilde);
					}
					break;
				case Digit:
					{
					setState(343);
					match(Digit);
					}
					break;
				case Percent:
					{
					setState(344);
					hex();
					}
					break;
				case Underscore:
					{
					setState(345);
					match(Underscore);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(355);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Letter:
							{
							setState(348);
							match(Letter);
							}
							break;
						case Digit:
							{
							setState(349);
							match(Digit);
							}
							break;
						case Dot:
							{
							setState(350);
							match(Dot);
							}
							break;
						case Plus:
							{
							setState(351);
							match(Plus);
							}
							break;
						case Minus:
							{
							setState(352);
							match(Minus);
							}
							break;
						case Percent:
							{
							setState(353);
							hex();
							}
							break;
						case Underscore:
							{
							setState(354);
							match(Underscore);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(359);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(360);
						match(Digit);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(363); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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
	public static class HexContext extends ParserRuleContext {
		public List<TerminalNode> Percent() { return getTokens(MarkdownRule.Percent); }
		public TerminalNode Percent(int i) {
			return getToken(MarkdownRule.Percent, i);
		}
		public List<TerminalNode> Letter() { return getTokens(MarkdownRule.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(MarkdownRule.Letter, i);
		}
		public List<TerminalNode> Digit() { return getTokens(MarkdownRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(MarkdownRule.Digit, i);
		}
		public HexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitHex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexContext hex() throws RecognitionException {
		HexContext _localctx = new HexContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_hex);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(367);
					match(Percent);
					setState(368);
					_la = _input.LA(1);
					if ( !(_la==Letter || _la==Digit) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(369);
					_la = _input.LA(1);
					if ( !(_la==Letter || _la==Digit) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(372); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class BlockContext extends ParserRuleContext {
		public BlockCodeContext blockCode() {
			return getRuleContext(BlockCodeContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			blockCode();
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
	public static class BlockCodeLanguageContext extends ParserRuleContext {
		public BlockCodeLanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCodeLanguage; }
	 
		public BlockCodeLanguageContext() { }
		public void copyFrom(BlockCodeLanguageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockCodeWithoutLanguageContext extends BlockCodeLanguageContext {
		public TerminalNode BlockBacktick() { return getToken(MarkdownRule.BlockBacktick, 0); }
		public TerminalNode LanguageEmptyMode() { return getToken(MarkdownRule.LanguageEmptyMode, 0); }
		public BlockCodeWithoutLanguageContext(BlockCodeLanguageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterBlockCodeWithoutLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitBlockCodeWithoutLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitBlockCodeWithoutLanguage(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockCodeWithLanguageContext extends BlockCodeLanguageContext {
		public TerminalNode BlockBacktick() { return getToken(MarkdownRule.BlockBacktick, 0); }
		public TerminalNode LanguageMode() { return getToken(MarkdownRule.LanguageMode, 0); }
		public TerminalNode LanguageModeEnd() { return getToken(MarkdownRule.LanguageModeEnd, 0); }
		public BlockCodeWithLanguageContext(BlockCodeLanguageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterBlockCodeWithLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitBlockCodeWithLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitBlockCodeWithLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockCodeLanguageContext blockCodeLanguage() throws RecognitionException {
		BlockCodeLanguageContext _localctx = new BlockCodeLanguageContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_blockCodeLanguage);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new BlockCodeWithLanguageContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(BlockBacktick);
				setState(377);
				match(LanguageMode);
				setState(378);
				match(LanguageModeEnd);
				}
				break;
			case 2:
				_localctx = new BlockCodeWithoutLanguageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(BlockBacktick);
				setState(380);
				match(LanguageEmptyMode);
				}
				break;
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
	public static class BlockCodeContentContext extends ParserRuleContext {
		public List<TerminalNode> EmptyChar() { return getTokens(MarkdownRule.EmptyChar); }
		public TerminalNode EmptyChar(int i) {
			return getToken(MarkdownRule.EmptyChar, i);
		}
		public List<TerminalNode> NotEmptyChar() { return getTokens(MarkdownRule.NotEmptyChar); }
		public TerminalNode NotEmptyChar(int i) {
			return getToken(MarkdownRule.NotEmptyChar, i);
		}
		public BlockCodeContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCodeContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterBlockCodeContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitBlockCodeContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitBlockCodeContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockCodeContentContext blockCodeContent() throws RecognitionException {
		BlockCodeContentContext _localctx = new BlockCodeContentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_blockCodeContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(383);
				_la = _input.LA(1);
				if ( !(_la==EmptyChar || _la==NotEmptyChar) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(386); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EmptyChar || _la==NotEmptyChar );
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
	public static class BlockCodeContext extends ParserRuleContext {
		public BlockCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCode; }
	 
		public BlockCodeContext() { }
		public void copyFrom(BlockCodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockCodeEmptyCase1Context extends BlockCodeContext {
		public BlockCodeLanguageContext blockCodeLanguage() {
			return getRuleContext(BlockCodeLanguageContext.class,0);
		}
		public TerminalNode BlockCodeEnd() { return getToken(MarkdownRule.BlockCodeEnd, 0); }
		public BlockCodeEmptyCase1Context(BlockCodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterBlockCodeEmptyCase1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitBlockCodeEmptyCase1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitBlockCodeEmptyCase1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockCodeEmptyCase2Context extends BlockCodeContext {
		public Token empty;
		public BlockCodeLanguageContext blockCodeLanguage() {
			return getRuleContext(BlockCodeLanguageContext.class,0);
		}
		public TerminalNode BlockCodeEnd() { return getToken(MarkdownRule.BlockCodeEnd, 0); }
		public List<TerminalNode> EmptyChar() { return getTokens(MarkdownRule.EmptyChar); }
		public TerminalNode EmptyChar(int i) {
			return getToken(MarkdownRule.EmptyChar, i);
		}
		public BlockCodeEmptyCase2Context(BlockCodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterBlockCodeEmptyCase2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitBlockCodeEmptyCase2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitBlockCodeEmptyCase2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockCodeNotEmptyContext extends BlockCodeContext {
		public BlockCodeLanguageContext blockCodeLanguage() {
			return getRuleContext(BlockCodeLanguageContext.class,0);
		}
		public BlockCodeContentContext blockCodeContent() {
			return getRuleContext(BlockCodeContentContext.class,0);
		}
		public TerminalNode BlockCodeEnd() { return getToken(MarkdownRule.BlockCodeEnd, 0); }
		public BlockCodeNotEmptyContext(BlockCodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterBlockCodeNotEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitBlockCodeNotEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitBlockCodeNotEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockCodeContext blockCode() throws RecognitionException {
		BlockCodeContext _localctx = new BlockCodeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_blockCode);
		int _la;
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new BlockCodeEmptyCase1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				blockCodeLanguage();
				setState(389);
				match(BlockCodeEnd);
				}
				break;
			case 2:
				_localctx = new BlockCodeEmptyCase2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				blockCodeLanguage();
				setState(393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(392);
					((BlockCodeEmptyCase2Context)_localctx).empty = match(EmptyChar);
					}
					}
					setState(395); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EmptyChar );
				setState(397);
				match(BlockCodeEnd);
				}
				break;
			case 3:
				_localctx = new BlockCodeNotEmptyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				blockCodeLanguage();
				setState(400);
				blockCodeContent();
				setState(401);
				match(BlockCodeEnd);
				}
				break;
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
		"\u0004\u0001!\u0196\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0005\u0000"+
		"P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001Y\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002_\b\u0002\u0001\u0003\u0004\u0003b\b\u0003\u000b"+
		"\u0003\f\u0003c\u0001\u0003\u0003\u0003g\b\u0003\u0001\u0004\u0004\u0004"+
		"j\b\u0004\u000b\u0004\f\u0004k\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006u\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u007f\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0004\t\u008a\b\t\u000b\t\f\t\u008b\u0001\t\u0001\t"+
		"\u0003\t\u0090\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0099\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00a4\b\f\u000b"+
		"\f\f\f\u00a5\u0001\f\u0001\f\u0003\f\u00aa\b\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00b4\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00bf\b\u000f"+
		"\u000b\u000f\f\u000f\u00c0\u0001\u000f\u0001\u000f\u0003\u000f\u00c5\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00d1"+
		"\b\u0011\n\u0011\f\u0011\u00d4\t\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00d8\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00dd\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e1\b\u0012\u0003\u0012\u00e3"+
		"\b\u0012\u0001\u0012\u0003\u0012\u00e6\b\u0012\u0001\u0012\u0003\u0012"+
		"\u00e9\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0003\u0015\u00f2\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u00fb\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u00ff\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0004\u0017\u0103\b\u0017\u000b\u0017\f\u0017\u0104"+
		"\u0003\u0017\u0107\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u010b\b"+
		"\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u010f\b\u0017\u000b\u0017\f"+
		"\u0017\u0110\u0003\u0017\u0113\b\u0017\u0005\u0017\u0115\b\u0017\n\u0017"+
		"\f\u0017\u0118\t\u0017\u0001\u0018\u0004\u0018\u011b\b\u0018\u000b\u0018"+
		"\f\u0018\u011c\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0122\b"+
		"\u0019\n\u0019\f\u0019\u0125\t\u0019\u0001\u0019\u0003\u0019\u0128\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u012f\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0004\u001d\u0138\b\u001d\u000b\u001d\f\u001d"+
		"\u0139\u0003\u001d\u013c\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0144\b\u001f\n\u001f\f\u001f"+
		"\u0147\t\u001f\u0001 \u0001 \u0001 \u0001 \u0004 \u014d\b \u000b \f \u014e"+
		"\u0001 \u0003 \u0152\b \u0003 \u0154\b \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u015b\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u0164\b!\n!\f!\u0167\t!\u0001!\u0004!\u016a\b!\u000b!\f!\u016b\u0003"+
		"!\u016e\b!\u0001\"\u0001\"\u0001\"\u0004\"\u0173\b\"\u000b\"\f\"\u0174"+
		"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u017e\b$\u0001"+
		"%\u0004%\u0181\b%\u000b%\f%\u0182\u0001&\u0001&\u0001&\u0001&\u0001&\u0004"+
		"&\u018a\b&\u000b&\f&\u018b\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u0194\b&\u0001&\u0000\u0000\'\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJL\u0000"+
		"\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u001f \u01b8\u0000Q\u0001\u0000"+
		"\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004^\u0001\u0000\u0000\u0000"+
		"\u0006f\u0001\u0000\u0000\u0000\bi\u0001\u0000\u0000\u0000\nm\u0001\u0000"+
		"\u0000\u0000\ft\u0001\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000"+
		"\u0010~\u0001\u0000\u0000\u0000\u0012\u008f\u0001\u0000\u0000\u0000\u0014"+
		"\u0091\u0001\u0000\u0000\u0000\u0016\u0098\u0001\u0000\u0000\u0000\u0018"+
		"\u00a9\u0001\u0000\u0000\u0000\u001a\u00ab\u0001\u0000\u0000\u0000\u001c"+
		"\u00b3\u0001\u0000\u0000\u0000\u001e\u00c4\u0001\u0000\u0000\u0000 \u00c6"+
		"\u0001\u0000\u0000\u0000\"\u00cd\u0001\u0000\u0000\u0000$\u00d5\u0001"+
		"\u0000\u0000\u0000&\u00ea\u0001\u0000\u0000\u0000(\u00ee\u0001\u0000\u0000"+
		"\u0000*\u00f1\u0001\u0000\u0000\u0000,\u00fa\u0001\u0000\u0000\u0000."+
		"\u00fe\u0001\u0000\u0000\u00000\u011a\u0001\u0000\u0000\u00002\u011e\u0001"+
		"\u0000\u0000\u00004\u0129\u0001\u0000\u0000\u00006\u012b\u0001\u0000\u0000"+
		"\u00008\u0132\u0001\u0000\u0000\u0000:\u0134\u0001\u0000\u0000\u0000<"+
		"\u013d\u0001\u0000\u0000\u0000>\u0140\u0001\u0000\u0000\u0000@\u0148\u0001"+
		"\u0000\u0000\u0000B\u016d\u0001\u0000\u0000\u0000D\u0172\u0001\u0000\u0000"+
		"\u0000F\u0176\u0001\u0000\u0000\u0000H\u017d\u0001\u0000\u0000\u0000J"+
		"\u0180\u0001\u0000\u0000\u0000L\u0193\u0001\u0000\u0000\u0000NP\u0003"+
		"\u0002\u0001\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000TU\u0005\u0000\u0000\u0001U\u0001\u0001"+
		"\u0000\u0000\u0000VY\u0003\u0004\u0002\u0000WY\u0003F#\u0000XV\u0001\u0000"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u0003\u0001\u0000\u0000\u0000"+
		"Z_\u0003\b\u0004\u0000[_\u0003\n\u0005\u0000\\_\u0003\f\u0006\u0000]_"+
		"\u0003 \u0010\u0000^Z\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\u0005\u0001\u0000"+
		"\u0000\u0000`b\u0005\u0003\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"dg\u0001\u0000\u0000\u0000eg\u0005\u0004\u0000\u0000fa\u0001\u0000\u0000"+
		"\u0000fe\u0001\u0000\u0000\u0000g\u0007\u0001\u0000\u0000\u0000hj\u0007"+
		"\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\t\u0001\u0000\u0000"+
		"\u0000mn\u0005\u0018\u0000\u0000no\u0005\u001a\u0000\u0000op\u0005\u001b"+
		"\u0000\u0000p\u000b\u0001\u0000\u0000\u0000qu\u0003\u0012\t\u0000ru\u0003"+
		"\u0018\f\u0000su\u0003\u001e\u000f\u0000tq\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000u\r\u0001\u0000\u0000\u0000"+
		"vw\u0005\u0006\u0000\u0000wx\u0005\u0006\u0000\u0000x\u000f\u0001\u0000"+
		"\u0000\u0000y\u007f\u0003\b\u0004\u0000z\u007f\u0003\n\u0005\u0000{\u007f"+
		"\u0003\u001e\u000f\u0000|\u007f\u0003\u0018\f\u0000}\u007f\u0003 \u0010"+
		"\u0000~y\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000~{\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f"+
		"\u0011\u0001\u0000\u0000\u0000\u0080\u0081\u0003\u000e\u0007\u0000\u0081"+
		"\u0082\u0003\u0010\b\u0000\u0082\u0083\u0003\u000e\u0007\u0000\u0083\u0090"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0003\u000e\u0007\u0000\u0085\u0089"+
		"\u0003\u0010\b\u0000\u0086\u0087\u0003\u0006\u0003\u0000\u0087\u0088\u0003"+
		"\u0010\b\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0086\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0003\u000e\u0007\u0000\u008e\u0090\u0001\u0000"+
		"\u0000\u0000\u008f\u0080\u0001\u0000\u0000\u0000\u008f\u0084\u0001\u0000"+
		"\u0000\u0000\u0090\u0013\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0006"+
		"\u0000\u0000\u0092\u0015\u0001\u0000\u0000\u0000\u0093\u0099\u0003\u0012"+
		"\t\u0000\u0094\u0099\u0003\n\u0005\u0000\u0095\u0099\u0003\u001e\u000f"+
		"\u0000\u0096\u0099\u0003\b\u0004\u0000\u0097\u0099\u0003 \u0010\u0000"+
		"\u0098\u0093\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000\u0000\u0000"+
		"\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u0017\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0003\u0014\n\u0000\u009b\u009c\u0003\u0016\u000b\u0000\u009c"+
		"\u009d\u0003\u0014\n\u0000\u009d\u00aa\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0003\u0014\n\u0000\u009f\u00a3\u0003\u0016\u000b\u0000\u00a0\u00a1\u0003"+
		"\u0006\u0003\u0000\u00a1\u00a2\u0003\u0016\u000b\u0000\u00a2\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003"+
		"\u0014\n\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u009a\u0001\u0000"+
		"\u0000\u0000\u00a9\u009e\u0001\u0000\u0000\u0000\u00aa\u0019\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005\u0007\u0000\u0000\u00ac\u00ad\u0005\u0007"+
		"\u0000\u0000\u00ad\u001b\u0001\u0000\u0000\u0000\u00ae\u00b4\u0003\u0018"+
		"\f\u0000\u00af\u00b4\u0003\u0012\t\u0000\u00b0\u00b4\u0003\n\u0005\u0000"+
		"\u00b1\u00b4\u0003\b\u0004\u0000\u00b2\u00b4\u0003 \u0010\u0000\u00b3"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b3\u00af\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u001d\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0003\u001a\r\u0000\u00b6\u00b7\u0003\u001c\u000e\u0000\u00b7\u00b8"+
		"\u0003\u001a\r\u0000\u00b8\u00c5\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003"+
		"\u001a\r\u0000\u00ba\u00be\u0003\u001c\u000e\u0000\u00bb\u00bc\u0003\u0006"+
		"\u0003\u0000\u00bc\u00bd\u0003\u001c\u000e\u0000\u00bd\u00bf\u0001\u0000"+
		"\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003\u001a"+
		"\r\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00c4\u00b9\u0001\u0000\u0000\u0000\u00c5\u001f\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0005\u000b\u0000\u0000\u00c7\u00c8\u0003\"\u0011\u0000"+
		"\u00c8\u00c9\u0005\f\u0000\u0000\u00c9\u00ca\u0005\r\u0000\u0000\u00ca"+
		"\u00cb\u0003$\u0012\u0000\u00cb\u00cc\u0005\u000e\u0000\u0000\u00cc!\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d2\u0003\b\u0004\u0000\u00ce\u00cf\u0005\u0003"+
		"\u0000\u0000\u00cf\u00d1\u0003\b\u0004\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3#\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d7\u0003(\u0014\u0000\u00d6"+
		"\u00d8\u0003&\u0013\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00dc"+
		"\u0003*\u0015\u0000\u00da\u00db\u0005\t\u0000\u0000\u00db\u00dd\u0003"+
		"0\u0018\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e2\u0001\u0000\u0000\u0000\u00de\u00e0\u0005\n\u0000"+
		"\u0000\u00df\u00e1\u00032\u0019\u0000\u00e0\u00df\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e2\u00de\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e6\u0003<\u001e\u0000\u00e5"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e9\u0003:\u001d\u0000\u00e8\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9%\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0005\t\u0000\u0000\u00eb\u00ec\u0005\n"+
		"\u0000\u0000\u00ec\u00ed\u0005\n\u0000\u0000\u00ed\'\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0003B!\u0000\u00ef)\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f2\u0005\n\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0003,\u0016\u0000\u00f4+\u0001\u0000\u0000\u0000\u00f5\u00fb\u0003B"+
		"!\u0000\u00f6\u00f7\u0005\u000b\u0000\u0000\u00f7\u00f8\u0003.\u0017\u0000"+
		"\u00f8\u00f9\u0005\f\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f5\u0001\u0000\u0000\u0000\u00fa\u00f6\u0001\u0000\u0000\u0000\u00fb"+
		"-\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\t\u0000\u0000\u00fd\u00ff"+
		"\u0005\t\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0106\u0001\u0000\u0000\u0000\u0100\u0107\u0003"+
		"B!\u0000\u0101\u0103\u0005\u0002\u0000\u0000\u0102\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000"+
		"\u0000\u0106\u0100\u0001\u0000\u0000\u0000\u0106\u0102\u0001\u0000\u0000"+
		"\u0000\u0107\u0116\u0001\u0000\u0000\u0000\u0108\u010a\u0005\t\u0000\u0000"+
		"\u0109\u010b\u0005\t\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0001\u0000\u0000\u0000\u010b\u0112\u0001\u0000\u0000\u0000\u010c"+
		"\u0113\u0003B!\u0000\u010d\u010f\u0005\u0002\u0000\u0000\u010e\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113\u0001"+
		"\u0000\u0000\u0000\u0112\u010c\u0001\u0000\u0000\u0000\u0112\u010e\u0001"+
		"\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0108\u0001"+
		"\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117/\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011b\u0005\u0002"+
		"\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000"+
		"\u0000\u0000\u011d1\u0001\u0000\u0000\u0000\u011e\u0123\u0003B!\u0000"+
		"\u011f\u0120\u0005\n\u0000\u0000\u0120\u0122\u0003B!\u0000\u0121\u011f"+
		"\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0127"+
		"\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0128"+
		"\u0005\n\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u01283\u0001\u0000\u0000\u0000\u0129\u012a\u0003B!"+
		"\u0000\u012a5\u0001\u0000\u0000\u0000\u012b\u012e\u00034\u001a\u0000\u012c"+
		"\u012d\u0005\n\u0000\u0000\u012d\u012f\u00038\u001c\u0000\u012e\u012c"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u000f\u0000\u0000\u01317\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0003B!\u0000\u01339\u0001\u0000\u0000"+
		"\u0000\u0134\u013b\u0005\u0012\u0000\u0000\u0135\u013c\u0003B!\u0000\u0136"+
		"\u0138\u0005\u0002\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b"+
		"\u0135\u0001\u0000\u0000\u0000\u013b\u0137\u0001\u0000\u0000\u0000\u013c"+
		";\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0010\u0000\u0000\u013e\u013f"+
		"\u0003>\u001f\u0000\u013f=\u0001\u0000\u0000\u0000\u0140\u0145\u0003@"+
		" \u0000\u0141\u0142\u0005\u0011\u0000\u0000\u0142\u0144\u0003@ \u0000"+
		"\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000"+
		"\u0146?\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148"+
		"\u0153\u0003B!\u0000\u0149\u0151\u0005\u0013\u0000\u0000\u014a\u0152\u0003"+
		"B!\u0000\u014b\u014d\u0005\u0002\u0000\u0000\u014c\u014b\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000"+
		"\u0000\u0150\u0152\u0003D\"\u0000\u0151\u014a\u0001\u0000\u0000\u0000"+
		"\u0151\u014c\u0001\u0000\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000"+
		"\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0149\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0001\u0000\u0000\u0000\u0154A\u0001\u0000\u0000\u0000\u0155"+
		"\u015b\u0005\u0001\u0000\u0000\u0156\u015b\u0005\u0007\u0000\u0000\u0157"+
		"\u015b\u0005\u0002\u0000\u0000\u0158\u015b\u0003D\"\u0000\u0159\u015b"+
		"\u0005\b\u0000\u0000\u015a\u0155\u0001\u0000\u0000\u0000\u015a\u0156\u0001"+
		"\u0000\u0000\u0000\u015a\u0157\u0001\u0000\u0000\u0000\u015a\u0158\u0001"+
		"\u0000\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b\u0165\u0001"+
		"\u0000\u0000\u0000\u015c\u0164\u0005\u0001\u0000\u0000\u015d\u0164\u0005"+
		"\u0002\u0000\u0000\u015e\u0164\u0005\u0014\u0000\u0000\u015f\u0164\u0005"+
		"\u0015\u0000\u0000\u0160\u0164\u0005\u0016\u0000\u0000\u0161\u0164\u0003"+
		"D\"\u0000\u0162\u0164\u0005\b\u0000\u0000\u0163\u015c\u0001\u0000\u0000"+
		"\u0000\u0163\u015d\u0001\u0000\u0000\u0000\u0163\u015e\u0001\u0000\u0000"+
		"\u0000\u0163\u015f\u0001\u0000\u0000\u0000\u0163\u0160\u0001\u0000\u0000"+
		"\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0162\u0001\u0000\u0000"+
		"\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u016e\u0001\u0000\u0000"+
		"\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u016a\u0005\u0002\u0000"+
		"\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000"+
		"\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000"+
		"\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u015a\u0001\u0000\u0000"+
		"\u0000\u016d\u0169\u0001\u0000\u0000\u0000\u016eC\u0001\u0000\u0000\u0000"+
		"\u016f\u0170\u0005\u0017\u0000\u0000\u0170\u0171\u0007\u0000\u0000\u0000"+
		"\u0171\u0173\u0007\u0000\u0000\u0000\u0172\u016f\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0001\u0000\u0000\u0000\u0175E\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0003L&\u0000\u0177G\u0001\u0000\u0000\u0000\u0178\u0179\u0005"+
		"\u0019\u0000\u0000\u0179\u017a\u0005\u001c\u0000\u0000\u017a\u017e\u0005"+
		"\u001e\u0000\u0000\u017b\u017c\u0005\u0019\u0000\u0000\u017c\u017e\u0005"+
		"\u001d\u0000\u0000\u017d\u0178\u0001\u0000\u0000\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017eI\u0001\u0000\u0000\u0000\u017f\u0181\u0007\u0001"+
		"\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000"+
		"\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000"+
		"\u0000\u0000\u0183K\u0001\u0000\u0000\u0000\u0184\u0185\u0003H$\u0000"+
		"\u0185\u0186\u0005!\u0000\u0000\u0186\u0194\u0001\u0000\u0000\u0000\u0187"+
		"\u0189\u0003H$\u0000\u0188\u018a\u0005\u001f\u0000\u0000\u0189\u0188\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u0189\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0005!\u0000\u0000\u018e\u0194\u0001\u0000"+
		"\u0000\u0000\u018f\u0190\u0003H$\u0000\u0190\u0191\u0003J%\u0000\u0191"+
		"\u0192\u0005!\u0000\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193\u0184"+
		"\u0001\u0000\u0000\u0000\u0193\u0187\u0001\u0000\u0000\u0000\u0193\u018f"+
		"\u0001\u0000\u0000\u0000\u0194M\u0001\u0000\u0000\u00004QX^cfkt~\u008b"+
		"\u008f\u0098\u00a5\u00a9\u00b3\u00c0\u00c4\u00d2\u00d7\u00dc\u00e0\u00e2"+
		"\u00e5\u00e8\u00f1\u00fa\u00fe\u0104\u0106\u010a\u0110\u0112\u0116\u011c"+
		"\u0123\u0127\u012e\u0139\u013b\u0145\u014e\u0151\u0153\u015a\u0163\u0165"+
		"\u016b\u016d\u0174\u017d\u0182\u018b\u0193";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}