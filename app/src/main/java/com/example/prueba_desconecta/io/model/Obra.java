package com.example.prueba_desconecta.io.model;

public class Obra {

private TipusObra tipo;
private int id;
private String descripcion;
private String autor;
private String museuNom;
private String nom;


public Obra(){

}
    public TipusObra getTipo() {
        return tipo;
    }

    public void setTipo(TipusObra tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMuseuNom() {
        return museuNom;
    }

    public void setMuseuNom(String museuNom) {
        this.museuNom = museuNom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
