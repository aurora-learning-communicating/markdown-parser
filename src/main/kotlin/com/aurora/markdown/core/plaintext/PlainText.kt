package com.steiner.aurora.com.aurora.markdown.core.plaintext

import com.steiner.aurora.com.aurora.markdown.core.MarkdownElement
import kotlin.reflect.KClass

class PlainText(val text: String): MarkdownElement.InlineElement(null) {
    override fun toHTML(): String {
        return text
    }

    override val appendable: List<KClass<out MarkdownElement>>
        get() = emptyList()
}