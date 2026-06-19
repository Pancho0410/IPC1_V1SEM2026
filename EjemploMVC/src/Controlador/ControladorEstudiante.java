
package Controlador;

import Modelo.Estudiante;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ControladorEstudiante {
    
    public Estudiante[] estudiantes;
    public static int contador = 1;
    
    public ControladorEstudiante(){
        leerBinario();
    }
    
    public void AgregarEsutdiante(String nombre, int edad, double nota){
        for(int i =0; i<estudiantes.length;i++){
            if(estudiantes[i]==null){
                Estudiante nuevoEstudiante = new Estudiante(contador,nombre,edad,nota);
                estudiantes[i]= nuevoEstudiante;
                contador++;
                escribirBinario();
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
                escribirBinario();
                break;
            }
        }
    }
    
    public void LlenarTabla(DefaultTableModel tabla){
        tabla.setRowCount(0);
        for(Estudiante es: estudiantes){
            if(es!=null){
                tabla.addRow(new Object[]{es.getId(),es.getNombre(),es.getEdad(),es.getNota(),"Editar","Eliminar"});
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
    
    public void llenarFormulario(JTextField nombre, JTextField edad, JTextField nota,int id){
        for(Estudiante es: estudiantes){
            if(es!=null && es.getId()==id){
                nombre.setText(es.getNombre());
                edad.setText(Integer.toString(es.getEdad()));
                nota.setText(Double.toString(es.getNota()));
                break;
            }
        }
    }
    
    public void ModificarEstudiante(int id,String nombre, int edad, double nota){
        for(Estudiante es: estudiantes){
            if(es!=null && es.getId()==id){
                es.setNombre(nombre);
                es.setEdad(edad);
                es.setNota(nota);
                break;
            }
        }
        escribirBinario();
    }
    
    public void eliminarEstudiante(int id){
        for(int i=0;i<estudiantes.length;i++){
            if(estudiantes[i]!=null && estudiantes[i].getId()==id){
                estudiantes[i]=null;
                break;
            }
        }
        escribirBinario();
    }
    
    public void escribirBinario(){
        try(FileOutputStream is = new FileOutputStream("estudiantes.bin");
            ObjectOutputStream out = new ObjectOutputStream(is); 
            ){
            out.writeObject(estudiantes);
        }catch(Exception e){
            System.out.println("OCURRIO UN ERRO AL GUARDAR LOS DATOS");
        }
    }
    
    public void leerBinario(){
        Estudiante[] listaLeida = null;
        try(FileInputStream ip = new FileInputStream("estudiantes.bin");
            ObjectInputStream in = new ObjectInputStream(ip); 
            ){
            listaLeida = (Estudiante[]) in.readObject();
        }catch(Exception e){
            System.out.println("OCURRIO UN ERRO AL GUARDAR LOS DATOS");
        }
        
        if(listaLeida !=null){
            estudiantes = listaLeida;
        }else{
            this.estudiantes = new Estudiante[15];
        }
    }
    
}
