package com.company;
//import com.company.Vehiculo; 

public class VehiculoTerrestre extends Vehiculo{
    private Boolean aireAcondicionado;
    private float precio;
    private String marca;

    public VehiculoTerrestre(Boolean aireAcondicionado, float precio, String marca, String material, String color, float velocidadMaxima, float velocidadMinima, int cantidadDeRuedas) {
        super(material, color, velocidadMaxima, velocidadMinima, cantidadDeRuedas);
        this.aireAcondicionado = aireAcondicionado;
        this.precio = precio;
        this.marca = marca;
    }

    public Boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(Boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "VehiculoTerrestre{"  + " aireAcondicionado=" + aireAcondicionado + ", precio=" + precio + ", marca=" + marca + '}';
    }
    
}
