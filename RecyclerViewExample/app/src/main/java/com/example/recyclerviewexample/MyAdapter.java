package com.example.recyclerviewexample;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    ArrayList<Integer> localDataSet;



    public MyAdapter (ArrayList<Integer> dataSet){

        localDataSet = dataSet;}

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView txtView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtView = itemView.findViewById(R.id.textView);
        }

        public TextView getTextView(){return txtView;}
    }





    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_mostrar_recycler_view_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TextView tv1 = holder.itemView.findViewById(R.id.numItem);
        tv1.setText(localDataSet.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }



}
