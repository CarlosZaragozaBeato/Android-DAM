/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infantesdavid;

/**
 *
 * @author usumaniana1
 */
public class Ciclista {
    private String nombre, equipo, sexo, sancion;
    private int hematocrito;

    public Ciclista() {
    }

    public Ciclista(String nombre, String equipo, String sexo, int hematocrito) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.sexo = sexo;
        this.hematocrito = hematocrito;
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

    @Override
    public String toString() {
        return nombre;
    }   
}
