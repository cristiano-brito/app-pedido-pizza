package br.edu.infnet.model.domain;

public class Salgada extends Pizza {

    private final String tipoPizzaSalgada;

    public Salgada(String tipoPizzaSalgada) {
        this.tipoPizzaSalgada = tipoPizzaSalgada;
    }

    @Override
    public double calcularVenda() {
        double valorDaPizzaSalgada = getValorDaPizza() + (getValorDaPizza() * 0.25);
        return valorDaPizzaSalgada;
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
