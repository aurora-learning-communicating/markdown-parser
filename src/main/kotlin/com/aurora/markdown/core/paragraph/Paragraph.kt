package com.steiner.aurora.com.aurora.markdown.core.paragraph

import com.steiner.aurora.com.aurora.markdown.core.MarkdownElement
import kotlin.reflect.KClass

class Paragraph: MarkdownElement.BlockElement(arrayListOf()) {
    override val appendable: List<KClass<out MarkdownElement>>
        get() = listOf(InlineElement::class)

    override fun toHTML(): String {
        val nested = this.content!!.joinToString(" ") {
            it.toHTML()
        }

        return "<p>$nested</p>"
    }
}