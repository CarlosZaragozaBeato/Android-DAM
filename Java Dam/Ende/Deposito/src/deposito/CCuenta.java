
package deposito;

    /**
     * 
     * @author carlo
     */
 
public class CCuenta {
 
    
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    


    /**
    *   @param nombre Nombre propietario
    *   @param cuenta Numero cuenta
    *   @param saldo saldo cuenta
    *   @param tipoInteres tipo de interes de cuenta
    */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }
    
    
    /**
    *   @return saldo devuelve el saldo
    */
    public double estado(){
        return saldo;
    }
    
    /**
    *
    *
    * @param cantidad cantidad a ingresar
    * @throws Exception Error de Cantidad
    *
    */
    public void ingresar(double cantidad) throws Exception{
        
        if(cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");
        }else{
            saldo = saldo+cantidad;
        }  
    }
    
    /**
    *
    *
    * @param cantidad cantidad para retirar
    * @throws Exception Error con el saldo
    *
    */
    
    public void retirar(double cantidad) throws Exception{
        if(cantidad<=0){
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if(estado()<cantidad){
            throw new Exception("No hay suficiente saldo");
        }else{
            saldo=saldo-cantidad;
        }
    }
    
}
