
package principal;

import java.io.Serializable;


public class Equipos implements Serializable,Comparable<Object> {
 
    private String nombre;
    private double presupuesto;
    private int puntos;

    public Equipos(String nombre, double presupuesto, int puntos) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.puntos = puntos;
    }

    public Equipos() {
        
        this.nombre ="Anonimo";
        this.presupuesto=0;
        this.puntos=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombre+','+puntos+','+presupuesto+" .";
    }

    @Override
    public int compareTo(Object o) {
        
        Equipos e= (Equipos)o;
        return nombre.compareTo(e.getNombre());
        
        /*    /*int r=0;
        if(this.puntos>e.getPuntos()){
            r=-1;
        }
        if(puntos<e.getPuntos()){
            r=1;
        }
        return r;*/
    }
    
    
}



