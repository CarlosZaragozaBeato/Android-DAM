package com.example.irpfcalc_zb_carlos.utils;

/*
 En esta clase tenemos una funcion para calcular el irpf, que dispone de varias sentencias condicionales
 para poder ir comprobando en que tramo del irpf estamos, Por ejemplo: si tenemos un total de 15k
 la operacion que realizaria es que pasaria del primer if dado que es el valor indicamos es mayor
 que la cantidad que indica, pero ya en el segundo if ya no, y entonces pasaria a la sentencia else
 que se encuentra la penultima de nuestro arbol de sentencia, en dicha sentencia restaria el valor que
 indicamos con el minimo del tramo y lo multiplicaria por .24(el porcentaje de nuestro tramo), para poder
 saber cuando tendriamos de dicho tramo.
 */

public class calcularIrpf {
    public double calcularIrpf(double total) {
        double retencion = 0.0;
        if (total >= 12449) {retencion += 2365.5;
            if (total >= 20199) {retencion += 1860;
                if (total >= 35199) {retencion += 4500;
                    if (total >= 59999) {retencion += 9250;
                        if (total >= 60000) {retencion += 27000;}
                    } else {retencion += (total - 35200) * .37;}
                } else {retencion += (total - 20200) * .3;}
            } else {retencion += (total - 12450) * .24;}
        } else {retencion += total * .19;}

        return retencion;
    }
}
