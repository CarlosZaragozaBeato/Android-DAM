package com.carloszaragoza.contactprovider;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TextView.OnEditorActionListener {


    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = findViewById(R.id.edtContacto);

        edt.setOnEditorActionListener(this);
    }



    /*public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView t=(TextView)view;
        String nombreContacto=t.getText().toString();
        String proyeccion[]={ContactsContract.Contacts._ID};
        String filtro=ContactsContract.Contacts.DISPLAY_NAME + " = ?";
        String args_filtro[]={nombreContacto};

        ContentResolver cr = getContentResolver();
        Cursor cur = cr.query(ContactsContract.Contacts.CONTENT_URI,
                proyeccion, filtro, args_filtro, null);
        if (cur.getCount() > 0) {
            while (cur.moveToNext()) {
                @SuppressLint("Range") String identificador = cur.getString(
                        cur.getColumnIndex(ContactsContract.Contacts._ID));
                enviarSMS(identificador,"Hola, ¿quedamos?");
            }
        }
        cur.close();
        return true;
    }*/

    @SuppressLint("Range")
    private ArrayList<String> buscarContacto(String contacto){
        String proyeccion[]={ContactsContract.Contacts._ID,
                ContactsContract.Contacts.DISPLAY_NAME,
                ContactsContract.Contacts.HAS_PHONE_NUMBER,
                ContactsContract.Contacts.PHOTO_ID};
        String filtro = ContactsContract.Contacts.DISPLAY_NAME + " like ?";
        String args_filtro[] =  {"%"+ contacto +"%"};


        ArrayList<String> lista_contactos = new ArrayList<>();
        ContentResolver contentResolver = getContentResolver();
        Cursor cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI,
                    proyeccion,filtro,args_filtro,null);

        if (cursor.getCount() > 0){
            while(cursor.moveToNext()){
                @SuppressLint("Range") String name = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                if (Integer.parseInt(cursor.getString(
                        cursor.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER)
                ))>0){
                    lista_contactos.add(name);
                }
            }
        }
        cursor.close();
        return lista_contactos;
    }





    @Override
    public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
            if (actionId == EditorInfo.IME_ACTION_SEARCH
                    || actionId == EditorInfo.IME_ACTION_DONE
                    || keyEvent.getAction() == KeyEvent.ACTION_DOWN
                    && keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                ArrayList<String> lista = buscarContacto("Casa");
                Log.d("TAG", lista.toString());
                return true;
            }
            return false;
    }
}