package org.example.e4;

public class CartaPoker implements ICarta{
    private String valor;
    private String simbolo;

    public CartaPoker(String valor, String simbolo) {
        this.valor = valor;
        this.simbolo = simbolo;
    }
    @Override
    public void mostrarCarta() {
        System.out.println("Su carta es un " + valor + " de "+simbolo);
    }

    @Override
    public int valorNumerico() {
        if(valor.toLowerCase().equals("as")) return 1;
        else if(valor.toLowerCase().equals("j")) return 11;
        else if(valor.toLowerCase().equals("q")) return 12;
        else if(valor.toLowerCase().equals("k")) return 13;
        else return Integer.parseInt(valor);
    }

    @Override
    public String toString() {
        return valor+" de "+simbolo;
    }
}
