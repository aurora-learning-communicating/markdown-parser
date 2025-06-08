package com.aurora.markdown

import com.aurora.markdown.core.MarkdownElement
import com.aurora.markdown.grammar.MarkdownLexer
import com.aurora.markdown.grammar.MarkdownRuleParser
import com.aurora.markdown.parse.MarkdownVisitor

import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.Test
import java.io.File
import java.io.FileInputStream

class TestInline {
    @Test
    fun testBold() {
        val file = File("src/test/resources/test.md")

        val input = CharStreams.fromStream(FileInputStream(file))
        val markdown = visitMarkdownElement(input)
        println(markdown::class)
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

        val tree = parser.start()
        val visitor = MarkdownVisitor()
        return visitor.visit(tree)
    }
}