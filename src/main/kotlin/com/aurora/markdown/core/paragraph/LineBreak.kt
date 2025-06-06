package com.steiner.aurora.com.aurora.markdown.core.paragraph

import com.steiner.aurora.com.aurora.markdown.core.MarkdownElement
import kotlin.reflect.KClass

object LineBreak: MarkdownElement.InlineElement(null) {
    override val appendable: List<KClass<out MarkdownElement>>
        get() = emptyList()

    override fun toHTML(): String {
        return "<br/>"
    }
}