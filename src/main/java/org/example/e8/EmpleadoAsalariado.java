package org.example.e8;

public class EmpleadoAsalariado extends Empleado{
    private Double salario;
    private Double porcentajePension;
    private Double porcentajeSalud;


    public EmpleadoAsalariado(String nombre, String cargo, Double
            salarioBruto, Double porcentajePension, Double porcentajeSalud) {
        super(nombre, cargo);
        this.salario = salarioBruto;
        this.porcentajePension = porcentajePension;
        this.porcentajeSalud = porcentajeSalud;
    }

    @Override
    public void calcularSalario() {
        salario= salario*(1-((porcentajeSalud/100)+(porcentajePension/100)));
        System.out.println("El salario del trabajador " + getNombre() +
                " despues de quitar salud y pension queda en: "+ salario);
    }
}
