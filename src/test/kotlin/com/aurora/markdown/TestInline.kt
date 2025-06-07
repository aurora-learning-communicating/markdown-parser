package com.aurora.markdown

import com.aurora.markdown.core.MarkdownElement
import com.aurora.markdown.core.emphasis.Bold
import com.aurora.markdown.grammar.MarkdownLexer
import com.aurora.markdown.grammar.MarkdownRuleParser
import com.aurora.markdown.parse.MarkdownVisitor

import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.Test
import java.io.File


class TestInline {
    @Test
    fun testBold() {
        val input = CharStreams.fromString("__hello__")
        val markdown = visitMarkdownElement(input)

        println(markdown.toHTML())
    }

    @Test
    fun testFileExist() {
        val file = File("src/test/resources/test.md")
        println(file.exists())
    }

    private fun visitMarkdownElement(charStream: CharStream): MarkdownElement {
        val lexer = MarkdownLexer(charStream)
        val tokens = CommonTokenStream(lexer)
        val parser = MarkdownRuleParser(tokens)

        val tree = parser.inline()
        val visitor = MarkdownVisitor()
        return visitor.visit(tree)
    }
}