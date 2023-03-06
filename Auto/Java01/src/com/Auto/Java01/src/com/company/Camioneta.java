package com.company;
public class Camioneta extends VehiculoTerrestre {
    private String tipoDeCamioneta;
    private String motorDeCamioneta;
    private int cantidadDeEjes;

    public Camioneta(String tipoDeCamioneta, String motorDeCamioneta, int cantidadDeEjes, Boolean aireAcondicionado, float precio, String marca, String material, String color, float velocidadMaxima, float velocidadMinima, int cantidadDeRuedas) {
        super(aireAcondicionado, precio, marca, material, color, velocidadMaxima, velocidadMinima, cantidadDeRuedas);
        this.tipoDeCamioneta = tipoDeCamioneta;
        this.motorDeCamioneta = motorDeCamioneta;
        this.cantidadDeEjes = cantidadDeEjes;
    }

    public String getTipoDeCamioneta() {
        return tipoDeCamioneta;
    }

    public void setTipoDeCamioneta(String tipoDeCamioneta) {
        this.tipoDeCamioneta = tipoDeCamioneta;
    }

    public String getMotorDeCamioneta() {
        return motorDeCamioneta;
    }

    public void setMotorDeCamioneta(String motorDeCamioneta) {
        this.motorDeCamioneta = motorDeCamioneta;
    }

    public int getCantidadDeEjes() {
        return cantidadDeEjes;
    }

    public void setCantidadDeEjes(int cantidadDeEjes) {
        this.cantidadDeEjes = cantidadDeEjes;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "tipoDeCamioneta=" + tipoDeCamioneta + ", motorDeCamioneta=" + motorDeCamioneta + ", cantidadDeEjes=" + cantidadDeEjes + '}';
    }
}
    


