// Generated from InlineRule.g4 by ANTLR 4.13.2
package com.aurora.markdown.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InlineRule}.
 */
public interface InlineRuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InlineRule#inline}.
	 * @param ctx the parse tree
	 */
	void enterInline(InlineRule.InlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#inline}.
	 * @param ctx the parse tree
	 */
	void exitInline(InlineRule.InlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#indent}.
	 * @param ctx the parse tree
	 */
	void enterIndent(InlineRule.IndentContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#indent}.
	 * @param ctx the parse tree
	 */
	void exitIndent(InlineRule.IndentContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#plainText}.
	 * @param ctx the parse tree
	 */
	void enterPlainText(InlineRule.PlainTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#plainText}.
	 * @param ctx the parse tree
	 */
	void exitPlainText(InlineRule.PlainTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#inlineCode}.
	 * @param ctx the parse tree
	 */
	void enterInlineCode(InlineRule.InlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#inlineCode}.
	 * @param ctx the parse tree
	 */
	void exitInlineCode(InlineRule.InlineCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#emphasis}.
	 * @param ctx the parse tree
	 */
	void enterEmphasis(InlineRule.EmphasisContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#emphasis}.
	 * @param ctx the parse tree
	 */
	void exitEmphasis(InlineRule.EmphasisContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#boldTag}.
	 * @param ctx the parse tree
	 */
	void enterBoldTag(InlineRule.BoldTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#boldTag}.
	 * @param ctx the parse tree
	 */
	void exitBoldTag(InlineRule.BoldTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#boldElement}.
	 * @param ctx the parse tree
	 */
	void enterBoldElement(InlineRule.BoldElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#boldElement}.
	 * @param ctx the parse tree
	 */
	void exitBoldElement(InlineRule.BoldElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boldSingle}
	 * labeled alternative in {@link InlineRule#bold}.
	 * @param ctx the parse tree
	 */
	void enterBoldSingle(InlineRule.BoldSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boldSingle}
	 * labeled alternative in {@link InlineRule#bold}.
	 * @param ctx the parse tree
	 */
	void exitBoldSingle(InlineRule.BoldSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boldMulti}
	 * labeled alternative in {@link InlineRule#bold}.
	 * @param ctx the parse tree
	 */
	void enterBoldMulti(InlineRule.BoldMultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boldMulti}
	 * labeled alternative in {@link InlineRule#bold}.
	 * @param ctx the parse tree
	 */
	void exitBoldMulti(InlineRule.BoldMultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#italicTag}.
	 * @param ctx the parse tree
	 */
	void enterItalicTag(InlineRule.ItalicTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#italicTag}.
	 * @param ctx the parse tree
	 */
	void exitItalicTag(InlineRule.ItalicTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#italicElement}.
	 * @param ctx the parse tree
	 */
	void enterItalicElement(InlineRule.ItalicElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#italicElement}.
	 * @param ctx the parse tree
	 */
	void exitItalicElement(InlineRule.ItalicElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code italicSingle}
	 * labeled alternative in {@link InlineRule#italic}.
	 * @param ctx the parse tree
	 */
	void enterItalicSingle(InlineRule.ItalicSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code italicSingle}
	 * labeled alternative in {@link InlineRule#italic}.
	 * @param ctx the parse tree
	 */
	void exitItalicSingle(InlineRule.ItalicSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code italicMutli}
	 * labeled alternative in {@link InlineRule#italic}.
	 * @param ctx the parse tree
	 */
	void enterItalicMutli(InlineRule.ItalicMutliContext ctx);
	/**
	 * Exit a parse tree produced by the {@code italicMutli}
	 * labeled alternative in {@link InlineRule#italic}.
	 * @param ctx the parse tree
	 */
	void exitItalicMutli(InlineRule.ItalicMutliContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#strikeThroughTag}.
	 * @param ctx the parse tree
	 */
	void enterStrikeThroughTag(InlineRule.StrikeThroughTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#strikeThroughTag}.
	 * @param ctx the parse tree
	 */
	void exitStrikeThroughTag(InlineRule.StrikeThroughTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#strikeThroughElement}.
	 * @param ctx the parse tree
	 */
	void enterStrikeThroughElement(InlineRule.StrikeThroughElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#strikeThroughElement}.
	 * @param ctx the parse tree
	 */
	void exitStrikeThroughElement(InlineRule.StrikeThroughElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strikeThroughSingle}
	 * labeled alternative in {@link InlineRule#strikeThrough}.
	 * @param ctx the parse tree
	 */
	void enterStrikeThroughSingle(InlineRule.StrikeThroughSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strikeThroughSingle}
	 * labeled alternative in {@link InlineRule#strikeThrough}.
	 * @param ctx the parse tree
	 */
	void exitStrikeThroughSingle(InlineRule.StrikeThroughSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strikeThroughMulti}
	 * labeled alternative in {@link InlineRule#strikeThrough}.
	 * @param ctx the parse tree
	 */
	void enterStrikeThroughMulti(InlineRule.StrikeThroughMultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strikeThroughMulti}
	 * labeled alternative in {@link InlineRule#strikeThrough}.
	 * @param ctx the parse tree
	 */
	void exitStrikeThroughMulti(InlineRule.StrikeThroughMultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#urlLink}.
	 * @param ctx the parse tree
	 */
	void enterUrlLink(InlineRule.UrlLinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#urlLink}.
	 * @param ctx the parse tree
	 */
	void exitUrlLink(InlineRule.UrlLinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#altText}.
	 * @param ctx the parse tree
	 */
	void enterAltText(InlineRule.AltTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#altText}.
	 * @param ctx the parse tree
	 */
	void exitAltText(InlineRule.AltTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(InlineRule.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(InlineRule.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#colonSlashSlash}.
	 * @param ctx the parse tree
	 */
	void enterColonSlashSlash(InlineRule.ColonSlashSlashContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#colonSlashSlash}.
	 * @param ctx the parse tree
	 */
	void exitColonSlashSlash(InlineRule.ColonSlashSlashContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(InlineRule.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(InlineRule.SchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(InlineRule.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(InlineRule.HostContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DomainNameOrIPv4Host}
	 * labeled alternative in {@link InlineRule#hostname}.
	 * @param ctx the parse tree
	 */
	void enterDomainNameOrIPv4Host(InlineRule.DomainNameOrIPv4HostContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DomainNameOrIPv4Host}
	 * labeled alternative in {@link InlineRule#hostname}.
	 * @param ctx the parse tree
	 */
	void exitDomainNameOrIPv4Host(InlineRule.DomainNameOrIPv4HostContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IPv6Host}
	 * labeled alternative in {@link InlineRule#hostname}.
	 * @param ctx the parse tree
	 */
	void enterIPv6Host(InlineRule.IPv6HostContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IPv6Host}
	 * labeled alternative in {@link InlineRule#hostname}.
	 * @param ctx the parse tree
	 */
	void exitIPv6Host(InlineRule.IPv6HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#v6host}.
	 * @param ctx the parse tree
	 */
	void enterV6host(InlineRule.V6hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#v6host}.
	 * @param ctx the parse tree
	 */
	void exitV6host(InlineRule.V6hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(InlineRule.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(InlineRule.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(InlineRule.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(InlineRule.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(InlineRule.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(InlineRule.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#login}.
	 * @param ctx the parse tree
	 */
	void enterLogin(InlineRule.LoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#login}.
	 * @param ctx the parse tree
	 */
	void exitLogin(InlineRule.LoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(InlineRule.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(InlineRule.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#frag}.
	 * @param ctx the parse tree
	 */
	void enterFrag(InlineRule.FragContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#frag}.
	 * @param ctx the parse tree
	 */
	void exitFrag(InlineRule.FragContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(InlineRule.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(InlineRule.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#search}.
	 * @param ctx the parse tree
	 */
	void enterSearch(InlineRule.SearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#search}.
	 * @param ctx the parse tree
	 */
	void exitSearch(InlineRule.SearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#searchparameter}.
	 * @param ctx the parse tree
	 */
	void enterSearchparameter(InlineRule.SearchparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#searchparameter}.
	 * @param ctx the parse tree
	 */
	void exitSearchparameter(InlineRule.SearchparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#string}.
	 * @param ctx the parse tree
	 */
	void enterString(InlineRule.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#string}.
	 * @param ctx the parse tree
	 */
	void exitString(InlineRule.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link InlineRule#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(InlineRule.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link InlineRule#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(InlineRule.HexContext ctx);
}