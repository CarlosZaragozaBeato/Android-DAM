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
public class Triangulo {
    
    
    private double base, altura;
    
    
    




    
    
    public double Perimetro(){
        
        double perimetro = altura+base;
        return perimetro;
    }
    public double areaTriangulo(){
        
        double area = (base*altura)/2;
        return area;
    }
    
    public void setLados(double base, double altura){
        this.altura = altura;
        this.base = base;
 
        
    }

    public Triangulo() {
        this.base = 1;
        this.altura = 1;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

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
