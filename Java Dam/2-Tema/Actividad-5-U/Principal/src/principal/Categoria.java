
package principal;


public class Categoria {
    
    /*Almacenará un identificador y un nombre de la categoría.
 Además, dispone de un atributo estático de tipo entero denominado “nextCodigo”,
inicialmente su valor será de 1. Este atributo almacena el código de la siguiente
categoría a insertar.
 Métodos:
o Constructor por defecto, inicializa los atributos a los siguientes valores:
 Nombre: Cadena vacía (es decir, “”)
 Código: Corresponderá al valor que almacena el atributo nextCodigo,
no olvides actualizar el valor de nextCodigo (incrementa su valor en
una unidad).
o Constructor con parámetro (recibe únicamente el nombre de la categoría), el
valor del atributo código se generará utilizando el atributo estático
nextCodigo.
o Métodos para consultar cada uno de los atributos de la clase, excepto el
atributo estático.
o Método para modificar el atributo nombre.
o Método toString(). Devuelve una cadena de texto donde se detalle el nombre
y el identificador de la categoría.*/
    
    private String nombreCategoria;
    private static int nextCodigo=1;
    private int identificador;

    public Categoria() {
        
        this.nombreCategoria = "";
        this.identificador = nextCodigo;
        nextCodigo++;                                   
    }

    public Categoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
        this.identificador = nextCodigo;
        nextCodigo++; 
    }

    public Categoria(String nombreCategoria, int identificador) {
        this.nombreCategoria = nombreCategoria;
        this.identificador = identificador;
    }
    
    

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
    

    @Override
    public String toString() {
            
           return "Codigo: "+identificador+" Nombre Categoria: "+nombreCategoria;
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
