/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author usumaniana1
 */
public class Utilidades {
    
    
    
    
    
    
    
    public static String getIniciales(String nombre){
        
        boolean condition = true;
        String inicialNombre=null, inicialApellido=null, Iniciales ;
        int i=0;
        
        
        inicialNombre = nombre.substring(i,i+1);
        
        
        while(condition){
            i++;
             if (nombre.charAt(i) == ' ') {
                
                
                inicialApellido = nombre.substring(i+1, i+2);
                
                condition =false;
                
            }
            
            
        }
        
        Iniciales = inicialNombre.toUpperCase() +inicialApellido.toUpperCase();
        
        
        return Iniciales ;
        
    }
    
    public static int getYear(String fecha){
        
        
        boolean condition = true;
        String año = null;
        int añO;
        int i=0;
        
        i = fecha.length();
        
        
        
        while(condition){
            i--;
             if (fecha.charAt(i) == '/') {
                 
                 
                
                año = fecha.substring(i+1);
                condition = false;
                
            }
            
            
        }
        añO = Integer.parseInt(año);
      
        
        
        return añO;
        
        
        
        
    }
}


