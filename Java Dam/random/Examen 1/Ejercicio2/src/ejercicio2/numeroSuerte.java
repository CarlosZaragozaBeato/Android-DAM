/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author carlo
 */
public class numeroSuerte {

    public int numeroSuerte(String fecha) {

        boolean condition = true, condition2 = true, condition3 = false;
        int i = 0,
                j = 0,
                conditionResultado = 0,
                resultadoParcial = 0,
                diaNum = 0, mesNum = 0, añoNum,
                cifraNum, cifraNum2, cifraNum3, cifraNum4;

        String dia = "",
                mes = "",
                año = "",
                cadenaNumSuerteParcial = "",
                cifraString1 = "",
                cifraString2 = "",
                cifraString3 = "",
                cifraString4 = "";

        //Conseguir el dia
        while (condition) {

            if (fecha.charAt(i) == '/') {

                dia = fecha.substring(0, i);
                condition = false;

            }
            i++;

        }

        //Conseguir el mes
        j = i;
        while (condition2) {
            if (fecha.charAt(j) == '/') {

                mes = fecha.substring(i, j);
                condition2 = false;
            }
            j++;

        }

        //Conseguir el año 
        año = fecha.substring(j, fecha.length());

        //Pasar a int
        diaNum = Integer.parseInt(dia);
        mesNum = Integer.parseInt(mes);
        añoNum = Integer.parseInt(año);

        //condiciones
        if (mesNum > 0 && mesNum <= 12 && diaNum > 0 && diaNum <= 30 && añoNum > 0) {
            condition3 = true;
        } else {
            condition3 = false;
        }

        //Numero de la suerte parcial
        if (condition3) {
            resultadoParcial = diaNum + mesNum + añoNum;
            
            cadenaNumSuerteParcial =""+resultadoParcial;

            if (cadenaNumSuerteParcial.length() == 4) {

                cifraString1 = cadenaNumSuerteParcial.substring(0, 1);
                cifraString2 = cadenaNumSuerteParcial.substring(1, 2);
                cifraString3 = cadenaNumSuerteParcial.substring(2, 3);
                cifraString4 = cadenaNumSuerteParcial.substring(3, 4);
                
                cifraNum = Integer.parseInt(cifraString1);
                cifraNum2 = Integer.parseInt(cifraString2);
                cifraNum3 = Integer.parseInt(cifraString3);
                cifraNum4 = Integer.parseInt(cifraString4);
                
                resultadoParcial = cifraNum+ cifraNum2+cifraNum3+cifraNum4;
                   

            } else {
                resultadoParcial = 0;
            }

        }

        return resultadoParcial;

    }

    /*
        EJERCICIO 2:


A continuación, sumamos las cifras del númeroSuerteParcial 2010 2+0+1+0 = 3= numeroSuerte.
El número de la suerte sería 3. (2 Puntos). 
Si no se sabe calcular el númeroSuerte, se puede usar el númeroSuerteParcial (2010 en el caso del 
ejemplo), en cuyo caso, la puntuación de este apartado sería de 1 Punto.
Para finalizar, la función devolverá un número negativo en caso de que la fecha no fuera válida. Así,
la función devolverá los siguientes valores:
-1 si el número de días no fuera válido (si es negativo, 0 o mayor que 31).
-2 si el número de meses no fuera válido (si es negativo, 0 o mayor que 12).
-3 si el número de años no fuera válido ( si es negativo).
(1 Puntos)
Por otro lado, en el método principal del programa, pide al usuario que introduzca a una fecha por 
teclado, e invoca a la función desarrollada anteriormente (le deberás pasar la fecha introducida por 
el usuario), muestra por la consola el valor del número devuelto por la función. (1 Punto).
A continuación, tienes un ejemplo de ejecución:
Para el ejemplo anterior, el númeroSuerteParcial sería 2010 y si el programa principal muestra este 
número, la puntuación del programa principal se mantiene a 1 Punto.
Se recomienda usar el método siguiente para pasar de String a un número entero:
int días=Integer.parseInt(“05” )
     */
}
