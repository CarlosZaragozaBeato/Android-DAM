/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjava;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class AyudaProvincias implements IAyudasProvincial{

    @Override
    public int calcularAyudasPorHijos(ArrayList lista, int numeroMinimoHijos, String provincia) {
        int total = 0;
        for (int i = 0; i<lista.size();i++){
            Ciudadano ciudadan = (Ciudadano)lista.get(i);
            if(ciudadan.getHijos()>=numeroMinimoHijos){
                if(ciudadan.getProvincia().equalsIgnoreCase(provincia)){
                total += 1;
                }
            }
        }
        return total;
    
    }
    
}
