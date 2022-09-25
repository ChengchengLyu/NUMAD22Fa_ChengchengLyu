package edu.northeastern.numad22fa_chengchenglyu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class GameActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Button buy1 = findViewById(R.id.buy1);
        @SuppressLint("WrongViewCast") EditText score = findViewById(R.id.scoreText);
    }
}