package lecturafichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LecturaFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

     /*   FileReader ficheroLectura;
        int c;
        try {

            ficheroLectura = new FileReader("./miFichero.pdf");
            do {
                c = ficheroLectura.read();
                if (c != -1) {
                    System.out.print((char) c);
                }

            } while (c != -1);

            ficheroLectura.close();

        } catch (FileNotFoundException e) {
            
            System.out.println("Fichero no existe\n " +e.getMessage());
        }catch(IOException e1){
            
            System.out.println("Error De E/S \n"+e1.getMessage());
            
        }finally{
            System.out.println("Salida del Try catch.");
        }*/
     
     Scanner sc = null;
     File fichero;
     String palabra;
     
        try {
            
          fichero = new File("miFichero.pdf");
          if(fichero.exists()){
                  sc = new Scanner(fichero);
          }
          while(sc.hasNext()){
              
              palabra = sc.nextLine();
              System.out.println(palabra);
              
          }
          
          sc.close();
            
            
       } catch (FileNotFoundException e) {
            
            System.out.println("Fichero no existe\n " +e.getMessage());
        }catch(IOException e1){
            
            System.out.println("Error De E/S \n"+e1.getMessage());
            
        }finally{
            System.out.println("Salida del Try catch.");
        }
     
    }

}
