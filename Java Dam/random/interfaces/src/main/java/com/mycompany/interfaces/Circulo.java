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
public class Circulo implements Figura{

    private double diametro;

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public Circulo(double diametro) {
        this.diametro = diametro;
    }
    
    
    
    
    
    
    
    
    @Override
    public double area() {
        
    return (PI*(diametro*diametro))/4;
    
    }
    
}
