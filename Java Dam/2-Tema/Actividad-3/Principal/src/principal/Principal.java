
package principal;


public class Principal {


    public static void main(String[] args) {
    
        /*
        5. Clase Principal


 Crea 2 objetos de tipo Carrera y asigna los campeones, subcampeones y los que han 
finalizado en tercera posición.
 Vuelve a mostrar la información de los 5 pilotos y las escuderías y comprueba que los 
datos se han actualizado, dependiendo de la posición que ocupó cada piloto
        */
        Escuderia Ferrari = new Escuderia("Ferrari", "12/07/1999", 1, 1000);
        Escuderia Mercedes = new Escuderia("Mercedes", "12/07/1999", 1, 100);
        Escuderia RedBull = new Escuderia("RB", "12/07/1999", 1, 100);
        
        Bolido fr1 = new Bolido("carlos", "1", "1", Ferrari, 10, 10);
        Bolido rr1 = new Bolido();
        Bolido mrc = new Bolido(Mercedes);
        
        Piloto vettel = new Piloto("Vettel", "Germany", Ferrari, rr1, 10);
        Piloto gbatz = new Piloto("d", "d", RedBull, fr1, 0);
        Piloto stroll = new Piloto("Vettel", "Germany", Ferrari, rr1, 10);
        Piloto max = new Piloto("d", "d", RedBull, fr1, 0);
        Piloto sainz = new Piloto("Vettel", "Germany", Ferrari, rr1, 10);
        
 
        System.out.println(stroll);
        System.out.println(max);
        System.out.println(sainz);
        
        System.out.println("");
        
        Carrera spa = new Carrera("belgica", "spa", stroll, max, sainz);
        Carrera monza = new Carrera("monza", "spa", sainz, vettel, gbatz);
        
       spa.setCampeon(stroll);
       spa.setSubcampeon(max);
       spa.setThirdPosition(sainz);
   
        
        

       
        
    
        System.out.println(stroll);
        System.out.println(max);
        System.out.println(sainz);
        System.out.println("");
        System.out.println(fr1);
        System.out.println(Ferrari);
     
       
        
        
        
    }
    
}
