// Generated from MarkdownRule.g4 by ANTLR 4.13.2
package com.aurora.markdown.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MarkdownRuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MarkdownRuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MarkdownRuleParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#inline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline(MarkdownRuleParser.InlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#indent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndent(MarkdownRuleParser.IndentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#plainText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainText(MarkdownRuleParser.PlainTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#inlineCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineCode(MarkdownRuleParser.InlineCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#emphasis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmphasis(MarkdownRuleParser.EmphasisContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#boldTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldTag(MarkdownRuleParser.BoldTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#boldElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldElement(MarkdownRuleParser.BoldElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boldSingle}
	 * labeled alternative in {@link MarkdownRuleParser#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldSingle(MarkdownRuleParser.BoldSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boldMulti}
	 * labeled alternative in {@link MarkdownRuleParser#bold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoldMulti(MarkdownRuleParser.BoldMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#italicTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicTag(MarkdownRuleParser.ItalicTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#italicElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicElement(MarkdownRuleParser.ItalicElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code italicSingle}
	 * labeled alternative in {@link MarkdownRuleParser#italic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicSingle(MarkdownRuleParser.ItalicSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code italicMutli}
	 * labeled alternative in {@link MarkdownRuleParser#italic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItalicMutli(MarkdownRuleParser.ItalicMutliContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#strikeThroughTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrikeThroughTag(MarkdownRuleParser.StrikeThroughTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#strikeThroughElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrikeThroughElement(MarkdownRuleParser.StrikeThroughElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strikeThroughSingle}
	 * labeled alternative in {@link MarkdownRuleParser#strikeThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrikeThroughSingle(MarkdownRuleParser.StrikeThroughSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strikeThroughMulti}
	 * labeled alternative in {@link MarkdownRuleParser#strikeThrough}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrikeThroughMulti(MarkdownRuleParser.StrikeThroughMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#underlineTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderlineTag(MarkdownRuleParser.UnderlineTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link MarkdownRuleParser#underlineElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderlineElement(MarkdownRuleParser.UnderlineElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code underlineSingle}
	 * labeled alternative in {@link MarkdownRuleParser#underline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderlineSingle(MarkdownRuleParser.UnderlineSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code underlineMutli}
	 * labeled alternative in {@link MarkdownRuleParser#underline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderlineMutli(MarkdownRuleParser.UnderlineMutliContext ctx);
}