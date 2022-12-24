/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut3actividad1;

/**
 *
 * @author usumaniana1
 */
public class Ejercicio4 {
    
      
    /*
        Ejercicio 4
            Crea una función que permita calcular el índice de masa corporal (IMC) de una persona. A esta
            función se le pasará 2 parámetros: peso y altura ambos de tipo double (el peso se indica en KG
            y altura en metros, por ejemplo, 72.3 sería el peso 1.78 la altura). Para calcular el IMC nos
            guiamos a través de la siguiente fórmula:
            IMC = Peso / (Altura) 2
            La función calculará el IMC mediante la fórmula anterior y devolverá el tipo de peso (String)
            teniendo en cuanta la siguiente tabla:
            IMC

            Un IMC menor de 18
            Un IMC de 18 a 24,9
            UN IMC de 25 a 29,9
            Un IMC de 30 a 34,9
            Un IMC de 35 a 39,9
            Un IMC superior a 40

            Tipo de peso
            peso por debajo de lo normal
            peso normal
            preobeso
            obesidad de 2o grado
            Obesidad de 3o grado (premorbida)
            Obesidad de 4o grado (mórbida)
    */
    
    public static String calcularIMG(double peso, double altura){
          double imc=0;
          String forma=null;
          imc = peso /((altura)*2);
          
          if(imc<18){
              forma = "peso por debajo de lo normal";
          }else if(imc>18 && imc<25){
              forma = "peso normal";           
          }else if(imc>30 && imc<35){
              forma = "preobeso";      
          }else if(imc>35 && imc<39){
              forma = "Obesidad de 3o grado (premorbida)";
          }else if (imc>40){
              forma = "Obesidad de 4o grado (mórbida)";
        
    }
          
          
        return forma;
        
        
    }
    
}
