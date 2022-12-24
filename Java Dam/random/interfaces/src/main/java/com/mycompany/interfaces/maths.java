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
public class maths {
    
    public static void main(String args[]){
        
        

             int fig=0;      
        
             Figura figuras [] = new Figura[7];
        
             figuras[0] = new cuadrado(15); 
             figuras[1] = new Circulo(20); 
             figuras[2] = new Rectangulo(20,15);
             
             figuras[3] = new cuadrado(16); 
             figuras[4] = new Circulo(10); 
             figuras[5] = new Rectangulo(25,25);
             
             figuras[6] = new cuadrado(19); 
         
             
           
             
             for(int i=0; i<figuras.length;i++){
                 
                 System.out.println(figuras[i].area());
                 fig += figuras[i].area();
                  
             }
             
            System.out.println(fig);
            
            
      
            
            
    }
    

    
    
    
}
