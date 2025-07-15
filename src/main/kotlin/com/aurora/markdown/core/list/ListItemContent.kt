package com.aurora.markdown.core.list

import com.aurora.markdown.core.MarkdownElement
import com.aurora.markdown.core.code.BlockCode
import kotlin.reflect.KClass

class ListItemContent: MarkdownElement.BlockElement(arrayListOf()) {
    override fun toHTML(): String {
        return this.content!!.joinToString("") {
            it.toHTML()
        }
    }

    override val appendable: List<KClass<out MarkdownElement>>
        get() = listOf(MarkdownList::class, InlineElement::class, BlockCode::class)
}