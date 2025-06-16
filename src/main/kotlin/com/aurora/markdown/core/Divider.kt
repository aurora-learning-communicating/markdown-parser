package com.aurora.markdown.core

import kotlin.reflect.KClass

sealed class Divider: MarkdownElement.InlineElement(null) {
    override val appendable: List<KClass<out MarkdownElement>>
        get() = emptyList()

    object Newline: Divider() {
        override fun toHTML(): String {
            return "<br/>"
        }
    }

    object Space: Divider() {
        override fun toHTML(): String {
            return " "
        }
    }

    object Ignore: Divider() {
        override fun toHTML(): String {
            return ""
        }
    }
}