/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut4.desarrollode.clases;

/**
 *
 * @author carlo
 */
public class CuentaNomina implements ICuenta{
    
    
    private final int INTERES=5;
    private Cuenta c1;
    private int interesBonificacion;

    public CuentaNomina(Cuenta c1) {
        this.interesBonificacion = INTERES;
        this.c1 = c1;
    }

    public CuentaNomina(int interesBonificacion, Cuenta cuenta) {
        
        if(interesBonificacion>9 && interesBonificacion<100){
              this.interesBonificacion = interesBonificacion;
        }else{
            this.interesBonificacion = INTERES;
        }
        this.c1 = cuenta;
      
    }

    public int getInteresBonificacion() {
        return interesBonificacion;
    }

    public void setInteresBonificacion(int interesBonificacion) {
        
    }
    
    
    
    
    @Override
    public void ingresar(double cantidad) {

        
        c1.setSaldoCuenta(c1.getSaldoCuenta()+cantidad);
        
        c1.setSaldoCuenta(c1.getSaldoCuenta() + (cantidad*(interesBonificacion*0.01)));
        
        System.out.println(c1.getSaldoCuenta());
    }

    @Override
    public boolean retirar(double cantidad) {
        
         
        
         if(c1.getSaldoCuenta()<cantidad){
             
             return false;
         }else{
             c1.setSaldoCuenta(c1.getSaldoCuenta()-cantidad);
             return true;
         }


    }

    @Override
    public boolean transferir(Cuenta destino, double cantidad) {

        if(c1.getSaldoCuenta()>cantidad){
              
            destino.setSaldoCuenta(destino.getSaldoCuenta()+cantidad);
            c1.setSaldoCuenta(c1.getSaldoCuenta()-cantidad);
            return true;
             
         }else{
            
            return false;
           
         }


    }

 




    
    
    
    
    
}
