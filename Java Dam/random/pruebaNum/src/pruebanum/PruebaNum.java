/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebanum;

/**
 *
 * @author carlo
 */
public class PruebaNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        
        System.out.println(recuperarLetras("hola llamo carlos"));
        
    }
    
    public static String recuperarLetras(String entrada){
        
        String dosLetras="";
        int i=0;
        
        boolean condition1=true;
        
        while(condition1){
                    i++;
            if(entrada.charAt(i)== ' '){
             
                
                dosLetras = entrada.substring(i+1,i+3);
                condition1 = false;    
            }
    
            
            
        }
  
        return dosLetras+i;
        
    }
         
}
