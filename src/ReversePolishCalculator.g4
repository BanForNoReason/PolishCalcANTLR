grammar ReversePolishCalculator;

expression : term (PLUS term | MINUS term)*;
term : factor (MUL factor | DIV factor)*;
factor : base (POW base)*;
base : LPAREN expression RPAREN
     | NUMBER
     | FLOAT
     | SCIENTIFIC
     | FUNC LPAREN expression RPAREN
     | E
     | PI;

PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
POW : '**';
LPAREN : '(';
RPAREN : ')';
FUNC : 'log' | 'ln' | 'sin' | 'cos' | 'tan' | 'asin' | 'acos' | 'atan' | 'sinh' | 'cosh' | 'tanh' | '!';
E : 'e';
PI : 'pi';

NUMBER : [0-9]+;
FLOAT : [0-9]+ '.' [0-9]*;
SCIENTIFIC : [0-9]+ ('.' [0-9]*)? ('e'|'E') ('+'|'-')? [0-9]+;

WHITESPACE : [ \t\r\n]+ -> skip;