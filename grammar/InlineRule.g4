parser grammar InlineRule;

options {
    tokenVocab = MarkdownLexer;
}

import UrlRule;

inline: plainText | inlineCode | emphasis | urlLink;

// indent: Space{2,} | Tab;
indent: Space+ | Tab;

plainText: (Letter | Digit)+;
inlineCode: InlineBacktick CodeContent InlineCodeEnd;

emphasis: bold | italic | strikeThrough;

boldTag: Star Star;
boldElement: plainText | inlineCode | strikeThrough | italic | urlLink;
bold: boldTag boldElement boldTag # boldSingle
    | boldTag boldElement (indent boldElement)+ boldTag # boldMulti
    ;

italicTag: Star;
italicElement: bold | inlineCode | strikeThrough | plainText | urlLink;
italic: italicTag italicElement italicTag # italicSingle
    |   italicTag italicElement (indent italicElement)+ italicTag # italicMutli
    ;

strikeThroughTag: Tilde Tilde;
strikeThroughElement: italic | bold | inlineCode | plainText | urlLink;
strikeThrough: strikeThroughTag strikeThroughElement strikeThroughTag # strikeThroughSingle
    |          strikeThroughTag strikeThroughElement (indent strikeThroughElement)+ strikeThroughTag # strikeThroughMulti
    ;

urlLink: LeftBracket altText RightBracket LeftParenthesis url RightParenthesis;
altText: plainText (Space plainText)*;