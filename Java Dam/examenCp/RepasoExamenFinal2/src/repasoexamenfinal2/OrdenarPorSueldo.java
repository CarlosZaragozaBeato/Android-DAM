/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoexamenfinal2;

import java.util.Comparator;

/**
 *
 * @author david
 */
public class OrdenarPorSueldo implements Comparator {
    
    @Override
    public int compare(Object o1, Object o2) 
    {
            Ciudadano e1, e2;
            
            e1 = (Ciudadano)o1;
            e2 = (Ciudadano)o2;
            
            int r=0;

            if (e1.getSueldo()> e2.getSueldo())
            {
                r=1;
            }
            if (e1.getSueldo() < e2.getSueldo())
            {
                r=-1;
            }

            return r;
    }
    
}
