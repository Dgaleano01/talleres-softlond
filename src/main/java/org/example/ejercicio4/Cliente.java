package org.example.ejercicio4;

public class Cliente {
    private String nombreEmpresa;
    private String nombreCliente;
    private String cedulaCliente;


    public Cliente(String nombreEmpresa, String nombreCliente, String cedulaCliente) {
        this.nombreEmpresa = nombreEmpresa;
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }
}
