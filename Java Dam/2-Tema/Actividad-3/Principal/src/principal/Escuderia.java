
package principal;


public class Escuderia {
    
    
    private String nombre, fechaFundacion;
    private double presupuesto;
    private int victorias;
    
    
    public Escuderia() {
        
        this.nombre = "Escuderia por defecto";
        this.fechaFundacion = "01/01/2000";
        this.presupuesto = 0.00;
        this.victorias = 0;
                
       }
    
    
    
    public boolean quiebra(){
        
        boolean quiebra;
        
        if(getPresupuesto()<0){
            quiebra = true;
        }else{
            quiebra=false;
        }
        return quiebra;
        
    }
    
    public void bonus(){
        double aumento;
        
        
        aumento =  1+((20*Math.random())/100);
       
        setPresupuesto(presupuesto, aumento);
        
  
    }

    @Override
    public String toString() {
        
        return "El nombre de la escuderia es "+getNombre() +" ,su fecha de fundación fue "+getFechaFundacion()+ " ,el presupuesto de la escudería es "+ getPresupuesto()+ " , las victorias acumuladas de la escudería son " +getVictorias();
                
        
    }
    
    
    
    
    
    
    /*
    
    Clase Escuderia

    */

    public Escuderia(String nombre, String fechaFundacion, double presupuesto, int victorias) {
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.presupuesto = presupuesto;
        this.victorias = victorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

      public void setPresupuesto(double presupuesto, double aumento) {
          
        this.presupuesto = presupuesto*aumento;
    }
    
    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    
}
