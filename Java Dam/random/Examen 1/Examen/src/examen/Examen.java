/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author carlo
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        perro p1 = new perro("labrador", "canela", "hembra", 30, 2);
        perro p2 = new perro("maltés", "blanco", "macho", 5, 2);
        perro p3 = new perro("galgo", "blanco","macho",20,5);
        
        System.out.println(p2.Cruzar(p3));
        System.out.println(p1.Cruzar(p3));
        
      /*Perro1:
Raza: labrador
Color: canela
Edad: 2
Peso: 30
Sexo: hembra
Perro2:
Raza: maltés
Color: blanco
Edad: 2
Peso: 5
Sexo: macho
Perro3:
Raza: galgo
Color: blanco
Edad: 5
Peso: 20
Sexo: macho
Muestra los datos de cada perro por pantalla(1 Punto, si se crean los perros de forma correcta y se 
muestran sus datos por pantalla).
Para finalizar, desde el programa principal realiza 2 cruces:
 cruza al perro2 con el perro3 y muestra el resultado del cruce. (1Punto)
 cruza el perro1 con el perro3 y muestra el resultado del cruce. (1Punto*/
    }
    
}
