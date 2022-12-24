/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimorepasoexamen;

/**
 *
 * @author david
 */
public class CiudadanoEvasor {
    
    private String nombre;
    private double cantidadEvadida;

    public CiudadanoEvasor() {
    }

    public CiudadanoEvasor(String nombre) {
        this.nombre = nombre;
    }

    
    
    
    public CiudadanoEvasor(String nombre, double cantidadEvadida) {
        this.nombre = nombre;
        this.cantidadEvadida = cantidadEvadida;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidadEvadida() {
        return cantidadEvadida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadEvadida(double cantidadEvadida) {
        this.cantidadEvadida = cantidadEvadida;
    }

    @Override
    public String toString() {
        return "CiudadanoEvasor{" + "nombre=" + nombre + ", cantidadEvadida=" + cantidadEvadida + '}';
    }
    
    
    
}
