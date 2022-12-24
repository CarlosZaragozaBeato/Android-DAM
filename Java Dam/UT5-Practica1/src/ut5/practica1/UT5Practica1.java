/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut5.practica1;

/**
 *
 * @author usumaniana1
 * @since 15/03/2022
 * @version version 1
 */
public class UT5Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        Ciclo DesarrolloAplicacionesMultiplataforma = new Ciclo(1, "Desarrollo Aplicaciones Multiplataforma");
        Modulo Programación = new Modulo(1, "Programacion", DesarrolloAplicacionesMultiplataforma);
        Modulo EntornosDeDesarrollo = new Modulo(3, "Entornos de Desarrollo", DesarrolloAplicacionesMultiplataforma);
        
        
        Profesor Sergio = new Profesor("Sergio", "Cambronero", "Ponce", 69545014, "Y");
        Profesor Angel = new Profesor("Angel", "Vela", "Cardenas", 25351657, "E");
        Profesor Ana = new Profesor("Ana Belen", "Castañeda", "Ochoa", 57016731, "F");
        
        ALUMNO Carlos = new ALUMNO("Carlos", "Zaragoza", "Beato", 16559197, "W", DesarrolloAplicacionesMultiplataforma);
        ALUMNO David = new ALUMNO("David", "Infates", "Orgaz", 21074967, "K", DesarrolloAplicacionesMultiplataforma);
        ALUMNO Antonio = new ALUMNO("Antonio", "Murphy", "Benitez", 34350890, "E", DesarrolloAplicacionesMultiplataforma);
    
        
        
        David.setTelefono("678541255");
        David.setDireccion("Castellon");
        
        System.out.println(Programación);
        System.out.println(EntornosDeDesarrollo);
        System.out.println(DesarrolloAplicacionesMultiplataforma);
        
        System.out.println("");
        
        System.out.println(Carlos);
        System.out.println(David);
        System.out.println(Antonio);
        
        System.out.println("");
        
        System.out.println(Sergio);
        System.out.println(Angel);
        System.out.println(Ana);
        
                
                
    }
}
