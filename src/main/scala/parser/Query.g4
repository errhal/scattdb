grammar Query;

queryStatement : selectKeyStatement | insertKeyStatement | deleteKeyStatement
                | selectEntryStatement | insertEntryStatement | deleteEntryStatement ;

selectKeyStatement : QUERY '[' SELECT KEY '(' NAME ')' FROM NAME ']' ;
insertKeyStatement : QUERY '[' INSERT KEY '(' NAME ')' INTO NAME dataVal ']' ;
deleteKeyStatement : QUERY '[' DELETE KEY '(' NAME ')' FROM NAME ']' ;

selectEntryStatement : QUERY '[' SELECT ENTRY '(' NAME ')' FROM NAME ']' ;
insertEntryStatement : QUERY '[' INSERT ENTRY '(' json ')' INTO NAME ']' ;
deleteEntryStatement : QUERY '[' DELETE ENTRY FROM NAME ']' ;

dataVal : DATA '(' json ')' ;

QUERY : [qQ][uU][eE][rR][yY] ;
SELECT : [sS][eE][lL][eE][cC][tT] ;
INSERT : [iI][nN][sS][eE][rR][tT] ;
DELETE : [dD][eE][lL][eE][tT][eE] ;
KEY : [kK][eE][yY] ;
ENTRY : [eE][nN][tT][rR][yY] ;
INTO : [iI][nN][tT][oO] ;
FROM : [fF][rR][oO][mM] ;
DATA : [dD][aA][tT][aA] ;

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
