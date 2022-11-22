package com.example.recyclerview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myViewHolder> {

    Context context;
    List<item> items;

    public myAdapter(Context context, List<item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.developerImage.setImageResource(items.get(position).getDeveloperImage());
        holder.developerName.setText(items.get(position).developerName);
        holder.developerSkill.setText(items.get(position).developerSkill);
        holder.developerCompany.setText(items.get(position).developerCompany);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
