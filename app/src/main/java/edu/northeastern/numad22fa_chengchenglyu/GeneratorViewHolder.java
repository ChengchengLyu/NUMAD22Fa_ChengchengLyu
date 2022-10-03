package edu.northeastern.numad22fa_chengchenglyu;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GeneratorViewHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public TextView value;
    public GeneratorViewHolder(@NonNull View itemView){
        super(itemView);
        this.name = itemView.findViewById(R.id.name);
        this.value = itemView.findViewById(R.id.value);
    }
}
