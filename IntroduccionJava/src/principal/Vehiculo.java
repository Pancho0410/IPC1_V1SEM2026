
package principal;


public class Vehiculo {
    //marca,modelo,anio,kilometraje,disponible
    private String marca;
    private String modelo;
    private int anio;
    private double kilometraje;
    private boolean disponible;
    private String imagen;
    
    public Vehiculo(String marca, String modelo, int anio, double kilometraje, boolean dispobible, String imagen){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.disponible = disponible;
        this.imagen = imagen;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
    
    
    
}
