grammar MarkdownRule;

import MarkdownLexer;
// TODO add url link
inline: plainText | inlineCode | emphasis;

// indent: Space{2,} | Tab;
indent: Space+ | Tab;

plainText: (Letter | Digit)+;
inlineCode: '`' plainText '`';

emphasis: bold | boldItalic | italic | strikeThrough | underline;

// TODO add urllink
boldTag: '**';
boldElement: (plainText | inlineCode | strikeThrough | italic);
bold: boldTag boldElement boldTag # boldSingle
    | boldTag boldElement (indent boldElement)+ boldTag # boldMulti
    ;

// TODO add urllink
italicTag: '*';
italicElement: (bold | inlineCode | strikeThrough | plainText);
italic: italicTag italicElement italicTag # italicSingle
    |   italicTag italicElement (indent italicElement)+ italicTag # italicMutli
    ;

// TODO add urllink
strikeTag: '~~';
strikeThroughElement: (italic | bold | inlineCode | plainText);
strikeThrough: strikeTag strikeThroughElement strikeTag # strikeThroughSingle
    |          strikeTag strikeThroughElement (indent strikeThroughElement)+ strikeTag # strikeThroughMulti
    ;

// TODO adjust here
boldItalicTag: '***';
boldItalicElement: plainText;
boldItalic: boldItalicTag boldItalicElement boldItalicTag # boldItalicSingle
    |       boldItalicTag boldItalicElement (indent boldItalicElement)+ boldItalicTag # boldItalicMulti
    ;

// TODO add urllink
underlineTag: '__';
underlineElement: (plainText | bold | italic | inlineCode);
underline: underlineTag underlineElement underlineTag # underlineSingle
    |      underlineTag underlineElement (indent underlineElement)+ underlineTag # underlineMutli
    ;
