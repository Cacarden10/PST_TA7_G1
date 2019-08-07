package com.example.ta6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fuerte(View view){
        Intent i= new Intent(this, PFuertes.class);
        startActivity(i);
    }

    public void bebida(View view){
        Intent i= new Intent(this, Bebidas.class);
        startActivity(i);
    }

    public void cupones(View view){
        Intent i= new Intent(this, Cupones_Activity.class);
                startActivity(i);
    }
}
