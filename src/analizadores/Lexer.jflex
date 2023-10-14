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

<YYINITIAL> "!" { return new Symbol(sym.fin, yycolumn, yyline, yytext()); }

<YYINITIAL> "using" { return new Symbol(sym.using, yycolumn, yyline, yytext()); }
<YYINITIAL> "end" { return new Symbol(sym.end, yycolumn, yyline, yytext()); }

/* Variable Constante */
<YYINITIAL> "const" { return new Symbol(sym.const, yycolumn, yyline, yytext()); }
<YYINITIAL> "var" { return new Symbol(sym.var, yycolumn, yyline, yytext()); }

/* Bloques */
<YYINITIAL> "begin" { return new Symbol(sym.begin, yycolumn, yyline, yytext()); }
<YYINITIAL> "loop" { return new Symbol(sym.loop, yycolumn, yyline, yytext()); }

/* Estructuras de control */
<YYINITIAL> "if" { return new Symbol(sym.if, yycolumn, yyline, yytext()); }
<YYINITIAL> "else" { return new Symbol(sym.else, yycolumn, yyline, yytext()); }
<YYINITIAL> "repeat" { return new Symbol(sym.repeat, yycolumn, yyline, yytext()); }
<YYINITIAL> "while" { return new Symbol(sym.while, yycolumn, yyline, yytext()); }
<YYINITIAL> "do" { return new Symbol(sym.do, yycolumn, yyline, yytext()); }
<YYINITIAL> "switch" { return new Symbol(sym.switch, yycolumn, yyline, yytext()); }
<YYINITIAL> "case" { return new Symbol(sym.case, yycolumn, yyline, yytext()); }
<YYINITIAL> "break" { return new Symbol(sym.break, yycolumn, yyline, yytext()); }

/* Librerías incluidas */
<YYINITIAL> "motors" { return new Symbol(sym.motors, yycolumn, yyline, yytext()); }
<YYINITIAL> "sensors" { return new Symbol(sym.sensors, yycolumn, yyline, yytext()); }

/* Tipos de dato */
<YYINITIAL> "int" { return new Symbol(sym.int_type, yycolumn, yyline, yytext()); }
<YYINITIAL> "real" { return new Symbol(sym.real_type, yycolumn, yyline, yytext()); }
<YYINITIAL> "boolean" { return new Symbol(sym.boolean_type, yycolumn, yyline, yytext()); }
<YYINITIAL> "string" { return new Symbol(sym.string_type, yycolumn, yyline, yytext()); }

/* Booleanos literales */
<YYINITIAL> "true" { return new Symbol(sym.true, yycolumn, yyline, yytext()); }
<YYINITIAL> "false" { return new Symbol(sym.false, yycolumn, yyline, yytext()); }

/* Operadores LÓGICOS */
<YYINITIAL> "AND" { return new Symbol(sym.and, yycolumn, yyline, yytext()); }
<YYINITIAL> "OR" { return new Symbol(sym.or, yycolumn, yyline, yytext()); }
<YYINITIAL> "NOT" { return new Symbol(sym.not, yycolumn, yyline, yytext()); }

/* Operadores aritméticos */
<YYINITIAL> "+" { return new Symbol(sym.mas, yycolumn, yyline, yytext()); }
<YYINITIAL> "-" { return new Symbol(sym.menos, yycolumn, yyline, yytext()); }
<YYINITIAL> "/" { return new Symbol(sym.div, yycolumn, yyline, yytext()); }
<YYINITIAL> "*" { return new Symbol(sym.mul, yycolumn, yyline, yytext()); }

/* Operadores relacionales */
<YYINITIAL> ">" { return new Symbol(sym.mayor, yycolumn, yyline, yytext()); }
<YYINITIAL> "<" { return new Symbol(sym.menor, yycolumn, yyline, yytext()); }
<YYINITIAL> ">=" { return new Symbol(sym.mayor_i, yycolumn, yyline, yytext()); }
<YYINITIAL> "<=" { return new Symbol(sym.menor_i, yycolumn, yyline, yytext()); }
<YYINITIAL> "==" { return new Symbol(sym.igual, yycolumn, yyline, yytext()); }

/* Números real y entero */
<YYINITIAL> {NumeroEntero} { return new Symbol(sym.num_int, yycolumn, yyline, yytext()); }
<YYINITIAL> {NumeroReal} { return new Symbol(sym.num_real, yycolumn, yyline, yytext()); }
<YYINITIAL> {CadenaDeTexto} { return new Symbol(sym.cadena, yycolumn, yyline, yytext()); }

/* Operadores de agrupación */
<YYINITIAL> "(" { return new Symbol(sym.paren_l, yycolumn, yyline, yytext()); }
<YYINITIAL> ")" { return new Symbol(sym.paren_r, yycolumn, yyline, yytext()); }
<YYINITIAL> "{" { return new Symbol(sym.llave_l, yycolumn, yyline, yytext()); }
<YYINITIAL> "}" { return new Symbol(sym.llave_r, yycolumn, yyline, yytext()); }
<YYINITIAL> "[" { return new Symbol(sym.corch_l, yycolumn, yyline, yytext()); }
<YYINITIAL> "]" { return new Symbol(sym.corch_r, yycolumn, yyline, yytext()); }

<YYINITIAL> {comentario} {/**/}
<YYINITIAL> {EspacioEnBlanco} {/**/}

.                              {    TError dataError = new TError(yytext(), "error lexico", "símbolo fuera de la definición del lenguaje", yyline, yycolumn);
                                    tablaEL.add(dataError);
                                    }





