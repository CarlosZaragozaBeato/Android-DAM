/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cine1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class Cine1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        List<Persona> cola = new ArrayList<Persona>();
        generarCola(cola);
        double recaudacion;
        double recaudacionTotal=0;
        Persona espectadorActual;
        int edadActual;
        
        while(!cola.isEmpty()){
            espectadorActual = cola.();        }
        
    }
    
    public static void generarCola(List<Persona> cola){
       
        int numeroPersona = generarNumeroAleatorio(1,50);
        for(int i=0;i<numeroPersona;i++){
            cola.add(new Persona(generarNumeroAleatorio(5, 60)));
        }
       
        
    }
    public static int generarNumeroAleatorio(int min, int max){
        
        int num =(int)Math.floor((Math.random()*(min-max))-min);
        return num;
        
    }
    
}
