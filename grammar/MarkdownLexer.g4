lexer grammar MarkdownLexer;

@lexer::members {
    public void popUntilDefaultMode() {
        while (_modeStack.size() > 0) {
            popMode();
        }
    }
}

Letter: [a-zA-Z];
Digit: [0-9];

Space: ' ';
Tab: '\t';
Newline: '\r'? '\n';

// Markdown Lexer
Star: '*';
Tilde: '~';
Underscore: '_';

// for url
Colon: ':';
Slash: '/';
LeftBracket: '[';
RightBracket: ']';
LeftParenthesis: '(';
RightParenthesis: ')';
AtSign: '@';
QuestionMark: '?';
Ampersand: '&';
Hash: '#';
Equal: '=';
Dot: '.';
Plus: '+';
Minus: '-';
Percent: '%';
Exclamation: '!';

InlineBacktick: '`' -> pushMode(INLINE_CODE_MODE);
BlockBacktick: '```' -> pushMode(BLOCK_CODE_MODE);

mode INLINE_CODE_MODE;
InlineCodeContent: ~[`\r\n]+;
InlineCodeEnd: '`' -> popMode;

mode BLOCK_CODE_MODE;
LanguageMode: (Letter | Digit)+ -> pushMode(BLOCK_CODE_LANGUAGE_MODE);
LanguageEmptyMode: '\n' -> pushMode(BLOCK_CODE_CONTENT_MODE);

mode BLOCK_CODE_LANGUAGE_MODE;
LanguageModeEnd: '\r'? '\n' -> pushMode(BLOCK_CODE_CONTENT_MODE);

mode BLOCK_CODE_CONTENT_MODE;

EmptyChar: [ \r\n\t];
NotEmptyChar: ~[ \r\n\t];
BlockCodeEnd: '```' {
   popUntilDefaultMode();
};

