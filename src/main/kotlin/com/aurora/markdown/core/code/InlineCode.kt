package com.aurora.markdown.core.code

import com.aurora.markdown.core.MarkdownElement
import kotlin.reflect.KClass

class InlineCode(val code: String): MarkdownElement.InlineElement(null) {
    override val appendable: List<KClass<out MarkdownElement>>
        get() = emptyList()

    override fun toHTML(): String {
        return "<code>$code<code>"
    }
}