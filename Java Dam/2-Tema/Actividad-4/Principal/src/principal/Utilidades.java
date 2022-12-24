
package principal;

public class Utilidades {
    
    
    
    private final double DOLLAR =1.17521; 
    private final double BITCOIN = 0.000154250;
    
    
    
    public double getDolares(double euros){
         double resultado;
            
         resultado = euros*DOLLAR;
         return resultado;   
    }
    
        public double getBitcoins(double euros){
         double resultado;
         resultado = euros*BITCOIN;
         return resultado;   
    }
        
   public String getFormatoNombre(String cadena){
       
      String primeraletra=cadena.substring(0,1);
      String segundacadena= cadena.substring(1,cadena.length());     
      return primeraletra.toUpperCase()+segundacadena.toLowerCase();
       
   } 
   
   public double getTotal(double precio, int unidades, double iva){
       double PrecioCompleto=0, precioTotalUnidades;
       
       iva = (iva/100)+1;
       
       precioTotalUnidades = precio*unidades;
       PrecioCompleto =   iva*precioTotalUnidades;
       return PrecioCompleto;
       
   }
    
    
    
}
