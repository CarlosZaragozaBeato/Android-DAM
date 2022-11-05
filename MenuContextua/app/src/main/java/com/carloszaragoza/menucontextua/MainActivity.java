package com.carloszaragoza.menucontextua;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ActionMode mActionMode;
    ListView starks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        starks=(ListView)findViewById(R.id.listaStarks);


        ArrayAdapter<String> adaptador1= new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_multiple_choice,
                getResources().getStringArray(R.array.list_stark));
        starks.setAdapter(adaptador1);


        ListView listaLannisters=(ListView)findViewById(R.id.listaLannisters);
        ArrayAdapter<String> adaptador2=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice,
                getResources().getStringArray(R.array.list_lannister));
        listaLannisters.setAdapter(adaptador2);
        listaLannisters.setOnItemClickListener(this);
        registerForContextMenu(starks);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.matar:
                Toast.makeText(getApplicationContext(), "Hemos matado a " +
                        starks.getItemAtPosition(info.position), Toast.LENGTH_LONG).show();
                return true;
            case R.id.sanar:
                Toast.makeText(getApplicationContext(), "Hemos sanado a " +
                        starks.getItemAtPosition(info.position), Toast.LENGTH_LONG).show();
                return true;
            case R.id.enviarmensaje:
                Toast.makeText(getApplicationContext(), "Le hemos enviado un mensaje a " +
                        starks.getItemAtPosition(info.position), Toast.LENGTH_LONG).show();
                return true;
            default:
                Toast.makeText(getApplicationContext(), "Le hemos hecho otra cosa a " +
                        starks.getItemAtPosition(info.position), Toast.LENGTH_LONG).show();
                return true;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        mActionMode = MainActivity.this.startActionMode(mActionModeCallback);
        view.setSelected(true);
    }
    private ActionMode.Callback mActionModeCallback = new ActionMode.Callback() {
        // Called when the action mode is created; startActionMode() was called
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            // Inflate a menu resource providing context menu items
            MenuInflater inflater = mode.getMenuInflater();
            inflater.inflate(R.menu.menu2, menu);
            return true;
        }
        // Called each time the action mode is shown. Always called after onCreateActionMode, but
        // may be called multiple times if the mode is invalidated.
        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false; // Return false if nothing is done
        }
        // Se llama a este método cuando se ha pulsado en la lista de los lannisters
        @SuppressLint("NonConstantResourceId")
        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            switch (item.getItemId()) {
                case R.id.aniquilar:
                    //hay que crear un Aniquilar() para
                    //recorrer todos los elementos seleccionado (checked) en la listView
                    Toast.makeText(getApplicationContext(), "Hemos aniquilado a algún Lannister",Toast.LENGTH_LONG).show();
                    return true;
                case R.id.encerrar:
                    Toast.makeText(getApplicationContext(), "Hemos encerrado a algún Lannister", Toast.LENGTH_LONG).show();
                    return true;
                case R.id.salvar:
                    Toast.makeText(getApplicationContext(), "Hemos salvado a algún Lannister", Toast.LENGTH_LONG).show();
                    return true;
                default:
                    return false;
            }
        }
        // Called when the user exits the action mode
        @Override
        public void onDestroyActionMode(ActionMode mode) {
            mActionMode = null;
        }
    };
}