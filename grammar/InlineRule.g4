parser grammar InlineRule;

options {
    tokenVocab = MarkdownLexer;
}

import UrlRule;

inline: plainText | inlineCode | emphasis | urlLink | imageLink;

// indent: Space{2,} | Tab;
indent: Space+ | Tab;

plainText: (Letter | Digit)+;
inlineCodeChar: ~(Backtick | Newline);
inlineCodeContent: inlineCodeChar+;
inlineCode:
    Backtick Backtick # InlineCodeEmpty
  | Backtick inlineCodeContent Backtick # InlineCodeCommon
  ;

// inlineCode: Backtick content=InlineCodeContent Backtick;

emphasis: bold | italic | strikeThrough;

boldTag: Star Star;
boldElement: plainText | inlineCode | strikeThrough | italic | urlLink;
bold: boldTag boldElement boldTag # BoldSingle
    | boldTag boldElement (indent boldElement)+ boldTag # BoldMulti
    ;

italicTag: Star;
italicElement: bold | inlineCode | strikeThrough | plainText | urlLink;
italic: italicTag italicElement italicTag # ItalicSingle
    |   italicTag italicElement (indent italicElement)+ italicTag # ItalicMutli
    ;

strikeThroughTag: Tilde Tilde;
strikeThroughElement: italic | bold | inlineCode | plainText | urlLink;
strikeThrough: strikeThroughTag strikeThroughElement strikeThroughTag # StrikeThroughSingle
    |          strikeThroughTag strikeThroughElement (indent strikeThroughElement)+ strikeThroughTag # StrikeThroughMulti
    ;

urlLink: LeftBracket altText RightBracket LeftParenthesis url RightParenthesis;
altText: plainText (Space plainText)*;

imageLink: Exclamation urlLink;