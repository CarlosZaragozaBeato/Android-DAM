/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laliga;

import java.util.Comparator;

/**
 *
 * @author david
 */
public class OrdenarPorPresupuesto implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
    {
        Equipo e1, e2;

        e1 = (Equipo)o1;
        e2 = (Equipo)o2;

        int r=0;

        if (e1.getPresupuesto() > e2.getPresupuesto())
        {
            r=-1;
        }
        if (e1.getPresupuesto() < e2.getPresupuesto())
        {
            r=1;
        }

        return r;
    }
}
    
}
