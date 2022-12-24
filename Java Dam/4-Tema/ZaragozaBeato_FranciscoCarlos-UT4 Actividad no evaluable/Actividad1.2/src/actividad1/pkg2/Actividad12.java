
package actividad1.pkg2;


public class Actividad12 {

    public static void main(String[] args) {
        
        
        Electrodomesticos elc1 = new Electrodomesticos(110, 55, "azul", 'a');
        
        System.out.println(elc1.toString());
        System.out.println(elc1.precioFinalPesoConsumo());
        
        Lavadora lvd1 = new Lavadora(50, 100, 10, "Rojo", 'f');
        System.out.println(lvd1.toString());
        System.out.println(lvd1.precioFinalLV());
        System.out.println(lvd1.precioFinalPesoConsumo());
        
        
        Television tv1 = new Television(80, true, 180, 200, "RED", 'c');
        System.out.println(tv1);
        System.out.println(tv1.precioFinalPesoConsumo());
        System.out.println(tv1.precioFinalTV());
        
        
    }
    
}
