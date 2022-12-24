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
public class ALUMNO extends Persona{
    
    private String telefono = "", direccion="";
    private DNI dni;
    private Ciclo cl1;
/**
 * 
 * @param nombre nombre del alumno
 * @param apellido1 primer apellido del alumno
 * @param apellido2 segundo apellido del alumno
 * @param letra letra del dni del alumno 
 * @param numero numero del dni
 * @param cl1 ciclo del alumno
 */
 public ALUMNO(String nombre, String apellido1, String apellido2, int numero, String letra, Ciclo cl1) {
       
   
        super(nombre, apellido1,apellido2);
        this.dni = new DNI(numero, letra);
        this.cl1 = cl1;
    }

/**
 * 
 * @return del dni
 */
  public String getDNI (){
        return dni.toString();
   }


    /**
     * 
     * @return devuelve telefono 
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * 
     * @param telefono cambiar el telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * 
     * @return  devuelve la dirección 
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * 
     * @param direccion cambia la dirección
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
     * @param dni cambia el dni
     */
    public void setDni(DNI dni) {
        this.dni = dni;
    }

    /**
     * 
     * @return devuelve el ciclo
     */
    public Ciclo getCl1() {
        return cl1;
    }
    /**
     * 
     * @param cl1 cambia el ciclo
     */
    public void setCl1(Ciclo cl1) {
        this.cl1 = cl1;
    }
    /**
     * 
     * @return devuelve la correspondiente al alumno.
     */
     @Override
    public String toString() {
        if(!direccion.equals("") && !telefono.equals("")){
           return super.getNombre()+" "+super.getApellido1()+" "+super.getApellido2()+" "+this.dni+ " " + this.direccion+" "+ this.cl1.getNombre();
        }
           
           return super.getNombre()+" "+super.getApellido1()+" "+super.getApellido2()+" "+this.cl1.getNombre();
    }
    
  
    
    
    
}
