/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author carlo
 */
public class perro {
    
    private String raza, color, sexo;
    private double peso;
    private int edad;

    @Override
    public String toString() {
        return "perro{" + "raza=" + raza + ", color=" + color + ", sexo=" + sexo + ", peso=" + peso + ", edad=" + edad + '}';
    }
    
    
    public perro Cruzar(perro p1){
        
      
        String perroCruzadoRaza="", colorPerroCruzado="";
        double pesoMedioCruzado=0;
        perro p2 ;
        if(this.getSexo() != p1.getSexo()){
          
            perroCruzadoRaza = this.getRaza().concat(p1.getRaza());
            
            if(this.getSexo().equalsIgnoreCase("Hembra")){
                
                colorPerroCruzado = this.getColor();
                
            }else if(p1.getSexo().equalsIgnoreCase("Hembra")){
                
                colorPerroCruzado = p1.getColor();
            }
            
            
            pesoMedioCruzado = (p1.getPeso() + this.getPeso())/2;
            
        
        
        }
        if(this.getSexo()==p1.getSexo()){
            
          p2 = null;
            
        }else{
          p2 = new perro(perroCruzadoRaza,colorPerroCruzado,"hembra",pesoMedioCruzado, 0);
                 
        
        }
        
        
       return p2; 
    }

    public perro() {
    }

    public perro(String raza, String color, String sexo, double peso, int edad) {
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.peso = peso;
        this.edad = edad;
    }
    
    
    
    
    
    /*EJERCICIO 1:


*/

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
