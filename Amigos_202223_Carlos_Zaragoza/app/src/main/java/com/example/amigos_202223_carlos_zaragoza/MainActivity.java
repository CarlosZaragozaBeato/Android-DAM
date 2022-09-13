package com.example.amigos_202223_carlos_zaragoza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number_a, number_b;
    private TextView result;

    SomosAmigos sa = new SomosAmigos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        number_a = findViewById(R.id.edt_numero_a);
        number_b = findViewById(R.id.edt_numero_b);

        result = findViewById(R.id.result);


    }

    public void calcularAmigos(View v){
       result.setText(sa.calcularAmigos(Integer.parseInt(String.valueOf(number_a.getText())),Integer.parseInt(String.valueOf(number_b.getText()))));
    }

}