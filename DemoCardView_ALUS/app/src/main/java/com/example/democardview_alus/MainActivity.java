package com.example.democardview_alus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.democardview_alus.databinding.ActivityMainBinding;
import com.example.democardview_alus.recycler_view.MyAdapter;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    RecyclerView.LayoutManager layout_manager;
    RecyclerView.Adapter myAdapter;
    MyDataContent data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        data = new MyDataContent();

        binding.rvCardView.setHasFixedSize(true);
        layout_manager = new LinearLayoutManager(this);
        binding.rvCardView.setLayoutManager(layout_manager);
        binding.rvCardView.setAdapter(new MyAdapter(MyDataContent.data));
    }
}