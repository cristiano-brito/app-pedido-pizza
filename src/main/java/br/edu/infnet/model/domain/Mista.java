package br.edu.infnet.model.domain;

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
    public double calcularVenda() {
        return getValorDaPizza() * 2;
    }

    @Override
    public String toString() {
        return tipoPizzaMista + ";" + super.toString();
    }

    public String getTipoPizzaMista() {
        return tipoPizzaMista;
    }
}
