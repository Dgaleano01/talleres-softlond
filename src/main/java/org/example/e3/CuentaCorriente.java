package org.example.e3;

public class CuentaCorriente extends CuentaBancaria{
    public CuentaCorriente(Double saldo) {
        super(saldo);
    }

    @Override
    public void depositarDinero(Double cantidad) {
        System.out.println("Usted esta ingresando "+cantidad+" pesos");
        setSaldo(getSaldo()+cantidad);
    }

    @Override
    public void retirarDinero(Double cantidad) {
        if (getSaldo()-cantidad<0) {
            System.out.println("Su cuenta no tiene suficientes fondos");
            return;
        }
        System.out.println("Usted ha retirado "+ cantidad + " pesos");
        setSaldo(getSaldo()-cantidad);

    }
}
