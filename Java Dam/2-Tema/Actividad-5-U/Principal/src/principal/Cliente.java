
package principal;

public class Cliente {
    
    /* Clase Cliente
 Almacena datos como son: código, nombre, apellidos, móvil. También dispone de un
atributo denominado “saldo” que almacenará el saldo del que dispone en la cuenta del
videoclub, y un atributo donde almacenará el número de películas alquiladas.
 Dispone de un atributo estático utilizado para generar los códigos de los clientes
nuevos.
 Métodos:
o Constructor por defecto. Genera el valor del atributo código, e inicializa a 0 los
atributos de número de películas alquildas.
o Constructor con parámetros donde inicializa cada uno de los atributos de la
clase excepto los atributos código y número de películas (no se reciben por
parámetro). Para el caso del código su valor se genera utilizando el atributo
estático de la clase, y para el atributo número de peliculas se inicializará al
valor de 0.
o Métodos para consultar los valores de todos los atributos de la clase, excepto
el atributo estático.
o Métodos para modificar todos los atributos de la clase excepto el código y el
atributo estático.
o Método denominado getTipo(). Devuelve una cadena de caracteres de
acuerdo a la siguiente condición (obligatorio utilizar el operador condicional):
 Si el saldo es negativo “cliente moroso”.
 En caso contrario, devolverá “cliente normal”.
o Método toString(). Devuelve una cadena de texto donde se detalla el código,
nombre y apellidos del cliente, el número de películas que ha alquilado y el
tipo de cliente que es (moroso o normal).*/
    
    private int codigo,numPeliculasAlquiladas;
    private String nombre, apellidos, movil;
    private double saldo;
    private static int nextCodigo=1;
    private String tipo = getTipo();
       
    
    
    
    
    /*Metodo*/
    public String getTipo(){
        
        String tipo;
        if(this.getSaldo()>=0){
            
           tipo = "Cliente Normal";
           
            
        }else{
             tipo = "Cliente Moroso";
        }
        return  tipo;
    }
    
    
    
    
    /*Constructores*/
    public Cliente() {
        
        this.codigo = nextCodigo;
        this.numPeliculasAlquiladas=0 ;
        nextCodigo++;
    }

    public Cliente(String nombre, String apellidos, String movil, double saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.movil = movil;
        this.saldo = saldo;
        this.codigo = nextCodigo;
        this.numPeliculasAlquiladas=0 ;
        nextCodigo++;
    }

    public Cliente(int codigo, int numPeliculasAlquiladas, String nombre, String apellidos, String movil, double saldo) {
        this.codigo = codigo;
        this.numPeliculasAlquiladas = numPeliculasAlquiladas;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.movil = movil;
        this.saldo = saldo;
        this.tipo = getTipo();
    }

    public Cliente(int numPeliculasAlquiladas, String nombre, String apellidos, String movil, double saldo) {
        this.numPeliculasAlquiladas = numPeliculasAlquiladas;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.movil = movil;
        this.saldo = saldo;
        this.tipo = getTipo();
    }

  

    
    /*Getter And Setter*/
    
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumPeliculasAlquiladas() {
        return numPeliculasAlquiladas;
    }

    
      public void setNumPeliculasAlquiladas(int numPeliculasAlquiladas, int aumento) {
          
        this.numPeliculasAlquiladas = numPeliculasAlquiladas+aumento;
    }
    
    public void setNumPeliculasAlquiladas(int numPeliculasAlquiladas) {
        this.numPeliculasAlquiladas = numPeliculasAlquiladas;
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

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     public void setSaldo(double saldo, double reduccion) {
        this.saldo = saldo-reduccion;
    }

    public static int getNextCodigo() {
        return nextCodigo;
    }

    public static void setNextCodigo(int nextCodigo) {
        Cliente.nextCodigo = nextCodigo;
    }

    @Override
    public String toString() {
        return  "Codigo: "+codigo+". Nombre: "+nombre+". Apellidos: "+apellidos+". Número de películas: "+numPeliculasAlquiladas+ ". Tipo de Cliente: " +tipo; 
    
    
    }
}
