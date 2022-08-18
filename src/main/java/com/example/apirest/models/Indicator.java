package com.example.apirest.models;

import java.util.ArrayList;

public class Indicator {
    private String version;
    private String autor;
    private String codigo;
    private String nombre;
    private String unidad_medida;
    private ArrayList<Object> serie;


    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad_medida() {
        return this.unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public ArrayList<Object> getSerie() {
        return this.serie;
    }

    public void setSerie(ArrayList<Object> serie) {
        this.serie = serie;
    }

}
