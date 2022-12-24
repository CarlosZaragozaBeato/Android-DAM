
package actividad1.pkg1;


public class Disco extends Multimedia {
    
    private String grupoMusical, fechaLanzamiento;

    @Override
    public String toString() {
        return super.toString() +"Disco{" + "grupoMusical=" + grupoMusical + ", fechaLanzamiento=" + fechaLanzamiento + '}';
    }
    
    
    
    /*
    Escribe una clase Disco que herede de la clase Multimedia anterior. La clase Disco tiene,
además de los atributos heredados, el nombre del grupo musical, y la fecha de lanzamiento del
disco. La clase debe tener dos métodos para obtener los nuevos atributos. Además, debe
sobreescribir el método toString() para reflejar la nueva información, es decir, además de
imprimir por pantalla el valor de todos los atributos de su clase padre (clase Multimedia),
deberá mostrar el valor de los atributos propios de la clase disco.*/

    public String getGrupoMusical() {
        return grupoMusical;
    }

    public void setGrupoMusical(String grupoMusical) {
        this.grupoMusical = grupoMusical;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    
}
