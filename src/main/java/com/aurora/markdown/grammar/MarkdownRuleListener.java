// Generated from MarkdownRule.g4 by ANTLR 4.13.2
package com.aurora.markdown.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarkdownRuleParser}.
 */
public interface MarkdownRuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MarkdownRuleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MarkdownRuleParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#inline}.
	 * @param ctx the parse tree
	 */
	void enterInline(MarkdownRuleParser.InlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#inline}.
	 * @param ctx the parse tree
	 */
	void exitInline(MarkdownRuleParser.InlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#indent}.
	 * @param ctx the parse tree
	 */
	void enterIndent(MarkdownRuleParser.IndentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#indent}.
	 * @param ctx the parse tree
	 */
	void exitIndent(MarkdownRuleParser.IndentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#plainText}.
	 * @param ctx the parse tree
	 */
	void enterPlainText(MarkdownRuleParser.PlainTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#plainText}.
	 * @param ctx the parse tree
	 */
	void exitPlainText(MarkdownRuleParser.PlainTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#inlineCode}.
	 * @param ctx the parse tree
	 */
	void enterInlineCode(MarkdownRuleParser.InlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#inlineCode}.
	 * @param ctx the parse tree
	 */
	void exitInlineCode(MarkdownRuleParser.InlineCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void enterEmphasis(MarkdownRuleParser.EmphasisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#emphasis}.
	 * @param ctx the parse tree
	 */
	void exitEmphasis(MarkdownRuleParser.EmphasisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#boldTag}.
	 * @param ctx the parse tree
	 */
	void enterBoldTag(MarkdownRuleParser.BoldTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#boldTag}.
	 * @param ctx the parse tree
	 */
	void exitBoldTag(MarkdownRuleParser.BoldTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#boldElement}.
	 * @param ctx the parse tree
	 */
	void enterBoldElement(MarkdownRuleParser.BoldElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#boldElement}.
	 * @param ctx the parse tree
	 */
	void exitBoldElement(MarkdownRuleParser.BoldElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boldSingle}
	 * labeled alternative in {@link MarkdownRuleParser#bold}.
	 * @param ctx the parse tree
	 */
	void enterBoldSingle(MarkdownRuleParser.BoldSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boldSingle}
	 * labeled alternative in {@link MarkdownRuleParser#bold}.
	 * @param ctx the parse tree
	 */
	void exitBoldSingle(MarkdownRuleParser.BoldSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boldMulti}
	 * labeled alternative in {@link MarkdownRuleParser#bold}.
	 * @param ctx the parse tree
	 */
	void enterBoldMulti(MarkdownRuleParser.BoldMultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boldMulti}
	 * labeled alternative in {@link MarkdownRuleParser#bold}.
	 * @param ctx the parse tree
	 */
	void exitBoldMulti(MarkdownRuleParser.BoldMultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#italicTag}.
	 * @param ctx the parse tree
	 */
	void enterItalicTag(MarkdownRuleParser.ItalicTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#italicTag}.
	 * @param ctx the parse tree
	 */
	void exitItalicTag(MarkdownRuleParser.ItalicTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#italicElement}.
	 * @param ctx the parse tree
	 */
	void enterItalicElement(MarkdownRuleParser.ItalicElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#italicElement}.
	 * @param ctx the parse tree
	 */
	void exitItalicElement(MarkdownRuleParser.ItalicElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code italicSingle}
	 * labeled alternative in {@link MarkdownRuleParser#italic}.
	 * @param ctx the parse tree
	 */
	void enterItalicSingle(MarkdownRuleParser.ItalicSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code italicSingle}
	 * labeled alternative in {@link MarkdownRuleParser#italic}.
	 * @param ctx the parse tree
	 */
	void exitItalicSingle(MarkdownRuleParser.ItalicSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code italicMutli}
	 * labeled alternative in {@link MarkdownRuleParser#italic}.
	 * @param ctx the parse tree
	 */
	void enterItalicMutli(MarkdownRuleParser.ItalicMutliContext ctx);
	/**
	 * Exit a parse tree produced by the {@code italicMutli}
	 * labeled alternative in {@link MarkdownRuleParser#italic}.
	 * @param ctx the parse tree
	 */
	void exitItalicMutli(MarkdownRuleParser.ItalicMutliContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#strikeThroughTag}.
	 * @param ctx the parse tree
	 */
	void enterStrikeThroughTag(MarkdownRuleParser.StrikeThroughTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#strikeThroughTag}.
	 * @param ctx the parse tree
	 */
	void exitStrikeThroughTag(MarkdownRuleParser.StrikeThroughTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#strikeThroughElement}.
	 * @param ctx the parse tree
	 */
	void enterStrikeThroughElement(MarkdownRuleParser.StrikeThroughElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#strikeThroughElement}.
	 * @param ctx the parse tree
	 */
	void exitStrikeThroughElement(MarkdownRuleParser.StrikeThroughElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strikeThroughSingle}
	 * labeled alternative in {@link MarkdownRuleParser#strikeThrough}.
	 * @param ctx the parse tree
	 */
	void enterStrikeThroughSingle(MarkdownRuleParser.StrikeThroughSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strikeThroughSingle}
	 * labeled alternative in {@link MarkdownRuleParser#strikeThrough}.
	 * @param ctx the parse tree
	 */
	void exitStrikeThroughSingle(MarkdownRuleParser.StrikeThroughSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strikeThroughMulti}
	 * labeled alternative in {@link MarkdownRuleParser#strikeThrough}.
	 * @param ctx the parse tree
	 */
	void enterStrikeThroughMulti(MarkdownRuleParser.StrikeThroughMultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strikeThroughMulti}
	 * labeled alternative in {@link MarkdownRuleParser#strikeThrough}.
	 * @param ctx the parse tree
	 */
	void exitStrikeThroughMulti(MarkdownRuleParser.StrikeThroughMultiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#underlineTag}.
	 * @param ctx the parse tree
	 */
	void enterUnderlineTag(MarkdownRuleParser.UnderlineTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#underlineTag}.
	 * @param ctx the parse tree
	 */
	void exitUnderlineTag(MarkdownRuleParser.UnderlineTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownRuleParser#underlineElement}.
	 * @param ctx the parse tree
	 */
	void enterUnderlineElement(MarkdownRuleParser.UnderlineElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownRuleParser#underlineElement}.
	 * @param ctx the parse tree
	 */
	void exitUnderlineElement(MarkdownRuleParser.UnderlineElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code underlineSingle}
	 * labeled alternative in {@link MarkdownRuleParser#underline}.
	 * @param ctx the parse tree
	 */
	void enterUnderlineSingle(MarkdownRuleParser.UnderlineSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code underlineSingle}
	 * labeled alternative in {@link MarkdownRuleParser#underline}.
	 * @param ctx the parse tree
	 */
	void exitUnderlineSingle(MarkdownRuleParser.UnderlineSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code underlineMutli}
	 * labeled alternative in {@link MarkdownRuleParser#underline}.
	 * @param ctx the parse tree
	 */
	void enterUnderlineMutli(MarkdownRuleParser.UnderlineMutliContext ctx);
	/**
	 * Exit a parse tree produced by the {@code underlineMutli}
	 * labeled alternative in {@link MarkdownRuleParser#underline}.
	 * @param ctx the parse tree
	 */
	void exitUnderlineMutli(MarkdownRuleParser.UnderlineMutliContext ctx);
}