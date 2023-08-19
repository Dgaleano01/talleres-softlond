package org.example.e8;

public class EmpleadoPorHoras extends Empleado{

    private double horasDiarias;
    private double pagoPorHora;
    private double salario;
    public EmpleadoPorHoras(String nombre, String cargo, double
            horasDiarias, double pagoPorHora) {
        super(nombre, cargo);
        this.horasDiarias = horasDiarias;
        this.pagoPorHora = pagoPorHora;
        this.salario = 0;
    }

    @Override
    public void calcularSalario() {
        salario=(horasDiarias*pagoPorHora)*30;
        System.out.println("El salario mensual del trabajador "+ getNombre()
                +"queda en : " + salario );
    }
}

