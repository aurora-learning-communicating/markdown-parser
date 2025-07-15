package com.aurora.markdown.core.list

import com.aurora.markdown.core.MarkdownElement
import kotlin.reflect.KClass

class ListItem(val marker: ListItemMarker): MarkdownElement.BlockElement(arrayListOf()) {
    override fun toHTML(): String {
        return buildString {
            append("<li>")
            appendLine()
            appendLine(marker.toHTML())

            appendLine(this@ListItem.content!!.joinToString("\n") {
                it.toHTML()
            })

            append("</li>")
        }
    }

    override val appendable: List<KClass<out MarkdownElement>>
        get() = listOf(ListItemContent::class);

    val isOrdered: Boolean get() = marker.isOrdered
}