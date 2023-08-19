package org.example.e3;
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaLopez=new CuentaAhorros(20000d,0.2,20000d);
        CuentaBancaria cuentaSupermercadosLopez= new CuentaCorriente(1000000d);

        System.out.println("Cuenta de Ahorros");
        cuentaLopez.consultarSaldo();
        cuentaLopez.depositarDinero(10000d);
        cuentaLopez.retirarDinero(21000d);
        cuentaLopez.consultarSaldo();

        System.out.println("\nCuenta corriente");
        cuentaSupermercadosLopez.consultarSaldo();
        cuentaSupermercadosLopez.depositarDinero(1000000d);
        cuentaSupermercadosLopez.retirarDinero(21000d);
        cuentaSupermercadosLopez.consultarSaldo();
    }
}
