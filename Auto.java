package IntroPOO;

public class Auto {
    //Atributos
    public String Patente;
    public int cantRuedas;
    public String color;
    public String marca;
    public String modelo;
    public boolean tieneAireAcondicionado;
    public float cilindrada;
    public double precio;

    //Constructores
    public Auto() {
    }

    //Getters
    public String getPatente() {
        return Patente;
    }
    public int getCantRuedas() {
        return cantRuedas;
    }
    public String getColor() {
        return color;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public boolean getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }
    public float getCilindrada() {
        return cilindrada;
    }
    public double getPrecio() {
        return precio;
    }

    //Setters
    public void setPatente(String Patente) {
        this.Patente = Patente;
    }
    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Metodos
    public void encender() {
        System.out.println("El auto se encendió");
    }
    public void frenar() {
        System.out.println("El auto freno");
    }
    public void acelerar() {
        System.out.println("El auto acelero");
    }
    public void doblarDerecha() {
        System.out.println("El auto giro a la derecha");
    }
    public void doblarIzquierda() {
        System.out.println("El auto giro a la izquierda");
    }

    @Override
    public String toString() {
        return "Auto{" + "Patente=" + Patente + ", cantRuedas=" + cantRuedas + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", tieneAireAcondicionado=" + tieneAireAcondicionado + ", cilindrada=" + cilindrada + ", precio=" + precio + '}';
    }

}

//Construimos autos
Auto audi01 = new Auto();
Auto FordF100 = new Auto();
