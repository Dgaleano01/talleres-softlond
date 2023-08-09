package org.example.ejercicio4;

public class Habitacion {
    private int numeroHabitacion;
    private boolean disponible;
    private Cliente cliente;


    public Habitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.disponible = true;
    }

    public void reservarHabitacion(Cliente cliente){
        disponible =false;
        this.cliente=cliente;
    }
    public void desocuparHabitacion(){
        disponible =true;
        cliente=null;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
