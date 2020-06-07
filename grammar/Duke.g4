grammar Duke;

/*Parser Rules */
ifStatement: If Separator ' ' condition Block statements ;

condition: ;

statements: ;

declareInt: Declare Separator ' ' Integer named Id Separator Assign Id Terminal;

named: ;

/*Lexer Rules */

Block: ':';
Bool: 'Boolean';
Choose: 'Choose';
Declare: 'I want';
Decrement: 'sub';
Defaut: 'Default';
Double: 'Double';
Else: 'Else';
Function: 'Func';
If: 'If';
Increment: 'add';
Integer: 'Integer';
Loop: 'Loop';
Separator: ',';
String: 'String';
Nonterminal: ';';
Terminal: '.';

Assign: 'is';


Id: Letter | (Letter Num);

fragment
Num: [0-9];

fragment
Letter: [a-zA-Z_];

fragment
Lower: [a-z_];

fragment
Upper: {A-Z_];

BlockComment: '/*' .*? '*/' -> skip;

LineComment: '//' ~[\r\n]* -> skip;