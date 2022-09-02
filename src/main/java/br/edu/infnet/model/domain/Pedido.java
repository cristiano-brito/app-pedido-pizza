package br.edu.infnet.model.domain;

import br.edu.infnet.interfaces.IPrinter;

import java.time.LocalDateTime;
import java.util.Set;

public class Pedido implements IPrinter {

    private Integer id;
    private String descricao;
    private final LocalDateTime data;
    private boolean web;
    private final Solicitante solicitante;
    private Set<Pizza> pizzas;

    public Pedido(Solicitante solicitante) {
        data = LocalDateTime.now();
        this.solicitante = solicitante;
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

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public Set<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(Set<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

}
