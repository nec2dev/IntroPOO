package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Construimos autos
        Auto audi01 = new Auto();
        Auto fordF100 = new Auto();

        //Seteamos atributos
        audi01.setPatente("ABC123");
        audi01.setCantRuedas(4);
        audi01.setColor("Rojo");
        audi01.setMarca("Audi");
        audi01.setModelo("A3");
        audi01.setTieneAireAcondicionado(true);
        audi01.setCilindrada(1.8f);
        audi01.setPrecio(250000);

        System.out.println(audi01.toString());

        System.out.println(audi01.getMarca());
        audi01.toString();
        System.out.println(audi01.getColor());
        audi01.setColor("Amarillo Patito");
        System.out.println(audi01.getColor());
    }
}
