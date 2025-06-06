package com.steiner.aurora.com.aurora.markdown.core.code

import com.steiner.aurora.com.aurora.markdown.core.MarkdownElement
import com.steiner.aurora.com.aurora.markdown.core.plaintext.PlainText
import kotlin.reflect.KClass

class BlockCode(
    val mode: LanguageMode,
    val plainText: PlainText
): MarkdownElement.BlockElement(null) {
    override val appendable: List<KClass<out MarkdownElement>>
        get() = emptyList()

    override fun toHTML(): String {
        return """
            <pre><code class="language-${mode.language}">${plainText.toHTML()}</code></pre>
        """.trimIndent()
    }
}