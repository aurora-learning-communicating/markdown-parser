// Generated from UrlRule.g4 by ANTLR 4.13.2
package com.aurora.markdown.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UrlRule}.
 */
public interface UrlRuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UrlRule#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(UrlRule.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(UrlRule.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#colonSlashSlash}.
	 * @param ctx the parse tree
	 */
	void enterColonSlashSlash(UrlRule.ColonSlashSlashContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#colonSlashSlash}.
	 * @param ctx the parse tree
	 */
	void exitColonSlashSlash(UrlRule.ColonSlashSlashContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(UrlRule.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(UrlRule.SchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(UrlRule.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(UrlRule.HostContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DomainNameOrIPv4Host}
	 * labeled alternative in {@link UrlRule#hostname}.
	 * @param ctx the parse tree
	 */
	void enterDomainNameOrIPv4Host(UrlRule.DomainNameOrIPv4HostContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DomainNameOrIPv4Host}
	 * labeled alternative in {@link UrlRule#hostname}.
	 * @param ctx the parse tree
	 */
	void exitDomainNameOrIPv4Host(UrlRule.DomainNameOrIPv4HostContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IPv6Host}
	 * labeled alternative in {@link UrlRule#hostname}.
	 * @param ctx the parse tree
	 */
	void enterIPv6Host(UrlRule.IPv6HostContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IPv6Host}
	 * labeled alternative in {@link UrlRule#hostname}.
	 * @param ctx the parse tree
	 */
	void exitIPv6Host(UrlRule.IPv6HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#v6host}.
	 * @param ctx the parse tree
	 */
	void enterV6host(UrlRule.V6hostContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#v6host}.
	 * @param ctx the parse tree
	 */
	void exitV6host(UrlRule.V6hostContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(UrlRule.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(UrlRule.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(UrlRule.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(UrlRule.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(UrlRule.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(UrlRule.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#login}.
	 * @param ctx the parse tree
	 */
	void enterLogin(UrlRule.LoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#login}.
	 * @param ctx the parse tree
	 */
	void exitLogin(UrlRule.LoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(UrlRule.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(UrlRule.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#frag}.
	 * @param ctx the parse tree
	 */
	void enterFrag(UrlRule.FragContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#frag}.
	 * @param ctx the parse tree
	 */
	void exitFrag(UrlRule.FragContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(UrlRule.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(UrlRule.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#search}.
	 * @param ctx the parse tree
	 */
	void enterSearch(UrlRule.SearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#search}.
	 * @param ctx the parse tree
	 */
	void exitSearch(UrlRule.SearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#searchparameter}.
	 * @param ctx the parse tree
	 */
	void enterSearchparameter(UrlRule.SearchparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#searchparameter}.
	 * @param ctx the parse tree
	 */
	void exitSearchparameter(UrlRule.SearchparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#string}.
	 * @param ctx the parse tree
	 */
	void enterString(UrlRule.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#string}.
	 * @param ctx the parse tree
	 */
	void exitString(UrlRule.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link UrlRule#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(UrlRule.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link UrlRule#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(UrlRule.HexContext ctx);
}