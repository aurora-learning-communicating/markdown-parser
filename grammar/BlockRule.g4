parser grammar BlockRule;

options {
    tokenVocab = MarkdownLexer;
}

import InlineRule;

block: blockCode | paragraph | orderedList | unOrderedList;

// some rule that not in markdown
softLineBreak:
   Newline # LineBreakIgnore
 | Space Space+ Newline # LineBreakNewLine
  ;

// blockCode
blockCodeLanguage: (Letter | Digit)+;
blockCodeStart: Backtick Backtick Backtick blockCodeLanguage? Newline;
blockCodeEnd: Backtick Backtick Backtick;
blockCodeContent: (~Backtick | Backtick ~Backtick | Backtick Backtick ~Backtick)+;

blockCode:
    blockCodeStart blockCodeEnd # BlockCodeEmpty
  | blockCodeStart blockCodeContent blockCodeEnd # BlockCodeCommon
  ;

// paragraph
paragraphElement: inline;
paragraphIndent: (Space | Tab)+;
paragraph:
    paragraphElement # ParagraphSingleElement
  | paragraphElement (paragraphIndent paragraphElement)+ # ParagraphSingleLine
  | paragraph (softLineBreak paragraphIndent? paragraph)+ # ParagraphMultiLine
  | paragraph paragraphIndent # ParagraphWithIndent
  ;


// list
// TODO add list
// TODO add indent in list
// listItemElement: paragraph | blockCode | list;

orderedListItemPrefix: prefix=Digit+ Dot Space;
unOrderedListItemPrefix: (Minus | Plus | Star) Space;


orderedListItemMarker:
    orderedListItemPrefix inline # OrderedListItemMarkerSingleElement
  | orderedListItemPrefix inline (paragraphIndent inline)+ # OrderedListItemMarkerMultiElement
  ;

unOrderedListItemMarker:
    unOrderedListItemPrefix inline # UnOrderedListItemMarkerSingleElement
  | unOrderedListItemPrefix inline (paragraphIndent inline)+ # UnOrderedListItemMarkerMultiElement
  ;

//listItemMarker:
//    listItemPrefix inline # ListItemMarkerSingleElement
//  | listItemPrefix inline (paragraphIndent inline)+ # ListItemMarkerMultiElement
//  ;


// TODO add blockquote
listItemContent:
   (listItemContentIndent listItem)+ # ListItemContentListItem
 | softLineBreak (listItemContentIndent inline)+ # ListItemContentInlineElements
 | listItemContentIndent blockCodeStart listItemContentIndent blockCodeEnd # ListItemContentBlockCodeEmpty
 | listItemContentIndent blockCodeStart
   blockCodeContent
   blockCodeEnd # ListItemContentBlockCodeCommon
;

listItemContentIndent: paragraphIndent;

orderedListItem:
    orderedListItemMarker # OrderedListItemOnlyMarker
  | orderedListItemMarker (softLineBreak+ listItemContent)+ # OrderedListItemWithContent
  ;

unOrderedListItem:
    unOrderedListItemMarker # UnOrderedListItemOnlyMarker
  | unOrderedListItemMarker (softLineBreak+ listItemContent)+ # UnOrderedListItemWithContent
  ;

listItem: orderedListItem | unOrderedListItem;

orderedList: orderedListItem (softLineBreak orderedListItem)*;
unOrderedList: unOrderedListItem (softLineBreak unOrderedListItem)*;

//// blockquote
//blockQuoteStart: AngleBracket Space;
//nestedBlockQuoteStart: AngleBracket AngleBracket+ Space;
//blockQuoteContent:
//    inline # BlockQuoteContentSingle
//  | inline (blockQuoteIndent inline)+ # BlockQuoteContentMulti
//  ;
//
//blockQuoteIndent: paragraphIndent;
//blockQuoteSoftLineBreak: blockQuoteStart softLineBreak;
//blockQuoteOneline: blockQuoteStart blockQuoteContent;
//
//blockQuoteSingleLevel:
//    blockQuoteOneline softLineBreak
//
//
//
//
//    ;
//blockQuote:
//    blockQuoteStart blockQuoteContent # BlockQuoteOneline
//  | blockQuoteStart blockQuoteContent (softLineBreak blockQuoteStart blockQuoteContent)+ # BlockQuoteSingleLevel
//  | blockQuote softLineBreak blockQuoteNested # BlockQuoteWithNested
//;
//
//blockQuoteNested:
//    nestedBlockQuoteStart blockQuoteContent # BlockQuoteNestedOneline
//  | nestedBlockQuoteStart blockQuoteContent (softLineBreak nestedBlockQuoteStart blockQuoteContent)+ # BlockQuoteNestedSingleLevel
//  ;