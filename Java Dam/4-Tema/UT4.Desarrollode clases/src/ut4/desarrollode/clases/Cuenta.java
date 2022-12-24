
package ut4.desarrollode.clases;

/**
 *
 * @author carlo
 */
public class Cuenta {
    

    private int codigoEntidad, codigoSucursal, digitoControl;
    private String numeroCuenta;
    private double saldoCuenta;
    private Persona p1;

    public Cuenta() {
    }

    public Cuenta(int codigoEntidad, int codigoSucursal, int digitoControl, String numeroCuenta, double saldoCuenta, Persona p1) {
        
        if(codigoEntidad>999 && codigoEntidad<10000){
            this.codigoEntidad = codigoEntidad;
        }else{
                this.codigoEntidad  = 0;
        }
            
        if(codigoSucursal>999 && codigoSucursal<10000){
            this.codigoSucursal = codigoSucursal;
        }else{
                this.codigoSucursal  = 0;
        }
        if(digitoControl>9 && digitoControl<100){
            this.digitoControl = digitoControl;
        }else{
                this.digitoControl  = 0;
        }
       
        
  
        
         if(numeroCuenta.length()==10){
            this.numeroCuenta = numeroCuenta;
        }else{
                this.numeroCuenta  = "0";
        }
    
        this.saldoCuenta = saldoCuenta;
        this.p1 = p1;
    }

    public void setCodigoEntidad(int codigoEntidad) {
        
        if(codigoEntidad>999 && codigoEntidad<10000){
            this.codigoEntidad = codigoEntidad;
        }else{
                this.codigoEntidad  = 0;
        }
        
    }

    public void setCodigoSucursal(int codigoSucursal) {
        
        if(codigoSucursal>999 && codigoSucursal<10000){
            this.codigoSucursal = codigoSucursal;
        }else{
                this.codigoSucursal  = 0;
        }
    }

    public void setDigitoControl(int digitoControl) {
          
        if(digitoControl>9 && digitoControl<100){
            this.digitoControl = digitoControl;
        }else{
                this.digitoControl  = 0;
        }
    }

    public void setNumeroCuenta(String numeroCuenta) {
        
        
         if(numeroCuenta.length()==10){
            this.numeroCuenta = numeroCuenta;
        }else{
                this.numeroCuenta  = "0";
        }
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void setP1(Persona p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "codigoEntidad=" + codigoEntidad + ", codigoSucursal=" + codigoSucursal + ", digitoControl=" + digitoControl + ", numeroCuenta=" + numeroCuenta + ", saldoCuenta=" + saldoCuenta + ", p1=" + p1 + '}';
    }

    /*@Override
    public String toString() {
        return "El nombre del propietario de la cuenta es: " +this.p1.getNombre()+" " +p1.getApellidos() +", El numero de cuenta es:  "+this.getNumeroCuenta() +" y su saldo disponible es: "+this.getSaldoCuenta();
    }*/

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int getCodigoEntidad() {
        return codigoEntidad;
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public int getDigitoControl() {
        return digitoControl;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public Persona getP1() {
        return p1;
    }
    
    
    
    
    
}
