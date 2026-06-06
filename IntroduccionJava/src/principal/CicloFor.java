/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class CicloFor {
    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int contador;
        System.out.println("Ingrese el numero de la tabla a multiplicar");
        contador = Integer.parseInt(consola.next());
        for(int i = 1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(contador + " x "+ i +" = " + (i*contador));
        }
        
        
    }
    
}
