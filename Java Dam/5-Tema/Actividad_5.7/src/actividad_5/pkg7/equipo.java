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
public class equipo implements Serializable, Comparable{
    private String nombre;
    private double puntos;
    private String entrenador;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public equipo(String nombre, double puntos, String entrenador) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.entrenador = entrenador;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(Object o) {

        equipo e = (equipo)o;
        return nombre.compareTo(e.getNombre()); 
    }

  
 
 
}
