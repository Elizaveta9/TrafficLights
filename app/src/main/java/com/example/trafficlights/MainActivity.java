package com.example.trafficlights;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    public LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.background);
    }

    public void red(View view){
        int color = Color.RED;
        layout.setBackgroundColor(color);
    }

    public void green(View view){
        int color = Color.GREEN;
        layout.setBackgroundColor(color);
    }

    public void yellow(View view){
        int color = Color.YELLOW;
        layout.setBackgroundColor(color);
    }
}

