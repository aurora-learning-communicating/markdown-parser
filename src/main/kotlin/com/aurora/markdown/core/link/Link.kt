package com.steiner.aurora.com.aurora.markdown.core.link

import com.steiner.aurora.com.aurora.markdown.core.MarkdownElement
import java.net.URL

abstract class Link(
    open val altText: String,
    open val url: URL
): MarkdownElement.InlineElement(null)