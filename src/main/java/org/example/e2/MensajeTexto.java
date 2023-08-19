package org.example.e2;

public class MensajeTexto extends Notificacion{
    private String numeroDestinatario;
    public MensajeTexto(String mensaje,String numeroDestinatario) {
        super(mensaje);
        this.numeroDestinatario=numeroDestinatario;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensaje al telefono: "+ numeroDestinatario+
                "\n"+ getMensaje());

    }
}
