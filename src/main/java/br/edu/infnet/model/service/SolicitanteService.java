package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Solicitante;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class SolicitanteService {

    private static Map<Integer, Solicitante> mapaSolicitante = new HashMap<>();
    private static Integer id = 1;

    public void incluir(Solicitante solicitante) {
        solicitante.setId(id++);
        mapaSolicitante.put(solicitante.getId(), solicitante);

        AppImpressao.relatorio("Inclusão de solicitante "
                + solicitante.getNome()
                + " realizada com sucesso!!!", solicitante);
    }

    public Collection<Solicitante> obterLista() {
        return mapaSolicitante.values();
    }

    public void excluir(Integer id) {
        mapaSolicitante.remove(id);
    }
}
