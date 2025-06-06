package com.steiner.aurora.com.aurora.markdown.core.emphasis

import com.steiner.aurora.com.aurora.markdown.core.MarkdownElement
import com.steiner.aurora.com.aurora.markdown.core.code.InlineCode
import com.steiner.aurora.com.aurora.markdown.core.link.UrlLink
import com.steiner.aurora.com.aurora.markdown.core.plaintext.PlainText
import kotlin.reflect.KClass

class Italic: Emphasis() {
    override val appendable: List<KClass<out MarkdownElement>>
        get() = listOf(
            Bold::class,
            UrlLink::class,
            InlineCode::class,
            StrikeThrough::class,
            PlainText::class)

    override fun toHTML(): String {
        val nested =  this.content!!.joinToString(" ") {
            it.toHTML()
        }

        return "<em>$nested</em>"
    }
}