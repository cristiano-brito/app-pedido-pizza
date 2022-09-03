package br.edu.infnet.model.domain;

import br.edu.infnet.model.exceptions.ValorDaPizzaDoceInvalidoException;

public class Doce extends Pizza {

    private final String tipoPizzaDoce;

    public Doce(String tipoPizzaDoce) {
        this.tipoPizzaDoce = tipoPizzaDoce;
    }

    @Override
    public double calcularVenda() throws ValorDaPizzaDoceInvalidoException {

        if (getValorDaPizza() < 0) {
            throw new ValorDaPizzaDoceInvalidoException(
                    "Impossível preencher o valor (" + getValorDaPizza() + ") porque é negativo!!!");
        }

        double valorDaPizzaDoce = getValorDaPizza() > 35.0
                ? getValorDaPizza() + getValorDaPizza() * 0.10
                : getValorDaPizza() + getValorDaPizza() * 0.05;
        return valorDaPizzaDoce;
    }

    @Override
    public void impressao() {
        System.out.println("#doce");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return tipoPizzaDoce + ";" + super.toString();
    }

    public String getTipoPizzaDoce() {
        return tipoPizzaDoce;
    }
}
