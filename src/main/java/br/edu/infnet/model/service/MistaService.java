package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.Mista;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MistaService {

    private static Map<Integer, Mista> mapaMista = new HashMap<>();
    private static Integer id = 1;

    public void incluir(Mista mista) {
        mista.setId(id++);
        mapaMista.put(mista.getId(), mista);

        AppImpressao.relatorio("Inclusão da pizza de "
                + mista.getNomeDaPizza()
                + " realizada com sucesso!!!", mista);
    }

    public Collection<Mista> obterLista() {
        return mapaMista.values();
    }

    public void excluir(Integer id) {
        mapaMista.remove(id);
    }
}
