package com.company;

public class VehiculoMaritimo extends Vehiculo{
    private Boolean velas;
    private Boolean motor;
    private float profundidadMaxima;

    public VehiculoMaritimo(Boolean velas, Boolean motor, float profundidadMaxima, String material, String color, float velocidadMaxima, float velocidadMinima, int cantidadDeRuedas) {
        super(material, color, velocidadMaxima, velocidadMinima, cantidadDeRuedas);
        this.velas = velas;
        this.motor = motor;
        this.profundidadMaxima = profundidadMaxima;
    }

    public Boolean getVelas() {
        return velas;
    }

    public void setVelas(Boolean velas) {
        this.velas = velas;
    }

    public Boolean getMotor() {
        return motor;
    }

    public void setMotor(Boolean motor) {
        this.motor = motor;
    }

    public float getProfundidadMaxima() {
        return profundidadMaxima;
    }

    public void setProfundidadMaxima(float profundidadMaxima) {
        this.profundidadMaxima = profundidadMaxima;
    }

    @Override
    public String toString() {
        return "VehiculoMaritimo{" + "velas=" + velas + ", motor=" + motor + ", profundidadMaxima=" + profundidadMaxima + '}';
    }
    
}
