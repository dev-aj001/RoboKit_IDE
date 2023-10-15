/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testAnalisis;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author jairi
 */
public class TS {

    HashMap <String, Object> t = new HashMap <String, Object> ();
    
    public TS() {
    }
    
    public Simbolo insertar(String nombre){
        Simbolo s = new Simbolo(nombre, new Integer(0)/*Integer.valueOf(0)*/);
        t.put(nombre, s);
        return s;       
    }
    
    public Simbolo buscar(String nombre){
        return (Simbolo) t.get(nombre);
    }
    
    public void imprimir(){
        Iterator i = t.values().iterator();
        while(i.hasNext()){
            Simbolo s = (Simbolo)i.next();
            System.out.println(s.nombre+" : "+s.valor);
        }
    }
    
}
