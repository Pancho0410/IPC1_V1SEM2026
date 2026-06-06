/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author PC
 */
public class ClaseBase {
    public static void main(String[] args) {
        int[][] miMatriz = new int[2][2];
        System.out.println("INICIALIZANDO MATRIZ.....................");
        ClaseUtilitariaJose.inicializarMatriz(miMatriz);
        
        for(int f=0;f<miMatriz.length;f++){
            
            for(int c=0;c<miMatriz[0].length;c++){
                System.out.println(miMatriz[f][c]);
            }
        }
        
    }
    
}
