package com.company;

public class Automovil extends VehiculoTerrestre{
    private String tipoDeAuto;
    private String motorDeAuto;
    private Boolean airBags;

    public Automovil(String tipoDeAuto, String motorDeAuto, Boolean airBags, Boolean aireAcondicionado, float precio, String marca, String material, String color, float velocidadMaxima, float velocidadMinima, int cantidadDeRuedas) {
        super(aireAcondicionado, precio, marca, material, color, velocidadMaxima, velocidadMinima, cantidadDeRuedas);
        this.tipoDeAuto = tipoDeAuto;
        this.motorDeAuto = motorDeAuto;
        this.airBags = airBags;
    }

    public String getTipoDeAuto() {
        return tipoDeAuto;
    }

    public void setTipoDeAuto(String tipoDeAuto) {
        this.tipoDeAuto = tipoDeAuto;
    }

    public String getMotorDeAuto() {
        return motorDeAuto;
    }

    public void setMotorDeAuto(String motorDeAuto) {
        this.motorDeAuto = motorDeAuto;
    }

    public Boolean getAirBags() {
        return airBags;
    }

    public void setAirBags(Boolean airBags) {
        this.airBags = airBags;
    }

    @Override
    public String toString() {
        return "Automovil{" + "tipoDeAuto=" + tipoDeAuto + ", motorDeAuto=" + motorDeAuto + ", airBags=" + airBags + '}';
    }
    
}
