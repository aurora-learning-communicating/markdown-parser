// Generated from InlineRule.g4 by ANTLR 4.13.2
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
public class InlineRule extends Parser {
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
		RULE_inline = 0, RULE_indent = 1, RULE_plainText = 2, RULE_inlineCode = 3, 
		RULE_emphasis = 4, RULE_boldTag = 5, RULE_boldElement = 6, RULE_bold = 7, 
		RULE_italicTag = 8, RULE_italicElement = 9, RULE_italic = 10, RULE_strikeThroughTag = 11, 
		RULE_strikeThroughElement = 12, RULE_strikeThrough = 13, RULE_urlLink = 14, 
		RULE_altText = 15, RULE_url = 16, RULE_colonSlashSlash = 17, RULE_scheme = 18, 
		RULE_host = 19, RULE_hostname = 20, RULE_v6host = 21, RULE_port = 22, 
		RULE_path = 23, RULE_user = 24, RULE_login = 25, RULE_password = 26, RULE_frag = 27, 
		RULE_query = 28, RULE_search = 29, RULE_searchparameter = 30, RULE_string = 31, 
		RULE_hex = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"inline", "indent", "plainText", "inlineCode", "emphasis", "boldTag", 
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
	public String getGrammarFileName() { return "InlineRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InlineRule(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterInline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitInline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitInline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineContext inline() throws RecognitionException {
		InlineContext _localctx = new InlineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inline);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				plainText();
				}
				break;
			case Backtick:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				inlineCode();
				}
				break;
			case Star:
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				emphasis();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
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
		public List<TerminalNode> Space() { return getTokens(InlineRule.Space); }
		public TerminalNode Space(int i) {
			return getToken(InlineRule.Space, i);
		}
		public TerminalNode Tab() { return getToken(InlineRule.Tab, 0); }
		public IndentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterIndent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitIndent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitIndent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndentContext indent() throws RecognitionException {
		IndentContext _localctx = new IndentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_indent);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Space:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(72);
					match(Space);
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space );
				}
				break;
			case Tab:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
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
		public List<TerminalNode> Letter() { return getTokens(InlineRule.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(InlineRule.Letter, i);
		}
		public List<TerminalNode> Digit() { return getTokens(InlineRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(InlineRule.Digit, i);
		}
		public PlainTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plainText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterPlainText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitPlainText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitPlainText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlainTextContext plainText() throws RecognitionException {
		PlainTextContext _localctx = new PlainTextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_plainText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
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
				setState(83); 
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
		public List<TerminalNode> Backtick() { return getTokens(InlineRule.Backtick); }
		public TerminalNode Backtick(int i) {
			return getToken(InlineRule.Backtick, i);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterInlineCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitInlineCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitInlineCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineCodeContext inlineCode() throws RecognitionException {
		InlineCodeContext _localctx = new InlineCodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inlineCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(Backtick);
			setState(86);
			plainText();
			setState(87);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterEmphasis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitEmphasis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitEmphasis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmphasisContext emphasis() throws RecognitionException {
		EmphasisContext _localctx = new EmphasisContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_emphasis);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				bold();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				italic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
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
		public List<TerminalNode> Star() { return getTokens(InlineRule.Star); }
		public TerminalNode Star(int i) {
			return getToken(InlineRule.Star, i);
		}
		public BoldTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boldTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterBoldTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitBoldTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitBoldTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoldTagContext boldTag() throws RecognitionException {
		BoldTagContext _localctx = new BoldTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_boldTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(Star);
			setState(95);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterBoldElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitBoldElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitBoldElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoldElementContext boldElement() throws RecognitionException {
		BoldElementContext _localctx = new BoldElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_boldElement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				plainText();
				}
				break;
			case Backtick:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				inlineCode();
				}
				break;
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				strikeThrough();
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				italic();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterBoldSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitBoldSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitBoldSingle(this);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterBoldMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitBoldMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitBoldMulti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoldContext bold() throws RecognitionException {
		BoldContext _localctx = new BoldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bold);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BoldSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				boldTag();
				setState(105);
				boldElement();
				setState(106);
				boldTag();
				}
				break;
			case 2:
				_localctx = new BoldMultiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				boldTag();
				setState(109);
				boldElement();
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					indent();
					setState(111);
					boldElement();
					}
					}
					setState(115); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space || _la==Tab );
				setState(117);
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
		public TerminalNode Star() { return getToken(InlineRule.Star, 0); }
		public ItalicTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italicTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterItalicTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitItalicTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitItalicTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItalicTagContext italicTag() throws RecognitionException {
		ItalicTagContext _localctx = new ItalicTagContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_italicTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterItalicElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitItalicElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitItalicElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItalicElementContext italicElement() throws RecognitionException {
		ItalicElementContext _localctx = new ItalicElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_italicElement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				bold();
				}
				break;
			case Backtick:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				inlineCode();
				}
				break;
			case Tilde:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				strikeThrough();
				}
				break;
			case Letter:
			case Digit:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				plainText();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterItalicSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitItalicSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitItalicSingle(this);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterItalicMutli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitItalicMutli(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitItalicMutli(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItalicContext italic() throws RecognitionException {
		ItalicContext _localctx = new ItalicContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_italic);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ItalicSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				italicTag();
				setState(131);
				italicElement();
				setState(132);
				italicTag();
				}
				break;
			case 2:
				_localctx = new ItalicMutliContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				italicTag();
				setState(135);
				italicElement();
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					indent();
					setState(137);
					italicElement();
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space || _la==Tab );
				setState(143);
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
		public List<TerminalNode> Tilde() { return getTokens(InlineRule.Tilde); }
		public TerminalNode Tilde(int i) {
			return getToken(InlineRule.Tilde, i);
		}
		public StrikeThroughTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strikeThroughTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterStrikeThroughTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitStrikeThroughTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitStrikeThroughTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrikeThroughTagContext strikeThroughTag() throws RecognitionException {
		StrikeThroughTagContext _localctx = new StrikeThroughTagContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_strikeThroughTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(Tilde);
			setState(148);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterStrikeThroughElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitStrikeThroughElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitStrikeThroughElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrikeThroughElementContext strikeThroughElement() throws RecognitionException {
		StrikeThroughElementContext _localctx = new StrikeThroughElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_strikeThroughElement);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				italic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				bold();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				inlineCode();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				plainText();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterStrikeThroughMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitStrikeThroughMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitStrikeThroughMulti(this);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterStrikeThroughSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitStrikeThroughSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitStrikeThroughSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrikeThroughContext strikeThrough() throws RecognitionException {
		StrikeThroughContext _localctx = new StrikeThroughContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_strikeThrough);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new StrikeThroughSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				strikeThroughTag();
				setState(158);
				strikeThroughElement();
				setState(159);
				strikeThroughTag();
				}
				break;
			case 2:
				_localctx = new StrikeThroughMultiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				strikeThroughTag();
				setState(162);
				strikeThroughElement();
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(163);
					indent();
					setState(164);
					strikeThroughElement();
					}
					}
					setState(168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space || _la==Tab );
				setState(170);
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
		public TerminalNode LeftBracket() { return getToken(InlineRule.LeftBracket, 0); }
		public AltTextContext altText() {
			return getRuleContext(AltTextContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(InlineRule.RightBracket, 0); }
		public TerminalNode LeftParenthesis() { return getToken(InlineRule.LeftParenthesis, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(InlineRule.RightParenthesis, 0); }
		public UrlLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urlLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterUrlLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitUrlLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitUrlLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlLinkContext urlLink() throws RecognitionException {
		UrlLinkContext _localctx = new UrlLinkContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_urlLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(LeftBracket);
			setState(175);
			altText();
			setState(176);
			match(RightBracket);
			setState(177);
			match(LeftParenthesis);
			setState(178);
			url();
			setState(179);
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
		public List<TerminalNode> Space() { return getTokens(InlineRule.Space); }
		public TerminalNode Space(int i) {
			return getToken(InlineRule.Space, i);
		}
		public AltTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterAltText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitAltText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitAltText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltTextContext altText() throws RecognitionException {
		AltTextContext _localctx = new AltTextContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_altText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			plainText();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(182);
				match(Space);
				setState(183);
				plainText();
				}
				}
				setState(188);
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
		public TerminalNode Colon() { return getToken(InlineRule.Colon, 0); }
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public TerminalNode Slash() { return getToken(InlineRule.Slash, 0); }
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			scheme();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(190);
				colonSlashSlash();
				}
			}

			setState(193);
			host();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(194);
				match(Colon);
				setState(195);
				port();
				}
			}

			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(198);
				match(Slash);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388998L) != 0)) {
					{
					setState(199);
					path();
					}
				}

				}
			}

			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(204);
				query();
				}
			}

			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Hash) {
				{
				setState(207);
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
		public TerminalNode Colon() { return getToken(InlineRule.Colon, 0); }
		public List<TerminalNode> Slash() { return getTokens(InlineRule.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(InlineRule.Slash, i);
		}
		public ColonSlashSlashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonSlashSlash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterColonSlashSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitColonSlashSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitColonSlashSlash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonSlashSlashContext colonSlashSlash() throws RecognitionException {
		ColonSlashSlashContext _localctx = new ColonSlashSlashContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_colonSlashSlash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(Colon);
			setState(211);
			match(Slash);
			setState(212);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitScheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitScheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeContext scheme() throws RecognitionException {
		SchemeContext _localctx = new SchemeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_scheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		public TerminalNode Slash() { return getToken(InlineRule.Slash, 0); }
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterHost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitHost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitHost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_host);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(216);
				match(Slash);
				}
			}

			setState(219);
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
		public TerminalNode LeftBracket() { return getToken(InlineRule.LeftBracket, 0); }
		public V6hostContext v6host() {
			return getRuleContext(V6hostContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(InlineRule.RightBracket, 0); }
		public IPv6HostContext(HostnameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterIPv6Host(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitIPv6Host(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitIPv6Host(this);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterDomainNameOrIPv4Host(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitDomainNameOrIPv4Host(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitDomainNameOrIPv4Host(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnameContext hostname() throws RecognitionException {
		HostnameContext _localctx = new HostnameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_hostname);
		try {
			setState(226);
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
				setState(221);
				string();
				}
				break;
			case LeftBracket:
				_localctx = new IPv6HostContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(LeftBracket);
				setState(223);
				v6host();
				setState(224);
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
		public List<TerminalNode> Colon() { return getTokens(InlineRule.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(InlineRule.Colon, i);
		}
		public List<TerminalNode> Digit() { return getTokens(InlineRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(InlineRule.Digit, i);
		}
		public V6hostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v6host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterV6host(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitV6host(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitV6host(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V6hostContext v6host() throws RecognitionException {
		V6hostContext _localctx = new V6hostContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_v6host);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(228);
				match(Colon);
				setState(229);
				match(Colon);
				}
			}

			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(232);
				string();
				}
				break;
			case 2:
				{
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(233);
					match(Digit);
					}
					}
					setState(236); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Digit );
				}
				break;
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(240);
				match(Colon);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(241);
					match(Colon);
					}
				}

				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(244);
					string();
					}
					break;
				case 2:
					{
					setState(246); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(245);
						match(Digit);
						}
						}
						setState(248); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Digit );
					}
					break;
				}
				}
				}
				setState(256);
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
		public List<TerminalNode> Digit() { return getTokens(InlineRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(InlineRule.Digit, i);
		}
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitPort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitPort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
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
		public List<TerminalNode> Slash() { return getTokens(InlineRule.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(InlineRule.Slash, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_path);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			string();
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(263);
					match(Slash);
					setState(264);
					string();
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(270);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		public TerminalNode AtSign() { return getToken(InlineRule.AtSign, 0); }
		public TerminalNode Slash() { return getToken(InlineRule.Slash, 0); }
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public LoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_login; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterLogin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitLogin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoginContext login() throws RecognitionException {
		LoginContext _localctx = new LoginContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_login);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			user();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(276);
				match(Slash);
				setState(277);
				password();
				}
			}

			setState(280);
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
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitPassword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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
		public TerminalNode Hash() { return getToken(InlineRule.Hash, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> Digit() { return getTokens(InlineRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(InlineRule.Digit, i);
		}
		public FragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterFrag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitFrag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitFrag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragContext frag() throws RecognitionException {
		FragContext _localctx = new FragContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_frag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(Hash);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(285);
				string();
				}
				break;
			case 2:
				{
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(286);
					match(Digit);
					}
					}
					setState(289); 
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
		public TerminalNode QuestionMark() { return getToken(InlineRule.QuestionMark, 0); }
		public SearchContext search() {
			return getRuleContext(SearchContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(QuestionMark);
			setState(294);
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
		public List<TerminalNode> Ampersand() { return getTokens(InlineRule.Ampersand); }
		public TerminalNode Ampersand(int i) {
			return getToken(InlineRule.Ampersand, i);
		}
		public SearchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterSearch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitSearch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitSearch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchContext search() throws RecognitionException {
		SearchContext _localctx = new SearchContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_search);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			searchparameter();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Ampersand) {
				{
				{
				setState(297);
				match(Ampersand);
				setState(298);
				searchparameter();
				}
				}
				setState(303);
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
		public TerminalNode Equal() { return getToken(InlineRule.Equal, 0); }
		public HexContext hex() {
			return getRuleContext(HexContext.class,0);
		}
		public List<TerminalNode> Digit() { return getTokens(InlineRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(InlineRule.Digit, i);
		}
		public SearchparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterSearchparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitSearchparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitSearchparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchparameterContext searchparameter() throws RecognitionException {
		SearchparameterContext _localctx = new SearchparameterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_searchparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			string();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(305);
				match(Equal);
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(306);
					string();
					}
					break;
				case 2:
					{
					setState(308); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(307);
						match(Digit);
						}
						}
						setState(310); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Digit );
					}
					break;
				case 3:
					{
					setState(312);
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
		public List<TerminalNode> Letter() { return getTokens(InlineRule.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(InlineRule.Letter, i);
		}
		public TerminalNode Tilde() { return getToken(InlineRule.Tilde, 0); }
		public List<TerminalNode> Digit() { return getTokens(InlineRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(InlineRule.Digit, i);
		}
		public List<HexContext> hex() {
			return getRuleContexts(HexContext.class);
		}
		public HexContext hex(int i) {
			return getRuleContext(HexContext.class,i);
		}
		public List<TerminalNode> Underscore() { return getTokens(InlineRule.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(InlineRule.Underscore, i);
		}
		public List<TerminalNode> Dot() { return getTokens(InlineRule.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(InlineRule.Dot, i);
		}
		public List<TerminalNode> Plus() { return getTokens(InlineRule.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(InlineRule.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(InlineRule.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(InlineRule.Minus, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_string);
		try {
			int _alt;
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Letter:
					{
					setState(317);
					match(Letter);
					}
					break;
				case Tilde:
					{
					setState(318);
					match(Tilde);
					}
					break;
				case Digit:
					{
					setState(319);
					match(Digit);
					}
					break;
				case Percent:
					{
					setState(320);
					hex();
					}
					break;
				case Underscore:
					{
					setState(321);
					match(Underscore);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(331);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Letter:
							{
							setState(324);
							match(Letter);
							}
							break;
						case Digit:
							{
							setState(325);
							match(Digit);
							}
							break;
						case Dot:
							{
							setState(326);
							match(Dot);
							}
							break;
						case Plus:
							{
							setState(327);
							match(Plus);
							}
							break;
						case Minus:
							{
							setState(328);
							match(Minus);
							}
							break;
						case Percent:
							{
							setState(329);
							hex();
							}
							break;
						case Underscore:
							{
							setState(330);
							match(Underscore);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(335);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(336);
						match(Digit);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(339); 
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
		public List<TerminalNode> Percent() { return getTokens(InlineRule.Percent); }
		public TerminalNode Percent(int i) {
			return getToken(InlineRule.Percent, i);
		}
		public List<TerminalNode> Letter() { return getTokens(InlineRule.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(InlineRule.Letter, i);
		}
		public List<TerminalNode> Digit() { return getTokens(InlineRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(InlineRule.Digit, i);
		}
		public HexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InlineRuleListener ) ((InlineRuleListener)listener).exitHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InlineRuleVisitor ) return ((InlineRuleVisitor<? extends T>)visitor).visitHex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexContext hex() throws RecognitionException {
		HexContext _localctx = new HexContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_hex);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(343);
					match(Percent);
					setState(344);
					_la = _input.LA(1);
					if ( !(_la==Letter || _la==Digit) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(345);
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
				setState(348); 
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
		"\u0004\u0001\u0018\u015f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000G\b\u0000\u0001\u0001\u0004\u0001J\b\u0001"+
		"\u000b\u0001\f\u0001K\u0001\u0001\u0003\u0001O\b\u0001\u0001\u0002\u0004"+
		"\u0002R\b\u0002\u000b\u0002\f\u0002S\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006g\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007r\b\u0007\u000b\u0007\f\u0007s\u0001\u0007\u0001"+
		"\u0007\u0003\u0007x\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0081\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0004\n\u008c\b\n\u000b\n\f\n\u008d\u0001\n"+
		"\u0001\n\u0003\n\u0092\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009c\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00a7\b\r\u000b"+
		"\r\f\r\u00a8\u0001\r\u0001\r\u0003\r\u00ad\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00b9\b\u000f\n\u000f\f\u000f\u00bc"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00c0\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00c5\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00c9\b\u0010\u0003\u0010\u00cb\b\u0010\u0001\u0010\u0003"+
		"\u0010\u00ce\b\u0010\u0001\u0010\u0003\u0010\u00d1\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0003\u0013\u00da\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00e3\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u00e7\b\u0015\u0001\u0015\u0001\u0015\u0004\u0015"+
		"\u00eb\b\u0015\u000b\u0015\f\u0015\u00ec\u0003\u0015\u00ef\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00f3\b\u0015\u0001\u0015\u0001\u0015\u0004"+
		"\u0015\u00f7\b\u0015\u000b\u0015\f\u0015\u00f8\u0003\u0015\u00fb\b\u0015"+
		"\u0005\u0015\u00fd\b\u0015\n\u0015\f\u0015\u0100\t\u0015\u0001\u0016\u0004"+
		"\u0016\u0103\b\u0016\u000b\u0016\f\u0016\u0104\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u010a\b\u0017\n\u0017\f\u0017\u010d\t\u0017\u0001"+
		"\u0017\u0003\u0017\u0110\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0117\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u0120"+
		"\b\u001b\u000b\u001b\f\u001b\u0121\u0003\u001b\u0124\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u012c\b\u001d\n\u001d\f\u001d\u012f\t\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0004\u001e\u0135\b\u001e\u000b\u001e\f\u001e\u0136"+
		"\u0001\u001e\u0003\u001e\u013a\b\u001e\u0003\u001e\u013c\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0143"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u014c\b\u001f\n\u001f\f\u001f\u014f\t\u001f"+
		"\u0001\u001f\u0004\u001f\u0152\b\u001f\u000b\u001f\f\u001f\u0153\u0003"+
		"\u001f\u0156\b\u001f\u0001 \u0001 \u0001 \u0004 \u015b\b \u000b \f \u015c"+
		"\u0001 \u0000\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0001\u0001\u0000"+
		"\u0001\u0002\u0180\u0000F\u0001\u0000\u0000\u0000\u0002N\u0001\u0000\u0000"+
		"\u0000\u0004Q\u0001\u0000\u0000\u0000\u0006U\u0001\u0000\u0000\u0000\b"+
		"\\\u0001\u0000\u0000\u0000\n^\u0001\u0000\u0000\u0000\ff\u0001\u0000\u0000"+
		"\u0000\u000ew\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012"+
		"\u0080\u0001\u0000\u0000\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016"+
		"\u0093\u0001\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000\u0000\u001a"+
		"\u00ac\u0001\u0000\u0000\u0000\u001c\u00ae\u0001\u0000\u0000\u0000\u001e"+
		"\u00b5\u0001\u0000\u0000\u0000 \u00bd\u0001\u0000\u0000\u0000\"\u00d2"+
		"\u0001\u0000\u0000\u0000$\u00d6\u0001\u0000\u0000\u0000&\u00d9\u0001\u0000"+
		"\u0000\u0000(\u00e2\u0001\u0000\u0000\u0000*\u00e6\u0001\u0000\u0000\u0000"+
		",\u0102\u0001\u0000\u0000\u0000.\u0106\u0001\u0000\u0000\u00000\u0111"+
		"\u0001\u0000\u0000\u00002\u0113\u0001\u0000\u0000\u00004\u011a\u0001\u0000"+
		"\u0000\u00006\u011c\u0001\u0000\u0000\u00008\u0125\u0001\u0000\u0000\u0000"+
		":\u0128\u0001\u0000\u0000\u0000<\u0130\u0001\u0000\u0000\u0000>\u0155"+
		"\u0001\u0000\u0000\u0000@\u015a\u0001\u0000\u0000\u0000BG\u0003\u0004"+
		"\u0002\u0000CG\u0003\u0006\u0003\u0000DG\u0003\b\u0004\u0000EG\u0003\u001c"+
		"\u000e\u0000FB\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\u0001\u0001\u0000\u0000"+
		"\u0000HJ\u0005\u0003\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LO\u0001"+
		"\u0000\u0000\u0000MO\u0005\u0004\u0000\u0000NI\u0001\u0000\u0000\u0000"+
		"NM\u0001\u0000\u0000\u0000O\u0003\u0001\u0000\u0000\u0000PR\u0007\u0000"+
		"\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u0005\u0001\u0000\u0000"+
		"\u0000UV\u0005\u0018\u0000\u0000VW\u0003\u0004\u0002\u0000WX\u0005\u0018"+
		"\u0000\u0000X\u0007\u0001\u0000\u0000\u0000Y]\u0003\u000e\u0007\u0000"+
		"Z]\u0003\u0014\n\u0000[]\u0003\u001a\r\u0000\\Y\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\t\u0001\u0000"+
		"\u0000\u0000^_\u0005\u0006\u0000\u0000_`\u0005\u0006\u0000\u0000`\u000b"+
		"\u0001\u0000\u0000\u0000ag\u0003\u0004\u0002\u0000bg\u0003\u0006\u0003"+
		"\u0000cg\u0003\u001a\r\u0000dg\u0003\u0014\n\u0000eg\u0003\u001c\u000e"+
		"\u0000fa\u0001\u0000\u0000\u0000fb\u0001\u0000\u0000\u0000fc\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000g\r\u0001"+
		"\u0000\u0000\u0000hi\u0003\n\u0005\u0000ij\u0003\f\u0006\u0000jk\u0003"+
		"\n\u0005\u0000kx\u0001\u0000\u0000\u0000lm\u0003\n\u0005\u0000mq\u0003"+
		"\f\u0006\u0000no\u0003\u0002\u0001\u0000op\u0003\f\u0006\u0000pr\u0001"+
		"\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uv\u0003\n\u0005\u0000vx\u0001\u0000\u0000\u0000wh\u0001\u0000\u0000"+
		"\u0000wl\u0001\u0000\u0000\u0000x\u000f\u0001\u0000\u0000\u0000yz\u0005"+
		"\u0006\u0000\u0000z\u0011\u0001\u0000\u0000\u0000{\u0081\u0003\u000e\u0007"+
		"\u0000|\u0081\u0003\u0006\u0003\u0000}\u0081\u0003\u001a\r\u0000~\u0081"+
		"\u0003\u0004\u0002\u0000\u007f\u0081\u0003\u001c\u000e\u0000\u0080{\u0001"+
		"\u0000\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0013\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u0010\b\u0000\u0083"+
		"\u0084\u0003\u0012\t\u0000\u0084\u0085\u0003\u0010\b\u0000\u0085\u0092"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u0010\b\u0000\u0087\u008b\u0003"+
		"\u0012\t\u0000\u0088\u0089\u0003\u0002\u0001\u0000\u0089\u008a\u0003\u0012"+
		"\t\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0003\u0010\b\u0000\u0090\u0092\u0001\u0000\u0000\u0000"+
		"\u0091\u0082\u0001\u0000\u0000\u0000\u0091\u0086\u0001\u0000\u0000\u0000"+
		"\u0092\u0015\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0007\u0000\u0000"+
		"\u0094\u0095\u0005\u0007\u0000\u0000\u0095\u0017\u0001\u0000\u0000\u0000"+
		"\u0096\u009c\u0003\u0014\n\u0000\u0097\u009c\u0003\u000e\u0007\u0000\u0098"+
		"\u009c\u0003\u0006\u0003\u0000\u0099\u009c\u0003\u0004\u0002\u0000\u009a"+
		"\u009c\u0003\u001c\u000e\u0000\u009b\u0096\u0001\u0000\u0000\u0000\u009b"+
		"\u0097\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u0019\u0001\u0000\u0000\u0000\u009d\u009e\u0003\u0016\u000b\u0000\u009e"+
		"\u009f\u0003\u0018\f\u0000\u009f\u00a0\u0003\u0016\u000b\u0000\u00a0\u00ad"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\u0016\u000b\u0000\u00a2\u00a6"+
		"\u0003\u0018\f\u0000\u00a3\u00a4\u0003\u0002\u0001\u0000\u00a4\u00a5\u0003"+
		"\u0018\f\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0003\u0016\u000b\u0000\u00ab\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ac\u009d\u0001\u0000\u0000\u0000\u00ac\u00a1\u0001\u0000"+
		"\u0000\u0000\u00ad\u001b\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u000b"+
		"\u0000\u0000\u00af\u00b0\u0003\u001e\u000f\u0000\u00b0\u00b1\u0005\f\u0000"+
		"\u0000\u00b1\u00b2\u0005\r\u0000\u0000\u00b2\u00b3\u0003 \u0010\u0000"+
		"\u00b3\u00b4\u0005\u000e\u0000\u0000\u00b4\u001d\u0001\u0000\u0000\u0000"+
		"\u00b5\u00ba\u0003\u0004\u0002\u0000\u00b6\u00b7\u0005\u0003\u0000\u0000"+
		"\u00b7\u00b9\u0003\u0004\u0002\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u001f\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00bf\u0003$\u0012\u0000\u00be"+
		"\u00c0\u0003\"\u0011\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c4"+
		"\u0003&\u0013\u0000\u00c2\u00c3\u0005\t\u0000\u0000\u00c3\u00c5\u0003"+
		",\u0016\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00ca\u0001\u0000\u0000\u0000\u00c6\u00c8\u0005\n\u0000"+
		"\u0000\u00c7\u00c9\u0003.\u0017\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c6\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ce\u00038\u001c\u0000\u00cd"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d0\u0001\u0000\u0000\u0000\u00cf\u00d1\u00036\u001b\u0000\u00d0\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1!\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\t\u0000\u0000\u00d3\u00d4\u0005\n"+
		"\u0000\u0000\u00d4\u00d5\u0005\n\u0000\u0000\u00d5#\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0003>\u001f\u0000\u00d7%\u0001\u0000\u0000\u0000\u00d8"+
		"\u00da\u0005\n\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0003(\u0014\u0000\u00dc\'\u0001\u0000\u0000\u0000\u00dd\u00e3\u0003"+
		">\u001f\u0000\u00de\u00df\u0005\u000b\u0000\u0000\u00df\u00e0\u0003*\u0015"+
		"\u0000\u00e0\u00e1\u0005\f\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e2\u00dd\u0001\u0000\u0000\u0000\u00e2\u00de\u0001\u0000\u0000\u0000"+
		"\u00e3)\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\t\u0000\u0000\u00e5"+
		"\u00e7\u0005\t\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e7\u00ee\u0001\u0000\u0000\u0000\u00e8\u00ef"+
		"\u0003>\u001f\u0000\u00e9\u00eb\u0005\u0002\u0000\u0000\u00ea\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ee\u00e8\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ef\u00fe\u0001\u0000\u0000\u0000\u00f0\u00f2\u0005"+
		"\t\u0000\u0000\u00f1\u00f3\u0005\t\u0000\u0000\u00f2\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00fa\u0001\u0000"+
		"\u0000\u0000\u00f4\u00fb\u0003>\u001f\u0000\u00f5\u00f7\u0005\u0002\u0000"+
		"\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f4\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f6\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fc\u00f0\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff+\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0101\u0103\u0005\u0002\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u0105-\u0001\u0000\u0000\u0000\u0106"+
		"\u010b\u0003>\u001f\u0000\u0107\u0108\u0005\n\u0000\u0000\u0108\u010a"+
		"\u0003>\u001f\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010d\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010e\u0110\u0005\n\u0000\u0000\u010f\u010e\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110/\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0003>\u001f\u0000\u01121\u0001\u0000\u0000\u0000\u0113"+
		"\u0116\u00030\u0018\u0000\u0114\u0115\u0005\n\u0000\u0000\u0115\u0117"+
		"\u00034\u001a\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0005"+
		"\u000f\u0000\u0000\u01193\u0001\u0000\u0000\u0000\u011a\u011b\u0003>\u001f"+
		"\u0000\u011b5\u0001\u0000\u0000\u0000\u011c\u0123\u0005\u0012\u0000\u0000"+
		"\u011d\u0124\u0003>\u001f\u0000\u011e\u0120\u0005\u0002\u0000\u0000\u011f"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121"+
		"\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122"+
		"\u0124\u0001\u0000\u0000\u0000\u0123\u011d\u0001\u0000\u0000\u0000\u0123"+
		"\u011f\u0001\u0000\u0000\u0000\u01247\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0005\u0010\u0000\u0000\u0126\u0127\u0003:\u001d\u0000\u01279\u0001\u0000"+
		"\u0000\u0000\u0128\u012d\u0003<\u001e\u0000\u0129\u012a\u0005\u0011\u0000"+
		"\u0000\u012a\u012c\u0003<\u001e\u0000\u012b\u0129\u0001\u0000\u0000\u0000"+
		"\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0001\u0000\u0000\u0000\u012e;\u0001\u0000\u0000\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u0130\u013b\u0003>\u001f\u0000\u0131\u0139"+
		"\u0005\u0013\u0000\u0000\u0132\u013a\u0003>\u001f\u0000\u0133\u0135\u0005"+
		"\u0002\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001"+
		"\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001"+
		"\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u013a\u0003"+
		"@ \u0000\u0139\u0132\u0001\u0000\u0000\u0000\u0139\u0134\u0001\u0000\u0000"+
		"\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000"+
		"\u0000\u013b\u0131\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c=\u0001\u0000\u0000\u0000\u013d\u0143\u0005\u0001\u0000\u0000"+
		"\u013e\u0143\u0005\u0007\u0000\u0000\u013f\u0143\u0005\u0002\u0000\u0000"+
		"\u0140\u0143\u0003@ \u0000\u0141\u0143\u0005\b\u0000\u0000\u0142\u013d"+
		"\u0001\u0000\u0000\u0000\u0142\u013e\u0001\u0000\u0000\u0000\u0142\u013f"+
		"\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0141"+
		"\u0001\u0000\u0000\u0000\u0143\u014d\u0001\u0000\u0000\u0000\u0144\u014c"+
		"\u0005\u0001\u0000\u0000\u0145\u014c\u0005\u0002\u0000\u0000\u0146\u014c"+
		"\u0005\u0014\u0000\u0000\u0147\u014c\u0005\u0015\u0000\u0000\u0148\u014c"+
		"\u0005\u0016\u0000\u0000\u0149\u014c\u0003@ \u0000\u014a\u014c\u0005\b"+
		"\u0000\u0000\u014b\u0144\u0001\u0000\u0000\u0000\u014b\u0145\u0001\u0000"+
		"\u0000\u0000\u014b\u0146\u0001\u0000\u0000\u0000\u014b\u0147\u0001\u0000"+
		"\u0000\u0000\u014b\u0148\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000"+
		"\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000"+
		"\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u0156\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u0150\u0152\u0005\u0002\u0000\u0000\u0151\u0150\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000"+
		"\u0000\u0000\u0155\u0142\u0001\u0000\u0000\u0000\u0155\u0151\u0001\u0000"+
		"\u0000\u0000\u0156?\u0001\u0000\u0000\u0000\u0157\u0158\u0005\u0017\u0000"+
		"\u0000\u0158\u0159\u0007\u0000\u0000\u0000\u0159\u015b\u0007\u0000\u0000"+
		"\u0000\u015a\u0157\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000"+
		"\u0000\u015dA\u0001\u0000\u0000\u0000.FKNS\\fsw\u0080\u008d\u0091\u009b"+
		"\u00a8\u00ac\u00ba\u00bf\u00c4\u00c8\u00ca\u00cd\u00d0\u00d9\u00e2\u00e6"+
		"\u00ec\u00ee\u00f2\u00f8\u00fa\u00fe\u0104\u010b\u010f\u0116\u0121\u0123"+
		"\u012d\u0136\u0139\u013b\u0142\u014b\u014d\u0153\u0155\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}