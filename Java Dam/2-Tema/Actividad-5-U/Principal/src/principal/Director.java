
package principal;


public class Director {

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Director{" + "codigo=" + codigo + ", peliculasDirigidas=" + peliculasDirigidas + ", nacionalidad=" + nacionalidad + ", nombreCompleto=" + nombreCompleto + '}';
    }

    public int getPeliculasDirigidas() {
        return peliculasDirigidas;
    }
    public void setPeliculasDirigidas(int peliculasDirigidas, int aumento) {
        this.peliculasDirigidas = peliculasDirigidas+aumento;
    }
    public void setPeliculasDirigidas(int peliculasDirigidas) {
        this.peliculasDirigidas = peliculasDirigidas;
    }
    

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public static int getNextCodigo() {
        return NextCodigo;
    }

    public static void setNextCodigo(int NextCodigo) {
        Director.NextCodigo = NextCodigo;
    }
    
    /*Clase Director
 Almacena datos como son: código, nombre (en este atributo se almacena tanto el
nombre como el primer apellido), nacionalidad. También dispone de un atributo donde
guarde el número de películas dirigidas.
 Dispone de un atributo estático utilizado para generar los códigos de los directores
nuevos.
 Métodos:
o Constructor por defecto. Genera el valor del atributo código, e inicializa a 0 el
atributo asociado al número de películas dirigidas.
o Constructor con parámetros donde inicializa cada uno de los atributos de la
clase excepto los atributos código y número de películas dirigidas (no se
reciben por parámetro). Para el caso del código su valor se genera utilizando el
atributo estático de la clase, y para el número de películas se inicializará al
valor de 0.
o Métodos para consultar los valores de todos los atributos de la clase, excepto
el atributo estático.
o Métodos para modificar todos los atributos de la clase excepto el código y el
atributo estático.
o Método toString(). Devuelve una cadena de texto donde se detalla el código,
las iniciales del nombre (haz uso del método getIniciales de la clase Utilidades),
y el número de películas que ha dirigido.*/
    
    
    
    private int codigo, peliculasDirigidas ;
    private String nacionalidad, nombreCompleto;
    private static int NextCodigo=1;

    public Director() {
        
        this.codigo = NextCodigo;
        this.peliculasDirigidas = 0;        
        NextCodigo++;   
    }

    public Director(String nacionalidad, String nombreCompleto) {
        this.codigo = NextCodigo;
        this.peliculasDirigidas = 0;
        this.nacionalidad = nacionalidad;
        this.nombreCompleto = nombreCompleto;
    }

    public Director(int peliculasDirigidas, String nacionalidad, String nombreCompleto) {
        this.peliculasDirigidas = peliculasDirigidas;
        this.nacionalidad = nacionalidad;
        this.nombreCompleto = nombreCompleto;
    }

    public Director(int codigo, int peliculasDirigidas, String nacionalidad, String nombreCompleto) {
        this.codigo = codigo;
        this.peliculasDirigidas = peliculasDirigidas;
        this.nacionalidad = nacionalidad;
        this.nombreCompleto = nombreCompleto;
    }
    
    
    
    
    
    
    
    
    
}
