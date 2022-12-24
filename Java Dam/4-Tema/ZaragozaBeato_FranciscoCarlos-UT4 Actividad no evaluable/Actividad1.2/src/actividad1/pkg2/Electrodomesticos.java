
package actividad1.pkg2;


public class Electrodomesticos {
    
    
    
        
    private final double PRECIOBASE=100, PESO=5;
    private final String COLOR="blanco";
    private final char CONSUMOENERGETICO='F';
    
    
    private double precioBase,peso;
    private String color;
    private char consumoEnergetico;

    public Electrodomesticos() {
    }
    
    
    
    
    
    
     public Electrodomesticos(double precioBase, double peso, String color, char consumoEnergetico) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
        
        switch(color.toUpperCase()){
            
            case "BLANCO":          
                this.color = "Blanco";                
            break;
            
             case "NEGRO":          
                this.color = "Negro";                
            break;
            
             case "ROJO":          
                this.color = "Rojo";                
            break;
            
             case "AZUL":          
                this.color = "Azul";                
            break;
            
             case "GRIS":          
                this.color = "Gris";                
            break;
        }
    }
    
    
   
public double precioFinalPesoConsumo(){
    double precioFinal=0 , plusPeso=0 , plusConsumo=0, plusTotal;
    
    
    
    if(this.peso>0 & this.peso<19){
        plusPeso=10;
    }else if(this.peso>=20 && this.peso<50){
        plusPeso=50;
    }else if(this.peso>=50 && this.peso<80){
        plusPeso=80;
    }else if(this.peso>=80){
        plusPeso=100;
    }
    
    switch(consumoEnergetico){
            
            case 'A','a':          
                 plusConsumo = 100;      
            break;
            
            case 'B','b':          
                plusConsumo = 80;
            break;
            
            case 'C', 'c':          
                plusConsumo = 60;
            break;
            
            
            case 'D', 'd':          
                plusConsumo =50;
            break;
            
            
            case 'E', 'e':          
                plusConsumo = 30;      
            break;
            
            case 'F', 'f':          
                plusConsumo = 10;
            break;
    }
    plusTotal = plusConsumo+plusPeso;
    precioFinal = this.precioBase +plusTotal;
    
    return precioFinal;
}
     
     
     
     
     
    public Electrodomesticos(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = CONSUMOENERGETICO;
        this.color = COLOR;
        
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
             switch(color.toUpperCase()){
            
            case "BLANCO":          
                this.color = "Blanco";                
            break;
            
             case "NEGRO":          
                this.color = "Negro";                
            break;
            
             case "ROJO":          
                this.color = "Rojo";                
            break;
            
             case "AZUL":          
                this.color = "Azul";                
            break;
            
             case "GRIS":          
                this.color = "Gris";                
            break;
            
            default:
                this.color = COLOR;
        }
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        
        
            switch(consumoEnergetico){
            
            case 'A':          
                this.consumoEnergetico = consumoEnergetico;                
            break;
            
            case 'B':          
                this.consumoEnergetico = consumoEnergetico;                
            break;
            
               case 'C':          
                this.consumoEnergetico = consumoEnergetico;                
            break;
            
            
               case 'D':          
                this.consumoEnergetico = consumoEnergetico;                
            break;
            
            
               case 'E':          
                this.consumoEnergetico = consumoEnergetico;                
            break;
            
            
               case 'F':          
                this.consumoEnergetico = consumoEnergetico;                
            break;
            
            default:
                this.consumoEnergetico = CONSUMOENERGETICO;
                
              
            
            
        }
      
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precioBase=" + precioBase + ", peso=" + peso + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + '}';
    }

  



    
}
