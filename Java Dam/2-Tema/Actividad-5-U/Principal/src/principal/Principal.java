
package principal;


public class Principal {

   
    public static void main(String[] args) {
    /*Contendrá el método principal de la aplicación (main). Realizar las siguientes acciones:
 Crea 3 categorías, 2 directores, 4 actores y 2 películas por categoría.
 Visualiza los datos de las 2 películas.
 A continuación, crea 2 clientes (un cliente tendrá un saldo de 2€ y otro de 10€).
 Seguidamente crea 2 alquileres uno por cada cliente.
 Por último, visualiza toda la información de cada uno de los alquileres y verifica que el 
campo saldo de los clientes ha sido actualizado y que el número de unidades de cada 
película ha sido modificado*/  
    
    Cliente cl1 = new Cliente("carlos", "zaragpza", "546", 10);
    Pelicula p1 = new Pelicula(2, "54", 2018, "4", "da", "d", "d", "d");
    
    Alquiler alq1 = new Alquiler("14/20/10", cl1, p1);
    
        System.out.println(alq1.getPrecioPorDia());
    }
}
