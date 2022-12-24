
package ut3actividad1;


public class Ejercicio3 {
    
    
       public static int numDias(String mes, int año){
        Ejercicio1 ej1 = new Ejercicio1();
        int dias=0;
        boolean biAño=ej1.añoBisiesto(año);
 
        switch(mes) {
                     case "Abril":
                     case "Junio":
                     case "Septiembre":                 
                     case "Noviembre":
                         
                      dias = 30;   

                    break;
                    
                     case "Enero":
                     case "Marzo":
                     case "Mayo":                 
                     case "Julio":                         
                     case "Agosto":
                     case "Octubre":
                     case "Diciembre":                                   
                         
                     dias = 31;   

                    break;
                    
                    case "Febrero":
                         
                        if(biAño==true){
                            dias=29;
                        }else{
                            dias=28;
                        }
                            
                    break;
                                                         
}
                    
                 return  dias;
      
        
    }
    
}
