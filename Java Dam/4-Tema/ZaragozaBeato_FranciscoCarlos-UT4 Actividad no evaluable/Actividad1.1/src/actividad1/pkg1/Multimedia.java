    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1.pkg1;

/**
 *
 * @author usumaniana1
 */
public class Multimedia {
    
    
    /*
        Apartado A
Escribe una clase Multimedia para almacenar información de los objetos de tipo multimedia
(películas, discos, mp3,mp4…). Esta clase contiene título, autor, formato, y duración como
atributos. Esta clase será una superclase, y sus atributos podrán heredarse.
Crea los métodos tanto para consultar como para modificar cada uno de los atributos, además
del constructor por defecto, y un constructor con todos los parámetros asociados a cada uno
de los atributos de la clase. También crea el método toString, que devuelve una cadena de
caracteres con los valores de cada uno de los atributos.
Ten en cuenta que el formato puede ser uno de los siguientes: wav, mp3, midi, avi, mov, mpg,
cdAudio y dvd. Luego tanto en el constructor como en el método que modifica el atributo
formato, deberás verificar que el formato a almacenar corresponde a uno de los tipos
indicados anteriormente (te recomiendo que lo hagas con la sentencia switch).
Por último, crea un método identico() que recibe un objeto de tipo Multimedia y devuelve true
en caso de que el título y el autor sean iguales y false en caso contrario.
    */
    
    
    private String titulo, autor, formato;
    private double duracion;

    public Multimedia() {
    }

    
    public boolean identico(Multimedia mult){
        boolean identico=true;
        if(mult.titulo.equals(mult.autor)){
            identico =true;
        }else{
            identico = false;
        }
        
        return identico;
        
    }
    
    public Multimedia(String titulo, String autor, String formato, double duracion) {
      
        
        this.titulo = titulo;
        this.autor = autor; 
        this.duracion = duracion;
        
        switch(formato){
            
            case "mp3":
                this.formato = formato;
            break;
            
            case "wav":
                this.formato = formato;
            break;
            case "midi":
                this.formato = formato;
            break;
             case "avi":
                this.formato = formato;
            break;
             case "mov":
                this.formato = formato;
            break;
             case "mpg":
                this.formato = formato;
            break;
              
            
        }
    }

    @Override
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion + '}';
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    
}
