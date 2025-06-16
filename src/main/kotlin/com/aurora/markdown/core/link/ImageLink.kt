package com.aurora.markdown.core.link

import com.aurora.markdown.core.MarkdownElement
import java.net.URL
import kotlin.reflect.KClass

class ImageLink(override val altText: String = "alt text", override val url: URL)
    : Link(altText, url) {

    constructor(urlLink: UrlLink): this(urlLink.altText, urlLink.url)

    override fun toHTML(): String {
        return "<img src=\"${url.toString()}\" alt=\"$altText\"/>"
    }

    override val appendable: List<KClass<out MarkdownElement>>
        get() = emptyList()
}