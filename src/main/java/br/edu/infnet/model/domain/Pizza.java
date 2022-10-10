package br.edu.infnet.model.domain;

import br.edu.infnet.interfaces.IPrinter;
import br.edu.infnet.model.exceptions.TamanhoDaPizzaMistaException;
import br.edu.infnet.model.exceptions.ValorDaPizzaDoceInvalidoException;
import br.edu.infnet.model.exceptions.ValorDaPizzaSalgadaInvalidoException;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TPizza")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pizza implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeDaPizza;
    private char tamanhoDaPizza;
    private double valorDaPizza;
    private String ingrediente;
    private Integer codPizza;
    @ManyToMany(mappedBy = "pizzas")
    private List<Pedido> pedidos;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public abstract double calcularVenda() throws ValorDaPizzaDoceInvalidoException, TamanhoDaPizzaMistaException, ValorDaPizzaSalgadaInvalidoException;

    @Override
    public String toString() {
        return nomeDaPizza
                + ";"
                + tamanhoDaPizza
                + ";" + valorDaPizza
                + ";" + ingrediente
                + ";"
                + codPizza;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDaPizza() {
        return nomeDaPizza;
    }

    public void setNomeDaPizza(String nomeDaPizza) {
        this.nomeDaPizza = nomeDaPizza;
    }

    public char getTamanhoDaPizza() {
        return tamanhoDaPizza;
    }

    public void setTamanhoDaPizza(char tamanhoDaPizza) {

        this.tamanhoDaPizza = Character.toUpperCase(tamanhoDaPizza);
    }

    public double getValorDaPizza() {
        return valorDaPizza;
    }

    public void setValorDaPizza(double valorDaPizza) {
        this.valorDaPizza = valorDaPizza;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Integer getCodPizza() {
        return codPizza;
    }

    public void setCodPizza(Integer codPizza) {
        this.codPizza = codPizza;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pizza pizza = (Pizza) obj;
        return Objects.equals(codPizza, pizza.codPizza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPizza);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
