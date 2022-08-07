package br.edu.infnet.model.tests;

import br.edu.infnet.model.domain.Solicitante;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SolicitanteTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#Solicitante");
        Solicitante solicitante = new Solicitante("Raul", "717963636", "Jardim cruzeiro");
        System.out.println(solicitante);
    }
}
