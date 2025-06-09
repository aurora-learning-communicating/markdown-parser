package com.aurora.markdown.parse

import com.aurora.markdown.core.MarkdownElement
import com.aurora.markdown.core.code.InlineCode
import com.aurora.markdown.core.emphasis.Bold
import com.aurora.markdown.core.emphasis.Italic
import com.aurora.markdown.core.emphasis.StrikeThrough
import com.aurora.markdown.core.link.UrlLink
import com.aurora.markdown.core.plaintext.PlainText
import com.aurora.markdown.grammar.InlineRule
import com.aurora.markdown.grammar.InlineRuleBaseVisitor
import java.net.URL

class InlineRuleParser: InlineRuleBaseVisitor<MarkdownElement>() {
    override fun visitPlainText(ctx: InlineRule.PlainTextContext): PlainText {
        val text = ctx.text
        return PlainText(text)
    }

    override fun visitInlineCode(ctx: InlineRule.InlineCodeContext): InlineCode {
        val text = visitPlainText(ctx.plainText())
        return InlineCode(text)
    }

    override fun visitBoldSingle(ctx: InlineRule.BoldSingleContext): Bold {
        val element = visitBoldElement(ctx.boldElement())
        return Bold().apply {
            append(element)
        }
    }

    override fun visitBoldMulti(ctx: InlineRule.BoldMultiContext): Bold {
        val elements = ctx.boldElement()
        return Bold().apply {
            elements.forEach {
                append(visitBoldElement(it))
            }
        }
    }

    override fun visitItalicSingle(ctx: InlineRule.ItalicSingleContext): Italic {
        val element = visitItalicElement(ctx.italicElement())
        return Italic().apply {
            append(element)
        }
    }

    override fun visitItalicMutli(ctx: InlineRule.ItalicMutliContext): Italic {
        val elements = ctx.italicElement()
        return Italic().apply {
            elements.forEach {
                append(visitItalicElement(it))
            }
        }
    }

    override fun visitStrikeThroughSingle(ctx: InlineRule.StrikeThroughSingleContext): StrikeThrough {
        val element = visitStrikeThroughElement(ctx.strikeThroughElement())
        return StrikeThrough().apply {
            append(element)
        }
    }

    override fun visitStrikeThroughMulti(ctx: InlineRule.StrikeThroughMultiContext): StrikeThrough {
        val elements = ctx.strikeThroughElement()
        return StrikeThrough().apply {
            elements.forEach {
                append(visitStrikeThroughElement(it))
            }
        }
    }

    override fun visitUrlLink(ctx: InlineRule.UrlLinkContext): UrlLink {
        val text = ctx.url().text
        val altText = ctx.altText().text
        val url = URL(text)

        return UrlLink(altText, url)
    }
}