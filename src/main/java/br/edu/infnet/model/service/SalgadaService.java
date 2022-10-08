package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Salgada;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class SalgadaService {

    private Map<Integer, Salgada> mapaSalgada = new HashMap<>();
    private Integer id = 1;

    public void incluir(Salgada salgada) {
        salgada.setId(id++);
        mapaSalgada.put(salgada.getId(), salgada);

        AppImpressao.relatorio("Inclusão da pizza de "
                + salgada.getNomeDaPizza()
                + " realizada com sucesso!!!", salgada);
    }

    public Collection<Salgada> obterLista() {
        return mapaSalgada.values();
    }

    public void excluir(Integer id) {
        mapaSalgada.remove(id);
    }
}
