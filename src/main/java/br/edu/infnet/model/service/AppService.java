package br.edu.infnet.model.service;

import br.edu.infnet.model.domain.app.Projeto;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    private Projeto projeto;

    public void incluir(Projeto projeto) {
        this.projeto = projeto;

        AppImpressao.relatorio("Exibição do projeto "
                + projeto.getNome()
                + " realizada com sucesso!!!", projeto);
    }

    public Projeto obterProjeto() {
        return projeto;
    }


}
