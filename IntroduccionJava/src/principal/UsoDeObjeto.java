/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author PC
 */
public class UsoDeObjeto {
    
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Tobias",22);
        estudiante1.setNombre("BRANDON");
        estudiante1.setEdad(17);
        estudiante1.Saludar();
        System.out.println("-----------------------------------");
        
        estudiante1.setEdad(19);
        estudiante1.Saludar();
        //estudiante2.Saludar();
        
        
    }
}
