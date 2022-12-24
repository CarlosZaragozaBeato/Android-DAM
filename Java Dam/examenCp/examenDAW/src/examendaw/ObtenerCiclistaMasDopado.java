/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendaw;

import java.util.Comparator;

/**
 *
 * @author david
 */
public class ObtenerCiclistaMasDopado implements Comparator<Ciclista> {

    @Override
    public int compare(Ciclista c1, Ciclista c2) {
        
        int r=0;

        if (c1.getHematocrito()> c2.getHematocrito())
        {
            r=1;
        }
        if (c1.getHematocrito()< c2.getHematocrito())
        {
            r=-1;
        }
        
        if (c1.getHematocrito() == c2.getHematocrito())
        {
            if (c1.getPeso() > c2.getPeso())
            {
                r = -1;
            }
            else
            {
                r = 1;
            }
        }
        return r;
    }
    
    
}
