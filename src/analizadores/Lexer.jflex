package analizadores;

import java_cup.runtime.*;
import java.util.LinkedList;

%%

%public
%class Lexer
%cupsym sym
%cup
%unicode
%char
%column
%line
%ignorecase

%{
    //Lista de errores lexicos
    public static LinkedList<TError> tablaEL = new LinkedList<TError>();
    
    //tabla de simbolos
%}


/*----Macros-----*/
 
FinDeLinea          = \r|\n|\r\n
EntradaDeCaracter   = [^\r\n]
EspacioEnBlanco     = {FinDeLinea} | [ \t\f]

/* comentarios */ 
comentario          = {ComentatioTradicional} | {ComentarioFinDeLinea} | {ComentarioDeDocumentacion}

// Tipos de comentario
ComentatioTradicional       = "#*" [^*] ~"*#" | "#*" "*"+ "#"
ComentarioFinDeLinea        = "#" {EntradaDeCaracter}* {FinDeLinea}?
ComentarioDeDocumentacion   = "#*" {ContenidoDeComentario} "*"+ "#"
ContenidoDeComentario       = ( [^*] | \*+ [^#*] )*

/* Variables para cadendas de texto*/
CadenaDeTexto = \" {EntradaDeCaracter}* \"

/* Identificador */
Letra = [A-ZÑ_]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*

/* Número */
NumeroEntero = 0 | [1-9]{Digito}* | -[1-9]{Digito}*

/* Número Real */
NumeroReal = ({NumeroEntero}|-0)"."{Digito}+

%%
/*----Reglas lexicas----*/

/* Comentarios o espacios en blanco */

<YYINITIAL> "!" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.FIN); }

<YYINITIAL> "using" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.USING); }
<YYINITIAL> "end" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.END); }

/* Variable Constante */
<YYINITIAL> "const" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.USING); }
<YYINITIAL> "var" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.USING); }

/* Bloques */
<YYINITIAL> "begin" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.USING); }
<YYINITIAL> "loop" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.USING); }

/* Estructuras de control */
<YYINITIAL> "if" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.IF); }
<YYINITIAL> "else" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.ELSE); }
<YYINITIAL> "repeat" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.REPEAT); }
<YYINITIAL> "while" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.WHILE); }
<YYINITIAL> "do" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.DO); }
<YYINITIAL> "switch" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.SWITCH); }
<YYINITIAL> "case" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.CASE); }
<YYINITIAL> "break" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.BREAK); }

/* Librerías incluidas */
<YYINITIAL> "motors" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.MOTORS); }
<YYINITIAL> "sensors" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.SENSORS); }

/* Tipos de dato */
<YYINITIAL> "int" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.INT); }
<YYINITIAL> "real" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.REAL); }
<YYINITIAL> "boolean" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.BOOLEAN); }
<YYINITIAL> "string" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.STRING); }

/* Booleanos literales */
<YYINITIAL> "true" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.TRUE); }
<YYINITIAL> "false" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.FALSE); }

/* Operadores LÓGICOS */
<YYINITIAL> "AND" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.AND); }
<YYINITIAL> "OR" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.OR); }
<YYINITIAL> "NOT" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.NOT); }

/* Operadores aritméticos */
<YYINITIAL> "+" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.SUMA); }
<YYINITIAL> "-" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.MENOS); }
<YYINITIAL> "/" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.DIV); }
<YYINITIAL> "*" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.MUL); }

/* Operadores relacionales */
<YYINITIAL> ">" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.MAYOR); }
<YYINITIAL> "<" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.MENOR); }
<YYINITIAL> ">=" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.MAYOR_IG); }
<YYINITIAL> "<=" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.MENOR_IG); }
<YYINITIAL> "==" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.IGUAL); }

/* Números real y entero */
<YYINITIAL> {NumeroEntero} { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.NUM_ENTERO); }
<YYINITIAL> {NumeroReal} { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.NUM_REAL); }

/* Operadores de agrupación */
<YYINITIAL> "(" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.PARE_A); }
<YYINITIAL> ")" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.PARE_C); }
<YYINITIAL> "{" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.LLAV_A); }
<YYINITIAL> "}" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.LLAV_C); }
<YYINITIAL> "[" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.CORC_A); }
<YYINITIAL> "]" { System.out.println("Se encontro el lexema" + yytext()); return symbol(sym.CORC_C); }

<YYINITIAL> {comentario} {/**/}
<YYINITIAL> {EspacioEnBlanco} {/**/}



[^]                              { throw new RuntimeException("Error lexico Caracter ilegal en el lenguaje \""+yytext()+
                                                              "\" at line "+yyline+", column "+yycolumn); }
<<EOF>>                          { return symbol(EOF); }



