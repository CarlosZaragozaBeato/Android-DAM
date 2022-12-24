/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Comparator;

/**
 *
 * @author carlo
 */
public class ordenarPorPresupuesto implements Comparator  {
    

    @Override
    public int compare(Object o1, Object o2) {

        int r =0;
        Equipos e1,e2;
        e1 = (Equipos)o1;
        e2 = (Equipos)o2;
        if(e1.getPresupuesto()>e2.getPresupuesto()){
            r=-1;
                    
        }
         if(e1.getPresupuesto()<e2.getPresupuesto()){
            r=1;
                    
        }
        return r;
    }
}
