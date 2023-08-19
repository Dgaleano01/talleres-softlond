package org.example.e2;

public abstract class Notificacion implements INotificacion{
    private String mensaje;

    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
