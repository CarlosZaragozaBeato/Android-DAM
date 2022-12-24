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
public class OrdenarPorPuntos implements Comparator<Equipo>{
    /*ESTA MAL*/
    @Override
    public int compare(Equipo e1, Equipo e2) {
        
        int r=0;
        
            if (e1.getPuntos() > e2.getPuntos())
            {
                r=1;
            }
            
            if (e1.getPuntos() < e2.getPuntos())
            {
                r=-1;
            }
                    
        return r;
    }
}
    

