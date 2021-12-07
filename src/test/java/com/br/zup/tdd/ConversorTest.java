package com.br.zup.tdd;

import org.junit.Assert;
import org.junit.Test;

public class ConversorTest {

    @Test
    public void testarMetodoDeConversaoNumerosRomanos(){
        String resultado = new ConversorNumerosRomanos().converterNumeros(1);

        Assert.assertEquals("I",resultado);
    }

    @Test
    public void testarMetodoDeConversaoNumerosRomanosCaminhoNegativo(){
        Assert.assertThrows(RuntimeException.class, () -> {new ConversorNumerosRomanos().converterNumeros(-1);});
    }



    
}
