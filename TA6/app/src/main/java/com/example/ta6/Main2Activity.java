package com.example.ta6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private ImageView mimageView;
    private TextView nombre;
    private TextView descripcion;
    private ArrayList<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MuestraCupon m= new MuestraCupon();
        items=m.ponerItems();

        setContentView(R.layout.cupon1_activity);
        nombre=findViewById(R.id.txtNombre);
        nombre.setText(items.get(0).getmText1());
        descripcion=findViewById(R.id.txtDescripcion);
        descripcion.setText(items.get(0).getmText2());
        mimageView=findViewById(R.id.imageView2);
        mimageView.setImageResource(items.get(0).getImageResoruce());



    }



    public void volver(View view){
        Intent i= new Intent(this,Main2Activity.class);




        finish();
    }
}
