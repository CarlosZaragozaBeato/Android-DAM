/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut4.desarrollode.clases;

/**
 *
 * @author carlo
 */
public class UT4DesarrollodeClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1 = new Persona("70361041q", "Carlos", "Zaragoza", "cadjhaasoudh@adhaoshd", "546456456");
        Persona p2 = new Persona("70361041q", "Carlos", "Zaragoza", "cadjhaasoudh@adhaoshd", "546456456");

        Cuenta c1 = new Cuenta(4522, 12, 18, "456123456", 440, p1);
        Cuenta c2 = new Cuenta(4522, 12, 18, "456123456", 440, p1);
        CuentaNomina cn= new CuentaNomina(c1);
        System.out.println(c1);
    
        System.out.println(c1.getSaldoCuenta());
        cn.ingresar(10);
        
        System.out.println(cn.retirar(10));
        System.out.println(c1.getSaldoCuenta());
        
        System.out.println(cn.transferir(c2, 100));
        System.out.println(c1.getSaldoCuenta());
        System.out.println(c2.getSaldoCuenta());
    
    }
    
}
