/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author usumaniana
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        //1. Escribe un programa que pida la anchura y 
        //altura de un rectángulo y lo dibuje de la siguiente manera: 
        //Primer
        /*System.out.println("Anchura del rectangulo.");
        int columnas = entrada.nextInt();
        
        System.out.println("Altura del rectangulo.");
        int filas = entrada.nextInt();
        
        for(int i= 0; i<filas; i++){
            for(int j = 1; j<columnas; j++){
                System.out.print("*");
            }
            System.out.println("");
        }*/
        //Segundo
        //2. Escribe un programa que pida la altura de un triángulo y lo dibuje de la siguiente manera:
        /*System.out.println("Introduzca la altura del triangulo.");
        int altura = entrada.nextInt();
        
        for(int i =0; i<=altura; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
         */
        //Tercero
        /*
           System.out.println("Introduzca la altura del triangulo.");
        int altura = entrada.nextInt();

        for(int i = 0; i<altura; i++){
            for(int j =altura; j>i; j--){
                System.out.print("*");
            }
            System.out.println("");
         
        }
    } 
         */
   
    
    //*Escribe un método que calcule la suma de los elementos de la
    //*diagonal principal de una matriz 4 x 4.
    /*
      
        recorrerMatriz();
    public static void recorrerMatriz(){
            int matriz[][] = new int[4][4];
            //****
            //****
            //****
            //****
                
            rellenarMatriz(matriz);
            
            
            int valor1 = matriz[0][0];
            int valor2 = matriz[1][1];
            int valor3 = matriz[2][2];
            int valor4 = matriz[3][3];
            
            int resultado = valor1 + valor2 + valor3 + valor4;
            System.out.println("El resultado es: "+resultado);

    }   
    
       public static void rellenarMatriz(int[][] matriz){
        
             for(int i = 0; i<matriz.length;i++){
                for(int j =0; j<matriz.length;j++){
                  int random = (int)(Math.random()*100+1);          
                    matriz[i][j] = random;
                    System.out.print(" "+matriz[i][j]);
                }
                System.out.println("");
            }
 
    }
    */
    
    

    
    
    }

    
    
    
 
    
}
