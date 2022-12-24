/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg5.pkg7.buena;

/**
 *
 * @author david
 */
public class Equipo {
    private String nombreEquipo, nombreEntrenador;
    private int puntos;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, String nombreEntrenador, int puntos) {
        this.nombreEquipo = nombreEquipo;
        this.nombreEntrenador = nombreEntrenador;
        this.puntos = puntos;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombreEquipo+","+puntos;
    }
    
    public int compareTo(Object o) {
        int r=1;
        
        if(nombreEntrenador.equals(o)){
            r = 0;
        }
        
        return r;

    }
    
    
}
