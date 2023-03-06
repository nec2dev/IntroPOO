class Auto {
    //Métodos
    //Constructores
    //Constructor por defecto
    Auto() {
    }
    //Constructor por parametros n1
    Auto(patente, cantRuedas, color, marca, modelo, tieneAireAcondicionado, cilindrada, precio, categoria) {
        this.patente = patente;
        this.cantRuedas = cantRuedas;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.cilindrada = cilindrada;
        this.precio = precio;
        this.categoria = categoria;
    }
    //Constructor por parametros n2
    Auto(patente, cantRuedas, color, precio, categoria) {
        this.patente = patente;
        this.cantRuedas = cantRuedas;
        this.color = color;
        this.precio = precio;
        this.categoria = categoria;
    }

    //Getters
    getPatente() {
        return this.patente;
    }
    getCantRuedas() {
        return this.cantRuedas;
    }
    getColor() {
        return this.color;
    }
    getMarca() {
        return this.marca;
    }
    getModelo() {
        return this.modelo;
    }
    getTieneAireAcondicionado() {
        return this.tieneAireAcondicionado;
    }
    getCilindrada() {
        return this.cilindrada;
    }
    getPrecio() {
        return this.precio;
    }
    getCategoria() {
        return this.categoria;
    }

    //Setters
    setPatente(patente) {
        this.patente = patente;
    }
    setCantRuedas(cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
    setColor(color) {
        this.color = color;
    }
    setMarca(marca) {
        this.marca = marca;
    }
    setModelo(modelo) {
        this.modelo = modelo;
    }
    setTieneAireAcondicionado(tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    setCilindrada(cilindrada) {
        this.cilindrada = cilindrada;
    }
    setPrecio(precio) {
        this.precio = precio;
    }
    setCategoria(categoria) {
        this.categoria = categoria;
    }


    //toString
    toString() {
        return "Patente: " + this.patente + " Cantidad de Ruedas: " + this.cantRuedas + " Color: " + this.color + " Marca: " + this.marca + " Modelo: " + this.modelo + " Tiene Aire Acondicionado: " + this.tieneAireAcondicionado + " Cilindrada: " + this.cilindrada + " Precio: " + this.precio + " Categoria: " + this.categoria;
    }

}

//Crear auto
let ferrari01 = new Auto("ABC123", 4, "Rojo", "Ferrari", "Testa Rossa", true, 1.6, 100000, "A");
let datosDeLaferrari = ferrari01.toString();

console.log(datosDeLaferrari);
