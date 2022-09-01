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
    public String toString() {
        return tipoPizzaMista + ";" + super.toString();
    }
}
