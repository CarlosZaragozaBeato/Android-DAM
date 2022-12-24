/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut5.practica1;

/**
 *
 * @author usumaniana1
 * @since 15/03/2022
 * @version version 1
 * 
 */
public class Persona {
    private String nombre, apellido1, apellido2;

    /**
     * 
     * @param nombre nombre de la persona
     * @param apellido1 primer apellido de la persona
     * @param apellido2 segundo apellido de la persona
     */
    public Persona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    /**
     * 
     * @param nombre nombre de la persona
     * @param apellido1 primer apellido de la persona
     */
    public Persona(String nombre, String apellido1) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
    }

    /**
     * 
     * @return del nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @return del primer apellido
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * 
     * @return del segundo apellido 
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * 
     * @param nombre cambio de nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @param apellido1 cambio de primer apellido 
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * 
     * @param apellido2 cambio del segundo apellido
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * 
     * @return Retorna el nombre con su primer apellido y segundo apellido.
     */
    @Override
    public String toString() {
        return nombre+" "+apellido1+" "+apellido2;
    }
    
    
    
}
