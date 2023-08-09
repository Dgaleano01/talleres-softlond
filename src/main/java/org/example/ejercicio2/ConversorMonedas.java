package org.example.ejercicio2;

public class ConversorMonedas {


    public static Double copToUsd(Double cop){
        return (cop*0.00024);
    };

    public static Double usdToCop(Double usd){
        return (usd/0.00024);
    };

    public static Double clpToCop(Double clp){
        return (clp*4.82);
    };

    public static Double copToClp(Double cop){
      return (cop/4.82);
    };



}
