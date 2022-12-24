/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_5.pkg7;

import java.util.Comparator;

/**
 *
 * @author usumaniana1
 */
public class compararPuntos implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        
        equipo e1;
        equipo e2;
        
        e1 =  (equipo)o1;
        e2 =  (equipo)o2;
        int r=0;
        
        if(e1.getPuntos()>e2.getPuntos()){
            r=1;
        }
        
        if(e1.getPuntos()<e2.getPuntos()){
            r=-1;
        }
        if(e1.getPuntos()==e2.getPuntos()){
            
            
                r = (e1.getNombre().compareToIgnoreCase(e2.getNombre()));
            
            
        }
        
        
       
        
        
        
        
        return r;
     
    
          
      
    }
    
}
