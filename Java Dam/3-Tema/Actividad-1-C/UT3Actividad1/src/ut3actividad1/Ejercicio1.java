
package ut3actividad1;


public class Ejercicio1 {
    
    
    /*Ejercicio 1
     * Crear una función que reciba por parámetro un número entero correspondiente a un año, y
     *   devuelva true si el año es bisiesto y false en caso contrario. Restricciones a tener en cuenta:
     *   Todos los años bisiestos deben ser divisibles entre 4.
     *   Además, NO deben ser divisible entre 100.
     *   En el caso de que sea SÍ sea divisible entre 100 será bisiesto SI ES DIVISIBLE también
     *   entre 400.
     */
    
    public  boolean añoBisiesto(int año){
        
         boolean bisiesto;
        
        
        if(año%4==0 && año%100!=0){
            bisiesto = true;
        }else if(año%100==0 && año%400==0){
            bisiesto = true;
        }
        else{
            bisiesto= false;
        }               
        return bisiesto;
        
    }
}
