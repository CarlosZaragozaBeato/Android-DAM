/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendaw;

/**
 *
 * @author usumaniana1
 */
public class Ciclista {
    private String nombre, equipo, sexo;
    private int hematocrito, peso;

    public Ciclista() {
    }

    public Ciclista(String nombre, String equipo, String sexo, int hematocrito, int peso) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.sexo = sexo;
        this.hematocrito = hematocrito;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getSexo() {
        return sexo;
    }

    public int getHematocrito() {
        return hematocrito;
    }

    public int getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setHematocrito(int hematocrito) {
        this.hematocrito = hematocrito;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nombre;
    }   
}
