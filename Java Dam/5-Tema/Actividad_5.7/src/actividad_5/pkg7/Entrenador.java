/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_5.pkg7;

import java.io.Serializable;

/**
 *
 * @author usumaniana1
 */
public class Entrenador implements Serializable, Comparable {
    private String nombre;
    private int edad;

    public Entrenador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        Entrenador e = (Entrenador)o;
        return nombre.compareTo(e.getNombre()); 
    }
    
    
}
