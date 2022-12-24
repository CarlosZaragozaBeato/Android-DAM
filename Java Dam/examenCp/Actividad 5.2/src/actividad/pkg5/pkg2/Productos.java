/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg5.pkg2;

/**
 *
 * @author usumaniana1
 */
public class Productos {
    
    private String nombre;
    private double precio;
    private int iva;

    public Productos() 
    {
        
    }
    
    

    public Productos(String nombre, double precio, int iva) 
    {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getIva() {
        return iva;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}
