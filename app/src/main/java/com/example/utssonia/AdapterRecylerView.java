package com.example.utssonia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdapterRecylerView extends RecyclerView.Adapter<AdapterRecylerView.viewHolder> {

    ArrayList<ItemModel> dataitem;
    public class viewHolder extends RecyclerView.ViewHolder {

        TextView textjudul;
        TextView textTahun;
        ImageView posterNovel;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textjudul = itemView.findViewById(R.id.text_judul);
            textTahun = itemView.findViewById(R.id.text_tahun);
            posterNovel = itemView.findViewById(R.id.image_poster);
        }
    }
    AdapterRecylerView(ArrayList<ItemModel> data){
        this.dataitem = data;
}

    @NonNull
    @Override
    public AdapterRecylerView.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
        return new viewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecylerView.viewHolder holder, int position) {
        TextView text_judul = holder.textjudul;
        TextView text_tahun = holder.textTahun;
        ImageView image_poster = holder.posterNovel;

        text_judul.setText(dataitem.get(position).getNama());
        text_tahun.setText(dataitem.get(position).getYear());
        image_poster.setImageResource(dataitem.get(position).getPoster());
    }


    @Override
    public int getItemCount() {
        return dataitem.size();
    }
    }