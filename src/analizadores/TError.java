/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadores;

/**
 *
 * @author jairi
 */
public class TError {
    String lexema, tipo, descripcion;
    int line,column;

    public TError(String lexema, String tipo, String descripcion, int line, int column) {
        this.lexema = lexema;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.line = line;
        this.column = column;
    }
    
    
}
