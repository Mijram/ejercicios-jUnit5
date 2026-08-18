package com.workshop.demo4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaludoServiceTest {

    private SaludoService saludoService = new SaludoService();

    @Test
    void saludar_devuelve_saludo(){
        String resultado = saludoService.saludar("pepe");

        assertEquals("Hola, pepe!", resultado);
    }

    @Test
    void saludar_sin_nombre_devuelve_error(){

        assertThrows(IllegalArgumentException.class, () ->{
            saludoService.saludar("");
        });
    }

}