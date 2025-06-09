// Generated from UrlRule.g4 by ANTLR 4.13.2
package com.aurora.markdown.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UrlRule}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UrlRuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UrlRule#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(UrlRule.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#colonSlashSlash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonSlashSlash(UrlRule.ColonSlashSlashContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheme(UrlRule.SchemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(UrlRule.HostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DomainNameOrIPv4Host}
	 * labeled alternative in {@link UrlRule#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainNameOrIPv4Host(UrlRule.DomainNameOrIPv4HostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IPv6Host}
	 * labeled alternative in {@link UrlRule#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIPv6Host(UrlRule.IPv6HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#v6host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV6host(UrlRule.V6hostContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(UrlRule.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(UrlRule.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser(UrlRule.UserContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#login}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogin(UrlRule.LoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(UrlRule.PasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrag(UrlRule.FragContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(UrlRule.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#search}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch(UrlRule.SearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#searchparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchparameter(UrlRule.SearchparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(UrlRule.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link UrlRule#hex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(UrlRule.HexContext ctx);
}