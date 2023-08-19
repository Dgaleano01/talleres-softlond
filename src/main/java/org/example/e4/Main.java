package org.example.e4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Baraja baraja= new Baraja(List.of(
                new CartaPoker("AS","corazones"),
                new CartaPoker("2","picas"),
                new CartaPoker("3","diamantes"),
                new CartaPoker("10", "corazones"),
                new CartaPoker("K","trebol"),
                new CartaPoker("Q","corazones"),
                new CartaPoker("J","diamantes")
        ));
        System.out.println("Antes de barajar");
        baraja.mostrarBaraja();
        baraja.barajarCartas();
        System.out.println("\nDespues de barajar");
        baraja.mostrarBaraja();
        CartaPoker cartaRepartida= baraja.repartirCarta();
        System.out.println("\nDespues de repartir la primera carta");
        baraja.mostrarBaraja();

        System.out.println("\nLa carta repartida es: ");
        cartaRepartida.mostrarCarta();
        System.out.println("\nY tiene un valor numerico de: "+ cartaRepartida.valorNumerico());


    }

}
