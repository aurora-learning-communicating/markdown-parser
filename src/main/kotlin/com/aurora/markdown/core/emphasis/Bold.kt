package com.aurora.markdown.core.emphasis

import com.aurora.markdown.core.MarkdownElement
import com.aurora.markdown.core.code.InlineCode
import com.aurora.markdown.core.link.UrlLink
import com.aurora.markdown.core.plaintext.PlainText
import kotlin.reflect.KClass

class Bold: Emphasis() {
    override fun toHTML(): String {
        val nested = this.content!!.joinToString(" ") {
            it.toHTML()
        }

        return "<strong>$nested</strong>"
    }

    override val appendable: List<KClass<out MarkdownElement>>
        get() = listOf(
            Italic::class,
            PlainText::class,
            InlineCode::class,
            UrlLink::class,
            StrikeThrough::class
        )
}