/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author PC
 */
public class Herencia {
    public static void main(String[] args) {
        PerroHerencia perrito = new PerroHerencia("Manchas",3);
        System.out.println("El perrito se llama: "+ perrito.getNombre());
        
        perrito.sonido();
                
    }
}
