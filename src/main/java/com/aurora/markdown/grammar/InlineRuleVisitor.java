// Generated from InlineRule.g4 by ANTLR 4.13.2
package com.aurora.markdown.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InlineRule}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InlineRuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InlineRule#inline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline(InlineRule.InlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#indent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndent(InlineRule.IndentContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#plainText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainText(InlineRule.PlainTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#inlineCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineCode(InlineRule.InlineCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#emphasis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmphasis(InlineRule.EmphasisContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#boldTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldTag(InlineRule.BoldTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#boldElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldElement(InlineRule.BoldElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoldSingle}
	 * labeled alternative in {@link InlineRule#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldSingle(InlineRule.BoldSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoldMulti}
	 * labeled alternative in {@link InlineRule#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldMulti(InlineRule.BoldMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#italicTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicTag(InlineRule.ItalicTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#italicElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicElement(InlineRule.ItalicElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ItalicSingle}
	 * labeled alternative in {@link InlineRule#italic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicSingle(InlineRule.ItalicSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ItalicMutli}
	 * labeled alternative in {@link InlineRule#italic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicMutli(InlineRule.ItalicMutliContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#strikeThroughTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrikeThroughTag(InlineRule.StrikeThroughTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#strikeThroughElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrikeThroughElement(InlineRule.StrikeThroughElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrikeThroughSingle}
	 * labeled alternative in {@link InlineRule#strikeThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrikeThroughSingle(InlineRule.StrikeThroughSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrikeThroughMulti}
	 * labeled alternative in {@link InlineRule#strikeThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrikeThroughMulti(InlineRule.StrikeThroughMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#urlLink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlLink(InlineRule.UrlLinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#altText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltText(InlineRule.AltTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(InlineRule.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#colonSlashSlash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonSlashSlash(InlineRule.ColonSlashSlashContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheme(InlineRule.SchemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(InlineRule.HostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DomainNameOrIPv4Host}
	 * labeled alternative in {@link InlineRule#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainNameOrIPv4Host(InlineRule.DomainNameOrIPv4HostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IPv6Host}
	 * labeled alternative in {@link InlineRule#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIPv6Host(InlineRule.IPv6HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#v6host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV6host(InlineRule.V6hostContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(InlineRule.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(InlineRule.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser(InlineRule.UserContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#login}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogin(InlineRule.LoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(InlineRule.PasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrag(InlineRule.FragContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(InlineRule.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#search}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch(InlineRule.SearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#searchparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchparameter(InlineRule.SearchparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(InlineRule.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link InlineRule#hex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(InlineRule.HexContext ctx);
}