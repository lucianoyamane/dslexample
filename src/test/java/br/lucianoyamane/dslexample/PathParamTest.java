package br.lucianoyamane.dslexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PathParamTest {

    private PathParam pathParam;

    @Before
    public void before() {
        this.pathParam = PathParam.init();
    }

    @Test
    public void testEstruturaBasica() {
        String esperado = "/valor";
        String resultado = this.pathParam.adiciona("valor").toString();

        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testEstruturaBasicaDoisParametros() {
        String esperado = "/valor/valor2";
        String resultado = this.pathParam
                .adiciona("valor")
                .adiciona("valor2")
                .toString();

        Assert.assertEquals(esperado, resultado);
    }
}
