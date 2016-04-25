package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_spotify(View view){
        Toast.makeText(getApplicationContext(),
                "This button will launch my Spotify app",
                Toast.LENGTH_SHORT).show();
    }

    public void click_score(View view){
        Toast.makeText(getApplicationContext(),
                "This button will launch my Score app",
                Toast.LENGTH_SHORT).show();
    }

    public void click_library(View view){
        Toast.makeText(getApplicationContext(),
                "This button will launch my Library app",
                Toast.LENGTH_SHORT).show();
    }

    public void click_reader(View view){
        Toast.makeText(getApplicationContext(),
                "This button will launch my Reader app",
                Toast.LENGTH_SHORT).show();
    }

    public void click_build(View view){
        Toast.makeText(getApplicationContext(),
                "This button will launch my Build app",
                Toast.LENGTH_SHORT).show();
    }

    public void click_myOwn(View view){
        Toast.makeText(getApplicationContext(),
                "This button will launch my my own app",
                Toast.LENGTH_SHORT).show();
    }

}
