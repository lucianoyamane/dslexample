package br.lucianoyamane.dslexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueryParamTest {

    private QueryParam queryParam;


    @Before
    public void before() {
        this.queryParam = QueryParam.init();
    }

    @Test
    public void testAdicionaParametro() {
        String esperado = "?campo='valor'";
        String resultado = this.queryParam.adiciona("campo", "valor").toString();

        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testAdicionaDoisParametro() {
        String esperado = "?campo='valor'&campo2='valor2'";
        String resultado = this.queryParam
                .adiciona("campo", "valor")
                .adiciona("campo2", "valor2")
                .toString();

        Assert.assertEquals(esperado, resultado);
    }
}
