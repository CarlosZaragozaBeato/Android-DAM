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
public class Ciudadano {
    
    private String nombre,provincia;
    private int sueldo, hijos;

    public Ciudadano() {
    }
    
    

    
    
    
    public Ciudadano(String nombre, String provincia, int sueldo, int hijos) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.sueldo = sueldo;
        this.hijos = hijos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getSueldo() {
        return sueldo;
    }

    public int getHijos() {
        return hijos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return nombre+", "+provincia+", "+sueldo+", "+hijos;
    }
    
    
    
    
    
    
}
