package com.aurora.markdown.parse

import com.aurora.markdown.grammar.MarkdownRule
import com.aurora.markdown.grammar.MarkdownRuleBaseVisitor
import com.aurora.markdown.core.MarkdownElement
import com.aurora.markdown.core.code.BlockCode
import com.aurora.markdown.core.code.InlineCode
import com.aurora.markdown.core.code.LanguageMode
import com.aurora.markdown.core.emphasis.Bold
import com.aurora.markdown.core.emphasis.Italic
import com.aurora.markdown.core.emphasis.StrikeThrough
import com.aurora.markdown.core.link.UrlLink
import com.aurora.markdown.core.plaintext.PlainText
import java.net.URL

class MarkdownRuleParser: MarkdownRuleBaseVisitor<MarkdownElement>() {

    override fun visitStart(ctx: MarkdownRule.StartContext): MarkdownElement.RootElement {
        return MarkdownElement.RootElement().apply {
            ctx.markdown().map {
                visit(it)
            }.forEach {
                append(it)
            }
        }
    }

    override fun visitPlainText(ctx: MarkdownRule.PlainTextContext): PlainText {
        val text = ctx.text
        return PlainText(text)
    }

    override fun visitInlineCode(ctx: MarkdownRule.InlineCodeContext): InlineCode {
        val code = ctx.content.text
        return InlineCode(code)
    }

    override fun visitBoldSingle(ctx: MarkdownRule.BoldSingleContext): Bold {
        val element = visitBoldElement(ctx.boldElement())
        return Bold().apply {
            append(element)
        }
    }

    override fun visitBoldMulti(ctx: MarkdownRule.BoldMultiContext): Bold {
        val elements = ctx.boldElement()
        return Bold().apply {
            elements.forEach {
                append(visitBoldElement(it))
            }
        }
    }

    override fun visitItalicSingle(ctx: MarkdownRule.ItalicSingleContext): Italic {
        val element = visitItalicElement(ctx.italicElement())
        return Italic().apply {
            append(element)
        }
    }

    override fun visitItalicMutli(ctx: MarkdownRule.ItalicMutliContext): Italic {
        val elements = ctx.italicElement()
        return Italic().apply {
            elements.forEach {
                append(visitItalicElement(it))
            }
        }
    }

    override fun visitStrikeThroughSingle(ctx: MarkdownRule.StrikeThroughSingleContext): StrikeThrough {
        val element = visitStrikeThroughElement(ctx.strikeThroughElement())
        return StrikeThrough().apply {
            append(element)
        }
    }

    override fun visitStrikeThroughMulti(ctx: MarkdownRule.StrikeThroughMultiContext): StrikeThrough {
        val elements = ctx.strikeThroughElement()
        return StrikeThrough().apply {
            elements.forEach {
                append(visitStrikeThroughElement(it))
            }
        }
    }

    override fun visitUrlLink(ctx: MarkdownRule.UrlLinkContext): UrlLink {
        val text = ctx.url().text
        val altText = ctx.altText().text
        val url = URL(text)

        return UrlLink(altText, url)
    }

    // visit Block Code
    override fun visitBlockCodeEmptyCase1(ctx: MarkdownRule.BlockCodeEmptyCase1Context): BlockCode {
        return visit(ctx.blockCodeLanguage()) as BlockCode
    }

    override fun visitBlockCodeEmptyCase2(ctx: MarkdownRule.BlockCodeEmptyCase2Context): BlockCode {
        val blockCode = visit(ctx.blockCodeLanguage()) as BlockCode
        val empty = ctx.empty.text
        blockCode.text = empty

        return blockCode
    }

    override fun visitBlockCodeNotEmpty(ctx: MarkdownRule.BlockCodeNotEmptyContext): BlockCode {
        val blockCode = visit(ctx.blockCodeLanguage()) as BlockCode
        blockCode.text = ctx.blockCodeContent().text

        return blockCode
    }

    override fun visitBlockCodeWithLanguage(ctx: MarkdownRule.BlockCodeWithLanguageContext): BlockCode {
        val languageText = ctx.LanguageMode().text
        val language = LanguageMode(languageText)
        return BlockCode(mode = language, text = "")
    }

    override fun visitBlockCodeWithoutLanguage(ctx: MarkdownRule.BlockCodeWithoutLanguageContext): BlockCode {
        return BlockCode(mode = null, text = "")
    }
}

