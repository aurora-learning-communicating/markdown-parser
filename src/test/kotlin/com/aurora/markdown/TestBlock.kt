package com.aurora.markdown

import kotlin.test.Test
import com.aurora.markdown.core.MarkdownElement
import com.aurora.markdown.grammar.MarkdownLexer
import com.aurora.markdown.grammar.MarkdownRule
import com.aurora.markdown.parse.MarkdownRuleParser

import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import java.io.File
import java.io.FileInputStream

class TestBlock {
    @Test
    fun testBlockCode() {
        val input = CharStreams.fromStream(FileInputStream(File("src/test/resources/test.md")))

        val root = visit(input) {
            this.start()
        }

        println(root::class)
        println(root.toHTML())
    }

    @Test
    fun testParagraph() {
        val strings = arrayOf(
            "hello world **fuck you** ~~fuck you~~\nholy shit",
            "hello world **fuck you** ~~fuck you~~\n holy shit",
            "hello world **fuck you** ~~fuck you~~\nhello world **fuck you** ~~fuck you~~",
        )

        strings.forEach { string ->
            val input = CharStreams.fromString(string)

            val root = visit(input) {
                this.start()
            }

            println(root::class)
            println(root.toHTML())
        }
    }

    @Test
    fun testList() {
        val input = CharStreams.fromFileName("src/test/resources/test.md")
        val root = visit(input) {
            this.start()
        }

        println(root.toHTML())
    }


    @Test
    fun testStrikeThrough() {
        val string = "~~fuck you~~"
        val input = CharStreams.fromString(string)

        val emphasis = visit(input) {
            this.strikeThrough()
        }

        println(emphasis.toHTML())
    }

    private fun visit(charStream: CharStream, block: MarkdownRule.() -> ParserRuleContext): MarkdownElement {
        val lexer = MarkdownLexer(charStream)
        val tokens = CommonTokenStream(lexer)
        val parser = MarkdownRule(tokens)

        val tree = parser.block()
        val visitor = MarkdownRuleParser()
        return visitor.visit(tree)
    }
}