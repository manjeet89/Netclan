package com.exmple.netclanexplorer;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }



    public void setFilterList(List<Item> filterList){
        this.items = filterList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cusom_explore,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.names.setText(items.get(position).getName());
        holder.locations.setText(items.get(position).getLocation());
        holder.positions.setText(items.get(position).getPosition());
        if (items.get(position).getCharges().equals("")){
            holder.chargers.setVisibility(View.GONE);
        }else {
            holder.chargers.setText(items.get(position).getCharges());
        }
        holder.prelocations.setText(items.get(position).getPrelocation());
        holder.applying.setText(items.get(position).getApplyting());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
