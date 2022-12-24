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
public class Rectangulo implements Figura{

    private double lado, altura;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }
    
    
    
    @Override
    public double area() {

            return lado*altura;
            
    }
    
    
    
}
