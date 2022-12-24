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
public class CiclistaSancionado {
    
    private String nombre;
    private String sancion;

    public CiclistaSancionado(String nombre, String sancion) {
        this.nombre = nombre;
        this.sancion = sancion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSancion() {
        return sancion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSancion(String sancion) {
        this.sancion = sancion;
    }

    @Override
    public String toString() {
        return nombre;
    } 
}
