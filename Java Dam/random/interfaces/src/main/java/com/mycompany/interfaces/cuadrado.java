/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

/**
 *
 * @author usumaniana1
 */
public class cuadrado implements Figura{

    private double lado;

    public cuadrado(double lado) {
        this.lado = lado;
    }

    
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    
    @Override
    public double area() {
        
        return  lado*lado;
        
     
        
    }

    
    
}
