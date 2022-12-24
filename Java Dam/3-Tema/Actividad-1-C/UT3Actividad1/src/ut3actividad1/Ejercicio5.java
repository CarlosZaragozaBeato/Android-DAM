
package ut3actividad1;


public class Ejercicio5 {
    /*
        Ejercicio 5
        Crea una función que reciba una fecha por parámetro y devuelva TRUE si la fecha es válida y
        FALSE en caso contrario. Consideraciones a tener en cuenta:
        1. El mes debe estar comprendido en el rango del 1 al 12.
        2. Para el día su valor mínimo será 1, y el valor máximo dependerá del número del mes.  
    */
    

    public static boolean retornaFecha(int dia, int mes, int año){
        Ejercicio3 ej3 = new Ejercicio3();
              int mesD = 30;   
              boolean condition=false;
        switch(mes) {
                     case 4:
                     case 6:
                     case 8:                 
                     case 11:
                                        
                     
                      mesD=30; 
            

                    break;
                    
                     case 1:
                     case 3:
                     case 5:                 
                     case 7:
                     case 9:
                     case 10:
                     case 12:    
                         
                         
                      mesD = 30;                         
                         
                       

                    break;
                    
                    case 2:
                     
                            
                    break;
                                                         
}
        
        
        if(mes>1 && mes<12 && dia>1 && dia < mesD){

                condition= true;
            }else{
                condition=false;
                
            }
        
        
        
        
        
        
            return condition;
    }
    
    
}
