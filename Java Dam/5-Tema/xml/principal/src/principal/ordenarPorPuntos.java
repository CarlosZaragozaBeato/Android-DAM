
package principal;

import java.util.Comparator;


public class ordenarPorPuntos implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        int r =0;
        Equipos e1,e2;
        e1 = (Equipos)o1;
        e2 = (Equipos)o2;
        if(e1.getPuntos()>e2.getPuntos()){
            r=-1;
                    
        }
        if(e1.getPuntos()<e2.getPuntos()){
            r=1;
                    
        }
        return r;
    }
    
}
