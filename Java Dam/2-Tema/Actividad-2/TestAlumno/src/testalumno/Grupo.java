/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testalumno;

/**
 *
 * @author carlo
 */
public class Grupo {
    
    private Alumno alumno1, alumno2;

    public Grupo(Alumno alumno1, Alumno alumno2) {
        this.alumno1 = alumno1;
        this.alumno2 = alumno2;
    }
    
    
    
    public double notaMedia(){
        double nota;
        nota = (alumno1.getNotaMedia()+ alumno2.getNotaMedia())/2;
        
        return nota;
        
        
    }

    @Override
    public String toString() {
        return "Grupo{" + "alumno1=" + alumno1 + ", alumno2=" + alumno2 + '}';
    }
    


    public Grupo() {
    }
    
}
