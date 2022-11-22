package com.example.democardview_alus.recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.democardview_alus.DataModel;
import com.example.democardview_alus.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    ArrayList<DataModel> data_model = new ArrayList();

    public MyAdapter(ArrayList<DataModel> data_model){
        this.data_model = data_model;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getTextView1().setText(data_model.get(position).getName());
        holder.getTextView2().setText(data_model.get(position).getVersion());
        holder.getImageView().setImageResource(data_model.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return data_model.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView img;
        private final TextView tv1;
        private final TextView tv2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.img = itemView.findViewById(R.id.ivAndroid);
            this.tv1 = itemView.findViewById(R.id.tvTitle);
            this.tv2 = itemView.findViewById(R.id.tvVersion);
        }
        public TextView getTextView1(){return tv1;}
        public TextView getTextView2(){return tv2;}
        public ImageView getImageView(){return img;}
    }
}
