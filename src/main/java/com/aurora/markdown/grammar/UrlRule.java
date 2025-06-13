// Generated from UrlRule.g4 by ANTLR 4.13.2
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
public class UrlRule extends Parser {
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
		RULE_url = 0, RULE_colonSlashSlash = 1, RULE_scheme = 2, RULE_host = 3, 
		RULE_hostname = 4, RULE_v6host = 5, RULE_port = 6, RULE_path = 7, RULE_user = 8, 
		RULE_login = 9, RULE_password = 10, RULE_frag = 11, RULE_query = 12, RULE_search = 13, 
		RULE_searchparameter = 14, RULE_string = 15, RULE_hex = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"url", "colonSlashSlash", "scheme", "host", "hostname", "v6host", "port", 
			"path", "user", "login", "password", "frag", "query", "search", "searchparameter", 
			"string", "hex"
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
	public String getGrammarFileName() { return "UrlRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UrlRule(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		public TerminalNode Colon() { return getToken(UrlRule.Colon, 0); }
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public TerminalNode Slash() { return getToken(UrlRule.Slash, 0); }
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
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			scheme();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(35);
				colonSlashSlash();
				}
			}

			setState(38);
			host();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(39);
				match(Colon);
				setState(40);
				port();
				}
			}

			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(43);
				match(Slash);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388998L) != 0)) {
					{
					setState(44);
					path();
					}
				}

				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(49);
				query();
				}
			}

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Hash) {
				{
				setState(52);
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
		public TerminalNode Colon() { return getToken(UrlRule.Colon, 0); }
		public List<TerminalNode> Slash() { return getTokens(UrlRule.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(UrlRule.Slash, i);
		}
		public ColonSlashSlashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonSlashSlash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterColonSlashSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitColonSlashSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitColonSlashSlash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonSlashSlashContext colonSlashSlash() throws RecognitionException {
		ColonSlashSlashContext _localctx = new ColonSlashSlashContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_colonSlashSlash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(Colon);
			setState(56);
			match(Slash);
			setState(57);
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
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitScheme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitScheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeContext scheme() throws RecognitionException {
		SchemeContext _localctx = new SchemeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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
		public TerminalNode Slash() { return getToken(UrlRule.Slash, 0); }
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterHost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitHost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitHost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_host);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(61);
				match(Slash);
				}
			}

			setState(64);
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
		public TerminalNode LeftBracket() { return getToken(UrlRule.LeftBracket, 0); }
		public V6hostContext v6host() {
			return getRuleContext(V6hostContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(UrlRule.RightBracket, 0); }
		public IPv6HostContext(HostnameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterIPv6Host(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitIPv6Host(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitIPv6Host(this);
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
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterDomainNameOrIPv4Host(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitDomainNameOrIPv4Host(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitDomainNameOrIPv4Host(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnameContext hostname() throws RecognitionException {
		HostnameContext _localctx = new HostnameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hostname);
		try {
			setState(71);
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
				setState(66);
				string();
				}
				break;
			case LeftBracket:
				_localctx = new IPv6HostContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(LeftBracket);
				setState(68);
				v6host();
				setState(69);
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
		public List<TerminalNode> Colon() { return getTokens(UrlRule.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(UrlRule.Colon, i);
		}
		public List<TerminalNode> Digit() { return getTokens(UrlRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(UrlRule.Digit, i);
		}
		public V6hostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v6host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterV6host(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitV6host(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitV6host(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V6hostContext v6host() throws RecognitionException {
		V6hostContext _localctx = new V6hostContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_v6host);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(73);
				match(Colon);
				setState(74);
				match(Colon);
				}
			}

			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(77);
				string();
				}
				break;
			case 2:
				{
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78);
					match(Digit);
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Digit );
				}
				break;
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(85);
				match(Colon);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(86);
					match(Colon);
					}
				}

				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(89);
					string();
					}
					break;
				case 2:
					{
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(90);
						match(Digit);
						}
						}
						setState(93); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Digit );
					}
					break;
				}
				}
				}
				setState(101);
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
		public List<TerminalNode> Digit() { return getTokens(UrlRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(UrlRule.Digit, i);
		}
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitPort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitPort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				match(Digit);
				}
				}
				setState(105); 
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
		public List<TerminalNode> Slash() { return getTokens(UrlRule.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(UrlRule.Slash, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_path);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			string();
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					match(Slash);
					setState(109);
					string();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(115);
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
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
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
		public TerminalNode AtSign() { return getToken(UrlRule.AtSign, 0); }
		public TerminalNode Slash() { return getToken(UrlRule.Slash, 0); }
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public LoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_login; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterLogin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitLogin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoginContext login() throws RecognitionException {
		LoginContext _localctx = new LoginContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_login);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			user();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Slash) {
				{
				setState(121);
				match(Slash);
				setState(122);
				password();
				}
			}

			setState(125);
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
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitPassword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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
		public TerminalNode Hash() { return getToken(UrlRule.Hash, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> Digit() { return getTokens(UrlRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(UrlRule.Digit, i);
		}
		public FragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterFrag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitFrag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitFrag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragContext frag() throws RecognitionException {
		FragContext _localctx = new FragContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_frag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(Hash);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(130);
				string();
				}
				break;
			case 2:
				{
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					match(Digit);
					}
					}
					setState(134); 
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
		public TerminalNode QuestionMark() { return getToken(UrlRule.QuestionMark, 0); }
		public SearchContext search() {
			return getRuleContext(SearchContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(QuestionMark);
			setState(139);
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
		public List<TerminalNode> Ampersand() { return getTokens(UrlRule.Ampersand); }
		public TerminalNode Ampersand(int i) {
			return getToken(UrlRule.Ampersand, i);
		}
		public SearchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterSearch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitSearch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitSearch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchContext search() throws RecognitionException {
		SearchContext _localctx = new SearchContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_search);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			searchparameter();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Ampersand) {
				{
				{
				setState(142);
				match(Ampersand);
				setState(143);
				searchparameter();
				}
				}
				setState(148);
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
		public TerminalNode Equal() { return getToken(UrlRule.Equal, 0); }
		public HexContext hex() {
			return getRuleContext(HexContext.class,0);
		}
		public List<TerminalNode> Digit() { return getTokens(UrlRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(UrlRule.Digit, i);
		}
		public SearchparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterSearchparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitSearchparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitSearchparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchparameterContext searchparameter() throws RecognitionException {
		SearchparameterContext _localctx = new SearchparameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_searchparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			string();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(150);
				match(Equal);
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(151);
					string();
					}
					break;
				case 2:
					{
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(152);
						match(Digit);
						}
						}
						setState(155); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Digit );
					}
					break;
				case 3:
					{
					setState(157);
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
		public List<TerminalNode> Letter() { return getTokens(UrlRule.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(UrlRule.Letter, i);
		}
		public TerminalNode Tilde() { return getToken(UrlRule.Tilde, 0); }
		public List<TerminalNode> Digit() { return getTokens(UrlRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(UrlRule.Digit, i);
		}
		public List<HexContext> hex() {
			return getRuleContexts(HexContext.class);
		}
		public HexContext hex(int i) {
			return getRuleContext(HexContext.class,i);
		}
		public List<TerminalNode> Underscore() { return getTokens(UrlRule.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(UrlRule.Underscore, i);
		}
		public List<TerminalNode> Dot() { return getTokens(UrlRule.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(UrlRule.Dot, i);
		}
		public List<TerminalNode> Plus() { return getTokens(UrlRule.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(UrlRule.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(UrlRule.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(UrlRule.Minus, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_string);
		try {
			int _alt;
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Letter:
					{
					setState(162);
					match(Letter);
					}
					break;
				case Tilde:
					{
					setState(163);
					match(Tilde);
					}
					break;
				case Digit:
					{
					setState(164);
					match(Digit);
					}
					break;
				case Percent:
					{
					setState(165);
					hex();
					}
					break;
				case Underscore:
					{
					setState(166);
					match(Underscore);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(176);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Letter:
							{
							setState(169);
							match(Letter);
							}
							break;
						case Digit:
							{
							setState(170);
							match(Digit);
							}
							break;
						case Dot:
							{
							setState(171);
							match(Dot);
							}
							break;
						case Plus:
							{
							setState(172);
							match(Plus);
							}
							break;
						case Minus:
							{
							setState(173);
							match(Minus);
							}
							break;
						case Percent:
							{
							setState(174);
							hex();
							}
							break;
						case Underscore:
							{
							setState(175);
							match(Underscore);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(180);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(181);
						match(Digit);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(184); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public List<TerminalNode> Percent() { return getTokens(UrlRule.Percent); }
		public TerminalNode Percent(int i) {
			return getToken(UrlRule.Percent, i);
		}
		public List<TerminalNode> Letter() { return getTokens(UrlRule.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(UrlRule.Letter, i);
		}
		public List<TerminalNode> Digit() { return getTokens(UrlRule.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(UrlRule.Digit, i);
		}
		public HexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UrlRuleListener ) ((UrlRuleListener)listener).exitHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UrlRuleVisitor ) return ((UrlRuleVisitor<? extends T>)visitor).visitHex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexContext hex() throws RecognitionException {
		HexContext _localctx = new HexContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_hex);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(188);
					match(Percent);
					setState(189);
					_la = _input.LA(1);
					if ( !(_la==Letter || _la==Digit) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(190);
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
				setState(193); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		"\u0004\u0001!\u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0003\u0000%\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000*\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000.\b\u0000\u0003\u00000\b\u0000\u0001\u0000\u0003"+
		"\u00003\b\u0000\u0001\u0000\u0003\u00006\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003"+
		"?\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005L\b\u0005\u0001\u0005\u0001\u0005\u0004\u0005P\b\u0005\u000b"+
		"\u0005\f\u0005Q\u0003\u0005T\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"X\b\u0005\u0001\u0005\u0001\u0005\u0004\u0005\\\b\u0005\u000b\u0005\f"+
		"\u0005]\u0003\u0005`\b\u0005\u0005\u0005b\b\u0005\n\u0005\f\u0005e\t\u0005"+
		"\u0001\u0006\u0004\u0006h\b\u0006\u000b\u0006\f\u0006i\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007o\b\u0007\n\u0007\f\u0007r\t\u0007\u0001"+
		"\u0007\u0003\u0007u\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\t|\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u0085\b\u000b\u000b\u000b\f\u000b\u0086\u0003\u000b"+
		"\u0089\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u0091\b\r\n\r\f\r\u0094\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0004\u000e\u009a\b\u000e\u000b\u000e\f\u000e\u009b\u0001\u000e"+
		"\u0003\u000e\u009f\b\u000e\u0003\u000e\u00a1\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a8\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00b1\b\u000f\n\u000f\f\u000f\u00b4\t\u000f\u0001\u000f"+
		"\u0004\u000f\u00b7\b\u000f\u000b\u000f\f\u000f\u00b8\u0003\u000f\u00bb"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00c0\b\u0010"+
		"\u000b\u0010\f\u0010\u00c1\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000"+
		"\u0001\u0001\u0000\u0001\u0002\u00da\u0000\"\u0001\u0000\u0000\u0000\u0002"+
		"7\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006>\u0001"+
		"\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000"+
		"\fg\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010v\u0001"+
		"\u0000\u0000\u0000\u0012x\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000"+
		"\u0000\u0000\u0016\u0081\u0001\u0000\u0000\u0000\u0018\u008a\u0001\u0000"+
		"\u0000\u0000\u001a\u008d\u0001\u0000\u0000\u0000\u001c\u0095\u0001\u0000"+
		"\u0000\u0000\u001e\u00ba\u0001\u0000\u0000\u0000 \u00bf\u0001\u0000\u0000"+
		"\u0000\"$\u0003\u0004\u0002\u0000#%\u0003\u0002\u0001\u0000$#\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&)\u0003"+
		"\u0006\u0003\u0000\'(\u0005\t\u0000\u0000(*\u0003\f\u0006\u0000)\'\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*/\u0001\u0000\u0000\u0000"+
		"+-\u0005\n\u0000\u0000,.\u0003\u000e\u0007\u0000-,\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000/+\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u000013\u0003\u0018"+
		"\f\u000021\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000"+
		"\u0000\u000046\u0003\u0016\u000b\u000054\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u00006\u0001\u0001\u0000\u0000\u000078\u0005\t\u0000\u0000"+
		"89\u0005\n\u0000\u00009:\u0005\n\u0000\u0000:\u0003\u0001\u0000\u0000"+
		"\u0000;<\u0003\u001e\u000f\u0000<\u0005\u0001\u0000\u0000\u0000=?\u0005"+
		"\n\u0000\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@A\u0003\b\u0004\u0000A\u0007\u0001\u0000\u0000\u0000"+
		"BH\u0003\u001e\u000f\u0000CD\u0005\u000b\u0000\u0000DE\u0003\n\u0005\u0000"+
		"EF\u0005\f\u0000\u0000FH\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000"+
		"GC\u0001\u0000\u0000\u0000H\t\u0001\u0000\u0000\u0000IJ\u0005\t\u0000"+
		"\u0000JL\u0005\t\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LS\u0001\u0000\u0000\u0000MT\u0003\u001e\u000f\u0000NP\u0005\u0002"+
		"\u0000\u0000ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000"+
		"SM\u0001\u0000\u0000\u0000SO\u0001\u0000\u0000\u0000Tc\u0001\u0000\u0000"+
		"\u0000UW\u0005\t\u0000\u0000VX\u0005\t\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000X_\u0001\u0000\u0000\u0000Y`\u0003\u001e"+
		"\u000f\u0000Z\\\u0005\u0002\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^`\u0001\u0000\u0000\u0000_Y\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000"+
		"\u0000`b\u0001\u0000\u0000\u0000aU\u0001\u0000\u0000\u0000be\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u000b"+
		"\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fh\u0005\u0002\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000j\r\u0001\u0000\u0000\u0000kp\u0003"+
		"\u001e\u000f\u0000lm\u0005\n\u0000\u0000mo\u0003\u001e\u000f\u0000nl\u0001"+
		"\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000su\u0005\n\u0000\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000u\u000f\u0001\u0000\u0000\u0000vw\u0003\u001e\u000f\u0000w\u0011"+
		"\u0001\u0000\u0000\u0000x{\u0003\u0010\b\u0000yz\u0005\n\u0000\u0000z"+
		"|\u0003\u0014\n\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}~\u0005\u000f\u0000\u0000~\u0013\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0003\u001e\u000f\u0000\u0080\u0015\u0001\u0000"+
		"\u0000\u0000\u0081\u0088\u0005\u0012\u0000\u0000\u0082\u0089\u0003\u001e"+
		"\u000f\u0000\u0083\u0085\u0005\u0002\u0000\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000"+
		"\u0000\u0000\u0088\u0082\u0001\u0000\u0000\u0000\u0088\u0084\u0001\u0000"+
		"\u0000\u0000\u0089\u0017\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0010"+
		"\u0000\u0000\u008b\u008c\u0003\u001a\r\u0000\u008c\u0019\u0001\u0000\u0000"+
		"\u0000\u008d\u0092\u0003\u001c\u000e\u0000\u008e\u008f\u0005\u0011\u0000"+
		"\u0000\u008f\u0091\u0003\u001c\u000e\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u001b\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u00a0\u0003\u001e\u000f"+
		"\u0000\u0096\u009e\u0005\u0013\u0000\u0000\u0097\u009f\u0003\u001e\u000f"+
		"\u0000\u0098\u009a\u0005\u0002\u0000\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0003 \u0010\u0000\u009e\u0097\u0001\u0000\u0000\u0000"+
		"\u009e\u0099\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u0096\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u001d\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a8\u0005\u0001\u0000\u0000\u00a3\u00a8\u0005\u0007\u0000\u0000"+
		"\u00a4\u00a8\u0005\u0002\u0000\u0000\u00a5\u00a8\u0003 \u0010\u0000\u00a6"+
		"\u00a8\u0005\b\u0000\u0000\u00a7\u00a2\u0001\u0000\u0000\u0000\u00a7\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00b2"+
		"\u0001\u0000\u0000\u0000\u00a9\u00b1\u0005\u0001\u0000\u0000\u00aa\u00b1"+
		"\u0005\u0002\u0000\u0000\u00ab\u00b1\u0005\u0014\u0000\u0000\u00ac\u00b1"+
		"\u0005\u0015\u0000\u0000\u00ad\u00b1\u0005\u0016\u0000\u0000\u00ae\u00b1"+
		"\u0003 \u0010\u0000\u00af\u00b1\u0005\b\u0000\u0000\u00b0\u00a9\u0001"+
		"\u0000\u0000\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000\u00b0\u00ab\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00bb\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005"+
		"\u0002\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00a7\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00bb\u001f\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\u0017\u0000\u0000\u00bd\u00be\u0007"+
		"\u0000\u0000\u0000\u00be\u00c0\u0007\u0000\u0000\u0000\u00bf\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2!\u0001\u0000"+
		"\u0000\u0000\u001f$)-/25>GKQSW]_cipt{\u0086\u0088\u0092\u009b\u009e\u00a0"+
		"\u00a7\u00b0\u00b2\u00b8\u00ba\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}