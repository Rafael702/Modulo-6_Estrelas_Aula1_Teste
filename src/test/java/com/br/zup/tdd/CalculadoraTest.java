package com.br.zup.tdd;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testarSomarDoisNumerosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(2,2);

        Assert.assertEquals(4,resultado);
    }

    @Test
    public void testarSomaDeNumerosNegativosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(2,-4);

        Assert.assertEquals(2,resultado);
    }

    @Test
    public void testarSomaDeDoisNumerosNegativosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(-2,-4);

        Assert.assertEquals(-6,resultado);
    }


}
