
package actividad.pkg5.pkg5;

import java.io.Serializable;


public class Pelicula implements Serializable {
    
    private String titulo, director, categoria,fechaEstreno,imagen;

    public Pelicula(String titulo, String director, String categoria, String fechaEstreno, String imagen) {
        this.titulo = titulo;
        this.director = director;
        this.categoria = categoria;
        this.fechaEstreno = fechaEstreno;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return  fechaEstreno + " - " +titulo   ;
        
    }
    
    
    
}
