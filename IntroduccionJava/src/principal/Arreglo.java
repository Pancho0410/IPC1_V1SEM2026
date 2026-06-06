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
public class Arreglo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] miArreglo = new int[5];
        int size = miArreglo.length;
        System.out.println("size = " + size);
        
        for(int i=0;i<5;i++){
            System.out.println("Ingrese el valor del espacio: "+ (i+1));
            miArreglo[i]= Integer.parseInt(consola.next());
        }
        System.out.println("VALORES ALMACENADOS.........................");
        for(int i=0;i<5;i++){
            System.out.println("Valor: "+ miArreglo[i]);
        }
        
        
    }
    
}
