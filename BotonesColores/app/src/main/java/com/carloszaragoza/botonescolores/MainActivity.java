package com.carloszaragoza.botonescolores;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.material.Colors;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        añadeHijos();
        recorrer();


    }
    public void recorrer(){
        View v;
        GridLayout grid = findViewById(R.id.miGrid);
        for (int i = 0; i < grid.getChildCount(); i++) {
            v=grid.getChildAt(i);
            System.out.println("objeto:"+ v.toString());
            Button b = (Button)v;
            b.setBackgroundColor(Color.rgb(i*10, i*15,i*10));
            b.setTextColor(Color.WHITE);
        }
    }

    public void añadeHijos(){
        GridLayout grid = (GridLayout) findViewById(R.id.miGrid);
        Button button;
        for(int i=0;i<1000;i++) {
            button = new Button(this);
            button.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setText("btn" + i);
            button.setId(View.generateViewId());
            button.setOnClickListener(this);
            grid.addView(button,i);

        }
    }

    @Override
    public void onClick(View view) {
        GridLayout grid = (GridLayout) findViewById(R.id.miGrid);

        if (view.getClass().getSimpleName().equals("Button")) {
            /*Button btn = (Button) view;
            btn.setBackgroundColor(Color.WHITE);*/
            grid.removeView(view);
        }


    }


}