
package principal;


public class Pelicula{
    
    /*Clase Pelicula
 Guarda datos como son: un código, título, fecha de lanzamiento, unidades disponibles
en el videoclub, así como un objeto donde se asocie a la categoría que pertenece, otro
objeto asociado al director y dos objetos donde se almacenen los actores que han
intervenido en la película (un actor principal, y otro actor secundario).
 También posee un atributo estático necesario para generar los códigos de las películas
nuevas.
 Métodos:
o Constructor por defecto. Genera el código de la película, ayudándose del valor
del atributo estático.
o Constructor con parámetros donde inicializa cada uno de los atributos de la
clase excepto el atributo código (no se recibe por parámetro), su valor se
genera utilizando el atributo estático de la clase. No olvides actualizar los
siguientes valores:
 El atributo número de películas dirigidas del objeto director.
 Para los dos objetos actores, si la película es del año 2018 habrá que
incrementar el campo número de películas en una unidad y sumarle 0
si la película es de otro año diferente.
o Métodos para consultar los valores de todos los atributos de la clase, excepto
el atributo estático.
o Métodos para modificar todos los atributos de la clase excepto el código y el
atributo estático.
o Método denominado esNovedad(), donde devolverá el valor de true si el año
de la fecha de lanzamiento de la película es el 2018 y false en caso contrario
(apóyate en el método getYear de la clase Utilidades).
o Método toString(). Devuelve una cadena de texto donde se detalle los valores
de los atributos de la clase (excepto el atributo estático) así como el nombre
de la categoría de la cual pertenece, el nombre del director y los nombres de
los actores que intervienen en ella.*/
    
    private int codigo, unidadesDisponibles;
    private String nombre, fechaLanzamiento,titulo;
    private static int NextCodigo=1;
    private Categoria c1;
    private Director d1;
    private Actor a1,a2;
    Utilidades u1 = new Utilidades();
    
    
    /*Metodos*/
    
    public  boolean esNovedad(Pelicula p1){
       int año =u1.getYear(fechaLanzamiento);
       boolean novedad =true;
      if(año == 2018){
         novedad = true;
      }else{
         novedad = false;
      }
        
     return novedad;
         
      
      
    }    
    
    /*Constructores*/
    public Pelicula() {
        
        this.codigo = NextCodigo;
        NextCodigo++;
    }

    public Pelicula(int unidadesDisponibles, String nombre, String fechaLanzamiento, String titulo, Categoria c1, Director d1, Actor a1, Actor a2) {
        this.unidadesDisponibles = unidadesDisponibles;
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.titulo = titulo;
        this.c1 = c1;
        this.d1 = d1;
        this.a1 = a1;
        this.a2 = a2;
        this.codigo = NextCodigo;
   
        a1.setNumPeliculas2018(a1.getNumPeliculas2018(), 1);
        a2.setNumPeliculas2018(a2.getNumPeliculas2018(), 1);
       
        if(u1.getYear(fechaLanzamiento)==2018){
            d1.setPeliculasDirigidas(d1.getPeliculasDirigidas(),1);
        }
        
        
        
        
        NextCodigo++;
    }

    public Pelicula(int codigo, int unidadesDisponibles, String nombre, String fechaLanzamiento, String titulo, Categoria c1, Director d1, Actor a1, Actor a2) {
        this.codigo = codigo;
        this.unidadesDisponibles = unidadesDisponibles;
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.titulo = titulo;
        this.c1 = c1;
        this.d1 = d1;
        this.a1 = a1;
        this.a2 = a2;
    }

    
    /*ToString*/
    @Override
    public String toString() {
        return "Pelicula{" + "codigo=" + codigo + ", unidadesDisponibles=" + unidadesDisponibles + ", nombre=" + nombre + ", fechaLanzamiento=" + fechaLanzamiento + ", titulo=" + titulo + ", c1=" + c1 + ", d1=" + d1 + ", a1=" + a1 + ", a2=" + a2 + '}';
    }
    
    
    /*Getters and Setters*/
     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
    
    public void setUnidadesDisponibles(int unidadesDisponibles,int aumento) {
        this.unidadesDisponibles = unidadesDisponibles+aumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static int getNextCodigo() {
        return NextCodigo;
    }

    public static void setNextCodigo(int NextCodigo) {
        Pelicula.NextCodigo = NextCodigo;
    }

    public Categoria getC1() {
        return c1;
    }

    public void setC1(Categoria c1) {
        this.c1 = c1;
    }

    public Director getD1() {
        return d1;
    }

    public void setD1(Director d1) {
        this.d1 = d1;
    }

    public Actor getA1() {
        return a1;
    }

    public void setA1(Actor a1) {
        this.a1 = a1;
    }

    public Actor getA2() {
        return a2;
    }

    public void setA2(Actor a2) {
        this.a2 = a2;
    }
    
    
}
