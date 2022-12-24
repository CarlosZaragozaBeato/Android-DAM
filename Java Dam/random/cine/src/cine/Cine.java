/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        persona p1 = new persona("carlos", "zaragoza", "702", "46");
        String nombre, apellidos,dni,telefono;
        System.out.println(p1.colaCine());
        
        double recaudacion=0;
       
        int cola = p1.colaCine();
        //List <persona> list = new ArrayList<persona>();
        
    
        persona[] arrayCine =new persona[cola];
        for(int i=0; i<cola;i++){
            
            System.out.println("Introduce el nombre"); 
            nombre = entrada.nextLine();
            
            System.out.println("Introduce el apellido"); 
            apellidos = entrada.nextLine();
            
            System.out.println("Introduce el dni"); 
            dni = entrada.nextLine();
            
            System.out.println("Introduce el telefono"); 
            telefono = entrada.nextLine();
            
           arrayCine[i]= new persona(nombre, apellidos, dni, telefono);
            
            
             
        }
        
        
        
        for(int i =0; i<arrayCine.length;i++){
            
            if(arrayCine[i].getEdad()>5 && arrayCine[i].getEdad()<10){
               
                recaudacion +=1;
            }else if(arrayCine[i].getEdad()>11 && arrayCine[i].getEdad()<17){
                recaudacion+=2.5;
            }else if(arrayCine[i].getEdad()>18){
                recaudacion+=3.5;
                
            }
            
            System.out.println(arrayCine[i]+" La recaudacion es: "+recaudacion);
        }
        
  
     
        
    }
    
    
    
}
