package com.carloszaragoza.datepciker.dialogo;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateDialogo  extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    OnFechaSeleccionada f;

    @Override
    public void onAttach(@NonNull Context context) {
        f=(OnFechaSeleccionada)context;
        super.onAttach(context);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar c=Calendar.getInstance();
        int año=c.get(Calendar.YEAR);
        int mes=c.get(Calendar.MONTH);
        int dia=c.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(),this,año,mes,dia);
    }

    public interface OnFechaSeleccionada{
        public void onResultadoFecha(GregorianCalendar fecha);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        GregorianCalendar g=new GregorianCalendar(i,i1,i2);
        f.onResultadoFecha(g);
    }
}
