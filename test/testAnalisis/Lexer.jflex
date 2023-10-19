package testAnalisis;

import java_cup.runtime.*;
import java.io.*;

%%

%{
    private TS tabla;
    public Yylex(Reader in, TS t){
        this(in);
        this.tabla = t;
    }
%}

%unicode
%cup
%line
%column

%%

"+"     { return new Symbol(sym.MAS); }
"-"     { return new Symbol(sym.MENOS); }
"*"     { return new Symbol(sym.POR); }
"/"     { return new Symbol(sym.ENTRE); }
";"     { return new Symbol(sym.PUNTOYCOMA); }
"("     { return new Symbol(sym.LPAREN); }
")"     { return new Symbol(sym.RPAREN); }
"="     { return new Symbol(sym.ASIG); }
"PRINT"     { return new Symbol(sym.PRINT); }

[:jletter:][:jletterdigit:]*    {
                                    Simbolos s;
                                    if ((s = tabla.buscar(yytext()))==null)
                                        s = tabla.insertar(yytext());
                                    return new Symbol(sym.ID, s);
                                }

[0-9]+  { return new Symbol(sym.NUMERO, new Integer(yytext())); }
[ \t\r\n]+  {;}

.           {System.out.println("Error lexico "+yytext());}