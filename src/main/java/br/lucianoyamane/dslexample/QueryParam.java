package br.lucianoyamane.dslexample;

import br.lucianoyamane.dslexample.api.CompositeBuilder;
import br.lucianoyamane.dslexample.api.LeafBuilder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QueryParam extends CompositeBuilder {

    private List<LeafBuilder> leafBuilders;

    private QueryParam() {
        this.leafBuilders = new ArrayList<>();
    }

    public static QueryParam init() {
        return new QueryParam();
    }

    public QueryParam adiciona(String campo, String valor) {
        this.leafBuilders.add(Parametro.init().adiciona(campo, valor));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder queryParamBuilder = new StringBuilder();
        if (this.leafBuilders.size() > 0) {
            queryParamBuilder.append("?");
            Iterator<LeafBuilder> builderIterator = this.leafBuilders.iterator();
            while (builderIterator.hasNext()) {
                queryParamBuilder.append(builderIterator.next().toString());
                if (builderIterator.hasNext()) {
                    queryParamBuilder.append("&");
                }
            }
        }
        return queryParamBuilder.toString();
    }
}
