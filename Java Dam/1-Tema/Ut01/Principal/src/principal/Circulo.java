/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author carlo
 */
public class Circulo {
    
    private double radio;
    
    

    
  /*Metodos*/  
    public double Perimetro(){
        
        double perimetro = (Math.PI * Math.pow(radio, 2)*2);
        return perimetro;
    }
   public double areaCirculo(){
       double area = (Math.PI * Math.pow(radio, 2));
       return  area;
       
   } 
    
    
/*Constructores*/
    public Circulo() {
        this.radio = 1;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
  /*Getter and setters*/

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
