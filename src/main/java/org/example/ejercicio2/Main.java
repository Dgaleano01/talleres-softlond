package org.example.ejercicio2;

public class Main {
    public static void main(String[] args) {

        System.out.println("10000 pesos en dolares son: " + ConversorMonedas.copToUsd(10000d) + " dolares");
        System.out.println("1 dolar en pesos son: " + ConversorMonedas.usdToCop(1d) + " pesos");
        System.out.println("10 pesos chilenos en pesos colombianos son: " + ConversorMonedas.clpToCop(10d) + " pesos colombianos");
        System.out.println("5000 pesos colombianos en pesos chilenos son: " + ConversorMonedas.copToClp(5000d) + " pesos chilenos");
    }
}
