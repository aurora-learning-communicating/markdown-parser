package com.steiner.aurora.com.aurora.markdown.core.code

import com.steiner.aurora.com.aurora.markdown.core.MarkdownElement
import com.steiner.aurora.com.aurora.markdown.core.plaintext.PlainText
import kotlin.reflect.KClass

class InlineCode(val plainText: PlainText): MarkdownElement.InlineElement(null) {
    override val appendable: List<KClass<out MarkdownElement>>
        get() = emptyList()

    override fun toHTML(): String {
        return "<code>${plainText.toHTML()}</code>"
    }
}