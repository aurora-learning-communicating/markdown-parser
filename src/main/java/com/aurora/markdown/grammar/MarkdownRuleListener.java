// Generated from MarkdownRule.g4 by ANTLR 4.13.2
package com.aurora.markdown.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarkdownRule}.
 */
public interface MarkdownRuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MarkdownRule.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MarkdownRule.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#inline}.
	 * @param ctx the parse tree
	 */
	void enterInline(MarkdownRule.InlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#inline}.
	 * @param ctx the parse tree
	 */
	void exitInline(MarkdownRule.InlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#indent}.
	 * @param ctx the parse tree
	 */
	void enterIndent(MarkdownRule.IndentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#indent}.
	 * @param ctx the parse tree
	 */
	void exitIndent(MarkdownRule.IndentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#plainText}.
	 * @param ctx the parse tree
	 */
	void enterPlainText(MarkdownRule.PlainTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#plainText}.
	 * @param ctx the parse tree
	 */
	void exitPlainText(MarkdownRule.PlainTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#inlineCode}.
	 * @param ctx the parse tree
	 */
	void enterInlineCode(MarkdownRule.InlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#inlineCode}.
	 * @param ctx the parse tree
	 */
	void exitInlineCode(MarkdownRule.InlineCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#emphasis}.
	 * @param ctx the parse tree
	 */
	void enterEmphasis(MarkdownRule.EmphasisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#emphasis}.
	 * @param ctx the parse tree
	 */
	void exitEmphasis(MarkdownRule.EmphasisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#boldTag}.
	 * @param ctx the parse tree
	 */
	void enterBoldTag(MarkdownRule.BoldTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#boldTag}.
	 * @param ctx the parse tree
	 */
	void exitBoldTag(MarkdownRule.BoldTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#boldElement}.
	 * @param ctx the parse tree
	 */
	void enterBoldElement(MarkdownRule.BoldElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#boldElement}.
	 * @param ctx the parse tree
	 */
	void exitBoldElement(MarkdownRule.BoldElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boldSingle}
	 * labeled alternative in {@link MarkdownRule#bold}.
	 * @param ctx the parse tree
	 */
	void enterBoldSingle(MarkdownRule.BoldSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boldSingle}
	 * labeled alternative in {@link MarkdownRule#bold}.
	 * @param ctx the parse tree
	 */
	void exitBoldSingle(MarkdownRule.BoldSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boldMulti}
	 * labeled alternative in {@link MarkdownRule#bold}.
	 * @param ctx the parse tree
	 */
	void enterBoldMulti(MarkdownRule.BoldMultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boldMulti}
	 * labeled alternative in {@link MarkdownRule#bold}.
	 * @param ctx the parse tree
	 */
	void exitBoldMulti(MarkdownRule.BoldMultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#italicTag}.
	 * @param ctx the parse tree
	 */
	void enterItalicTag(MarkdownRule.ItalicTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#italicTag}.
	 * @param ctx the parse tree
	 */
	void exitItalicTag(MarkdownRule.ItalicTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#italicElement}.
	 * @param ctx the parse tree
	 */
	void enterItalicElement(MarkdownRule.ItalicElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#italicElement}.
	 * @param ctx the parse tree
	 */
	void exitItalicElement(MarkdownRule.ItalicElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code italicSingle}
	 * labeled alternative in {@link MarkdownRule#italic}.
	 * @param ctx the parse tree
	 */
	void enterItalicSingle(MarkdownRule.ItalicSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code italicSingle}
	 * labeled alternative in {@link MarkdownRule#italic}.
	 * @param ctx the parse tree
	 */
	void exitItalicSingle(MarkdownRule.ItalicSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code italicMutli}
	 * labeled alternative in {@link MarkdownRule#italic}.
	 * @param ctx the parse tree
	 */
	void enterItalicMutli(MarkdownRule.ItalicMutliContext ctx);
	/**
	 * Exit a parse tree produced by the {@code italicMutli}
	 * labeled alternative in {@link MarkdownRule#italic}.
	 * @param ctx the parse tree
	 */
	void exitItalicMutli(MarkdownRule.ItalicMutliContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#strikeThroughTag}.
	 * @param ctx the parse tree
	 */
	void enterStrikeThroughTag(MarkdownRule.StrikeThroughTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#strikeThroughTag}.
	 * @param ctx the parse tree
	 */
	void exitStrikeThroughTag(MarkdownRule.StrikeThroughTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#strikeThroughElement}.
	 * @param ctx the parse tree
	 */
	void enterStrikeThroughElement(MarkdownRule.StrikeThroughElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#strikeThroughElement}.
	 * @param ctx the parse tree
	 */
	void exitStrikeThroughElement(MarkdownRule.StrikeThroughElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strikeThroughSingle}
	 * labeled alternative in {@link MarkdownRule#strikeThrough}.
	 * @param ctx the parse tree
	 */
	void enterStrikeThroughSingle(MarkdownRule.StrikeThroughSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strikeThroughSingle}
	 * labeled alternative in {@link MarkdownRule#strikeThrough}.
	 * @param ctx the parse tree
	 */
	void exitStrikeThroughSingle(MarkdownRule.StrikeThroughSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strikeThroughMulti}
	 * labeled alternative in {@link MarkdownRule#strikeThrough}.
	 * @param ctx the parse tree
	 */
	void enterStrikeThroughMulti(MarkdownRule.StrikeThroughMultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strikeThroughMulti}
	 * labeled alternative in {@link MarkdownRule#strikeThrough}.
	 * @param ctx the parse tree
	 */
	void exitStrikeThroughMulti(MarkdownRule.StrikeThroughMultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#urlLink}.
	 * @param ctx the parse tree
	 */
	void enterUrlLink(MarkdownRule.UrlLinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#urlLink}.
	 * @param ctx the parse tree
	 */
	void exitUrlLink(MarkdownRule.UrlLinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#altText}.
	 * @param ctx the parse tree
	 */
	void enterAltText(MarkdownRule.AltTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#altText}.
	 * @param ctx the parse tree
	 */
	void exitAltText(MarkdownRule.AltTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(MarkdownRule.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(MarkdownRule.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#colonSlashSlash}.
	 * @param ctx the parse tree
	 */
	void enterColonSlashSlash(MarkdownRule.ColonSlashSlashContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#colonSlashSlash}.
	 * @param ctx the parse tree
	 */
	void exitColonSlashSlash(MarkdownRule.ColonSlashSlashContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(MarkdownRule.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(MarkdownRule.SchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(MarkdownRule.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(MarkdownRule.HostContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DomainNameOrIPv4Host}
	 * labeled alternative in {@link MarkdownRule#hostname}.
	 * @param ctx the parse tree
	 */
	void enterDomainNameOrIPv4Host(MarkdownRule.DomainNameOrIPv4HostContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DomainNameOrIPv4Host}
	 * labeled alternative in {@link MarkdownRule#hostname}.
	 * @param ctx the parse tree
	 */
	void exitDomainNameOrIPv4Host(MarkdownRule.DomainNameOrIPv4HostContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IPv6Host}
	 * labeled alternative in {@link MarkdownRule#hostname}.
	 * @param ctx the parse tree
	 */
	void enterIPv6Host(MarkdownRule.IPv6HostContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IPv6Host}
	 * labeled alternative in {@link MarkdownRule#hostname}.
	 * @param ctx the parse tree
	 */
	void exitIPv6Host(MarkdownRule.IPv6HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#v6host}.
	 * @param ctx the parse tree
	 */
	void enterV6host(MarkdownRule.V6hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#v6host}.
	 * @param ctx the parse tree
	 */
	void exitV6host(MarkdownRule.V6hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(MarkdownRule.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(MarkdownRule.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(MarkdownRule.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(MarkdownRule.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(MarkdownRule.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(MarkdownRule.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#login}.
	 * @param ctx the parse tree
	 */
	void enterLogin(MarkdownRule.LoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#login}.
	 * @param ctx the parse tree
	 */
	void exitLogin(MarkdownRule.LoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(MarkdownRule.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(MarkdownRule.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#frag}.
	 * @param ctx the parse tree
	 */
	void enterFrag(MarkdownRule.FragContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#frag}.
	 * @param ctx the parse tree
	 */
	void exitFrag(MarkdownRule.FragContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(MarkdownRule.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(MarkdownRule.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#search}.
	 * @param ctx the parse tree
	 */
	void enterSearch(MarkdownRule.SearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#search}.
	 * @param ctx the parse tree
	 */
	void exitSearch(MarkdownRule.SearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#searchparameter}.
	 * @param ctx the parse tree
	 */
	void enterSearchparameter(MarkdownRule.SearchparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#searchparameter}.
	 * @param ctx the parse tree
	 */
	void exitSearchparameter(MarkdownRule.SearchparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MarkdownRule.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MarkdownRule.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRule#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(MarkdownRule.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRule#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(MarkdownRule.HexContext ctx);
}