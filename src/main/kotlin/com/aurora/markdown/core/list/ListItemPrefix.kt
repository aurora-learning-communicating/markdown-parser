package com.aurora.markdown.core.list

sealed class ListItemPrefix(val isOrdered: Boolean) {
    object Unordered: ListItemPrefix(false)

    class Ordered(val number: UInt): ListItemPrefix(true)
}