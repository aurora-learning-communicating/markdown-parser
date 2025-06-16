package com.aurora.markdown.core.paragraph

import com.aurora.markdown.core.MarkdownElement
import kotlin.reflect.KClass

class Paragraph: MarkdownElement.BlockElement(arrayListOf()) {
    override val appendable: List<KClass<out MarkdownElement>>
        get() = listOf(InlineElement::class)

    override fun toHTML(): String {
        val nested = this.content!!.joinToString("") {
            it.toHTML()
        }

        return "<p>$nested</p>"
    }

    fun concat(paragraph: Paragraph) {
        paragraph.content!!.forEach {
            this.content!!.add(it)
        }
    }

    fun concat(block: () -> Paragraph) {
        concat(block())
    }
}