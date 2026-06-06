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
public class EstructuraTry {
    
    public static void main(String[] args) {
        try {
            Scanner consola = new Scanner(System.in);
            System.out.println("Ingrese un numero....");
            int numero = Integer.parseInt(consola.nextLine());
            System.out.println("El numero es: "+numero);
        } catch (Exception e){
            System.out.println("Ingreso un dato no numerico");
            System.out.println("Error: "+ e.getMessage());
        }
        
    }
    
}
