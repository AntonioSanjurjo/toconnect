package com.example.prueba_desconecta.ui;

public class PreviewMuseo {

    private int id;
    private String nom;
    //private ArrayList<Obra> obras;
    private String tipus;
    private String direccio;
    private String descripcio;

    public PreviewMuseo(){

    }

   // public ArrayList<Obra> getobralist(){
     //   return getAns();

    //}

   // public Obra getAns(int i){
     //   return getAns().get(i);
  //  }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //public ArrayList<Obra> getAns() {
   //     return obras;
   // }

   // public void setAns(ArrayList<Obra> obras) {
    //    this.obras = obras;
   // }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
}