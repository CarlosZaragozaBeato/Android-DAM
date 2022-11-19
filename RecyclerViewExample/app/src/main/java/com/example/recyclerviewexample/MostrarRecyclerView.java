package com.example.recyclerviewexample;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import java.util.ArrayList;

public class MostrarRecyclerView extends AppCompatActivity implements View.OnClickListener {


    public static final ArrayList<Integer> ITEMS = new ArrayList<Integer>();
    RecyclerView recycler;
    RecyclerView.LayoutManager layout_manager;
    RecyclerView.Adapter myAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_recycler_view);
        DataInit();
        Button btn_volver = findViewById(R.id.buttonVolver);

        btn_volver.setOnClickListener(this);

        recycler = findViewById(R.id.recyclerView);

        recycler.setHasFixedSize(true);

        layout_manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(layout_manager);

        recycler.setAdapter(new MyAdapter(ITEMS));
    }
    private void DataInit() {
        for (int i = 0; i<=100;i++){
            ITEMS.add(i);
        }
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}