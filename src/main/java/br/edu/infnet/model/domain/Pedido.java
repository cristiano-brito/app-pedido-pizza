package br.edu.infnet.model.domain;

import br.edu.infnet.interfaces.IPrinter;
import br.edu.infnet.model.exceptions.PedidoSemProdutosException;
import br.edu.infnet.model.exceptions.SolicitanteNuloException;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "TPedido")
public class Pedido implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private LocalDateTime data;
    private boolean web;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idSolicitante")
    private Solicitante solicitante;
    @ManyToMany(cascade = CascadeType.DETACH)
    private Set<Pizza> pizzas;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Pedido() {
        data = LocalDateTime.now();
        web = true;
    }

    public Pedido(Solicitante solicitante, Set<Pizza> pizzas) throws SolicitanteNuloException, PedidoSemProdutosException {
        this();

        if(solicitante == null) {
            throw new SolicitanteNuloException("Impossível criar um pedido sem um solicitante");
        }

        /*if (pizzas == null) {
            throw new PedidoSemProdutosException("Impossível criar pedidos sem uma listagem de pizzas associada!");
        }

        if (pizzas.size() < 1) {
            throw new PedidoSemProdutosException("Impossível criar pedidos com menos de uma pizza!");
        }*/

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

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public Set<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(Set<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
