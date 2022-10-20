package com.carloszaragoza.spinners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {

    private Spinner sp1;
    private TextView tv1;
    private String[] provincias = {"Toledo", "Ciudad Real", "Cuenca","Guadalajara", "Albacete"};
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    sp1 = findViewById(R.id.spProvincias);
    tv1 = findViewById(R.id.tvProvincia);
        adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, provincias);
        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
    
        sp1.setAdapter(adaptador);
        sp1.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {tv1.setText(sp1.getSelectedItem().toString());}
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {tv1.setText("No se ha seleccionado nada");}

}