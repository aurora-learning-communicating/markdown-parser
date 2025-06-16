parser grammar BlockRule;

options {
    tokenVocab = MarkdownLexer;
}

import InlineRule;

block: blockCode | paragraph;

softLineBreak:
    Space Space Newline # LineBreakNewLine
  | Newline # LineBreakIgnore
  ;

// blockCode
blockCodeLanguage:
    BlockBacktick LanguageMode LanguageModeEnd # BlockCodeWithLanguage
 |  BlockBacktick LanguageEmptyMode # BlockCodeWithoutLanguage
 ;

blockCodeContent: (EmptyChar | NotEmptyChar)+;

blockCode:
    blockCodeLanguage BlockCodeEnd # BlockCodeEmptyCase1
  | blockCodeLanguage empty=EmptyChar+ BlockCodeEnd # BlockCodeEmptyCase2
  | blockCodeLanguage blockCodeContent BlockCodeEnd # BlockCodeNotEmpty
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


// blockDivider
