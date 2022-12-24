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
public class Actor {
    
    
    /*. Clase Actor
 Almacena datos como son: código, nombre, apellidos y número de oscars ganados.
También dispone de un atributo donde almacene el número de películas en las que ha
participado durante el año 2018.
 Dispone de un atributo estático utilizado para generar los códigos de los actores
nuevos.
 Métodos:
o Constructor por defecto. Genera el valor del atributo código, e inicializa a 0 el
atributo asociado al número de películas en las que ha actuado.
o Constructor con parámetros donde inicializa cada uno de los atributos de la
clase excepto los atributos código y número de películas en las que ha actuado
(no se reciben por parámetro). Para el caso del código su valor se genera
utilizando el atributo estático de la clase, y para el número de películas se
inicializará al valor de 0.
o Métodos para consultar los valores de todos los atributos de la clase, excepto
el atributo estático.
o Métodos para modificar todos los atributos de la clase excepto el código y el
atributo estático.
 Método toString(). Devuelve una cadena de texto donde se detalla el código, el
nombre y apellidos, así como el número de películas que ha intervenido durante el
2018.*/
    
    private int codigo, numOscars, numPeliculas2018;
    private String nombre, apellidos;
    private static int NextCodigo=1;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumOscars() {
        return numOscars;
    }

    public void setNumOscars(int numOscars) {
        this.numOscars = numOscars;
    }

    public int getNumPeliculas2018() {
        return numPeliculas2018;
    }

    public void setNumPeliculas2018(int numPeliculas2018, int aumento) {
        this.numPeliculas2018 = numPeliculas2018;
        this.numPeliculas2018 = aumento+numPeliculas2018;
    }
     public void setNumPeliculas2018(int numPeliculas2018) {
        this.numPeliculas2018 = numPeliculas2018;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public static int getNextCodigo() {
        return NextCodigo;
    }

    public static void setNextCodigo(int NextCodigo) {
        Actor.NextCodigo = NextCodigo;
    }

    public Actor() {
        
        this.codigo = NextCodigo;
        this.numPeliculas2018 = 0;
        NextCodigo++;
    }

    public Actor(int numOscars, String nombre, String apellidos) {
        this.numOscars = numOscars;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = NextCodigo;
        this.numPeliculas2018 = 0;
        NextCodigo++;
    }

    public Actor(int codigo, int numOscars, int numPeliculas2018, String nombre, String apellidos) {
        this.codigo = codigo;
        this.numOscars = numOscars;
        this.numPeliculas2018 = numPeliculas2018;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Actor(int numOscars, int numPeliculas2018, String nombre, String apellidos) {
        this.numOscars = numOscars;
        this.numPeliculas2018 = numPeliculas2018;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Actor:" +"Nombre: "+nombre+". Apellidos: "+apellidos+ ". Películas que ha intervenido durante el 2018: "+ numPeliculas2018;
    }
    
    
    
    
    
    
}
