package org.example.e2;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notificacion> notificaciones= List.of(
            new CorreoElectronico("Cordial saludo estimado docente adjunto excusa","fer@gmail.com","inasistencia"),
            new MensajeTexto("Pase su numero a claro","3004548113"),
            new NotificacionPush("Hoy cumple años su amiga Carol",new Date())
        );

        for(Notificacion notificacion:notificaciones){
            System.out.println(notificacion.getClass().getSimpleName());
            notificacion.enviar();
            System.out.println("");
        }

    }
}
