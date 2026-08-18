package com.workshop.demo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    private final Calculadora c = new Calculadora();

    @Test
    void sumar_2mas3_da5() {
        assertEquals(5, c.sumar(2, 3));
    }

    @Test
    void restar_5menos3_da2() {
        assertEquals(2, c.restar(5, 3));
    }

    // 👉 ESTE TEST FALLA A PROPÓSITO — es la Demo 1.
    // El valor esperado (999) está mal puesto adrede para que la clase vea
    @Test
    void sumar_3mas4_falla_a_proposito() {
        assertEquals(999, c.sumar(3, 4));
    }
}
