/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadores;

/**
 *
 * @author jairi
 */
public class NewClass {
    public static void main(String[] args) {
        Object a = 0.5;
        
        if(a instanceof Integer){
            System.out.println("es entero");
        
        }else if(a instanceof String){
            System.out.println("es string");
        
        }else if(a instanceof Double){
            System.out.println("es double");
        
        }else {
            System.out.println("No es ninguno");
            
        }
    }
    
}
