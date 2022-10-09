package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Salgada;
import br.edu.infnet.model.repository.SalgadaRepository;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SalgadaService {

    @Autowired
    private SalgadaRepository salgadaRepository;

    public void incluir(Salgada salgada) {
        salgadaRepository.save(salgada);

        AppImpressao.relatorio("Inclusão da pizza de "
                + salgada.getNomeDaPizza()
                + " realizada com sucesso!!!", salgada);
    }

    public Collection<Salgada> obterLista() {
        return (Collection<Salgada>) salgadaRepository.findAll();
    }

    public void excluir(Integer id) {
        salgadaRepository.deleteById(id);
    }
}
