package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Doce;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class DoceService {

    private static Map<Integer, Doce> mapaDoce = new HashMap<>();
    private static Integer id = 1;

    public void incluir(Doce doce) {
        doce.setId(id++);
        mapaDoce.put(doce.getId(), doce);

        AppImpressao.relatorio("Inclusão da pizza de "
                + doce.getNomeDaPizza()
                + " realizada com sucesso!!!", doce);
    }

    public Collection<Doce> obterLista() {
        return mapaDoce.values();
    }

    public void excluir(Integer id) {
        mapaDoce.remove(id);
    }
}
