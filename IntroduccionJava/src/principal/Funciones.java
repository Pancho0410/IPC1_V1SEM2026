/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import static principal.Metodos.agregarNota;
import static principal.Metodos.calculoPromedio;
import static principal.Metodos.consola;

/**
 *
 * @author PC
 */
public class Funciones {
    public static void main(String[] args) {
        int opcion = 0;
        int resultado = 0;
        boolean sale = false;
        String menu = """
                      ---------------MENU---------------
                       1) Sumar 10
                       2) Mostrar el valor actual
                       3) Salir
                      INGRESE UNA OPCION..................
                      """;
        while(!sale){
            System.out.println(menu);
            opcion = Integer.parseInt(consola.next());
            switch(opcion){
                case 1:
                    resultado = sumarCantidad(resultado);
                    break;
                case 2:
                    System.out.println("El valor actual de la variable resultado:" + resultado);
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
    
    public static int sumarCantidad(int valorActual){
        return valorActual + 10;
    }
    
}
