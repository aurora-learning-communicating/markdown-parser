package com.aurora.markdown.core.link

import com.aurora.markdown.core.MarkdownElement
import java.net.URL
import kotlin.reflect.KClass

class UrlLink(override val altText: String = "alt text", override val url: URL): Link(altText, url) {
    override val appendable: List<KClass<out MarkdownElement>>
        get() = emptyList()

    override fun toHTML(): String {
        return """
            <a href="${url.toString()}" alt="$altText"/>
        """.trimIndent()
    }

}