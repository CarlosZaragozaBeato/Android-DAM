/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author carlo
 */
public class Categoria extends Utilidades{
    
    private int codigo;
    private String nombre;
    private static int nextCodigo=1;
    
    
     public Categoria() {
        this.codigo = nextCodigo;
        this.nombre = "";
        nextCodigo++;
     }
    
     public Categoria(String nombre) {
      
         
        this.nombre = getFormatoNombre(nombre);;
        this.codigo = nextCodigo;
        nextCodigo++;
    }
     
    public void setNombre(String nombre) {
        this.nombre = getFormatoNombre(nombre);
    }
     

    
  
    @Override
    public String toString() {
        return "Categoria{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
  
    /*
    
        Clase Categoria
 Almacenará el código y el nombre de la categoría.
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
nextCodigo. El nombre de la categoría debe almacenarse con la primera letra 
en mayúscula y el resto de caracteres en minúscula, por tanto, deberás hacer 
uso del método getFormatNombre de la clase Utilidades.
o Métodos para consultar cada uno de los atributos de la clase, excepto el 
atributo estático.
o Método para modificar el atributo nombre. Recuerda que el nombre de la 
cadena se almacena con la primera letra en mayúscula y el resto en minúscula.
o Método toString(). Devuelve una cadena de texto donde se detalle el nombre 
el código de la categoría
    */



  

   
   
}
