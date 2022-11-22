package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myViewHolder extends RecyclerView.ViewHolder {

    ImageView developerImage;
    TextView developerName,developerSkill,developerCompany;

    public myViewHolder(@NonNull View itemView) {
        super(itemView);

        developerImage=itemView.findViewById(R.id.developerImage);
        developerName=itemView.findViewById(R.id.developerName);
        developerSkill=itemView.findViewById(R.id.developerSkill);
        developerCompany=itemView.findViewById(R.id.developerCompany);
    }
}
