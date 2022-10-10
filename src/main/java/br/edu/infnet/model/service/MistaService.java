package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Mista;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.MistaRepository;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MistaService {

    @Autowired
    private MistaRepository mistaRepository;

    public void incluir(Mista mista) {
        mistaRepository.save(mista);

        AppImpressao.relatorio("Inclusão da pizza de "
                + mista.getNomeDaPizza()
                + " realizada com sucesso!!!", mista);
    }

    public Collection<Mista> obterLista() {
        return (Collection<Mista>) mistaRepository.findAll();
    }

    public Collection<Mista> obterLista(Usuario usuario) {

        return mistaRepository.findAll(usuario.getId());
    }

    public void excluir(Integer id) {
        mistaRepository.deleteById(id);
    }
}
