package br.edu.infnet.model.domain;

import br.edu.infnet.model.exceptions.ValorDaPizzaDoceInvalidoException;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TDoce")
public class Doce extends Pizza {

    private String tipoPizzaDoce;
    private boolean comBordaDoce;

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
        return tipoPizzaDoce + ";" + comBordaDoce + ";" + super.toString();
    }

    public String getTipoPizzaDoce() {
        return tipoPizzaDoce;
    }

    public void setTipoPizzaDoce(String tipoPizzaDoce) {
        this.tipoPizzaDoce = tipoPizzaDoce;
    }

    public boolean isComBordaDoce() {
        return comBordaDoce;
    }

    public void setComBordaDoce(boolean comBordaDoce) {
        this.comBordaDoce = comBordaDoce;
    }
}
