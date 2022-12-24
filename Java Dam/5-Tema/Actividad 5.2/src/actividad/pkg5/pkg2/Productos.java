
package actividad.pkg5.pkg2;


public class Productos {
    
    private String nombre;
    private double precio;
    private int iva;

    public Productos(String nombre, double precio, int iva) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
