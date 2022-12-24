/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaragozafranciscocarlos;

/**
 *
 * @author usumaniana1
 */
public class ciclistaSancionado {
    
    private String nombreSancionado,sancion;

    public ciclistaSancionado(String nombreSancionado, String sancion) {
        this.nombreSancionado = nombreSancionado;
        this.sancion = sancion;
    }

    public String getNombreSancionado() {
        return nombreSancionado;
    }

    public void setNombreSancionado(String nombreSancionado) {
        this.nombreSancionado = nombreSancionado;
    }

    public String getSancion() {
        return sancion;
    }

    public void setSancion(String sancion) {
        this.sancion = sancion;
    }

    @Override
    public String toString() {
        return nombreSancionado;
    }
    
    
    
}
