
package principal;


public class Animal {
    protected String nombre;
    protected int edad;
    
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void comer(){
        System.out.println(this.nombre + " esta comiendo");
    }
    
    public void sonido(){
        System.out.println(this.nombre + " hace un sonido x");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    
}
