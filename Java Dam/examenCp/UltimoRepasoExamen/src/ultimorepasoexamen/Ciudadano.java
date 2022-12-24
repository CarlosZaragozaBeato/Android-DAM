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
public class Ciudadano {
    
    private int hijos;
    private String provincia,nombre;
    private double sueldo;

    public Ciudadano() {
    }

    public Ciudadano(String nombre,String provincia, double sueldo, int hijos) {
        this.nombre = nombre;
        this.hijos = hijos;
        this.provincia = provincia;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHijos() {
        return hijos;
    }

    public String getProvincia() {
        return provincia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "nombre=" + nombre + ", hijos=" + hijos + ", provincia=" + provincia + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
