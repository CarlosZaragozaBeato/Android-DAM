/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenisapp;

/**
 *
 * @author Usuario
 */
public class jugador {
    
    private int id,edad;
    private String nombre,nacionalidad,marca;

    public jugador(int id, int edad, String nombre, String nacionalidad,String marca) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }



    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    
    
    @Override
    public String toString() {
        return  "ID:"+id + " Edad:" + edad + " "  + " " + nombre + " " + nacionalidad +" "+marca;
    }
    public String showSponsor(){
        
        return nombre +" "+marca;
    }
}
