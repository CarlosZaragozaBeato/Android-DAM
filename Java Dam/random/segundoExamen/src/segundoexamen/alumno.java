/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoexamen;

/**
 *
 * @author carlo
 */
public class alumno {
    
    private String matricula, nombre, apellidos, fechaNacimiento;
    private double altura,peso;

    public alumno() {
    }

    public alumno(String matricula, String nombre, String apellidos, String fechaNacimiento, double altura, double peso) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "alumno{" + "matricula=" + matricula + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
    
    public static alumno crear(){
        
    }
    
    
    /*
           

Además, programa dentro de la clase un método estático (denominado crear) que devuelva un 
objeto de la clase Alumno, esta sería la cabecera del método:
public static Alumno crear()
Este método pedirá por teclado, los datos de cada uno de los atributos (si el usuario introduce 
un dato erróneo se lo volverá a pedir hasta que el dato sea correcto), teniendo en cuenta las 
siguientes restricciones:
 El formato de la matrícula debe ser correcto, es decir, Letra-Número. 
 Los atributos nombre y apellidos no pueden estar vacíos.
 El formato de la fecha debe ser correcto, además hay que tener en cuenta que el mes 
esté comprendido entre los valores 1 y 12 y el día máximo depende del mes y del año 
especificado.
 La altura, será decimal, su valor mínimo será de 0.40 y el valor máximo 2.35.
 El peso es un número decimal cuyo valor debe estar entre 2.0 y 350.99.
Una vez solicitados todos los datos y verificados que son correctos, instancia un objeto de la 
clase Alumno pasándole a través de su constructor todos los datos y devuélvelo.
En la función principal, crea un objeto de la clase Alumno utilizando el método crear y visualiza 
su contenido con el método toString
        
        Ejercicio 2. Crea una clase denominada Cadena, tendrá un atributo de tipo cadena de 
caracteres. Implementar los siguientes métodos:
 Constructor por defecto, y constructor que permita inicializar el atributo de la clase
mediante un parámetro.
 Métodos tanto para consultar como para modificar el atributo de la clase.
 Método subcadena, su cabecera es la siguiente:
public String subcadena(int posInicial, int posFinal)
Devuelve la subcadena existente entre la posición inicial y final pasadas por 
parámetro, por ejemplo:
Letra h o l a q u e t a l
Posición 1 2 3 4 5 6 7 8 9 10 11 12
Ejemplos de ejecución con diferentes valores:
o subcadena(2,7). La función devolverá ola qu
o subcadena(8,5). La función devolverá el texto “La posición final debe ser 
mayor a la posición inicial”.
o subcadena(9,15). La función devolverá el texto “La posición final ha 
sobrepasado la longitud de la cadena”.
 Método invertir, la cabecera de la función es la siguiente:
public String invertir()
Devuelve la cadena invertida (el último carácter ocupará la primera posición, el 
penúltimo el segundo, etc.), por ejemplo, si disponemos de la cadena “Hola que tal”, la 
función devolverá “lat euq aloH”.
En la función del programa principal, crea un objeto de tipo Cadena y prueba cada uno de los 
métodos desarrollados anteriormente
        
        */

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
