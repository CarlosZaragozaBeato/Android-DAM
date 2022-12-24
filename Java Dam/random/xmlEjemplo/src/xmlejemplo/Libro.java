/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlejemplo;

/**
 *
 * @author usumaniana1
 */
public class Libro {
    private String isbn;
    private String autor;
    private String titulo;
    private int precio;

    public Libro() {
    }

    public Libro(String isbn, String autor, String titulo, int precio) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro: " + "isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", precio=" + precio;
    }
    
}
