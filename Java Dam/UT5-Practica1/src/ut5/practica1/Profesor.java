/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut5.practica1;

/**
 *
 * @author usumaniana1 
 */
public class Profesor extends Persona{
    
    
    private DNI dni;

/**
 * 
 * @param nombre nombre del Profesor
 * @param apellido1 primer apellido del profesor
 * @param apellido2 segundo apellido del profesor
 * @param numero numero del dni del profesor
 * @param letra letra del dni del profesor
 */
public Profesor(String nombre, String apellido1, String apellido2, int numero, String letra) {
        
        super(nombre, apellido1,apellido2);
        this.dni = new DNI((int)numero, letra);
    }

/**
 * 
 * @return devuelve el dni
 */
    public DNI getDni() {
        return dni;
    }

    /**
     * 
     * @return Retorna el nombre con su primer apellido y segundo apellido.
     */
    @Override
    public String toString() {
        return super.getNombre()+" "+super.getApellido1()+" "+super.getApellido2()+", "+ this.dni;
    }
    
    
    
    
    
}
