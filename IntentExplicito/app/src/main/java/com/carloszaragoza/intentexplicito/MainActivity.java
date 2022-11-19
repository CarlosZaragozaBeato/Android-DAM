package com.carloszaragoza.intentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.carloszaragoza.intentexplicito.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;

    Button email,url,mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view= binding.getRoot();
        setContentView(view);




        email = binding.buttonCORREO;
        url = binding.buttonURL;
        mapa = binding.buttonMAPA;

        email.setOnClickListener(this);
        mapa.setOnClickListener(this);
        url.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i=new Intent();
        Intent chooser=null;
        switch(view.getId()){
            case R.id.buttonURL:
                EditText edURL=(EditText)findViewById(R.id.editTextURL);
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse(edURL.getText().toString()));
                chooser=i.createChooser(i,"Elige Navegador");
                startActivity(i);
                Toast.makeText(this.getApplicationContext(),"Acceso a web!",Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonMAPA:
                EditText edLatitud=(EditText)findViewById(R.id.editTextLatitud);
                EditText edLongitud=(EditText)findViewById(R.id.editTextLongitud);
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:"+edLatitud.getText().toString()+" ,"+edLongitud.getText().toString()));
                chooser=i.createChooser(i,"Lanzar Mapas");
                startActivity(i);
                Toast.makeText(this.getApplicationContext(),"Acceso a mapas!",Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonCORREO:
                EditText edEmail= binding.editTextCORREO;
                i.setAction(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto:"));
                String para[]={edEmail.getText().toString(),"otrocontacto@gmail.com"};
                i.putExtra(Intent.EXTRA_EMAIL,para);
                i.putExtra(Intent.EXTRA_SUBJECT,"Saludos desde Android");
                i.putExtra(Intent.EXTRA_TEXT,"Hola!!. ¿Qué tal?. Este es nuestro primer email");
                i.setType("message/rfc822");
                chooser=i.createChooser(i,"Enviar Email");
                startActivity(i);
                Toast.makeText(this.getApplicationContext(),"Envía el email!!",Toast.LENGTH_LONG).show();
                break;
        }
    }
}