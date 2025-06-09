// Generated from MarkdownRule.g4 by ANTLR 4.13.2
package com.aurora.markdown.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MarkdownRule}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MarkdownRuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MarkdownRule.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#inline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline(MarkdownRule.InlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#indent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndent(MarkdownRule.IndentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#plainText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainText(MarkdownRule.PlainTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#inlineCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineCode(MarkdownRule.InlineCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#emphasis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmphasis(MarkdownRule.EmphasisContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#boldTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldTag(MarkdownRule.BoldTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#boldElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldElement(MarkdownRule.BoldElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boldSingle}
	 * labeled alternative in {@link MarkdownRule#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldSingle(MarkdownRule.BoldSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boldMulti}
	 * labeled alternative in {@link MarkdownRule#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldMulti(MarkdownRule.BoldMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#italicTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicTag(MarkdownRule.ItalicTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#italicElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicElement(MarkdownRule.ItalicElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code italicSingle}
	 * labeled alternative in {@link MarkdownRule#italic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicSingle(MarkdownRule.ItalicSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code italicMutli}
	 * labeled alternative in {@link MarkdownRule#italic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicMutli(MarkdownRule.ItalicMutliContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#strikeThroughTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrikeThroughTag(MarkdownRule.StrikeThroughTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#strikeThroughElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrikeThroughElement(MarkdownRule.StrikeThroughElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strikeThroughSingle}
	 * labeled alternative in {@link MarkdownRule#strikeThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrikeThroughSingle(MarkdownRule.StrikeThroughSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strikeThroughMulti}
	 * labeled alternative in {@link MarkdownRule#strikeThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrikeThroughMulti(MarkdownRule.StrikeThroughMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#urlLink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlLink(MarkdownRule.UrlLinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#altText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltText(MarkdownRule.AltTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(MarkdownRule.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#colonSlashSlash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonSlashSlash(MarkdownRule.ColonSlashSlashContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheme(MarkdownRule.SchemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(MarkdownRule.HostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DomainNameOrIPv4Host}
	 * labeled alternative in {@link MarkdownRule#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainNameOrIPv4Host(MarkdownRule.DomainNameOrIPv4HostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IPv6Host}
	 * labeled alternative in {@link MarkdownRule#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIPv6Host(MarkdownRule.IPv6HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#v6host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV6host(MarkdownRule.V6hostContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(MarkdownRule.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(MarkdownRule.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser(MarkdownRule.UserContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#login}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogin(MarkdownRule.LoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(MarkdownRule.PasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrag(MarkdownRule.FragContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(MarkdownRule.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#search}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch(MarkdownRule.SearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#searchparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchparameter(MarkdownRule.SearchparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MarkdownRule.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRule#hex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(MarkdownRule.HexContext ctx);
}