package com.workshop.demo2;

public class NumeroClasificador {

    public String clasificar(int n) {
        if(n == 0){
            return "Cero";
        }
        if (n % 2 == 0) {
            return "Par";
        }
        return "Impar";
    }
}
