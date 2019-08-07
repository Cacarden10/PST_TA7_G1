package com.example.ta6;

import java.util.ArrayList;

public class MuestraCupon {
    private ArrayList<Item>items= new ArrayList<>();

    public ArrayList<Item> ponerItems() {

        return this.items;
    }

    public MuestraCupon(){
        this.items.add(new Item("1",R.drawable.ic_store_black_24dp,"2x1 Helados","Por la compra de tu cono de helados llevate , llevate el segundo gratis"));
        this.items.add(new Item("2",R.drawable.ic_store_black_24dp,"Segundo a mitad de precio","Por la compra de tu cono de helados llevate el segundo gratis"));
        this.items.add(new Item("3",R.drawable.ic_store_black_24dp,"No te quedes con hambre","Hamburguesas a mitad de precio"));

    }
}
