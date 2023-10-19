package testAnalisis;

import java_cup.runtime.*;
import java.io.*;

%%

%{
%}

%unicode
%cup
%line
%column

%%

"+"     { return new Symbol(sym.SUMA); }
"-"     { return new Symbol(sym.RESTA); }
"*"     { return new Symbol(sym.MUL); }
";"     { return new Symbol(sym.FIN); }
"("     { return new Symbol(sym.LPAREN); }
")"     { return new Symbol(sym.RPAREN); }

[:digit:]+  { return new Symbol(sym.NUMERO, new Integer(yytext())); }
[ \t\r\n]+  {/*Do nothing*/}

.           {System.out.println("Error lexico "+yytext());}