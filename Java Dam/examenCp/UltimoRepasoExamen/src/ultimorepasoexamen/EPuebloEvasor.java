/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimorepasoexamen;

/**
 *
 * @author david
 */
public class EPuebloEvasor extends Exception {
    
    EPuebloEvasor(double ciudadanos, double cantidadEvadida)
    {
        super(ciudadanos+" "+cantidadEvadida);
    }

}
