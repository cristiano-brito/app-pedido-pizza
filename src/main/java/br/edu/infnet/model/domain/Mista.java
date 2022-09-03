package br.edu.infnet.model.domain;

import br.edu.infnet.model.exceptions.TamanhoDaPizzaMistaException;

public class Mista extends Pizza {

    private final String tipoPizzaMista;

    public Mista(String tipoPizzaMista) {
        this.tipoPizzaMista = tipoPizzaMista;
    }

    @Override
    public void impressao() {
        System.out.println("#mista");
        System.out.println(this);
    }

    @Override
    public double calcularVenda() throws TamanhoDaPizzaMistaException {

        if ((!(Character.compare('P', getTamanhoDaPizza()) == 0)) && (!(Character.compare('M', getTamanhoDaPizza()) == 0)) && (!(Character.compare('G', getTamanhoDaPizza()) == 0))) {
            throw new TamanhoDaPizzaMistaException("Impossível preencher tamanho da pizza com ("+getTamanhoDaPizza()+") porque é diferente de (P) (M) (G)");
        }

        double precoDaPizza;
        if((Character.compare('P', getTamanhoDaPizza()) == 0)) {
            precoDaPizza = getValorDaPizza() * 0.02;
            return precoDaPizza + getValorDaPizza();
        } else if ((Character.compare('M', getTamanhoDaPizza()) == 0)) {
            precoDaPizza = getValorDaPizza() * 0.05;
            return precoDaPizza + getValorDaPizza();
        }
        precoDaPizza = getValorDaPizza() * 0.10;
        return precoDaPizza + getValorDaPizza();
    }

    @Override
    public String toString() {
        return tipoPizzaMista + ";" + super.toString();
    }

    public String getTipoPizzaMista() {
        return tipoPizzaMista;
    }
}
