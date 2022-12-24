/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author carlo
 */
public class Equipo {
    
    
    private String nombre;
    private double presupuesto;
    private int puntos;
    private jugador jugadorFranquicia;

    public Equipo() {
    }

    public Equipo(String nombre, double presupuesto, int puntos, jugador jugadorFranquicia) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.puntos = puntos;
        this.jugadorFranquicia = jugadorFranquicia;
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

    public jugador getJugadorFranquicia() {
        return jugadorFranquicia;
    }

    public void setJugadorFranquicia(jugador jugadorFranquicia) {
        this.jugadorFranquicia = jugadorFranquicia;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", presupuesto=" + presupuesto + ", puntos=" + puntos + ", jugadorFranquicia=" + jugadorFranquicia + '}';
    }
    
    
    
   public jugador transferir(Equipo eq1){
       
       this.setJugadorFranquicia(eq1.getJugadorFranquicia());
       
       eq1.setJugadorFranquicia(null);
       
       return this.getJugadorFranquicia();
       
   }
    

}
