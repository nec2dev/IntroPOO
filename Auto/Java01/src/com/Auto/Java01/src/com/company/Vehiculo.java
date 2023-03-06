package com.company;

public class Vehiculo {
    private String material;
    private String color;
    private float velocidadMaxima;
    private float velocidadMinima;
    private int cantidadDeRuedas;

    public Vehiculo(String material, String color, float velocidadMaxima, float velocidadMinima, int cantidadDeRuedas) {
        this.material = material;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadMinima = velocidadMinima;
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public float getVelocidadMinima() {
        return velocidadMinima;
    }

    public void setVelocidadMinima(float velocidadMinima) {
        this.velocidadMinima = velocidadMinima;
    }

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", velocidadMinima=" + velocidadMinima +
                ", cantidadDeRuedas=" + cantidadDeRuedas +
                '}';
    }
}
