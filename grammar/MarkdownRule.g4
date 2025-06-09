parser grammar MarkdownRule;

import InlineRule;

options {
    tokenVocab = MarkdownLexer;
}

start: inline EOF;

