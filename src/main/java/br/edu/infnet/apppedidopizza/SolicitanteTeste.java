package br.edu.infnet.apppedidopizza;

import br.edu.infnet.controller.SolicitanteController;
import br.edu.infnet.model.domain.Solicitante;
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

        try {
            Solicitante solicitante1 = new Solicitante("Raul", "71796363600", "Jardim cruzeiro");
            SolicitanteController.incluir(solicitante1);
        } catch (Exception e) {
            System.out.println("[ERROR] - SOLICITANTE " + e.getMessage());
        }

        try {
            Solicitante solicitante2 = new Solicitante("Marcela", "99999999999", "Itaigara");
            SolicitanteController.incluir(solicitante2);
        } catch (Exception e) {
            System.out.println("[ERROR] - SOLICITANTE " + e.getMessage());
        }

        try {
            Solicitante solicitante3 = new Solicitante("Bianca", "11111111111", "Pituba");
            SolicitanteController.incluir(solicitante3);
        } catch (Exception e) {
            System.out.println("[ERROR] - SOLICITANTE " + e.getMessage());
        }

        try {
            Solicitante solicitante4 = new Solicitante("Marcela", null, "Itaigara");
            SolicitanteController.incluir(solicitante4);
        } catch (Exception e) {
            System.out.println("[ERROR] - SOLICITANTE " + e.getMessage());
        }

        try {
            Solicitante solicitante5 = new Solicitante("Bianca", "", "Pituba");
            SolicitanteController.incluir(solicitante5);
        } catch (Exception e) {
            System.out.println("[ERROR] - SOLICITANTE " + e.getMessage());
        }
    }
}
