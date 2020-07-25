grammar Duke;

/*Parser Rules */
ifStatement:
	If condition Separator statements Done
	| If condition Block statements (Nonterminal | Done);
/*
 * *If myInt is 4, print myInt. //end ifStatement *If myInt is 4: print myInt; print 'is
 * four.'.//end ifStatement
 */

ifBlock:
	If Block condition Separator statements Done
	| Terminal
	| If Block condition Block statements (Nonterminal | Done)
	| Terminal;
/*
 * *If: myInt is 4, print myInt. myInt not 4, print "Not four."..//end ifBlock
 * 
 * *If: myInt is 4: print myInt; print 'is four.'. myInt not 4, print 'Not four.'..//end ifBlock
 */

createStatment:
	Create obj Separator Id Assignment (Num | Bop) Done;

/*Create int, myInt has 4. */

createBlock:
	Create Block obj Separator Id Assignment (Num | Bop) (
		Nonterminal
		| Done
	);
/*Create:
 * * int, myInt has 4; bool, myBool has true; dbl, myDbl has 2.5.
 */

loopStatement:
	Loop Separator condition Block statements (
		Nonterminal
		| Done
	);

/*
 Create int, myInt has 0. Loop, myInt is! 10: myInt has+ 1.
 */

chooseStatement:
	Choose Separator Id Block Id Separator statements (
		Nonterminal
		| Done
	) Terminal
	| Choose Separator Id Block Id Separator statements (
		Nonterminal
		| Done
	) Default statements (Nonterminal | Done) Terminal;

/*
 Choose, myInt: 4, print 'Is 4'. 5, print 'Is 5'. 6, print 'Is 6'..
 
 Choose, myInt: 4, print 'Is 4'. 5, print 'Is 5'. 6, print 'Is 6'. Otherwise, print 'Not found.'..
 */

condition: Id Cmp Id;

/*Condition
 myInt is 4. myInt is! 4. myInt ! 4.
 */

statements: expression;

obj: Bool | Integer | Double;

expression:
	Decrement Sub Num
	| Increment Add Num
	| Id Assignment Id
	| Id Assignment Id Mop Id;

/*Expressions
 dec - 1. inc + 1. inc + 2. dec - 3. myInt has 4. myInt has+ 1. myInt has 4 + 6. myDbl has 2.5 -
 1.6.
 */

/*Lexer Rules */

Assignment: 'has' | 'has+' | 'has-' | 'has*' | 'has/';
Block: ':';
Bool: 'Boolean' | 'Bool' | 'bool';
Choose: 'Choose' | 'choose';
Create: 'Create' | 'create';
Decrement: 'Dec' | 'dec';
Default: 'Otherwise';
Double: 'Double' | 'double' | 'dbl';
Function: 'Func' | 'Function';
If: 'If' | 'if';
Increment: 'Inc' | 'inc';
Integer: 'Integer' | 'Int' | 'int';
Loop: 'Loop' | 'loop';
Separator: ',';
String: 'String' | 'Str' | 'str';
Nonterminal: ';';
Terminal: '..';
Done: '.';

Bop: True | False;
True: 'True' | 'true' | 'on';
False: 'False' | 'false' | 'off';

/*Math Operators */
Mop: Times | Divide | Add | Sub | Mod;
Times: '*';
Divide: '/';
Add: '+';
Sub: '-';
Mod: '%';

/*Bitwise */
And: '&' | 'and';
Or: '|' | 'or';
Xor: '^' | 'xor';

Cmp: Equality | Not | Neq;
Equality: 'is';
Not: '!' | 'not';
Neq: 'is!' 'isnt';

Id: Letter | (Letter Num) | Num;

BlockComment: '/*' .*? '*/' -> skip;

LineComment: '//' ~[\r\n]* -> skip;

WS: ['named' |' '| \t]+ -> skip;

fragment Num: [0-9];

fragment Letter: [a-zA-Z_];

fragment Lower: [a-z];

fragment Upper:
	{A-Z];
