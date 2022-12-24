/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut3actividad1;

/**
 *
 * @author carlo
 */
public class Ejercicio6 {

    /*
        Ejercicio 6
            Diseña una función que reciba por parámetro una fecha, y devuelva una cadena de texto
            dependiendo de las siguientes condiciones:
            1. Si el formato de la fecha sea incorrecto, devolverá la cadena “Fecha incorrecta”.
            2. En caso contrario, devolverá el número del día junto con el mes (en formato de texto)
            y el año, por ejemplo, si recibe la fecha 13/11/2018, la función devolverá “13 de
            Noviembre del 2018”.
     */
    public static String formatoFecha(String fecha) {
        String comprobacionFecha;
        boolean condition1 = true, condition2 = true, condition3 = true;
        int i = 0, j = 0, k = 0;
        String dia = null, mes = null, año = null, cadena=null;

        if (fecha.length()!=10) {
            cadena = "La fecha es incorrecta";
        } else if (fecha.length() == 10) {

            while (condition1) {
                i++;
                if (fecha.contains("/")) {
                    dia = fecha.substring(0, i + 1);
                    condition1 = false;
                }

            }
            j = i + 1;
            while (condition2) {
                j++;
                if (fecha.contains("/")) {
                    mes = fecha.substring(i + 2, j + 2);
                    condition2 = false;
                }
            }
            k = fecha.length();
            while (condition3) {
                k--;
                if (fecha.contains("/")) {
                    año = fecha.substring(j + 3, k + 1);
                    condition3 = false;
                }
            }

            switch (mes) {
                case "01":
                    mes="Enero"; 
                    break;
                case "02":
                    mes="Febrero"; 
                case "03":
                    mes="Marzo"; 
                    break;
                case "04":     
                    mes="Abril"; 
                    break;
                case "05":
                    mes="Mayo"; 
                    break;
                case "06":
                    mes="Junio"; 
                    break;
                case "07":
                    mes="Julio"; 
                    break;
                case "08":
                    mes="Agosto"; 
                    break;
                case "09":
                    mes="Septiembre"; 
                    break;
                case "10":
                    mes="Octubre"; 
                    break;
                case "11":
                     mes="Noviembre"; 
                 break;
                case "12":
                    mes="Diciembre"; 
                 break;   
                 
            }
            
           cadena = dia + " de " + mes + " del " + año;
        }
        
        return cadena;

    }

}
