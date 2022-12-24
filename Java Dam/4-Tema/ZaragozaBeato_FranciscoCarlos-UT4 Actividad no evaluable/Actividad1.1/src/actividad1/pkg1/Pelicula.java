
package actividad1.pkg1;

public class Pelicula extends Multimedia {
    
    private String actorPrincipal,actrizPrincipal;

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }






    
    
   @Override
     public String toString(){
      return super.toString() +"Pelicula{" + "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + '}';
  }  
    
        
    
    
    /**
     * 
     *  Escribe una clase Película que herede de la clase Multimedia anterior. La clase Película tiene,
además de los atributos heredados, un actor principal y una actriz principal. La clase debe
tener dos métodos tanto para obtener como para modificar los nuevos atributos. Además,
debe sobreescribir el método toString() para reflejar la nueva información, es decir, además de
imprimir por pantalla el valor de todos los atributos de su clase padre (clase Multimedia),
deberá mostrar el valor de los atributos propios de la clase película.
     */
    
    
}
