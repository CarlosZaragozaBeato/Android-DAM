
package principal;


public class Piloto {
    
    
    private String nombre, nacionalidad;
    private Escuderia esc1;
    private Bolido coche;
    private int puntos;

    public Piloto(Escuderia esc1, Bolido coche) {
        this.esc1 = esc1;
        this.coche = coche;
    }

    public Piloto(String nombre, String nacionalidad, Escuderia esc1, Bolido coche, int puntos) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.esc1 = esc1;
        this.coche = coche;
        this.puntos = puntos;
    }
    
    
    
    
    public boolean haPuntuado(){
        
        boolean haPuntuado;
        if(getPuntos()>0){
            haPuntuado = true;
        }else{
            haPuntuado = false;
        }
        
        return haPuntuado;
        
    }

    @Override
    public String toString() {

        return "El nombre del piloto es "+getNombre()+" ,su nacionalidad es "+getNacionalidad()+" ,el nombre de la escudería es "+esc1.getNombre()+" ,el nombre del coche que conduce es " +coche.getNombre()+ " , y los puntos que tiene el piloto son "+getPuntos();
        
    }
    
    
    
    
    
    
    
    
    
    
    /*
                     Clase Piloto


o Método denominado haPuntuado, que devuelve TRUE si dispone de más de 0 
puntos y FALSE en caso contrario (utilizar el operador condicional).
o Método toString(). Devuelve una cadena de texto donde se detalle el nombre 
del piloto, la nacionalidad, el nombre de la escudería a la que pertenece, el 
nombre del coche que conduce y el número de puntos acumulados.

    
    */

    public Piloto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Escuderia getEsc1() {
        return esc1;
    }

    public void setEsc1(Escuderia esc1) {
        this.esc1 = esc1;
    }

    public Bolido getCoche() {
        return coche;
    }

    public void setCoche(Bolido coche) {
        this.coche = coche;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
     public void setPuntos(int puntos, int aumento) {
        this.puntos = this.puntos + aumento;
    }
    
    
    
    
    
    
    
    
    
    
}
