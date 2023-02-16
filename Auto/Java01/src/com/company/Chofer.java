package com.company;

public class Chofer {
    private String nombre;
    private String apellido;


    public Chofer(){

    };
    public Chofer(String n, String a) {
        nombre = n;
        apellido = a;
    }

    @Override
    public String toString() {
        return "Chofer{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
