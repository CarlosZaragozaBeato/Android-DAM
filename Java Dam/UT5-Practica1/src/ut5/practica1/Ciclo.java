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
public class Ciclo {
    private String  nombre;
    private int codigo;

    
    /**
     * 
     * @param codigo codigo del ciclo
     * @param nombre nombre del ciclo 
     */
    public Ciclo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    /**
     * 
     * @return  devuelve el codigo del ciclo
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * 
     * @return devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param codigo cambia el codigo del ciclo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * 
     * @param nombre cambia el nombre del ciclo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return muesta el nombre del circulo 
     */
    @Override
    public String toString() {
        return nombre;
    }

    
    
    
    
}
