/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author PC
 */
public class BufferReaderExample {
    public static void main(String[] args) {
        File datos = new File("Reportes/vehiculos.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(datos));){
            String linea;
            linea = br.readLine();
            while((linea = br.readLine()) != null){
                String[] datosArchivo = linea.split(",");
                String marca = datosArchivo[0];
                String modelo = datosArchivo[1];
                int anio = Integer.parseInt(datosArchivo[2]);
                Double kilometraje = Double.parseDouble(datosArchivo[3]);
                boolean disponible = Boolean.parseBoolean(datosArchivo[4]);
                System.out.println("----------------Datos de la linea----------------------");
                System.out.println("marca = " + marca);
                System.out.println("modelo = " + modelo);
                System.out.println("añio = " + anio);
                System.out.println("kilometraje = " + kilometraje);
                System.out.println("disponible = " + disponible);
            }
        }catch(IOException e){
            System.out.println("El documento no se pudo leer correctamente");
        }catch(Exception e){
            System.out.println("Error en las conversiones");
        }
    }
    
}
