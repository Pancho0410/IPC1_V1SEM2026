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
public class Matrices {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[][] miMatriz = new int[5][3];
        
        int size = miMatriz.length;
        System.out.println("size = " + size);
        
        for(int f =0;f<5;f++){
            for(int c =0;c<3;c++){
                System.out.println("Ingrese el valor del espacio de la matriz: fila: "+ (f+1) + ", columna: " +(c+1));
                miMatriz[f][c]= Integer.parseInt(consola.next());
            }
        }
        System.out.println("VALORES ALMACENADOS EN LA MATRIZ");
        for(int f =0;f<5;f++){
            for(int c =0;c<3;c++){
                System.out.println("Valor: " + miMatriz[f][c]);
            }
        }
    }
}
