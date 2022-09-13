package com.example.amigos_202223_carlos_zaragoza;

public class SomosAmigos {

    public SomosAmigos() {
    }

    public String calcularAmigos(int a, int b){

        int acuA=0;
        int acuB=0;

        for(int i = 1; i<a; i++){
            if(a%i==0){
                acuA+=i;
            }
        }

        for(int j=1; j<b; j++){
            if(b%j== 0){
                acuB+=j;
            }
        }


        if(acuA == b && acuB == a){
            return "Somos Amigos";
        }else{
            return "No Somos Amigos";
        }

    }
}

