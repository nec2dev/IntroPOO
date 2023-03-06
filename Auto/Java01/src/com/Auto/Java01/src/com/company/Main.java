package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Construimos autos
        //Auto audi01 = new Auto();
        //Auto ferrari01 = new Auto("ABC234", 4, "Azul", "Ferrari", true, 1.7f, 400000, 'A');
        //Auto fordF100 = new Auto();

        //Seteamos atributos
        /*audi01.setPatente("ABC123");
        audi01.setCantRuedas(4);
        audi01.setColor("Rojo");
        audi01.setMarca("Audi");
        audi01.setTieneAireAcondicionado(true);
        audi01.setCilindrada(1.8f);
        audi01.setPrecio(250000);*/

        /*System.out.println(audi01.toString());
        System.out.println("El color original del Audi es:" + audi01.getColor());
        audi01.setColor("Amirillo patito");*/
        //audi01.setMarca("Ferrari");
        /*System.out.println("El nuevo color del Audi es:" + audi01.getColor());
        System.out.println(audi01.getMarca());
        System.out.println();
        System.out.println(ferrari01.getColor());
        System.out.println(ferrari01.toString());
        System.out.println(ferrari01.getCategoria());*/

        //Chofer a1 = new Chofer();
        //Chofer a2 = new Chofer("Juan", "Perez");

        //System.out.println(a1.toString());
        //System.out.println(a2.toString());
        /*super(MotorDeAuto, aireAcondicionado, precio, marca, material, color, velocidadMaxima, velocidadMinima, cantidadDeRuedas);
        this.tipoDeAuto = tipoDeAuto;
        this.motorDeAuto = motorDeAuto;
        this.airBags = airBags; */
        Automovil automovil01 = new Automovil("Sedan", "V8", true, true, 250000, "Audi", "Aluminio", "Rojo", 250, 0, 4);

        VehiculoTerrestre vehiculoTerrestre01 = new VehiculoTerrestre(true, 250000, "Audi", "Aluminio", "Rojo", 250, 0, 4);

        System.out.println(automovil01.toString());
        System.out.println("");
        System.out.println(vehiculoTerrestre01.toString());
    }
}
