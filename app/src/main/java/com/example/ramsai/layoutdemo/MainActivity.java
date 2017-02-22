package com.hacback17.layoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ramsai.layoutdemo.R;

public class MainActivity extends AppCompatActivity {
    ImageView dhoni;
    ImageView kohli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dhoni = (ImageView) findViewById(R.id.dhoni);
        kohli = (ImageView) findViewById(R.id.kohli);
    }

    public void fade(View view){
        dhoni.animate().alpha(0f).setDuration(2000);

        // Fade in
        kohli.animate().alpha(1f).setDuration(2000);
        kohli.bringToFront();

    }
    public void fadeBack(View view){
        // Fade out
        kohli.animate().alpha(0f).setDuration(2000);
        // Fade in
        dhoni.animate().alpha(1f).setDuration(2000);
        dhoni.bringToFront();
    }
}