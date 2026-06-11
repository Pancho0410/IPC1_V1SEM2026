
package principal;


public class Estudiante {
    
    private String nombre;
    private int edad;

    public Estudiante(){
    }
    
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void Saludar(){
        System.out.println("HOLA SOY UN ESTUDIANTE, MI NOMBRE ES: " + nombre);
        System.out.println("MI EDAD ES: " + edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        if(edad > 18){
            this.edad = edad;
        }else{
            System.out.println("NO CUMPLE CON LA EDAD");
        }
        
    }
    
    
    
    
}
