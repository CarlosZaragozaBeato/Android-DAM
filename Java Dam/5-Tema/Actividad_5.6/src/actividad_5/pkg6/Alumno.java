
package actividad_5.pkg6;

import java.io.Serializable;


public class Alumno implements Serializable {
    
    private String dni, nombre, apellidos,mail;
    private int movil;
    private Calificación calificacion;

    public Alumno(String dni, String nombre, String apellidos, int movil,String mail, Calificación calificacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.movil = movil;
        this.mail = mail;
        this.calificacion = calificacion;
        
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public Calificación getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificación calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return   dni;
    }
    
    
    
}
