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
public class Metodos {
    static Scanner consola = new Scanner(System.in);
    
    public static void main(String[] args) {
        
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
                    calculoPromedio();
                    break;
                case 2:
                    agregarNota();
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
    
    public static void calculoPromedio(){
        System.out.println("INGRESE LA CANTIDAD DE NOTAS A SUMAR");
        int n = Integer.parseInt(consola.next());
        int totalSuma = 0;
        for(int i = 1; i<=n;i++){
            System.out.print("Ingrese la nota " + i +": ");
            int valor =Integer.parseInt(consola.next());
            //totalSuma=totalSuma + valor;
            totalSuma+=valor;            
        }
        double promedio = totalSuma / n;
        
        System.out.println("............El promedio final es: " + promedio);
        /*pedir todas las notas
        sumo las notas
        divido para obtener el promedio*/          
    }
    
    public static void agregarNota(){
        System.out.println("............INGRESANDO NOTA DESDE UN METODO............");
    }
    
}
