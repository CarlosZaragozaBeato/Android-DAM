
package ejercicio1;


public class Ejercicio1 {

  
    public static void main(String[] args) {
        
        jugador messi = new jugador("Messi", 200, 45);
        jugador mbappe = new jugador("Mbappe", 150, 35);
        
        
        Equipo barcelona = new Equipo("Barcelona", 300, 42, messi);
        Equipo paris = new Equipo("Paris", 800, 100, mbappe);
        
        
        System.out.println(paris.transferir(barcelona));
        
       
        System.out.println(paris);
        
        System.out.println(barcelona);
        
        
       
     
        String partido= "Madrid,4;Malaga,3.";
        String partido2="Herencia,4;Villa,4";
        
        
        partido jornada1 = new partido();
        
        System.out.println(jornada1.obtenerGanador(partido));
        System.out.println(jornada1.diferenciaGoles(partido));        

    }
    
}
