package org.example.e9;

import java.util.List;

public class Main {

    public static void main(String[] args) {

         List<Instrumento> instrumentos= List.of(
                new Guitarra("tucun tucun tucun"),
                new Piano("chan chan chan"),
                new Violin("tirili tirili hawaryu")
        );
        for (Instrumento instrumento:instrumentos){
            instrumento.tocar();
        }
    }




}
