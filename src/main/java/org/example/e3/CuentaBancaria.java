package org.example.e3;

public abstract class CuentaBancaria implements IMovimientoBancario{
    private Double saldo;

    public CuentaBancaria(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo() {
        System.out.println("Su saldo es de: "+ saldo + " pesos");
    };
}
