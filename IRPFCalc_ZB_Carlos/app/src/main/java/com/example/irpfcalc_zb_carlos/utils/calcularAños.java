package com.example.irpfcalc_zb_carlos.utils;

public class calcularAños {
    //Funcion para calcular la diferencia de los años entre la fecha de nacimiento y el año actual
    public int calcAños(String fechaActual, String fechaNacimiento){
        int edad = Integer.parseInt(fechaNacimiento) -  Integer.parseInt(fechaActual);
        return edad;
    }

    //Esta funcion sirve para dividir la fecha de nacimiento introducida por el usuario

    public String dividirFechaNacimiento(String fecha){

        String[] fechaDividida = fecha.split(" ");

        System.out.println(fechaDividida[fechaDividida.length-1]);

        return fechaDividida[fechaDividida.length-1];

    }
}
