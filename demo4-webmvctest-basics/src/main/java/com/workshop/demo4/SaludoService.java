package com.workshop.demo4;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    public String saludar(String nombre) {
        if(nombre.isBlank()){
            throw new IllegalArgumentException("el nombre no puede estar vacio");
        }
        return "Hola, " + nombre + "!";
    }
}
