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
public class Rectangulo {
    
    private double base, altura;
    
    
    
    /*
    Constructores
    */
    
    public Rectangulo() {
        this.altura = 1;
        this.base = 1;
        
    }
    
    
       public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
    
    public void setLados(double base, double altura){
        
        this.altura = altura;
        this.base = base;
        
    }
    
    public double Perimetro (){
        
        double perimetro = altura+base;
        return perimetro;
        
        
    }
    public double area(){
        double area = altura *base;
        return area;
    }
    
    /*
    

Métodos (todos ellos públicos)




/*Getters and Sstters*/

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
       
       
 

}
