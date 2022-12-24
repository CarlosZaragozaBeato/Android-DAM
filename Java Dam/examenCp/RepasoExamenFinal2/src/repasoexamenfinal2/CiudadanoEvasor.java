/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoexamenfinal2;

/**
 *
 * @author david
 */
public class CiudadanoEvasor {
    
    private String nombre;
    private int cantidadEvadida;

    public CiudadanoEvasor() {
    }

    public CiudadanoEvasor(String nombre) {
        this.nombre = nombre;
    }
    
    

    public CiudadanoEvasor(String nombre, int cantidadEvadida) {
        this.nombre = nombre;
        this.cantidadEvadida = cantidadEvadida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadEvadida() {
        return cantidadEvadida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadEvadida(int cantidadEvadida) {
        this.cantidadEvadida = cantidadEvadida;
    }

    @Override
    public String toString() {
        return nombre+", "+cantidadEvadida;
    }
    
    
    
}
