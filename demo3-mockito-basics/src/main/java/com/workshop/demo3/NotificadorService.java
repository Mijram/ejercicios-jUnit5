package com.workshop.demo3;

public class NotificadorService {

    private final EmailGateway emailGateway;

    public NotificadorService(EmailGateway emailGateway) {
        this.emailGateway = emailGateway;
    }

    public boolean notificarPedidoListo(String emailCliente) {
        String mensaje = "Tu pedido está listo para retirar";
        return emailGateway.enviar(emailCliente, mensaje);
    }
}
