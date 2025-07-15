package com.aurora.markdown.core.code

import com.aurora.markdown.core.MarkdownElement
import kotlin.reflect.KClass

class BlockCode(val mode: LanguageMode?, val text: String): MarkdownElement.BlockElement(null) {
    override val appendable: List<KClass<out MarkdownElement>>
        get() = emptyList()

    override fun toHTML(): String {
        return buildString {
            if (mode == null) {
                append("<pre><code>\n")
            } else {
                append("<pre><code class=\"language-${mode.language}\">\n")
            }

            append(text)
            append("</code></pre>")
        }
    }
}