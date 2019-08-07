package com.example.ta6;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.ta6.R.layout.activity_postres;

public class Postres extends AppCompatActivity {

    private Spinner spin;
    private TextView precio,descripcion;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_postres);

        spin = (Spinner) findViewById(R.id.spinner1);
        precio =(TextView)findViewById(R.id.text_pre);
        descripcion =(TextView)findViewById(R.id.text_des);
        img =(ImageView)findViewById(R.id.image_des);

        String[] productos = {"Helado de oreo","Pie de limon","Dona"};

        ArrayAdapter<String> opciones= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, productos);
        spin.setAdapter(opciones);
    }

    public void consultar(){
        String dato =spin.getSelectedItem().toString();
        verificacion(dato);
    }

    public void verificacion(String str){
        if (str.equalsIgnoreCase("Helado de oreo")){
            precio.setText("$ 2.5");
            descripcion.setText("Deliciosa copa de helado de oreo");
            img.setImageResource(R.drawable.oreo);
        }else if(str.equalsIgnoreCase("Pie de limón")){
            precio.setText("$ 4.00");
            descripcion.setText("La tarta de limón es una tarta formada por una base de masa quebrada u hojaldre que se rellena con crema de limón.");
            img.setImageResource(R.drawable.pie);
        }else if(str.equalsIgnoreCase("Dona")){
            precio.setText("$ 1.50");
            descripcion.setText("Dona rellena de manjar y cubierta de chocolate");
            img.setImageResource(R.drawable.dona);
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
