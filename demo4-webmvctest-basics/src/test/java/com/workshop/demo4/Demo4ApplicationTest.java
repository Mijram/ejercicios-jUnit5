package com.workshop.demo4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Demo4ApplicationTest {

    @Test
    void aplicacion_arranca(){
        String[] args = {"archivo.txt", "--verbose"};

        // Llama directamente al main de tu clase
        Demo4Application.main(args);
    }

}