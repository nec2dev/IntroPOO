package com.company;

public class VehiculoAereo extends Vehiculo {
    private Boolean alas;
    private Boolean helices;
    private float altitudMaxima;

    public VehiculoAereo(Boolean alas, Boolean helices, float altitudMaxima, String material, String color,
            float velocidadMaxima, float velocidadMinima, int cantidadDeRuedas) {
        super(material, color, velocidadMaxima, velocidadMinima, cantidadDeRuedas);
        this.alas = alas;
        this.helices = helices;
        this.altitudMaxima = altitudMaxima;
    }

    public Boolean getAlas() {
        return alas;
    }

    public void setAlas(Boolean alas) {
        this.alas = alas;
    }

    public Boolean getHelices() {
        return helices;
    }

    public void setHelices(Boolean helices) {
        this.helices = helices;
    }

    public float getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(float altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    @Override
    public String toString() {
        return "VehiculoAereo{" + "alas=" + alas + ", helices=" + helices + ", altitudMaxima=" + altitudMaxima + '}';
    }
    
}
