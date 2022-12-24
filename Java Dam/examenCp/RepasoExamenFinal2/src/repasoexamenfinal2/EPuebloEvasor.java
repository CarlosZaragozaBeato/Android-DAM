/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoexamenfinal2;

/**
 *
 * @author david
 */
public class EPuebloEvasor extends Exception {
    
    EPuebloEvasor(Double porcentaje, int cantidad)
    {
        super(porcentaje+","+cantidad);
    }



}
