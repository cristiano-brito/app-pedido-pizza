package br.edu.infnet.model.domain;

import br.edu.infnet.model.exceptions.ValorDaPizzaSalgadaInvalidoException;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TSalgada")
public class Salgada extends Pizza {

    private String tipoPizzaSalgada;

    private boolean comBordaSalgada;

    @Override
    public double calcularVenda() throws ValorDaPizzaSalgadaInvalidoException {

        double valorMinimoDaPizzaSalgada = 25.0;
        if (getValorDaPizza() < valorMinimoDaPizzaSalgada) {
            throw new ValorDaPizzaSalgadaInvalidoException(
                    "Impossível preencher o valor("+getValorDaPizza()+") porque está abaixo do valor minimo estabelecido!!!");
        }

        return getValorDaPizza();
    }

    @Override
    public void impressao() {
        System.out.println("#salgada");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return tipoPizzaSalgada + ";" + comBordaSalgada + ";" + super.toString();
    }

    public String getTipoPizzaSalgada() {
        return tipoPizzaSalgada;
    }

    public void setTipoPizzaSalgada(String tipoPizzaSalgada) {
        this.tipoPizzaSalgada = tipoPizzaSalgada;
    }

    public boolean isComBordaSalgada() {
        return comBordaSalgada;
    }

    public void setComBordaSalgada(boolean comBordaSalgada) {
        this.comBordaSalgada = comBordaSalgada;
    }
}
