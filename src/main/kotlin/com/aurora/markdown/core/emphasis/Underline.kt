package com.aurora.markdown.core.emphasis

import com.aurora.markdown.core.MarkdownElement
import com.aurora.markdown.core.code.InlineCode
import com.aurora.markdown.core.link.UrlLink
import com.aurora.markdown.core.plaintext.PlainText
import kotlin.reflect.KClass

class Underline: Emphasis() {
    override val appendable: List<KClass<out MarkdownElement>>
        get() = listOf(
            PlainText::class,
            Bold::class,
            Italic::class,
            InlineCode::class,
            UrlLink::class
        )


    override fun toHTML(): String {
        val nested = this.content!!.joinToString(" ") {
            it.toHTML()
        }

        return "<u>$nested</u>"
    }
}