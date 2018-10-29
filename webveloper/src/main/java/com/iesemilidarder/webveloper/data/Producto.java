package com.iesemilidarder.webveloper.data;

import java.util.Date;

public abstract class Producto {

    private Date horarios;
    private String titulo;
    private String imagen;
    private Float precio;
    private String tipo;
    private String descripcion;

    public Date getHorarios() {
        return horarios;
    }

    public void setHorarios(Date horarios) {
        this.horarios = horarios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
