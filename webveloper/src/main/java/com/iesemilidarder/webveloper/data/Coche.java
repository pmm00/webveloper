package com.iesemilidarder.webveloper.data;

public class Coche extends Producto {

    private int cantidad;
    private String color;
    private int carroceria;
    private String marca;
    private String modelo;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(int carroceria) {
        this.carroceria = carroceria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
