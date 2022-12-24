/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laliga;

/**
 *
 * @author usumaniana1
 */
public class EPuntosNegativos extends Exception {

    EPuntosNegativos(int puntos)
    {
        super("No es posible añadir un equipo con puntos negativos");
    }   
}