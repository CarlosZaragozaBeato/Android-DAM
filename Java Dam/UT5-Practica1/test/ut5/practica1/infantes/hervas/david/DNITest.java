/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut5.practica1.infantes.hervas.david;

import ut5.practica1.DNI;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usumaniana1
 */
public class DNITest {
       
    @Test
    public void testComprobarNumero() {
        System.out.println("comprobarNumero");
        DNI d1 = new DNI(12345678,"Z");
        
        assertEquals(true, d1.comprobarNumero(d1.getNumero()));
    }
    
    @Test
    public void testComprobarNumero2() {
        System.out.println("comprobarNumero");
        DNI d1 = new DNI(123456789,"Z");
        
        assertEquals(false, d1.comprobarNumero(d1.getNumero()));
    }
    
    @Test
    public void testCalcularLetra() {
        System.out.println("calcularLetra");
        DNI d2 = new DNI(12345678,"Z");
     
        assertEquals("Z",""+d2.calcularLetra(d2.getNumero()));
    }
    
    @Test
    public void testCalcularLetra2() {
        System.out.println("calcularLetra");
        DNI d2 = new DNI(12345678,"Z");
     
        assertEquals("B",""+d2.calcularLetra(d2.getNumero()));
    }    
}
