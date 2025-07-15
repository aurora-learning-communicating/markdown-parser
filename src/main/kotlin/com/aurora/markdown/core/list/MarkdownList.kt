package com.aurora.markdown.core.list

import com.aurora.markdown.core.MarkdownElement
import kotlin.reflect.KClass

sealed class MarkdownList: MarkdownElement.BlockElement(arrayListOf()) {
    abstract val tag: String

    override fun toHTML(): String {
        return buildString {
            append("<$tag>")
            appendLine()

            append(this@MarkdownList.content!!.joinToString("\n") {
                it.toHTML()
            })

            appendLine()

            appendLine("</$tag>")
        }
    }

    override val appendable: List<KClass<out MarkdownElement>>
        get() = listOf(ListItem::class)

    class OrderedList: MarkdownList() {
        override val tag: String
            get() = "ol"
    }

    class UnOrderedList: MarkdownList() {
        override val tag: String
            get() = "ul"
    }
}