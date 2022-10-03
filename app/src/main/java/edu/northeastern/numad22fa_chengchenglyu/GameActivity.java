package edu.northeastern.numad22fa_chengchenglyu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    //ListView lv;
    RecyclerView generatorRecyclerView;
    List<Generator> generatorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Button buy1 = findViewById(R.id.buy1);
        @SuppressLint("WrongViewCast") EditText score = findViewById(R.id.scoreText);
        generatorList = new ArrayList<>();
        generatorList.add(new Generator("Pizza", 7.465));
        generatorRecyclerView = findViewById(R.id.generator_recycler_view);
        generatorRecyclerView.setHasFixedSize(true);
        generatorRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        generatorRecyclerView.setAdapter(new GeneratorAdapter(generatorList, this));
    }
}