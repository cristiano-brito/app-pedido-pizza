package br.edu.infnet.model.domain;

public class Doce extends Pizza {

    private final String tipoPizzaDoce;

    public Doce(String tipoPizzaDoce) {
        this.tipoPizzaDoce = tipoPizzaDoce;
    }

    @Override
    public double calcularVenda() {
        double valorDaPizzaDoce = getValorDaPizza() * 0.05;
        return super.calcularVenda() + valorDaPizzaDoce;
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
}
