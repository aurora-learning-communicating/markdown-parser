package com.aurora.markdown.core

import kotlin.reflect.KClass

sealed class MarkdownElement(open val content: ArrayList<MarkdownElement>?) {
    abstract fun toHTML(): String
    abstract val appendable: List<KClass<out MarkdownElement>>

    abstract class InlineElement(override val content: ArrayList<MarkdownElement>?): MarkdownElement(content)
    abstract class BlockElement(override val content: ArrayList<MarkdownElement>?): MarkdownElement(content)

    fun append(element: MarkdownElement) {
        if (this.content == null) {
            return
        }

        val elementClass = element::class
        val elementJavaClass = elementClass.java
        val contains = elementClass in appendable
        val exist = this.appendable.any { base ->
            base.java.isAssignableFrom(elementJavaClass)
        }

        if (contains || exist) {
            this.content!!.add(element)
        }
    }

    fun append(block: () -> MarkdownElement) {
        this.append(block())
    }
}