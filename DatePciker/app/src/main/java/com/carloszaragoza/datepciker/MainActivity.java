package com.carloszaragoza.datepciker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.carloszaragoza.datepciker.dialogo.DateDialogo;
import com.carloszaragoza.datepciker.dialogo.HoraDialogo;

import java.util.Calendar;
import java.util.GregorianCalendar;






public class MainActivity extends AppCompatActivity implements
        DateDialogo.OnFechaSeleccionada, HoraDialogo.OnHoraSeleccionada, View.OnClickListener {

    Button btnFecha;
    Button btnHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFecha = findViewById(R.id.btnDate);
        btnHora = findViewById(R.id.btnHour);

        btnFecha.setOnClickListener(this);
        btnHora.setOnClickListener(this);
    }

    @Override
    public void onResultadoFecha(GregorianCalendar fecha) {
        EditText et=(EditText)findViewById(R.id.edtFecha);
        et.setText(fecha.get(Calendar.DAY_OF_MONTH)+"/"+(fecha.get(Calendar.MONTH)+1)
                +"/"+fecha.get(Calendar.YEAR));
    }

    @Override
    public void onResultadoHora(GregorianCalendar hora) {
        EditText et=(EditText)findViewById(R.id.edtHour);
        et.setText(hora.get(Calendar.HOUR)+":"+hora.get(Calendar.MINUTE));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnDate:
                onClickFecha();
                break;
            case R.id.btnHour:
                onClickHora();
                break;
        }
    }
    public void onClickHora(){
        HoraDialogo dialogo = new HoraDialogo();
        dialogo.show(getFragmentManager(),"Mi diálogo Hora");
    }
    public void onClickFecha(){
        DateDialogo dialogo = new DateDialogo();
        dialogo.show(getFragmentManager(), "Mi dialogo fecha");
    }
}