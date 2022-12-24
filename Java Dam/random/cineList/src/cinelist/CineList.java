/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinelist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author carlo
 */
public class CineList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<persona> cola= new ArrayList<>();
        generarCola((ArrayList<persona>) cola);
        Iterator<persona> it=cola.iterator();
        double recaudacion;
        double recaudacionTotal=0;
        persona espectadorActual;
        int edadActual;
        
        
        while(it.hasNext()){
            
            espectadorActual =it.next();
            
            edadActual = espectadorActual.getEdad();
                if(edadActual>=5 && edadActual<=10)
                { recaudacion=1; 
                }           
                else if(edadActual>=11 && edadActual<=17)
                {
                recaudacion=2.5;
                }
                else{
                recaudacion=3.5;
            }              
         recaudacionTotal+=recaudacion;
          System.out.println("Una persona de "+edadActual+" años se le ha cobrado " +recaudacion+ " euros");
        }
          System.out.println("La recaudación es de "+recaudacionTotal+" euros");

        
    }
    
    
     public static void generarCola(ArrayList<persona> cola){
        
        int numeroPersona = numeroRandom(50,1);
        
        for(int i =0; i<numeroPersona; i++){
            
            cola.add(new persona(numeroRandom(60,5)));
         
        }
        
    }
    
    public static int numeroRandom(int max, int min){
        int random;
        random = (int)(Math.random()*(max-min))+min;
        return random;
    }
    
   
    
}
