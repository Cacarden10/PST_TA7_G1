package com.example.ta6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.ta6.R.layout.cupon_main;

public class Cupones_Activity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private  ArrayList<Item> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(cupon_main);
        MuestraCupon m= new MuestraCupon();
        this.items=m.ponerItems();



        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter= new ExampleAdapter(items);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);



    }

    public void verCupon(View v){
        Intent i= new Intent(this,Main2Activity.class);
        ImageView mImageView =v.findViewById(R.id.imageView2);
        TextView nombre =v.findViewById(R.id.txtNombre);
        TextView descripcion=v.findViewById(R.id.txtDescripcion);

        int posicion= v.getVerticalScrollbarPosition();
        //nombre.setText(items.get(posicion).getmText1());
        //descripcion.setText(items.get(posicion).getmText2());
        //mImageView.setImageResource(items.get(posicion).getImageResoruce());

        startActivity(i);
        Toast.makeText(this, "Ingresando cupon", Toast.LENGTH_SHORT).show();
    }


}
