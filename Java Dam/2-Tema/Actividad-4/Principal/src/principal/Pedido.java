
package principal;


public class Pedido {
    
    private int numero;
    private String fecha;
    private double totalDelPedido;
    private Cliente cl1;
    private static int nextNumero=1;
    private int descuento;
    private int numeroLineas;
    
    
        public Pedido() {
            
            this.totalDelPedido=0;
            this.numeroLineas = 0;
            
        
        }
    
      public Pedido(String fecha, Cliente cl1) {
        this.numero = nextNumero;
        this.fecha = fecha;
        this.totalDelPedido = 0;
        this.cl1 = cl1;
        if(cl1.getTipo().equalsIgnoreCase("cliente vip")){
             this.descuento =15;
        }else if(cl1.getTipo().equalsIgnoreCase("cliente básico")){
            this.descuento =5;   
        }       
        this.numeroLineas = 0;
        nextNumero++;
        cl1.setPedidos(numero, 1);
    }

    
      
        
    /*
    . Clase Pedido







o Método toStringDivisa(). Recibe por parámetro el tipo de divisa (dólar o 
bitcoin). Devuelve lo mismo que el método toString() pero el total del pedido y 
el total del pedido con descuento será el equivalente teniendo en cuenta la 
divisa recibida, es decir, si recibe la divisa dólar, devolverá el total y el total con 
descuento en dólares en vez de euros.

    */

    public Pedido(int numero, String fecha, double totalDelPedido, Cliente cl1, int descuento, int numeroLineas) {
     
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotalDelPedido() {
        return totalDelPedido;
    }

    public void setTotalDelPedido(double totalDelPedido) {
        this.totalDelPedido = totalDelPedido;
    }

    public Cliente getCl1() {
        return cl1;
    }

    public void setCl1(Cliente cl1) {
        if(cl1.getTipo().equalsIgnoreCase("cliente vip")){
             this.descuento =15;
        }else if(cl1.getTipo().equalsIgnoreCase("cliente básico")){
            this.descuento =5;   
        } 
        this.cl1 = cl1;
        this.cl1.setPedidos(numero, 1);
    }

    public static int getNextNumero() {
        return nextNumero;
    }

    public static void setNextNumero(int nextNumero) {
        Pedido.nextNumero = nextNumero;
    }

    public int getDescuento() {
        return descuento;
    }

 

    public int getNumeroLineas() {
        return numeroLineas;
    }

    public void setNumeroLineas(int numeroLineas) {
        this.numeroLineas = numeroLineas;
    }

    
    public  double calcularDescuento(){
     double total;
        total = getTotalDelPedido()*((15/100)+1);
        return total;
    }
       
    @Override
    public String toString() {
        return "El numero del pedido es " +getNumero()+". La fecha es "+getFecha()+ ". El nombre del cliente es"+cl1.getNombre()+" y los apellidos "+cl1.getApellidos() +". El tipo de cliente es "+cl1.getTipo()+ "El importe del pedido sin descuento es " +getTotalDelPedido()+"$ . El precio con el descuento es "+ calcularDescuento(); 
     
}
}