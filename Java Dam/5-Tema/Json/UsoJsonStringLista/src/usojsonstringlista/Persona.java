/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usojsonstringlista;

/**
 *
 * @author usumaniana1
 */
public class Persona {
    private String nombre;
    private int edad;
    private String[]aficiones;
    public Persona(){
        
    }

    public Persona(String nombre, int edad, String[] aficiones) {
        this.nombre = nombre;
        this.edad = edad;
        this.aficiones = aficiones;
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

    public String[] getAficiones() {
        return aficiones;
    }

    public void setAficiones(String[] aficiones) {
        this.aficiones = aficiones;
    }

    @Override
    public String toString() {
        String aficiones="";
        for(String a:this.aficiones){
            aficiones+=a+",";
        }
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", aficiones=" + aficiones + '}';
    }
 
    
}
