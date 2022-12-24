/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laliga;

import java.io.Serializable;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author usumaniana1
 */
public class Equipo implements Serializable, Comparable {
    
    private String nombre;
    private int puntos, presupuesto;

 
    public Equipo() {
        this.nombre ="Anonimo";
        this.puntos=0;
        this.presupuesto=0;
    }

    public Equipo(String nombre, int puntos, int presupuesto) throws EPresupuestoIlegal  {
        this.nombre = nombre;
        this.puntos = puntos;
        if(presupuesto>0){
             this.presupuesto = presupuesto;
        }else{
            
            throw new EPresupuestoIlegal(presupuesto);
             
        }
       
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setPresupuesto(int presupuesto) throws EPresupuestoIlegal{
         if(comprobarPresupuesto()){
             this.presupuesto = presupuesto;
        }else{
            throw new EPresupuestoIlegal(presupuesto);
        }
    }

    @Override
    public String toString() {
        return nombre+","+puntos+","+presupuesto;
    }

    @Override
    public int compareTo(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        Equipo e = (Equipo)o;
        return nombre.compareTo(e.getNombre()); 
    }
    
    public boolean comprobarPresupuesto(){
        
        if(this.presupuesto<0){
            return false;
        }else{
            return true;
        }
        
    }
   
}
