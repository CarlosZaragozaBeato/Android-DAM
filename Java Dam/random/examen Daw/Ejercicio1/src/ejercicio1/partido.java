/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author carlo
 */
public class partido {
 
    public String obtenerGanador(String partido){
        
        int i=0,
            primerEquipoNum=0,
            segundoEquipoNum=0;
        boolean condition=true,
                condition2=true;
        String resultado,
                resultadoPrimerEquipo="",
                resultadoSegundoEquipo="",
                primerEquipo="",
                segundoEquipo="",
                ganadorEquipo="";
        
        
        while(condition){
          i++;
            if(partido.charAt(i)==','){
                
                resultadoPrimerEquipo = partido.substring(i+1, i+2);
                primerEquipo= partido.substring(0, i);
                condition=false;
            }
            
        } 
        
        
       int j=i;
         while(condition2){
          i++;
            if(partido.charAt(i)==','){
                
                segundoEquipo = partido.substring(j+3, i);
                resultadoSegundoEquipo = partido.substring(i+1, i+2);
                
                condition2=false;
            }
            
        } 
         
        
       primerEquipoNum = Integer.parseInt(resultadoPrimerEquipo);
       segundoEquipoNum = Integer.parseInt(resultadoSegundoEquipo);
       
       if(primerEquipoNum>segundoEquipoNum){
           ganadorEquipo=primerEquipo;
       }else if(primerEquipoNum<segundoEquipoNum){
           ganadorEquipo =segundoEquipo;
       }else if(primerEquipoNum==segundoEquipoNum){
           ganadorEquipo= "Empate";
       }else{
           ganadorEquipo="no valido";
       }
        
        return ganadorEquipo;
    }
    
    public int diferenciaGoles(String partido){
         int i=0,
            primerEquipoNum=0,
            segundoEquipoNum=0,
            diferenciaGoles=0;
         
        boolean condition=true,
                condition2=true;
        
        String 
                resultadoPrimerEquipo="",
                resultadoSegundoEquipo="";
            
                
        
        
        while(condition){
          i++;
            if(partido.charAt(i)==','){
                
              
                resultadoPrimerEquipo = partido.substring(i+1, i+2);
                condition=false;
            }
            
        } 
        
        
       int j=i;
         while(condition2){
          i++;
            if(partido.charAt(i)==','){
                
                
                resultadoSegundoEquipo = partido.substring(i+1, i+2);
                
                condition2=false;
            }
            
        } 
         
        
       primerEquipoNum = Integer.parseInt(resultadoPrimerEquipo);
       segundoEquipoNum = Integer.parseInt(resultadoSegundoEquipo);
       
       if(primerEquipoNum>segundoEquipoNum){
           diferenciaGoles=primerEquipoNum-segundoEquipoNum;
       }else if(primerEquipoNum<segundoEquipoNum){
           diferenciaGoles=segundoEquipoNum-primerEquipoNum;
       }else if(primerEquipoNum==segundoEquipoNum){
           diferenciaGoles= 0;
       }
        
        return diferenciaGoles;
    }
        
    }
    
    

