package com.example.ta6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Bebidas extends AppCompatActivity {

    private Spinner spin;
    private TextView precio,descripcion;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        spin = (Spinner) findViewById(R.id.spinner1);
        precio =(TextView)findViewById(R.id.text_pre);
        descripcion =(TextView)findViewById(R.id.text_des);
        img =(ImageView)findViewById(R.id.image_des);

        String[] productos = {"cola","jugos","agua"};

        ArrayAdapter<String> opciones= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, productos);
        spin.setAdapter(opciones);
    }

    public void consultar(){
        String dato =spin.getSelectedItem().toString();
        verificacion(dato);
    }

    public void verificacion(String str){
        if (str.equalsIgnoreCase("cola")){
            precio.setText("$ 0.5");
            descripcion.setText("coca cola personal");
            img.setImageResource(R.drawable.cola);
        }else if(str.equalsIgnoreCase("jugos")){
            precio.setText("$ 2.00");
            descripcion.setText("jugos naturales");
            img.setImageResource(R.drawable.jugos);
        }else if(str.equalsIgnoreCase("agua")){
            precio.setText("$ 0.50");
            descripcion.setText("botella de agua personal");
            img.setImageResource(R.drawable.agua);
        }else{
            precio.setText("no se puede consultar");
            descripcion.setText("no se puede consultar");
            img.setImageResource(R.drawable.cola);
        }
    }

    //@Override
    public void onClick(View view) {
        //Invocamos al método:
        consultar();
    }
}
