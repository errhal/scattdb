grammar Query;

queryStatement : QUERY '[' selectKeyStatement ']' ;

selectKeyStatement : SELECT KEY '(' NAME ')' FROM NAME ;

QUERY : 'query' ;
SELECT : 'select' ;
KEY : 'key' ;
FROM : 'from' ;

NAME : [A-Za-z0-9]+ ;

WS : [ \t\r\n]+ -> skip ;
