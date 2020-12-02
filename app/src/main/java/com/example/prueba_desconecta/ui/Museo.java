package com.example.prueba_desconecta.ui;

import java.util.ArrayList;

public class Museo {

    private String nombre;
    private ArrayList<Obra> obras;


    public Museo(String name, ArrayList<Obra> work ){
        nombre = name;
        obras = work;
    }

    public ArrayList<Obra> getobralist(){
        return obras;

    }

    public Obra getObra(int i){
        return obras.get(i);
    }

    public String getNombre(){
        return nombre;
    }

}