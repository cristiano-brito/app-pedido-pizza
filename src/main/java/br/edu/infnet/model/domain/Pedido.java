package br.edu.infnet.model.domain;

import br.edu.infnet.interfaces.IPrinter;

import java.time.LocalDateTime;

public class Pedido implements IPrinter {
    private String descricao;
    private LocalDateTime data;
    private boolean web;

    public Pedido() {
    }

    public Pedido(String descricao, LocalDateTime data, boolean web) {
        this.descricao = descricao;
        this.data = data;
        this.web = web;
    }

    @Override
    public String toString() {
        return descricao + ";" + data + ";" + web;
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

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    @Override
    public void impressao() {
        System.out.println("#pedido");
        System.out.println(this);
    }
}
