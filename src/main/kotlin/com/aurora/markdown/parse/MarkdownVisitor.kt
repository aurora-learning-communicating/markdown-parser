package com.aurora.markdown.parse

import com.aurora.markdown.core.MarkdownElement
import com.aurora.markdown.core.code.InlineCode
import com.aurora.markdown.core.emphasis.Bold
import com.aurora.markdown.core.emphasis.Italic
import com.aurora.markdown.core.emphasis.StrikeThrough
import com.aurora.markdown.core.emphasis.Underline
import com.aurora.markdown.core.plaintext.PlainText
import com.aurora.markdown.grammar.MarkdownRuleBaseVisitor
import com.aurora.markdown.grammar.MarkdownRuleParser


class MarkdownVisitor : MarkdownRuleBaseVisitor<MarkdownElement>() {
    override fun visitStart(ctx: MarkdownRuleParser.StartContext): MarkdownElement {
        return visitInline(ctx.inline())
    }

    override fun visitPlainText(ctx: MarkdownRuleParser.PlainTextContext): PlainText {
        val text = ctx.text
        return PlainText(text)
    }

    override fun visitInlineCode(ctx: MarkdownRuleParser.InlineCodeContext): InlineCode {
        val text = visitPlainText(ctx.plainText())
        return InlineCode(text)
    }

    override fun visitBoldSingle(ctx: MarkdownRuleParser.BoldSingleContext): Bold {
        val element = visitBoldElement(ctx.boldElement())
        return Bold().apply {
            append(element)
        }
    }

    override fun visitBoldMulti(ctx: MarkdownRuleParser.BoldMultiContext): Bold {
        val elements = ctx.boldElement()
        return Bold().apply {
            elements.forEach {
                append(visitBoldElement(it))
            }
        }
    }

    override fun visitItalicSingle(ctx: MarkdownRuleParser.ItalicSingleContext): Italic {
        val element = visitItalicElement(ctx.italicElement())
        return Italic().apply {
            append(element)
        }
    }

    override fun visitItalicMutli(ctx: MarkdownRuleParser.ItalicMutliContext): Italic {
        val elements = ctx.italicElement()
        return Italic().apply {
            elements.forEach {
                append(visitItalicElement(it))
            }
        }
    }

    override fun visitStrikeThroughSingle(ctx: MarkdownRuleParser.StrikeThroughSingleContext): StrikeThrough {
        val element = visitStrikeThroughElement(ctx.strikeThroughElement())
        return StrikeThrough().apply {
            append(element)
        }
    }

    override fun visitStrikeThroughMulti(ctx: MarkdownRuleParser.StrikeThroughMultiContext): StrikeThrough {
        val elements = ctx.strikeThroughElement()
        return StrikeThrough().apply {
            elements.forEach {
                append(visitStrikeThroughElement(it))
            }
        }
    }

    override fun visitUnderlineSingle(ctx: MarkdownRuleParser.UnderlineSingleContext): Underline {
        val element = visitUnderlineElement(ctx.underlineElement())

        return Underline().apply {
            append(element)
        }
    }

    override fun visitUnderlineMutli(ctx: MarkdownRuleParser.UnderlineMutliContext): Underline {
        val elements = ctx.underlineElement()
        return Underline().apply {
            elements.forEach {
                append(visitUnderlineElement(it))
            }
        }
    }
}