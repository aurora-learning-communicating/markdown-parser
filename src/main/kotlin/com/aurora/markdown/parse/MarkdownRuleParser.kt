package com.aurora.markdown.parse

import com.aurora.markdown.core.Divider
import com.aurora.markdown.grammar.MarkdownRule
import com.aurora.markdown.grammar.MarkdownRuleBaseVisitor
import com.aurora.markdown.core.MarkdownElement
import com.aurora.markdown.core.code.BlockCode
import com.aurora.markdown.core.code.InlineCode
import com.aurora.markdown.core.code.LanguageMode
import com.aurora.markdown.core.emphasis.Bold
import com.aurora.markdown.core.emphasis.Italic
import com.aurora.markdown.core.emphasis.StrikeThrough
import com.aurora.markdown.core.link.ImageLink
import com.aurora.markdown.core.link.UrlLink
import com.aurora.markdown.core.list.ListItem
import com.aurora.markdown.core.list.ListItemContent
import com.aurora.markdown.core.list.ListItemMarker
import com.aurora.markdown.core.list.ListItemPrefix
import com.aurora.markdown.core.list.MarkdownList
import com.aurora.markdown.core.paragraph.Paragraph
import com.aurora.markdown.core.plaintext.PlainText
import java.net.URL

class MarkdownRuleParser: MarkdownRuleBaseVisitor<MarkdownElement>() {

    override fun visitStart(ctx: MarkdownRule.StartContext): MarkdownElement.RootElement {
        return MarkdownElement.RootElement().apply {
            ctx.block().map {
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

    override fun visitInlineCodeEmpty(ctx: MarkdownRule.InlineCodeEmptyContext): InlineCode {
        return InlineCode("")
    }

    override fun visitInlineCodeCommon(ctx: MarkdownRule.InlineCodeCommonContext): InlineCode {
        return InlineCode(ctx.inlineCodeContent().text)
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

    override fun visitImageLink(ctx: MarkdownRule.ImageLinkContext): ImageLink {
        val urlLink = visit(ctx.urlLink()) as UrlLink
        return ImageLink(urlLink)
    }

    // visit Block Code
    override fun visitBlockCodeEmpty(ctx: MarkdownRule.BlockCodeEmptyContext): BlockCode {
        val codeStart = ctx.blockCodeStart()
        val language = codeStart.blockCodeLanguage()?.text
        return if (language == null) {
            BlockCode(null, "")
        } else {
            BlockCode(LanguageMode(language), "")
        }
    }

    override fun visitBlockCodeCommon(ctx: MarkdownRule.BlockCodeCommonContext): BlockCode {
        val codeStart = ctx.blockCodeStart()
        val language = codeStart.blockCodeLanguage()?.text
        val content = ctx.blockCodeContent().text
        return if (language == null) {
            BlockCode(null, content)
        } else {
            BlockCode(LanguageMode(language), content)
        }
    }

    override fun visitParagraphIndent(ctx: MarkdownRule.ParagraphIndentContext): Divider.Space {
        return Divider.Space
    }

    override fun visitParagraphSingleLine(ctx: MarkdownRule.ParagraphSingleLineContext): Paragraph {
        return Paragraph().apply {
            append {
                visit(ctx.paragraphElement(0))
            }

            ctx.paragraphElement().drop(1).forEach {
                append(Divider.Space)
                append {
                    visit(it)
                }
            }
        }
    }

    override fun visitParagraphMultiLine(ctx: MarkdownRule.ParagraphMultiLineContext): Paragraph {
        return Paragraph().apply {
            concat {
                visit(ctx.paragraph(0)) as Paragraph
            }

            ctx.softLineBreak().zip(ctx.paragraph().drop(1)).forEach { (ctxSoftLineBreak, ctxParagraph) ->
                append {
                    visit(ctxSoftLineBreak)
                }

                concat {
                    visit(ctxParagraph) as Paragraph
                }
            }
        }
    }

    override fun visitParagraphWithIndent(ctx: MarkdownRule.ParagraphWithIndentContext): Paragraph {
        return visit(ctx.paragraph()) as Paragraph
    }

    // TODO list with indent
    // visit ordered list item marker
    override fun visitOrderedListItemMarkerSingleElement(ctx: MarkdownRule.OrderedListItemMarkerSingleElementContext): ListItemMarker {
        val number = ctx.orderedListItemPrefix().prefix.text.toUInt()
        val prefix = ListItemPrefix.Ordered(number)

        return ListItemMarker(prefix).apply {
            append {
                visit(ctx.inline())
            }
        }
    }

    override fun visitOrderedListItemMarkerMultiElement(ctx: MarkdownRule.OrderedListItemMarkerMultiElementContext): ListItemMarker {
        val number = ctx.orderedListItemPrefix().prefix.text.toUInt()
        val prefix = ListItemPrefix.Ordered(number)

        return ListItemMarker(prefix).apply {
            append {
                visit(ctx.inline(0))
            }

            ctx.paragraphIndent().zip(ctx.inline().drop(1)).forEach { (paragraphIndent, inline) ->
                append {
                    visit(paragraphIndent)
                }

                append {
                    visit(inline)
                }
            }
        }
    }

    // TODO visit unorder list item marker
    override fun visitUnOrderedListItemMarkerSingleElement(ctx: MarkdownRule.UnOrderedListItemMarkerSingleElementContext): ListItemMarker {
        return ListItemMarker(ListItemPrefix.Unordered).apply {
            append {
                visit(ctx.inline())
            }
        }
    }

    override fun visitUnOrderedListItemMarkerMultiElement(ctx: MarkdownRule.UnOrderedListItemMarkerMultiElementContext): ListItemMarker {
        return ListItemMarker(ListItemPrefix.Unordered).apply {
            append {
                visit(ctx.inline(0))
            }

            ctx.paragraphIndent().zip(ctx.inline().drop(1)).forEach { (paragraphIndent, inline) ->
                append {
                    visit(paragraphIndent)
                }

                append {
                    visit(inline)
                }
            }
        }
    }

    // visit list content
    override fun visitListItemContentListItem(ctx: MarkdownRule.ListItemContentListItemContext): ListItemContent {
        return ListItemContent().apply {
            val items = ctx.listItem().map {
                visit(it) as ListItem
            }

            groupListItems(items).forEach {
                append(it)
            }
        }
    }

    override fun visitListItemContentInlineElements(ctx: MarkdownRule.ListItemContentInlineElementsContext): ListItemContent {
        return ListItemContent().apply {
            ctx.listItemContentIndent().zip(ctx.inline()).forEach { (indent, inline) ->
                append {
                    visit(indent)
                }

                append {
                    visit(inline)
                }
            }
        }
    }

    override fun visitListItemContentBlockCodeEmpty(ctx: MarkdownRule.ListItemContentBlockCodeEmptyContext): ListItemContent {
        return ListItemContent().apply {
            val language = ctx.blockCodeStart().blockCodeLanguage()?.text?.let {
                LanguageMode(it)
            }

            append {
                BlockCode(language, "")
            }
        }
    }

    override fun visitListItemContentBlockCodeCommon(ctx: MarkdownRule.ListItemContentBlockCodeCommonContext): ListItemContent {
        val language = ctx.blockCodeStart().blockCodeLanguage()?.text?.let {
            LanguageMode(it)
        }

        val codeContent = ctx.blockCodeContent().text

        val blockCode = BlockCode(language, codeContent)

        return ListItemContent().apply {
            append(blockCode)
        }
    }

    // visit list item
    override fun visitOrderedListItemOnlyMarker(ctx: MarkdownRule.OrderedListItemOnlyMarkerContext): ListItem {
        val marker = visit(ctx.orderedListItemMarker()) as ListItemMarker

        return ListItem(marker)
    }

    override fun visitOrderedListItemWithContent(ctx: MarkdownRule.OrderedListItemWithContentContext): ListItem {
        val marker = visit(ctx.orderedListItemMarker()) as ListItemMarker

        return ListItem(marker).apply {
            ctx.listItemContent().forEach {
                append {
                    visit(it)
                }
            }
        }
    }

    override fun visitUnOrderedListItemOnlyMarker(ctx: MarkdownRule.UnOrderedListItemOnlyMarkerContext): ListItem {
        val marker = visit(ctx.unOrderedListItemMarker()) as ListItemMarker

        return ListItem(marker)
    }

    override fun visitUnOrderedListItemWithContent(ctx: MarkdownRule.UnOrderedListItemWithContentContext): ListItem {
        val marker = visit(ctx.unOrderedListItemMarker()) as ListItemMarker

        return ListItem(marker).apply {
            ctx.listItemContent().forEach {
                append {
                    visit(it)
                }
            }
        }
    }

    override fun visitOrderedList(ctx: MarkdownRule.OrderedListContext): MarkdownList.OrderedList {
        return MarkdownList.OrderedList().apply {
            append {
                visit(ctx.orderedListItem().first())
            }

            ctx.softLineBreak().zip(ctx.orderedListItem().drop(1)).forEach { (ctxSoftLineBreak, ctxListItem) ->
                append {
                    visit(ctxSoftLineBreak)
                }

                append {
                    visit(ctxListItem)
                }
            }
        }
    }

    override fun visitUnOrderedList(ctx: MarkdownRule.UnOrderedListContext): MarkdownList.UnOrderedList {
        return MarkdownList.UnOrderedList().apply {
            append {
                visit(ctx.unOrderedListItem().first())
            }

            ctx.softLineBreak().zip(ctx.unOrderedListItem()).forEach { (ctxSoftLineBreak, ctxListItem) ->
                append {
                    visit(ctxSoftLineBreak)
                }

                append {
                    visit(ctxListItem)
                }
            }
        }
    }


    override fun visitLineBreakNewLine(ctx: MarkdownRule.LineBreakNewLineContext): Divider.Newline {
        return Divider.Newline
    }

    override fun visitLineBreakIgnore(ctx: MarkdownRule.LineBreakIgnoreContext): Divider.Ignore {
        return Divider.Ignore
    }

    private fun groupListItems(listItems: List<ListItem>): List<MarkdownList> {
        val lists = mutableListOf<MarkdownList>()
        val firstItem = listItems.first()
        val firstList = if (firstItem.isOrdered) {
            MarkdownList.OrderedList()
        } else {
            MarkdownList.UnOrderedList()
        }

        firstList.append(firstItem)

        lists.add(firstList)

        var prevItem = firstItem

        for (item in listItems.drop(1)) {
            if (prevItem.isOrdered != item.isOrdered) {
                val list = if (item.isOrdered) {
                    MarkdownList.OrderedList()
                } else {
                    MarkdownList.UnOrderedList()
                }

                list.append(item)
                lists.add(list)
                prevItem = item
            } else {
                lists.last().append(item)
                prevItem = item
            }
        }

        return lists
    }
}

