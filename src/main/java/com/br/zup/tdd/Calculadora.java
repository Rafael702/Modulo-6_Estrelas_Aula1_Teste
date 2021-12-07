package com.br.zup.tdd;

public class Calculadora {

    public int somar(int x, int y) {
        int resultado = x + y;

        if (resultado < 0 && (x < 0 && y < 0)){
            return resultado;
        }else if(resultado < 0){
            return resultado * -1;
        }

        return resultado;
    }
}
