package org.example.e5.libro;

public class Diccionario extends Libro{
    private int cantIdiomas;

    public Diccionario(double valor, int cantidadHojas, int cantIdiomas) {
        super(valor, cantidadHojas);
        this.cantIdiomas = cantIdiomas;
    }

    public int getCantIdiomas() {
        return cantIdiomas;
    }

    public void setCantIdiomas(int cantIdiomas) {
        this.cantIdiomas = cantIdiomas;
    }

    @Override
    public double calcularPrecio() {
        return getValor()*(((double)cantIdiomas/10)+1);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Diccionario con " + cantIdiomas +" idiomas" + " con "+ getCantidadHojas() +" hojas");
    }
}
