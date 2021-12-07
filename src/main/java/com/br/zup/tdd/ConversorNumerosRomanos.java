package com.br.zup.tdd;

public class ConversorNumerosRomanos {


    public String converterNumeros(int numero) {
        String numeroRomano;
        if (numero >= 1 & numero <= 3) {
            if (numero == 1) {
                numeroRomano = "I";
            } else if (numero == 2) {
                numeroRomano = "II";
            } else {
                numeroRomano = "III";
            }
            return numeroRomano;
        }
        throw new RuntimeException();
    }
}
