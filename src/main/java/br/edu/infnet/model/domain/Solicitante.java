package br.edu.infnet.model.domain;

import br.edu.infnet.interfaces.IPrinter;

public class Solicitante implements IPrinter {
    private final String nome;
    private final String telefone;
    private final String endereco;

    public Solicitante(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return nome + ";" + telefone + ";" + endereco;
    }

    @Override
    public void impressao() {
        System.out.println("#solicitante");
        System.out.println(this);
    }
}
