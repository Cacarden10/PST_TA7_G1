package com.example.ta6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class PFuertes extends AppCompatActivity {

    private Spinner spin;
    private TextView precio,descripcion;
    private ImageView img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfuertes);

        spin = (Spinner)findViewById(R.id.spinner1);
        precio =(TextView)findViewById(R.id.text_pre);
        descripcion =(TextView)findViewById(R.id.text_des);
        img =(ImageView)findViewById(R.id.image_des);

        String[] productos = {"Pizza","Hot Dog","Lazaña","Hamburguesa"};

        ArrayAdapter <String> opciones= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, productos);
        spin.setAdapter(opciones);

    }

    public void consultar(){
       String dato =spin.getSelectedItem().toString();
       verificacion(dato);
    }

    public void verificacion(String str){
        if (str.equalsIgnoreCase("pizza")){
            precio.setText("12");
            descripcion.setText("Pizza de jamon y queso");
            img.setImageResource(R.drawable.pizza);
        }else if(str.equalsIgnoreCase("hot dog")){
            precio.setText("3 dolares");
            descripcion.setText("Hot dog con papas fritas");
            img.setImageResource(R.drawable.hot);
        }else if(str.equalsIgnoreCase("lazaña")){
            precio.setText("5 dolares");
            descripcion.setText("Lazaña de queso");
            img.setImageResource(R.drawable.lasana);
        }else if(str.equalsIgnoreCase("hamburguesa")){
            precio.setText("4 dolares");
            descripcion.setText("Hamburguesa doble carne con huevo");
            img.setImageResource(R.drawable.ham);
        }else{
            precio.setText("no se puede consultar");
            descripcion.setText("no se puede consultar");
            img.setImageResource(R.drawable.pizza);
        }
    }

    //@Override
    public void onClick(View view) {
        //Invocamos al método:
        consultar();
    }


}
