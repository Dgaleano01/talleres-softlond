package org.example.e2;

public class CorreoElectronico extends Notificacion{
    private String correoDestinatario;
    private String asunto;

    public CorreoElectronico(String mensaje,String correoDestinatario,String asunto) {
        super(mensaje);
        this.correoDestinatario=correoDestinatario;
        this.asunto=asunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando un correo a : "+correoDestinatario+
                "\nAsunto: "+asunto+"\n"+
                getMensaje());
    }
}
