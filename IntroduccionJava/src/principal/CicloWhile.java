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
public class CicloWhile {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion = 0;
        boolean sale = false;
        String menu = """
                      ---------------MENU---------------
                       1) Calcular promedio
                       2) Ingreso de notas
                       3) Salir
                      INGRESE UNA OPCION..................
                      """;
        while(!sale){
            System.out.println(menu);
            opcion = Integer.parseInt(consola.next());
            switch(opcion){
                case 1:
                    System.out.println("CALCULANDO EL PROMEDIO............");
                    break;
                case 2:
                    System.out.println("INGRESANDO NOTA");
                    break;
                case 3:
                    System.out.println("ADIOS........");
                    sale = true;
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
           
        }
    }
}
