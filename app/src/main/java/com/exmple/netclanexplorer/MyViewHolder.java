package com.exmple.netclanexplorer;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {


//    ImageView imageViews;
    TextView names,locations,positions,chargers,prelocations,applying;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
//        imageViews = itemView.findViewById(R.id.imageView);
        names = itemView.findViewById(R.id.name);
        locations = itemView.findViewById(R.id.location);
        positions = itemView.findViewById(R.id.position);
        chargers = itemView.findViewById(R.id.charger);
        prelocations = itemView.findViewById(R.id.prelocation);
        applying = itemView.findViewById(R.id.applying);

    }
}
