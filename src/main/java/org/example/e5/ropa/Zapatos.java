package org.example.e5.ropa;

public class Zapatos extends Ropa{
    private String tipoSuela;
    public Zapatos(double valor, String talla, String tipoSuela) {
        super(valor, talla);
        this.tipoSuela = tipoSuela;
    }

    public String getTipoSuela() {
        return tipoSuela;
    }

    public void setTipoSuela(String tipoSuela) {
        this.tipoSuela = tipoSuela;
    }

    @Override
    public double calcularPrecio() {
        if (getTalla().equals("XL")) return getValor()*1.2;
        if(getTalla().equals("XXL")) return getValor()*1.4;
        return getValor();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Zapatos talla "+ getTalla() + " con una suela "+ tipoSuela);

    }
}
