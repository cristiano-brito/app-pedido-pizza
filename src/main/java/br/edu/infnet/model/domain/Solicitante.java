package br.edu.infnet.model.domain;

public class Solicitante {
    private final String nome;
    private final String telefone;
    private final String endereco;

    public Solicitante(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void impressao() {

    }

    @Override
    public String toString() {
        return nome + ";" + telefone + ";" + endereco;
    }
}
