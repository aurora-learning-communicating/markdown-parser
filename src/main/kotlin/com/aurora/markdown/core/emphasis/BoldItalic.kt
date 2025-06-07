package com.aurora.markdown.core.emphasis

import com.aurora.markdown.core.MarkdownElement
import com.aurora.markdown.core.plaintext.PlainText
import kotlin.reflect.KClass

class BoldItalic: Emphasis() {
    override val appendable: List<KClass<out MarkdownElement>>
        get() = listOf(PlainText::class)

    override fun toHTML(): String {
        val nested = this.content!!.joinToString(" ") {
            it.toHTML()
        }

        return "<strong><em>$nested</em></strong>"
    }
}