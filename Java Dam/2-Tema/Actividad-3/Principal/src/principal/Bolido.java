
package principal;


public class Bolido {
    
    
    
    private String nombre, fabricanteMotor,fabricanteNeumaticos;
    private Escuderia esc1;
    private double kg, caballos;

    public Bolido(Escuderia esc1) {
        this.esc1 = esc1;
        this.nombre = "Coche por defecto";
        this.fabricanteMotor ="Anónimo";
        this.fabricanteNeumaticos = "Anónimo";
        this.kg = 650.80;
        this.caballos = 700;
    }

    public Bolido(String nombre, String fabricanteMotor, String fabricanteNeumaticos, Escuderia esc1, double kg, double caballos) {
        this.nombre = nombre;
        this.fabricanteMotor = fabricanteMotor;
        this.fabricanteNeumaticos = fabricanteNeumaticos;
        this.esc1 = esc1;
        this.kg = kg;
        this.caballos = caballos;
    }
    
    
    
    
    public void aumentarPotencia(double aumento){
        
        setCaballos(caballos, aumento);
        
    }

    @Override
    public String toString() {
        return "Bolido{" + "nombre=" + nombre + ", fabricanteMotor=" + fabricanteMotor + ", fabricanteNeumaticos=" + fabricanteNeumaticos + ", esc1=" + esc1 + ", kg=" + kg + ", caballos=" + caballos + '}';
    }
    
    
    
    
    
    
    
    
    
    
    /*
        . Clase Bolido

 Métodos:




o Método toString(). Devuelve una cadena de texto donde se detalle los valores 
de cada uno de los atributos.

    */

    public Bolido() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricanteMotor() {
        return fabricanteMotor;
    }

    public void setFabricanteMotor(String fabricanteMotor) {
        this.fabricanteMotor = fabricanteMotor;
    }

    public String getFabricanteNeumaticos() {
        return fabricanteNeumaticos;
    }

    public void setFabricanteNeumaticos(String fabricanteNeumaticos) {
        this.fabricanteNeumaticos = fabricanteNeumaticos;
    }

    public Escuderia getEsc1() {
        return esc1;
    }

    public void setEsc1(Escuderia esc1) {
        this.esc1 = esc1;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public double getCaballos() {
        return caballos;
    }

    public void setCaballos(double caballos) {
        this.caballos = caballos;
    }
       
    public void setCaballos(double caballos, double aumento) {
      
            this.caballos = caballos + aumento;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
