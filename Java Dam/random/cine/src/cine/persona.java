/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author carlo
 */
public class persona {
    
    private int edad;
    private String nombre,apellidos,dni,telefono;

    public persona() {
    }

    public persona(String nombre, String apellidos, String dni, String telefono) {
        
        this.edad =(int)(Math.random()*(60-5))+5;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "persona{" + "edad=" + edad + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", telefono=" + telefono + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public static int colaCine(){
     int numCola;
     
     numCola=(int)(Math.random()*(60-5))+5;
     
     return numCola;
    }
}
