/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testalumno;

import java.text.DecimalFormat;

/**
 *
 * @author carlo
 */
public class Alumno {
    
 
    
    private int numMatricula, edad;
    private String nombre, apellidos, curso;
    private double notaMedia;
    
    public void esMayorEdad(){
        
        if(getEdad()>=18){
            System.out.println("El nombre del alumno "+getNombre() +" y es mayor de edad.");
        }else{
             System.out.println("El nombre del alumno "+getNombre() +" y es menor de edad.");
        }
    }

    
     public double notaMayor(Alumno a1)
    {
        double media = a1.getNotaMedia();
        double nota=0;
        if (this.notaMedia > media)
        {
            nota = this.notaMedia;
            System.out.println("El alumno "+this.nombre+ " " +this.apellidos +" con nota "+this.notaMedia+" tiene mas nota que "+a1.getNombre()+" "+a1.getApellidos());
        }
        else
        {
           nota = a1.notaMedia;
           System.out.println("El alumno "+a1.getNombre()+ " " +a1.getApellidos() +" con nota "+a1.getNotaMedia()+" tiene mas nota que "+this.nombre+" "+this.apellidos); 
        }
        
        return nota;
    }

    @Override
    public String toString() 
    {
        return "Alumno{" + "numMatricula=" + numMatricula + ", nombre=" + nombre + ", apellidos=" + apellidos + ", curso=" + curso + ", edad=" + edad + ", notaMedia=" + notaMedia + '}';
    }
    
    

   
    
    public Alumno(int numMatricula, int edad, String nombre, String apellidos, String curso, double notaMedia) {
        this.numMatricula = numMatricula;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    public Alumno() {
        this.numMatricula = 1;
        this.nombre = "Anónimo" ;
        this.apellidos = "";
        this.curso ="DAW"; 
        this.edad =18;
        this.notaMedia = 7.59;
        
    }
    
    
    
    /*
  
APARTADO B




    */

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    
    
    
    
}
