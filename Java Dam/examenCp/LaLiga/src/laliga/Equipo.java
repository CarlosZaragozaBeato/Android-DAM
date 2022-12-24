/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laliga;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author usumaniana1
 */
public class Equipo implements Serializable, Comparable {
    
    private String nombre;
    private int puntos, presupuesto;

    public Equipo() {
        this.nombre ="Anonimo";
        this.puntos=0;
        this.presupuesto=0;
    }

    public Equipo(String nombre, int puntos, int presupuesto) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return nombre+","+puntos+","+presupuesto;
    }

    @Override
    public int compareTo(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        Equipo e = (Equipo)o;
        return nombre.compareTo(e.getNombre()); 
    }
   
}
