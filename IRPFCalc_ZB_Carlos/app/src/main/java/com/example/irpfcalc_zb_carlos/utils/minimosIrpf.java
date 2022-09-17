package com.example.irpfcalc_zb_carlos.utils;

/*
/ La primera funcion calcula el minimo que se le debe dar a la persona segun el numero de hijos
que disponga si tiene 1 = 2400, 2 = 2700, 3 = 4000, y a partir de cuatro 4500, todos estas cantidades
se iran acumulando en cuanto al numero de hijos que tenga.
 */

public class minimosIrpf {
    public double calcularHijos(int hijos) {
        double minimoFamiliar = 0;

        if (hijos == 1) {minimoFamiliar += 2400;}
        else if (hijos == 2) {minimoFamiliar += 5100;}
        else if (hijos == 3) {
            minimoFamiliar += 9100;
        }else if(hijos>3){
            minimoFamiliar += 9100;
            minimoFamiliar += (hijos - 3) * 4500;
        }
        return minimoFamiliar;
    }



    /*
    * En esta funcion calculamos el minimo segun la edad, se le abonara una retencia espcifica segun
    * la edad que tenga.
    */
    public double calcularMinimoPersonal(int edad) {
        double minimoPersonal = 0;

        if (edad < 65) {minimoPersonal = 5550;}
        else if (edad >= 65 && edad <= 75) {minimoPersonal = 6468;}
        else if (edad > 75) {minimoPersonal = 7590;}
        return minimoPersonal;
    }

    public double minimoTotal(double minHijos, double minEdad){
        return minHijos + minEdad;
    }
}
