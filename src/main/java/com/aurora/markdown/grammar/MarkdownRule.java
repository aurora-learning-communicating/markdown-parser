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
		Equal=19, Dot=20, Plus=21, Minus=22, Percent=23, Backtick=24;
	public static final int
		RULE_start = 0, RULE_inline = 1, RULE_indent = 2, RULE_plainText = 3, 
		RULE_inlineCode = 4, RULE_emphasis = 5, RULE_boldTag = 6, RULE_boldElement = 7, 
		RULE_bold = 8, RULE_italicTag = 9, RULE_italicElement = 10, RULE_italic = 11, 
		RULE_strikeThroughTag = 12, RULE_strikeThroughElement = 13, RULE_strikeThrough = 14, 
		RULE_urlLink = 15, RULE_altText = 16, RULE_url = 17, RULE_colonSlashSlash = 18, 
		RULE_scheme = 19, RULE_host = 20, RULE_hostname = 21, RULE_v6host = 22, 
		RULE_port = 23, RULE_path = 24, RULE_user = 25, RULE_login = 26, RULE_password = 27, 
		RULE_frag = 28, RULE_query = 29, RULE_search = 30, RULE_searchparameter = 31, 
		RULE_string = 32, RULE_hex = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "inline", "indent", "plainText", "inlineCode", "emphasis", "boldTag", 
			"boldElement", "bold", "italicTag", "italicElement", "italic", "strikeThroughTag", 
			"strikeThroughElement", "strikeThrough", "urlLink", "altText", "url", 
			"colonSlashSlash", "scheme", "host", "hostname", "v6host", "port", "path", 
			"user", "login", "password", "frag", "query", "search", "searchparameter", 
			"string", "hex"
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
		public InlineContext inline() {
			return getRuleContext(InlineContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MarkdownRule.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			inline();
			setState(69);
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
		enterRule(_localctx, 2, RULE_inline);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				plainText();
				}
				break;
			case Backtick:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				inlineCode();
				}
				break;
			case Star:
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				emphasis();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
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
		enterRule(_localctx, 4, RULE_indent);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Space:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77);
					match(Space);
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space );
				}
				break;
			case Tab:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
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
		enterRule(_localctx, 6, RULE_plainText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
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
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Letter || _la==Digit );
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
		public List<TerminalNode> Backtick() { return getTokens(MarkdownRule.Backtick); }
		public TerminalNode Backtick(int i) {
			return getToken(MarkdownRule.Backtick, i);
		}
		public PlainTextContext plainText() {
			return getRuleContext(PlainTextContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_inlineCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(Backtick);
			setState(91);
			plainText();
			setState(92);
			match(Backtick);
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
		enterRule(_localctx, 10, RULE_emphasis);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				bold();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				italic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
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
		enterRule(_localctx, 12, RULE_boldTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(Star);
			setState(100);
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
		enterRule(_localctx, 14, RULE_boldElement);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				plainText();
				}
				break;
			case Backtick:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				inlineCode();
				}
				break;
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				strikeThrough();
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				italic();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
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

	public final BoldContext bold() throws RecognitionException {
		BoldContext _localctx = new BoldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bold);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BoldSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				boldTag();
				setState(110);
				boldElement();
				setState(111);
				boldTag();
				}
				break;
			case 2:
				_localctx = new BoldMultiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				boldTag();
				setState(114);
				boldElement();
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					indent();
					setState(116);
					boldElement();
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space || _la==Tab );
				setState(122);
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
		enterRule(_localctx, 18, RULE_italicTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
		enterRule(_localctx, 20, RULE_italicElement);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				bold();
				}
				break;
			case Backtick:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				inlineCode();
				}
				break;
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				strikeThrough();
				}
				break;
			case Letter:
			case Digit:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				plainText();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
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

	public final ItalicContext italic() throws RecognitionException {
		ItalicContext _localctx = new ItalicContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_italic);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ItalicSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				italicTag();
				setState(136);
				italicElement();
				setState(137);
				italicTag();
				}
				break;
			case 2:
				_localctx = new ItalicMutliContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				italicTag();
				setState(140);
				italicElement();
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					indent();
					setState(142);
					italicElement();
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space || _la==Tab );
				setState(148);
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
		enterRule(_localctx, 24, RULE_strikeThroughTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Tilde);
			setState(153);
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
		enterRule(_localctx, 26, RULE_strikeThroughElement);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				italic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				bold();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				inlineCode();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				plainText();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
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
		enterRule(_localctx, 28, RULE_strikeThrough);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new StrikeThroughSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				strikeThroughTag();
				setState(163);
				strikeThroughElement();
				setState(164);
				strikeThroughTag();
				}
				break;
			case 2:
				_localctx = new StrikeThroughMultiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				strikeThroughTag();
				setState(167);
				strikeThroughElement();
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(168);
					indent();
					setState(169);
					strikeThroughElement();
					}
					}
					setState(173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space || _la==Tab );
				setState(175);
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
		enterRule(_localctx, 30, RULE_urlLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LeftBracket);
			setState(180);
			altText();
			setState(181);
			match(RightBracket);
			setState(182);
			match(LeftParenthesis);
			setState(183);
			url();
			setState(184);
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
		enterRule(_localctx, 32, RULE_altText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			plainText();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(187);
				match(Space);
				setState(188);
				plainText();
				}
				}
				setState(193);
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
		enterRule(_localctx, 34, RULE_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			scheme();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(195);
				colonSlashSlash();
				}
			}

			setState(198);
			host();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(199);
				match(Colon);
				setState(200);
				port();
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(203);
				match(Slash);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388998L) != 0)) {
					{
					setState(204);
					path();
					}
				}

				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(209);
				query();
				}
			}

			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Hash) {
				{
				setState(212);
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
		enterRule(_localctx, 36, RULE_colonSlashSlash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(Colon);
			setState(216);
			match(Slash);
			setState(217);
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
		enterRule(_localctx, 38, RULE_scheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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
		enterRule(_localctx, 40, RULE_host);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(221);
				match(Slash);
				}
			}

			setState(224);
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
		enterRule(_localctx, 42, RULE_hostname);
		try {
			setState(231);
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
				setState(226);
				string();
				}
				break;
			case LeftBracket:
				_localctx = new IPv6HostContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(LeftBracket);
				setState(228);
				v6host();
				setState(229);
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
		enterRule(_localctx, 44, RULE_v6host);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(233);
				match(Colon);
				setState(234);
				match(Colon);
				}
			}

			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(237);
				string();
				}
				break;
			case 2:
				{
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(238);
					match(Digit);
					}
					}
					setState(241); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Digit );
				}
				break;
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(245);
				match(Colon);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(246);
					match(Colon);
					}
				}

				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(249);
					string();
					}
					break;
				case 2:
					{
					setState(251); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(250);
						match(Digit);
						}
						}
						setState(253); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Digit );
					}
					break;
				}
				}
				}
				setState(261);
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
		enterRule(_localctx, 46, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(262);
				match(Digit);
				}
				}
				setState(265); 
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
		enterRule(_localctx, 48, RULE_path);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			string();
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(268);
					match(Slash);
					setState(269);
					string();
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(275);
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
		enterRule(_localctx, 50, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		enterRule(_localctx, 52, RULE_login);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			user();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(281);
				match(Slash);
				setState(282);
				password();
				}
			}

			setState(285);
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
		enterRule(_localctx, 54, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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
		enterRule(_localctx, 56, RULE_frag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(Hash);
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(290);
				string();
				}
				break;
			case 2:
				{
				setState(292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(291);
					match(Digit);
					}
					}
					setState(294); 
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
		enterRule(_localctx, 58, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(QuestionMark);
			setState(299);
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
		enterRule(_localctx, 60, RULE_search);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			searchparameter();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Ampersand) {
				{
				{
				setState(302);
				match(Ampersand);
				setState(303);
				searchparameter();
				}
				}
				setState(308);
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
		enterRule(_localctx, 62, RULE_searchparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			string();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(310);
				match(Equal);
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(311);
					string();
					}
					break;
				case 2:
					{
					setState(313); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(312);
						match(Digit);
						}
						}
						setState(315); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Digit );
					}
					break;
				case 3:
					{
					setState(317);
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
		enterRule(_localctx, 64, RULE_string);
		try {
			int _alt;
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Letter:
					{
					setState(322);
					match(Letter);
					}
					break;
				case Tilde:
					{
					setState(323);
					match(Tilde);
					}
					break;
				case Digit:
					{
					setState(324);
					match(Digit);
					}
					break;
				case Percent:
					{
					setState(325);
					hex();
					}
					break;
				case Underscore:
					{
					setState(326);
					match(Underscore);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(336);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Letter:
							{
							setState(329);
							match(Letter);
							}
							break;
						case Digit:
							{
							setState(330);
							match(Digit);
							}
							break;
						case Dot:
							{
							setState(331);
							match(Dot);
							}
							break;
						case Plus:
							{
							setState(332);
							match(Plus);
							}
							break;
						case Minus:
							{
							setState(333);
							match(Minus);
							}
							break;
						case Percent:
							{
							setState(334);
							hex();
							}
							break;
						case Underscore:
							{
							setState(335);
							match(Underscore);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(341);
						match(Digit);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(344); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		enterRule(_localctx, 66, RULE_hex);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(348);
					match(Percent);
					setState(349);
					_la = _input.LA(1);
					if ( !(_la==Letter || _la==Digit) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(350);
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
				setState(353); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u0164\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001L\b\u0001\u0001\u0002\u0004\u0002O\b\u0002\u000b\u0002\f\u0002"+
		"P\u0001\u0002\u0003\u0002T\b\u0002\u0001\u0003\u0004\u0003W\b\u0003\u000b"+
		"\u0003\f\u0003X\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007l\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0004\bw\b\b\u000b\b\f\bx\u0001\b\u0001\b\u0003"+
		"\b}\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0086\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0091\b\u000b"+
		"\u000b\u000b\f\u000b\u0092\u0001\u000b\u0001\u000b\u0003\u000b\u0097\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00a1\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00ac"+
		"\b\u000e\u000b\u000e\f\u000e\u00ad\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00b2\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00be\b\u0010\n\u0010\f\u0010\u00c1\t\u0010\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00c5\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ca"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ce\b\u0011\u0003\u0011"+
		"\u00d0\b\u0011\u0001\u0011\u0003\u0011\u00d3\b\u0011\u0001\u0011\u0003"+
		"\u0011\u00d6\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0003\u0014\u00df\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00e8\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00ec\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0004\u0016\u00f0\b\u0016\u000b\u0016\f\u0016"+
		"\u00f1\u0003\u0016\u00f4\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00f8"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u00fc\b\u0016\u000b\u0016"+
		"\f\u0016\u00fd\u0003\u0016\u0100\b\u0016\u0005\u0016\u0102\b\u0016\n\u0016"+
		"\f\u0016\u0105\t\u0016\u0001\u0017\u0004\u0017\u0108\b\u0017\u000b\u0017"+
		"\f\u0017\u0109\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u010f\b"+
		"\u0018\n\u0018\f\u0018\u0112\t\u0018\u0001\u0018\u0003\u0018\u0115\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u011c\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0004\u001c\u0125\b\u001c\u000b\u001c\f\u001c"+
		"\u0126\u0003\u001c\u0129\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0131\b\u001e\n\u001e\f\u001e"+
		"\u0134\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f"+
		"\u013a\b\u001f\u000b\u001f\f\u001f\u013b\u0001\u001f\u0003\u001f\u013f"+
		"\b\u001f\u0003\u001f\u0141\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0003 \u0148\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u0151\b \n \f \u0154\t \u0001 \u0004 \u0157\b \u000b \f \u0158\u0003"+
		" \u015b\b \u0001!\u0001!\u0001!\u0004!\u0160\b!\u000b!\f!\u0161\u0001"+
		"!\u0000\u0000\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0001\u0001\u0000"+
		"\u0001\u0002\u0184\u0000D\u0001\u0000\u0000\u0000\u0002K\u0001\u0000\u0000"+
		"\u0000\u0004S\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\b"+
		"Z\u0001\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000\fc\u0001\u0000\u0000"+
		"\u0000\u000ek\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000\u0012"+
		"~\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u0096"+
		"\u0001\u0000\u0000\u0000\u0018\u0098\u0001\u0000\u0000\u0000\u001a\u00a0"+
		"\u0001\u0000\u0000\u0000\u001c\u00b1\u0001\u0000\u0000\u0000\u001e\u00b3"+
		"\u0001\u0000\u0000\u0000 \u00ba\u0001\u0000\u0000\u0000\"\u00c2\u0001"+
		"\u0000\u0000\u0000$\u00d7\u0001\u0000\u0000\u0000&\u00db\u0001\u0000\u0000"+
		"\u0000(\u00de\u0001\u0000\u0000\u0000*\u00e7\u0001\u0000\u0000\u0000,"+
		"\u00eb\u0001\u0000\u0000\u0000.\u0107\u0001\u0000\u0000\u00000\u010b\u0001"+
		"\u0000\u0000\u00002\u0116\u0001\u0000\u0000\u00004\u0118\u0001\u0000\u0000"+
		"\u00006\u011f\u0001\u0000\u0000\u00008\u0121\u0001\u0000\u0000\u0000:"+
		"\u012a\u0001\u0000\u0000\u0000<\u012d\u0001\u0000\u0000\u0000>\u0135\u0001"+
		"\u0000\u0000\u0000@\u015a\u0001\u0000\u0000\u0000B\u015f\u0001\u0000\u0000"+
		"\u0000DE\u0003\u0002\u0001\u0000EF\u0005\u0000\u0000\u0001F\u0001\u0001"+
		"\u0000\u0000\u0000GL\u0003\u0006\u0003\u0000HL\u0003\b\u0004\u0000IL\u0003"+
		"\n\u0005\u0000JL\u0003\u001e\u000f\u0000KG\u0001\u0000\u0000\u0000KH\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000"+
		"L\u0003\u0001\u0000\u0000\u0000MO\u0005\u0003\u0000\u0000NM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RT\u0005\u0004\u0000\u0000"+
		"SN\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000T\u0005\u0001\u0000"+
		"\u0000\u0000UW\u0007\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y\u0007\u0001\u0000\u0000\u0000Z[\u0005\u0018\u0000\u0000[\\\u0003\u0006"+
		"\u0003\u0000\\]\u0005\u0018\u0000\u0000]\t\u0001\u0000\u0000\u0000^b\u0003"+
		"\u0010\b\u0000_b\u0003\u0016\u000b\u0000`b\u0003\u001c\u000e\u0000a^\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"b\u000b\u0001\u0000\u0000\u0000cd\u0005\u0006\u0000\u0000de\u0005\u0006"+
		"\u0000\u0000e\r\u0001\u0000\u0000\u0000fl\u0003\u0006\u0003\u0000gl\u0003"+
		"\b\u0004\u0000hl\u0003\u001c\u000e\u0000il\u0003\u0016\u000b\u0000jl\u0003"+
		"\u001e\u000f\u0000kf\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000"+
		"kh\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000l\u000f\u0001\u0000\u0000\u0000mn\u0003\f\u0006\u0000no\u0003\u000e"+
		"\u0007\u0000op\u0003\f\u0006\u0000p}\u0001\u0000\u0000\u0000qr\u0003\f"+
		"\u0006\u0000rv\u0003\u000e\u0007\u0000st\u0003\u0004\u0002\u0000tu\u0003"+
		"\u000e\u0007\u0000uw\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z{\u0003\f\u0006\u0000{}\u0001\u0000\u0000"+
		"\u0000|m\u0001\u0000\u0000\u0000|q\u0001\u0000\u0000\u0000}\u0011\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005\u0006\u0000\u0000\u007f\u0013\u0001\u0000"+
		"\u0000\u0000\u0080\u0086\u0003\u0010\b\u0000\u0081\u0086\u0003\b\u0004"+
		"\u0000\u0082\u0086\u0003\u001c\u000e\u0000\u0083\u0086\u0003\u0006\u0003"+
		"\u0000\u0084\u0086\u0003\u001e\u000f\u0000\u0085\u0080\u0001\u0000\u0000"+
		"\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0085\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0015\u0001\u0000\u0000\u0000\u0087\u0088\u0003\u0012\t\u0000"+
		"\u0088\u0089\u0003\u0014\n\u0000\u0089\u008a\u0003\u0012\t\u0000\u008a"+
		"\u0097\u0001\u0000\u0000\u0000\u008b\u008c\u0003\u0012\t\u0000\u008c\u0090"+
		"\u0003\u0014\n\u0000\u008d\u008e\u0003\u0004\u0002\u0000\u008e\u008f\u0003"+
		"\u0014\n\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0003\u0012\t\u0000\u0095\u0097\u0001\u0000\u0000"+
		"\u0000\u0096\u0087\u0001\u0000\u0000\u0000\u0096\u008b\u0001\u0000\u0000"+
		"\u0000\u0097\u0017\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0007\u0000"+
		"\u0000\u0099\u009a\u0005\u0007\u0000\u0000\u009a\u0019\u0001\u0000\u0000"+
		"\u0000\u009b\u00a1\u0003\u0016\u000b\u0000\u009c\u00a1\u0003\u0010\b\u0000"+
		"\u009d\u00a1\u0003\b\u0004\u0000\u009e\u00a1\u0003\u0006\u0003\u0000\u009f"+
		"\u00a1\u0003\u001e\u000f\u0000\u00a0\u009b\u0001\u0000\u0000\u0000\u00a0"+
		"\u009c\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u001b\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\u0018\f\u0000\u00a3\u00a4"+
		"\u0003\u001a\r\u0000\u00a4\u00a5\u0003\u0018\f\u0000\u00a5\u00b2\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0003\u0018\f\u0000\u00a7\u00ab\u0003\u001a"+
		"\r\u0000\u00a8\u00a9\u0003\u0004\u0002\u0000\u00a9\u00aa\u0003\u001a\r"+
		"\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0003\u0018\f\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b1\u00a2\u0001\u0000\u0000\u0000\u00b1\u00a6\u0001\u0000\u0000\u0000"+
		"\u00b2\u001d\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u000b\u0000\u0000"+
		"\u00b4\u00b5\u0003 \u0010\u0000\u00b5\u00b6\u0005\f\u0000\u0000\u00b6"+
		"\u00b7\u0005\r\u0000\u0000\u00b7\u00b8\u0003\"\u0011\u0000\u00b8\u00b9"+
		"\u0005\u000e\u0000\u0000\u00b9\u001f\u0001\u0000\u0000\u0000\u00ba\u00bf"+
		"\u0003\u0006\u0003\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000\u00bc\u00be"+
		"\u0003\u0006\u0003\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c1"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0!\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c4\u0003&\u0013\u0000\u00c3\u00c5\u0003$\u0012"+
		"\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c9\u0003(\u0014\u0000"+
		"\u00c7\u00c8\u0005\t\u0000\u0000\u00c8\u00ca\u0003.\u0017\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005\n\u0000\u0000\u00cc\u00ce"+
		"\u00030\u0018\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d3\u0003:\u001d\u0000\u00d2\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d6\u00038\u001c\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6#\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0005\t\u0000\u0000\u00d8\u00d9\u0005\n\u0000\u0000\u00d9"+
		"\u00da\u0005\n\u0000\u0000\u00da%\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0003@ \u0000\u00dc\'\u0001\u0000\u0000\u0000\u00dd\u00df\u0005\n\u0000"+
		"\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003*\u0015\u0000"+
		"\u00e1)\u0001\u0000\u0000\u0000\u00e2\u00e8\u0003@ \u0000\u00e3\u00e4"+
		"\u0005\u000b\u0000\u0000\u00e4\u00e5\u0003,\u0016\u0000\u00e5\u00e6\u0005"+
		"\f\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e3\u0001\u0000\u0000\u0000\u00e8+\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\t\u0000\u0000\u00ea\u00ec\u0005\t\u0000\u0000"+
		"\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00f3\u0001\u0000\u0000\u0000\u00ed\u00f4\u0003@ \u0000\u00ee\u00f0"+
		"\u0005\u0002\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f4\u0103"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f7\u0005\t\u0000\u0000\u00f6\u00f8\u0005"+
		"\t\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u00ff\u0001\u0000\u0000\u0000\u00f9\u0100\u0003@ \u0000"+
		"\u00fa\u00fc\u0005\u0002\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000"+
		"\u00ff\u00f9\u0001\u0000\u0000\u0000\u00ff\u00fb\u0001\u0000\u0000\u0000"+
		"\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00f5\u0001\u0000\u0000\u0000"+
		"\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104-\u0001\u0000\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0106\u0108\u0005\u0002\u0000\u0000\u0107"+
		"\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"/\u0001\u0000\u0000\u0000\u010b\u0110\u0003@ \u0000\u010c\u010d\u0005"+
		"\n\u0000\u0000\u010d\u010f\u0003@ \u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0115\u0005\n\u0000\u0000"+
		"\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000"+
		"\u01151\u0001\u0000\u0000\u0000\u0116\u0117\u0003@ \u0000\u01173\u0001"+
		"\u0000\u0000\u0000\u0118\u011b\u00032\u0019\u0000\u0119\u011a\u0005\n"+
		"\u0000\u0000\u011a\u011c\u00036\u001b\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0005\u000f\u0000\u0000\u011e5\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0003@ \u0000\u01207\u0001\u0000\u0000\u0000\u0121\u0128"+
		"\u0005\u0012\u0000\u0000\u0122\u0129\u0003@ \u0000\u0123\u0125\u0005\u0002"+
		"\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0122\u0001\u0000"+
		"\u0000\u0000\u0128\u0124\u0001\u0000\u0000\u0000\u01299\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005\u0010\u0000\u0000\u012b\u012c\u0003<\u001e\u0000"+
		"\u012c;\u0001\u0000\u0000\u0000\u012d\u0132\u0003>\u001f\u0000\u012e\u012f"+
		"\u0005\u0011\u0000\u0000\u012f\u0131\u0003>\u001f\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133=\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0140\u0003@ \u0000"+
		"\u0136\u013e\u0005\u0013\u0000\u0000\u0137\u013f\u0003@ \u0000\u0138\u013a"+
		"\u0005\u0002\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013f"+
		"\u0003B!\u0000\u013e\u0137\u0001\u0000\u0000\u0000\u013e\u0139\u0001\u0000"+
		"\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0141\u0001\u0000"+
		"\u0000\u0000\u0140\u0136\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000"+
		"\u0000\u0000\u0141?\u0001\u0000\u0000\u0000\u0142\u0148\u0005\u0001\u0000"+
		"\u0000\u0143\u0148\u0005\u0007\u0000\u0000\u0144\u0148\u0005\u0002\u0000"+
		"\u0000\u0145\u0148\u0003B!\u0000\u0146\u0148\u0005\b\u0000\u0000\u0147"+
		"\u0142\u0001\u0000\u0000\u0000\u0147\u0143\u0001\u0000\u0000\u0000\u0147"+
		"\u0144\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147"+
		"\u0146\u0001\u0000\u0000\u0000\u0148\u0152\u0001\u0000\u0000\u0000\u0149"+
		"\u0151\u0005\u0001\u0000\u0000\u014a\u0151\u0005\u0002\u0000\u0000\u014b"+
		"\u0151\u0005\u0014\u0000\u0000\u014c\u0151\u0005\u0015\u0000\u0000\u014d"+
		"\u0151\u0005\u0016\u0000\u0000\u014e\u0151\u0003B!\u0000\u014f\u0151\u0005"+
		"\b\u0000\u0000\u0150\u0149\u0001\u0000\u0000\u0000\u0150\u014a\u0001\u0000"+
		"\u0000\u0000\u0150\u014b\u0001\u0000\u0000\u0000\u0150\u014c\u0001\u0000"+
		"\u0000\u0000\u0150\u014d\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000"+
		"\u0000\u0000\u0153\u015b\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000"+
		"\u0000\u0000\u0155\u0157\u0005\u0002\u0000\u0000\u0156\u0155\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015b\u0001\u0000"+
		"\u0000\u0000\u015a\u0147\u0001\u0000\u0000\u0000\u015a\u0156\u0001\u0000"+
		"\u0000\u0000\u015bA\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u0017\u0000"+
		"\u0000\u015d\u015e\u0007\u0000\u0000\u0000\u015e\u0160\u0007\u0000\u0000"+
		"\u0000\u015f\u015c\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000"+
		"\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162C\u0001\u0000\u0000\u0000.KPSXakx|\u0085\u0092\u0096\u00a0"+
		"\u00ad\u00b1\u00bf\u00c4\u00c9\u00cd\u00cf\u00d2\u00d5\u00de\u00e7\u00eb"+
		"\u00f1\u00f3\u00f7\u00fd\u00ff\u0103\u0109\u0110\u0114\u011b\u0126\u0128"+
		"\u0132\u013b\u013e\u0140\u0147\u0150\u0152\u0158\u015a\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}