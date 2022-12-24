
package actividad1.pkg2;

import java.util.logging.Logger;


public class Lavadora extends Electrodomesticos{
    
    private final int CARGA = 5;
    private int carga;
    
    
    public double precioFinalLV(){
        double precioFinal=0;
        
        if(this.carga>30){
           precioFinal= this.getPrecioBase()+50;
        }else{
            precioFinal= this.getPrecioBase();
        }
        
        
        return precioFinal;
    }
    
    
    
    
    

    
    
    
    public int getCarga() {
        return carga;
    }

    public Lavadora(int carga, double precioBase, double peso, String color, char consumoEnergetico) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora() {
    }


   
    
}
