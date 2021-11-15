package br.lucianoyamane.dslexample;

import br.lucianoyamane.dslexample.api.LeafBuilder;

public class Parametro extends LeafBuilder {

    private String campo;

    private String valor;

    private Parametro() {

    }

    public static Parametro init() {
        return new Parametro();
    }

    public Parametro adiciona(String campo, String valor) {
        this.campo = campo;
        this.valor = valor;
        return this;
    }

    public Parametro adiciona(String campo, Integer valor) {
        this.campo = campo;
        this.valor = String.valueOf(valor);
        return this;
    }

    public Parametro adiciona(String valor) {
        this.valor = valor;
        return this;
    }

    public Parametro adiciona(Integer valor) {
        this.valor = String.valueOf(valor);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder parametroBuilder = new StringBuilder();

        if (this.campo != null && this.valor != null) {
            parametroBuilder
                    .append(this.campo)
                    .append("=")
                    .append("'")
                    .append(valor)
                    .append("'");
        } else if (this.valor != null) {
            parametroBuilder
                    .append(this.valor);
        }



        return parametroBuilder.toString();
    }
}
