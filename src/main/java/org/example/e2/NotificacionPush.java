package org.example.e2;

import java.util.Date;

public class NotificacionPush extends Notificacion{
    private Date fechaNotificacion;

    public NotificacionPush(String mensaje,Date fechaNotificacion) {
        super(mensaje);
        this.fechaNotificacion=fechaNotificacion;
    }

    @Override
    public void enviar() {
        System.out.println("Hoy es: "+ fechaNotificacion+
                "\n"+getMensaje());

    }
}
