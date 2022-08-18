package com.example.apirest.models;

public class IndicatorListItem {
    
    private String codigo;
    private String nombre;
    private String unidad_medida;
    private String fecha;
    private Long valor;


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

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Long getValor() {
        return this.valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

}
