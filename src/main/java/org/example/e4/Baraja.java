package org.example.e4;

import java.util.*;

public class Baraja {
    Deque<CartaPoker> cartas= new ArrayDeque<>();


    public Baraja(List<CartaPoker> cartas) {
        this.cartas = new ArrayDeque<>(cartas);
    }

    public void mostrarBaraja(){
        System.out.println(cartas);
    }

    public void barajarCartas(){
        List<CartaPoker> cartasSinBarajar = new ArrayList<>(cartas);
        Collections.shuffle(cartasSinBarajar);
        cartas=new ArrayDeque<>(cartasSinBarajar);
    }

    public CartaPoker repartirCarta(){
        return cartas.pollFirst();
    }
}
