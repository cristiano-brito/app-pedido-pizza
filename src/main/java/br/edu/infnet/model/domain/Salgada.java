package br.edu.infnet.model.domain;

import br.edu.infnet.model.exceptions.ValorDaPizzaSalgadaInvalidoException;

public class Salgada extends Pizza {

    private final String tipoPizzaSalgada;

    public Salgada(String tipoPizzaSalgada) {
        this.tipoPizzaSalgada = tipoPizzaSalgada;
    }

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
        return tipoPizzaSalgada + ";" + super.toString();
    }

    public String getTipoPizzaSalgada() {
        return tipoPizzaSalgada;
    }
}
