package com.aurora.markdown.core.list

import com.aurora.markdown.core.Divider
import com.aurora.markdown.core.MarkdownElement
import kotlin.reflect.KClass

class ListItemMarker(val prefix: ListItemPrefix): MarkdownElement.BlockElement(arrayListOf()) {
    override fun toHTML(): String {
        return this.content!!.joinToString("") {
            it.toHTML()
        }
    }

    override val appendable: List<KClass<out MarkdownElement>>
        get() = listOf(InlineElement::class, Divider::class)

    val isOrdered: Boolean get() = prefix.isOrdered
}