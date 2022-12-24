
package principal;


public class Alquiler {
    
    private int numero, numDias, codigo;
    private double precioPorDia, totalAlquiler;
    private String fecha;
    private Cliente cl1;
    private Pelicula p1 ;

    public Alquiler(String fecha, Cliente cl1, Pelicula p1) {
        this.fecha = fecha;
        this.cl1 = cl1;
        this.p1 = p1;
        cl1.setNumPeliculasAlquiladas(cl1.getNumPeliculasAlquiladas(),codigo);
      
        if (this.p1.esNovedad(p1)) {
            precioPorDia=2.30;
           this.precioPorDia =precioPorDia;
        }else{
            precioPorDia=1.75;
            this.precioPorDia =precioPorDia;
        }
        
        this.p1.setUnidadesDisponibles(numDias, +1);
        this.cl1.setSaldo(cl1.getSaldo(), precioPorDia);
        if(this.cl1.getTipo().equalsIgnoreCase("Cliente Moroso")){
            
            this.precioPorDia=precioPorDia*1.1;
            
        }else if(this.cl1.getTipo().equalsIgnoreCase("Cliente Normal")){
            this.precioPorDia=precioPorDia*0.95;
        }
        this.cl1.setSaldo(cl1.getSaldo(), precioPorDia);
        nextCodigo =codigo+1;
    }
    private static int nextCodigo=1;
/**Constructores**/

    public Alquiler() {
        this.totalAlquiler=0;
        this.codigo = nextCodigo;
        nextCodigo++;
    }
    
   
    
    /*Clase Alquile
    
 Métodos:

Constructor con parámetros (recibe únicamente la fecha y los objeto cliente y 
película) donde inicializa cada uno de los atributos de la clase. 
 Para el caso del número de pedido, su valor se genera utilizando el 
atributo estático de la clase. Se deberá incrementar en una unidad el 
número de pedidos realizado por el cliente.
 El precio por día dependerá de la fecha de la película.
 Si la película es novedosa, el precio será de 2.30€.
 En caso contrario será de 1.75€.
 Además, deberás decrementar en una unidad, el número 
unidades disponibles de la película.
 El valor del atributo total, será el número de días por el precio por día, 
además habrá que tener en cuenta las siguientes condiciones:
 Si el cliente es moroso, se incrementará el total en un 10% su 
valor.
 En caso contrario. Se realizará un descuento al cliente de un 
5%.
 Actualizar el saldo del cliente, es decir, debemos restarle el 
valor del total del alquiler.
o Métodos para consultar los valores de todos los atributos de la clase, excepto 
el atributo estático.
o Métodos para modificar todos los atributos de la clase excepto el total del 
alquiler y el atributo estático.
 Para el método que modifique el objeto película, habrá que calcular el 
precio por día, tal y como hicimos en el constructor y decrementar el 
número de unidades del objeto película.
 Para el método que modifique el cliente, deberá calcular el valor del 
atributo total y modificar el saldo del cliente
    
    


    */

    
    
    /*Getter And Setter*/

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public double getTotalAlquiler() {
        return totalAlquiler;
    }

    public void setTotalAlquiler(double totalAlquiler) {
        this.totalAlquiler = totalAlquiler;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCl1() {
        return cl1;
    }

    public void setCl1(Cliente cl1) {
        this.cl1 = cl1;
    }

    public Pelicula getP1() {
        return p1;
    }

    public void setP1(Pelicula p1) {
        this.p1 = p1;
    }

    public static int getNextCodigo() {
        return nextCodigo;
    }

    public static void setNextCodigo(int nextCodigo) {
        Alquiler.nextCodigo = nextCodigo;
    }
    
    
    
        /*Método toString(). Devuelve una cadena de caracteres con el siguiente 
formato:
 Número del alquiler y fecha
 Título de la película, el nombre del director y de los actores y el 
número de unidades disponibles de la película.
 Nombre y apellidos del cliente y el tipo de cliente que es y el saldo.
 Total del alquiler.*/

    @Override
    public String toString() {
 
        return "El codigo del alquiler es: "+codigo + "La fecga es " +fecha+ "El titulo de la pelicula es" +this.p1.getTitulo()+ " El nombre del director es "+p1.getD1()+ "";
    }
    
}
