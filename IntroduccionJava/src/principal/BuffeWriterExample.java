
package principal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BuffeWriterExample {
    public static void main(String[] args) {
        File miArchivo = new File("datos.txt");
        boolean existe = miArchivo.exists();
        String miNombre = "Tobias Francisco";
        int edad = 15;
        String ciudad = "Antigua";
        
        if(existe){
            System.out.println("EL ARCHIVO EXISTE");
            System.out.println(miArchivo.getAbsolutePath());
        }else{
            System.out.println("EL ARCHIVO NO EXISTE");
        }
        try(FileWriter fw = new FileWriter("datos.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw)){
                pw.println("Mi nombre es: "+miNombre);
                pw.println("Mi edad es: "+edad);
                pw.println("Yo vivo por la: "+ciudad);
                
            }catch (Exception e){
                System.out.println("ERROR AL ESCRIBIR EN EL ARCHIVO");
            }
    }
    
}
