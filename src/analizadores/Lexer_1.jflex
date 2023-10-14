package analizadores;

import vista;

%%

%public
%unicode
%char
%column
%line
%ignorecase

%{
    //Lista de errores lexicos
    
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

/* Comentarios o espacios en blanco */

<YYINITIAL> "!" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }

<YYINITIAL> "using" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "end" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }

/* Variable Constante */
<YYINITIAL> "const" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "var" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }

/* Bloques */
<YYINITIAL> "begin" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "loop" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }

/* Estructuras de control */
<YYINITIAL> "if" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "else" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "repeat" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "while" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "do" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "switch" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "case" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "break" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }

/* Librerías incluidas */
<YYINITIAL> "motors" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "sensors" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }

/* Tipos de dato */
<YYINITIAL> "int" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "real" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "boolean" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "string" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }

/* Booleanos literales */
<YYINITIAL> "true" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "false" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }

/* Operadores LÓGICOS */
<YYINITIAL> "AND" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "OR" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "NOT" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }

/* Operadores aritméticos */
<YYINITIAL> "+" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "-" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "/" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "*" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }

/* Operadores relacionales */
<YYINITIAL> ">" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "<" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> ">=" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "<=" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "==" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }

/* Números real y entero */
<YYINITIAL> {NumeroEntero} { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> {NumeroReal} { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }

/* Operadores de agrupación */
<YYINITIAL> "(" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> ")" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "{" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "}" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "[" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }
<YYINITIAL> "]" { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el lexema " + yytext()); }

<YYINITIAL> {CadenaDeTexto} { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el la cadena " + yytext());}
<YYINITIAL> {comentario} { txtOutput.setText(txtOutput.getText+"\r\nSe encontro el comentario" + yytext());}
<YYINITIAL> {EspacioEnBlanco} {/**/}



[^]                              { throw new RuntimeException("Error lexico Caracter ilegal en el lenguaje \""+yytext()+
                                                              "\" at line "+yyline+", column "+yycolumn); }
<<EOF>>                          { return symbol(EOF); }



