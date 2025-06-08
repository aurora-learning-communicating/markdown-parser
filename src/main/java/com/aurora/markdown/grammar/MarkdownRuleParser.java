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
public class MarkdownRuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Letter=1, Digit=2, Space=3, Tab=4, Newline=5, WhiteSpace=6, Star=7, 
		Tilde=8, Underscore=9;
	public static final int
		RULE_start = 0, RULE_inline = 1, RULE_indent = 2, RULE_plainText = 3, 
		RULE_inlineCode = 4, RULE_emphasis = 5, RULE_boldTag = 6, RULE_boldElement = 7, 
		RULE_bold = 8, RULE_italicTag = 9, RULE_italicElement = 10, RULE_italic = 11, 
		RULE_strikeThroughTag = 12, RULE_strikeThroughElement = 13, RULE_strikeThrough = 14, 
		RULE_underlineTag = 15, RULE_underlineElement = 16, RULE_underline = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "inline", "indent", "plainText", "inlineCode", "emphasis", "boldTag", 
			"boldElement", "bold", "italicTag", "italicElement", "italic", "strikeThroughTag", 
			"strikeThroughElement", "strikeThrough", "underlineTag", "underlineElement", 
			"underline"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'`'", null, "' '", "'\\t'", null, null, "'*'", "'~'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Digit", "Space", "Tab", "Newline", "WhiteSpace", "Star", 
			"Tilde", "Underscore"
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

	public MarkdownRuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public InlineContext inline() {
			return getRuleContext(InlineContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MarkdownRuleParser.EOF, 0); }
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
			setState(36);
			inline();
			setState(37);
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
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				plainText();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				inlineCode();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				emphasis();
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
	public static class IndentContext extends ParserRuleContext {
		public List<TerminalNode> Space() { return getTokens(MarkdownRuleParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(MarkdownRuleParser.Space, i);
		}
		public TerminalNode Tab() { return getToken(MarkdownRuleParser.Tab, 0); }
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
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Space:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(44);
					match(Space);
					}
					}
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space );
				}
				break;
			case Tab:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
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
		public List<TerminalNode> Letter() { return getTokens(MarkdownRuleParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(MarkdownRuleParser.Letter, i);
		}
		public List<TerminalNode> Digit() { return getTokens(MarkdownRuleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(MarkdownRuleParser.Digit, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(52);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==Digit) ) {
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
				setState(55); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			setState(57);
			match(T__0);
			setState(58);
			plainText();
			setState(59);
			match(T__0);
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
		public UnderlineContext underline() {
			return getRuleContext(UnderlineContext.class,0);
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				bold();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				italic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				strikeThrough();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				underline();
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
		public List<TerminalNode> Star() { return getTokens(MarkdownRuleParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(MarkdownRuleParser.Star, i);
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
			setState(67);
			match(Star);
			setState(68);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(70);
				plainText();
				}
				break;
			case 2:
				{
				setState(71);
				inlineCode();
				}
				break;
			case 3:
				{
				setState(72);
				strikeThrough();
				}
				break;
			case 4:
				{
				setState(73);
				italic();
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BoldSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				boldTag();
				setState(77);
				boldElement();
				setState(78);
				boldTag();
				}
				break;
			case 2:
				_localctx = new BoldMultiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				boldTag();
				setState(81);
				boldElement();
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(82);
					indent();
					setState(83);
					boldElement();
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space || _la==Tab );
				setState(89);
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
		public TerminalNode Star() { return getToken(MarkdownRuleParser.Star, 0); }
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
			setState(93);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(95);
				bold();
				}
				break;
			case 2:
				{
				setState(96);
				inlineCode();
				}
				break;
			case 3:
				{
				setState(97);
				strikeThrough();
				}
				break;
			case 4:
				{
				setState(98);
				plainText();
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ItalicSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				italicTag();
				setState(102);
				italicElement();
				setState(103);
				italicTag();
				}
				break;
			case 2:
				_localctx = new ItalicMutliContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				italicTag();
				setState(106);
				italicElement();
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(107);
					indent();
					setState(108);
					italicElement();
					}
					}
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space || _la==Tab );
				setState(114);
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
		public List<TerminalNode> Tilde() { return getTokens(MarkdownRuleParser.Tilde); }
		public TerminalNode Tilde(int i) {
			return getToken(MarkdownRuleParser.Tilde, i);
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
			setState(118);
			match(Tilde);
			setState(119);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(121);
				italic();
				}
				break;
			case 2:
				{
				setState(122);
				bold();
				}
				break;
			case 3:
				{
				setState(123);
				inlineCode();
				}
				break;
			case 4:
				{
				setState(124);
				plainText();
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new StrikeThroughSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				strikeThroughTag();
				setState(128);
				strikeThroughElement();
				setState(129);
				strikeThroughTag();
				}
				break;
			case 2:
				_localctx = new StrikeThroughMultiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				strikeThroughTag();
				setState(132);
				strikeThroughElement();
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(133);
					indent();
					setState(134);
					strikeThroughElement();
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space || _la==Tab );
				setState(140);
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
	public static class UnderlineTagContext extends ParserRuleContext {
		public List<TerminalNode> Underscore() { return getTokens(MarkdownRuleParser.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(MarkdownRuleParser.Underscore, i);
		}
		public UnderlineTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underlineTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterUnderlineTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitUnderlineTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitUnderlineTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnderlineTagContext underlineTag() throws RecognitionException {
		UnderlineTagContext _localctx = new UnderlineTagContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_underlineTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(Underscore);
			setState(145);
			match(Underscore);
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
	public static class UnderlineElementContext extends ParserRuleContext {
		public PlainTextContext plainText() {
			return getRuleContext(PlainTextContext.class,0);
		}
		public BoldContext bold() {
			return getRuleContext(BoldContext.class,0);
		}
		public ItalicContext italic() {
			return getRuleContext(ItalicContext.class,0);
		}
		public InlineCodeContext inlineCode() {
			return getRuleContext(InlineCodeContext.class,0);
		}
		public UnderlineElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underlineElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterUnderlineElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitUnderlineElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitUnderlineElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnderlineElementContext underlineElement() throws RecognitionException {
		UnderlineElementContext _localctx = new UnderlineElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_underlineElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(147);
				plainText();
				}
				break;
			case 2:
				{
				setState(148);
				bold();
				}
				break;
			case 3:
				{
				setState(149);
				italic();
				}
				break;
			case 4:
				{
				setState(150);
				inlineCode();
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
	public static class UnderlineContext extends ParserRuleContext {
		public UnderlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underline; }
	 
		public UnderlineContext() { }
		public void copyFrom(UnderlineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnderlineSingleContext extends UnderlineContext {
		public List<UnderlineTagContext> underlineTag() {
			return getRuleContexts(UnderlineTagContext.class);
		}
		public UnderlineTagContext underlineTag(int i) {
			return getRuleContext(UnderlineTagContext.class,i);
		}
		public UnderlineElementContext underlineElement() {
			return getRuleContext(UnderlineElementContext.class,0);
		}
		public UnderlineSingleContext(UnderlineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterUnderlineSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitUnderlineSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitUnderlineSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnderlineMutliContext extends UnderlineContext {
		public List<UnderlineTagContext> underlineTag() {
			return getRuleContexts(UnderlineTagContext.class);
		}
		public UnderlineTagContext underlineTag(int i) {
			return getRuleContext(UnderlineTagContext.class,i);
		}
		public List<UnderlineElementContext> underlineElement() {
			return getRuleContexts(UnderlineElementContext.class);
		}
		public UnderlineElementContext underlineElement(int i) {
			return getRuleContext(UnderlineElementContext.class,i);
		}
		public List<IndentContext> indent() {
			return getRuleContexts(IndentContext.class);
		}
		public IndentContext indent(int i) {
			return getRuleContext(IndentContext.class,i);
		}
		public UnderlineMutliContext(UnderlineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).enterUnderlineMutli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownRuleListener ) ((MarkdownRuleListener)listener).exitUnderlineMutli(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MarkdownRuleVisitor ) return ((MarkdownRuleVisitor<? extends T>)visitor).visitUnderlineMutli(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnderlineContext underline() throws RecognitionException {
		UnderlineContext _localctx = new UnderlineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_underline);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new UnderlineSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				underlineTag();
				setState(154);
				underlineElement();
				setState(155);
				underlineTag();
				}
				break;
			case 2:
				_localctx = new UnderlineMutliContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				underlineTag();
				setState(158);
				underlineElement();
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159);
					indent();
					setState(160);
					underlineElement();
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space || _la==Tab );
				setState(166);
				underlineTag();
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
		"\u0004\u0001\t\u00ab\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001"+
		"\u0001\u0002\u0004\u0002.\b\u0002\u000b\u0002\f\u0002/\u0001\u0002\u0003"+
		"\u00023\b\u0002\u0001\u0003\u0004\u00036\b\u0003\u000b\u0003\f\u00037"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005B\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"K\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0004\bV\b\b\u000b\b\f\bW\u0001\b\u0001\b\u0003\b\\\b\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nd\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000bo\b\u000b\u000b\u000b\f\u000bp\u0001\u000b"+
		"\u0001\u000b\u0003\u000bu\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r~\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u0089\b\u000e\u000b\u000e\f\u000e\u008a\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u008f\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0098\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0004\u0011\u00a3\b\u0011\u000b\u0011\f\u0011"+
		"\u00a4\u0001\u0011\u0001\u0011\u0003\u0011\u00a9\b\u0011\u0001\u0011\u0000"+
		"\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"\u0000\u0001\u0001\u0000\u0001\u0002\u00b4"+
		"\u0000$\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u00042"+
		"\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\b9\u0001\u0000"+
		"\u0000\u0000\nA\u0001\u0000\u0000\u0000\fC\u0001\u0000\u0000\u0000\u000e"+
		"J\u0001\u0000\u0000\u0000\u0010[\u0001\u0000\u0000\u0000\u0012]\u0001"+
		"\u0000\u0000\u0000\u0014c\u0001\u0000\u0000\u0000\u0016t\u0001\u0000\u0000"+
		"\u0000\u0018v\u0001\u0000\u0000\u0000\u001a}\u0001\u0000\u0000\u0000\u001c"+
		"\u008e\u0001\u0000\u0000\u0000\u001e\u0090\u0001\u0000\u0000\u0000 \u0097"+
		"\u0001\u0000\u0000\u0000\"\u00a8\u0001\u0000\u0000\u0000$%\u0003\u0002"+
		"\u0001\u0000%&\u0005\u0000\u0000\u0001&\u0001\u0001\u0000\u0000\u0000"+
		"\'+\u0003\u0006\u0003\u0000(+\u0003\b\u0004\u0000)+\u0003\n\u0005\u0000"+
		"*\'\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000"+
		"\u0000+\u0003\u0001\u0000\u0000\u0000,.\u0005\u0003\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u000013\u0005\u0004\u0000"+
		"\u00002-\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0005\u0001"+
		"\u0000\u0000\u000046\u0007\u0000\u0000\u000054\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008\u0007\u0001\u0000\u0000\u00009:\u0005\u0001\u0000\u0000:;\u0003"+
		"\u0006\u0003\u0000;<\u0005\u0001\u0000\u0000<\t\u0001\u0000\u0000\u0000"+
		"=B\u0003\u0010\b\u0000>B\u0003\u0016\u000b\u0000?B\u0003\u001c\u000e\u0000"+
		"@B\u0003\"\u0011\u0000A=\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000B\u000b\u0001\u0000"+
		"\u0000\u0000CD\u0005\u0007\u0000\u0000DE\u0005\u0007\u0000\u0000E\r\u0001"+
		"\u0000\u0000\u0000FK\u0003\u0006\u0003\u0000GK\u0003\b\u0004\u0000HK\u0003"+
		"\u001c\u000e\u0000IK\u0003\u0016\u000b\u0000JF\u0001\u0000\u0000\u0000"+
		"JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000"+
		"\u0000K\u000f\u0001\u0000\u0000\u0000LM\u0003\f\u0006\u0000MN\u0003\u000e"+
		"\u0007\u0000NO\u0003\f\u0006\u0000O\\\u0001\u0000\u0000\u0000PQ\u0003"+
		"\f\u0006\u0000QU\u0003\u000e\u0007\u0000RS\u0003\u0004\u0002\u0000ST\u0003"+
		"\u000e\u0007\u0000TV\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000YZ\u0003\f\u0006\u0000Z\\\u0001\u0000"+
		"\u0000\u0000[L\u0001\u0000\u0000\u0000[P\u0001\u0000\u0000\u0000\\\u0011"+
		"\u0001\u0000\u0000\u0000]^\u0005\u0007\u0000\u0000^\u0013\u0001\u0000"+
		"\u0000\u0000_d\u0003\u0010\b\u0000`d\u0003\b\u0004\u0000ad\u0003\u001c"+
		"\u000e\u0000bd\u0003\u0006\u0003\u0000c_\u0001\u0000\u0000\u0000c`\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"d\u0015\u0001\u0000\u0000\u0000ef\u0003\u0012\t\u0000fg\u0003\u0014\n"+
		"\u0000gh\u0003\u0012\t\u0000hu\u0001\u0000\u0000\u0000ij\u0003\u0012\t"+
		"\u0000jn\u0003\u0014\n\u0000kl\u0003\u0004\u0002\u0000lm\u0003\u0014\n"+
		"\u0000mo\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0003\u0012\t\u0000su\u0001\u0000\u0000\u0000te\u0001"+
		"\u0000\u0000\u0000ti\u0001\u0000\u0000\u0000u\u0017\u0001\u0000\u0000"+
		"\u0000vw\u0005\b\u0000\u0000wx\u0005\b\u0000\u0000x\u0019\u0001\u0000"+
		"\u0000\u0000y~\u0003\u0016\u000b\u0000z~\u0003\u0010\b\u0000{~\u0003\b"+
		"\u0004\u0000|~\u0003\u0006\u0003\u0000}y\u0001\u0000\u0000\u0000}z\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000"+
		"~\u001b\u0001\u0000\u0000\u0000\u007f\u0080\u0003\u0018\f\u0000\u0080"+
		"\u0081\u0003\u001a\r\u0000\u0081\u0082\u0003\u0018\f\u0000\u0082\u008f"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0003\u0018\f\u0000\u0084\u0088\u0003"+
		"\u001a\r\u0000\u0085\u0086\u0003\u0004\u0002\u0000\u0086\u0087\u0003\u001a"+
		"\r\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0003\u0018\f\u0000\u008d\u008f\u0001\u0000\u0000\u0000"+
		"\u008e\u007f\u0001\u0000\u0000\u0000\u008e\u0083\u0001\u0000\u0000\u0000"+
		"\u008f\u001d\u0001\u0000\u0000\u0000\u0090\u0091\u0005\t\u0000\u0000\u0091"+
		"\u0092\u0005\t\u0000\u0000\u0092\u001f\u0001\u0000\u0000\u0000\u0093\u0098"+
		"\u0003\u0006\u0003\u0000\u0094\u0098\u0003\u0010\b\u0000\u0095\u0098\u0003"+
		"\u0016\u000b\u0000\u0096\u0098\u0003\b\u0004\u0000\u0097\u0093\u0001\u0000"+
		"\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098!\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0003\u001e\u000f\u0000\u009a\u009b\u0003 \u0010\u0000"+
		"\u009b\u009c\u0003\u001e\u000f\u0000\u009c\u00a9\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0003\u001e\u000f\u0000\u009e\u00a2\u0003 \u0010\u0000\u009f"+
		"\u00a0\u0003\u0004\u0002\u0000\u00a0\u00a1\u0003 \u0010\u0000\u00a1\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0003\u001e\u000f\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u0099"+
		"\u0001\u0000\u0000\u0000\u00a8\u009d\u0001\u0000\u0000\u0000\u00a9#\u0001"+
		"\u0000\u0000\u0000\u0011*/27AJW[cpt}\u008a\u008e\u0097\u00a4\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}