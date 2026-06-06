/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author PC
 */
public class EstructuraIF {
    
    public static void main(String[] args) {
        boolean valor1 = true;
        boolean valor2 = true;
        boolean valor3 = false;
        
        if(!((valor1 && valor2) || valor3)){
            System.out.println("Es verdadero");
        } else if(valor1){
            System.out.println("INTERMEDIO");
        } else {
            System.out.println("Es falso");
        }
    }
    
}
