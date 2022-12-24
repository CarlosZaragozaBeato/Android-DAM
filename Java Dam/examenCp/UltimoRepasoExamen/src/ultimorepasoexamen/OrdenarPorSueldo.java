/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimorepasoexamen;

import java.util.Comparator;

/**
 *
 * @author david
 */
public class OrdenarPorSueldo implements Comparator {

    @Override
    public int compare(Object o1, Object o2) 
    {        
        Ciudadano c1, c2;
            
        c1 = (Ciudadano)o1;
        c2 = (Ciudadano)o2;
        
        int r=0;

            if (c1.getSueldo() > c2.getSueldo())
            {
                r=1;
            }
            if (c1.getSueldo() < c2.getSueldo())
            {
                r=-1;
            }
            
            if (c1.getSueldo() == c2.getSueldo())
            {
                r = c1.getNombre().compareToIgnoreCase(c2.getNombre());
            }

            return r;
    }   
            
        
}
    

