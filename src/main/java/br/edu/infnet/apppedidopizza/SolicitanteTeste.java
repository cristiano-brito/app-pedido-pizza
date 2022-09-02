package br.edu.infnet.apppedidopizza;

import br.edu.infnet.model.domain.Solicitante;
import br.edu.infnet.model.tests.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SolicitanteTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("##########solicitante");

        Solicitante solicitante1 = new Solicitante("Raul", "71796363600", "Jardim cruzeiro");

        AppImpressao.relatorio("Inclusão do solicitante Cristiano!!!", solicitante1);

        Solicitante solicitante2 = new Solicitante("Marcela", "99999999999", "Itaigara");

        AppImpressao.relatorio("Inclusão do solicitante Maria!!!", solicitante2);

        Solicitante solicitante3 = new Solicitante("Bianca", "11111111111", "Pituba");
        System.out.println(solicitante3);

        AppImpressao.relatorio("Inclusão do solicitante Ana!!!", solicitante3);
    }
}
