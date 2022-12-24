
package actividad1.pkg2;

public class Television extends Electrodomesticos{
    
    
    private double pulgadas;
    private boolean sintonizador;

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.pulgadas = 20;
        this.sintonizador = false;
    }

    public Television(double pulgadas, boolean sintonizador, double precioBase, double peso, String color, char consumoEnergetico) {
        super(precioBase, peso, color, consumoEnergetico);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }
    
    
    
    public double precioFinalTV(){
        double precioFinal=0,aumentoPulgadas=0, aumentoTDT=0;
        
        if(this.pulgadas>40){
            
            aumentoPulgadas = 1.3*this.getPrecioBase();
            
        }else{
            aumentoPulgadas= this.getPrecioBase();
            
        }
        
        if(this.sintonizador==true){
            aumentoTDT=50;
        }
        
        precioFinal = aumentoPulgadas+aumentoTDT;
        
        return precioFinal;
    }
    
    
    
    
    
    
    


    public Television() {
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return super.toString()+" ,Television{" + "pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + '}';
    }
    
    
    
    
}
