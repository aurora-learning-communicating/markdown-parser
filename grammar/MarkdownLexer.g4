lexer grammar MarkdownLexer;

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

InlineBacktick: '`' -> pushMode(CODE_MODE);
BlockBacktick: '```' -> pushMode(CODE_MODE);

mode CODE_MODE;
CodeContent: ~[`\r\n]+;
InlineCodeEnd: '`' -> popMode;
BlockCodeEnd: '```' -> popMode;
