package com.workshop.demo3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class NotificadorServiceTest {

    @Mock
    EmailGateway emailGateway; // doble falso — no manda ningún email real

    @InjectMocks
    NotificadorService servicio; // Mockito inyecta el mock de arriba acá adentro

    @Test
    void notificarPedidoListo_devuelveTrue_cuandoElGatewayEnviaOk() {

        when(emailGateway.enviar(anyString(), anyString())).thenReturn(true);

        boolean resultado = servicio.notificarPedidoListo("ana@dev.com");

        assertTrue(resultado);
        verify(emailGateway).enviar("ana@dev.com", "Tu pedido está listo para retirar");
    }

    @Test
    void notificarPedidoListo_devuelveFalse_cuandoElGatewayFalla() {
        when(emailGateway.enviar(anyString(), anyString())).thenReturn(false);

        boolean resultado = servicio.notificarPedidoListo("ana@dev.com");

        assertFalse(resultado);
    }
}
