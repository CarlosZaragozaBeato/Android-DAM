
package principal;


public class Carrera {
    
    
    
    private String nombreCarrera, nombreCircuito;
    private Piloto firstPosition, secondPosition, thirdPosition;

  

    
    
    
    
    
  public void setCampeon(Piloto pl1) {
        
        this.firstPosition = pl1;
        this.firstPosition.setPuntos(firstPosition.getPuntos(), 25);
      
    }
    
        
  public void setSubcampeon(Piloto pl2) {
        
        this.secondPosition = pl2;
        this.secondPosition.setPuntos(this.secondPosition.getPuntos(), 15);
        this.secondPosition.getCoche().setCaballos(this.secondPosition.getCoche().getCaballos(), 50);
        
      
    }
    
   public void set3posicion(Piloto pl3){
          this.thirdPosition = pl3;
          this.thirdPosition.setPuntos(this.thirdPosition.getPuntos(),5);
          this.thirdPosition.getEsc1().bonus();
   }    
    
    
    
    
    /*
            
    . Clase Carrera




    
    */

    public Carrera() {
    }
         
    
    
      public Carrera(String nombreCarrera, String nombreCircuito, Piloto firstPosition, Piloto secondPosition, Piloto thirdPosition) {
        this.nombreCarrera = nombreCarrera;
        this.nombreCircuito = nombreCircuito;
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
        this.thirdPosition = thirdPosition;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getNombreCircuito() {
        return nombreCircuito;
    }

    public void setNombreCircuito(String nombreCircuito) {
        this.nombreCircuito = nombreCircuito;
    }

    public Piloto getFirstPosition() {
        return firstPosition;
    }

    public void setFirstPosition(Piloto firstPosition) {
        this.firstPosition = firstPosition;
    }

    public Piloto getSecondPosition() {
        return secondPosition;
    }

    public void setSecondPosition(Piloto secondPosition) {
        this.secondPosition = secondPosition;
    }

    public Piloto getThirdPosition() {
        return thirdPosition;
    }

    public void setThirdPosition(Piloto thirdPosition) {
        this.thirdPosition = thirdPosition;
    }
    
}
