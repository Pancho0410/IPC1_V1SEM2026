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
public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String opcion;
        //Forma de evaluar correctamente el valor en string
        /*String nombre = "Hola";
        String nombre2 = "Hola";
        String nombre3 = new String("HOlA");
        
        System.out.println(nombre == nombre2);
        System.out.println(nombre == nombre3);
        System.out.println(nombre.equalsIgnoreCase(nombre3));*/
        
        System.out.println("Ingrese una opcion");
        opcion = consola.nextLine();
        switch (opcion) {
            case "A":
                System.out.println("INGRESO LA LETRA: A");
                break;
            case "B":
                System.out.println("INGRESO LA LETRA B");
                break;
            default:
                System.out.println("OPCION INVALIDA");   
        
        }
        
            
    }
}
