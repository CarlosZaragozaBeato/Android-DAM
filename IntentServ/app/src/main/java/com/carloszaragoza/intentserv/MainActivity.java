package com.carloszaragoza.intentserv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int SELECCIONA_PROVINCIA = 1;


    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn = findViewById(R.id.btn);

       btn.setOnClickListener(this);
    }

    public void onClick(View v){
        Intent i=new Intent(this,activity_pruebas.class);
        startActivityForResult(i, SELECCIONA_PROVINCIA);
    }


    //recibe los resultados
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView t = (TextView) findViewById(R.id.txtResultado);
        if (requestCode == SELECCIONA_PROVINCIA) {
            if (resultCode == RESULT_OK) {
                // se seleccionó correctamente la provincia
                t.setText("Se ha seleccionado:\n" + data.getStringExtra("PROVINCIA"));
            }
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}