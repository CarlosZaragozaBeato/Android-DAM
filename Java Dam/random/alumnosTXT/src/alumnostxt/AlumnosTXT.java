/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnostxt;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.*;
/**
 *
 * @author carlo
 */
public class AlumnosTXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        FileWriter escritor = null;
        Scanner sc = new Scanner(System.in);
        List<fabricaAlumnos> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));
        listaAlumnos.add(new fabricaAlumnos(1, "calo", "españa", "zaragoza", "DAM", "12/07/1999", 10));

        
        escritor = new FileWriter("fichero.txt");
        escritor.write(listaAlumnos);
        
        
        
    }

}
