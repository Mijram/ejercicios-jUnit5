package com.workshop.demo3;

public interface EmailGateway {
    boolean enviar(String destinatario, String mensaje);
}
