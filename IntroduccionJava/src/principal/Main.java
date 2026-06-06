
package principal;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        int valor1;
        double valor2;
        String valor3;
        System.out.println("Ingreso de datos con scanner");
        valor1 = Integer.parseInt(consola.nextLine());
        valor2 = Double.parseDouble(consola.nextLine());
        valor3 = consola.nextLine();
        
        
        System.out.println("valor1 = " + valor1);
        System.out.println("valor2 = " + valor2);
        System.out.println("valor3 = " + valor3);
        
        int edad = 20;
        double promedio = 85.3;
        char letra = 'A';
        boolean aprobado = true;
        String nombre = "Carlos";
        //System.out.println("Tamaño de mi cadena:" + nombre.length());
        
        /*System.out.println("edad = " + edad);
        System.out.println("promedio = " + promedio);
        System.out.println("letra = " + letra);
        System.out.println("aprobado = " + aprobado);
        System.out.println("nombre = " + nombre);*/
        
        String bloque = """
                        Hola mundo
                        Mi nombre es: Tobías
                        Saludos
                        """;
        
        //System.out.println("bloque = " + bloque);
        
        int numero1 = 11;
        int numero2 = 5;
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int residuo = numero1 % numero2;
        
        /*System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(residuo);*/
        
        //System.out.print("INGRESA TU NOMBRE: ");
        //String nombrePorConsola = consola.nextLine();
        //System.out.println("nombrePorConsola = " + nombrePorConsola);
        
        String numeroTexto = "40";
        int numeroReal = Integer.parseInt(numeroTexto);
        double numeroFlotante = Double.parseDouble(numeroTexto);
        
        /*System.out.println("numeroReal = " + numeroReal);
        System.out.println("numeroFlotante = " + numeroFlotante);
        
        int total = numeroReal + (int)numeroFlotante;
        System.out.println("total = " + total);*/
        
        
       
        
    }
    
}
