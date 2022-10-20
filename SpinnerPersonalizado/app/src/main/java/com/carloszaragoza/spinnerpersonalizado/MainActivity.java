package com.carloszaragoza.spinnerpersonalizado;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    String[] paises = { "España", "Brasil","UK","EEUU"};

    String[] descripciones = { "La ciudad Imperial", "Qué gran ciudad",
            "Ciudad gastronómica", "Ciudad encantada", "Ciudad colgante" };

    int imagenes[] = { R.drawable.espana, R.drawable.brasil,
            R.drawable.reino_unido, R.drawable.estados_unidos};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner selector_paises = (Spinner) findViewById(R.id.spPaises);
        SpinnerAdapter a=new SpinnerAdapter(this,
                R.layout.spinner_vista, paises);
        selector_paises.setAdapter(a);
    }


    public class SpinnerAdapter  extends ArrayAdapter<String> {

        public SpinnerAdapter(Context ctx, int txtViewResourceId, String[] objects){
            super(ctx, txtViewResourceId, objects);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            return crearFilaPersonalizada(position, convertView, parent);
        }

        @Override
        public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            return crearFilaPersonalizada(position, convertView, parent);
        }

        public View crearFilaPersonalizada(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater =  getLayoutInflater();
            View miFila = inflater.inflate(R.layout.spinner_vista, parent, false);
            TextView nombre = (TextView) miFila.findViewById(R.id.tvNombre);
            nombre.setText(paises[position]);
            TextView descripcion = (TextView) miFila.findViewById(R.id.tvDescripcion);
            descripcion.setText(descripciones[position]);
            ImageView imagen = (ImageView) miFila.findViewById(R.id.imvPaises);
            imagen.setImageResource(imagenes[position]);
            return miFila;
        }
    }
}


