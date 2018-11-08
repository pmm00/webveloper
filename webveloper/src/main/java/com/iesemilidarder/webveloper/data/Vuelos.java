package com.iesemilidarder.webveloper.data;

public class Vuelos extends Producto {

    private int identificador;
    private String origen;
    private String destino;
    private int fechaSalida;
    private int fechaLlegada;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(int fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(int fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
}
