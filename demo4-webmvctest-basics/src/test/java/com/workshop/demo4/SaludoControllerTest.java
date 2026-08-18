package com.workshop.demo4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SaludoController.class)
class SaludoControllerTest {

    @Autowired
    MockMvc mvc; // simula requests HTTP sin levantar un servidor real

    @MockBean
    SaludoService saludoService; // reemplaza el bean real por un mock de Mockito

    @Test
    void getSaludo_devuelve200_yElTextoDelService() throws Exception {

        when(saludoService.saludar("Ana")).thenReturn("Hola, Ana!");

        mvc.perform(get("/saludo").param("nombre", "Ana"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hola, Ana!"));
    }
}
