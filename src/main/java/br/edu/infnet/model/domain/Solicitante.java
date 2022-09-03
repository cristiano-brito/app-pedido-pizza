package br.edu.infnet.model.domain;

import br.edu.infnet.interfaces.IPrinter;

public class Solicitante implements IPrinter {
    private Integer id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
}
