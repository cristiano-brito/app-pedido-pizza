package br.edu.infnet.model.tests;

import br.edu.infnet.model.domain.Pizza;

public class AppPizza {

    private final String mensagem;

    public AppPizza(String mensagem) {
        this.mensagem = mensagem;
    }

    public void relatorio(Pizza pizza) {
        System.out.println(mensagem);

        pizza.impressao();
    }
}
