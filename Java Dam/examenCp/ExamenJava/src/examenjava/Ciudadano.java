/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjava;

/**
 *
 * @author carlo
 */
public class Ciudadano  implements Comparable<Ciudadano>{
    private String nombre, provincia;
    private double sueldo;
    private int hijos;

    public Ciudadano(String nombre, String provincia, double sueldo, int hijos) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.sueldo = sueldo;
        this.hijos = hijos;
    }

    public Ciudadano() {
    }

    @Override
    public String toString() {
        return   nombre + " " + provincia + ", " + sueldo + "," + hijos ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }
    
    @Override
    public int compareTo(Ciudadano o) {
        /*De menor a mayor
        Si el nuestro es mayor -> 1
        Si el nuestro es menor -> -1
        Si el nuestro es igual -> 0
        De mayor a menor al reves*/
        
        int comparador=0;
        if(this.sueldo > o.getSueldo()){
            comparador = -1;
        }else if (this.sueldo < o.getSueldo()){
            comparador = 1;
        }
        return comparador;
    }
    
}
