/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondelibros;

import java.util.Comparator;

/**
 *
 * @author usumaniana1
 */
public class ordenarPorPrecio implements Comparator<Libro> {
    
    @Override
    public int compare(Libro l1, Libro l2) 
    {
            int r=0;

            if (l1.getPrecio() > l2.getPrecio())
            {
                r=1;
            }
            if (l1.getPrecio() < l2.getPrecio())
            {
                r=-1;
            }

            return r;
    }
    
}
