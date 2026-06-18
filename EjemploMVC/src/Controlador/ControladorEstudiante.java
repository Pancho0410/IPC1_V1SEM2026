
package Controlador;

import Modelo.Estudiante;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;


public class ControladorEstudiante {
    
    public Estudiante[] estudiantes;
    public static int contador = 1;
    
    public ControladorEstudiante(){
        this.estudiantes = new Estudiante[15];
    }
    
    public void AgregarEsutdiante(String nombre, int edad, double nota){
        for(int i =0; i<estudiantes.length;i++){
            if(estudiantes[i]==null){
                Estudiante nuevoEstudiante = new Estudiante(contador,nombre,edad,nota);
                estudiantes[i]= nuevoEstudiante;
                contador++;
                break;
            }
        }
    }
    
    public void AgregarEsutdiante(int id,String nombre, int edad, double nota){
        for(int i =0; i<estudiantes.length;i++){
            if(estudiantes[i]==null){
                Estudiante nuevoEstudiante = new Estudiante(id,nombre,edad,nota);
                estudiantes[i]= nuevoEstudiante;
                contador++;
                break;
            }
        }
    }
    
    public void LlenarTabla(DefaultTableModel tabla){
        tabla.setRowCount(0);
        for(Estudiante es: estudiantes){
            if(es!=null){
                tabla.addRow(new Object[]{es.getId(),es.getNombre(),es.getEdad(),es.getNota(),"Editar"});
            }
        }
    }
    
    public void cargaMasiva(File archivo){
        try(FileReader fl = new FileReader(archivo);
            BufferedReader bf = new BufferedReader(fl);     
           ){
            String linea;
            linea= bf.readLine();
            while((linea= bf.readLine())!= null){
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                int edad = Integer.parseInt(datos[2]);
                double nota = Double.parseDouble(datos[3]);
                AgregarEsutdiante(id,nombre,edad,nota);
            }
        }catch(IOException e){
            System.out.println("No se pudo abrir el archivo");
        }catch(Exception e){
            System.out.println("No se pudieron castear los valores");
        }
    }
    
}
