package com.carloszaragoza.dialogos;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class ChicaDialogo  extends DialogFragment {

    RespuestaDialogoSexo respuesta;

    public interface RespuestaDialogoSexo{
        public void onAceptar(String s);
        public void onCancelar(String s);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //Escribimos el título
        builder.setTitle("Pregunta muy importante:");
        //Escribimos la pregunta
        builder.setMessage("¿Eres una chica?");
        //añadimos el botón de Si y su acción asociada
        builder.setPositiveButton("¡SI!", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id) {
                respuesta.onAceptar("Es una chica!");
            }
        });
        //añadimos el botón de No y su acción asociada
        builder.setNegativeButton("¡NO!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                respuesta.onCancelar("Es un chico!");
            }
        });
        // Crear el AlertDialog y devolverlo
        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        respuesta = (RespuestaDialogoSexo) context;
        super.onAttach(context);
    }
}
