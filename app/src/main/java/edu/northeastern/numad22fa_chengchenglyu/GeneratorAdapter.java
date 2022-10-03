package edu.northeastern.numad22fa_chengchenglyu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GeneratorAdapter extends RecyclerView.Adapter<GeneratorViewHolder> {
    private final List<Generator> generators;
    private final Context context;
    public GeneratorAdapter(List<Generator> generator, Context context) {
        this.generator = generator;
        this.context = context;
    }
    @NonNull
    @Overrides
    public GeneratorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return new GeneratorViewHolder(LayoutInflater.from(context).inflate(R.layout.item_generator, null));
    }

    @Override
    public void onBindViewHolder(@NonNull GeneratorViewHolder holder, int position){
        holder.name.setText(generators.get(position).getName());
        holder.value.setText(String.valueOf(generators.get(position).getValue()));
        holder.itemView.setOnClickListener(view -> {
            Toast.makeText(context, generators.get(position).getName(), Toast.LENGTH_SHORT).show();
        });
    }
    @Override
    public int getItemCount(){
        return generators.size();
    }


}











