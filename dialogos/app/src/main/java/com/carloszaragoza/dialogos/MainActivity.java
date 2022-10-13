package com.carloszaragoza.dialogos;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements ChicaDialogo.RespuestaDialogoSexo,  View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open();

        Button abrir_dialogo = findViewById(R.id.btnDialogo);
        abrir_dialogo.setOnClickListener(this);
    }

    public void open(){
        ChicaDialogo ds=new ChicaDialogo();
        ds.show(getFragmentManager(),"Mi diálogo");
    }
    @Override
    public void onAceptar(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onCancelar(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        open();
    }


}