/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author carlo
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int[] array={1,2,3,4,5}; 
           
       
        
        
               
        RecorrerArray(array, 0);
        
        
        
     
    }
    
    //1. Sumar los números números naturales hasta N (se lo damos nosotros) de forma recursiva.
            public  static int SumaNumeros(int num){
                int resultado;
                
                if(num==1){
                    resultado = 1;
                }else{
                    resultado = num + SumaNumeros(num-1);
                }
                
                return resultado;
           
            }
            
       //2. Factorial de un número.      
            
            public static int Factorial(int num){
               
                int r=0;
                
                if(num==1){
                    r=1;
                }else{
                    r = num * Factorial(num-1);
                }
                
             return r;   
            }
                
        //3. Recorrer un array de forma recursiva. 
            
            public static void RecorrerArray(int array[], int indice){
                
                int r =0;
                
                if(indice==(array.length-1)){
                    System.out.println(array[indice]);
                }else{
                   
                        System.out.println(array[indice]);
                        RecorrerArray(array, indice+1);
                    }
                  
                }
                
            
        //4. Buscar un elemento de un array de forma recursiva.
       public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){
         
       if(indice==array.length || array[indice]==elementoBuscar){
             
            if(indice==array.length){
               return -1; 
            }else{
                return indice;
            }
             
        }else{
            return posicionElementoRecursivo(array, elementoBuscar, indice+1);
        }
         
    }
            
                  //5. Recorrer una matriz de forma recursiva.
        public static void recorrerMatrizRecursivo(int[][] m, int i, int j) {
 
        //Muestro el numero (sin salto de linea)
        System.out.print(m[i][j] + " ");
 
        //
        if (i != m.length - 1 || j != m[i].length - 1) {
 
            //Indico si llego al final de la fila
            if (j == m[i].length - 1) {
                //Paso a la siguiente fila
                i++;
                //Reinicio la j
                j = 0;
                //Salto de linea (solo formato)
                System.out.println("");
            } else {
                //Paso a la siguiente columna
                j++;
            }
 
            //Volvemos a llamar la función recursivamente
            recorrerMatrizRecursivo(m, i, j);
 
        }
 
    }
         // 6. Calcular el valor de la posición fibonacci usando recursividad.
            
            public static int fibonacciRecursivo(int n) {
 
        //CASO BASE, si es cero devuelve un cero
        //Puedes poner n&lt;=0 tamvien para incluir negativos
        if (n == 0) {
            return 0;
        //CASO BASE, si es 1 devuelve un 1    
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
 
    }
            
            
            
     
            
            } 

            


	




  

        


        
  

        

