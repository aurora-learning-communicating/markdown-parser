parser grammar UrlRule;

options {
    tokenVocab = MarkdownLexer;
}

url    : scheme colonSlashSlash? host (Colon port)? (Slash path?)? query? frag?;

colonSlashSlash: Colon Slash Slash;

scheme
    : string
    ;

host
    : Slash? hostname
    ;

hostname
    : string         # DomainNameOrIPv4Host
    | LeftBracket v6host RightBracket # IPv6Host
    ;

v6host
    : (Colon Colon)? (string | Digit+) (Colon Colon? (string | Digit+))*
    ;

port
    : Digit+
    ;

path
    : string (Slash string)* Slash?
    ;

user
    : string
    ;

login
    : user (Slash password)? AtSign
    ;

password
    : string
    ;

frag
    : Hash (string | Digit+)
    ;

query
    : QuestionMark search
    ;

search
    : searchparameter (Ampersand searchparameter)*
    ;

searchparameter
    : string (Equal (string | Digit+ | hex))?
    ;

string : (Letter | Tilde | Digit | hex | Underscore) (Letter | Digit | Dot | Plus | Minus | hex | Underscore)*
    | Digit+;

hex: (Percent (Letter | Digit) (Letter | Digit))+;