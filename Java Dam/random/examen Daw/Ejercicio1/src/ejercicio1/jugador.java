
package ejercicio1;


public class jugador {
 
    private String nombre;
    private double presupuesto;
    private int goles;

    public jugador() {
    }

    public jugador(String nombre, double presupuesto, int goles) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.goles = goles;
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

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "jugador{" + "nombre=" + nombre + ", presupuesto=" + presupuesto + ", goles=" + goles + '}';
    }
    
    
    
}
