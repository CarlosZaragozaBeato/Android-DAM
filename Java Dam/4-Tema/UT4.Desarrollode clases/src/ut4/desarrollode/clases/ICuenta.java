
package ut4.desarrollode.clases;

public interface ICuenta {
    
    
    public void ingresar(double cantidad);
    public boolean retirar(double cantidad);
    public boolean transferir(Cuenta destino, double cantidad);
}
