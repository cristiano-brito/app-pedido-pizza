package br.edu.infnet.model.domain;

import br.edu.infnet.interfaces.IPrinter;
import br.edu.infnet.model.exceptions.PedidoSemProdutosException;
import br.edu.infnet.model.exceptions.SolicitanteNuloException;

import java.time.LocalDateTime;
import java.util.Set;

public class Pedido implements IPrinter {

    private Integer id;
    private String descricao;
    private final LocalDateTime data;
    private boolean web;
    private final Solicitante solicitante;
    private Set<Pizza> pizzas;

    public Pedido(Solicitante solicitante, Set<Pizza> pizzas) throws SolicitanteNuloException, PedidoSemProdutosException {

        if(solicitante == null) {
            throw new SolicitanteNuloException("Impossível criar um pedido sem um solicitante");
        }

        if (pizzas == null) {
            throw new PedidoSemProdutosException("Impossível criar pedidos sem uma listagem de pizzas associada!");
        }

        if (pizzas.size() < 1) {
            throw new PedidoSemProdutosException("Impossível criar pedidos com menos de uma pizza!");
        }

        data = LocalDateTime.now();
        this.solicitante = solicitante;
        this.pizzas = pizzas;
    }

    @Override
    public void impressao() {
        System.out.println("#pedido");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return descricao + ";" + data + ";" + web + ";" + solicitante + ";" + pizzas.size();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }
}
