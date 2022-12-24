/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laliga;

/**
 *
 * @author usumaniana1
 */
public class EPresupuestoIlegal extends Exception{
       
    EPresupuestoIlegal(int presupuesto) {
        System.out.println("El presupuesto no puede ser negativo"+presupuesto);
        
    }
    
}
