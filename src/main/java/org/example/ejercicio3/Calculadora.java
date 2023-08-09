package org.example.Ejercicio3;


public class Calculadora {

    public static void sumar (Double numero1, Double numero2){
        Double suma= numero1 + numero2;
        System.out.println("La suma de "+numero1+" y "+numero2+" es igual a: "+suma);
    }
    public static void restar (Double numero1, Double numero2){
        Double resta= numero1 - numero2;
        System.out.println("La resta de "+numero1+" y "+numero2+" es igual a: "+resta);
    }

    public static void multiplicar (Double numero1, Double numero2){
        Double multiplicacion= numero1 * numero2;
        System.out.println("La multiplicacion de "+numero1+" y "+numero2+" es igual a: "+multiplicacion);
    }

    public static void dividir (Double numero1, Double numero2){
        Double divicion= numero1 / numero2;
        System.out.println("La divicion de "+numero1+" y "+numero2+" es igual a: "+divicion);
    }
}

