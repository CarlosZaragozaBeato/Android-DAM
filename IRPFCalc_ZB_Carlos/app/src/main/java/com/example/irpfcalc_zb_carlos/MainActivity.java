package com.example.irpfcalc_zb_carlos;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.irpfcalc_zb_carlos.utils.calcularAños;
import com.example.irpfcalc_zb_carlos.utils.calcularIrpf;
import com.example.irpfcalc_zb_carlos.utils.minimosIrpf;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Instancias de las clases que utilizaremos
    private minimosIrpf minIrpf = new minimosIrpf();
    private calcularIrpf calIrpf = new calcularIrpf();
    private calcularAños calAños = new calcularAños();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcular = findViewById(R.id.calcular);

        calcular.setOnClickListener(this);
    }


    /*
    * En este metodo, que se ejecutara siempre y cuando todos los inputs contengan valores,
    * llamara a los metodos de las clases que creamos anteriormente para calcular el irpf con los
    * valores insertados.
    * */
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onClick(View view) {
        EditText edtEdad = findViewById(R.id.edtDate);
        EditText edtHijos = findViewById(R.id.edtHijos);
        EditText edtSalarioBruto = findViewById(R.id.edtSalarioBruto);
        TextView retencionTotal = findViewById(R.id.tvRetencionTotal);
        DecimalFormat formatDecimal = new DecimalFormat("#.##");

        double porcentaje = 0.0;
        double minHijos = 0.0;
        double minEdad = 0.0;
        double minimoPersonal = 0;
        double sueldoIrpf = 0.0;
        double finalResult = 0.0;
        double total = 0.0;
        int años = 0;
        String añoNacimiento = "" ;

        Date fechaNacimiento = new Date();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime now = LocalDateTime.now();

        @SuppressLint("SimpleDateFormat") SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    if(edtEdad.getText().length()!=0 &&
            edtSalarioBruto.getText().length()!=0  &&
            edtHijos.getText().length()!=0  ){
        System.out.println(minIrpf.calcularHijos(4));
        try{
            fechaNacimiento =format.parse(String.valueOf(edtEdad.getText()));
        }catch (Exception ex){Log.d("ERROR", ex.getLocalizedMessage());
        }
        //* Conseguimos la edad del usuario
        añoNacimiento = calAños.dividirFechaNacimiento(fechaNacimiento.toString());
        años = calAños.calcAños(añoNacimiento, dtf.format(now).toString());

        //* el porcentaje de 6.35 del salario bruto
        porcentaje = (Integer.parseInt(String.valueOf(edtSalarioBruto.getText()))) * 0.0635;


        total = (Integer.parseInt(String.valueOf(edtSalarioBruto.getText()))-2000 -porcentaje);

        //*Se calculan los minimos
        minHijos = minIrpf.calcularHijos(Integer.parseInt(String.valueOf(edtHijos.getText())));
        minEdad = minIrpf.calcularMinimoPersonal(años);

        //Calcula el irpf del minimo, sumando el minimo de hijos y de edad con la funcion minimoTotal
        minimoPersonal = calIrpf.calcularIrpf(minIrpf.minimoTotal(minHijos, minEdad));

        //*Calcula el irpf del salario bruto
        sueldoIrpf = calIrpf.calcularIrpf(total);
        finalResult =(sueldoIrpf - minimoPersonal);

        retencionTotal.setText(String.valueOf(formatDecimal.format(finalResult)));
        }
    }
}