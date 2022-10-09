package br.edu.infnet.model.domain;

import br.edu.infnet.interfaces.IPrinter;
import br.edu.infnet.model.exceptions.TelefoneInvalidoException;

import javax.persistence.*;

@Entity
@Table(name = "TSolicitante")
public class Solicitante implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String telefone;
    private String endereco;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Solicitante() {
    }

    public Solicitante(String nome, String telefone, String endereco) throws TelefoneInvalidoException {

        if(telefone == null) {
            throw new TelefoneInvalidoException("Não é possível aceitar CPF nulo.");
        }

        if(telefone.isEmpty()) {
            throw new TelefoneInvalidoException("Não é possível aceitar CPF sem preenchimento.");
        }

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
