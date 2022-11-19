package com.carloszaragoza.intentserv;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class activity_pruebas extends ListActivity implements ListView.OnItemClickListener {


    ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pruebas);

        String[] lista_provincias = {"Toledo", "Ciudad Real", "Cuenca", "Guadalajara","Albacete"};
        lista = findViewById(android.R.id.list);
        ArrayAdapter<String> adaptador;
        adaptador = new ArrayAdapter<String>(this, R.layout.fila,lista_provincias);
        setListAdapter(adaptador);
        lista.setOnItemClickListener(this);
    }


    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Intent i=new Intent();
        i.putExtra("PROVINCIA",adapterView.getItemAtPosition(position).toString());
        setResult(RESULT_OK,i);
        finish();
    }



}