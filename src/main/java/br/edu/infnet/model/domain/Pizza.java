package br.edu.infnet.model.domain;

public abstract class Pizza {
    private String nomeDaPizza;
    private char tamanhoDaPizza;
    private double valorDaPizza;
    private String ingrediente;
    private Integer codPizza;

    public double calcularVenda() {
        return valorDaPizza * 2;
    }

    public abstract void impressao();

    @Override
    public String toString() {
        return nomeDaPizza
                + ";"
                + tamanhoDaPizza
                + ";" + valorDaPizza
                + ";" + ingrediente
                + ";"
                + codPizza
                + ";"
                + calcularVenda();
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
        this.tamanhoDaPizza = tamanhoDaPizza;
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
}
