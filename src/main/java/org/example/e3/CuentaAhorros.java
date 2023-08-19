package org.example.e3;

public class CuentaAhorros extends CuentaBancaria{
    private Double interesPorcentaje;
    private Double limiteRetiro;
    public CuentaAhorros(Double saldo, Double interesPorcentaje, Double limiteRetiro) {
        super(saldo);
        this.limiteRetiro = limiteRetiro;
        this.interesPorcentaje=interesPorcentaje;
    }

    @Override
    public void depositarDinero(Double cantidad) {
        double interes=cantidad*(interesPorcentaje+1);
        System.out.println("Usted esta ingresando "+cantidad +" con el interes de su cuenta queda en: "+ interes);
        setSaldo(getSaldo()+interes);
    }

    @Override
    public void retirarDinero(Double cantidad) {
        if(cantidad>limiteRetiro){
            System.out.println("Su retiro no es permitido porque supero el limite permitido");
            return;
        } else if (getSaldo()-cantidad<0) {
            System.out.println("Su cuenta no tiene suficientes fondos");
            return;
        }
        System.out.println("Usted ha retirado "+ cantidad + " pesos");
        setSaldo(getSaldo()-cantidad);

    }

}
