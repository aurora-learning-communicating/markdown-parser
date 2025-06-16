parser grammar MarkdownRule;

import BlockRule;


options {
    tokenVocab = MarkdownLexer;
}

start: block* EOF;
