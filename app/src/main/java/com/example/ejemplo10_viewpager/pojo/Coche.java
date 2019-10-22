package com.example.ejemplo10_viewpager.pojo;

public class Coche {

    private int imagen;
    private int rating;
    private float precio;
    private String modelo;
    private String descricpcion;

    public Coche(int imagen, int rating, float precio, String modelo, String descricpcion) {
        this.imagen = imagen;
        this.rating = rating;
        this.precio = precio;
        this.modelo = modelo;
        this.descricpcion = descricpcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricpcion() {
        return descricpcion;
    }

    public void setDescricpcion(String descricpcion) {
        this.descricpcion = descricpcion;
    }
}
