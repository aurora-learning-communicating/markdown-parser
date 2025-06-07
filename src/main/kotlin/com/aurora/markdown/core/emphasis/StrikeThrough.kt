package com.aurora.markdown.core.emphasis

import com.aurora.markdown.core.MarkdownElement
import com.aurora.markdown.core.code.InlineCode
import com.aurora.markdown.core.link.UrlLink
import kotlin.reflect.KClass

class StrikeThrough: Emphasis() {
    override fun toHTML(): String {
        val nested = this.content!!.joinToString(" ") {
            it.toHTML()
        }

        return "<del>$nested</del>"
    }

    override val appendable: List<KClass<out MarkdownElement>>
        get() = listOf(
            Italic::class,
            Bold::class,
            UrlLink::class,
            InlineCode::class
        )
}