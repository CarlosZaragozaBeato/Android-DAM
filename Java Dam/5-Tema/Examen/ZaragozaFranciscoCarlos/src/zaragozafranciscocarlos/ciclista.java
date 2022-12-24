package zaragozafranciscocarlos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usumaniana1
 */
public class ciclista {
    private String nombre,equipo,sexo;
    private int hematocrito;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getHematocrito() {
        return hematocrito;
    }

    public void setHematocrito(int hematocrito) {
        this.hematocrito = hematocrito;
    }

    public ciclista(String nombre, String equipo, String sexo, int hematocrito) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.sexo = sexo;
        this.hematocrito = hematocrito;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}
