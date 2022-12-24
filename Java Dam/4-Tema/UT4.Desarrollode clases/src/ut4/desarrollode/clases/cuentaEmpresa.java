/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut4.desarrollode.clases;

/**
 *
 * @author carlo
 */
public class cuentaEmpresa implements ICuenta{
    
    private int recago;
    private final int RECARGO=2;
    private Cuenta c1;

    public cuentaEmpresa(Cuenta c1) {
           this.c1 = c1;
           this.recago = RECARGO;
    }

    public cuentaEmpresa(int recago, Cuenta c1) {
        this.recago = recago;
        this.c1 = c1;
    }

    @Override
    public void ingresar(double cantidad) {
            c1.setSaldoCuenta(c1.getSaldoCuenta()+cantidad);
        
        c1.setSaldoCuenta(c1.getSaldoCuenta() + (cantidad*(this.recago*0.01)));
        
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
