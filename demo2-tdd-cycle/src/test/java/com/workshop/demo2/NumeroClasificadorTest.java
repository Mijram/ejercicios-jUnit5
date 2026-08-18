package com.workshop.demo2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumeroClasificadorTest {

    private final NumeroClasificador c = new NumeroClasificador();

    // GREEN — este comportamiento ya está implementado (ciclos anteriores).
    @Test
    void numero4EsPar() {
        assertEquals("Par", c.clasificar(4));
    }

    // GREEN — este comportamiento ya está implementado (ciclos anteriores).
    @Test
    void numero7EsImpar() {
        assertEquals("Impar", c.clasificar(7));
    }


    @Test
    void numero0EsCero_todavia_no_implementado() {
        assertEquals("Cero", c.clasificar(0));
    }
}
