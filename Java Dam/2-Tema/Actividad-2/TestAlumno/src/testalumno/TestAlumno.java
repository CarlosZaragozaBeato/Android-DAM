
package testalumno;

public class TestAlumno {

  
    public static void main(String[] args) {
    

        
        Alumno al = new Alumno(1, 10, "carlos", "Zaragoza", "DAm", 0);
        Alumno a2 = new Alumno(2, 19, "Zaragoza", "Carlos", "DAW", 10);
        Grupo grp = new Grupo(al, a2);
        al.esMayorEdad();
     
        System.out.println(al.notaMayor(a2));
        System.out.println(grp.notaMedia());
              
        
    }
    
}
