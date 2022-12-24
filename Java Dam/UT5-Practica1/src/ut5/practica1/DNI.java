/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut5.practica1;

/**
 *
 * @author usumaniana1
 * @since 17/03/2022
 * @version version 1
 */
public class DNI {
    private String letra;
    private int numero;
    
    /**
     * 
     * @param numero Numero del DNI
     * @param letra Letra del DNI
     */
    public DNI(int numero,String letra) {
        

        if (this.comprobarNumero(numero) == true)
        {
            this.numero = numero;
            this.letra = ""+calcularLetra(numero);            
        }
        
    }
    
    /**
     * 
     * @return Retorna la letra del DNI
     */
    public String getLetra() {
        return letra;
    }

    /**
     * 
     * @return Retorna el numero del DNI
     */
    public int getNumero() {
        return numero;
    }

    /**
     * 
     * @param letra La letra a poner
     */
    public void setLetra(String letra) {
        if (this.comprobarNumero(numero) == true)
        {
            this.letra = letra;
        }
    }

    /**
     * 
     * @param numero El numero a poner
     */
    public void setNumero(int numero) {
        if (this.comprobarNumero(numero) == true)
        {
            this.numero = numero;
        }
    }
        

    /**
     * 
     * @return Devuelve el numero seguido de su letra
     */
    @Override
    public String toString() {
        return numero+"-"+letra.toUpperCase();
    }
    
    /**
     * 
     * @param num El numero a comprobar
     * @return Comprueba si el numero del DNI es correcto
     */
    public boolean comprobarNumero(int num)
    {
        boolean resultado;
        String n;
        
        n = ""+num;
        
        if (num > 0 && n.length() == 8)
        {
            resultado = true;
        }
        else
        {
            resultado = false;
        }
        
        return resultado;
    }
    
    
   
    /**
     * 
     * @param num El numero del DNI al que calcular la letra
     * @return Calcula la letra del DNI introducido
     */
    public char calcularLetra(int num)
    {
        char caracteres[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resto = num%23;
        
        return caracteres[resto];            
    }
}
