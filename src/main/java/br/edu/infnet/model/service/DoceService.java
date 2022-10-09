package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Doce;
import br.edu.infnet.model.repository.DoceRepository;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DoceService {

    @Autowired
    private DoceRepository doceRepository;

    public void incluir(Doce doce) {
        doceRepository.save(doce);

        AppImpressao.relatorio("Inclusão da pizza de "
                + doce.getNomeDaPizza()
                + " realizada com sucesso!!!", doce);
    }

    public Collection<Doce> obterLista() {

        return (Collection<Doce>) doceRepository.findAll();
    }

    public void excluir(Integer id) {

        doceRepository.deleteById(id);
    }
}
