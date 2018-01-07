grammar Query;

queryStatement : selectKeyStatement | insertKeyStatement | selectEntryStatement | insertEntryStatement;

selectKeyStatement : QUERY '[' SELECT KEY '(' NAME ')' FROM NAME ']' ;
insertKeyStatement : QUERY '[' INSERT KEY '(' NAME ')' INTO NAME dataVal ']' ;
selectEntryStatement : QUERY '[' SELECT ENTRY '(' NAME ')' FROM NAME ']' ;
insertEntryStatement : QUERY '[' INSERT ENTRY '(' json ')' INTO NAME ']' ;

dataVal : 'data' '(' json ')' ;

QUERY : 'query' ;
SELECT : 'select' ;
INSERT : 'insert' ;
KEY : 'key' ;
ENTRY : 'entry' ;
INTO : 'into' ;
FROM : 'from' ;

json
   : value
   ;

obj
   : '{' pair (',' pair)* '}'
   | '{' '}'
   ;

pair
   : STRING ':' value
   ;

array
   : '[' value (',' value)* ']'
   | '[' ']'
   ;

value
   : STRING
   | NUMBER
   | obj
   | array
   | 'true'
   | 'false'
   | 'null'
   ;


STRING
   : '"' (ESC | ~ ["\\])* '"'
   ;
fragment ESC
   : '\\' (["\\/bfnrt] | UNICODE)
   ;
fragment UNICODE
   : 'u' HEX HEX HEX HEX
   ;
fragment HEX
   : [0-9a-fA-F]
   ;
NUMBER
   : '-'? INT ('.' [0-9] +)? EXP?
   ;
fragment INT
   : '0' | [1-9] [0-9]*
   ;
fragment EXP
   : [Ee] [+\-]? INT
   ;

NAME : [a-zA-Z0-9._$]+ ;

WS : [ \t\r\n]+ -> skip ;
