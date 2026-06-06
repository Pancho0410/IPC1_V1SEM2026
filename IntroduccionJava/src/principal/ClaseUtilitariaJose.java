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
public class ClaseUtilitariaJose {

    public static void inicializarMatriz(int [][] miMatriz){
        Scanner consola = new Scanner(System.in);
        for(int f=0;f<miMatriz.length;f++){
            for(int c=0;c<miMatriz[0].length;c++){
                System.out.print("INGRESE EL VALOR DE LA MATRIZ: ");
                miMatriz[f][c]= Integer.parseInt(consola.next());
            }
        }
        System.out.println("MATRIZ INICIALIZADA");
        
    }
    
}
