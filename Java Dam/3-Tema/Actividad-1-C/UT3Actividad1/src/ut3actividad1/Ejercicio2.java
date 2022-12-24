
package ut3actividad1;


public class Ejercicio2 extends Ejercicio1{
    /*
        Ejercicio 2
            Desarrolla una función que reciba 2 parámetros de tipo entero (mes y año), la función deberá
            devolver el número de días que tiene el mes en dicho año. Consideraciones a tener en cuenta:
           Abril , Junio, Septiembre y Noviembre tienen 30 días.
            Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre tienen 31 días.
            Febrero si el año en cuestión NO es bisiesto tiene 28 días y 29 en caso contrario.
    */
    
  
    
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
