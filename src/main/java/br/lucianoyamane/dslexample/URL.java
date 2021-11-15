package br.lucianoyamane.dslexample;

import br.lucianoyamane.dslexample.api.CompositeBuilder;

public class URL extends CompositeBuilder {

    private String protocolo;
    private String www;
    private String dominio;

    private URL() {

    }

    public static URL init() {
        return new URL();
    }

    public URL http() {
        this.protocolo = "http://";
        return this;
    }

    public URL https() {
        this.protocolo = "https://";
        return this;
    }

    public URL www() {
        this.protocolo = "www";
        return this;
    }

    public URL dominio(String dominio) {
        this.dominio = dominio;
        return this;
    }
}
