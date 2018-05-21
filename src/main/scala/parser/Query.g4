grammar Query;

queryStatement : selectKeyStatement | insertKeyStatement | deleteKeyStatement
                | selectEntryStatement | selectEntryStatementWithWhere | insertEntryStatement | deleteEntryStatement ;

selectKeyStatement : QUERY '[' SELECT KEY '(' IDENTIFIER ')' FROM IDENTIFIER ']' ;
insertKeyStatement : QUERY '[' INSERT KEY '(' IDENTIFIER ')' INTO IDENTIFIER dataVal ']' ;
deleteKeyStatement : QUERY '[' DELETE KEY '(' IDENTIFIER ')' FROM IDENTIFIER ']' ;

selectEntryStatement : QUERY '[' SELECT ENTRY '(' IDENTIFIER ')' FROM IDENTIFIER ']' ;
selectEntryStatementWithWhere : QUERY '[' SELECT ENTRY '(' IDENTIFIER ')' FROM IDENTIFIER WHERE whereExpression ']' ;
insertEntryStatement : QUERY '[' INSERT ENTRY '(' json ')' INTO IDENTIFIER ']' ;
deleteEntryStatement : QUERY '[' DELETE ENTRY FROM IDENTIFIER ']' ;

whereExpression
    : LPAREN whereExpression RPAREN                                 #parenExpression
    | NOT whereExpression                                           #notExpression
    | left=whereExpression op=comparator right=whereExpression      #comparatorExpression
    | left=whereExpression op=binary right=whereExpression          #binaryExpression
    | bool                                                          #boolExpression
    | IDENTIFIER                                                    #identifierExpression
    | DECIMAL                                                       #decimalExpression
    ;

comparator
 : GT | GE | LT | LE | EQ
 ;

binary
 : AND | OR
 ;

bool
 : TRUE | FALSE
 ;

dataVal : DATA '(' json ')' ;

QUERY       : [qQ][uU][eE][rR][yY] ;
SELECT      : [sS][eE][lL][eE][cC][tT] ;
INSERT      : [iI][nN][sS][eE][rR][tT] ;
DELETE      : [dD][eE][lL][eE][tT][eE] ;
KEY         : [kK][eE][yY] ;
ENTRY       : [eE][nN][tT][rR][yY] ;
INTO        : [iI][nN][tT][oO] ;
FROM        : [fF][rR][oO][mM] ;
DATA        : [dD][aA][tT][aA] ;
WHERE       : [wW][hH][eE][rR][eE] ;
AND         : 'AND' ;
OR          : 'OR' ;
NOT         : 'NOT';
TRUE        : 'TRUE' ;
FALSE       : 'FALSE' ;
GT          : '>' ;
GE          : '>=' ;
LT          : '<' ;
LE          : '<=' ;
EQ          : '=' ;
LPAREN      : '(' ;
RPAREN      : ')' ;
DECIMAL     : '-'? [0-9]+ ( '.' [0-9]+ )? ;
IDENTIFIER  : [a-zA-Z_] [a-zA-Z_0-9.]* ;

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

WS : [ \r\t\u000C\n]+ -> skip;