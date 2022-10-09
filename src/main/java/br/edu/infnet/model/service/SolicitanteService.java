package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Solicitante;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.SolicitanteRepository;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SolicitanteService {

    @Autowired
    private SolicitanteRepository solicitanteRepository;

    public void incluir(Solicitante solicitante) {
        solicitanteRepository.save(solicitante);

        AppImpressao.relatorio("Inclusão de solicitante "
                + solicitante.getNome()
                + " realizada com sucesso!!!", solicitante);
    }

    public Collection<Solicitante> obterLista() {

        return (Collection<Solicitante>) solicitanteRepository.findAll();
    }

    public Collection<Solicitante> obterLista(Usuario usuario) {

        return solicitanteRepository.obterLista(usuario.getId());
    }

    public void excluir(Integer id) {

        solicitanteRepository.deleteById(id);
    }
}
