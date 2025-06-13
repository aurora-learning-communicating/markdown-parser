parser grammar BlockRule;

options {
    tokenVocab = MarkdownLexer;
}

block: blockCode;

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
