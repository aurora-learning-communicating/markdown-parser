grammar MarkdownRule;

options {
    tokenVocab = MarkdownLexer;
}

// TODO replace inline
start: inline EOF;

// TODO add url link
inline: plainText | inlineCode | emphasis;

// indent: Space{2,} | Tab;
indent: Space+ | Tab;

plainText: (Letter | Digit)+;
inlineCode: '`' plainText '`';

emphasis: bold | italic | strikeThrough | underline;

// TODO add urllink
boldTag: Star Star;
boldElement: (plainText | inlineCode | strikeThrough | italic);
bold: boldTag boldElement boldTag # boldSingle
    | boldTag boldElement (indent boldElement)+ boldTag # boldMulti
    ;

// TODO add urllink
italicTag: Star;
italicElement: (bold | inlineCode | strikeThrough | plainText);
italic: italicTag italicElement italicTag # italicSingle
    |   italicTag italicElement (indent italicElement)+ italicTag # italicMutli
    ;

// TODO add urllink
strikeThroughTag: Tilde Tilde;
strikeThroughElement: (italic | bold | inlineCode | plainText);
strikeThrough: strikeThroughTag strikeThroughElement strikeThroughTag # strikeThroughSingle
    |          strikeThroughTag strikeThroughElement (indent strikeThroughElement)+ strikeThroughTag # strikeThroughMulti
    ;

// TODO add urllink
underlineTag: Underscore Underscore;
underlineElement: (plainText | bold | italic | inlineCode);
underline: underlineTag underlineElement underlineTag # underlineSingle
    |      underlineTag underlineElement (indent underlineElement)+ underlineTag # underlineMutli
    ;
