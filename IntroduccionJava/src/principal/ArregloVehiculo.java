/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author PC
 */
public class ArregloVehiculo {

    public static void main(String[] args) {
        Vehiculo[] listaVehiculos = new Vehiculo[10];
        int contador = 0;
        File datos = new File("Reportes/vehiculos.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(datos));) {
            String linea;
            linea = br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datosArchivo = linea.split(",");
                String marca = datosArchivo[0];
                String modelo = datosArchivo[1];
                int anio = Integer.parseInt(datosArchivo[2]);
                Double kilometraje = Double.parseDouble(datosArchivo[3]);
                boolean disponible = Boolean.parseBoolean(datosArchivo[4]);
                String imagen = datosArchivo[5];
                /*System.out.println("----------------Datos de la linea----------------------");
                System.out.println("marca = " + marca);
                System.out.println("modelo = " + modelo);
                System.out.println("añio = " + anio);
                System.out.println("kilometraje = " + kilometraje);
                System.out.println("disponible = " + disponible);
                System.out.println("imagen = " + imagen);  */

                //marca,modelo,anio,kilometraje,disponible,imagen
                Vehiculo nuevoVehiculo = new Vehiculo(marca, modelo, anio, kilometraje, disponible, imagen);
                listaVehiculos[contador] = nuevoVehiculo;
                //listaVehiculos[contador] = new Vehiculo(marca,modelo,anio,kilometraje,disponible,imagen);
                contador++;
            }
            System.out.println("LA LISTA DE VEHICULOS SE LLENO CORRECTAMENTE");

            for (int i = 0; i < listaVehiculos.length; i++) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("LA MARCA DEL VEHICULO " + (i + 1) + " ES: " + listaVehiculos[i].getMarca());
                System.out.println("EL KILOMETRA DEL VEHICULO " + (i + 1) + " ES: " + listaVehiculos[i].getKilometraje());
            }
            reporteVehiculos(listaVehiculos);
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("REPORTE GENERADO CON EXITO");
            System.out.println("-----------------------------------------------------------------------------");
        } catch (IOException e) {
            System.out.println("El documento no se pudo leer correctamente");
        } catch (Exception e) {
            System.out.println("Error en las conversiones");
        }
    }

    public static void reporteVehiculos(Vehiculo[] listaVehiculos) {
        try (FileWriter fw = new FileWriter("reporteVehiculos.html"); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
            String incial = """
                          <!DOCTYPE html>
                          <html lang="en">
                          
                          <head>
                              <meta charset="UTF-8">
                              <meta name="viewport" content="width=device-width, initial-scale=1.0">
                              <title>Lista de vehiculos</title>
                              <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
                                  integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
                          </head>
                          
                          <body>
                              <div class="container mt-3">
                                  <h1>ESTA ES LA LISTA DE VEHICULOS EN MI PROGRAMA</h1>
                          
                                  <div class="row g5">
                          """;
            pw.println(incial);
            for (int i = 0; i < listaVehiculos.length; i++) {
                String card = """
                               <div class="col-auto">
                                               <div class="card" style="width: 18rem;">
                                                   <img src="%s" class="card-img-top" alt="...">
                                                   <div class="card-body">
                                                       <h5 class="card-title">%s</h5>
                                                       <p class="card-text">%s</p>
                                                   </div>
                                               </div>
                               
                                           </div>
                          """.formatted(listaVehiculos[i].getImagen(),listaVehiculos[i].getMarca(),listaVehiculos[i].getModelo());
                pw.println(card);
            }

            String finalDoc = """
                                      </div>
                                  </div>
                              
                              </body>
                              
                              </html>
                              """;
           
            pw.println(finalDoc);
        } catch (Exception e) {
            System.out.println("ERROR AL ESCRIBIR EN EL ARCHIVO");
        }
    }

}
