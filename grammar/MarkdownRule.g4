parser grammar MarkdownRule;

import InlineRule, BlockRule;


options {
    tokenVocab = MarkdownLexer;
}

start: markdown* EOF;

markdown: inline | block;
