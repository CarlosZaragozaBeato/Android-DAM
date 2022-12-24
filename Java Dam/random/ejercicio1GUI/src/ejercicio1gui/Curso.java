/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1gui;

import java.text.DecimalFormat;

/**
 *
 * @author carlo
 */
public class Curso {
    
    private double asignatura1,asignatura2,asignatura3,
            asignatura4,asignatura5,asignatura6,asignatura7;
    
    private int añoCurso;

    public Curso( int añoCurso,double asignatura1, double asignatura2, double asignatura3, double asignatura4, double asignatura5, double asignatura6, double asignatura7) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
        this.asignatura4 = asignatura4;
        this.asignatura5 = asignatura5;
        this.asignatura6 = asignatura6;
        this.asignatura7 = asignatura7;
        this.añoCurso = añoCurso;
    }
        public Curso(int añoCurso,double asignatura1, double asignatura2, double asignatura3, double asignatura4, double asignatura5, double asignatura6) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
        this.asignatura4 = asignatura4;
        this.asignatura5 = asignatura5;
        this.asignatura6 = asignatura6;

        this.añoCurso = añoCurso;
    }
    
     public Curso(int añoCurso,double asignatura1, double asignatura2, double asignatura3, double asignatura4, double asignatura5) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
        this.asignatura4 = asignatura4;
        this.asignatura5 = asignatura5;
      

        this.añoCurso = añoCurso;
    }
    public Curso(int añoCurso,double asignatura1, double asignatura2, double asignatura3, double asignatura4) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
        this.asignatura4 = asignatura4;
        
      

        this.añoCurso = añoCurso;
    }  
    public Curso(int añoCurso,double asignatura1, double asignatura2, double asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
        this.asignatura4 = asignatura4;
        this.añoCurso = añoCurso;
    } 

    public double getAsignatura1() {
        return asignatura1;
    }

    public void setAsignatura1(double asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public double getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(double asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public double getAsignatura3() {
        return asignatura3;
    }

    public void setAsignatura3(double asignatura3) {
        this.asignatura3 = asignatura3;
    }

    public double getAsignatura4() {
        return asignatura4;
    }

    public void setAsignatura4(double asignatura4) {
        this.asignatura4 = asignatura4;
    }

    public double getAsignatura5() {
        return asignatura5;
    }

    public void setAsignatura5(double asignatura5) {
        this.asignatura5 = asignatura5;
    }

    public double getAsignatura6() {
        return asignatura6;
    }

    public void setAsignatura6(double asignatura6) {
        this.asignatura6 = asignatura6;
    }

    public double getAsignatura7() {
        return asignatura7;
    }

    public void setAsignatura7(double asignatura7) {
        this.asignatura7 = asignatura7;
    }

    public int getAñoCurso() {
        return añoCurso;
    }

    public void setAñoCurso(int añoCurso) {
        this.añoCurso = añoCurso;
    }
    
        public String CalcularMedia(Curso c1){
            DecimalFormat df = new DecimalFormat(".##");
            String resultado=null;
            double media;
           media = (asignatura1 +asignatura2+asignatura3+asignatura4+asignatura5+asignatura6+asignatura7)/7;
             
            resultado = "El año del curso es "+añoCurso+ "\n La media de dicho curso es:" + (int)media;
            return resultado;
        }
    
}
